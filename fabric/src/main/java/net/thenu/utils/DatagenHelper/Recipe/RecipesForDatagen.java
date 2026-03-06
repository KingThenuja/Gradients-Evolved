package net.thenu.utils.DatagenHelper.Recipe;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.thenu.utils.BlockFamily.BlockFamily;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class RecipesForDatagen {
    public static void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createFenceRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createFenceGateRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .input(input)
                .group("button")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerFamilyRecipes(RecipeExporter exporter, BlockFamily family, ItemConvertible ingredient) {
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.slab(), ingredient);
        offerStairsRecipe(exporter, family.stairs(), ingredient);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.wall(), ingredient);
        offerFenceRecipe(exporter, family.fence(), ingredient);
        offerFenceGateRecipe(exporter, family.fenceGate(), ingredient);
    }

    public static void offerFamilyStonecutting(RecipeExporter exporter, BlockFamily family, ItemConvertible ingredient) {
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.slab(), ingredient, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.stairs(), ingredient, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.wall(), ingredient, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.fence(), ingredient, 3);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.fenceGate(), ingredient, 1);
    }
}
