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
public class ModelLeftParallelCurveTCTrack extends ModelBase {

    private IModelCustom modelSmallLeftParallelCurve;
    private IModelCustom modelMediumLeftParallelCurve;
    private IModelCustom modelLargeLeftParallelCurve;

    public ModelLeftParallelCurveTCTrack() {
        modelSmallLeftParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_s_left.obj"));
        modelMediumLeftParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_m_left.obj"));
        modelLargeLeftParallelCurve = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_parallel_l_left.obj"));
    }

    public void renderSmall() {modelSmallLeftParallelCurve.renderAll();}
    public void renderMedium() {modelMediumLeftParallelCurve.renderAll();}
    public void renderLarge() {modelLargeLeftParallelCurve.renderAll();}

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1 );
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {

        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z - 1.5f);

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
            if(type == "small") {
                GL11.glTranslatef(0, 0.0f, -2.0f);
            }
            if(type == "medium") {
                GL11.glTranslatef(0, 0.0f, -2.0f);
            }
            if(type == "large") {
                GL11.glTranslatef(0, 0.0f, -2.0f);
            }
        }

        if (facing == 1) {
            GL11.glRotatef(90, 0, 1, 0);
            if(type == "small") {
            GL11.glTranslatef(-2f, 0.0f, 0f);
             }
            if(type == "medium") {
                GL11.glTranslatef(-2f, 0.0f, 0f);
            }
            if(type == "large") {
                GL11.glTranslatef(-2f, 0.0f, 0f);
            }
        }

        if (facing == 2) {
            if (type == "small") {
                GL11.glTranslatef(0, 0.0f,   2.0f);
            }
            if (type == "medium") {
                GL11.glTranslatef(0, 0.0f, 2.0f);
            }
            if (type == "large") {
                GL11.glTranslatef(0, 0.0f, 2.0f);
            }
        }

        if (facing == 3) {
            GL11.glRotatef(-90, 0, 1, 0);
            if(type == "small") {
                GL11.glTranslatef(2.0f, 0.0f, 0);
            }
            if(type == "medium") {
                GL11.glTranslatef(2.0f, 0.0f, 0);
            }
            if(type == "large") {
                GL11.glTranslatef(2.0f, 0.0f, 0);
            }
        }

        if(type.equals("small"))this.renderSmall();
        if(type.equals("medium"))this.renderMedium();
        if(type.equals("large"))this.renderLarge();

        GL11.glPopMatrix();
    }

}