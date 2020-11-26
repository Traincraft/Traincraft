package ebf.tim.render.models;

import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.utility.Vec5f;
import fexcraft.tmt.slim.Tessellator;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

import static ebf.tim.render.models.Model1x1Rail.addVertexWithOffsetAndUV;

public class ModelBallast {
    public static IIcon iicon;

    public static void modelPotatoBallast(RailShapeCore shape, float maxWidth, float minWidth, float scale, ItemStack b){
        GL11.glTranslated(0, 0.1*scale, 0);

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.UP.ordinal(), b);

        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        float ballastloop=0;
        float d0;
        //todo loop this dependant on @dist, if it's greater than 1.75
        for (Vec5f p : shape.activePath) {
            d0 = iicon.getMinU();
            d0+= (iicon.getMaxU()-iicon.getMinU())*(ballastloop*(1f/(shape.activePath.size()-1)));

            addVertexWithOffsetAndUV(p, (0.0625f*scale) + maxWidth, 0, 0,d0,iicon.getMinV());
            addVertexWithOffsetAndUV(p, (-0.0625f*scale) + minWidth, 0, 0,d0,iicon.getMaxV());
            ballastloop++;
        }
        Tessellator.getInstance().draw();
    }

    public static void model3DBallast(RailShapeCore shape, float maxWidth, float minWidth, float scale, ItemStack b){
        modelPotatoBallast(shape, maxWidth, minWidth, scale, b);

        float d0;
        //west side
        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.WEST.ordinal(), b);

        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        float ballastloop=0;
        for (Vec5f p : shape.activePath) {
            d0 = iicon.getMinU();
            d0+= (iicon.getMaxU()-iicon.getMinU())*(ballastloop*(1f/(shape.activePath.size()-1)));

            addVertexWithOffsetAndUV(p, (0.1825f*scale) + maxWidth, -0.135f*scale, 0,d0,iicon.getMinV());
            addVertexWithOffsetAndUV(p, (0.0625f*scale) + maxWidth, 0, 0,d0,iicon.getMinV()+((iicon.getMaxV()-iicon.getMinV())*0.15f));
            ballastloop++;
        }
        Tessellator.getInstance().draw();

        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslated(0, 0.1*scale, 0);

        //east side
        TextureManager.bindBlockTextureFromSide(ForgeDirection.EAST.ordinal(), b);
        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        ballastloop=0;
        for (Vec5f p : shape.activePath) {
            d0 = iicon.getMinU();
            d0+= (iicon.getMaxU()-iicon.getMinU())*(ballastloop*(1f/(shape.activePath.size()-1)));

            addVertexWithOffsetAndUV(p, -0.0625f + minWidth, 0, 0,d0,iicon.getMinV());
            addVertexWithOffsetAndUV(p, -0.1825f + minWidth, -0.135f, 0,d0,iicon.getMinV()+((iicon.getMaxV()-iicon.getMinV())*0.15f));
            ballastloop++;
        }
        Tessellator.getInstance().draw();
    }


    public static void modelHDBallast(RailShapeCore shape, float maxWidth, float minWidth, float scale, ItemStack b){
        GL11.glTranslatef(0,-0.0625f,0);
        modelPotatoBallast(shape, maxWidth, minWidth, scale, b);

        float d0;
        //west side
        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.WEST.ordinal(), b);

        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        float ballastloop=0;
        for (Vec5f p : shape.activePath) {
            d0 = iicon.getMinU();
            d0+= (iicon.getMaxU()-iicon.getMinU())*(ballastloop*(1f/(shape.activePath.size()-1)));

            addVertexWithOffsetAndUV(p, (0.1825f*scale) + maxWidth, -0.0375f*scale, 0,d0,iicon.getMinV());
            addVertexWithOffsetAndUV(p, (0.0625f*scale) + maxWidth, 0, 0,d0,iicon.getMinV()+((iicon.getMaxV()-iicon.getMinV())*0.15f));
            ballastloop++;
        }
        Tessellator.getInstance().draw();


        //east side
        TextureManager.bindBlockTextureFromSide(ForgeDirection.EAST.ordinal(), b);
        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        ballastloop=0;
        for (Vec5f p : shape.activePath) {
            d0 = iicon.getMinU();
            d0+= (iicon.getMaxU()-iicon.getMinU())*(ballastloop*(1f/(shape.activePath.size()-1)));

            addVertexWithOffsetAndUV(p, -0.0625f + minWidth, 0, 0,d0,iicon.getMinV());
            addVertexWithOffsetAndUV(p, -0.1825f + minWidth, -0.0375f, 0,d0,iicon.getMinV()+((iicon.getMaxV()-iicon.getMinV())*0.15f));
            ballastloop++;
        }
        Tessellator.getInstance().draw();
    }
}
