package net.thenu.utils;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Registering {
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of("ge", name), block);}
    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM, Identifier.of(
                        "ge", name), new BlockItem(block, new Item.Settings()));}

}
