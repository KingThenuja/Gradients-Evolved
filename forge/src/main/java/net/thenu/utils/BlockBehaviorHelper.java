package net.thenu.utils;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockBehaviorHelper {
    public static BlockBehaviour.Properties stone(float hardness, float explosionResist) {
        return BlockBehaviour.Properties.of()
                .strength(hardness, explosionResist)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE);
    }

    public static BlockBehaviour.Properties metal(float hardness, float explosionResist) {
        return BlockBehaviour.Properties.of()
                .strength(hardness, explosionResist)
                .requiresCorrectToolForDrops()
                .sound(SoundType.METAL);
    }
}
