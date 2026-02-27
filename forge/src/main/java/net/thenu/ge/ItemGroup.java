package net.thenu.ge;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.thenu.utils.Registering;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thenu.ge.block.GEBlocks;
import net.thenu.utils.RegistrarBlockSet;

import java.util.List;

import static net.thenu.utils.Registering.TABS;

@Mod.EventBusSubscriber(modid = GE.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroup {


    public static final RegistryObject<CreativeModeTab> GE_TAB =
            TABS.register("ge_tab", () ->
                    CreativeModeTab.builder()
                            .title(Component.literal("Gradient Evolved's Block Tab"))
                            .icon(() -> new ItemStack(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.block.get()))
                            .displayItems((parameters, output) -> {
                                Registering.BLOCKS.getEntries().forEach(block -> {
                                    output.accept(block.get());
                                });
                            })
                            .build()
            );
}
