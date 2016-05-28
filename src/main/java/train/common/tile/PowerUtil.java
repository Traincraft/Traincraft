package train.common.tile;


import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.List;

public class PowerUtil {
    public PowerUtil(){}

    //function to push energy to connected pipes
    public static void pushEnergy(World world, int x, int y, int z, boolean simulate, ForgeDirection[] sides, EnergyStorage energy) {
        if (world.getTileEntity(x,y,z) instanceof IEnergyProvider) {
            for (ForgeDirection side : sides) {
                if ((x != 0 && y != 0 && z != 0) && ((IEnergyProvider) world.getTileEntity(x, y, z)).canConnectEnergy(side)) {
                    TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
                    if (tile != null && tile instanceof IEnergyReceiver && energy.getEnergyStored() > 0) {
                        if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
                            int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(energy.getMaxExtract(), energy.getEnergyStored()), false);
                            energy.extractEnergy(receive, simulate);
                        }
                    }
                }
            }
        }
    }
}
