package com.timmania.jamm.block;

import com.timmania.jamm.Jamm;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMagicReagentOre extends Block {

    public BlockMagicReagentOre(String name) {
        super(Material.ROCK);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);

    }
}
