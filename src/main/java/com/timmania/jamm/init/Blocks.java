package com.timmania.jamm.init;

import com.google.common.base.Preconditions;
import com.timmania.jamm.block.BlockMagicFurnace;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.EnumFaceDirection;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

public class Blocks {

    public static final Block MAGIC_FURNACE = new BlockMagicFurnace(false);

    public static class RegistrationHandler {
        public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final IForgeRegistry<Block> registry = event.getRegistry();

            final Block[] blocks = {
                    MAGIC_FURNACE
            };

            registry.registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerItemBlocks(final RegistryEvent.Register<Item> event){
            final ItemBlock[] items = {
                    new ItemBlock(MAGIC_FURNACE)
            };

            final IForgeRegistry<Item> registry = event.getRegistry();

            for (final ItemBlock item : items){
                final Block block = item.getBlock();
                final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
                registry.register(item.setRegistryName(registryName));
                ITEM_BLOCKS.add(item);
            }

//            registerTileEntities();
        }
    }

//    private static void registerTileEntities(){
//        registerTileEntity();
//    }
//
//    private static void registerTileEntity(final Class<? extends TileEntity> tileEntityClass, final String name) {
//        GameRegistry.registerTileEntity(tileEntityClass, );
//    }
}
