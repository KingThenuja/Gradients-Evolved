package net.thenu.utils;

import net.thenu.ge.GEBlocks;
import net.thenu.utils.BlockFamily.BlockFamily;

import java.util.List;

public class HelperLists {

    public static List<BlockFamily> getAllMossyCobblestoneBlocks() {
        return List.of(
                GEBlocks.SLIGHTLY_MOSSY_COBBLESTONE, GEBlocks.OVERLY_MOSSY_COBBLESTONE,
                GEBlocks.MOSSEND_COBBLESTONE, GEBlocks.MOSSING_COBBLESTONE,
                GEBlocks.FULLY_COVERED_MOSSY_COBBLESTONE
        );
    }
    public static List<BlockFamily> getAllMossyDeepslateBlocks() {
        return List.of(
                GEBlocks.SLIGHTLY_MOSSY_DEEPSLATE, GEBlocks.OVERLY_MOSSY_DEEPSLATE,
                GEBlocks.MOSSEND_DEEPSLATE, GEBlocks.MOSSING_DEEPSLATE,
                GEBlocks.FULLY_COVERED_MOSSY_DEEPSLATE, GEBlocks.MOSSY_DEEPSLATE
        );
    }
}
