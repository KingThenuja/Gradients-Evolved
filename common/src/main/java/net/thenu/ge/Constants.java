package net.thenu.ge;

import net.thenu.ge.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {
    public static final String MOD_ID = "ge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Constants initializing on {}!", Services.PLATFORM.getPlatformName());
    }
}
