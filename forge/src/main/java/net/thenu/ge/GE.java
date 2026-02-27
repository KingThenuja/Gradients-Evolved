package net.thenu.ge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thenu.ge.block.GEBlocks;
import net.thenu.utils.Registering;

@Mod(GE.MOD_ID)
public class GE {

    public static final String MOD_ID = "ge";

    public GE() {

        IEventBus modEventBus =
                FMLJavaModLoadingContext.get().getModEventBus();

        GEBlocks.register(modEventBus);

        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }
}