package net.thenu.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.thenu.ge.ModBlocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.item.Items.COBBLESTONE;
import static net.minecraft.world.item.Items.DIAMOND;

public class GERecipeProvider extends RecipeProvider implements IConditionBuilder {
    public GERecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput exporter) {

        new StonecutterRecipe("slightly_mossy_cobblestone", Ingredient.of(COBBLESTONE), new ItemStack(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE));
    }


}