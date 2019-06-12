package com.timmania.jamm.client;

import com.timmania.jamm.Jamm;
import com.timmania.jamm.init.ModBlocks;
import com.timmania.jamm.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Jamm.MODID, value = Side.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        registerModel(ModItems.MAGIC_COAL);
        registerModel(ModItems.MAGIC_AXE);
        registerModel(ModItems.MAGIC_PICKAXE);
        registerModel(ModItems.MAGIC_HOE);
        registerModel(ModItems.MAGIC_SHOVEL);
        registerModel(ModItems.MAGIC_SWORD);
        registerModel(Item.getItemFromBlock(ModBlocks.MAGIC_FURNACE));
    }

    private static void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
