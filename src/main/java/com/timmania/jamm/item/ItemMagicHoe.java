package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;
import net.minecraft.item.ItemHoe;

public class ItemMagicHoe extends ItemHoe {

    public ItemMagicHoe(ToolMaterial material){
        super(material);
        setCreativeTab(Jamm.JAMM_TAB);
    }
}
