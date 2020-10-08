package ebf.tim.models.rails;

import ebf.tim.blocks.rails.RailSimpleShape;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.Vec5f;
import fexcraft.tmt.slim.Tessellator;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

import static ebf.tim.models.rails.Model1x1Rail.addVertexWithOffsetAndUV;

public class ModelTies {


    public static IIcon iicon;
    public static float d0, d1;

    public static List<Vec5f> genTiePoints(RailSimpleShape shape){
        float originalT=1f/shape.getSleeperCount();//1/6

        float t = originalT*-1.5f;
        List<Vec5f> points = new ArrayList<>();
        while (t <= 1+(originalT*0.51f)) {
            //define position
            points.add(new Vec5f(
                    (((1f - t) * (1f - t)) * shape.getStart().xCoord) + (2f * (1f - t) * t * shape.getCenter().xCoord) + ((t * t) * shape.getEnd().xCoord),//X
                    (((1f - t) * (1f - t)) * shape.getStart().yCoord) + (2f * (1f - t) * t * shape.getCenter().yCoord) + ((t * t) * shape.getEnd().yCoord),//Y
                    (((1f - t) * (1f - t)) * shape.getStart().zCoord) + (2f * (1f - t) * t * shape.getCenter().zCoord) + ((t * t) * shape.getEnd().zCoord)//X
                    ,0,0));
            t += originalT;
        }
        //define rotations
        for (int i=1; i < points.size() - 1; i++) {
            points.get(i).setUV(0, CommonUtil.atan2degreesf(
                    points.get(i-1).zCoord - (points.get(i+1).zCoord),
                    points.get(i-1).xCoord - (points.get(i+1).xCoord)));
        }
        //remove the unnecessary points so we can use foreach loops
        points.remove(0);
        points.remove(0);
        points.remove(points.size()-1);
        return points;
    }


    public static List<Vec5f> modelPotatoTies(RailSimpleShape shape, float maxWidth, float minWidth, float scale, ItemStack block){
        List<Vec5f> points = genTiePoints(shape);

        GL11.glTranslated(0, 0.125*scale, 0);
        //top side
        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.WEST.ordinal(), block);
        d0 = iicon.getMinU()+ ((iicon.getMaxU()-iicon.getMinU())*0.44f);
        d1 = d0+ ((iicon.getMaxU()-iicon.getMinU())*0.09f);

        for (Vec5f point : points) {

            GL11.glPushMatrix();
            GL11.glRotatef(point.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(point, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,d0, iicon.getMinV());
            addVertexWithOffsetAndUV(point, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,d1, iicon.getMinV());

            addVertexWithOffsetAndUV(point, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,d1,iicon.getMaxV());
            addVertexWithOffsetAndUV(point, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,d0, iicon.getMaxV());
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }
        return points;
    }


    public static void model3DTies(RailSimpleShape shape, float maxWidth, float minWidth, float scale, ItemStack block){
        //GL11.glTranslated(0, 0.125, 0);
        List<Vec5f> points= modelPotatoTies(shape, maxWidth, minWidth, scale, block);

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.NORTH.ordinal(),block);
        d1 = iicon.getMinU()+ ((iicon.getMaxU()-iicon.getMinU())*0.09f);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMinV());
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, 0.0625f*scale,d1,iicon.getMinV());

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU(),iicon.getMaxV());
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,d1,iicon.getMaxV());

            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.SOUTH.ordinal(), block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);


            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMinV());
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,d1,iicon.getMinV());

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,d1,iicon.getMaxV());
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMaxV());
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }


        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.UP.ordinal(), block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMinV());
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU(),iicon.getMaxV());

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMaxU(),iicon.getMaxV());
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,iicon.getMaxU(),iicon.getMinV());
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.DOWN.ordinal(), block);
        for (Vec5f p :points) {


            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU(),iicon.getMinV());
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMaxV());

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,iicon.getMaxU(),iicon.getMaxV());
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,iicon.getMaxU(),iicon.getMinV());
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }


    }

    public void modelHDTies(RailSimpleShape shape, float maxWidth, float minWidth, float scale, ItemStack block){
        model3DTies(shape, maxWidth, minWidth, scale, block);
        //todo HD ties should all the nails
    }
}
