package net.thenu.ge;


import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;

import static net.thenu.utils.Registering.registerBlock;

public class GEBlocks {public static void registerModBlocks() {GE.LOGGER.info("Registering Mod Blocks for " + GE.MOD_ID);}

    //Slightly Mossy Cobble
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE = registerBlock("slightly_mossy_cobblestone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_STAIRS = registerBlock("slightly_mossy_cobblestone_stairs", new StairsBlock(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_SLAB = registerBlock("slightly_mossy_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_BUTTON = registerBlock("slightly_mossy_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("slightly_mossy_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_FENCE = registerBlock("slightly_mossy_cobblestone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("slightly_mossy_cobblestone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_COBBLESTONE_WALL = registerBlock("slightly_mossy_cobblestone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Overly Mossy Cobble
    public static final Block OVERLY_MOSSY_COBBLESTONE = registerBlock("overly_mossy_cobblestone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block OVERLY_MOSSY_COBBLESTONE_STAIRS = registerBlock("overly_mossy_cobblestone_stairs", new StairsBlock(GEBlocks.OVERLY_MOSSY_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_SLAB = registerBlock("overly_mossy_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_BUTTON = registerBlock("overly_mossy_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("overly_mossy_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_FENCE = registerBlock("overly_mossy_cobblestone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("overly_mossy_cobblestone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_COBBLESTONE_WALL = registerBlock("overly_mossy_cobblestone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Mossend Cobble
    public static final Block MOSSEND_COBBLESTONE = registerBlock("mossend_cobblestone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSEND_COBBLESTONE_STAIRS = registerBlock("mossend_cobblestone_stairs", new StairsBlock(GEBlocks.MOSSEND_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_COBBLESTONE_SLAB = registerBlock("mossend_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_COBBLESTONE_BUTTON = registerBlock("mossend_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MOSSEND_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossend_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_COBBLESTONE_FENCE = registerBlock("mossend_cobblestone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_COBBLESTONE_FENCE_GATE = registerBlock("mossend_cobblestone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_COBBLESTONE_WALL = registerBlock("mossend_cobblestone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Mossing Cobble
    public static final Block MOSSING_COBBLESTONE = registerBlock("mossing_cobblestone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSING_COBBLESTONE_STAIRS = registerBlock("mossing_cobblestone_stairs", new StairsBlock(GEBlocks.MOSSING_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_COBBLESTONE_SLAB = registerBlock("mossing_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_COBBLESTONE_BUTTON = registerBlock("mossing_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MOSSING_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossing_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_COBBLESTONE_FENCE = registerBlock("mossing_cobblestone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_COBBLESTONE_FENCE_GATE = registerBlock("mossing_cobblestone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_COBBLESTONE_WALL = registerBlock("mossing_cobblestone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Fully Covered Mossy Cobble
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE = registerBlock("fully_covered_mossy_cobblestone", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS = registerBlock("fully_covered_mossy_cobblestone_stairs", new StairsBlock(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_SLAB = registerBlock("fully_covered_mossy_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON = registerBlock("fully_covered_mossy_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("fully_covered_mossy_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_FENCE = registerBlock("fully_covered_mossy_cobblestone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("fully_covered_mossy_cobblestone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_COBBLESTONE_WALL = registerBlock("fully_covered_mossy_cobblestone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));



    //Slightly Mossy Deepslate
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE = registerBlock("slightly_mossy_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_STAIRS = registerBlock("slightly_mossy_deepslate_stairs", new StairsBlock(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_SLAB = registerBlock("slightly_mossy_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_BUTTON = registerBlock("slightly_mossy_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE = registerBlock("slightly_mossy_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_FENCE = registerBlock("slightly_mossy_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE = registerBlock("slightly_mossy_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block SLIGHTLY_MOSSY_DEEPSLATE_WALL = registerBlock("slightly_mossy_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Mossy Deepslate
    public static final Block MOSSY_DEEPSLATE = registerBlock("mossy_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSY_DEEPSLATE_STAIRS = registerBlock("mossy_deepslate_stairs", new StairsBlock(GEBlocks.MOSSY_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_SLAB = registerBlock("mossy_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_BUTTON = registerBlock("mossy_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MOSSY_DEEPSLATE_PRESSURE_PLATE = registerBlock("mossy_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_FENCE = registerBlock("mossy_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_FENCE_GATE = registerBlock("mossy_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSY_DEEPSLATE_WALL = registerBlock("mossy_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Overly Mossy Deepslate
    public static final Block OVERLY_MOSSY_DEEPSLATE = registerBlock("overly_mossy_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block OVERLY_MOSSY_DEEPSLATE_STAIRS = registerBlock("overly_mossy_deepslate_stairs", new StairsBlock(GEBlocks.OVERLY_MOSSY_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_SLAB = registerBlock("overly_mossy_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_BUTTON = registerBlock("overly_mossy_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE = registerBlock("overly_mossy_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_FENCE = registerBlock("overly_mossy_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_FENCE_GATE = registerBlock("overly_mossy_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OVERLY_MOSSY_DEEPSLATE_WALL = registerBlock("overly_mossy_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Mossend Deepslate
    public static final Block MOSSEND_DEEPSLATE = registerBlock("mossend_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSEND_DEEPSLATE_STAIRS = registerBlock("mossend_deepslate_stairs", new StairsBlock(GEBlocks.MOSSEND_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_DEEPSLATE_SLAB = registerBlock("mossend_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_DEEPSLATE_BUTTON = registerBlock("mossend_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MOSSEND_DEEPSLATE_PRESSURE_PLATE = registerBlock("mossend_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_DEEPSLATE_FENCE = registerBlock("mossend_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_DEEPSLATE_FENCE_GATE = registerBlock("mossend_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSEND_DEEPSLATE_WALL = registerBlock("mossend_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Mossing Deepslate
    public static final Block MOSSING_DEEPSLATE = registerBlock("mossing_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSING_DEEPSLATE_STAIRS = registerBlock("mossing_deepslate_stairs", new StairsBlock(GEBlocks.MOSSING_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_DEEPSLATE_SLAB = registerBlock("mossing_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_DEEPSLATE_BUTTON = registerBlock("mossing_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MOSSING_DEEPSLATE_PRESSURE_PLATE = registerBlock("mossing_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_DEEPSLATE_FENCE = registerBlock("mossing_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_DEEPSLATE_FENCE_GATE = registerBlock("mossing_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MOSSING_DEEPSLATE_WALL = registerBlock("mossing_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    //Fully Covered Mossy Deepslate
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE = registerBlock("fully_covered_mossy_deepslate", new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS = registerBlock("fully_covered_mossy_deepslate_stairs", new StairsBlock(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_SLAB = registerBlock("fully_covered_mossy_deepslate_slab", new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON = registerBlock("fully_covered_mossy_deepslate_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE = registerBlock("fully_covered_mossy_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_FENCE = registerBlock("fully_covered_mossy_deepslate_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE = registerBlock("fully_covered_mossy_deepslate_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block FULLY_COVERED_MOSSY_DEEPSLATE_WALL = registerBlock("fully_covered_mossy_deepslate_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));





    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs", new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block DIAMOND_BUTTON = registerBlock("diamond_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block DIAMOND_PRESSURE_PLATE = registerBlock("diamond_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DIAMOND_FENCE = registerBlock("diamond_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DIAMOND_FENCE_GATE = registerBlock("diamond_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block DIAMOND_WALL = registerBlock("diamond_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block IRON_STAIRS = registerBlock("iron_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerBlock("iron_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block IRON_BUTTON = registerBlock("iron_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block IRON_FENCE = registerBlock("iron_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block IRON_FENCE_GATE = registerBlock("iron_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block IRON_WALL = registerBlock("iron_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GOLD_STAIRS = registerBlock("gold_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block GOLD_BUTTON = registerBlock("gold_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block GOLD_FENCE = registerBlock("gold_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GOLD_FENCE_GATE = registerBlock("gold_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block GOLD_WALL = registerBlock("gold_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs", new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block EMERALD_BUTTON = registerBlock("emerald_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block EMERALD_PRESSURE_PLATE = registerBlock("emerald_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block EMERALD_FENCE = registerBlock("emerald_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block EMERALD_FENCE_GATE = registerBlock("emerald_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block REDSTONE_STAIRS = registerBlock("redstone_stairs", new StairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
    public static final Block REDSTONE_SLAB = registerBlock("redstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block REDSTONE_BUTTON = registerBlock("redstone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block REDSTONE_PRESSURE_PLATE = registerBlock("redstone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block REDSTONE_FENCE = registerBlock("redstone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block REDSTONE_FENCE_GATE = registerBlock("redstone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block REDSTONE_WALL = registerBlock("redstone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs", new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block LAPIS_BUTTON = registerBlock("lapis_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block LAPIS_PRESSURE_PLATE = registerBlock("lapis_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LAPIS_FENCE = registerBlock("lapis_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LAPIS_FENCE_GATE = registerBlock("lapis_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block LAPIS_WALL = registerBlock("lapis_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)));
    public static final Block NETHERITE_BUTTON = registerBlock("netherite_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block NETHERITE_PRESSURE_PLATE = registerBlock("netherite_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NETHERITE_FENCE = registerBlock("netherite_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NETHERITE_FENCE_GATE = registerBlock("netherite_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block GLOWSTONE_STAIRS = registerBlock("glowstone_stairs", new StairsBlock(Blocks.GLOWSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB).luminance(state -> 15)));
    public static final Block GLOWSTONE_BUTTON = registerBlock("glowstone_button", new ButtonBlock(BlockSetType.STONE, 16, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision().luminance(state -> 15)));
    public static final Block GLOWSTONE_PRESSURE_PLATE = registerBlock("glowstone_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().luminance(state -> 15)));
    public static final Block GLOWSTONE_FENCE = registerBlock("glowstone_fence", new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().luminance(state -> 15)));
    public static final Block GLOWSTONE_FENCE_GATE = registerBlock("glowstone_fence_gate", new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().luminance(state -> 15)));
    public static final Block GLOWSTONE_WALL = registerBlock("glowstone_wall", new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().luminance(state -> 15)));

}
