package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;
import net.minecraft.item.ItemSpade;

public class ItemMagicShovel extends ItemSpade {

    public ItemMagicShovel(ToolMaterial material){
        super(material);
        setCreativeTab(Jamm.JAMM_TAB);
    }
}
