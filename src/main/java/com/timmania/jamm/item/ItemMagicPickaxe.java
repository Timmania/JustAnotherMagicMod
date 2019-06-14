package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.item.ItemPickaxe;

public class ItemMagicPickaxe extends ItemPickaxe {

    public ItemMagicPickaxe(ToolMaterial material, String name){
        super(material);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }
}
