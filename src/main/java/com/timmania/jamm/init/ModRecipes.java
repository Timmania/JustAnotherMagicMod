package com.timmania.jamm.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void registerRecipes() {
        addSmeltingRecipes();
    }

    private static void addSmeltingRecipes() {
        GameRegistry.addSmelting(ModItems.MAGIC_REAGENT, new ItemStack(ModItems.MAGIC_IRON), 0.35F);
    }
}
