package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.thenu.ge.GE;
import net.thenu.ge.block.GEBlocks;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.ge.block.customBlockFiles.RedstoneLampBlock;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.HelperLists;

public class BlockModels extends FabricModelProvider {

    public BlockModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        // Usually handled automatically for blocks
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator builder) {
        for (BlockFamily family :
                HelperLists.getAllMossyCobblestoneBlocks()) {builder.registerCubeAllModelTexturePool(family.base()).stairs(family.stairs()).slab(family.slab()).wall(family.wall()).fence(family.fence()).fenceGate(family.fenceGate());}
        for (BlockFamily family :
                HelperLists.getAllMossyDeepslateBlocks()) {builder.registerCubeAllModelTexturePool(family.base()).stairs(family.stairs()).slab(family.slab()).wall(family.wall()).fence(family.fence()).fenceGate(family.fenceGate());}
        for (BlockFamily family :
                HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks()) {builder.registerCubeAllModelTexturePool(family.base()).stairs(family.stairs()).slab(family.slab()).wall(family.wall()).fence(family.fence()).fenceGate(family.fenceGate());}
        for (BlockFamily family :
                HelperLists.getAllAmethystBlocks()) {builder.registerCubeAllModelTexturePool(family.base()).stairs(family.stairs()).slab(family.slab()).wall(family.wall()).fence(family.fence()).fenceGate(family.fenceGate());}

        //Amethyst Lamp
        Identifier litModelCircularAmethyst = Models.CUBE_ALL.upload(AmethystBlocks.CIRCULAR_AMETHYST_LAMP, "_on", TextureMap.all(Identifier.of(GE.MOD_ID, "block/circular_amethyst_lamp_on")), builder.modelCollector);
        Identifier offModelCircularAmethyst = Models.CUBE_ALL.upload(AmethystBlocks.CIRCULAR_AMETHYST_LAMP, "_off", TextureMap.all(Identifier.of(GE.MOD_ID, "block/circular_amethyst_lamp_off")), builder.modelCollector);
        builder.blockStateCollector.accept(VariantsBlockStateSupplier.create(AmethystBlocks.CIRCULAR_AMETHYST_LAMP).coordinate(BlockStateVariantMap.create(RedstoneLampBlock.LIT).register(true,  BlockStateVariant.create().put(VariantSettings.MODEL, litModelCircularAmethyst)).register(false, BlockStateVariant.create().put(VariantSettings.MODEL, offModelCircularAmethyst))));
        builder.registerParentedItemModel(AmethystBlocks.CIRCULAR_AMETHYST_LAMP, offModelCircularAmethyst);
        Identifier litModelCrossedAmethyst = Models.CUBE_ALL.upload(AmethystBlocks.CROSSED_AMETHYST_LAMP, "_on", TextureMap.all(Identifier.of(GE.MOD_ID, "block/crossed_amethyst_lamp_on")), builder.modelCollector);
        Identifier offModelCrossedAmethyst = Models.CUBE_ALL.upload(AmethystBlocks.CROSSED_AMETHYST_LAMP, "_off", TextureMap.all(Identifier.of(GE.MOD_ID, "block/crossed_amethyst_lamp_off")), builder.modelCollector);
        builder.blockStateCollector.accept(VariantsBlockStateSupplier.create(AmethystBlocks.CROSSED_AMETHYST_LAMP).coordinate(BlockStateVariantMap.create(RedstoneLampBlock.LIT).register(true,  BlockStateVariant.create().put(VariantSettings.MODEL, litModelCrossedAmethyst)).register(false, BlockStateVariant.create().put(VariantSettings.MODEL, offModelCrossedAmethyst))));
        builder.registerParentedItemModel(AmethystBlocks.CROSSED_AMETHYST_LAMP, offModelCrossedAmethyst);


        {Identifier id = Identifier.of(GE.MOD_ID, "block/arcane_crystal_block");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.ARCANE_CRYSTAL_BLOCK, id));builder.registerParentedItemModel(GEBlocks.ARCANE_CRYSTAL_BLOCK, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/runestone_bricks");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.RUNESTONE_BRICKS, id));builder.registerParentedItemModel(GEBlocks.RUNESTONE_BRICKS, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/stardust_tiles");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.STARDUST_TILES, id));builder.registerParentedItemModel(GEBlocks.STARDUST_TILES, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/riveted_iron_plate");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.RIVETED_IRON_PLATE, id));builder.registerParentedItemModel(GEBlocks.RIVETED_IRON_PLATE, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/copper_pipe_bundle");builder.blockStateCollector.accept(VariantsBlockStateSupplier.create(GEBlocks.COPPER_PIPE_BUNDLE).coordinate(BlockStateVariantMap.create(Properties.AXIS).register(Direction.Axis.Y, BlockStateVariant.create().put(VariantSettings.MODEL, id)).register(Direction.Axis.Z, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R90)).register(Direction.Axis.X, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R90))));builder.registerParentedItemModel(GEBlocks.COPPER_PIPE_BUNDLE, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/tarnished_brass_block");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.TARNISHED_BRASS_BLOCK, id));builder.registerParentedItemModel(GEBlocks.TARNISHED_BRASS_BLOCK, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/mossy_petal_stone");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.MOSSY_PETAL_STONE, id));builder.registerParentedItemModel(GEBlocks.MOSSY_PETAL_STONE, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/overgrown_ruins");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.OVERGROWN_RUINS, id));builder.registerParentedItemModel(GEBlocks.OVERGROWN_RUINS, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/petrified_log");builder.blockStateCollector.accept(VariantsBlockStateSupplier.create(GEBlocks.PETRIFIED_LOG).coordinate(BlockStateVariantMap.create(Properties.AXIS).register(Direction.Axis.Y, BlockStateVariant.create().put(VariantSettings.MODEL, id)).register(Direction.Axis.Z, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R90)).register(Direction.Axis.X, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R90))));builder.registerParentedItemModel(GEBlocks.PETRIFIED_LOG, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/soul_obsidian_bricks");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.SOUL_OBSIDIAN_BRICKS, id));builder.registerParentedItemModel(GEBlocks.SOUL_OBSIDIAN_BRICKS, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/bone_carved_stone");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.BONE_CARVED_STONE, id));builder.registerParentedItemModel(GEBlocks.BONE_CARVED_STONE, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/void_blackstone_tiles");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.VOID_BLACKSTONE_TILES, id));builder.registerParentedItemModel(GEBlocks.VOID_BLACKSTONE_TILES, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/neon_grid_panel");builder.blockStateCollector.accept(VariantsBlockStateSupplier.create(GEBlocks.NEON_GRID_PANEL).coordinate(BlockStateVariantMap.create(Properties.FACING).register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, id)).register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(Direction.UP, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R270)).register(Direction.DOWN, BlockStateVariant.create().put(VariantSettings.MODEL, id).put(VariantSettings.X, VariantSettings.Rotation.R90))));builder.registerParentedItemModel(GEBlocks.NEON_GRID_PANEL, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/holo_glass");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.HOLO_GLASS, id));builder.registerParentedItemModel(GEBlocks.HOLO_GLASS, id);}{Identifier id = Identifier.of(GE.MOD_ID, "block/durasteel_plating");builder.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(GEBlocks.DURASTEEL_PLATING, id));builder.registerParentedItemModel(GEBlocks.DURASTEEL_PLATING, id);}}

}