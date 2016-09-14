package si.meansoft.traincraft.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.Util;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class TileEntityBase extends TileEntity implements IRegistryEntry{

    private static List<Class<? extends TileEntity>> registered = new ArrayList<>();

    private String name;

    public TileEntityBase(String name){
        this.name = name;
    }

    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState){
        return oldState.getBlock() != newState.getBlock();
    }

    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket(){
        NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound, Util.NBTType.SYNC);
        return new SPacketUpdateTileEntity(getPos(), 0, compound);
    }

    @Override
    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        if(pkt != null){
            this.readFromNBT(pkt.getNbtCompound(), Util.NBTType.SYNC);
        }
    }

    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        this.writeToNBT(compound, Util.NBTType.SAVE);
        return compound;
    }

    @Override
    public final void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        this.readFromNBT(compound, Util.NBTType.SAVE);
    }

    public void writeToNBT(NBTTagCompound compound, Util.NBTType type){

    }

    public void readFromNBT(NBTTagCompound compound, Util.NBTType type){

    }

    public void syncToClient(){
        Util.sendTilePacketToAllAround(this);
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public String getRegisterName(){
        return Traincraft.MODID + this.name;
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){

    }

    @Override
    public void ownRegistry(){
        if(!registered.contains(this.getClass())){
            GameRegistry.registerTileEntity(this.getClass(), getRegisterName());
            registered.add(this.getClass());
        }
    }
}
