package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.item.ItemAxe;

public class ItemMagicAxe extends ItemAxe {

    public ItemMagicAxe(ToolMaterial material, float damage, float speed){
        super(material, damage, speed);
        setCreativeTab(Jamm.JAMM_TAB);
    }

    public ItemMagicAxe(ToolMaterial material, String unlocalizedName, String registryName) {
        this(material, 8.0F, -3.1F);
    }
}
