package ebf.tim.render.models;

import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.utility.Vec6f;
import fexcraft.tmt.slim.Tessellator;
import org.lwjgl.opengl.GL11;

import java.util.List;

import static ebf.tim.render.models.Model1x1Rail.addVertexWithOffset;

public class ModelRail {

    public static void drawFace(List<Vec6f> path, float gaugeOffset, float x1, float x2, float y1, float y2, float scale){
        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        for (Vec6f p : path) {
            addVertexWithOffset(p, (x1*scale) + gaugeOffset, y1*scale, 0);
            addVertexWithOffset(p, (x2*scale) + gaugeOffset, y2*scale, 0);
        }
        Tessellator.getInstance().draw();
    }
    public static void railShading(float offset, int[] color, int darkRed, int darkGreen, int darkBlue, boolean pass0){
        if(offset>0 ^ !pass0) {
            GL11.glColor4f(
                    (color[0])* 0.00392156863f,
                    (color[1])* 0.00392156863f,
                    (color[2])* 0.00392156863f, 1);
        } else {
            GL11.glColor4f(
                    (color[0]-darkRed)* 0.00392156863f,
                    (color[1]-darkGreen)* 0.00392156863f,
                    (color[2]-darkBlue)* 0.00392156863f, 1);
        }
    }
    public static void centerShading(float offset, int[] color, int dark, boolean pass0){
        if(offset>0 ^ !pass0) {
            GL11.glColor4f(
                    (color[0]) * 0.00392156863f,
                    (color[1]) * 0.00392156863f,
                    (color[2]) * 0.00392156863f, 1);
        } else {
            GL11.glColor4f(
                    (color[0]-dark)* 0.00392156863f,
                    (color[1]-dark)* 0.00392156863f,
                    (color[2]-dark)* 0.00392156863f, 1);
        }
    }

    public static void modelPotatoRail(RailShapeCore shape, float scale, int[] color){
        GL11.glTranslated(0, 0.15*scale, 0);
        for(float rail : shape.getGaugePositions()) {

            centerShading(rail,color,30,true);
            drawFace(shape.activePath, rail, 0.0625f, 0,0,0, scale);

            centerShading(rail,color,30,false);
            drawFace(shape.activePath, rail, 0, -0.0625f,0,0, scale);
        }
    }

