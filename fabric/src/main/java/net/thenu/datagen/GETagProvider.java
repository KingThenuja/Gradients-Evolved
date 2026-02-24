package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.thenu.ge.GEBlocks;

import java.util.concurrent.CompletableFuture;

public class GETagProvider extends FabricTagProvider.BlockTagProvider {
    public GETagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        //Cobblestone
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.MOSSEND_COBBLESTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.MOSSEND_COBBLESTONE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.MOSSING_COBBLESTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.MOSSING_COBBLESTONE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL);

        //Deepslate
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.MOSSEND_DEEPSLATE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.MOSSEND_DEEPSLATE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.MOSSING_DEEPSLATE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.MOSSING_DEEPSLATE_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL);


        //Ore
        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.DIAMOND_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.DIAMOND_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.DIAMOND_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.IRON_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.IRON_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.IRON_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.GOLD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.GOLD_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.GOLD_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.EMERALD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.EMERALD_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.EMERALD_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.REDSTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.REDSTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.REDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.LAPIS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.LAPIS_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.LAPIS_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.NETHERITE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.NETHERITE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.NETHERITE_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(GEBlocks.GLOWSTONE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(GEBlocks.GLOWSTONE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(GEBlocks.GLOWSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(GEBlocks.DIAMOND_BUTTON).add(GEBlocks.DIAMOND_SLAB).add(GEBlocks.DIAMOND_STAIRS).add(GEBlocks.DIAMOND_PRESSURE_PLATE).add(GEBlocks.DIAMOND_FENCE).add(GEBlocks.DIAMOND_FENCE_GATE).add(GEBlocks.DIAMOND_WALL)
                .add(GEBlocks.IRON_BUTTON).add(GEBlocks.IRON_SLAB).add(GEBlocks.IRON_STAIRS).add(GEBlocks.IRON_FENCE).add(GEBlocks.IRON_FENCE_GATE).add(GEBlocks.IRON_WALL)
                .add(GEBlocks.GOLD_BUTTON).add(GEBlocks.GOLD_SLAB).add(GEBlocks.GOLD_STAIRS).add(GEBlocks.GOLD_FENCE).add(GEBlocks.GOLD_FENCE_GATE).add(GEBlocks.GOLD_WALL)
                .add(GEBlocks.EMERALD_BUTTON).add(GEBlocks.EMERALD_SLAB).add(GEBlocks.EMERALD_STAIRS).add(GEBlocks.EMERALD_PRESSURE_PLATE).add(GEBlocks.EMERALD_FENCE).add(GEBlocks.EMERALD_FENCE_GATE).add(GEBlocks.EMERALD_WALL)
                .add(GEBlocks.REDSTONE_BUTTON).add(GEBlocks.REDSTONE_SLAB).add(GEBlocks.REDSTONE_STAIRS).add(GEBlocks.REDSTONE_PRESSURE_PLATE).add(GEBlocks.REDSTONE_FENCE).add(GEBlocks.REDSTONE_FENCE_GATE).add(GEBlocks.REDSTONE_WALL)
                .add(GEBlocks.LAPIS_BUTTON).add(GEBlocks.LAPIS_SLAB).add(GEBlocks.LAPIS_STAIRS).add(GEBlocks.LAPIS_PRESSURE_PLATE).add(GEBlocks.LAPIS_FENCE).add(GEBlocks.LAPIS_FENCE_GATE).add(GEBlocks.LAPIS_WALL)
                .add(GEBlocks.NETHERITE_BUTTON).add(GEBlocks.NETHERITE_SLAB).add(GEBlocks.NETHERITE_STAIRS).add(GEBlocks.NETHERITE_PRESSURE_PLATE).add(GEBlocks.NETHERITE_FENCE).add(GEBlocks.NETHERITE_FENCE_GATE).add(GEBlocks.NETHERITE_WALL)
                .add(GEBlocks.GLOWSTONE_BUTTON).add(GEBlocks.GLOWSTONE_SLAB).add(GEBlocks.GLOWSTONE_STAIRS).add(GEBlocks.GLOWSTONE_PRESSURE_PLATE).add(GEBlocks.GLOWSTONE_FENCE).add(GEBlocks.GLOWSTONE_FENCE_GATE).add(GEBlocks.GLOWSTONE_WALL)

                //Cobble
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE)
                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL)

                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE)
                .add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL)

                .add(GEBlocks.MOSSEND_COBBLESTONE)
                .add(GEBlocks.MOSSEND_COBBLESTONE_STAIRS)
                .add(GEBlocks.MOSSEND_COBBLESTONE_SLAB)
                .add(GEBlocks.MOSSEND_COBBLESTONE_BUTTON)
                .add(GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE)
                .add(GEBlocks.MOSSEND_COBBLESTONE_FENCE)
                .add(GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE)
                .add(GEBlocks.MOSSEND_COBBLESTONE_WALL)

                .add(GEBlocks.MOSSING_COBBLESTONE)
                .add(GEBlocks.MOSSING_COBBLESTONE_STAIRS)
                .add(GEBlocks.MOSSING_COBBLESTONE_SLAB)
                .add(GEBlocks.MOSSING_COBBLESTONE_BUTTON)
                .add(GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE)
                .add(GEBlocks.MOSSING_COBBLESTONE_FENCE)
                .add(GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE)
                .add(GEBlocks.MOSSING_COBBLESTONE_WALL)

                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL)

                //Deepslate
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL)

                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL)

                .add(GEBlocks.MOSSEND_DEEPSLATE)
                .add(GEBlocks.MOSSEND_DEEPSLATE_STAIRS)
                .add(GEBlocks.MOSSEND_DEEPSLATE_SLAB)
                .add(GEBlocks.MOSSEND_DEEPSLATE_BUTTON)
                .add(GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.MOSSEND_DEEPSLATE_FENCE)
                .add(GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.MOSSEND_DEEPSLATE_WALL)

                .add(GEBlocks.MOSSING_DEEPSLATE)
                .add(GEBlocks.MOSSING_DEEPSLATE_STAIRS)
                .add(GEBlocks.MOSSING_DEEPSLATE_SLAB)
                .add(GEBlocks.MOSSING_DEEPSLATE_BUTTON)
                .add(GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.MOSSING_DEEPSLATE_FENCE)
                .add(GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.MOSSING_DEEPSLATE_WALL)

                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL)

                .add(GEBlocks.MOSSY_DEEPSLATE)
                .add(GEBlocks.MOSSY_DEEPSLATE_STAIRS)
                .add(GEBlocks.MOSSY_DEEPSLATE_SLAB)
                .add(GEBlocks.MOSSY_DEEPSLATE_BUTTON)
                .add(GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE)
                .add(GEBlocks.MOSSY_DEEPSLATE_FENCE)
                .add(GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE)
                .add(GEBlocks.MOSSY_DEEPSLATE_WALL)








        ;
        /*.add(MBlocks.PINK_GARNET_BLOCK);*/



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
        /*.add(MBlocks.PINK_GARNET_DEEPSLATE_ORE);*/;

        /*getOrCreateTagBuilder(BlockTags.FENCES).add(MBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(MBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(MBlocks.PINK_GARNET_WALL);*/

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
        /*.add(MBlocks.MAGIC_BLOCK);*/;


    }
}