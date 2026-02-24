package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class datagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(GEModelProvider::new);
        pack.addProvider(GERecipeProvider::new);
        pack.addProvider(GETagProvider::new);
        pack.addProvider(GELootTableProvider::new);
        pack.addProvider(GEEnLanguageProvider::new);
}
}
