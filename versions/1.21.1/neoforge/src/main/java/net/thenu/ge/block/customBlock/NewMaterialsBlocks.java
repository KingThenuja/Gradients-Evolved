package net.thenu.ge.block.customBlock;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.BlockFamily.BlockFamilyBuilder;
import net.thenu.utils.BlockFamily.BlockFamilyDefinition;

import static net.thenu.ge.block.GEBlocks.builder;

public class NewMaterialsBlocks {public static void registerNewMaterialsBlocks() {}

    public static final BlockFamily BLOCK_OF_RUBY = builder(
            "block_of_ruby", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();

    public static final BlockFamily BLOCK_OF_JADE = builder(
            "block_of_jade", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();

    public static final BlockFamily BLOCK_OF_SAPPHIRE = builder(
            "block_of_sapphire", BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)).build();

}
