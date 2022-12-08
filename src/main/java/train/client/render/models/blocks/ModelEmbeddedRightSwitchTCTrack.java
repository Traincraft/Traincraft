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
public class ModelEmbeddedRightSwitchTCTrack extends ModelBase {
    private IModelCustom modelEmbeddedMediumRightSwitchActive;
    private IModelCustom modelEmbeddedMediumRightSwitchInactive;
    private IModelCustom modelEmbeddedMediumRightParallelSwitchInactive;
    private IModelCustom modelEmbeddedMediumRightParallelSwitchActive;
    private IModelCustom modelEmbeddedLargeRightSwitchActive;
    private IModelCustom modelEmbeddedLargeRightSwitchInactive;

    private IModelCustom modelEmbeddedMediumRight45degreeSwitchActive;
    private IModelCustom modelEmbeddedMediumRight45degreeSwitchInActive;

    public ModelEmbeddedRightSwitchTCTrack() {
        modelEmbeddedMediumRightSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_small_active.obj"));
        modelEmbeddedMediumRightSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_small_inactive.obj"));
        modelEmbeddedMediumRightParallelSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_parallel_inactive.obj"));
        modelEmbeddedMediumRightParallelSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_parallel_active.obj"));
        modelEmbeddedLargeRightSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_active.obj"));
        modelEmbeddedLargeRightSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_inactive.obj"));
        modelEmbeddedMediumRight45degreeSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_45degree_active.obj"));
        modelEmbeddedMediumRight45degreeSwitchInActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_switch_medium_45degree_inactive.obj"));

    }

    public void renderEmbeddedMediumActive() {
        modelEmbeddedMediumRightSwitchActive.renderAll();
    }
    public void renderEmbeddedMediumInactive() {
        modelEmbeddedMediumRightSwitchInactive.renderAll();
    }
    public void renderEmbeddedMediumParallelInactive() {
        modelEmbeddedMediumRightParallelSwitchInactive.renderAll();
    }
    public void renderEmbeddedMediumParallelActive() {
        modelEmbeddedMediumRightParallelSwitchActive.renderAll();
    }
    public void renderEmbeddedLarge90Active() {
        modelEmbeddedLargeRightSwitchActive.renderAll();
    }
    public void renderEmbeddedLarge90Inactive() {
        modelEmbeddedLargeRightSwitchInactive.renderAll();
    }
    public void renderEmbeddedMedium45degreeActive() {modelEmbeddedMediumRight45degreeSwitchActive.renderAll();}
    public void renderEmbeddedMedium45degreeInActive() {modelEmbeddedMediumRight45degreeSwitchInActive.renderAll();}

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
                GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(0, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 4.0f);
            }
            if(type.equals("medium_parallel")){
                GL11.glRotatef(-90, 0, 1, 0);
            }
            if(type.equals("medium_45degree")){
                GL11.glTranslatef(0.0f, 0.0f, 0);
                GL11.glRotatef(-90, 0, 1, 0);
            }
        }
        if (facing == 1) {
            if(type.equals("medium")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 4.0f);
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
                GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 4.0f);
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
                GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
            }
            if(type.equals("large_90")){
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 4.0f);
            }
            if(type.equals("medium_parallel")){
                GL11.glRotatef(180, 0, 1, 0);
            }
            if(type.equals("medium_45degree")){
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(0.0f, 0.0f, 0.0f);
            }
        }
        if(type.equals("medium")&&!active)this.renderEmbeddedMediumInactive();
        if(type.equals("medium")&&active)this.renderEmbeddedMediumActive();
        if(type.equals("medium_parallel")&&!active)this.renderEmbeddedMediumParallelInactive();
        if(type.equals("medium_parallel")&&active)this.renderEmbeddedMediumParallelActive();
        if(type.equals("large_90")&&!active)this.renderEmbeddedLarge90Inactive();
        if(type.equals("large_90")&&active)this.renderEmbeddedLarge90Active();
        if(type.equals("medium_45degree")&&active)this.renderEmbeddedMedium45degreeActive();
        if(type.equals("medium_45degree")&&!active)this.renderEmbeddedMedium45degreeInActive();

        //if(type.equals("large"))this.renderLarge();

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }

}

