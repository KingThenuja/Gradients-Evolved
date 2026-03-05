package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import net.thenu.ge.GEBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;
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

        HelperLists.getAllMossyCobblestoneBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block))
        );
        HelperLists.getAllMossyDeepslateBlocks().forEach(family ->
                family.getAll().forEach(block -> addDrop(block))
        );
    }
}