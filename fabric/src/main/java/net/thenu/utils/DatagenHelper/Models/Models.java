package net.thenu.utils.DatagenHelper.Models;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.thenu.ge.GE;

import java.util.Optional;

public class Models {
    private void simpleCubeState(BlockStateModelGenerator gen, Block block, String name) {
        Identifier modelId = blockModelId(name);
        gen.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(block, modelId));
        gen.registerParentedItemModel(block, modelId);
    }

    /**
     * Axis-rotatable pillar (X / Y / Z).
     *
     * MC blockstates only support X and Y rotation fields — there is no Z field.
     * The three axis orientations are encoded as:
     *   Y  → no rotation  (log standing upright)
     *   Z  → X=90         (log pointing north/south)
     *   X  → X=90, Y=90   (log pointing east/west)
     */
    private void pillarState(BlockStateModelGenerator gen, Block block, String name) {
        Identifier modelId = blockModelId(name);
        gen.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(BlockStateVariantMap.create(Properties.AXIS)
                                .register(Direction.Axis.Y, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId))
                                .register(Direction.Axis.Z, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90))
                                .register(Direction.Axis.X, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90))));
        gen.registerParentedItemModel(block, modelId);
    }

    /**
     * 6-directional facing blockstate (NeonPanelBlock).
     * North = default orientation; other directions add Y or X rotation.
     */
    private void facingState(BlockStateModelGenerator gen, Block block, String name) {
        Identifier modelId = blockModelId(name);
        gen.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(BlockStateVariantMap.create(Properties.FACING)
                                .register(Direction.NORTH, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId))
                                .register(Direction.SOUTH, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                                .register(Direction.EAST, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                                .register(Direction.WEST, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                                .register(Direction.UP, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.X, VariantSettings.Rotation.R270))
                                .register(Direction.DOWN, BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, modelId)
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90))));
        gen.registerParentedItemModel(block, modelId);
    }

    /** Returns the Identifier for assets/yourmod/models/block/<name>.json */
    private static Identifier blockModelId(String name) {
        return Identifier.of(GE.MOD_ID, "block/" + name);
    }
}
