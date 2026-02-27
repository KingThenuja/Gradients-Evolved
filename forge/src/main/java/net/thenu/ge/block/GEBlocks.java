package net.thenu.ge.block;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegistryObject;
import net.thenu.utils.RegistrarBlockSet;

import static net.thenu.utils.Registering.*;
import static net.thenu.utils.RegistrarBlockSet.blockSet;

public class GEBlocks {
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        TABS.register(eventBus);

        eventBus.addListener(GEBlocks::addToCreativeTab);}

    @SubscribeEvent
    public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {BLOCKS.getEntries().forEach(block -> {event.accept(block.get());});}
        if (event.getTabKey().equals(GE_TAB_KEY)) {BLOCKS.getEntries().forEach(block -> event.accept(block.get()));}
}
    public static final RegistrarBlockSet SLIGHTLY_MOSSY_COBBLESTONE =
            blockSet("slightly_mossy_cobblestone",
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .strength(1.5f, 6.0f)
                            .sound(SoundType.STONE)
            );

}

