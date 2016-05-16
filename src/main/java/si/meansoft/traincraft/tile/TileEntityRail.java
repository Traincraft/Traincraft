package si.meansoft.traincraft.tile;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import si.meansoft.traincraft.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityRail extends TileEntityBase{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();
    public EnumFacing rotation = EnumFacing.NORTH;

    public void placeTrack(List<BlockPos> harvestPositions, EnumFacing rotation){
        this.harvestPositions = harvestPositions;
        this.rotation = rotation;
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
    }

    public static class RailRenderer extends TileEntitySpecialRenderer<TileEntityRail>{
        IBakedModel bakedModel;
        ResourceLocation modelLocation;
        public RailRenderer(ResourceLocation modelLocation){
            this.modelLocation = modelLocation;
        }
        @Override
        public void renderTileEntityAt(TileEntityRail te, double x, double y, double z, float partialTicks, int destroyStage){
            GlStateManager.pushAttrib();
            GlStateManager.pushMatrix();
            GlStateManager.enableRescaleNormal();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GlStateManager.translate(x + 0.5, y, z + 0.5);
            switch(te.rotation){
                case EAST:{
                    GlStateManager.rotate(90, 0, 1, 0);
                    GlStateManager.translate(-1, 0, 0);
                    break;
                }
                case WEST:{
                    GlStateManager.rotate(-90, 0, 1, 0);
                    GlStateManager.translate(0, 0, -1);
                    break;
                }
            }
            this.bakedModel = Util.renderObjectFile(this.bakedModel, modelLocation, te, 0, 0, 0);
            GlStateManager.popMatrix();
            GlStateManager.disableBlend();
            GlStateManager.popAttrib();
        }
    }

}
