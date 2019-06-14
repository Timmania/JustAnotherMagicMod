package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;
import net.minecraft.item.ItemSpade;

public class ItemMagicShovel extends ItemSpade {

    public ItemMagicShovel(ToolMaterial material, String name){
        super(material);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }
}
