package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import net.thenu.ge.GEBlocks;

public class Models extends FabricModelProvider {

    public Models(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {

        // Generate block families automatically
        gen.registerCubeAllModelTexturePool(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.base);
        gen.registerCubeAllModelTexturePool(GEBlocks.OVERLY_MOSSY_COBBLESTONE.base);
        gen.registerCubeAllModelTexturePool(GEBlocks.MOSSY_DEEPSLATE.base);
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        // Usually handled automatically for blocks
    }
}