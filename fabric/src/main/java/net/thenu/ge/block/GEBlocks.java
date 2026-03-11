package net.thenu.ge.block;


import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.thenu.ge.GE;
import net.thenu.ge.block.customBlockFiles.CrystalBlock;
import net.thenu.ge.block.customBlockFiles.NeonPanelBlock;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.BlockFamily.BlockFamilyBuilder;
import net.thenu.utils.BlockFamily.BlockFamilyDefinition;

import java.util.List;

import static net.thenu.utils.Registries.Registering.registerBlock;

public class GEBlocks {private static final String MODID = GE.MOD_ID;public static void registerModBlocks() {GE.LOGGER.info("Registering Mod GEBlocks for " + GE.MOD_ID);}

    public static final BlockFamily SLIGHTLY_MOSSY_COBBLESTONE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
    "slightly_mossy_cobblestone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COBBLESTONE))).build();
    public static final BlockFamily OVERLY_MOSSY_COBBLESTONE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
    "overly_mossy_cobblestone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COBBLESTONE))).build();
    public static final BlockFamily MOSSEND_COBBLESTONE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
    "mossend_cobblestone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COBBLESTONE))).build();
    public static final BlockFamily MOSSING_COBBLESTONE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
    "mossing_cobblestone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.COBBLESTONE))).build();
    public static final BlockFamily FULLY_COVERED_MOSSY_COBBLESTONE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
    "fully_covered_mossy_cobblestone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MOSSY_COBBLESTONE))).build();


    public static final BlockFamily SLIGHTLY_MOSSY_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "slightly_mossy_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();
    public static final BlockFamily MOSSY_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "mossy_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();
    public static final BlockFamily OVERLY_MOSSY_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "overly_mossy_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();
    public static final BlockFamily MOSSEND_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "mossend_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();
    public static final BlockFamily MOSSING_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "mossing_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();
    public static final BlockFamily FULLY_COVERED_MOSSY_DEEPSLATE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "fully_covered_mossy_deepslate", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE))).build();


    public static final BlockFamily DIAMOND = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "diamond", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DIAMOND_BLOCK))).build();
    public static final BlockFamily IRON = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "iron", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.IRON_BLOCK))).build();
    public static final BlockFamily GOLD = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "gold", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GOLD_BLOCK))).build();
    public static final BlockFamily EMERALD = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "emerald", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.EMERALD_BLOCK))).build();
    public static final BlockFamily REDSTONE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "redstone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.REDSTONE_BLOCK))).build();
    public static final BlockFamily LAPIS = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "lapis_lazuli", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LAPIS_BLOCK))).build();
    public static final BlockFamily NETHERITE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "netherite", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERITE_BLOCK))).build();
    public static final BlockFamily GLOWSTONE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "glowstone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GLOWSTONE).luminance(state -> 15))).build();


    public static final Block ARCANE_CRYSTAL_BLOCK = registerBlock(
            "arcane_crystal_block", new CrystalBlock(AbstractBlock.Settings.create().strength(1.5f, 6.0f).luminance(state -> 12).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque()));

    public static final Block RUNESTONE_BRICKS = registerBlock(
            "runestone_bricks", new Block(AbstractBlock.Settings.create().strength(2.5f, 8.0f).luminance(state -> 4).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block STARDUST_TILES = registerBlock(
            "stardust_tiles", new Block(AbstractBlock.Settings.create().strength(1.8f, 5.0f).luminance(state -> 8).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    public static final Block RIVETED_IRON_PLATE = registerBlock(
            "riveted_iron_plate", new Block(AbstractBlock.Settings.create().strength(4.0f, 12.0f).sounds(BlockSoundGroup.NETHERITE).requiresTool()));

    public static final Block COPPER_PIPE_BUNDLE = registerBlock(
            "copper_pipe_bundle", new PillarBlock(AbstractBlock.Settings.create().strength(3.0f, 8.0f).sounds(BlockSoundGroup.COPPER).requiresTool()));

    public static final Block TARNISHED_BRASS_BLOCK = registerBlock(
            "tarnished_brass_block", new Block(AbstractBlock.Settings.create().strength(3.5f, 9.0f).sounds(BlockSoundGroup.COPPER).requiresTool()));

    public static final Block MOSSY_PETAL_STONE = registerBlock(
            "mossy_petal_stone", new Block(AbstractBlock.Settings.create().strength(1.5f, 4.0f).sounds(BlockSoundGroup.MOSS_BLOCK)));

    public static final Block OVERGROWN_RUINS = registerBlock(
            "overgrown_ruins", new Block(AbstractBlock.Settings.create().strength(2.0f, 5.0f).sounds(BlockSoundGroup.MOSS_CARPET)));

    public static final Block PETRIFIED_LOG = registerBlock(
            "petrified_log", new PillarBlock(AbstractBlock.Settings.create().strength(3.0f, 7.0f).sounds(BlockSoundGroup.WOOD).requiresTool()));

    public static final Block SOUL_OBSIDIAN_BRICKS = registerBlock(
            "soul_obsidian_bricks", new Block(AbstractBlock.Settings.create().strength(30.0f, 1200.0f).luminance(state -> 3).sounds(BlockSoundGroup.BASALT).requiresTool()));

    public static final Block BONE_CARVED_STONE = registerBlock(
            "bone_carved_stone", new Block(AbstractBlock.Settings.create().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BONE)));

    public static final Block VOID_BLACKSTONE_TILES = registerBlock(
            "void_blackstone_tiles", new Block(AbstractBlock.Settings.create().strength(3.0f, 9.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block NEON_GRID_PANEL = registerBlock(
            "neon_grid_panel", new NeonPanelBlock(AbstractBlock.Settings.create().strength(1.0f, 4.0f).luminance(state -> 15).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    public static final Block HOLO_GLASS = registerBlock(
            "holo_glass", new TransparentBlock(AbstractBlock.Settings.create().strength(0.5f, 2.0f).luminance(state -> 6).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    public static final Block DURASTEEL_PLATING = registerBlock(
            "durasteel_plating", new Block(AbstractBlock.Settings.create().strength(5.0f, 20.0f).sounds(BlockSoundGroup.NETHERITE).requiresTool()));



}
