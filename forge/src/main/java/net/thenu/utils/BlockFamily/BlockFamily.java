package net.thenu.utils.BlockFamily;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class BlockFamily {

    public final RegistryObject<Block> base;
    public final RegistryObject<Block> slab;
    public final RegistryObject<Block> stairs;
    public final RegistryObject<Block> wall;
    public final RegistryObject<Block> fence;
    public final RegistryObject<Block> fenceGate;

    public BlockFamily(RegistryObject<Block> base,
                       RegistryObject<Block> slab,
                       RegistryObject<Block> stairs,
                       RegistryObject<Block> wall,
                       RegistryObject<Block> fence,
                       RegistryObject<Block> fenceGate) {
        this.base = base;
        this.slab = slab;
        this.stairs = stairs;
        this.wall = wall;
        this.fence = fence;
        this.fenceGate = fenceGate;
    }

    public List<Block> getAll() {
        return List.of(base.get(), slab.get(), stairs.get(), wall.get(), fence.get(), fenceGate.get());
    }

    public Block base()      { return base.get(); }
    public Block slab()      { return slab.get(); }
    public Block stairs()    { return stairs.get(); }
    public Block wall()      { return wall.get(); }
    public Block fence()     { return fence.get(); }
    public Block fenceGate() { return fenceGate.get(); }
}
