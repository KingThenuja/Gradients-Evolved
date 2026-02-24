package net.thenu.ge;

import net.thenu.utils.Registering;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thenu.ge.block.GEBlocks;

@Mod.EventBusSubscriber(modid = GE.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroup {


    @SubscribeEvent
    public static void addToTabs(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            Registering.getCreativeBlocks().forEach(event::accept);
        }
    }
}
