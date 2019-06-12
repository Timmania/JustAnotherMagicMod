package com.timmania.jamm.tabs;

import com.timmania.jamm.Jamm;
import com.timmania.jamm.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JammTab extends CreativeTabs {

    public JammTab() {
        super(Jamm.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.MAGIC_COAL);
    }
}
