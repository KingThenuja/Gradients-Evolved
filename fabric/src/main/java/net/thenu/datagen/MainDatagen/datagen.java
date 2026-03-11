package net.thenu.datagen.MainDatagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.thenu.datagen.*;

public class datagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockModels::new);
        pack.addProvider(RawModels::new);
        pack.addProvider(Recipe::new);
        pack.addProvider(Tag::new);
        pack.addProvider(BlockDrop::new);
        pack.addProvider(EnLanguage::new);
}
}
