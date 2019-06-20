package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemMagicArmor extends ItemArmor {

    public ItemMagicArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, 0,equipmentSlotIn);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }
}
