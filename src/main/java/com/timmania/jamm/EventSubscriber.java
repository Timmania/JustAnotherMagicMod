package com.timmania.jamm;

import com.timmania.jamm.block.BlockMagicFurnace;
import com.timmania.jamm.init.ModBlocks;
import com.timmania.jamm.item.ItemMagicCoal;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Jamm.MODID)
public final class EventSubscriber {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockMagicFurnace(false).setRegistryName("magic_furnace").setUnlocalizedName(Jamm.MODID + "." + "magic_furnace"),
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemMagicCoal().setRegistryName("magic_coal").setUnlocalizedName(Jamm.MODID + "." + "magic_coal"),
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.MAGIC_FURNACE).setRegistryName(ModBlocks.MAGIC_FURNACE.getRegistryName()),
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
