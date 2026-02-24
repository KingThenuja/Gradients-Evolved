package net.thenu.ge;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GE implements ModInitializer {
    public static final String MOD_ID = "ge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();

        ItemGroup.registerItemGroup();
        GEBlocks.registerModBlocks();
    }
}
