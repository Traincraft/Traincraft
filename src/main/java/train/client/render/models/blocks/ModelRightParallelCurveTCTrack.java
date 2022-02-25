package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
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
public class ModelRightParallelCurveTCTrack extends ModelBase {

    private IModelCustom modelSmallRightParallelCurve;
    private IModelCustom modelMediumRightParallelCurve;
    private IModelCustom modelLargeRightParallelCurve;

    public ModelRightParallelCurveTCTrack() {
        modelSmallRightParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_s.obj"));
        modelMediumRightParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_m.obj"));
        modelLargeRightParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_l.obj"));
    }

    public void renderSmall() {modelSmallRightParallelCurve.renderAll();}
    public void renderMedium() {modelMediumRightParallelCurve.renderAll();}
    public void renderLarge() {modelLargeRightParallelCurve.renderAll();}

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1 );
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {

        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);
        /** where l = 0 is SOUTH
         *        l = 1 is WEST
         *        l = 2 is NORTH
         *        l = 3 is EAST
         */
        if (facing == 0) {
            GL11.glRotatef(180, 0, 1, 0);
            if (type == "small") {
                GL11.glTranslatef(1, 0.0f, 5);
            }
            if (type == "medium") {
                GL11.glTranslatef(1, 0.0f, 5);
            }
            if (type == "large") {
                GL11.glTranslatef(1, 0.0f, 5);
            }
        }
        if (facing == 1) {
            GL11.glRotatef(90, 0, 1, 0);
            if(type == "small") {
                GL11.glTranslatef(5, 0.0f, - 1);
            }
            if(type == "medium") {
                GL11.glTranslatef(5, 0.0f, - 1);
            }
            if (type == "large") {
                GL11.glTranslatef(5, 0.0f, -1);
            }
        }
        if (facing == 2) {
            GL11.glRotatef(0, 0, 1, 0);
            if (type == "small") {
                GL11.glTranslatef(-1, 0.0f, - 5);
            }
            if (type == "medium") {
                GL11.glTranslatef(-1,0.0f, - 5);
            }
            if (type == "large") {
                GL11.glTranslatef(- 1, 0.0f, - 5);
            }
        }

        if (facing == 3) {
            GL11.glRotatef(-90, 0, 1, 0);
            if (type == "small") {
                GL11.glTranslatef(-5, 0.0f, 1);
            }
            if(type == "medium") {
                GL11.glTranslatef(-5, 0.0f, + 1);
            }
            if (type == "large") {
                GL11.glTranslatef(-5, 0.0f, +1);
            }
        }

        if(type.equals("small"))this.renderSmall();
        if(type.equals("medium"))this.renderMedium();
        if(type.equals("large"))this.renderLarge();

        GL11.glPopMatrix();
    }

}