package moe.eod.mc.hikaze.interestcommands.commands;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class clsCommandLoader {
    public clsCommandLoader(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new clsCommandAntiMobs());
    }
}
