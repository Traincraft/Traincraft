package train.common.tile;


import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.List;

public class TileEntityGeneratorCore extends TileEntity implements IEnergyProvider {
    private List<ForgeDirection> sides = new ArrayList<ForgeDirection>();
    public TileEntityGeneratorCore(){}

    //function to push energy to connected pipes
    public void pushEnergy(World world, int x, int y, int z, boolean simulate, EnergyStorage energy) {
        System.out.println("out" + energy.getEnergyStored());
        for (ForgeDirection side : sides) {
            if (this.canConnectEnergy(side) && (x!=0 && y!=0 && z!=0)) {
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

    //RF functionality
    @Override
    public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate){return 0;}
    @Override
    public int getEnergyStored(ForgeDirection from){return 0;}
    @Override
    public int getMaxEnergyStored(ForgeDirection from){return 0;}
    @Override
    public boolean canConnectEnergy(ForgeDirection direction){
        //loop for the list of sides
        if (sides.contains(direction)) {
            return true;
        }else{
            return false;
        }
    }

    //sets the sides that the generator is allowed to output to.
    public void setSides(ForgeDirection[] dirs){
        sides = new ArrayList<ForgeDirection>();
        for(ForgeDirection side : dirs) {
            if (!sides.contains(side)) {
                sides.add(side);
            }
        }
    }
}
