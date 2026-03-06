package net.thenu.utils.DatagenHelper.Lang;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;

public class LangHelper {
    // Converts "slightly_mossy_cobblestone_slab" -> "Slightly Mossy Cobblestone Slab"
    public static String toTitleCase(String id) {
        String[] words = id.split("_");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return sb.toString().trim();
    }

    public static void addBlock(FabricLanguageProvider.TranslationBuilder builder, Block block) {
        String id = Registries.BLOCK.getId(block).getPath(); // e.g. "slightly_mossy_cobblestone"
        builder.add(block, toTitleCase(id));
    }
}
