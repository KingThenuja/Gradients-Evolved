package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.data.client.*;

import net.minecraft.util.Identifier;
import net.thenu.ge.GE;
import net.thenu.ge.block.customBlock.AmethystBlocks;
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



}}