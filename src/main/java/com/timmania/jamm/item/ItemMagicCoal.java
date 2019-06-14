package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.item.Item;

public class ItemMagicCoal extends Item {
    public ItemMagicCoal(String name){
        super();

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }
}
