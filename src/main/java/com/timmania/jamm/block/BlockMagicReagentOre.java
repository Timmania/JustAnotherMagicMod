package com.timmania.jamm.block;

import com.timmania.jamm.Jamm;
import com.timmania.jamm.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMagicReagentOre extends Block {
    Item toDrop;

    public BlockMagicReagentOre(String name) {
        super(Material.ROCK);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);

    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.MAGIC_REAGENT;
    }

    @Override
    public int quantityDropped(Random random){
        return 4 + random.nextInt(2);
    }
}
