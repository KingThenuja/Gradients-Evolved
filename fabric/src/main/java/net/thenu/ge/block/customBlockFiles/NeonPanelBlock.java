package net.thenu.ge.block.customBlockFiles;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class NeonPanelBlock extends FacingBlock {

    public NeonPanelBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState()
                .with(Properties.FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends FacingBlock> getCodec() {
        return null;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState().with(Properties.FACING, ctx.getPlayerLookDirection().getOpposite());
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(6) == 0) {
            Direction facing = state.get(Properties.FACING);
            double baseX = pos.getX() + 0.5 + facing.getOffsetX() * 0.52;
            double baseY = pos.getY() + 0.5 + facing.getOffsetY() * 0.52;
            double baseZ = pos.getZ() + 0.5 + facing.getOffsetZ() * 0.52;

            // Small electric spark effect on the panel face
            world.addParticle(ParticleTypes.ELECTRIC_SPARK,
                    baseX + (random.nextDouble() - 0.5) * 0.8,
                    baseY + (random.nextDouble() - 0.5) * 0.8,
                    baseZ + (random.nextDouble() - 0.5) * 0.8,
                    0, 0, 0);
        }
    }
}

