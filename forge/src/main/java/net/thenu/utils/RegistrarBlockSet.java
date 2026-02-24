package net.thenu.utils;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

public class RegistrarBlockSet {
    public final RegistryObject<Block> block;
    public final RegistryObject<StairBlock> stairs;
    public final RegistryObject<SlabBlock> slab;
    public final RegistryObject<WallBlock> wall;
    public final RegistryObject<FenceBlock> fence;
    public final RegistryObject<FenceGateBlock> fenceGate;
    public final RegistryObject<ButtonBlock> button;
    public final RegistryObject<PressurePlateBlock> pressurePlate;
    public final RegistryObject<DoorBlock> door;
    public final RegistryObject<TrapDoorBlock> trapdoor;

    public RegistrarBlockSet(String name,
                    BlockBehaviour.Properties properties,
                    BlockSetType setType,
                    WoodType woodType) {

        block = Registering.registerBlock(name,
                () -> new Block(properties));

        stairs = Registering.registerBlock(name + "_stairs",
                () -> new StairBlock(block.get().defaultBlockState(), properties));

        slab = Registering.registerBlock(name + "_slab",
                () -> new SlabBlock(properties));

        wall = Registering.registerBlock(name + "_wall",
                () -> new WallBlock(properties));

        fence = Registering.registerBlock(name + "_fence",
                () -> new FenceBlock(properties));

        fenceGate = Registering.registerBlock(name + "_fence_gate",
                () -> new FenceGateBlock(woodType, properties));

        button = Registering.registerBlock(name + "_button",
                () -> new ButtonBlock(setType, 20, properties.noCollission()));

        pressurePlate = Registering.registerBlock(name + "_pressure_plate",
                () -> new PressurePlateBlock(setType, properties));

        door = Registering.registerBlock(name + "_door",
                () -> new DoorBlock(setType, properties.noOcclusion()));

        trapdoor = Registering.registerBlock(name + "_trapdoor",
                () -> new TrapDoorBlock(setType, properties.noOcclusion()));
    }
}
