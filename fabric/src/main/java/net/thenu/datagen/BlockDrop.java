package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import net.thenu.ge.block.GEBlocks;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.HelperLists;

import java.util.concurrent.CompletableFuture;

public class BlockDrop extends FabricBlockLootTableProvider {

    public BlockDrop(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(output, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(AmethystBlocks.CIRCULAR_AMETHYST_LAMP);
        addDrop(AmethystBlocks.CROSSED_AMETHYST_LAMP);

        HelperLists.getAllMossyCobblestoneBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));
        HelperLists.getAllMossyDeepslateBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));
        HelperLists.getAllAmethystBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block)));



    }
}