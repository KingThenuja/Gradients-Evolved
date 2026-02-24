package net.thenu.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.thenu.ge.ModBlocks;

import java.util.Set;

public class GELootTableProvider extends BlockLootSubProvider{
    protected GELootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    protected void generate() {
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_DOOR.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_TRAPDOOR.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON.get());


    }

    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
