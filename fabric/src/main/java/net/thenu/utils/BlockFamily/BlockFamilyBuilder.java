package net.thenu.utils.BlockFamily;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.thenu.utils.Registries.ItemGroupRegistry;

public class BlockFamilyBuilder {

    private final String modId;
    private final BlockFamilyDefinition definition;

    public BlockFamilyBuilder(String modId, BlockFamilyDefinition definition) {
        this.modId = modId;
        this.definition = definition;
    }

    public BlockFamily build() {
        String name = definition.name();
        AbstractBlock.Settings baseSettings = definition.settings();

        Block base      = registerBlock(modId, name, new Block(baseSettings));
        Block stairs    = registerBlock(modId, name + "_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
        Block slab      = registerBlock(modId, name + "_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
        Block fence     = registerBlock(modId, name + "_fence", new FenceBlock(AbstractBlock.Settings.copy(base)));
        Block fenceGate = registerBlock(modId, name + "_fence_gate", new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(base)));
        Block wall      = registerBlock(modId, name + "_wall", new WallBlock(AbstractBlock.Settings.copy(base)));

        return new BlockFamily(base, slab, stairs, wall, fence, fenceGate);
    }

    private Block registerBlock(String modId, String name, Block block) {
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
}