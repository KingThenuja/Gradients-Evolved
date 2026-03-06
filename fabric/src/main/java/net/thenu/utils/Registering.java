package net.thenu.utils;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenu.utils.Registries.ItemGroupRegistry;

public class Registering {
    public Block registerBlock(String modId, String name, Block block) {
        Identifier id = Identifier.of(modId, name);

        Registry.register(Registries.BLOCK, id, block);

        BlockItem item = Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(block, new Item.Settings())
        );
        ItemGroupRegistry.add(item); // <-- this was missing

        return block;
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM, Identifier.of(
                        "ge", name), new BlockItem(block, new Item.Settings()));}

}
