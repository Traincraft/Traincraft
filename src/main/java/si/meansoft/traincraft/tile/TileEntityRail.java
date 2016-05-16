package si.meansoft.traincraft.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.blocks.BlockRail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author canitzp
 */
//TODO Ellpeck the save/read method isn't working for harvest positions
public class TileEntityRail extends TileEntityBase{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();
    public EnumFacing rotation = EnumFacing.NORTH;
    //isOn, xOffset, yoffset, zOffset, °x, °y, °z
    protected int[] glArguments = new int[]{1, 0, 0, 0, 0, 0, 0};

    public void placeTrack(List<BlockPos> harvestPositions, EnumFacing rotation){
        this.harvestPositions = harvestPositions;
        this.rotation = rotation;
    }

    public TileEntityRail renderOff(){
        this.glArguments[0] = 0;
        return this;
    }

    public TileEntityRail renderTranslate(int x, int y, int z){
        this.glArguments[1] = x;
        this.glArguments[2] = y;
        this.glArguments[3] = z;
        return this;
    }

    public TileEntityRail renderRotate(int x, int y, int z){
        this.glArguments[4] = x;
        this.glArguments[5] = y;
        this.glArguments[6] = z;
        return this;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing){
        super.writeToNBT(compound, isForSyncing);
        compound.setInteger("rotation", this.rotation.getHorizontalIndex());

        NBTTagList list = new NBTTagList();
        for(BlockPos pos : this.harvestPositions){
            NBTTagCompound tag = new NBTTagCompound();
            tag.setIntArray("Coords", new int[]{pos.getX(), pos.getY(), pos.getZ()});
        }
        compound.setTag("HarvestPositions", list);

        compound.setIntArray("glArgs", this.glArguments);

    }

    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing){
        super.readFromNBT(compound, isForSyncing);
        this.rotation = EnumFacing.getHorizontal(compound.getInteger("rotation"));

        NBTTagList list = compound.getTagList("HarvestPositions", 10);
        for(int i = 0; i < list.tagCount(); i++){
            NBTTagCompound tag = list.getCompoundTagAt(i);
            int[] coords = tag.getIntArray("Coords");

            BlockPos pos = new BlockPos(coords[0], coords[1], coords[2]);
            if(!this.harvestPositions.contains(pos)){
                this.harvestPositions.add(pos);
            }
        }

        this.glArguments = compound.getIntArray("glArgs");

    }

    @SideOnly(Side.CLIENT)
    public static class RailRenderer extends TileEntitySpecialRenderer<TileEntityRail>{
        IBakedModel bakedModel;
        ResourceLocation currentLoc;
        @Override
        public void renderTileEntityAt(TileEntityRail te, double x, double y, double z, float partialTicks, int destroyStage){
            ResourceLocation newLoc = ((BlockRail)te.worldObj.getBlockState(te.pos).getBlock()).railResources;
            if(currentLoc == null || newLoc != this.currentLoc){
                this.bakedModel = null;
                this.currentLoc = newLoc;
            }
            if(currentLoc != null && te.glArguments != null && te.glArguments[0] == 1){
                GlStateManager.pushAttrib();
                GlStateManager.pushMatrix();
                //GlStateManager.enableRescaleNormal();
                GlStateManager.disableLighting();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                //GlStateManager.enableBlend();
                //GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GlStateManager.translate(x + 0.5, y, z + 0.5);

                GlStateManager.rotate(te.glArguments[4], 1, 0, 0);
                GlStateManager.rotate(te.glArguments[5], 0, 1, 0);
                GlStateManager.rotate(te.glArguments[6], 0, 0, 1);

                GlStateManager.translate(te.glArguments[1], te.glArguments[2], te.glArguments[3]);

                this.bakedModel = Util.renderObjectFile(this.bakedModel, this.currentLoc, te, 0, 0, 0);
                GlStateManager.enableLighting();
                GlStateManager.popMatrix();
                //GlStateManager.disableBlend();
                GlStateManager.popAttrib();
            } else {
                te.syncToClient();
            }
        }
    }

}
