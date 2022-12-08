package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelEmbeddedLeftSwitchTCTrack extends ModelBase {
    private IModelCustom modelEmbeddedMediumLeftSwitchActive;
    private IModelCustom modelEmbeddedMediumLeftSwitchInactive;
    private IModelCustom modelEmbeddedMediumLeftParallelSwitchInactive;
    private IModelCustom modelEmbeddedMediumLeftParallelSwitchActive;
    private IModelCustom modelEmbeddedLargeLeftSwitchActive;
    private IModelCustom modelEmbeddedLargeLeftSwitchInactive;
    private IModelCustom modelEmbeddedMediumLeft45degreeSwitchActive;
    private IModelCustom modelEmbeddedMediumLeft45degreeSwitchInActive;

    public ModelEmbeddedLeftSwitchTCTrack() {
        modelEmbeddedMediumLeftSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_small_active_left.obj"));
        modelEmbeddedMediumLeftSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_small_inactive_left.obj"));
        modelEmbeddedMediumLeftParallelSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_parallel_inactive_left.obj"));
        modelEmbeddedMediumLeftParallelSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_parallel_active_left.obj"));
        modelEmbeddedLargeLeftSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_active_left.obj"));
        modelEmbeddedLargeLeftSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_inactive_left.obj"));
        modelEmbeddedMediumLeft45degreeSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_45degree_active_left.obj"));
        modelEmbeddedMediumLeft45degreeSwitchInActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_45degree_inactive_left.obj"));

    }

    public void renderEmbeddedMediumActive() {
        modelEmbeddedMediumLeftSwitchActive.renderAll();
    }
    public void renderEmbeddedMediumInactive() {
        modelEmbeddedMediumLeftSwitchInactive.renderAll();
    }
    public void renderEmbeddedMediumParallelInactive() {
        modelEmbeddedMediumLeftParallelSwitchInactive.renderAll();
    }
    public void renderEmbeddedMediumParallelActive() {
        modelEmbeddedMediumLeftParallelSwitchActive.renderAll();
    }
    public void renderEmbeddedLarge90Active() {
        modelEmbeddedLargeLeftSwitchActive.renderAll();
    }
    public void renderEmbeddedLarge90Inactive() {
        modelEmbeddedLargeLeftSwitchInactive.renderAll();
    }
    public void renderEmbeddedMedium45degreeActive() {modelEmbeddedMediumLeft45degreeSwitchActive.renderAll();}
    public void renderEmbeddedMedium45degreeInActive() {modelEmbeddedMediumLeft45degreeSwitchInActive.renderAll();}


    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, tcRail.getSwitchState(), x, y, z, 1, 1, 1, 1);
    }

    public void render(String type, int facing, boolean active, double x, double y, double z, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);

        if (facing == 3) {
            if(type.equals("medium")){
                GL11.glTranslatef(-1.0f, 0.0f, -3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(0, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, -4.0f);
            }
            if(type.equals("medium_parallel")){
                GL11.glRotatef(-90, 0, 1, 0);
            }
            if(type.equals("medium_45degree")){
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 0);
            }
        }
        if (facing == 1) {
            if(type.equals("medium")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(-1.0f, 0.0f, -3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, -4.0f);
            }
            if(type.equals("medium_parallel")){
                GL11.glRotatef(90, 0, 1, 0);
            }
            if(type.equals("medium_45degree")){
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 0);
            }
        }
        if(facing == 2){
            if(type.equals("medium")){
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(-1.0f, 0.0f, -3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, -4.0f);
            }
            if(type.equals("medium_parallel")){
                //do something if needed
            }
            if(type.equals("medium_45degree")){
                GL11.glRotatef(0, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 0f);
            }
        }
        if(facing == 0){
            if(type.equals("medium")){
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(-1.0f, 0.0f, -3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(.0f, 0.0f, -4.0f);
            }
            if(type.equals("medium_parallel")){
                GL11.glRotatef(180, 0, 1, 0);
            }
            if(type.equals("medium_45degree")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(0f, 0.0f, 0);
            }
        }
        if(type.equals("medium")&&!active)this.renderEmbeddedMediumInactive();
        if(type.equals("medium")&&active)this.renderEmbeddedMediumActive();
        if(type.equals("medium_parallel")&&!active)this.renderEmbeddedMediumParallelInactive();
        if(type.equals("medium_parallel")&&active)this.renderEmbeddedMediumParallelActive();
        if(type.equals("large_90")&&!active)this.renderEmbeddedLarge90Inactive();
        if(type.equals("large_90")&&active)this.renderEmbeddedLarge90Active();
        if(type.equals("medium_45degree")&&!active)this.renderEmbeddedMedium45degreeInActive();
        if(type.equals("medium_45degree")&&active)this.renderEmbeddedMedium45degreeActive();

        //if(type.equals("large"))this.renderLarge();

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
