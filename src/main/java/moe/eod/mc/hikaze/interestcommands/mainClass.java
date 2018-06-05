package moe.eod.mc.hikaze.interestcommands;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
//import net.minecraftforge.fml.common.event.FMLInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import moe.eod.mc.hikaze.interestcommands.common.clsCommonProxy;

@Mod(modid = mainClass.MODID, name = mainClass.NAME, version = mainClass.VERSION, acceptedMinecraftVersions = "1.12.2")
public class mainClass {
    public static final String MODID = "interestingcommands";
    public static final String NAME = "Interesting Commands";
    public static final String VERSION = "a0.0.1.001";
    public static mainClass instance;
    @SidedProxy(clientSide = "moe.eod.mc.hikaze.interestcommands.client.clsClientProxy",
            serverSide = "moe.eod.mc.hikaze.interestcommands.common.clsCommonProxy")
    public static clsCommonProxy proxy;

    //    @EventHandler
//    public void preInit(FMLPreInitializationEvent event)
//    {
//        proxy.preInit(event);
//    }
//
//    @EventHandler
//    public void init(FMLInitializationEvent event)
//    {
//        proxy.init(event);
//    }
//
//    @EventHandler
//    public void postInit(FMLPostInitializationEvent event)
//    {
//        proxy.postInit(event);
//    }
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
