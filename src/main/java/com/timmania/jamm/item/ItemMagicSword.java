package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;
import net.minecraft.item.ItemSword;

public class ItemMagicSword extends ItemSword {

    public ItemMagicSword(ToolMaterial material){
        super(material);
        setCreativeTab(Jamm.JAMM_TAB);
    }
}
