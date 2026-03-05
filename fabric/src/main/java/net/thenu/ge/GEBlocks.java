package net.thenu.ge;


import net.minecraft.block.*;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.BlockFamily.BlockFamilyBuilder;
import net.thenu.utils.BlockFamily.BlockFamilyDefinition;

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
    "lapis", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LAPIS_BLOCK))).build();
    public static final BlockFamily NETHERITE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "netherite", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERITE_BLOCK))).build();
    public static final BlockFamily GLOWSTONE = new BlockFamilyBuilder(MODID, new BlockFamilyDefinition(
    "glowstone", AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GLOWSTONE).luminance(state -> 15))).build();
}
