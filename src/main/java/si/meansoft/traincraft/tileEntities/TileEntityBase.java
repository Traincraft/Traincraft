package si.meansoft.traincraft.tileEntities;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;

public class TileEntityBase extends TileEntity{

    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState){
        return oldState.getBlock() != newState.getBlock();
    }

    @Override
    public final Packet getDescriptionPacket() {
        NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound, true);
        return new SPacketUpdateTileEntity(getPos(), 0, compound);
    }

    @Override
    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        if(pkt != null){
            this.readFromNBT(pkt.getNbtCompound(), true);
        }
    }

    @Override
    public final void writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        this.writeToNBT(compound, false);
    }

    @Override
    public final void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        this.readFromNBT(compound, false);
    }

    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing){

    }

    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing){

    }

    public void syncToClient(){
        Util.sendTilePacketToAllAround(this);
    }
}
