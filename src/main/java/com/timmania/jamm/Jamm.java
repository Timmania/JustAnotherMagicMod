package com.timmania.jamm;

import com.timmania.jamm.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Jamm.MODID, name = Jamm.NAME,version = Jamm.VERSION, acceptedMinecraftVersions = Jamm.MC_VERSION)
public class Jamm {
    public static final String MODID = "jamm";
    public static final String NAME = "Just Another Magic Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(Jamm.MODID);

    public static final String CLIENT = "com.timmania.jamm.proxy.ClientProxy";
    public static final String SERVER = "com.timmania.jamm.proxy.ServerProxy";
    @SidedProxy(clientSide = Jamm.CLIENT, serverSide = Jamm.SERVER, modId = Jamm.MODID)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
