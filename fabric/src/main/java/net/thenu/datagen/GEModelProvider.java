package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.thenu.ge.GEBlocks;

public class GEModelProvider extends FabricModelProvider {
    public GEModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool slightlyMossyCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool overlyMossyCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.OVERLY_MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool mossendCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.MOSSEND_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool mossingCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.MOSSING_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool fullyCoveredMossyCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE);

        BlockStateModelGenerator.BlockTexturePool slightlyMossyDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool overlyMossyDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.OVERLY_MOSSY_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool mossendDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.MOSSEND_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool mossingDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.MOSSING_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool fullyCoveredMossyDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool mossyDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(GEBlocks.MOSSY_DEEPSLATE);


        //Cobblestone
        slightlyMossyCobblestonePool.stairs(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_STAIRS);
        slightlyMossyCobblestonePool.slab(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_SLAB);
        slightlyMossyCobblestonePool.button(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_BUTTON);
        slightlyMossyCobblestonePool.pressurePlate(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        slightlyMossyCobblestonePool.fence(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE);
        slightlyMossyCobblestonePool.fenceGate(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_FENCE_GATE);
        slightlyMossyCobblestonePool.wall(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE_WALL);

        overlyMossyCobblestonePool.stairs(GEBlocks.OVERLY_MOSSY_COBBLESTONE_STAIRS);
        overlyMossyCobblestonePool.slab(GEBlocks.OVERLY_MOSSY_COBBLESTONE_SLAB);
        overlyMossyCobblestonePool.button(GEBlocks.OVERLY_MOSSY_COBBLESTONE_BUTTON);
        overlyMossyCobblestonePool.pressurePlate(GEBlocks.OVERLY_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        overlyMossyCobblestonePool.fence(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE);
        overlyMossyCobblestonePool.fenceGate(GEBlocks.OVERLY_MOSSY_COBBLESTONE_FENCE_GATE);
        overlyMossyCobblestonePool.wall(GEBlocks.OVERLY_MOSSY_COBBLESTONE_WALL);

        mossendCobblestonePool.stairs(GEBlocks.MOSSEND_COBBLESTONE_STAIRS);
        mossendCobblestonePool.slab(GEBlocks.MOSSEND_COBBLESTONE_SLAB);
        mossendCobblestonePool.button(GEBlocks.MOSSEND_COBBLESTONE_BUTTON);
        mossendCobblestonePool.pressurePlate(GEBlocks.MOSSEND_COBBLESTONE_PRESSURE_PLATE);
        mossendCobblestonePool.fence(GEBlocks.MOSSEND_COBBLESTONE_FENCE);
        mossendCobblestonePool.fenceGate(GEBlocks.MOSSEND_COBBLESTONE_FENCE_GATE);
        mossendCobblestonePool.wall(GEBlocks.MOSSEND_COBBLESTONE_WALL);

        mossingCobblestonePool.stairs(GEBlocks.MOSSING_COBBLESTONE_STAIRS);
        mossingCobblestonePool.slab(GEBlocks.MOSSING_COBBLESTONE_SLAB);
        mossingCobblestonePool.button(GEBlocks.MOSSING_COBBLESTONE_BUTTON);
        mossingCobblestonePool.pressurePlate(GEBlocks.MOSSING_COBBLESTONE_PRESSURE_PLATE);
        mossingCobblestonePool.fence(GEBlocks.MOSSING_COBBLESTONE_FENCE);
        mossingCobblestonePool.fenceGate(GEBlocks.MOSSING_COBBLESTONE_FENCE_GATE);
        mossingCobblestonePool.wall(GEBlocks.MOSSING_COBBLESTONE_WALL);

        fullyCoveredMossyCobblestonePool.stairs(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_STAIRS);
        fullyCoveredMossyCobblestonePool.slab(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_SLAB);
        fullyCoveredMossyCobblestonePool.button(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_BUTTON);
        fullyCoveredMossyCobblestonePool.pressurePlate(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
        fullyCoveredMossyCobblestonePool.fence(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE);
        fullyCoveredMossyCobblestonePool.fenceGate(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_FENCE_GATE);
        fullyCoveredMossyCobblestonePool.wall(GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE_WALL);

        //Deepslate
        slightlyMossyDeepslatePool.stairs(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_STAIRS);
        slightlyMossyDeepslatePool.slab(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_SLAB);
        slightlyMossyDeepslatePool.button(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_BUTTON);
        slightlyMossyDeepslatePool.pressurePlate(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        slightlyMossyDeepslatePool.fence(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE);
        slightlyMossyDeepslatePool.fenceGate(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_FENCE_GATE);
        slightlyMossyDeepslatePool.wall(GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE_WALL);

        overlyMossyDeepslatePool.stairs(GEBlocks.OVERLY_MOSSY_DEEPSLATE_STAIRS);
        overlyMossyDeepslatePool.slab(GEBlocks.OVERLY_MOSSY_DEEPSLATE_SLAB);
        overlyMossyDeepslatePool.button(GEBlocks.OVERLY_MOSSY_DEEPSLATE_BUTTON);
        overlyMossyDeepslatePool.pressurePlate(GEBlocks.OVERLY_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        overlyMossyDeepslatePool.fence(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE);
        overlyMossyDeepslatePool.fenceGate(GEBlocks.OVERLY_MOSSY_DEEPSLATE_FENCE_GATE);
        overlyMossyCobblestonePool.wall(GEBlocks.OVERLY_MOSSY_DEEPSLATE_WALL);

        mossendDeepslatePool.stairs(GEBlocks.MOSSEND_DEEPSLATE_STAIRS);
        mossendDeepslatePool.slab(GEBlocks.MOSSEND_DEEPSLATE_SLAB);
        mossendDeepslatePool.button(GEBlocks.MOSSEND_DEEPSLATE_BUTTON);
        mossendDeepslatePool.pressurePlate(GEBlocks.MOSSEND_DEEPSLATE_PRESSURE_PLATE);
        mossendDeepslatePool.fence(GEBlocks.MOSSEND_DEEPSLATE_FENCE);
        mossendDeepslatePool.fenceGate(GEBlocks.MOSSEND_DEEPSLATE_FENCE_GATE);
        mossendDeepslatePool.wall(GEBlocks.MOSSEND_DEEPSLATE_WALL);

        mossingDeepslatePool.stairs(GEBlocks.MOSSING_DEEPSLATE_STAIRS);
        mossingDeepslatePool.slab(GEBlocks.MOSSING_DEEPSLATE_SLAB);
        mossingDeepslatePool.button(GEBlocks.MOSSING_DEEPSLATE_BUTTON);
        mossingDeepslatePool.pressurePlate(GEBlocks.MOSSING_DEEPSLATE_PRESSURE_PLATE);
        mossingDeepslatePool.fence(GEBlocks.MOSSING_DEEPSLATE_FENCE);
        mossingDeepslatePool.fenceGate(GEBlocks.MOSSING_DEEPSLATE_FENCE_GATE);
        mossingDeepslatePool.wall(GEBlocks.MOSSING_DEEPSLATE_WALL);

        fullyCoveredMossyDeepslatePool.stairs(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_STAIRS);
        fullyCoveredMossyDeepslatePool.slab(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_SLAB);
        fullyCoveredMossyDeepslatePool.button(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_BUTTON);
        fullyCoveredMossyDeepslatePool.pressurePlate(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_PRESSURE_PLATE);
        fullyCoveredMossyDeepslatePool.fence(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE);
        fullyCoveredMossyDeepslatePool.fenceGate(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_FENCE_GATE);
        fullyCoveredMossyDeepslatePool.wall(GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE_WALL);

        mossyDeepslatePool.stairs(GEBlocks.MOSSY_DEEPSLATE_STAIRS);
        mossyDeepslatePool.slab(GEBlocks.MOSSY_DEEPSLATE_SLAB);
        mossyDeepslatePool.button(GEBlocks.MOSSY_DEEPSLATE_BUTTON);
        mossyDeepslatePool.pressurePlate(GEBlocks.MOSSY_DEEPSLATE_PRESSURE_PLATE);
        mossyDeepslatePool.fence(GEBlocks.MOSSY_DEEPSLATE_FENCE);
        mossyDeepslatePool.fenceGate(GEBlocks.MOSSY_DEEPSLATE_FENCE_GATE);
        mossyDeepslatePool.wall(GEBlocks.MOSSY_DEEPSLATE_WALL);



        /*
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MBlocks.PINK_GARNET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(GEBlocks.RAW_PINK_GARNET_BLOCK);

        pinkGarnetPool.stairs(GEBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(GEBlocks.PINK_GARNET_SLAB);

        pinkGarnetPool.button(GEBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(GEBlocks.PINK_GARNET_PRESSURE_PLATE);

        pinkGarnetPool.fence(GEBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(GEBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(GEBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(GEBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(GEBlocks.PINK_GARNET_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(GEBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(GEBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(GEBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

        blockStateModelGenerator.registerCrop(GEBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(GEBlocks.HONEY_BERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                HoneyBerryBushBlock.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerLog(GEBlocks.DRIFTWOOD_LOG).log(GEBlocks.DRIFTWOOD_LOG).wood(GEBlocks.DRIFTWOOD_WOOD);
        blockStateModelGenerator.registerLog(GEBlocks.STRIPPED_DRIFTWOOD_LOG).log(GEBlocks.STRIPPED_DRIFTWOOD_LOG).wood(GEBlocks.STRIPPED_DRIFTWOOD_WOOD);


        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(GEBlocks.CHAIR);

        blockStateModelGenerator.registerSimpleCubeAll(GEBlocks.GROWTH_CHAMBER);*/

        //Diamond
        final TextureMap diamondTexture = TextureMap.all(Identifier.ofVanilla("block/diamond_block"));

        final Identifier diamondstairsModelId = Models.STAIRS.upload(GEBlocks.DIAMOND_STAIRS, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.DIAMOND_STAIRS, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.DIAMOND_STAIRS, diamondTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.DIAMOND_STAIRS, diamondinnerStairsModelId, diamondstairsModelId, diamondouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.DIAMOND_STAIRS, diamondstairsModelId);
        final Identifier diamondslabBottomModelId = Models.SLAB.upload(GEBlocks.DIAMOND_SLAB, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.DIAMOND_SLAB, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.DIAMOND_SLAB, diamondslabBottomModelId, diamondslabTopModelId, Identifier.ofVanilla("block/diamond_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_SLAB, diamondslabBottomModelId);

        final Identifier diamondButtonModelId = Models.BUTTON.upload(GEBlocks.DIAMOND_BUTTON, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.DIAMOND_BUTTON, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.DIAMOND_BUTTON, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.DIAMOND_BUTTON, diamondButtonModelId, diamondButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_BUTTON, diamondButtonInvModelId);

        final Identifier diamondPresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.DIAMOND_PRESSURE_PLATE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondPresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.DIAMOND_PRESSURE_PLATE, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.DIAMOND_PRESSURE_PLATE, diamondPresUPModelId, diamondPresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_PRESSURE_PLATE, diamondPresUPModelId);

        final Identifier diamondFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.DIAMOND_FENCE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondFencePostModelId = Models.FENCE_POST.upload(GEBlocks.DIAMOND_FENCE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.DIAMOND_FENCE, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.DIAMOND_FENCE, diamondFencePostModelId, diamondFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_FENCE, diamondFenceInvModelId);

        final Identifier diamondFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.DIAMOND_FENCE_GATE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.DIAMOND_FENCE_GATE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.DIAMOND_FENCE_GATE, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.DIAMOND_FENCE_GATE, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.DIAMOND_FENCE_GATE, diamondFenceGateOpenModelId, diamondFenceGateModelId, diamondFenceGateWallOpenModelId, diamondFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_FENCE_GATE, diamondFenceGateModelId);

        final Identifier diamondWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.DIAMOND_WALL, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.DIAMOND_WALL, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.DIAMOND_WALL, diamondTexture, blockStateModelGenerator.modelCollector);
        final Identifier diamondWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.DIAMOND_WALL, diamondTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.DIAMOND_WALL, diamondWallPostModelId, diamondWallSideModelId, diamondWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.DIAMOND_WALL, diamondWallModelId);


        //Iron
        final TextureMap ironTexture = TextureMap.all(Identifier.ofVanilla("block/iron_block"));

        final Identifier ironstairsModelId = Models.STAIRS.upload(GEBlocks.IRON_STAIRS, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.IRON_STAIRS, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.IRON_STAIRS, ironTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.IRON_STAIRS, ironinnerStairsModelId, ironstairsModelId, ironouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.IRON_STAIRS, ironstairsModelId);
        final Identifier ironslabBottomModelId = Models.SLAB.upload(GEBlocks.IRON_SLAB, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.IRON_SLAB, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.IRON_SLAB, ironslabBottomModelId, ironslabTopModelId, Identifier.ofVanilla("block/iron_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_SLAB, ironslabBottomModelId);

        final Identifier ironButtonModelId = Models.BUTTON.upload(GEBlocks.IRON_BUTTON, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.IRON_BUTTON, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.IRON_BUTTON, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.IRON_BUTTON, ironButtonModelId, ironButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_BUTTON, ironButtonInvModelId);

        final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);

        final Identifier ironFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.IRON_FENCE_GATE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.IRON_FENCE_GATE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.IRON_FENCE_GATE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.IRON_FENCE_GATE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.IRON_FENCE_GATE, ironFenceGateOpenModelId, ironFenceGateModelId, ironFenceGateWallOpenModelId, ironFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE_GATE, ironFenceGateModelId);

        final Identifier ironWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.IRON_WALL, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.IRON_WALL, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.IRON_WALL, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.IRON_WALL, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.IRON_WALL, ironWallPostModelId, ironWallSideModelId, ironWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_WALL, ironWallModelId);

        //Gold
        final TextureMap goldTexture = TextureMap.all(Identifier.ofVanilla("block/gold_block"));

        final Identifier goldstairsModelId = Models.STAIRS.upload(GEBlocks.GOLD_STAIRS, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.GOLD_STAIRS, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.GOLD_STAIRS, goldTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.GOLD_STAIRS, goldinnerStairsModelId, goldstairsModelId, goldouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.GOLD_STAIRS, goldstairsModelId);
        final Identifier goldslabBottomModelId = Models.SLAB.upload(GEBlocks.GOLD_SLAB, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.GOLD_SLAB, goldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.GOLD_SLAB, goldslabBottomModelId, goldslabTopModelId, Identifier.ofVanilla("block/gold_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GOLD_SLAB, goldslabBottomModelId);

        final Identifier goldButtonModelId = Models.BUTTON.upload(GEBlocks.GOLD_BUTTON, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.GOLD_BUTTON, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.GOLD_BUTTON, goldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.GOLD_BUTTON, goldButtonModelId, goldButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GOLD_BUTTON, goldButtonInvModelId);

        /*final Identifier goldFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, goldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, goldFencePostModelId, goldFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, goldFenceInvModelId);*/

        final Identifier goldFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.GOLD_FENCE_GATE, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.GOLD_FENCE_GATE, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.GOLD_FENCE_GATE, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.GOLD_FENCE_GATE, goldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.GOLD_FENCE_GATE, goldFenceGateOpenModelId, goldFenceGateModelId, goldFenceGateWallOpenModelId, goldFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GOLD_FENCE_GATE, goldFenceGateModelId);

        final Identifier goldWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.GOLD_WALL, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.GOLD_WALL, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.GOLD_WALL, goldTexture, blockStateModelGenerator.modelCollector);
        final Identifier goldWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.GOLD_WALL, goldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.GOLD_WALL, goldWallPostModelId, goldWallSideModelId, goldWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GOLD_WALL, goldWallModelId);

        //Emerald
        final TextureMap emeraldTexture = TextureMap.all(Identifier.ofVanilla("block/emerald_block"));

        final Identifier emeraldstairsModelId = Models.STAIRS.upload(GEBlocks.EMERALD_STAIRS, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.EMERALD_STAIRS, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.EMERALD_STAIRS, emeraldTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.EMERALD_STAIRS, emeraldinnerStairsModelId, emeraldstairsModelId, emeraldouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.EMERALD_STAIRS, emeraldstairsModelId);
        final Identifier emeraldslabBottomModelId = Models.SLAB.upload(GEBlocks.EMERALD_SLAB, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.EMERALD_SLAB, emeraldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.EMERALD_SLAB, emeraldslabBottomModelId, emeraldslabTopModelId, Identifier.ofVanilla("block/emerald_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.EMERALD_SLAB, emeraldslabBottomModelId);

        final Identifier emeraldButtonModelId = Models.BUTTON.upload(GEBlocks.EMERALD_BUTTON, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.EMERALD_BUTTON, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.EMERALD_BUTTON, emeraldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.EMERALD_BUTTON, emeraldButtonModelId, emeraldButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.EMERALD_BUTTON, emeraldButtonInvModelId);
        final Identifier emeraldPresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.EMERALD_PRESSURE_PLATE, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldPresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.EMERALD_PRESSURE_PLATE, emeraldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.EMERALD_PRESSURE_PLATE, emeraldPresUPModelId, emeraldPresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.EMERALD_PRESSURE_PLATE, emeraldPresUPModelId);

        /*final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);*/

        final Identifier emeraldFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.EMERALD_FENCE_GATE, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.EMERALD_FENCE_GATE, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.EMERALD_FENCE_GATE, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.EMERALD_FENCE_GATE, emeraldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.EMERALD_FENCE_GATE, emeraldFenceGateOpenModelId, emeraldFenceGateModelId, emeraldFenceGateWallOpenModelId, emeraldFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.EMERALD_FENCE_GATE, emeraldFenceGateModelId);

        final Identifier emeraldWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.EMERALD_WALL, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.EMERALD_WALL, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.EMERALD_WALL, emeraldTexture, blockStateModelGenerator.modelCollector);
        final Identifier emeraldWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.EMERALD_WALL, emeraldTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.EMERALD_WALL, emeraldWallPostModelId, emeraldWallSideModelId, emeraldWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.EMERALD_WALL, emeraldWallModelId);

        //Redstone
        final TextureMap redstoneTexture = TextureMap.all(Identifier.ofVanilla("block/redstone_block"));

        final Identifier redstonestairsModelId = Models.STAIRS.upload(GEBlocks.REDSTONE_STAIRS, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.REDSTONE_STAIRS, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.REDSTONE_STAIRS, redstoneTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.REDSTONE_STAIRS, redstoneinnerStairsModelId, redstonestairsModelId, redstoneouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.REDSTONE_STAIRS, redstonestairsModelId);
        final Identifier redstoneslabBottomModelId = Models.SLAB.upload(GEBlocks.REDSTONE_SLAB, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.REDSTONE_SLAB, redstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.REDSTONE_SLAB, redstoneslabBottomModelId, redstoneslabTopModelId, Identifier.ofVanilla("block/redstone_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.REDSTONE_SLAB, redstoneslabBottomModelId);

        final Identifier redstoneButtonModelId = Models.BUTTON.upload(GEBlocks.REDSTONE_BUTTON, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.REDSTONE_BUTTON, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.REDSTONE_BUTTON, redstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.REDSTONE_BUTTON, redstoneButtonModelId, redstoneButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.REDSTONE_BUTTON, redstoneButtonInvModelId);
        final Identifier redstonePresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.REDSTONE_PRESSURE_PLATE, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstonePresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.REDSTONE_PRESSURE_PLATE, redstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.REDSTONE_PRESSURE_PLATE, redstonePresUPModelId, redstonePresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.REDSTONE_PRESSURE_PLATE, redstonePresUPModelId);

        /*final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);*/

        final Identifier redstoneFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.REDSTONE_FENCE_GATE, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.REDSTONE_FENCE_GATE, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.REDSTONE_FENCE_GATE, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.REDSTONE_FENCE_GATE, redstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.REDSTONE_FENCE_GATE, redstoneFenceGateOpenModelId, redstoneFenceGateModelId, redstoneFenceGateWallOpenModelId, redstoneFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.REDSTONE_FENCE_GATE, redstoneFenceGateModelId);

        final Identifier redstoneWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.REDSTONE_WALL, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.REDSTONE_WALL, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.REDSTONE_WALL, redstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier redstoneWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.REDSTONE_WALL, redstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.REDSTONE_WALL, redstoneWallPostModelId, redstoneWallSideModelId, redstoneWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.REDSTONE_WALL, redstoneWallModelId);

        //Lapis
        final TextureMap lapisTexture = TextureMap.all(Identifier.ofVanilla("block/lapis_block"));

        final Identifier lapisstairsModelId = Models.STAIRS.upload(GEBlocks.LAPIS_STAIRS, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.LAPIS_STAIRS, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.LAPIS_STAIRS, lapisTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.LAPIS_STAIRS, lapisinnerStairsModelId, lapisstairsModelId, lapisouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.LAPIS_STAIRS, lapisstairsModelId);
        final Identifier lapisslabBottomModelId = Models.SLAB.upload(GEBlocks.LAPIS_SLAB, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.LAPIS_SLAB, lapisTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.LAPIS_SLAB, lapisslabBottomModelId, lapisslabTopModelId, Identifier.ofVanilla("block/lapis_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.LAPIS_SLAB, lapisslabBottomModelId);

        final Identifier lapisButtonModelId = Models.BUTTON.upload(GEBlocks.LAPIS_BUTTON, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.LAPIS_BUTTON, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.LAPIS_BUTTON, lapisTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.LAPIS_BUTTON, lapisButtonModelId, lapisButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.LAPIS_BUTTON, lapisButtonInvModelId);
        final Identifier lapisPresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.LAPIS_PRESSURE_PLATE, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisPresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.LAPIS_PRESSURE_PLATE, lapisTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.LAPIS_PRESSURE_PLATE, lapisPresUPModelId, lapisPresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.LAPIS_PRESSURE_PLATE, lapisPresUPModelId);

        /*final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);*/

        final Identifier lapisFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.LAPIS_FENCE_GATE, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.LAPIS_FENCE_GATE, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.LAPIS_FENCE_GATE, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.LAPIS_FENCE_GATE, lapisTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.LAPIS_FENCE_GATE, lapisFenceGateOpenModelId, lapisFenceGateModelId, lapisFenceGateWallOpenModelId, lapisFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.LAPIS_FENCE_GATE, lapisFenceGateModelId);

        final Identifier lapisWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.LAPIS_WALL, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.LAPIS_WALL, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.LAPIS_WALL, lapisTexture, blockStateModelGenerator.modelCollector);
        final Identifier lapisWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.LAPIS_WALL, lapisTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.LAPIS_WALL, lapisWallPostModelId, lapisWallSideModelId, lapisWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.LAPIS_WALL, lapisWallModelId);

        //Netherite
        final TextureMap netheriteTexture = TextureMap.all(Identifier.ofVanilla("block/netherite_block"));

        final Identifier netheritestairsModelId = Models.STAIRS.upload(GEBlocks.NETHERITE_STAIRS, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.NETHERITE_STAIRS, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.NETHERITE_STAIRS, netheriteTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.NETHERITE_STAIRS, netheriteinnerStairsModelId, netheritestairsModelId, netheriteouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.NETHERITE_STAIRS, netheritestairsModelId);
        final Identifier netheriteslabBottomModelId = Models.SLAB.upload(GEBlocks.NETHERITE_SLAB, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.NETHERITE_SLAB, netheriteTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.NETHERITE_SLAB, netheriteslabBottomModelId, netheriteslabTopModelId, Identifier.ofVanilla("block/netherite_block")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.NETHERITE_SLAB, netheriteslabBottomModelId);

        final Identifier netheriteButtonModelId = Models.BUTTON.upload(GEBlocks.NETHERITE_BUTTON, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.NETHERITE_BUTTON, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.NETHERITE_BUTTON, netheriteTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.NETHERITE_BUTTON, netheriteButtonModelId, netheriteButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.NETHERITE_BUTTON, netheriteButtonInvModelId);
        final Identifier netheritePresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.NETHERITE_PRESSURE_PLATE, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheritePresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.NETHERITE_PRESSURE_PLATE, netheriteTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.NETHERITE_PRESSURE_PLATE, netheritePresUPModelId, netheritePresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.NETHERITE_PRESSURE_PLATE, netheritePresUPModelId);

        /*final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);*/

        final Identifier netheriteFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.NETHERITE_FENCE_GATE, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.NETHERITE_FENCE_GATE, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.NETHERITE_FENCE_GATE, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.NETHERITE_FENCE_GATE, netheriteTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.NETHERITE_FENCE_GATE, netheriteFenceGateOpenModelId, netheriteFenceGateModelId, netheriteFenceGateWallOpenModelId, netheriteFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.NETHERITE_FENCE_GATE, netheriteFenceGateModelId);

        final Identifier netheriteWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.NETHERITE_WALL, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.NETHERITE_WALL, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.NETHERITE_WALL, netheriteTexture, blockStateModelGenerator.modelCollector);
        final Identifier netheriteWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.NETHERITE_WALL, netheriteTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.NETHERITE_WALL, netheriteWallPostModelId, netheriteWallSideModelId, netheriteWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.NETHERITE_WALL, netheriteWallModelId);

        //Glowstone
        final TextureMap glowstoneTexture = TextureMap.all(Identifier.ofVanilla("block/glowstone"));

        final Identifier glowstonestairsModelId = Models.STAIRS.upload(GEBlocks.GLOWSTONE_STAIRS, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneinnerStairsModelId = Models.INNER_STAIRS.upload(GEBlocks.GLOWSTONE_STAIRS, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneouterStairsModelId = Models.OUTER_STAIRS.upload(GEBlocks.GLOWSTONE_STAIRS, glowstoneTexture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(GEBlocks.GLOWSTONE_STAIRS, glowstoneinnerStairsModelId, glowstonestairsModelId, glowstoneouterStairsModelId));
        blockStateModelGenerator.registerParentedItemModel(GEBlocks.GLOWSTONE_STAIRS, glowstonestairsModelId);
        final Identifier glowstoneslabBottomModelId = Models.SLAB.upload(GEBlocks.GLOWSTONE_SLAB, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneslabTopModelId = Models.SLAB_TOP.upload(GEBlocks.GLOWSTONE_SLAB, glowstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createSlabBlockState(GEBlocks.GLOWSTONE_SLAB, glowstoneslabBottomModelId, glowstoneslabTopModelId, Identifier.ofVanilla("block/glowstone")));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GLOWSTONE_SLAB, glowstoneslabBottomModelId);

        final Identifier glowstoneButtonModelId = Models.BUTTON.upload(GEBlocks.GLOWSTONE_BUTTON, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneButtonInvModelId = Models.BUTTON_INVENTORY.upload(GEBlocks.GLOWSTONE_BUTTON, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneButtonPresModelId = Models.BUTTON_PRESSED.upload(GEBlocks.GLOWSTONE_BUTTON, glowstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createButtonBlockState(GEBlocks.GLOWSTONE_BUTTON, glowstoneButtonModelId, glowstoneButtonPresModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GLOWSTONE_BUTTON, glowstoneButtonInvModelId);
        final Identifier glowstonePresUPModelId = Models.PRESSURE_PLATE_UP.upload(GEBlocks.GLOWSTONE_PRESSURE_PLATE, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstonePresDownModelId = Models.PRESSURE_PLATE_DOWN.upload(GEBlocks.GLOWSTONE_PRESSURE_PLATE, glowstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createPressurePlateBlockState(GEBlocks.GLOWSTONE_PRESSURE_PLATE, glowstonePresUPModelId, glowstonePresDownModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GLOWSTONE_PRESSURE_PLATE, glowstonePresUPModelId);

        /*final Identifier ironFenceInvModelId = Models.FENCE_INVENTORY.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFencePostModelId = Models.FENCE_POST.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);
        final Identifier ironFenceSideModelId = Models.FENCE_SIDE.upload(GEBlocks.IRON_FENCE, ironTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.
                createFenceBlockState(GEBlocks.IRON_FENCE, ironFencePostModelId, ironFenceSideModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.IRON_FENCE, ironFenceInvModelId);*/

        final Identifier glowstoneFenceGateModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE.upload(GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneFenceGateOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_OPEN.upload(GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneFenceGateWallModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL.upload(GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneFenceGateWallOpenModelId = Models.TEMPLATE_CUSTOM_FENCE_GATE_WALL_OPEN.upload(GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createFenceGateBlockState(GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneFenceGateOpenModelId, glowstoneFenceGateModelId, glowstoneFenceGateWallOpenModelId, glowstoneFenceGateWallModelId, true));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GLOWSTONE_FENCE_GATE, glowstoneFenceGateModelId);

        final Identifier glowstoneWallModelId = Models.WALL_INVENTORY.upload(GEBlocks.GLOWSTONE_WALL, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneWallPostModelId = Models.TEMPLATE_WALL_POST.upload(GEBlocks.GLOWSTONE_WALL, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneWallSideModelId = Models.TEMPLATE_WALL_SIDE.upload(GEBlocks.GLOWSTONE_WALL, glowstoneTexture, blockStateModelGenerator.modelCollector);
        final Identifier glowstoneWallSideTallModelId = Models.TEMPLATE_WALL_SIDE_TALL.upload(GEBlocks.GLOWSTONE_WALL, glowstoneTexture, blockStateModelGenerator.modelCollector);blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator
                .createWallBlockState(GEBlocks.GLOWSTONE_WALL, glowstoneWallPostModelId, glowstoneWallSideModelId, glowstoneWallSideTallModelId));blockStateModelGenerator.registerParentedItemModel
                (GEBlocks.GLOWSTONE_WALL, glowstoneWallModelId);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }}