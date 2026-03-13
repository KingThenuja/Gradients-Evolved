package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.thenu.ge.block.customBlock.AmethystBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;
import net.thenu.utils.DatagenHelper.Lang.LangHelper;
import net.thenu.utils.HelperLists;

import java.util.concurrent.CompletableFuture;

public class EnLanguage extends FabricLanguageProvider {
    public EnLanguage(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        // Specifying en_us is optional, as it's the default language code
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
        builder.add("itemgroup.ge.ge_blocks_tab", "Gradients Evolved Blocks Tab");
        builder.add(AmethystBlocks.CIRCULAR_AMETHYST_LAMP, "Circular Amethyst Lamp");
        builder.add(AmethystBlocks.CROSSED_AMETHYST_LAMP, "Crossed Amethyst Lamp");

        addFamily(builder, HelperLists.getAllMossyCobblestoneBlocks());
        addFamily(builder, HelperLists.getAllMossyDeepslateBlocks());
        addFamily(builder, HelperLists.getAllDiamondNetheriteEmeraldGlowstoneIronGoldRedstoneLapisBlocks());
        addFamily(builder, HelperLists.getAllAmethystBlocks());


    }

    private void addFamily(TranslationBuilder builder, java.util.List<BlockFamily> families) {
        for (BlockFamily family : families) {
            family.getAll().forEach(block -> LangHelper.addBlock(builder, block));
        }
    }
}