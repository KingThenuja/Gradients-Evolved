package net.thenu.ge;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {public static void registerItemGroup() {GE.LOGGER.info("Registering Item Group for " + GE.MOD_ID);}

    public static final net.minecraft.item.ItemGroup GRADIENTS_EVOLVED_BLOCKS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GE.MOD_ID, "ge_blocks_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE))
                    .displayName(Text.translatable("itemgroup.ge.ge_blocks_tab"))
                    .entries((displayContext, entries) -> {

                        entries.add(GEBlocks.DIAMOND_STAIRS);
                        entries.add(GEBlocks.DIAMOND_SLAB);
                        entries.add(GEBlocks.DIAMOND_BUTTON);
                        entries.add(GEBlocks.DIAMOND_PRESSURE_PLATE);
                        entries.add(GEBlocks.DIAMOND_FENCE);
                        entries.add(GEBlocks.DIAMOND_FENCE_GATE);
                        entries.add(GEBlocks.DIAMOND_WALL);

                        entries.add(GEBlocks.IRON_STAIRS);
                        entries.add(GEBlocks.IRON_SLAB);
                        entries.add(GEBlocks.IRON_BUTTON);
                        entries.add(GEBlocks.IRON_FENCE);
                        entries.add(GEBlocks.IRON_FENCE_GATE);
                        entries.add(GEBlocks.IRON_WALL);

                        entries.add(GEBlocks.GOLD_STAIRS);
                        entries.add(GEBlocks.GOLD_SLAB);
                        entries.add(GEBlocks.GOLD_BUTTON);
                        entries.add(GEBlocks.GOLD_FENCE);
                        entries.add(GEBlocks.GOLD_FENCE_GATE);
                        entries.add(GEBlocks.GOLD_WALL);

                        entries.add(GEBlocks.EMERALD_STAIRS);
                        entries.add(GEBlocks.EMERALD_SLAB);
                        entries.add(GEBlocks.EMERALD_BUTTON);
                        entries.add(GEBlocks.EMERALD_PRESSURE_PLATE);
                        entries.add(GEBlocks.EMERALD_FENCE);
                        entries.add(GEBlocks.EMERALD_FENCE_GATE);
                        entries.add(GEBlocks.EMERALD_WALL);

                        entries.add(GEBlocks.REDSTONE_STAIRS);
                        entries.add(GEBlocks.REDSTONE_SLAB);
                        entries.add(GEBlocks.REDSTONE_BUTTON);
                        entries.add(GEBlocks.REDSTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.REDSTONE_FENCE);
                        entries.add(GEBlocks.REDSTONE_FENCE_GATE);
                        entries.add(GEBlocks.REDSTONE_WALL);

                        entries.add(GEBlocks.LAPIS_STAIRS);
                        entries.add(GEBlocks.LAPIS_SLAB);
                        entries.add(GEBlocks.LAPIS_BUTTON);
                        entries.add(GEBlocks.LAPIS_PRESSURE_PLATE);
                        entries.add(GEBlocks.LAPIS_FENCE);
                        entries.add(GEBlocks.LAPIS_FENCE_GATE);
                        entries.add(GEBlocks.LAPIS_WALL);

                        entries.add(GEBlocks.NETHERITE_STAIRS);
                        entries.add(GEBlocks.NETHERITE_SLAB);
                        entries.add(GEBlocks.NETHERITE_BUTTON);
                        entries.add(GEBlocks.NETHERITE_PRESSURE_PLATE);
                        entries.add(GEBlocks.NETHERITE_FENCE);
                        entries.add(GEBlocks.NETHERITE_FENCE_GATE);
                        entries.add(GEBlocks.NETHERITE_WALL);

                        entries.add(GEBlocks.GLOWSTONE_STAIRS);
                        entries.add(GEBlocks.GLOWSTONE_SLAB);
                        entries.add(GEBlocks.GLOWSTONE_BUTTON);
                        entries.add(GEBlocks.GLOWSTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.GLOWSTONE_FENCE);
                        entries.add(GEBlocks.GLOWSTONE_FENCE_GATE);
                        entries.add(GEBlocks.GLOWSTONE_WALL);



                        //COBBLESTONE
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL);

                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE);
                        entries.add(GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL);

                        entries.add(GEBlocks.MOSSEND_COBBLESTONE);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_STAIRS);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_SLAB);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_BUTTON);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_FENCE);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE);
                        entries.add(GEBlocks.MOSSEND_COBBLESTONE_WALL);

                        entries.add(GEBlocks.MOSSING_COBBLESTONE);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_STAIRS);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_SLAB);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_BUTTON);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_FENCE);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE);
                        entries.add(GEBlocks.MOSSING_COBBLESTONE_WALL);

                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL);

                        //DEEPSLATE
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL);

                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL);

                        entries.add(GEBlocks.MOSSEND_DEEPSLATE);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.MOSSEND_DEEPSLATE_WALL);

                        entries.add(GEBlocks.MOSSING_DEEPSLATE);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.MOSSING_DEEPSLATE_WALL);

                        entries.add(GEBlocks.MOSSY_DEEPSLATE);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.MOSSY_DEEPSLATE_WALL);

                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE);
                        entries.add(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL);




                    }).build());
}
