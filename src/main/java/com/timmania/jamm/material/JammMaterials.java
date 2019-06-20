package com.timmania.jamm.material;

import com.timmania.jamm.Jamm;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class JammMaterials {

    public static final Item.ToolMaterial JAMM_TOOL = EnumHelper.addToolMaterial(Jamm.MODID + ":" + "jamm_tool", 2,666, 7.0F, 2.5F, 10);
    public static final ItemArmor.ArmorMaterial JAMM_ARMOR = EnumHelper.addArmorMaterial(Jamm.MODID + "." + "jamm_armor", Jamm.MODID + ":jamm", 16, new int[]{2, 5, 6, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);

}
