package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.thenu.ge.block.GEBlocks;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.DatagenHelper.Lang.LangHelper;
import net.thenu.utils.HelperLists;

import java.util.concurrent.CompletableFuture;

public class EnLanguage extends FabricLanguageProvider {
    public EnLanguage(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
        builder.add("itemgroup.ge.ge_blocks_tab", "Gradients Evolved Blocks Tab");
        builder.add(AmethystBlocks.CIRCULAR_AMETHYST_LAMP, "Circular Amethyst Lamp");
        builder.add(AmethystBlocks.CROSSED_AMETHYST_LAMP, "Crossed Amethyst Lamp");
        builder.add(GEBlocks.ARCANE_CRYSTAL_BLOCK,  "Arcane Crystal Block");
        builder.add(GEBlocks.RUNESTONE_BRICKS,       "Runestone Bricks");
        builder.add(GEBlocks.STARDUST_TILES,         "Stardust Tiles");

        builder.add(GEBlocks.RIVETED_IRON_PLATE,    "Riveted Iron Plate");
        builder.add(GEBlocks.COPPER_PIPE_BUNDLE,     "Copper Pipe Bundle");
        builder.add(GEBlocks.TARNISHED_BRASS_BLOCK,  "Tarnished Brass Block");

        builder.add(GEBlocks.MOSSY_PETAL_STONE,     "Mossy Petal Stone");
        builder.add(GEBlocks.OVERGROWN_RUINS,        "Overgrown Ruins");
        builder.add(GEBlocks.PETRIFIED_LOG,          "Petrified Log");

        builder.add(GEBlocks.SOUL_OBSIDIAN_BRICKS,  "Soul Obsidian Bricks");
        builder.add(GEBlocks.BONE_CARVED_STONE,      "Bone Carved Stone");
        builder.add(GEBlocks.VOID_BLACKSTONE_TILES,  "Void Blackstone Tiles");

        builder.add(GEBlocks.NEON_GRID_PANEL,       "Neon Grid Panel");
        builder.add(GEBlocks.HOLO_GLASS,             "Holo Glass");
        builder.add(GEBlocks.DURASTEEL_PLATING,      "Durasteel Plating");

        addFamily(builder, HelperLists.getAllMossyCobblestoneBlocks());
        addFamily(builder, HelperLists.getAllMossyDeepslateBlocks());
        addFamily(builder, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addFamily(builder, HelperLists.getAllAmethystBlocks());
    }

    private void addFamily(TranslationBuilder builder, java.util.List<BlockFamily> families) {
        for (BlockFamily family : families) {
            family.getAll().forEach(block -> LangHelper.addBlock(builder, block));
        }
    }
}