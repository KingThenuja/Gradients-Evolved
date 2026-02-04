package net.thenu.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.thenu.ge.GEBlocks;

import java.util.Set;

public class GELootTableProvider extends BlockLootSubProvider{
    protected GELootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    protected void generate() {
        dropSelf(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get());


    }

    protected Iterable<Block> getKnownBlocks() {
        return GEBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
