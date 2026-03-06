package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.thenu.ge.block.GEBlocks;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.HelperLists;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Tag extends FabricTagProvider.BlockTagProvider {
    public Tag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        // --- PICKAXE MINEABLE ---
        FabricTagBuilder pickaxe = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        addAllFromFamilies(pickaxe, HelperLists.getAllMossyCobblestoneBlocks());
        addAllFromFamilies(pickaxe, HelperLists.getAllMossyDeepslateBlocks());
        addAllFromFamilies(pickaxe, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addAllFromFamilies(pickaxe, HelperLists.getAllAmethystBlocks());
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(AmethystBlocks.CROSSED_AMETHYST_LAMP);


        // --- NEEDS STONE TOOL ---
        // Mossy cobblestone/deepslate variants use stone tier
        FabricTagBuilder stoneTool = getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);
        addAllFromFamilies(stoneTool, HelperLists.getAllMossyCobblestoneBlocks());
        addAllFromFamilies(stoneTool, HelperLists.getAllMossyDeepslateBlocks());
        addAllFromFamilies(stoneTool, HelperLists.getAllAmethystBlocks());
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(AmethystBlocks.CIRCULAR_AMETHYST_LAMP);


        // --- WALLS ---
        FabricTagBuilder walls = getOrCreateTagBuilder(BlockTags.WALLS);
        addWallsFromFamilies(walls, HelperLists.getAllMossyCobblestoneBlocks());
        addWallsFromFamilies(walls, HelperLists.getAllMossyDeepslateBlocks());
        addWallsFromFamilies(walls, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addWallsFromFamilies(walls, HelperLists.getAllAmethystBlocks());


        // --- FENCES ---
        FabricTagBuilder fences = getOrCreateTagBuilder(BlockTags.FENCES);
        addFencesFromFamilies(fences, HelperLists.getAllMossyCobblestoneBlocks());
        addFencesFromFamilies(fences, HelperLists.getAllMossyDeepslateBlocks());
        addFencesFromFamilies(fences, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addFencesFromFamilies(fences, HelperLists.getAllAmethystBlocks());


        // --- FENCE GATES ---
        FabricTagBuilder fenceGates = getOrCreateTagBuilder(BlockTags.FENCE_GATES);
        addFenceGatesFromFamilies(fenceGates, HelperLists.getAllMossyCobblestoneBlocks());
        addFenceGatesFromFamilies(fenceGates, HelperLists.getAllMossyDeepslateBlocks());
        addFenceGatesFromFamilies(fenceGates, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addFenceGatesFromFamilies(fenceGates, HelperLists.getAllAmethystBlocks());


    }

    // Adds every block in every family (base, slab, stairs, wall, fence, fenceGate)
    private void addAllFromFamilies(FabricTagBuilder builder, List<BlockFamily> families) {
        for (BlockFamily family : families) {
            family.getAll().forEach(builder::add);
        }
    }

    private void addWallsFromFamilies(FabricTagBuilder builder, List<BlockFamily> families) {
        for (BlockFamily family : families) builder.add(family.wall());
    }

    private void addFencesFromFamilies(FabricTagBuilder builder, List<BlockFamily> families) {
        for (BlockFamily family : families) builder.add(family.fence());
    }

    private void addFenceGatesFromFamilies(FabricTagBuilder builder, List<BlockFamily> families) {
        for (BlockFamily family : families) builder.add(family.fenceGate());
    }
}