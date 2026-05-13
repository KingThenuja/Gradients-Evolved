package net.thenu.ge.block.customBlock;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.thenu.utils.BlockFamily.BlockFamily;

import static net.thenu.ge.block.GEBlocks.builder;

public class $1 {public static void register$1(){}

    public static final BlockFamily POLISHED_CALCITE = builder("polished_calcite", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily MOSSY_STONE_TILES = builder("mossy_stone_tiles", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily GLOW_MUSHROOM_BRICKS = builder("glow_mushroom_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS).lightLevel(state -> 15)).build();
    public static final BlockFamily END_STONE_BRICKS = builder("end_stone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily CHISELED_PRISMARINE = builder("chiseled_prismarine", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily POLISHED_PRISMARINE = builder("polished_prismarine", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily PRISMARINE_TILES = builder("prismarine_tiles", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily CHISELED_BASALT = builder("chiseled_basalt", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily CALCITE_BRICKS = builder("calcite_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();
    public static final BlockFamily BASALT_BRICKS = builder("basalt_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();

}
