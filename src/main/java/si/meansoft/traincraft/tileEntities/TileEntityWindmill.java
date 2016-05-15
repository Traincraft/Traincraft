package si.meansoft.traincraft.tileEntities;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.Util;

/**
 * @author canitzp
 */
public class TileEntityWindmill extends TileEntity implements ITickable{

    private EnumFacing rotation = EnumFacing.NORTH;
    public int currentWindStrenght;

    public void placeWindmill(EnumFacing rotation){
        this.rotation = rotation;
    }

    public int getWindValue(){
        int windStrength = (int) (currentWindStrenght + (((double) getPos().getY() / 256) * 10));
        if (getWorld().isThundering()) {
            windStrength *= 7.5;
        }else if (getWorld().isRaining()) {
            windStrength *= 4.5;
        }
        if (windStrength > 80){
            windStrength = 80;
        } else if(windStrength <= 0){
            windStrength = 1;
        }
        return windStrength;
    }

    @Override
    public void update(){

    }

    public static class WindmillRenderer extends TileEntitySpecialRenderer<TileEntityWindmill>{
        IBakedModel currentModel, currentModelWheel;
        ResourceLocation modelLocation = TraincraftResources.OBJ_WINDMILL.newOBJLocation();
        ResourceLocation modelLocationWheel = TraincraftResources.OBJ_WINDMILLWHEEL.newOBJLocation();
        private long lastframe;
        private float wheel;
        @Override
        public void renderTileEntityAt(TileEntityWindmill te, double x, double y, double z, float partialTicks, int destroyStage){
            GlStateManager.pushAttrib();
            GlStateManager.pushMatrix();
            GlStateManager.translate(x, y, z);
            GlStateManager.disableRescaleNormal();
            switch(te.rotation){
                case NORTH: GlStateManager.rotate(90, 0, 1, 0); break;
                case SOUTH: GlStateManager.rotate(-90, 0, 1, 0); break;
                case WEST: GlStateManager.rotate(180, 0, 1, 0); break;
                default: case EAST: break;
            }
            GlStateManager.scale(0.5f, 0.5f, 0.5f);
            this.currentModel = Util.renderObjectFile(this.currentModel, modelLocation, te, 0, 0, 0);
            GlStateManager.translate(0.5, 1.43, 0.5);
            GlStateManager.scale(0.45f, 0.45f, 0.45f);
            long now = System.nanoTime();
            int elapsed = (int) ((now - lastframe) / (1000 * (100 - (te.getWindValue()))));
            wheel -= (float) elapsed / (250.0f);
            lastframe = now;
            GlStateManager.rotate(-(wheel*0.45F), 0F, 0F, 1F);
            this.currentModelWheel = Util.renderObjectFile(this.currentModelWheel, modelLocationWheel, te, 0, 0, 0);
            GlStateManager.popMatrix();
            GlStateManager.popAttrib();
        }
    }

}
