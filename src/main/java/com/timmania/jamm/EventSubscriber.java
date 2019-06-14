package com.timmania.jamm;

import com.timmania.jamm.block.BlockMagicFurnace;
import com.timmania.jamm.block.BlockMagicReagentOre;
import com.timmania.jamm.init.ModBlocks;
import com.timmania.jamm.item.*;
import com.timmania.jamm.material.JammMaterials;

import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
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
                new BlockMagicFurnace(false, "magic_furnace"),
                new BlockMagicReagentOre("magic_reagent_ore")
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemMagicCoal("magic_coal"),
                new ItemMagicReagent("magic_reagent"),
                new ItemMagicIron("magic_iron"),

                new ItemMagicPickaxe(JammMaterials.JAMM_TOOL, "magic_pickaxe"),
                new ItemMagicAxe(JammMaterials.JAMM_TOOL, "magic_axe"),
                new ItemMagicShovel(JammMaterials.JAMM_TOOL, "magic_shovel"),
                new ItemMagicHoe(JammMaterials.JAMM_TOOL, "magic_hoe"),
                new ItemMagicSword(JammMaterials.JAMM_TOOL, "magic_sword"),


                new ItemMagicArmor(JammMaterials.JAMM_ARMOR, EntityEquipmentSlot.HEAD, "magic_helmet"),
                new ItemMagicArmor(JammMaterials.JAMM_ARMOR, EntityEquipmentSlot.CHEST, "magic_chestplate"),
                new ItemMagicArmor(JammMaterials.JAMM_ARMOR, EntityEquipmentSlot.LEGS, "magic_leggings"),
                new ItemMagicArmor(JammMaterials.JAMM_ARMOR, EntityEquipmentSlot.FEET, "magic_leggins"),

        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.MAGIC_FURNACE).setRegistryName(ModBlocks.MAGIC_FURNACE.getRegistryName()),
                new ItemBlock(ModBlocks.MAGIC_REAGENT_ORE).setRegistryName(ModBlocks.MAGIC_REAGENT_ORE.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
