package net.thenu.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.thenu.ge.GE;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RawModels implements DataProvider {

    private final FabricDataOutput output;
    private final List<ModelDef> models = new ArrayList<>();

    public RawModels(FabricDataOutput output) {
        this.output = output;
        registerAll();
    }

    // ── Registration ─────────────────────────────────────────────────────────

    private void registerAll() {

        // ─ Fantasy ──────────────────────────────────────────────────────────
        cubeAll("arcane_crystal_block");
        cubeAll("runestone_bricks");
        cubeAll("stardust_tiles");

        // ─ Steampunk ─────────────────────────────────────────────────────────
        cubeAll("riveted_iron_plate");
        cubeColumn("copper_pipe_bundle",
                "copper_pipe_bundle_top",
                "copper_pipe_bundle_side");
        cubeAll("tarnished_brass_block");

        // ─ Botanical ─────────────────────────────────────────────────────────
        cubeAll("mossy_petal_stone");
        cubeAll("overgrown_ruins");
        cubeColumn("petrified_log",
                "petrified_log_top",
                "petrified_log_side");

        // ─ Gothic ─────────────────────────────────────────────────────────────
        cubeAll("soul_obsidian_bricks");
        cubeAll("bone_carved_stone");
        cubeAll("void_blackstone_tiles");

        // ─ Sci-fi ─────────────────────────────────────────────────────────────
        orientable("neon_grid_panel",
                "neon_grid_panel",       // front face
                "neon_grid_panel_side",  // side faces
                "neon_grid_panel_side"); // top / bottom
        cubeAll("holo_glass");
        cubeAll("durasteel_plating");
    }

    // ── Model type helpers ────────────────────────────────────────────────────

    private void cubeAll(String name) {
        JsonObject tex = new JsonObject();
        tex.addProperty("all", tex(name));
        models.add(new ModelDef(name, "minecraft:block/cube_all", tex));
    }

    private void cubeColumn(String modelName, String topTex, String sideTex) {
        JsonObject tex = new JsonObject();
        tex.addProperty("end",  tex(topTex));
        tex.addProperty("side", tex(sideTex));
        models.add(new ModelDef(modelName, "minecraft:block/cube_column", tex));
    }

    private void orientable(String modelName, String frontTex, String sideTex, String topTex) {
        JsonObject tex = new JsonObject();
        tex.addProperty("front", tex(frontTex));
        tex.addProperty("side",  tex(sideTex));
        tex.addProperty("top",   tex(topTex));
        models.add(new ModelDef(modelName, "minecraft:block/orientable", tex));
    }

    private static String tex(String name) {
        return GE.MOD_ID + ":block/" + name;
    }

    // ── DataProvider impl ─────────────────────────────────────────────────────

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        // Build base path: <output>/assets/<modid>/models/block/
        Path base = output.getPath()
                .resolve(GE.MOD_ID)
                .resolve("models")
                .resolve("block");

        List<CompletableFuture<?>> futures = new ArrayList<>();

        for (ModelDef def : models) {
            JsonObject root = new JsonObject();
            root.addProperty("parent", def.parent());

            // Tells MC to scale UVs for 32x32 textures instead of the default 16x16
            JsonArray textureSize = new JsonArray();
            textureSize.add(32);
            textureSize.add(32);
            root.add("texture_size", textureSize);

            root.add("textures", def.textures());

            Path filePath = base.resolve(def.name() + ".json");
            futures.add(DataProvider.writeToPath(writer, root, filePath));
        }

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Raw Block Models (32x32)";
    }

    // ── Internal record ───────────────────────────────────────────────────────

    private record ModelDef(String name, String parent, JsonObject textures) {}
}