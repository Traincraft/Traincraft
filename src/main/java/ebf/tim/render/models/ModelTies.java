package ebf.tim.render.models;

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

import static ebf.tim.render.models.Model1x1Rail.addVertexWithOffsetAndUV;

public class ModelTies {


    public static IIcon iicon;
    @Deprecated //we really shouldn't need d0 and d1 with the added simplification of the texturePixel value
    public static float d0, d1;
    //this is the size of a single pixel in vanilla texturepack resolution. Scales with higher resolution texturepacks.
    private static final float texturePixel = (0.0625f*0.0625f)*0.125f;

    public static List<Vec5f> genTiePoints(RailSimpleShape shape){
        if(shape==null){
            return new ArrayList<>();
        }
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
        d0 = iicon.getMinU()+(texturePixel*9);
        d1 = d0 -(texturePixel*3);

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
        List<Vec5f> points= modelPotatoTies(shape, maxWidth, minWidth, scale, block);

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.NORTH.ordinal(),block);
        d1 = iicon.getMinU()+ ((iicon.getMaxU()-iicon.getMinU())*0.09f);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMinV());//NE top corner
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU()+0.005859375f,iicon.getMinV());//NE bottom corner

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU()+0.005859375f,iicon.getMaxV());//NW bottom corner
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//NW top corner

            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.SOUTH.ordinal(), block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);


            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMinV());//SE Bottom
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,d1,iicon.getMinV());//SE Top

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,d1,iicon.getMaxV());//SW Top
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//SW Bottom
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }


        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.UP.ordinal(), block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMinV());//SE Bottom
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//NE Bottom

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMaxU(),iicon.getMaxV());//NE Top
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,iicon.getMaxU(),iicon.getMinV());//SE Top
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.DOWN.ordinal(), block);
        for (Vec5f p :points) {


            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, 0.0625f*scale,iicon.getMinU(),iicon.getMinV());//NW Bottom
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//NE Bottom

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,iicon.getMaxU(),iicon.getMaxV());//NE Top
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,iicon.getMaxU(),iicon.getMinV());//NW Top
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

    }

    public static void modelHDTies(RailSimpleShape shape, float maxWidth, float minWidth, float scale, ItemStack block, int[] color){
        maxWidth += 0.03125f;
        minWidth -= 0.03125f;
        GL11.glTranslatef(0,-0.075f,0);
        List<Vec5f> points= modelPotatoTies(shape,maxWidth,minWidth,scale,block);
        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.NORTH.ordinal(),block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMinV());//NE top corner
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.03125f*scale, 0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV());//NE bottom corner

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.03125f*scale, 0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMaxV());//NW bottom corner
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//NW top corner

            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.SOUTH.ordinal(),block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.03125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMinV());//SE Bottom
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV());//SE Top

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMaxV());//SW Top
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.03125f*scale, -0.0625f*scale,iicon.getMinU(),iicon.getMaxV());//SW Bottom
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }



        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.UP.ordinal(), block);
        d1 = iicon.getMinU()+ ((iicon.getMaxU()-iicon.getMinU())*0.09f);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.03125f*scale, -0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV()+(texturePixel*6));//SE Bottom
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, -0.03125f*scale, 0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV()+(texturePixel*9));//NE Bottom

            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMinV()+(texturePixel*9));//NE Top
            addVertexWithOffsetAndUV(p, (0.125f*scale) + maxWidth, 0, -0.0625f*scale,iicon.getMinU(),iicon.getMinV()+(texturePixel*6));//SE Top
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }

        iicon=  TextureManager.bindBlockTextureFromSide(ForgeDirection.DOWN.ordinal(), block);
        for (Vec5f p :points) {

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.03125f*scale, 0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV()+(texturePixel*9));//NW Bottom
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, -0.03125f*scale, -0.0625f*scale,iicon.getMinU()+texturePixel,iicon.getMinV()+(texturePixel*6));//NE Bottom

            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, -0.0625f*scale,iicon.getMinU(),iicon.getMinV()+(texturePixel*6));//NE Top
            addVertexWithOffsetAndUV(p, (-0.125f*scale) + minWidth, 0, 0.0625f*scale,iicon.getMinU(),iicon.getMinV()+(texturePixel*9));//NW Top
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }


        maxWidth -= 0.03125f;


        GL11.glDisable(GL11.GL_TEXTURE_2D);
        for (Vec5f p: points) {
            GL11.glColor4f(
                    (color[0]-125)* 0.00392156863f,
                    (color[1]-138)* 0.00392156863f,
                    (color[2]-155)* 0.00392156863f, 1);
            /**EAST SIDE SPIKES**/
            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (0.0051485f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.0261015f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            /**WEST SIDE SPIKES**/
            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.630125f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glRotatef(p.u,1,0,0);
            Tessellator.getInstance().startDrawing(GL11.GL_QUADS);

            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, -0.015625f*scale,iicon.getMinU(),iicon.getMinV());//SE
            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0f, -0.015625f*scale,iicon.getMinU(),iicon.getMaxV());//NE

            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0f, 0.015625f*scale,iicon.getMaxU(),iicon.getMaxV());//NW
            addVertexWithOffsetAndUV(p, (-0.598875f*scale) + maxWidth, 0.0375f, 0.015625f*scale,iicon.getMaxU(),iicon.getMinV());//SW
            Tessellator.getInstance().draw();
            GL11.glPopMatrix();
        }
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }
}
