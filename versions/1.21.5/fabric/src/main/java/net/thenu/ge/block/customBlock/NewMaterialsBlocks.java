package net.thenu.ge.block.customBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.thenu.ge.GE;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.BlockFamily.BlockFamilyBuilder;
import net.thenu.utils.BlockFamily.BlockFamilyDefinition;

public class NewMaterialsBlocks { public static void registerNewMaterialsBlock() {}

    public static final BlockFamily BLOCK_OF_RUBY = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
            "block_of_ruby", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily BLOCK_OF_JADE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
            "block_of_jade", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

    public static final BlockFamily BLOCK_OF_SAPPHIRE = new BlockFamilyBuilder(GE.MOD_ID, new BlockFamilyDefinition(
            "block_of_sapphire", AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS))).build();

}
