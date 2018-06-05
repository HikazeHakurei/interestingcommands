package moe.eod.mc.hikaze.interestcommands.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.monster.EntityMob;

public class clsCommandAntiMobs extends CommandBase {
    @Override
    public String getName() {
        return "antimobs";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "command.antimobs.usage";
    }


    @Override
    public int getRequiredPermissionLevel() {
        return 1;
    }
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        double x, y, z = 0;
        EntityPlayerMP player = args.length > 0 ? CommandBase.getPlayer(server, sender, args[0]) :
                CommandBase.getCommandSenderAsPlayer(sender);
        if (args.length == 3) {
            try {
                x = Double.parseDouble(args[0]);
                y = Double.parseDouble(args[1]);
                z = Double.parseDouble(args[2]);
                if (java.lang.Math.sqrt(
                        (x-player.posX)*(x-player.posX)+
                        (y-player.posY)*(y-player.posY)+
                        (z-player.posZ)*(z-player.posZ))>=4){
                    throw new WrongUsageException("command.antimobs.toofar");
                }
            } catch (Exception e) {
                throw new WrongUsageException("Invalid Arguments.  command.antimobs.usage");
            }
        } else if (args.length == 1 || args.length == 0) {
            //TODO :Anti-mobs for Player.
            x = player.posX;
            y = player.posY;
            z = player.posZ;
        } else {
            throw new WrongUsageException("Invalid Arguments.  command.antimobs.usage");
        }
    }
    private int[][] getSurfaceLightLevel(int x1,int x2,int z1,int z2,EntityPlayerMP player){
        int dx=java.lang.Math.abs(x1-x2);
        int dz=java.lang.Math.abs(z1-z2);
        int[][] lightlevel=new int[dx+1][dz+1];
        int[][] miny=new int[dx+1][dz+1];
            for (int i=0;i<=dx;i++){
                for (int j=0;j<=dz;j++){
                    miny[i][j]= ;
                    //TODO:find the highest surface
                    BlockPos blockpos=new BlockPos(x1+i,miny[i][j],z1+j);
                    lightlevel[i][j]=player.world.getLightFromNeighbors(blockpos);
                }
        }
        return null;
        //todo:Return
    }
}
