package net.thenu.ge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thenu.ge.block.GEBlocks;

@Mod(Constants.MOD_ID)
public class GE {
    public static final String MOD_ID = "ge";

    public GE() {

        //dont remove .get() its required even though its an error
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GEBlocks.registerModBlocks();

        GEBlocks.BLOCKS.register(eventBus);
        GEBlocks.ITEMS.register(eventBus);
        ItemGroup.TABS.register(eventBus);
    }
}