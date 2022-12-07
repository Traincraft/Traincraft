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

import javax.swing.*;

@SideOnly(Side.CLIENT)

public class ModelEmbeddedLeft45DegreeTurnTCTrack {

    private IModelCustom modelEmbeddedMediumLeft45DegreeTurn;
    private IModelCustom modelEmbeddedLargeLeft45DegreeTurn;


    public ModelEmbeddedLeft45DegreeTurnTCTrack(){
        modelEmbeddedMediumLeft45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_curve_45degree_medium_l.obj"));
        modelEmbeddedLargeLeft45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_embedded_curve_45degree_large_l.obj"));

    }

    public void renderMedium() {modelEmbeddedMediumLeft45DegreeTurn.renderAll();}
    public void renderLarge() {modelEmbeddedLargeLeft45DegreeTurn.renderAll();}

    public void render(String type, TileTCRail tcRail, double x, double y, double z) {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, facing, x, y, z, 1, 1, 1, 1);
    }

    public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);

        if (facing == 0) {
            GL11.glRotatef(180, 0, 1, 0);
            GL11.glTranslatef(0.5f,0,0.5f);
            if (type.equals("large"))
                GL11.glTranslatef(-1f,0f,0f);

        }
        if (facing == 1) {
            GL11.glRotatef(90, 0, 1, 0);
            GL11.glTranslatef(0.5f,0,0.5f);
            if (type.equals("large"))
                GL11.glTranslatef(-1f,0f,0f);
        }
        if (facing == 2) {
            GL11.glTranslatef(0.5f,0,0.5f);
            if (type.equals("large"))
                GL11.glTranslatef(-1f,0f,0f);
        }
        if (facing == 3) {
            GL11.glRotatef(-90, 0, 1, 0);
            GL11.glTranslatef(0.5f,0,0.5f);
            if (type.equals("large"))
                GL11.glTranslatef(-1f,0f,0f);
        }

        if (type.equals("medium"))
            this.renderMedium();
        if (type.equals("large"))
            this.renderLarge();


        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}

