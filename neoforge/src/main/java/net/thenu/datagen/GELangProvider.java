package net.thenu.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.thenu.ge.ModBlocks;

public class GELangProvider extends LanguageProvider {
    public GELangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.addBlock(ModBlocks.SLIGHTLY_MOSSY_COBBLESTONE, "Slightly Mossy Cobblestone");
    }
}
