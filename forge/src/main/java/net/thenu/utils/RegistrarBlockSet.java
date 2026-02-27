package net.thenu.utils;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

import static net.thenu.utils.Registering.registerBlock;

public class RegistrarBlockSet {

    public final RegistryObject<Block> block;
    public final RegistryObject<StairBlock> stairs;
    public final RegistryObject<SlabBlock> slab;
    public final RegistryObject<WallBlock> wall;
    public final RegistryObject<FenceBlock> fence;
    public final RegistryObject<FenceGateBlock> fenceGate;
    /*public final RegistryObject<DoorBlock> door;
    public final RegistryObject<TrapDoorBlock> trapdoor;
*/
    public RegistrarBlockSet(
            RegistryObject<Block> block,
            RegistryObject<StairBlock> stairs,
            RegistryObject<SlabBlock> slab,
            RegistryObject<WallBlock> wall,
            RegistryObject<FenceBlock> fence,
            RegistryObject<FenceGateBlock> fenceGate
           /* RegistryObject<DoorBlock> door,
            RegistryObject<TrapDoorBlock> trapdoor*/ ){

        this.block = block;
        this.stairs = stairs;
        this.slab = slab;
        this.wall = wall;
        this.fence = fence;
        this.fenceGate = fenceGate;
        /*this.door = door;
        this.trapdoor = trapdoor;*/
    }

    public static RegistrarBlockSet blockSet(String name, BlockBehaviour.Properties props) {

        RegistryObject<Block> block =
                registerBlock(name, () -> new Block(props));

        RegistryObject<StairBlock> stairs =
                registerBlock(name + "_stairs",
                        () -> new StairBlock(
                                block.get().defaultBlockState(),
                                BlockBehaviour.Properties.ofFullCopy(block.get())
                        ));

        RegistryObject<SlabBlock> slab =
                registerBlock(name + "_slab",
                        () -> new SlabBlock(
                                BlockBehaviour.Properties.ofFullCopy(block.get())
                        ));

        RegistryObject<WallBlock> wall =
                registerBlock(name + "_wall",
                        () -> new WallBlock(
                                BlockBehaviour.Properties.ofFullCopy(block.get())
                        ));

        RegistryObject<FenceBlock> fence =
                registerBlock(name + "_fence",
                        () -> new FenceBlock(
                                BlockBehaviour.Properties.ofFullCopy(block.get())
                        ));

        RegistryObject<FenceGateBlock> fenceGate =
                registerBlock(name + "_fence_gate",
                        () -> new FenceGateBlock(
                                WoodType.OAK,
                                BlockBehaviour.Properties.ofFullCopy(block.get())
                        ));

        /*RegistryObject<DoorBlock> door =
            registerBlock(name + "_door",
                () -> new DoorBlock(
                    BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(block.get())
                ));

         RegistryObject<TrapDoorBlock> trapdoor =
            registerBlock(name + "_trapdoor",
                () -> new TrapDoorBlock(
                        BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(block.get())
                ));*/

        return new RegistrarBlockSet(block, stairs, slab, wall, fence, fenceGate /*door, trapdoor*/);
    }
}
