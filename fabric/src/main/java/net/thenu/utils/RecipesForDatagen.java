package net.thenu.utils;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class RecipesForDatagen {
    public static void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createFenceRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createFenceGateRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
    public static void offerButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3)
                .group("button")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
}
