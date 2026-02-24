package net.thenu.utils;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thenu.ge.GE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Registering {

    /**
     Deferred Registering
     **/
    public static List<RegistryObject<? extends Block>> getCreativeBlocks() {return CREATIVE_BLOCKS;}
    private static final List<RegistryObject<? extends Block>> CREATIVE_BLOCKS = new ArrayList<>();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GE.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GE.MOD_ID);

    /**
     Register
     */
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier) {RegistryObject<T> block = BLOCKS.register(name, supplier);ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));CREATIVE_BLOCKS.add(block);return block;}
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));}

}
