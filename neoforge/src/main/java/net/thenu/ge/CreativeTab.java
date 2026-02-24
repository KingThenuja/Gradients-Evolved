package net.thenu.ge;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GE.MOD_ID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GE_BLOCK_TAB =
            CREATIVE_MODE_TAB.register("ge_blocks_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.ge.ge_blocks"))
                            .icon(() -> new ItemStack(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get()))
                            .displayItems((params, output) -> {
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_DOOR);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS);
output.accept(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);

                    }).build());


public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB.register(eventBus);
}}
