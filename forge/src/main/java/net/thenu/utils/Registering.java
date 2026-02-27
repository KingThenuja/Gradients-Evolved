package net.thenu.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thenu.ge.GE;
import org.intellij.lang.annotations.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Registering {

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        TABS.register(eventBus);
    }

    /**
     Deferred Registering
     **/
    public static List<RegistryObject<? extends Block>> getCreativeBlocks() {return CREATIVE_BLOCKS;}
    private static final List<RegistryObject<? extends Block>> CREATIVE_BLOCKS = new ArrayList<>();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GE.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GE.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GE.MOD_ID);

    /**
     Register
     */
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blockSupplier){RegistryObject<T> block = BLOCKS.register(name, blockSupplier);ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));return block;}
    public static final ResourceKey<CreativeModeTab> GE_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(GE.MOD_ID, "ge_tab"));


}
