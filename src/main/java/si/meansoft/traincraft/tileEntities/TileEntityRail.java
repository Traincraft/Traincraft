package si.meansoft.traincraft.tileEntities;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import si.meansoft.traincraft.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
//TODO Ellpeck save the harvestPositions to NBT
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
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing){
        super.readFromNBT(compound, isForSyncing);
        this.rotation = EnumFacing.getHorizontal(compound.getInteger("rotation"));
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
            GlStateManager.translate(x, y, z);
            GlStateManager.disableRescaleNormal();
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
            GlStateManager.popAttrib();
        }
    }

}
