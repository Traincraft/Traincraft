package ebf.tim.models.rails;

import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.utility.Vec6f;
import fexcraft.tmt.slim.Tessellator;
import org.lwjgl.opengl.GL11;

import java.util.List;

import static ebf.tim.models.rails.Model1x1Rail.addVertexWithOffset;

public class ModelRail {

    public static void drawFace(List<Vec6f> path, float gaugeOffset, float x1, float x2, float y1, float y2, float scale){
        Tessellator.getInstance().startDrawing(GL11.GL_QUAD_STRIP);
        for (Vec6f p : path) {
            addVertexWithOffset(p, (x1*scale) + gaugeOffset, y1*scale, 0);
            addVertexWithOffset(p, (x2*scale) + gaugeOffset, y2*scale, 0);
        }
        Tessellator.getInstance().draw();
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




    public static void model3DRail(RailShapeCore shape, float scale,  int[] color){

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
}
