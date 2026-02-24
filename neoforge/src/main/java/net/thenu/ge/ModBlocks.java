package net.thenu.ge;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thenu.utils.Items;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GE.MOD_ID);
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static final DeferredBlock<Block> SLIGHTLY_MOSSY_COBBLESTONE =
            registerBlock("slightly_mossy_cobblestone", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<StairBlock> SLIGHTLY_MOSSY_COBBLESTONE_STAIRS
            = registerBlock("slightly_mossy_cobblestone_stairs", () -> new StairBlock
                    (ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> SLIGHTLY_MOSSY_COBBLESTONE_SLAB
            = registerBlock("slightly_mossy_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE
            = registerBlock("slightly_mossy_cobblestone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> SLIGHTLY_MOSSY_COBBLESTONE_BUTTON
            = registerBlock("slightly_mossy_cobblestone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> SLIGHTLY_MOSSY_COBBLESTONE_FENCE
            = registerBlock("slightly_mossy_cobblestone_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE
            = registerBlock("slightly_mossy_cobblestone_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> SLIGHTLY_MOSSY_COBBLESTONE_WALL
            = registerBlock("slightly_mossy_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<DoorBlock> SLIGHTLY_MOSSY_COBBLESTONE_DOOR
            = registerBlock("slightly_mossy_cobblestone_door", () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> SLIGHTLY_MOSSY_COBBLESTONE_TRAPDOOR
            = registerBlock("slightly_mossy_cobblestone_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noOcclusion()));



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