    public static void modelExtrudedRail(RailShapeCore shape, float scale,  int[] color) {
        GL11.glTranslated(0, 0.225*scale, 0);

        for (float rail : shape.getGaugePositions()) {

            centerShading(rail,color,30,true);
            drawFace(shape.activePath, rail, 0.0625f, 0,0,0, scale);

            centerShading(rail,color,30,false);
            drawFace(shape.activePath, rail, 0, -0.0625f,0,0, scale);

            centerShading(rail,color,20,true);
            drawFace(shape.activePath, rail, 0.0625f, 0.0625f,-0.085f,0, scale);

            centerShading(rail,color,20,false);
            drawFace(shape.activePath, rail, -0.0625f, -0.0625f,0, -0.085f, scale);


            if(shape.ends[0]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);

                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, -0.085f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, -0.085f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, 0, 0);

                Tessellator.getInstance().draw();
            }
            if(shape.ends[1]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);

                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale)+rail, -0.0625f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale)+rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale)+rail, -0.0625f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale)+rail, 0, 0);

                Tessellator.getInstance().draw();
            }
        }
    }

    public static void model3DRail(RailShapeCore shape, float scale,  int[] color) {

        GL11.glTranslated(0, 0.225*scale, 0);

        for(float rail : shape.getGaugePositions()) {
            GL11.glPushMatrix();
            centerShading(rail,color,20,true);
            drawFace(shape.activePath, rail, 0.0625f, 0,0,0, scale);
            drawFace(shape.activePath, rail, 0.0625f, 0.0625f,-0.025f,0, scale);
            drawFace(shape.activePath, rail, 0.0625f, 0.0625f,-0.085f,-0.06f, scale);

            centerShading(rail,color,0,true);
            drawFace(shape.activePath, rail, 0.0625f, -0.0625f,-0.06f,-0.06f, scale);

            centerShading(rail,color,20,false);
            drawFace(shape.activePath, rail, 0, -0.0625f,0,0, scale);
            drawFace(shape.activePath, rail, -0.0625f, -0.0625f,0, -0.025f, scale);
            drawFace(shape.activePath, rail, -0.0625f, -0.0625f,-0.06f, -0.085f, scale);


            GL11.glColor4f(
                    (color[0]-30)* 0.00392156863f,
                    (color[1]-30)* 0.00392156863f,
                    (color[2]-30)* 0.00392156863f, 1);
            drawFace(shape.activePath, rail, 0.03125f, 0.03125f,-0.06f,-0.025f, scale);
            drawFace(shape.activePath, rail, -0.03125f, -0.03125f,-0.025f,-0.06f, scale);




            GL11.glColor4f(
                    (color[0]-20)* 0.00392156863f,
                    (color[1]-20)* 0.00392156863f,
                    (color[2]-20)* 0.00392156863f, 1);
            if(shape.ends[0]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);

                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, 0, 0);

                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,-0.025f*scale,0);

                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(0), (-0.03125f*scale) + rail, -0.035f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.03125f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.03125f*scale) + rail, -0.035f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.03125f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,-0.035f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.0625f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0625f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

            }
            if(shape.ends[1]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,0.035f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.03125f*scale) + rail, -0.035f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.03125f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.03125f*scale) + rail, -0.035f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.03125f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,0.025f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0625f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale) + rail, -0.025f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0625f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

            }
            GL11.glPopMatrix();
        }
    }

    public static void modelHDRail(RailShapeCore shape, float scale, int[] color) {

        GL11.glTranslated(0, 0.125*scale, 0);

        for(float rail : shape.getGaugePositions()) {
            rail = rail * 1.0625f;
            GL11.glPushMatrix();
            railShading(rail,color, 33, 43, 58, true);
            drawFace(shape.activePath, rail, -0.0125f,-0.021875f,0,0, scale);//railhead top dull

            railShading(rail,color, 33, 43, 58, false);
            drawFace(shape.activePath, rail, 0.021875f,0.0125f,0,0, scale);//railhead top dull

            GL11.glColor4f(
                    (color[0]-17)* 0.00392156863f,
                    (color[1]-20)* 0.00392156863f,
                    (color[2]-24)* 0.00392156863f, 1);
            drawFace(shape.activePath, rail, 0.0125f, -0.0125f,0,0, scale);//railhead top shiny

            GL11.glColor4f(
                    (color[0]-129)* 0.00392156863f,
                    (color[1]-141)* 0.00392156863f,
                    (color[2]-164)* 0.00392156863f, 1);
            drawFace(shape.activePath, rail,0.021875f,0.021875f,-0.0231f,0f, scale);//railhead west side
            drawFace(shape.activePath, rail,-0.021875f,-0.021875f,0f,-0.0231f, scale);//railhead east side
            drawFace(shape.activePath, rail, -0.021875f,0.021875f,-0.0231f,-0.0231f, scale);//railhead bottom
            drawFace(shape.activePath, rail, -0.03f,-0.03f,-0.055f,-0.075f, scale);//Rail base west
            drawFace(shape.activePath, rail, 0.03f,0.03f,-0.075f,-0.055f, scale);//Rail base east
            drawFace(shape.activePath, rail, -0.03f,0.03f,-0.075f,-0.075f, scale);//Rail base bottom

            drawFace(shape.activePath, rail, -0.0125f,-0.0125f,-0.0231f,-0.055f, scale);//Rail neck west
            drawFace(shape.activePath, rail, 0.0125f,0.0125f,-0.055f,-0.0231f, scale);//Rail neck east

            GL11.glColor4f(
                    (color[0]-101)* 0.00392156863f,
                    (color[1]-120)* 0.00392156863f,
                    (color[2]-153)* 0.00392156863f, 1);
            drawFace(shape.activePath, rail, 0.03f,-0.03f,-0.055f,-0.055f, scale);//Rail base top
            if(shape.ends[0]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);

                addVertexWithOffset(shape.activePath.get(0), (-0.021875f*scale) + rail, -0.0231f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.021875f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.021875f*scale) + rail, -0.0231f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.021875f*scale) + rail, 0, 0);

                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,-0.025f*scale,0);

                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(0), (-0.0125f*scale) + rail, -0.0303125f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.0125f*scale) + rail, 0.019f, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.0125f*scale) + rail, -0.0303125f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.01255f*scale) + rail, 0.019f, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,-0.035f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(0), (-0.03f*scale) + rail, -0.01525f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (-0.03f*scale) + rail, 0.005f, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.03f*scale) + rail, -0.01525f*scale, 0);
                addVertexWithOffset(shape.activePath.get(0), (0.03f*scale) + rail, 0.005f, 0);
                Tessellator.getInstance().draw();

            }
            if(shape.ends[1]) {
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.03f*scale) + rail, -0.01525f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.03f*scale) + rail, 0.005f, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.03f*scale) + rail, -0.01525f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.03f*scale) + rail, 0.005f, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,0.035f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0125f*scale) + rail, -0.0303125f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.0125f*scale) + rail, 0.019f, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0125f*scale) + rail, -0.0303125f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.0125f*scale) + rail, 0.019f, 0);
                Tessellator.getInstance().draw();

                GL11.glTranslatef(0,0.025f*scale,0);
                Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.021875f*scale) + rail, -0.0231f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (0.021875f*scale) + rail, 0, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.021875f*scale) + rail, -0.0231f*scale, 0);
                addVertexWithOffset(shape.activePath.get(shape.activePath.size() - 1), (-0.021875f*scale) + rail, 0, 0);
                Tessellator.getInstance().draw();

            }
            GL11.glPopMatrix();
        }
    }
}
