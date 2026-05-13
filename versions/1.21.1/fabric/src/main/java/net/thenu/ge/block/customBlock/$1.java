package net.thenu.ge.block.customBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.thenu.ge.Constants;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.BlockFamily.BlockFamilyBuilder;
import net.thenu.utils.BlockFamily.BlockFamilyDefinition;

public class $1 { public static void register$1() {}
    public static final BlockFamily POLISHED_CALCITE = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "polished_calcite", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily MOSSY_STONE_TILES = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "mossy_stone_tiles", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily GLOW_MUSHROOM_BRICKS = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "glow_mushroom_bricks", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS).luminance(state -> 15))).build();

    public static final BlockFamily END_STONE_BRICKS = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "end_stone_bricks", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily CHISELED_PRISMARINE = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "chiseled_prismarine", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily POLISHED_PRISMARINE = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "polished_prismarine", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily PRISMARINE_TILES = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "prismarine_tiles", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily CHISELED_BASALT = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "chiseled_basalt", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily CALCITE_BRICKS = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "calcite_bricks", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily BASALT_BRICKS = new BlockFamilyBuilder(Constants.MOD_ID, new BlockFamilyDefinition(
            "basalt_bricks", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

}
