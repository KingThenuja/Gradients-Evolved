package net.thenu.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.thenu.ge.GEBlocks;
import net.thenu.ge.GE;

public class GEBlockStateProvider extends BlockStateProvider {
    public GEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GE.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        Block block = deferredBlock.get(); // Extract the Block
        simpleBlockWithItem(block, cubeAll(block));
    }
}