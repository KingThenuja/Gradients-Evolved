package net.thenu.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.thenu.ge.GE;
import net.thenu.ge.GEBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class GEBlockTagProvider extends BlockTagsProvider {
    public GEBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GE.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)

                .add(GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE.get());

    }
}