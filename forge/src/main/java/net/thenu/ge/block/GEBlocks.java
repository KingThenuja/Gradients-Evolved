package net.thenu.ge.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.thenu.utils.BlockBehaviorHelper;
import net.thenu.utils.RegistrarBlockSet;

import static net.thenu.utils.Registering.BLOCKS;

public class GEBlocks {public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}

    public static final RegistrarBlockSet SLIGHTLY_MOSSY_COBBLESTONE =
            new RegistrarBlockSet(
                    "slightly_mossy_cobblestone",
                    BlockBehaviorHelper.stone(2, 6),
                    BlockSetType.IRON,
                    WoodType.ACACIA
            );
    public static final RegistrarBlockSet OVERLY_MOSSY_COBBLESTONE =
            new RegistrarBlockSet(
                    "overly_mossy_cobblestone",
                    BlockBehaviorHelper.stone(2, 6),
                    BlockSetType.IRON,
                    WoodType.ACACIA
            );
}

