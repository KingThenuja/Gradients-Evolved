package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GEEnLanguageProvider extends FabricLanguageProvider {
    public GEEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemgroup.ge.ge_blocks_tab", "Gradients Evolved Blocks Tab");

        //Cobblestone
        translationBuilder.add("block.ge.slightly_mossy_cobblestone", "Slightly Mossy Cobblestone");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_stairs", "Slightly Mossy Cobblestone Stairs");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_slab", "Slightly Mossy Cobblestone Slab");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_button", "Slightly Mossy Cobblestone Button");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_fence", "Slightly Mossy Cobblestone Fence");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_fence_gate", "Slightly Mossy Cobblestone Fence Gate");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_wall", "Slightly Mossy Cobblestone Wall");
        translationBuilder.add("block.ge.slightly_mossy_cobblestone_pressure_plate", "Slightly Mossy Cobblestone Pressure Plate");

        translationBuilder.add("block.ge.overly_mossy_cobblestone", "Overly Mossy Cobblestone");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_stairs", "Overly Mossy Cobblestone Stairs");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_slab", "Overly Mossy Cobblestone Slab");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_button", "Overly Mossy Cobblestone Button");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_fence", "Overly Mossy Cobblestone Fence");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_fence_gate", "Overly Mossy Cobblestone Fence Gate");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_wall", "Overly Mossy Cobblestone Wall");
        translationBuilder.add("block.ge.overly_mossy_cobblestone_pressure_plate", "Overly Mossy Cobblestone Pressure Plate");

        translationBuilder.add("block.ge.mossend_cobblestone", "Mossend Cobblestone");
        translationBuilder.add("block.ge.mossend_cobblestone_stairs", "Mossend Cobblestone Stairs");
        translationBuilder.add("block.ge.mossend_cobblestone_slab", "Mossend Cobblestone Slab");
        translationBuilder.add("block.ge.mossend_cobblestone_button", "Mossend Cobblestone Button");
        translationBuilder.add("block.ge.mossend_cobblestone_fence", "Mossend Cobblestone Fence");
        translationBuilder.add("block.ge.mossend_cobblestone_fence_gate", "Mossend Cobblestone Fence Gate");
        translationBuilder.add("block.ge.mossend_cobblestone_wall", "Mossend Cobblestone Wall");
        translationBuilder.add("block.ge.mossend_cobblestone_pressure_plate", "Mossend Cobblestone Pressure Plate");

        translationBuilder.add("block.ge.mossing_cobblestone", "Mossing Cobblestone");
        translationBuilder.add("block.ge.mossing_cobblestone_stairs", "Mossing Cobblestone Stairs");
        translationBuilder.add("block.ge.mossing_cobblestone_slab", "Mossing Cobblestone Slab");
        translationBuilder.add("block.ge.mossing_cobblestone_button", "Mossing Cobblestone Button");
        translationBuilder.add("block.ge.mossing_cobblestone_fence", "Mossing Cobblestone Fence");
        translationBuilder.add("block.ge.mossing_cobblestone_fence_gate", "Mossing Cobblestone Fence Gate");
        translationBuilder.add("block.ge.mossing_cobblestone_wall", "Mossing Cobblestone Wall");
        translationBuilder.add("block.ge.mossing_cobblestone_pressure_plate", "Mossing Cobblestone Pressure Plate");

        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone", "Fully Covered Mossy Cobblestone");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_stairs", "Fully Covered Mossy Cobblestone Stairs");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_slab", "Fully Covered Mossy Cobblestone Slab");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_button", "Fully Covered Mossy Cobblestone Button");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_fence", "Fully Covered Mossy Cobblestone Fence");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_fence_gate", "Fully Covered Mossy Cobblestone Fence Gate");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_wall", "Fully Covered Mossy Cobblestone Wall");
        translationBuilder.add("block.ge.fully_covered_mossy_cobblestone_pressure_plate", "Fully Covered Mossy Cobblestone Pressure Plate");

        //Deepslate
        translationBuilder.add("block.ge.slightly_mossy_deepslate", "Slightly Mossy Deepslate");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_stairs", "Slightly Mossy Deepslate Stairs");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_slab", "Slightly Mossy Deepslate Slab");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_button", "Slightly Mossy Deepslate Button");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_fence", "Slightly Mossy Deepslate Fence");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_fence_gate", "Slightly Mossy Deepslate Fence Gate");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_wall", "Slightly Mossy Deepslate Wall");
        translationBuilder.add("block.ge.slightly_mossy_deepslate_pressure_plate", "Slightly Mossy Deepslate Pressure Plate");

        translationBuilder.add("block.ge.overly_mossy_deepslate", "Overly Mossy Deepslate");
        translationBuilder.add("block.ge.overly_mossy_deepslate_stairs", "Overly Mossy Deepslate Stairs");
        translationBuilder.add("block.ge.overly_mossy_deepslate_slab", "Overly Mossy Deepslate Slab");
        translationBuilder.add("block.ge.overly_mossy_deepslate_button", "Overly Mossy Deepslate Button");
        translationBuilder.add("block.ge.overly_mossy_deepslate_fence", "Overly Mossy Deepslate Fence");
        translationBuilder.add("block.ge.overly_mossy_deepslate_fence_gate", "Overly Mossy Deepslate Fence Gate");
        translationBuilder.add("block.ge.overly_mossy_deepslate_wall", "Overly Mossy Deepslate Wall");
        translationBuilder.add("block.ge.overly_mossy_deepslate_pressure_plate", "Overly Mossy Deepslate Pressure Plate");

        translationBuilder.add("block.ge.mossend_deepslate", "Mossend Deepslate");
        translationBuilder.add("block.ge.mossend_deepslate_stairs", "Mossend Deepslate Stairs");
        translationBuilder.add("block.ge.mossend_deepslate_slab", "Mossend Deepslate Slab");
        translationBuilder.add("block.ge.mossend_deepslate_button", "Mossend Deepslate Button");
        translationBuilder.add("block.ge.mossend_deepslate_fence", "Mossend Deepslate Fence");
        translationBuilder.add("block.ge.mossend_deepslate_fence_gate", "Mossend Deepslate Fence Gate");
        translationBuilder.add("block.ge.mossend_deepslate_wall", "Mossend Deepslate Wall");
        translationBuilder.add("block.ge.mossend_deepslate_pressure_plate", "Mossend Deepslate Pressure Plate");

        translationBuilder.add("block.ge.mossing_deepslate", "Mossing Deepslate");
        translationBuilder.add("block.ge.mossing_deepslate_stairs", "Mossing Deepslate Stairs");
        translationBuilder.add("block.ge.mossing_deepslate_slab", "Mossing Deepslate Slab");
        translationBuilder.add("block.ge.mossing_deepslate_button", "Mossing Deepslate Button");
        translationBuilder.add("block.ge.mossing_deepslate_fence", "Mossing Deepslate Fence");
        translationBuilder.add("block.ge.mossing_deepslate_fence_gate", "Mossing Deepslate Fence Gate");
        translationBuilder.add("block.ge.mossing_deepslate_wall", "Mossing Deepslate Wall");
        translationBuilder.add("block.ge.mossing_deepslate_pressure_plate", "Mossing Deepslate Pressure Plate");

        translationBuilder.add("block.ge.fully_covered_mossy_deepslate", "Fully Covered Mossy Deepslate");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_stairs", "Fully Covered Mossy Deepslate Stairs");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_slab", "Fully Covered Mossy Deepslate Slab");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_button", "Fully Covered Mossy Deepslate Button");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_fence", "Fully Covered Mossy Deepslate Fence");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_fence_gate", "Fully Covered Mossy Deepslate Fence Gate");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_wall", "Fully Covered Mossy Deepslate Wall");
        translationBuilder.add("block.ge.fully_covered_mossy_deepslate_pressure_plate", "Fully Covered Mossy Deepslate Pressure Plate");

        translationBuilder.add("block.ge.mossy_deepslate", "Mossy Deepslate");
        translationBuilder.add("block.ge.mossy_deepslate_stairs", "Mossy Deepslate Stairs");
        translationBuilder.add("block.ge.mossy_deepslate_slab", "Mossy Deepslate Slab");
        translationBuilder.add("block.ge.mossy_deepslate_button", "Mossy Deepslate Button");
        translationBuilder.add("block.ge.mossy_deepslate_fence", "Mossy Deepslate Fence");
        translationBuilder.add("block.ge.mossy_deepslate_fence_gate", "Mossy Deepslate Fence Gate");
        translationBuilder.add("block.ge.mossy_deepslate_wall", "Mossy Deepslate Wall");
        translationBuilder.add("block.ge.mossy_deepslate_pressure_plate", "Mossy Deepslate Pressure Plate");

        translationBuilder.add("block.ge.diamond_stairs", "Diamond Stairs");
        translationBuilder.add("block.ge.diamond_slab", "Diamond Slab");
        translationBuilder.add("block.ge.diamond_button", "Diamond Button");
        translationBuilder.add("block.ge.diamond_pressure_plate", "Diamond Pressure Plate");
        translationBuilder.add("block.ge.diamond_fence", "Diamond Fence");
        translationBuilder.add("block.ge.diamond_fence_gate", "Diamond Fence Gate");
        translationBuilder.add("block.ge.diamond_wall", "Diamond Wall");

        translationBuilder.add("block.ge.iron_stairs", "Iron Stairs");
        translationBuilder.add("block.ge.iron_slab", "Iron Slab");
        translationBuilder.add("block.ge.iron_button", "Iron Button");
        translationBuilder.add("block.ge.iron_fence", "Iron Fence");
        translationBuilder.add("block.ge.iron_fence_gate", "Iron Fence Gate");
        translationBuilder.add("block.ge.iron_wall", "Iron Wall");

        translationBuilder.add("block.ge.gold_stairs", "Gold Stairs");
        translationBuilder.add("block.ge.gold_slab", "Gold Slab");
        translationBuilder.add("block.ge.gold_button", "Gold Button");
        translationBuilder.add("block.ge.gold_fence", "Gold Fence");
        translationBuilder.add("block.ge.gold_fence_gate", "Gold Fence Gate");
        translationBuilder.add("block.ge.gold_wall", "Gold Wall");

        translationBuilder.add("block.ge.emerald_stairs", "Emerald Stairs");
        translationBuilder.add("block.ge.emerald_slab", "Emerald Slab");
        translationBuilder.add("block.ge.emerald_button", "Emerald Button");
        translationBuilder.add("block.ge.emerald_pressure_plate", "Emerald Pressure Plate");
        translationBuilder.add("block.ge.emerald_fence", "Emerald Fence");
        translationBuilder.add("block.ge.emerald_fence_gate", "Emerald Fence Gate");
        translationBuilder.add("block.ge.emerald_wall", "Emerald Wall");

        translationBuilder.add("block.ge.redstone_stairs", "Redstone Stairs");
        translationBuilder.add("block.ge.redstone_slab", "Redstone Slab");
        translationBuilder.add("block.ge.redstone_button", "Redstone Button");
        translationBuilder.add("block.ge.redstone_pressure_plate", "Redstone Pressure Plate");
        translationBuilder.add("block.ge.redstone_fence", "Redstone Fence");
        translationBuilder.add("block.ge.redstone_fence_gate", "Redstone Fence Gate");
        translationBuilder.add("block.ge.redstone_wall", "Redstone Wall");

        translationBuilder.add("block.ge.lapis_stairs", "Lapis Stairs");
        translationBuilder.add("block.ge.lapis_slab", "Lapis Slab");
        translationBuilder.add("block.ge.lapis_button", "Lapis Button");
        translationBuilder.add("block.ge.lapis_pressure_plate", "Lapis Pressure Plate");
        translationBuilder.add("block.ge.lapis_fence", "Lapis Fence");
        translationBuilder.add("block.ge.lapis_fence_gate", "Lapis Fence Gate");
        translationBuilder.add("block.ge.lapis_wall", "Lapis Wall");

        translationBuilder.add("block.ge.netherite_stairs", "Netherite Stairs");
        translationBuilder.add("block.ge.netherite_slab", "Netherite Slab");
        translationBuilder.add("block.ge.netherite_button", "Netherite Button");
        translationBuilder.add("block.ge.netherite_pressure_plate", "Netherite Pressure Plate");
        translationBuilder.add("block.ge.netherite_fence", "Netherite Fence");
        translationBuilder.add("block.ge.netherite_fence_gate", "Netherite Fence Gate");
        translationBuilder.add("block.ge.netherite_wall", "Netherite Wall");

        translationBuilder.add("block.ge.glowstone_stairs", "Glowstone Stairs");
        translationBuilder.add("block.ge.glowstone_slab", "Glowstone Slab");
        translationBuilder.add("block.ge.glowstone_button", "Glowstone Button");
        translationBuilder.add("block.ge.glowstone_pressure_plate", "Glowstone Pressure Plate");
        translationBuilder.add("block.ge.glowstone_fence", "Glowstone Fence");
        translationBuilder.add("block.ge.glowstone_fence_gate", "Glowstone Fence Gate");
        translationBuilder.add("block.ge.glowstone_wall", "Glowstone Wall");




    }
}