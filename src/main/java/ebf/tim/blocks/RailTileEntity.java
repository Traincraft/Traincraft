package ebf.tim.blocks;

import ebf.XmlBuilder;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.render.models.Model1x1Rail;
import ebf.tim.utility.ClientProxy;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;


public class RailTileEntity extends TileEntity {

    private AxisAlignedBB boundingBox = null;
    //management variables
    //todo public int snow=0;
    //todo public int timer=0;
    //todo public int overgrowth=0;
    public Integer railGLID=null;
    private int meta=0;
    private XmlBuilder data = new XmlBuilder();


    public int getMeta() {
        return meta;
    }
    public void setMeta(int i){
        meta=i;
        if(worldObj!=null) {
            worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, meta, 2);
        }
        markDirty();
    }

    public void setData(XmlBuilder d){
        data=d;
        markDirty();
    }

    public XmlBuilder getData() {
        return data;
    }

    public void func_145828_a(@Nullable CrashReportCategory report)  {
        if (report == null) {
            if (!worldObj.isRemote) {
                return;
            }

            Minecraft.getMinecraft().entityRenderer.enableLightmap(1);
            TextureManager.adjustLightFixture(worldObj,xCoord,yCoord,zCoord);
            if(railGLID!=null){
                if(!org.lwjgl.opengl.GL11.glIsList(railGLID)){
                    railGLID=null;
                    return;
                }
                org.lwjgl.opengl.GL11.glCallList(railGLID);
                if(ClientProxy.disableCache) {
                    GL11.glDeleteLists(railGLID, 1);
                    railGLID = null;
                }
            }
            if(railGLID==null && data !=null && data.floatArrayMap.size()>0){
                RailShapeCore route =new RailShapeCore().fromXML(data);
                if (route.activePath!=null) {
                    railGLID = net.minecraft.client.renderer.GLAllocation.generateDisplayLists(1);
                    org.lwjgl.opengl.GL11.glNewList(railGLID, org.lwjgl.opengl.GL11.GL_COMPILE);

                    Model1x1Rail.Model3DRail(worldObj, xCoord, yCoord, zCoord, route);

                    org.lwjgl.opengl.GL11.glEndList();
                } // else {DebugUtil.println("NO DATA");}*/
            }
        } else {super.func_145828_a(report);}
    }

    @Override
    public boolean shouldRefresh(Block oldBlock, Block newBlock, int oldMeta, int newMeta, World world, int x, int y, int z) {
        return oldMeta!=newMeta;
    }

    @Override
    public boolean canUpdate(){return false;}

    @Override
    public void updateEntity(){}

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord+1, yCoord, zCoord+1);
        }
        return boundingBox;
    }


    public void dropItem(){

        ItemStack drop = ItemRail.setStackData(
                new ItemStack(TiMItems.railItem, 1), data.getItemStack("rail"),
                data.getItemStack("ballast"), data.getItemStack("ties"), data.getItemStack("wires"));
        if(drop!=null) {
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 0.5f, zCoord, drop));
        }
    }


    public void markDirty() {
        super.markDirty();
        if (this.worldObj != null) {
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
            this.worldObj.func_147453_f(this.xCoord, this.yCoord, this.zCoord, TiMBlocks.railBlock);
            if(worldObj.isRemote && railGLID!=null) {
                org.lwjgl.opengl.GL11.glDeleteLists(railGLID, 1);
                railGLID = null;
            }
        }

    }

    @Override
    public void onChunkUnload() {
        if(TrainsInMotion.proxy.isClient() && railGLID!=null){
            org.lwjgl.opengl.GL11.glDeleteLists(railGLID, 1);
            railGLID = null;
        }
    }

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        if(pkt ==null){return;}
        readFromNBT(pkt.func_148857_g());
        markDirty();
    }


    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setInteger("meta", meta);
        if(data!=null) {
            tag.setString("raildata", data.toXMLString());
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        meta=tag.getInteger("meta");
        if(tag.hasKey("raildata")) {
            data = new XmlBuilder(tag.getString("raildata"));
        }
    }

}
