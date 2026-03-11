package net.thenu.ge.block.customBlockFiles;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CrystalBlock extends Block {

    public CrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        // Spawn glinting enchantment particles around the block
        if (random.nextInt(3) == 0) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + random.nextDouble();
            double z = pos.getZ() + random.nextDouble();
            world.addParticle(ParticleTypes.ENCHANT, x, y, z,
                    (random.nextDouble() - 0.5) * 0.5,
                    random.nextDouble() * 0.4,
                    (random.nextDouble() - 0.5) * 0.5);
        }
        // Occasional end rod sparkle
        if (random.nextInt(10) == 0) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + random.nextDouble();
            double z = pos.getZ() + random.nextDouble();
            world.addParticle(ParticleTypes.END_ROD, x, y, z, 0, 0.05, 0);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // Slightly inset shape for a crystal-like look
        return VoxelShapes.cuboid(0.05, 0.0, 0.05, 0.95, 1.0, 0.95);
    }
}

