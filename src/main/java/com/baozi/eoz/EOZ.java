package com.baozi.eoz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EOZ.MODID, name = EOZ.NAME, version = EOZ.VERSION)
public class EOZ {
    public static final String MODID = "eoz";
    public static final String NAME = "Evolution Of Zijing";
    public static final String VERSION = "@EOZVERSION@";
    @Mod.Instance
    public static EOZ instance;
    @SidedProxy(clientSide = "com.baozi.eoz.ClientProxy", serverSide = "com.baozi.eoz.CommonProxy")
    public static CommonProxy proxy;
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
