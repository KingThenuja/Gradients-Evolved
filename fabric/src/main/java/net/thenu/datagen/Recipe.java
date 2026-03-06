package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.HelperLists;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.thenu.utils.DatagenHelper.Recipe.RecipesForDatagen.*;

public class Recipe extends FabricRecipeProvider {
    public Recipe(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Material blocks (diamond, iron, gold, etc.)
        for (Map.Entry<BlockFamily, ItemConvertible> entry : HelperLists.getMaterialFamilyIngredients().entrySet()) {
            BlockFamily family = entry.getKey();
            ItemConvertible ingredient = entry.getValue();
            offerFamilyRecipes(exporter, family, ingredient);
            offerFamilyStonecutting(exporter, family, ingredient);
        }
        // Mossy Cobblestone — ingredient is the base block of each family
        for (BlockFamily family : HelperLists.getAllMossyCobblestoneBlocks()) {
            offerFamilyRecipes(exporter, family, family.base());
            offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.base(), Blocks.COBBLESTONE, 1);
            offerFamilyStonecutting(exporter, family, family.base());
        }

        // Mossy Deepslate
        for (BlockFamily family : HelperLists.getAllMossyDeepslateBlocks()) {
            offerFamilyRecipes(exporter, family, family.base());
            offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.base(), Blocks.DEEPSLATE, 1);
            offerFamilyStonecutting(exporter, family, family.base());
        }

        // Amethyst
        for (BlockFamily family : HelperLists.getAllAmethystBlocks()) {
            offerFamilyRecipes(exporter, family, family.base());
            offerStonecuttingRecipe(exporter, RecipeCategory.MISC, family.base(), Blocks.AMETHYST_BLOCK, 1);
            offerFamilyStonecutting(exporter, family, family.base());}
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, AmethystBlocks.CROSSED_AMETHYST_LAMP).pattern(" A ").pattern("AGA").pattern(" A ").input('A', Items.AMETHYST_SHARD).input('G', Items.GLOWSTONE).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, AmethystBlocks.CIRCULAR_AMETHYST_LAMP).pattern("AAA").pattern("AGA").pattern("AAA").input('A', Items.AMETHYST_SHARD).input('G', Items.GLOWSTONE).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter);



    }
}