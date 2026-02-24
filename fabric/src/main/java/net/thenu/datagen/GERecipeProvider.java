package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.thenu.ge.GEBlocks;

import java.util.concurrent.CompletableFuture;

import static net.thenu.utils.RecipesForDatagen.*;

public class GERecipeProvider extends FabricRecipeProvider {
    public GERecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //Slab
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.DIAMOND_SLAB, Items.DIAMOND);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.IRON_SLAB, Items.IRON_INGOT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.GOLD_SLAB, Items.GOLD_INGOT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.EMERALD_SLAB, Items.EMERALD);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.REDSTONE_SLAB, Items.REDSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.LAPIS_SLAB, Items.LAPIS_LAZULI);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.NETHERITE_SLAB, Items.NETHERITE_INGOT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.GLOWSTONE_SLAB, Items.GLOWSTONE_DUST);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSEND_COBBLESTONE_SLAB, GEBlocks.MOSSEND_COBBLESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSING_COBBLESTONE_SLAB, GEBlocks.MOSSING_COBBLESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSEND_DEEPSLATE_SLAB, GEBlocks.MOSSEND_DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSY_DEEPSLATE_SLAB, GEBlocks.MOSSY_DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSING_DEEPSLATE_SLAB, GEBlocks.MOSSING_DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Stairs
        offerStairsRecipe(exporter, GEBlocks.DIAMOND_STAIRS, Items.DIAMOND);
        offerStairsRecipe(exporter, GEBlocks.IRON_STAIRS, Items.IRON_INGOT);
        offerStairsRecipe(exporter, GEBlocks.GOLD_STAIRS, Items.GOLD_INGOT);
        offerStairsRecipe(exporter, GEBlocks.EMERALD_STAIRS, Items.EMERALD);
        offerStairsRecipe(exporter, GEBlocks.REDSTONE_STAIRS, Items.REDSTONE);
        offerStairsRecipe(exporter, GEBlocks.LAPIS_STAIRS, Items.LAPIS_LAZULI);
        offerStairsRecipe(exporter, GEBlocks.NETHERITE_STAIRS, Items.NETHERITE_INGOT);
        offerStairsRecipe(exporter, GEBlocks.GLOWSTONE_STAIRS, Items.GLOWSTONE_DUST);
        offerStairsRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerStairsRecipe(exporter, GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerStairsRecipe(exporter, GEBlocks.MOSSEND_COBBLESTONE_STAIRS, GEBlocks.MOSSEND_COBBLESTONE);
        offerStairsRecipe(exporter, GEBlocks.MOSSING_COBBLESTONE_STAIRS, GEBlocks.MOSSING_COBBLESTONE);
        offerStairsRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerStairsRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerStairsRecipe(exporter, GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerStairsRecipe(exporter, GEBlocks.MOSSY_DEEPSLATE_STAIRS, GEBlocks.MOSSY_DEEPSLATE);
        offerStairsRecipe(exporter, GEBlocks.MOSSEND_DEEPSLATE_STAIRS, GEBlocks.MOSSEND_DEEPSLATE);
        offerStairsRecipe(exporter, GEBlocks.MOSSING_DEEPSLATE_STAIRS, GEBlocks.MOSSING_DEEPSLATE);
        offerStairsRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Button
        offerButtonRecipe(exporter, GEBlocks.DIAMOND_BUTTON, Items.DIAMOND);
        offerButtonRecipe(exporter, GEBlocks.IRON_BUTTON, Items.IRON_INGOT);
        offerButtonRecipe(exporter, GEBlocks.GOLD_BUTTON, Items.GOLD_INGOT);
        offerButtonRecipe(exporter, GEBlocks.REDSTONE_BUTTON, Items.REDSTONE);
        offerButtonRecipe(exporter, GEBlocks.LAPIS_BUTTON, Items.LAPIS_LAZULI);
        offerButtonRecipe(exporter, GEBlocks.NETHERITE_BUTTON, Items.NETHERITE_INGOT);
        offerButtonRecipe(exporter, GEBlocks.GLOWSTONE_BUTTON, Items.GLOWSTONE_DUST);
        offerButtonRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerButtonRecipe(exporter, GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerButtonRecipe(exporter, GEBlocks.MOSSEND_COBBLESTONE_BUTTON, GEBlocks.MOSSEND_COBBLESTONE);
        offerButtonRecipe(exporter, GEBlocks.MOSSING_COBBLESTONE_BUTTON, GEBlocks.MOSSING_COBBLESTONE);
        offerButtonRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerButtonRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerButtonRecipe(exporter, GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerButtonRecipe(exporter, GEBlocks.MOSSEND_DEEPSLATE_BUTTON, GEBlocks.MOSSEND_DEEPSLATE);
        offerButtonRecipe(exporter, GEBlocks.MOSSY_DEEPSLATE_BUTTON, GEBlocks.MOSSY_DEEPSLATE);
        offerButtonRecipe(exporter, GEBlocks.MOSSING_DEEPSLATE_BUTTON, GEBlocks.MOSSING_DEEPSLATE);
        offerButtonRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Pressure Plate
        offerPressurePlateRecipe(exporter, GEBlocks.DIAMOND_PRESSURE_PLATE, Items.DIAMOND);
        offerPressurePlateRecipe(exporter, GEBlocks.EMERALD_PRESSURE_PLATE, Items.EMERALD);
        offerPressurePlateRecipe(exporter, GEBlocks.REDSTONE_PRESSURE_PLATE, Items.REDSTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.LAPIS_PRESSURE_PLATE, Items.LAPIS_LAZULI);
        offerPressurePlateRecipe(exporter, GEBlocks.NETHERITE_PRESSURE_PLATE, Items.NETHERITE_INGOT);
        offerPressurePlateRecipe(exporter, GEBlocks.GLOWSTONE_PRESSURE_PLATE, Items.GLOWSTONE_DUST);
        offerPressurePlateRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE, GEBlocks.MOSSEND_COBBLESTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE, GEBlocks.MOSSING_COBBLESTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerPressurePlateRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerPressurePlateRecipe(exporter, GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerPressurePlateRecipe(exporter, GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSEND_DEEPSLATE);
        offerPressurePlateRecipe(exporter, GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSY_DEEPSLATE);
        offerPressurePlateRecipe(exporter, GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSING_DEEPSLATE);
        offerPressurePlateRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Fence
        offerFenceRecipe(exporter, GEBlocks.DIAMOND_FENCE, Items.DIAMOND);
        offerFenceRecipe(exporter, GEBlocks.IRON_FENCE, Items.IRON_INGOT);
        offerFenceRecipe(exporter, GEBlocks.GOLD_FENCE, Items.GOLD_INGOT);
        offerFenceRecipe(exporter, GEBlocks.EMERALD_FENCE, Items.EMERALD);
        offerFenceRecipe(exporter, GEBlocks.REDSTONE_FENCE, Items.REDSTONE);
        offerFenceRecipe(exporter, GEBlocks.LAPIS_FENCE, Items.LAPIS_LAZULI);
        offerFenceRecipe(exporter, GEBlocks.NETHERITE_FENCE, Items.NETHERITE_INGOT);
        offerFenceRecipe(exporter, GEBlocks.GLOWSTONE_FENCE, Items.GLOWSTONE_DUST);
        offerFenceRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerFenceRecipe(exporter, GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerFenceRecipe(exporter, GEBlocks.MOSSEND_COBBLESTONE_FENCE, GEBlocks.MOSSEND_COBBLESTONE);
        offerFenceRecipe(exporter, GEBlocks.MOSSING_COBBLESTONE_FENCE, GEBlocks.MOSSING_COBBLESTONE);
        offerFenceRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerFenceRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerFenceRecipe(exporter, GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerFenceRecipe(exporter, GEBlocks.MOSSEND_DEEPSLATE_FENCE, GEBlocks.MOSSEND_DEEPSLATE);
        offerFenceRecipe(exporter, GEBlocks.MOSSY_DEEPSLATE_FENCE, GEBlocks.MOSSY_DEEPSLATE);
        offerFenceRecipe(exporter, GEBlocks.MOSSING_DEEPSLATE_FENCE, GEBlocks.MOSSING_DEEPSLATE);
        offerFenceRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Fence Gate
        offerFenceGateRecipe(exporter, GEBlocks.DIAMOND_FENCE_GATE, Items.DIAMOND);
        offerFenceGateRecipe(exporter, GEBlocks.IRON_FENCE_GATE, Items.IRON_INGOT);
        offerFenceGateRecipe(exporter, GEBlocks.GOLD_FENCE_GATE, Items.GOLD_INGOT);
        offerFenceGateRecipe(exporter, GEBlocks.EMERALD_FENCE_GATE, Items.EMERALD);
        offerFenceGateRecipe(exporter, GEBlocks.REDSTONE_FENCE_GATE, Items.REDSTONE);
        offerFenceGateRecipe(exporter, GEBlocks.LAPIS_FENCE_GATE, Items.LAPIS_LAZULI);
        offerFenceGateRecipe(exporter, GEBlocks.NETHERITE_FENCE_GATE, Items.NETHERITE_INGOT);
        offerFenceGateRecipe(exporter, GEBlocks.GLOWSTONE_FENCE_GATE, Items.GLOWSTONE_DUST);
        offerFenceGateRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerFenceGateRecipe(exporter, GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerFenceGateRecipe(exporter, GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE, GEBlocks.MOSSEND_COBBLESTONE);
        offerFenceGateRecipe(exporter, GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE, GEBlocks.MOSSING_COBBLESTONE);
        offerFenceGateRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerFenceGateRecipe(exporter, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerFenceGateRecipe(exporter, GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerFenceGateRecipe(exporter, GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSEND_DEEPSLATE);
        offerFenceGateRecipe(exporter, GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSY_DEEPSLATE);
        offerFenceGateRecipe(exporter, GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSING_DEEPSLATE);
        offerFenceGateRecipe(exporter, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Wall
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.DIAMOND_WALL, Items.DIAMOND);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.IRON_WALL, Items.IRON_INGOT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.GOLD_WALL, Items.GOLD_INGOT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.EMERALD_WALL, Items.EMERALD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.REDSTONE_WALL, Items.REDSTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.LAPIS_WALL, Items.LAPIS_LAZULI);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.NETHERITE_WALL, Items.NETHERITE_INGOT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.GLOWSTONE_WALL, Items.GLOWSTONE_DUST);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL, GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSEND_COBBLESTONE_WALL, GEBlocks.MOSSEND_COBBLESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSING_COBBLESTONE_WALL, GEBlocks.MOSSING_COBBLESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL, GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSEND_DEEPSLATE_WALL, GEBlocks.MOSSEND_DEEPSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSY_DEEPSLATE_WALL, GEBlocks.MOSSY_DEEPSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.MOSSING_DEEPSLATE_WALL, GEBlocks.MOSSING_DEEPSLATE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);

        //Stonecutter          (exporter, categorie, output, input, count)
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, Blocks.COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE, Blocks.COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.OVERLY_MOSSY_COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE, Blocks.COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_SLAB, GEBlocks.MOSSEND_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_STAIRS, GEBlocks.MOSSEND_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_WALL, GEBlocks.MOSSEND_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_BUTTON, GEBlocks.MOSSEND_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE, GEBlocks.MOSSEND_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_FENCE, GEBlocks.MOSSEND_COBBLESTONE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE, GEBlocks.MOSSEND_COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE, Blocks.COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_SLAB, GEBlocks.MOSSING_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_STAIRS, GEBlocks.MOSSING_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_WALL, GEBlocks.MOSSING_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_BUTTON, GEBlocks.MOSSING_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE, GEBlocks.MOSSING_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_FENCE, GEBlocks.MOSSING_COBBLESTONE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE, GEBlocks.MOSSING_COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, Blocks.COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE, GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.OVERLY_MOSSY_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_SLAB, GEBlocks.MOSSEND_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_STAIRS, GEBlocks.MOSSEND_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_WALL, GEBlocks.MOSSEND_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_BUTTON, GEBlocks.MOSSEND_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSEND_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_FENCE, GEBlocks.MOSSEND_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSEND_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_SLAB, GEBlocks.MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_STAIRS, GEBlocks.MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_WALL, GEBlocks.MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_BUTTON, GEBlocks.MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_FENCE, GEBlocks.MOSSY_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSY_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_SLAB, GEBlocks.MOSSING_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_STAIRS, GEBlocks.MOSSING_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_WALL, GEBlocks.MOSSING_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_BUTTON, GEBlocks.MOSSING_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE, GEBlocks.MOSSING_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_FENCE, GEBlocks.MOSSING_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE, GEBlocks.MOSSING_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, Blocks.DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE, GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_STAIRS, Items.DIAMOND, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_SLAB, Items.DIAMOND, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_WALL, Items.DIAMOND, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_BUTTON, Items.DIAMOND, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_PRESSURE_PLATE, Items.DIAMOND, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_FENCE, Items.DIAMOND, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.DIAMOND_FENCE_GATE, Items.DIAMOND, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_STAIRS, Items.IRON_INGOT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_SLAB, Items.IRON_INGOT, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_WALL, Items.IRON_INGOT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_BUTTON, Items.IRON_INGOT, 1);
        //offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_PRESSURE_PLATE, Items.IRON_INGOT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_FENCE, Items.DIAMOND, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.IRON_FENCE_GATE, Items.DIAMOND, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_STAIRS, Items.IRON_INGOT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_SLAB, Items.IRON_INGOT, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_WALL, Items.IRON_INGOT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_BUTTON, Items.IRON_INGOT, 1);
        //offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_PRESSURE_PLATE, Items.DIAMOND, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_FENCE, Items.IRON_INGOT, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, GEBlocks.GOLD_FENCE_GATE, Items.IRON_INGOT, 1);






        /*ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE)
                .input(Items.COBBLESTONE)
                .input(Items.VINE)
                .criterion(FabricRecipeProvider.hasItem(Items.COBBLESTONE),FabricRecipeProvider.hasItem(Items.VINE),
                FabricRecipeProvider
                        .conditionsFromItem(Items.COBBLESTONE,1 Items.VINE))
                .criterion(FabricRecipeProvider
                                .hasItem(Items.COBBLESTONE),
                FabricRecipeProvider.conditionsFromItem(SIMPLE_BLOCK))
                .offerTo(exporter);*/

        /*List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, GEBlocks.PINK_GARNET_ORE,
                MBlocks.PINK_GARNET_DEEPSLATE_ORE);

        offerSmelting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
        offerBlasting(exporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, GEBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, GEBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(GEBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(GEBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(GEBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 32)
                .input(GEBlocks.MAGIC_BLOCK)
                .criterion(hasItem(GEBlocks.MAGIC_BLOCK), conditionsFromItem(GEBlocks.MAGIC_BLOCK))
                .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "raw_pink_garnet_from_magic_block"));

        offerSmithingTrimRecipe(exporter, ModItems.KAUPEN_SMITHING_TEMPLATE, Identifier.of(TutorialMod.MOD_ID, "kaupen"));*/

    }
}