package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import net.thenu.ge.block.GEBlocks;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.HelperLists;

import java.util.concurrent.CompletableFuture;

public class BlockDrop extends FabricBlockLootTableProvider {

    public BlockDrop(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(AmethystBlocks.CIRCULAR_AMETHYST_LAMP);
        addDrop(AmethystBlocks.CROSSED_AMETHYST_LAMP);
        addDrop(GEBlocks.ARCANE_CRYSTAL_BLOCK);
        addDrop(GEBlocks.RUNESTONE_BRICKS);
        addDrop(GEBlocks.STARDUST_TILES);

        // ─ ⚙️ Steampunk ──────────────────────────────────────────────────────
        addDrop(GEBlocks.RIVETED_IRON_PLATE);
        addDrop(GEBlocks.COPPER_PIPE_BUNDLE);
        addDrop(GEBlocks.TARNISHED_BRASS_BLOCK);

        // ─ 🌿 Botanical ──────────────────────────────────────────────────────
        addDrop(GEBlocks.MOSSY_PETAL_STONE);
        addDrop(GEBlocks.OVERGROWN_RUINS);
        addDrop(GEBlocks.PETRIFIED_LOG);

        // ─ 💀 Gothic ─────────────────────────────────────────────────────────
        addDrop(GEBlocks.SOUL_OBSIDIAN_BRICKS);
        addDrop(GEBlocks.BONE_CARVED_STONE);
        addDrop(GEBlocks.VOID_BLACKSTONE_TILES);

        // ─ 🚀 Sci-fi ─────────────────────────────────────────────────────────
        addDrop(GEBlocks.NEON_GRID_PANEL);
        addDrop(GEBlocks.HOLO_GLASS);
        addDrop(GEBlocks.DURASTEEL_PLATING);
        HelperLists.getAllMossyCobblestoneBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));
        HelperLists.getAllMossyDeepslateBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));
        HelperLists.getAllAmethystBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));
    }
}