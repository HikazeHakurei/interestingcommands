package moe.eod.mc.hikaze.interestcommands.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class clsCommandAntiMobs extends CommandBase{
    @Override
    public String getName() {
        return "antimobs";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "command.antimobs.usage";
    }


    @Override
    public int getRequiredPermissionLevel(){
        return 1;
    }



    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        int x,y,z=0;
        EntityPlayerMP player=args.length>0 ? CommandBase.getPlayer(server,sender,args[0]):
                CommandBase.getCommandSenderAsPlayer(sender);
        if (args.length==3){
            try {
                x=Integer.parseInt(args[0]);
                y=Integer.parseInt(args[1]);
                z=Integer.parseInt(args[2]);
            } catch (Exception e){
                throw new WrongUsageException("Invalid Arguments.  command.antimobs.usage");
            }
        }else if (args.length==1){
            //TODO :Anti-mobs for Player.
        }else{
            throw new WrongUsageException("Invalid Arguments.  command.antimobs.usage");
        }
    }
}
