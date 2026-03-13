package net.thenu.utils.BlockFamily;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thenu.utils.Registries.ItemGroupRegistry;

import java.util.function.Supplier;

public class BlockFamilyBuilder {

    private final String modId;
    private final BlockFamilyDefinition definition;
    private final DeferredRegister<Block> blockRegister;
    private final DeferredRegister<Item> itemRegister;

    public BlockFamilyBuilder(String modId, BlockFamilyDefinition definition,
                              DeferredRegister<Block> blockRegister,
                              DeferredRegister<Item> itemRegister) {
        this.modId = modId;
        this.definition = definition;
        this.blockRegister = blockRegister;
        this.itemRegister = itemRegister;
    }

    public BlockFamily build() {
        String name = definition.name();
        BlockBehaviour.Properties baseProps = definition.properties();

        RegistryObject<Block> base      = register(name,                 () -> new Block(baseProps));
        RegistryObject<Block> stairs = register(name + "_stairs", () -> new StairBlock(base.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(base.get())));RegistryObject<Block> slab      = register(name + "_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(base.get())));
        RegistryObject<Block> fence     = register(name + "_fence",      () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(base.get())));
        RegistryObject<Block> fenceGate = register(name + "_fence_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(base.get())));
        RegistryObject<Block> wall      = register(name + "_wall",       () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(base.get())));

        return new BlockFamily(base, slab, stairs, wall, fence, fenceGate);
    }

    private RegistryObject<Block> register(String name, Supplier<Block> supplier) {
        RegistryObject<Block> block = blockRegister.register(name, supplier);
        itemRegister.register(name, () -> {
            BlockItem item = new BlockItem(block.get(), new Item.Properties());
            ItemGroupRegistry.add(item);
            return item;
        });
        return block;
    }
}