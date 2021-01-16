package ebf.tim.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_NORMALIZE;
import static org.lwjgl.opengl.GL11.GL_SMOOTH;

public class TileRenderFacing extends TileEntity {
    public byte facing =-1;
    private Integer blockGLID =null;
    private AxisAlignedBB boundingBox = null;
    private BlockDynamic host;

    public TileRenderFacing(BlockDynamic block){
        host=block;
    }

    public TileRenderFacing(){}

    public TileRenderFacing setFacing(int direction){
        facing=(byte) direction;
        this.markDirty();
        return this;
    }

    public TileRenderFacing setFacing(ForgeDirection direction){
        //this follows our own orders, which don't make a lot of sense, but it works.
        switch (direction){
            case SOUTH:{facing=0;break;}
            case EAST:{facing=1;break;}
            case WEST:{facing=3;break;}
            case NORTH:{facing=2;break;}
            case DOWN:{facing=4;break;}
            case UP:{facing=5;break;}
        }
        this.markDirty();
        return this;
    }

    public ForgeDirection getFacing(){
        //1.8.9+ it's getHorizontal
        return ForgeDirection.getOrientation((int)facing);
    }

    @Override
    public void func_145828_a(CrashReportCategory r){
        if(r==null){
            if(host.getTexture(xCoord,yCoord,zCoord)!=null) {
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                TextureManager.bindTexture(host.getTexture(xCoord,yCoord,zCoord));
            } else {
                GL11.glDisable(GL11.GL_TEXTURE_2D);
            }


            if(blockGLID ==null){
                blockGLID=org.lwjgl.opengl.GL11.glGenLists(1);
                org.lwjgl.opengl.GL11.glNewList(blockGLID, org.lwjgl.opengl.GL11.GL_COMPILE);
                GL11.glPushMatrix();
                GL11.glEnable(GL11.GL_LIGHTING);
                if(worldObj!=null) {
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1);
                    TextureManager.fixEntityLighting();
                    TextureManager.adjustLightFixture(worldObj, xCoord, yCoord, zCoord);
                } else {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1);
                }
                GL11.glTranslatef(0.5f,0.5f,0.5f);
                switch (facing){
                    //north
                    case 0:{GL11.glRotatef(90,0,1,0);break;}
                    //east
                    case 1:{break;}
                    //south
                    case 2:{GL11.glRotatef(270,0,1,0);break;}
                    //west
                    case 3:{GL11.glRotatef(180,0,1,0);break;}
                }
                GL11.glRotatef(180,1,0,0);

                if(host.model!=null) {
                    host.model.render(null, 0, 0, 0, 0, 0, 0);
                } else if(host.tesr instanceof TileEntitySpecialRenderer) {
                    ((TileEntitySpecialRenderer) host.tesr).renderTileEntityAt(this,0,0,0,0);
                } else {
                    cube.render();
                }

                if(worldObj!=null) {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1);
                }
                GL11.glPopMatrix();
                org.lwjgl.opengl.GL11.glEndList();

            } else {

                if(!org.lwjgl.opengl.GL11.glIsList(blockGLID)){
                    blockGLID=null;
                    return;
                }
                org.lwjgl.opengl.GL11.glCallList(blockGLID);
                if(ebf.tim.utility.ClientProxy.disableCache){
                    org.lwjgl.opengl.GL11.glDeleteLists(blockGLID,1);
                    blockGLID =null;
                }
            }
        } else{
            super.func_145828_a(r);
        }
    }

    @Override
    public boolean canUpdate(){return false;}

    @Override
    public void updateEntity(){}

    @Override
    public boolean shouldRefresh(Block oldBlock, Block newBlock, int oldMeta, int newMeta, World world, int x, int y, int z) {
        return (oldBlock != newBlock);
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if(this.worldObj != null) {
            worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
            worldObj.markTileEntityChunkModified(xCoord, yCoord, zCoord, this);
            this.worldObj.func_147453_f(this.xCoord, this.yCoord, this.zCoord, host);
            if (worldObj.isRemote && blockGLID != null) {
                org.lwjgl.opengl.GL11.glDeleteLists(blockGLID, 1);
                blockGLID = null;
            }
        }
    }

    @Override
    public void onChunkUnload() {
        if(TrainsInMotion.proxy.isClient() && blockGLID!=null){
            org.lwjgl.opengl.GL11.glDeleteLists(blockGLID, 1);
            blockGLID = null;
        }
    }

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        if(pkt ==null){return;}
        readFromNBT(pkt.func_148857_g());
        markDirty();
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord+1, yCoord, zCoord+1);
        }
        return boundingBox;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setByte("f", facing);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        facing = tag.getByte("f");
        if(worldObj!=null && worldObj.isRemote) {
            markDirty();
        }
    }

    public void syncTileEntity(){
        for(Object o : this.worldObj.playerEntities){
            if(o instanceof EntityPlayerMP){
                EntityPlayerMP player = (EntityPlayerMP) o;
                if(player.getDistance(xCoord, yCoord, zCoord) <= 64) {
                    player.playerNetServerHandler.sendPacket(this.getDescriptionPacket());
                }
            }
        }
    }

    //todo: better control for render distance
    /*@SideOnly(Side.CLIENT)
    @Override
    public double getMaxRenderDistanceSquared() {
        return super.getMaxRenderDistanceSquared();
    }*/

    public static final ModelRendererTurbo cube = new ModelRendererTurbo((ModelBase) null, 0,0,64,32).addBox(-8,-8,-8,16,16,16);

}
