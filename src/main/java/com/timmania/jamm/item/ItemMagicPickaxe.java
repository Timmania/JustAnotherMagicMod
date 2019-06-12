package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.item.ItemPickaxe;

public class ItemMagicPickaxe extends ItemPickaxe {

    public ItemMagicPickaxe(ToolMaterial material){
        super(material);
        setCreativeTab(Jamm.JAMM_TAB);
    }
}
