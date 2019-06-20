package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.item.ItemAxe;

public class ItemMagicAxe extends ItemAxe {

    public ItemMagicAxe(ToolMaterial material, float damage, float speed, String name){
        super(material, damage, speed);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }

    public ItemMagicAxe(ToolMaterial material, String name) {
        this(material, 8.0F, -3.1F, name);
    }
}
