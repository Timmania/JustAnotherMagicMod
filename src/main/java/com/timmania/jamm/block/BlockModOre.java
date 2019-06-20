package com.timmania.jamm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class BlockModOre extends Block {

    Item toDrop;

    public BlockModOre(Material material, String name) {
        super(material);
    }

    public BlockModOre(Material material, String name, Supplier<Item> toDrop, int minDropAmount, int maxDropAmount) {
        super(material);
        this.toDrop= toDrop.get();
    }
}
