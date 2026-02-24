package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.thenu.ge.GEBlocks;

import java.util.concurrent.CompletableFuture;

public class GELootTableProvider extends FabricBlockLootTableProvider {
    public GELootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

        //Cobblestone
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL);

        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE);
        addDrop(GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL);

        addDrop(GEBlocks.MOSSEND_COBBLESTONE);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_STAIRS);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_SLAB);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_BUTTON);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_FENCE);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE);
        addDrop(GEBlocks.MOSSEND_COBBLESTONE_WALL);

        addDrop(GEBlocks.MOSSING_COBBLESTONE);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_STAIRS);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_SLAB);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_BUTTON);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_FENCE);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE);
        addDrop(GEBlocks.MOSSING_COBBLESTONE_WALL);

        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL);

        //Deepslate
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL);

        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL);

        addDrop(GEBlocks.MOSSEND_DEEPSLATE);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_SLAB);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_FENCE);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.MOSSEND_DEEPSLATE_WALL);

        addDrop(GEBlocks.MOSSING_DEEPSLATE);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_SLAB);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_FENCE);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.MOSSING_DEEPSLATE_WALL);

        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL);

        addDrop(GEBlocks.MOSSY_DEEPSLATE);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_STAIRS);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_SLAB);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_BUTTON);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_FENCE);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE);
        addDrop(GEBlocks.MOSSY_DEEPSLATE_WALL);

        addDrop(GEBlocks.DIAMOND_STAIRS);
        addDrop(GEBlocks.DIAMOND_SLAB);
        addDrop(GEBlocks.DIAMOND_BUTTON);
        addDrop(GEBlocks.DIAMOND_PRESSURE_PLATE);
        addDrop(GEBlocks.DIAMOND_FENCE);
        addDrop(GEBlocks.DIAMOND_FENCE_GATE);
        addDrop(GEBlocks.DIAMOND_WALL);

        addDrop(GEBlocks.IRON_SLAB);
        addDrop(GEBlocks.IRON_STAIRS);
        addDrop(GEBlocks.IRON_BUTTON);
        addDrop(GEBlocks.IRON_FENCE);
        addDrop(GEBlocks.IRON_FENCE_GATE);
        addDrop(GEBlocks.IRON_WALL);

        addDrop(GEBlocks.GOLD_SLAB);
        addDrop(GEBlocks.GOLD_STAIRS);
        addDrop(GEBlocks.GOLD_BUTTON);
        addDrop(GEBlocks.GOLD_FENCE);
        addDrop(GEBlocks.GOLD_FENCE_GATE);
        addDrop(GEBlocks.GOLD_WALL);

        addDrop(GEBlocks.EMERALD_SLAB);
        addDrop(GEBlocks.EMERALD_STAIRS);
        addDrop(GEBlocks.EMERALD_BUTTON);
        addDrop(GEBlocks.EMERALD_PRESSURE_PLATE);
        addDrop(GEBlocks.EMERALD_FENCE);
        addDrop(GEBlocks.EMERALD_FENCE_GATE);
        addDrop(GEBlocks.EMERALD_WALL);

        addDrop(GEBlocks.REDSTONE_SLAB);
        addDrop(GEBlocks.REDSTONE_STAIRS);
        addDrop(GEBlocks.REDSTONE_BUTTON);
        addDrop(GEBlocks.REDSTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.REDSTONE_FENCE);
        addDrop(GEBlocks.REDSTONE_FENCE_GATE);
        addDrop(GEBlocks.REDSTONE_WALL);

        addDrop(GEBlocks.LAPIS_SLAB);
        addDrop(GEBlocks.LAPIS_STAIRS);
        addDrop(GEBlocks.LAPIS_BUTTON);
        addDrop(GEBlocks.LAPIS_PRESSURE_PLATE);
        addDrop(GEBlocks.LAPIS_FENCE);
        addDrop(GEBlocks.LAPIS_FENCE_GATE);
        addDrop(GEBlocks.LAPIS_WALL);

        addDrop(GEBlocks.NETHERITE_SLAB);
        addDrop(GEBlocks.NETHERITE_STAIRS);
        addDrop(GEBlocks.NETHERITE_BUTTON);
        addDrop(GEBlocks.NETHERITE_PRESSURE_PLATE);
        addDrop(GEBlocks.NETHERITE_FENCE);
        addDrop(GEBlocks.NETHERITE_FENCE_GATE);
        addDrop(GEBlocks.NETHERITE_WALL);

        addDrop(GEBlocks.GLOWSTONE_SLAB);
        addDrop(GEBlocks.GLOWSTONE_STAIRS);
        addDrop(GEBlocks.GLOWSTONE_BUTTON);
        addDrop(GEBlocks.GLOWSTONE_PRESSURE_PLATE);
        addDrop(GEBlocks.GLOWSTONE_FENCE);
        addDrop(GEBlocks.GLOWSTONE_FENCE_GATE);
        addDrop(GEBlocks.GLOWSTONE_WALL);

        /*
        addDrop(GEBlocks.PINK_GARNET_BLOCK);
        addDrop(GEBlocks.RAW_PINK_GARNET_BLOCK);
        addDrop(GEBlocks.MAGIC_BLOCK);

        addDrop(GEBlocks.PINK_GARNET_ORE, oreDrops(GEBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(GEBlocks.PINK_GARNET_DEEPSLATE_ORE, multipleOreDrops(GEBlocks.PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET, 3, 7));

        addDrop(GEBlocks.PINK_GARNET_STAIRS);
        addDrop(GEBlocks.PINK_GARNET_SLAB, slabDrops(GEBlocks.PINK_GARNET_SLAB));

        addDrop(GEBlocks.PINK_GARNET_BUTTON);
        addDrop(GEBlocks.PINK_GARNET_PRESSURE_PLATE);

        addDrop(GEBlocks.PINK_GARNET_WALL);
        addDrop(GEBlocks.PINK_GARNET_FENCE);
        addDrop(GEBlocks.PINK_GARNET_FENCE_GATE);

        addDrop(GEBlocks.PINK_GARNET_DOOR, doorDrops(GEBlocks.PINK_GARNET_DOOR));
        addDrop(GEBlocks.PINK_GARNET_TRAPDOOR);

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(GEBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, CauliflowerCropBlock.MAX_AGE));
        this.addDrop(GEBlocks.CAULIFLOWER_CROP, this.cropDrops(GEBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));

        this.addDrop(GEBlocks.HONEY_BERRY_BUSH,
                block -> this.applyExplosionDecay(
                        block,LootTable.builder().pool(LootPool.builder().conditionally(
                                                BlockStatePropertyLootCondition.builder(GEBlocks.HONEY_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 3))
                                        )
                                        .with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        ).pool(LootPool.builder().conditionally(
                                        BlockStatePropertyLootCondition.builder(GEBlocks.HONEY_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 2))
                                ).with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));


        addDrop(GEBlocks.PINK_GARNET_END_ORE, multipleOreDrops(GEBlocks.PINK_GARNET_END_ORE, ModItems.RAW_PINK_GARNET, 4, 9));
        addDrop(GEBlocks.PINK_GARNET_NETHER_ORE, multipleOreDrops(GEBlocks.PINK_GARNET_NETHER_ORE, ModItems.RAW_PINK_GARNET, 3, 8));

        addDrop(GEBlocks.DRIFTWOOD_LOG);
        addDrop(GEBlocks.DRIFTWOOD_WOOD);
        addDrop(GEBlocks.STRIPPED_DRIFTWOOD_LOG);
        addDrop(GEBlocks.STRIPPED_DRIFTWOOD_WOOD);
        addDrop(GEBlocks.DRIFTWOOD_PLANKS);
        addDrop(GEBlocks.DRIFTWOOD_SAPLING);

        addDrop(GEBlocks.DRIFTWOOD_LEAVES, leavesDrops(GEBlocks.DRIFTWOOD_LEAVES, GEBlocks.DRIFTWOOD_SAPLING, 0.0625f));*/
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}