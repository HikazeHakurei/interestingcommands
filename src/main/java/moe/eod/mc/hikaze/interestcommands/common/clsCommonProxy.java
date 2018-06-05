package moe.eod.mc.hikaze.interestcommands.common;

import moe.eod.mc.hikaze.interestcommands.commands.clsCommandLoader;
//import net.minecraftforge.fml.common.event.FMLInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class clsCommonProxy {
    //    public void preInit(FMLPreInitializationEvent event)
//    {
//
//    }
//
//    public void init(FMLInitializationEvent event)
//    {
//
//    }
//
//    public void postInit(FMLPostInitializationEvent event)
//    {
//
//    }
    public void serverStarting(FMLServerStartingEvent event) {
        new clsCommandLoader(event);
    }
}
