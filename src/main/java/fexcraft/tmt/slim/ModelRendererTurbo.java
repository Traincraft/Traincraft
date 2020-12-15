package fexcraft.tmt.slim;

import ebf.tim.utility.DebugUtil;
import fexcraft.fcl.common.Static;
import fexcraft.fvtm.TurboList;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * An extension to the ModelRenderer class. It basically is a copy to ModelRenderer,
 * however, it contains various new methods to make your models.
 * <br /><br />
 * Since the ModelRendererTurbo class gets loaded during startup, the models made
 * can be very complex. This is why I can afford to add, for example, Wavefont OBJ
 * support or have the addSprite method, methods that add a lot of vertices and
 * polygons.
 *
 * This version of TMT was updated, maintened, as well as extended for 1.8 and newer Minecraft versions by FEX___96
 *
 * @author GaryCXJk, Ferdinand (FEX___96)
 * @license http://fexcraft.net/license?id=tmt
 *
 */
public class ModelRendererTurbo {

    public List<TexturedPolygon> faces;
    public int textureOffsetX, textureOffsetY;
    public float textureWidth=0,textureHeight=0;
    public boolean mirror;
    public float rotateAngleX=0,rotateAngleY=0,rotateAngleZ=0;
    public float rotationPointX=0,rotationPointY=0,rotationPointZ=0;
    public float width, height, depth;
    public boolean showModel; //previously known as !field_1402_i
    public boolean ignoresLighting=false;
    public String boxName = null;
    public boolean animated=false;

    public static final int MR_FRONT = 0, MR_BACK = 1, MR_LEFT = 2, MR_RIGHT = 3, MR_TOP = 4, MR_BOTTOM = 5;
    private static final float pi = (float)Math.PI;

    /**
     * Creates a new ModelRenderTurbo object.
     * @param s
     */
    public ModelRendererTurbo(String s){
        mirror = false;
        showModel = true;
        faces = new ArrayList<>();
        boxName = s;
    }

    /**
     * Creates a new ModelRenderTurbo object. It requires the coordinates of the
     * position of the texture, but also allows you to specify the width and height
     * of the texture.
     * @param s
     * @param textureX
     * @param textureY
     * @param textureU
     * @param textureV
     */
    public ModelRendererTurbo(String s, int textureX, int textureY, float textureU, float textureV){
        mirror = false;
        showModel = true;
        faces = new ArrayList<>();
        boxName = s;
        textureOffsetX = textureX;
        textureOffsetY = textureY;
        textureWidth = textureU;
        textureHeight = textureV;
    }

    public ModelRendererTurbo(ModelBase modelbase, String s){this(s);}
    public ModelRendererTurbo(TurboList modelbase, String s){this(s);}
    public ModelRendererTurbo(ModelBase modelbase){this("");}

    public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY, int textureU, int textureV){
        this("",textureX,textureY,textureU,textureV);
    }
    public ModelRendererTurbo(TurboList modelbase, int textureX, int textureY, int textureU, int textureV){
        this("",textureX,textureY,textureU,textureV);
    }
    public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY, int textureU, int textureV, String boxName) {
        this(boxName,textureX,textureY,textureU,textureV);
    }


    private TexturedPolygon addPolygonReturn(TexturedVertex vert1, TexturedVertex vert2, TexturedVertex vert3, TexturedVertex vert4, float f, float g, float h, float j){
        float uOffs = 1.0F / (textureWidth * 10.0F);
        float vOffs = 1.0F / (textureHeight * 10.0F);
        List<TexturedVertex> verts = new ArrayList<>();
        verts.add(vert1.setTexturePosition(h / textureWidth - uOffs, g / textureHeight + vOffs));
        verts.add(vert2.setTexturePosition(f / textureWidth + uOffs, g / textureHeight + vOffs));
        verts.add(vert3.setTexturePosition(f / textureWidth + uOffs, j / textureHeight - vOffs));
        verts.add(vert4.setTexturePosition(h / textureWidth - uOffs, j / textureHeight - vOffs));
        return new TexturedPolygon(verts);
    }

    /**
     * Adds a rectangular shape. Basically, you can make any eight-pointed shape you want,
     * as the method requires eight vector coordinates.
     * @param v a float array with three values, the x, y and z coordinates of the vertex
     * @param v1 a float array with three values, the x, y and z coordinates of the vertex
     * @param v2 a float array with three values, the x, y and z coordinates of the vertex
     * @param v3 a float array with three values, the x, y and z coordinates of the vertex
     * @param v4 a float array with three values, the x, y and z coordinates of the vertex
     * @param v5 a float array with three values, the x, y and z coordinates of the vertex
     * @param v6 a float array with three values, the x, y and z coordinates of the vertex
     * @param v7 a float array with three values, the x, y and z coordinates of the vertex
     * @param w the width of the shape, used in determining the texture
     * @param h the height of the shape, used in determining the texture
     * @param d the depth of the shape, used in determining the texture
     */
    public ModelRendererTurbo addRectShape(float[] v, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6, float[] v7, float w, float h, float d){
        TexturedVertex[] verts = new TexturedVertex[8];
        List<TexturedPolygon> poly = new ArrayList<>();
        verts[0] = new TexturedVertex(v[0], v[1], v[2], 0.0F, 0.0F);
        verts[1] = new TexturedVertex(v1[0], v1[1], v1[2], 0.0F, 8F);
        verts[2] = new TexturedVertex(v2[0], v2[1], v2[2], 8F, 8F);
        verts[3] = new TexturedVertex(v3[0], v3[1], v3[2], 8F, 0.0F);
        verts[4] = new TexturedVertex(v4[0], v4[1], v4[2], 0.0F, 0.0F);
        verts[5] = new TexturedVertex(v5[0], v5[1], v5[2], 0.0F, 8F);
        verts[6] = new TexturedVertex(v6[0], v6[1], v6[2], 8F, 8F);
        verts[7] = new TexturedVertex(v7[0], v7[1], v7[2], 8F, 0.0F);

        if(d!=0 && h!=0){
        poly.add(addPolygonReturn(verts[5], verts[1],verts[2], verts[6]//back
                , textureOffsetX + d + w, textureOffsetY + d, textureOffsetX + d + w + d, textureOffsetY + d + h));
        poly.add(addPolygonReturn(verts[0], verts[4], verts[7], verts[3]//front
                , textureOffsetX, textureOffsetY + d, textureOffsetX + d, textureOffsetY + d + h));
        }
        if(d!=0 && w!=0) {
            poly.add(addPolygonReturn(verts[5], verts[4], verts[0], verts[1]//top
                    , textureOffsetX + d, textureOffsetY, textureOffsetX + d + w, textureOffsetY + d));
            poly.add(addPolygonReturn(verts[2], verts[3], verts[7], verts[6]//bottom
                    , textureOffsetX + d + w, textureOffsetY, textureOffsetX + d + w + w, textureOffsetY + d));
        }
        if(w!=0 && h!=0) {
            poly.add(addPolygonReturn(verts[1], verts[0], verts[3], verts[2]//left
                    , textureOffsetX + d, textureOffsetY + d, textureOffsetX + d + w, textureOffsetY + d + h));
            poly.add(addPolygonReturn(verts[4], verts[5], verts[6], verts[7]//right
                    , textureOffsetX + d + w + d, textureOffsetY + d, textureOffsetX + d + w + d + w, textureOffsetY + d + h));
        }

        if(mirror){
            for (TexturedPolygon texturedPolygon : poly) {
                Collections.reverse(texturedPolygon.vertices);
            }
        }
        faces.addAll(poly);
        return this;
    }

    /**
     * Adds a new box to the model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width (over the x-direction)
     * @param h the height (over the y-direction)
     * @param d the depth (over the z-direction)
     */
    public ModelRendererTurbo addBox(float x, float y, float z, int w, int h, int d){
        addBox(x, y, z, w, h, d, 0.0F);
        return this;
    }

    /**
     * Adds a new box to the model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width (over the x-direction)
     * @param h the height (over the y-direction)
     * @param d the depth (over the z-direction)
     * @param expansion the expansion of the box. It increases the size in each direction by that many.
     */
    public void addBox(float x, float y, float z, int w, int h, int d, float expansion){
        addBox(x, y, z, w, h, d, expansion, 1F);
    }

    /**
     * Adds a new box to the model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width (over the x-direction)
     * @param h the height (over the y-direction)
     * @param d the depth (over the z-direction)
     * @param expansion the expansion of the box. It increases the size in each direction by that many. It's independent from the scale.
     * @param scale
     */
    public void addBox(float x, float y, float z, float w, float h, float d, float expansion, float scale){
        width=w;height=h;depth=d;
        expansion +=0.005f;
        float x1 = (x + w+expansion)*scale;
        float y1 = (y + h+expansion)*scale;
        float z1 = (z + d+expansion)*scale;

        x -= expansion; x*=scale;
        y -= expansion; y*=scale;
        z -= expansion; z*=scale;
        if(mirror){
            float xTemp = x1;
            x1 = x;
            x = xTemp;
        }

        float[] v = {x, y, z};
        float[] v1 = {x1, y, z};
        float[] v2 = {x1, y1, z};
        float[] v3 = {x, y1, z};
        float[] v4 = {x, y, z1};
        float[] v5 = {x1, y, z1};
        float[] v6 = {x1, y1, z1};
        float[] v7 = {x, y1, z1};
        addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
    }

    /**
     * Adds a trapezoid-like shape. It's achieved by expanding the shape on one side.
     * You can use the static variables <code>MR_RIGHT</code>, <code>MR_LEFT</code>,
     * <code>MR_FRONT</code>, <code>MR_BACK</code>, <code>MR_TOP</code> and
     * <code>MR_BOTTOM</code>.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width (over the x-direction)
     * @param h the height (over the y-direction)
     * @param d the depth (over the z-direction)
     * @param scale the "scale" of the box. It only increases the size in each direction by that many.
     * @param bottomScale the "scale" of the bottom
     * @param dir the side the scaling is applied to
     */
    public void addTrapezoid(float x, float y, float z, int w, int h, int d, float scale, float bottomScale, int dir){
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;

        int m = (mirror ? -1 : 1);
        if(mirror){
            float f7 = f4;
            f4 = x;
            x = f7;
        }
        float[] v = {x, y, z};
        float[] v1 = {f4, y, z};
        float[] v2 = {f4, f5, z};
        float[] v3 = {x, f5, z};
        float[] v4 = {x, y, f6};
        float[] v5 = {f4, y, f6};
        float[] v6 = {f4, f5, f6};
        float[] v7 = {x, f5, f6};

        switch(dir){
            case MR_RIGHT:
                v[1] -= bottomScale;
                v[2] -= bottomScale;
                v3[1] += bottomScale;
                v3[2] -= bottomScale;
                v4[1] -= bottomScale;
                v4[2] += bottomScale;
                v7[1] += bottomScale;
                v7[2] += bottomScale;
                break;
            case MR_LEFT:
                v1[1] -= bottomScale;
                v1[2] -= bottomScale;
                v2[1] += bottomScale;
                v2[2] -= bottomScale;
                v5[1] -= bottomScale;
                v5[2] += bottomScale;
                v6[1] += bottomScale;
                v6[2] += bottomScale;
                break;
            case MR_FRONT:
                v[0] -= m * bottomScale;
                v[1] -= bottomScale;
                v1[0] += m * bottomScale;
                v1[1] -= bottomScale;
                v2[0] += m * bottomScale;
                v2[1] += bottomScale;
                v3[0] -= m * bottomScale;
                v3[1] += bottomScale;
                break;
            case MR_BACK:
                v4[0] -= m * bottomScale;
                v4[1] -= bottomScale;
                v5[0] += m * bottomScale;
                v5[1] -= bottomScale;
                v6[0] += m * bottomScale;
                v6[1] += bottomScale;
                v7[0] -= m * bottomScale;
                v7[1] += bottomScale;
                break;
            case MR_TOP:
                v[0] -= m * bottomScale;
                v[2] -= bottomScale;
                v1[0] += m * bottomScale;
                v1[2] -= bottomScale;
                v4[0] -= m * bottomScale;
                v4[2] += bottomScale;
                v5[0] += m * bottomScale;
                v5[2] += bottomScale;
                break;
            case MR_BOTTOM:
                v2[0] += m * bottomScale;
                v2[2] -= bottomScale;
                v3[0] -= m * bottomScale;
                v3[2] -= bottomScale;
                v6[0] += m * bottomScale;
                v6[2] += bottomScale;
                v7[0] -= m * bottomScale;
                v7[2] += bottomScale;
                break;
        }
        addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
    }

    /**
     * Adds a trapezoid-like shape. It's achieved by expanding the shape on one side.
     * You can use the static variables <code>MR_RIGHT</code>, <code>MR_LEFT</code>,
     * <code>MR_FRONT</code>, <code>MR_BACK</code>, <code>MR_TOP</code> and
     * <code>MR_BOTTOM</code>.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width (over the x-direction)
     * @param h the height (over the y-direction)
     * @param d the depth (over the z-direction)
     * @param scale the "scale" of the box. It only increases the size in each direction by that many.
     * @param bScale1 the "scale" of the bottom - Top
     * @param bScale2 the "scale" of the bottom - Bottom
     * @param bScale3 the "scale" of the bottom - Left
     * @param bScale4 the "scale" of the bottom - Right
     * @param fScale1 the "scale" of the top - Left
     * @param fScale2 the "scale" of the top - Right
     * @param dir the side the scaling is applied to
     */
    public void addFlexTrapezoid(float x, float y, float z, int w, int h, int d, float scale, float bScale1, float bScale2, float bScale3, float bScale4, float fScale1, float fScale2, int dir)
    {
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;

        int m = (mirror ? -1 : 1);
        if(mirror)
        {
            float f7 = f4;
            f4 = x;
            x = f7;
        }

        float[] v = {x, y, z};
        float[] v1 = {f4, y, z};
        float[] v2 = {f4, f5, z};
        float[] v3 = {x, f5, z};
        float[] v4 = {x, y, f6};
        float[] v5 = {f4, y, f6};
        float[] v6 = {f4, f5, f6};
        float[] v7 = {x, f5, f6};


        switch(dir)
        {
            case MR_RIGHT:
                v[2] -= fScale1;
                v1[2] -= fScale1;
                v4[2] += fScale2;
                v5[2] += fScale2;

                v[1] -= bScale1;
                v[2] -= bScale3;
                v3[1] += bScale2;
                v3[2] -= bScale3;
                v4[1] -= bScale1;
                v4[2] += bScale4;
                v7[1] += bScale2;
                v7[2] += bScale4;
                break;
            case MR_LEFT:
                v[2] -= fScale1;
                v1[2] -= fScale1;
                v4[2] += fScale2;
                v5[2] += fScale2;

                v1[1] -= bScale1;
                v1[2] -= bScale3;
                v2[1] += bScale2;
                v2[2] -= bScale3;
                v5[1] -= bScale1;
                v5[2] += bScale4;
                v6[1] += bScale2;
                v6[2] += bScale4;
                break;
            case MR_FRONT:
                v1[1] -= fScale1;
                v5[1] -= fScale1;
                v2[1] += fScale2;
                v6[1] += fScale2;

                v[0] -= m * bScale4;
                v[1] -= bScale1;
                v1[0] += m * bScale3;
                v1[1] -= bScale1;
                v2[0] += m * bScale3;
                v2[1] += bScale2;
                v3[0] -= m * bScale4;
                v3[1] += bScale2;
                break;
            case MR_BACK:
                v1[1] -= fScale1;
                v5[1] -= fScale1;
                v2[1] += fScale2;
                v6[1] += fScale2;

                v4[0] -= m * bScale4;
                v4[1] -= bScale1;
                v5[0] += m * bScale3;
                v5[1] -= bScale1;
                v6[0] += m * bScale3;
                v6[1] += bScale2;
                v7[0] -= m * bScale4;
                v7[1] += bScale2;
                break;
            case MR_TOP:
                v1[2] -= fScale1;
                v2[2] -= fScale1;
                v5[2] += fScale2;
                v6[2] += fScale2;

                v[0] -= m * bScale1;
                v[2] -= bScale3;
                v1[0] += m * bScale2;
                v1[2] -= bScale3;
                v4[0] -= m * bScale1;
                v4[2] += bScale4;
                v5[0] += m * bScale2;
                v5[2] += bScale4;
                break;
            case MR_BOTTOM:
                v1[2] -= fScale1;
                v2[2] -= fScale1;
                v5[2] += fScale2;
                v6[2] += fScale2;

                v2[0] += m * bScale2;
                v2[2] -= bScale3;
                v3[0] -= m * bScale1;
                v3[2] -= bScale3;
                v6[0] += m * bScale2;
                v6[2] += bScale4;
                v7[0] -= m * bScale1;
                v7[2] += bScale4;
                break;
        }

        addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param coordinates an array of coordinates that form the shape
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     */
    public void addShape3D(float x, float y, float z, Coord2D[] coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction){
        addShape3D(x, y, z, coordinates, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param coordinates an array of coordinates that form the shape
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     * @param faceLengths An array with the length of each face. Used to set
     * the texture width of each face on the side manually.
     */
    public void addShape3D(float x, float y, float z, Coord2D[] coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction, float[] faceLengths){
        addShape3D(x, y, z, new Shape2D(coordinates), depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, faceLengths);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param coordinates an ArrayList of coordinates that form the shape
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     */
    public void addShape3D(float x, float y, float z, ArrayList<Coord2D> coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction){
        addShape3D(x, y, z, coordinates, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param coordinates an ArrayList of coordinates that form the shape
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     * @param faceLengths An array with the length of each face. Used to set
     * the texture width of each face on the side manually.
     */
    public void addShape3D(float x, float y, float z, ArrayList<Coord2D> coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction, float[] faceLengths){
        addShape3D(x, y, z, new Shape2D(coordinates), depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, faceLengths);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param shape a Shape2D which contains the coordinates of the shape points
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     */
    public void addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction){
        addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param shape a Shape2D which contains the coordinates of the shape points
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param direction the direction the starting point of the shape is facing
     * @param faceLengths An array with the length of each face. Used to set
     * the texture width of each face on the side manually.
     */
    public void addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction, float[] faceLengths){
        float rotX = 0;
        float rotY = 0;
        float rotZ = 0;
        switch(direction){
            case MR_LEFT:
                rotY = pi / 2;
                break;
            case MR_RIGHT:
                rotY = -pi / 2;
                break;
            case MR_TOP:
                rotX = pi / 2;
                break;
            case MR_BOTTOM:
                rotX = -pi / 2;
                break;
            case MR_FRONT:
                rotY = pi;
                break;
            case MR_BACK:
                break;
        }
        addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, rotX, rotY, rotZ, faceLengths);
    }

    /**
     * Creates a shape from a 2D vector shape.
     * @param x the starting x position
     * @param y the starting y position
     * @param z the starting z position
     * @param shape a Shape2D which contains the coordinates of the shape points
     * @param depth the depth of the shape
     * @param shapeTextureWidth the width of the texture of one side of the shape
     * @param shapeTextureHeight the height of the texture the shape
     * @param sideTextureWidth the width of the texture of the side of the shape
     * @param sideTextureHeight the height of the texture of the side of the shape
     * @param rotX the rotation around the x-axis
     * @param rotY the rotation around the y-axis
     * @param rotZ the rotation around the z-axis
     */
    public void addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, float rotX, float rotY, float rotZ){
        addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, rotX, rotY, rotZ, null);
    }

    /**
     * Eternal: the check for flip was removed, shapes always need to be flipped., added a boolean to define if it's a shape or not so we can properly fix rotations
     * NOTE: `x` and `z` are inverted to prevent "Toolbox" or "Flansmod"-type models from being rendered wrong.
     * There is currently no other commonly used editor for such models, so let's leave it that way for now.
     * NOTE2: Also let's rotate by 180 degrees for whatever reason.
     * @Ferdinand
     */
    public void addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, float rotX, float rotY, float rotZ, float[] faceLengths){
        faces.addAll(Arrays.asList(shape.extrude(-x, y, -z, rotX, rotY, rotZ, depth, textureOffsetX, textureOffsetY, textureWidth, textureHeight, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, faceLengths)));
    }


    /**
     * Creates a model shaped like the exact image on the texture by making a series of 2d planes.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width of the sprite
     * @param h the height of the sprite
     * @param extrude the expansion of the sprite on the axis that would otherwise be 0.
     */
    public ModelRendererTurbo addSprite(float x, float y, float z, int w, int h, int d, float extrude){
        float x1,y1,z1,x2,y2,z2;
        for(float expansion=0;expansion<=extrude;expansion+=0.2f){
            x1=(w==0?expansion:x);
            y1=(h==0?expansion:y);
            z1=(d==0?expansion:z);

            x2=(w==0?x+w+expansion:w);
            y2=(h==0?y+h+expansion:h);
            z2=(d==0?z+d+expansion:d);

            if(mirror){
                float xTemp = x1;
                x1 = x;
                x = xTemp;
            }

            float[] v = {x2, y2, z2}, v1 = {x1, y2, z2}, v2 = {x1, y1, z2}, v3 = {x2, y1, z2},
                    v4 = {x2, y2, z1}, v5 = {x1, y2, z1}, v6 = {x1, y1, z1}, v7 = {x2, y1, z1};
            addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
        }
        return this;
    }

    /**
     * Adds a spherical shape.
     * @param x
     * @param y
     * @param z
     * @param r
     * @param segs
     * @param rings
     * @param textureW
     * @param textureH
     */
    public ModelRendererTurbo addSphere(float x, float y, float z, float r, int segs, int rings, int textureW, int textureH){
        if(segs < 3){
            segs = 3;
        }
        rings++;
        TexturedVertex[] tempVerts = new TexturedVertex[segs * (rings - 1) + 2];
        List<TexturedPolygon> poly = new ArrayList<>();
        tempVerts[0] = new TexturedVertex(x, y - r, z, 0, 0);
        tempVerts[tempVerts.length - 1] = new TexturedVertex(x, y + r, z, 0, 0);
        float uOffs = 1.0F / ( textureWidth * 10.0F);
        float vOffs = 1.0F / ( textureHeight * 10.0F);
        float texW =  textureW / textureWidth - 2F * uOffs;
        float texH =  textureH / textureHeight - 2F * vOffs;
        float segW = texW /  segs;
        float segH = texH /  rings;
        float startU =  textureOffsetX /  textureWidth;
        float startV =  textureOffsetY /  textureHeight;

        List<TexturedVertex> verts;
        for(int j = 1; j < rings; j++){
            for(int i = 0; i < segs; i++){
                float yWidth = MathHelper.cos(-pi / 2 + (pi / rings) *  j);
                float yHeight = MathHelper.sin(-pi / 2 + (pi / rings) *  j);
                float xSize = MathHelper.sin((pi / segs) * i * 2F + pi) * yWidth;
                float zSize = -MathHelper.cos((pi / segs) * i * 2F + pi) * yWidth;
                int curVert = 1 + i + segs * (j - 1);
                tempVerts[curVert] = new TexturedVertex(x + xSize * r, y + yHeight * r, z + zSize * r, 0, 0);
                if(i > 0){
                    verts = new ArrayList<>();
                    if(j == 1){
                        verts.add(tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j));
                        verts.add(tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j));
                        verts.add(tempVerts[0].setTexturePosition(startU + segW * (i - 1), startV));
                        verts.add(tempVerts[0].setTexturePosition(startU + segW + segW * i, startV));
                    }
                    else{
                        verts.add(tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j));
                        verts.add(tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j));
                        verts.add(tempVerts[curVert - 1 - segs].setTexturePosition(startU + segW * (i - 1), startV + segH * (j - 1)));
                        verts.add(tempVerts[curVert - segs].setTexturePosition(startU + segW * i, startV + segH * (j - 1)));
                    }
                    poly.add(new TexturedPolygon(verts));
                }
            }
            verts = new ArrayList<>();
            if(j == 1){
                verts.add(tempVerts[1].setTexturePosition(startU + segW * segs, startV + segH * j));
                verts.add(tempVerts[segs].setTexturePosition(startU + segW * (segs - 1), startV + segH * j));
                verts.add(tempVerts[0].setTexturePosition(startU + segW * (segs - 1), startV));
                verts.add(tempVerts[0].setTexturePosition(startU + segW * segs, startV));
            }
            else{
                verts.add(tempVerts[1 + segs * (j - 1)].setTexturePosition(startU + texW, startV + segH * j));
                verts.add(tempVerts[segs * (j - 1) + segs].setTexturePosition(startU + texW - segW, startV + segH * j));
                verts.add(tempVerts[segs * (j - 1)].setTexturePosition(startU + texW - segW, startV + segH * (j - 1)));
                verts.add(tempVerts[1 + segs * (j - 1) - segs].setTexturePosition(startU + texW, startV + segH * (j - 1)));
            }
            poly.add(new TexturedPolygon(verts));
        }
        for(int i = 0; i < segs; i++){
            verts = new ArrayList<>();
            int curVert = tempVerts.length - (segs + 1);
            verts.add(tempVerts[tempVerts.length - 1].setTexturePosition(startU + segW * (i + 0.5F), startV + texH));
            verts.add(tempVerts[curVert + i].setTexturePosition(startU + segW * i, startV + texH - segH));
            verts.add(tempVerts[curVert + ((i + 1) % segs)].setTexturePosition(startU + segW * (i + 1), startV + texH - segH));
            poly.add(new TexturedPolygon(verts));
        }
        faces.addAll(poly);
        return this;
    }

    /**
     * Adds a cone.
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     */
    public ModelRendererTurbo addCone(float x, float y, float z, float radius, float length, int segments){
        return addCone(x, y, z, radius, length, segments, 1F);
    }

    /**
     * Adds a cone.
     *
     * baseScale cannot be zero. If it is, it will automatically be set to 1F.
     *
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     * @param baseScale the scaling of the base. Can be negative.
     */
    public ModelRendererTurbo addCone(float x, float y, float z, float radius, float length, int segments, float baseScale){
        return addCone(x, y, z, radius, length, segments, baseScale, MR_TOP);
    }

    /**
     * Adds a cone.
     *
     * baseScale cannot be zero. If it is, it will automatically be set to 1F.
     *
     * Setting the baseDirection to either MR_LEFT, MR_BOTTOM or MR_BACK will result in
     * the top being placed at the (x,y,z).
     *
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     * @param baseScale the scaling of the base. Can be negative.
     * @param baseDirection the direction it faces
     */
    public ModelRendererTurbo addCone(float x, float y, float z, float radius, float length, int segments, float baseScale, int baseDirection){
        return addCone(x, y, z, radius, length, segments, baseScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F));
    }

    /**
     * Adds a cone.
     *
     * baseScale cannot be zero. If it is, it will automatically be set to 1F.
     *
     * Setting the baseDirection to either MR_LEFT, MR_BOTTOM or MR_BACK will result in
     * the top being placed at the (x,y,z).
     *
     * The textures for the sides are placed next to each other.
     *
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     * @param baseScale the scaling of the base. Can be negative.
     * @param baseDirection the direction it faces
     * @param textureCircleDiameterW the diameter width of the circle on the texture
     * @param textureCircleDiameterH the diameter height of the circle on the texture
     */
    public ModelRendererTurbo addCone(float x, float y, float z, float radius, float length, int segments, float baseScale, int baseDirection, int textureCircleDiameterW, int textureCircleDiameterH){
        return addCylinder(x, y, z, radius, length, segments, baseScale, 0.0F, baseDirection, textureCircleDiameterW, textureCircleDiameterH, 1, null);
    }

    /**
     * Adds a cylinder.
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     */
    public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments){
        return addCylinder(x, y, z, radius, length, segments, 1F, 1F);
    }
    /**
     * Adds a cylinder.
     *
     * You can make cones by either setting baseScale or topScale to zero. Setting both
     * to zero will set the baseScale to 1F.
     *
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     * @param baseScale the scaling of the base. Can be negative.
     * @param topScale the scaling of the top. Can be negative.
     */
    public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale){
        return addCylinder(x, y, z, radius, length, segments, baseScale, topScale, MR_TOP);
    }

    /**
     * Adds a cylinder.
     *
     * You can make cones by either setting baseScale or topScale to zero. Setting both
     * to zero will set the baseScale to 1F.
     *
     * Setting the baseDirection to either MR_LEFT, MR_BOTTOM or MR_BACK will result in
     * the top being placed at the (x,y,z).
     *
     * @param x the x-position of the base
     * @param y the y-position of the base
     * @param z the z-position of the base
     * @param radius the radius of the cylinder
     * @param length the length of the cylinder
     * @param segments the amount of segments the cylinder is made of
     * @param baseScale the scaling of the base. Can be negative.
     * @param topScale the scaling of the top. Can be negative.
     * @param baseDirection the direction it faces
     */
    public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale, int baseDirection){
        return addCylinder(x, y, z, radius, length, segments, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), null);
    }

    public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale, int baseDirection, Vec3f topoff){
        return addCylinder(x, y, z, radius, length, segments, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), topoff);
    }




    public ModelRendererTurbo addHollowCylinder(float x, float y, float z, float radius, float radius2, float length, int segments, int seglimit, float baseScale, float topScale, int baseDirection){
        return addHollowCylinder(x, y, z, radius, radius2, length, segments, seglimit, baseScale, topScale, baseDirection, null);
    }

    public ModelRendererTurbo addHollowCylinder(float x, float y, float z, float radius, float radius2, float length, int segments, int seglimit,  float baseScale, float topScale, int baseDirection, Vec3f topoff){
        return addHollowCylinder(x, y, z, radius, radius2, length, segments, seglimit, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), topoff, new boolean[4]);
    }

    public ModelRendererTurbo addHollowCylinder(float x, float y, float z, float radius, float radius2, float length, int segments, int seglimit,  float baseScale, float topScale, int baseDirection, Vec3f topoff, boolean[] bools){
        return addHollowCylinder(x, y, z, radius, radius2, length, segments, seglimit, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), topoff, bools);
    }
    public ModelRendererTurbo addHollowCylinder(float x, float y, float z, float radius, float radius2, float length, int segments, int seglimit,  float baseScale, float topScale, int baseDirection, Vec3f topoff, float topangle, boolean[] bools){
        return addHollowCylinder(x, y, z, radius, radius2, length, segments, seglimit, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2F), (int)Math.floor(radius * 2F), (int)Math.floor(length), topoff, bools);
    }

        /**
         * Based on the addCylinder method.
         * @author Ferdinand Calo' (FEX___96)
         * Adds a cylinder.
         *
         * You can make cones by either setting baseScale or topScale to zero. Setting both
         * to zero will set the baseScale to 1F.
         *
         * Setting the baseDirection to either MR_LEFT, MR_BOTTOM or MR_BACK will result in
         * the top being placed at the (x,y,z).
         *
         * The textures for the base and top are placed next to each other, while the body
         * will be placed below the circles.
         *
         * @param x the x-position of the base
         * @param y the y-position of the base
         * @param z the z-position of the base
         * @param radius the radius of the cylinder
         * @param length the length of the cylinder
         * @param segments the amount of segments the cylinder is made of
         * @param baseScale the scaling of the base. Can be negative.
         * @param topScale the scaling of the top. Can be negative.
         * @param baseDirection the direction it faces
         * @param textureCircleDiameterW the diameter width of the circle on the texture
         * @param textureCircleDiameterH the diameter height of the circle on the texture
         * @param textureH the height of the texture of the body
         */
        public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale, int baseDirection, int textureCircleDiameterW, int textureCircleDiameterH, int textureH, Vec3f topoff){
            if(radius < 1){ textureCircleDiameterW = 2; textureCircleDiameterH = 2; } if(length < 1){ textureH = 2; }
            boolean dirTop = (baseDirection == MR_TOP || baseDirection == MR_BOTTOM);
            boolean dirSide = (baseDirection == MR_RIGHT || baseDirection == MR_LEFT);
            boolean dirFront = (baseDirection == MR_FRONT || baseDirection == MR_BACK);
            boolean dirMirror = (baseDirection == MR_LEFT || baseDirection == MR_BOTTOM || baseDirection == MR_BACK);
            boolean coneBase = (baseScale == 0);
            boolean coneTop = (topScale == 0);
            if(coneBase && coneTop){ baseScale = 1F; coneBase = false; }
            TexturedVertex[] tempVerts = new TexturedVertex[segments * (coneBase || coneTop ? 1 : 2) + 2];
            TexturedPolygon[] poly = new TexturedPolygon[segments * (coneBase || coneTop ? 2 : 3)];
            float xLength = (dirSide ? length : 0);
            float yLength = (dirTop ? length : 0);
            float zLength = (dirFront ? length : 0);
            float xStart = (dirMirror ? x + xLength : x);
            float yStart = (dirMirror ? y + yLength : y);
            float zStart = (dirMirror ? z + zLength : z);
            float xEnd = (!dirMirror ? x + xLength : x) + (topoff == null ? 0 : topoff.xCoord);
            float yEnd = (!dirMirror ? y + yLength : y) + (topoff == null ? 0 : topoff.yCoord);
            float zEnd = (!dirMirror ? z + zLength : z) + (topoff == null ? 0 : topoff.zCoord);
            tempVerts[0] = new TexturedVertex(xStart, yStart, zStart, 0, 0);
            tempVerts[tempVerts.length - 1] = new TexturedVertex(xEnd, yEnd, zEnd, 0, 0);
            float xCur = xStart;
            float yCur = yStart;
            float zCur = zStart;
            float sCur = (coneBase ? topScale : baseScale);
            for(int repeat = 0; repeat < (coneBase || coneTop ? 1 : 2); repeat++){
                for(int index = 0; index < segments; index++){
                    float xSize = (float)((mirror ^ dirMirror ? -1 : 1) * Math.sin((Static.PI / segments) * index * 2F + Static.PI) * radius * sCur);
                    float zSize = (float)(-Math.cos((Static.PI / segments) * index * 2F + Static.PI) * radius * sCur);
                    float xPlace = xCur + (!dirSide ? xSize : 0);
                    float yPlace = yCur + (!dirTop ? zSize : 0);
                    float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
                    tempVerts[1 + index + repeat * segments] = new TexturedVertex(xPlace, yPlace, zPlace, 0, 0 );
                }
                xCur = xEnd; yCur = yEnd; zCur = zEnd; sCur = topScale;
            }
            float uScale = 1.0F / textureWidth;
            float vScale = 1.0F / textureHeight;
            float uOffset = uScale / 20.0F;
            float vOffset = vScale / 20.0F;
            float uCircle = textureCircleDiameterW * uScale;
            float vCircle = textureCircleDiameterH * vScale;
            float uWidth = (uCircle * 2F - uOffset * 2F) / segments;
            float vHeight = textureH * vScale - uOffset * 2f;
            float uStart = textureOffsetX * uScale;
            float vStart = textureOffsetY * vScale;
            TexturedVertex[] vert;
            for(int index = 0; index < segments; index++){
                int index2 = (index + 1) % segments;
                float uSize = (float)(Math.sin((Static.PI / segments) * index * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle - 2F * uOffset));
                float vSize = (float)(Math.cos((Static.PI / segments) * index * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle - 2F * vOffset));
                float uSize1 = (float)(Math.sin((Static.PI / segments) * index2 * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle - 2F * uOffset));
                float vSize1 = (float)(Math.cos((Static.PI / segments) * index2 * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle - 2F * vOffset));
                vert = new TexturedVertex[3];
                vert[0] = tempVerts[0].setTexturePosition(uStart + 0.5F * uCircle, vStart + 0.5F * vCircle);
                vert[1] = tempVerts[1 + index2].setTexturePosition(uStart + 0.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
                vert[2] = tempVerts[1 + index].setTexturePosition(uStart + 0.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);
                poly[index] = new TexturedPolygon(vert);
                if(!dirFront || mirror){
                    poly[index].flipFace();
                }
                if(!coneBase && !coneTop){
                    vert = new TexturedVertex[4];
                    vert[0] = tempVerts[1 + index].setTexturePosition(uStart + uOffset + uWidth * index, vStart + vOffset + vCircle);
                    vert[1] = tempVerts[1 + index2].setTexturePosition(uStart + uOffset + uWidth * (index + 1), vStart + vOffset + vCircle);
                    vert[2] = tempVerts[1 + segments + index2].setTexturePosition(uStart + uOffset + uWidth * (index + 1), vStart + vOffset + vCircle + vHeight);
                    vert[3] = tempVerts[1 + segments + index].setTexturePosition(uStart + uOffset + uWidth * index, vStart + vOffset + vCircle + vHeight);
                    poly[index + segments] = new TexturedPolygon(vert);
                    if(!dirFront || mirror){
                        poly[index + segments].flipFace();
                    }
                }
                vert = new TexturedVertex[3];
                vert[0] = tempVerts[tempVerts.length - 1].setTexturePosition(uStart + 1.5F * uCircle, vStart + 0.5F * vCircle);
                vert[1] = tempVerts[tempVerts.length - 2 - index].setTexturePosition(uStart + 1.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
                vert[2] = tempVerts[tempVerts.length - (1 + segments) + ((segments - index) % segments)].setTexturePosition(uStart + 1.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);
                poly[poly.length - segments + index]  = new TexturedPolygon(vert);
                if(!dirFront || mirror){
                    poly[poly.length - segments + index].flipFace();
                }
            }
            faces.addAll(Arrays.asList(poly));
            return this;
        }


    public ModelRendererTurbo addHollowCylinder(float x, float y, float z, float radius, float radius2, float length, int segments, int seglimit, float baseScale, float topScale, int baseDirection, int textureCircleDiameterW, int textureCircleDiameterH, int textureH, Vec3f topoff, boolean[] bools){
        if(radius < 1){ textureCircleDiameterW = 2; textureCircleDiameterH = 2; } if(length < 1){ textureH = 2; }
        boolean dirTop = (baseDirection == MR_TOP || baseDirection == MR_BOTTOM);
        boolean dirSide = (baseDirection == MR_RIGHT || baseDirection == MR_LEFT);
        boolean dirFront = (baseDirection == MR_FRONT || baseDirection == MR_BACK);
        boolean dirMirror = (baseDirection == MR_LEFT || baseDirection == MR_BOTTOM || baseDirection == MR_BACK);
        if(baseScale == 0) baseScale = 1f; if(topScale == 0) topScale = 1f;
        if(segments < 3) segments = 3; if(seglimit <= 0) seglimit = segments; boolean segl = seglimit < segments;
        ArrayList<TexturedVertex> verts = new ArrayList<>(); ArrayList<TexturedPolygon> polis = new ArrayList<>();
        //Vertex
        float xLength = (dirSide ? length : 0), yLength = (dirTop ? length : 0), zLength = (dirFront ? length : 0);
        float xStart = (dirMirror ? x + xLength : x);
        float yStart = (dirMirror ? y + yLength : y);
        float zStart = (dirMirror ? z + zLength : z);
        float xEnd = (!dirMirror ? x + xLength : x) + (topoff == null ? 0 : topoff.xCoord);
        float yEnd = (!dirMirror ? y + yLength : y) + (topoff == null ? 0 : topoff.yCoord);
        float zEnd = (!dirMirror ? z + zLength : z) + (topoff == null ? 0 : topoff.zCoord);
        float xCur = xStart, yCur = yStart, zCur = zStart, sCur = baseScale;
        //Texture
        float uScale = 1.0F / textureWidth, vScale = 1.0F / textureHeight;
        float uOffset = uScale / 20.0F, vOffset = vScale / 20.0F;
        float uCircle = textureCircleDiameterW * uScale;
        float vCircle = textureCircleDiameterH * vScale;
        float uCircle2 = ((int)Math.floor(radius2 * 2F)) * uScale;
        float vCircle2 = ((int)Math.floor(radius2 * 2F)) * vScale;
        float uWidth = (uCircle * 2F - uOffset * 2F) / segments;
        float vHeight = textureH * vScale - uOffset * 2f;
        float uStart = textureOffsetX * uScale, vStart = textureOffsetY * vScale;
        //Temporary Arrays
        ArrayList<TexturedVertex> verts0 = new ArrayList<>();
        ArrayList<TexturedVertex> verts1 = new ArrayList<>();
        ArrayList<TexturedVertex> verts2 = new ArrayList<>();
        ArrayList<TexturedVertex> verts3 = new ArrayList<>();
        for(int repeat = 0; repeat < 2; repeat++){//top/base faces
            for(int index = 0; index < segments; index++){
                float xSize = (float)((mirror ^ dirMirror ? -1 : 1) * Math.sin((Static.PI / segments) * index * 2F + Static.PI) * radius * sCur);
                float zSize = (float)(-Math.cos((Static.PI / segments) * index * 2F + Static.PI) * radius * sCur);
                float xPlace = xCur + (!dirSide ? xSize : 0);
                float yPlace = yCur + (!dirTop ? zSize : 0);
                float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
                verts0.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    TexturedVertex copy = new TexturedVertex(verts0.get(0)); verts0.add(copy);
                }
                //
                float xSize2 = (float)((mirror ^ dirMirror ? -1 : 1) * Math.sin((Static.PI / segments) * index * 2F + Static.PI) * radius2 * sCur);
                float zSize2 = (float)(-Math.cos((Static.PI / segments) * index * 2F + Static.PI) * radius2 * sCur);
                xPlace = xCur + (!dirSide ? xSize2 : 0);
                yPlace = yCur + (!dirTop ? zSize2 : 0);
                zPlace = zCur + (dirSide ? xSize2 : (dirTop ? zSize2 : 0));
                verts1.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    TexturedVertex copy = new TexturedVertex(verts1.get(0)); verts1.add(copy);
                }
            }
            verts.addAll(verts0); verts.addAll(verts1);
            if(repeat == 0){ verts2.addAll(verts0); verts2.addAll(verts1); }
            else{ verts3.addAll(verts0); verts3.addAll(verts1); }
            float xSize, ySize; float mul = repeat == 0 ? 0.5f : 1.5f;
            boolean bool = (repeat == 0) != dirFront;
            if((repeat == 0 && !bools[0]) || (repeat == 1 && !bools[1])){
                for(int i = 0; i < verts0.size(); i++){
                    if(i >= (verts0.size() - 1) || i >= seglimit) break;
                    TexturedVertex[] arr = new TexturedVertex[4];
                    xSize = (float)(Math.sin((Static.PI / segments) * i * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle - 2F * uOffset));
                    ySize = (float)(Math.cos((Static.PI / segments) * i * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle - 2F * vOffset));
                    arr[0] = verts0.get(i).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                    //
                    xSize = (float)(Math.sin((Static.PI / segments) * i * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle2 - 2F * uOffset));
                    ySize = (float)(Math.cos((Static.PI / segments) * i * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle2 - 2F * vOffset));
                    arr[1] = verts1.get(i).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                    //
                    xSize = (float)(Math.sin((Static.PI / segments) * (i + 1) * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle2 - 2F * uOffset));
                    ySize = (float)(Math.cos((Static.PI / segments) * (i + 1) * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle2 - 2F * vOffset));
                    arr[2] = verts1.get(i + 1).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                    //
                    xSize = (float)(Math.sin((Static.PI / segments) * (i + 1) * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * uCircle - 2F * uOffset));
                    ySize = (float)(Math.cos((Static.PI / segments) * (i + 1) * 2F + (!dirTop ? 0 : Static.PI)) * (0.5F * vCircle - 2F * vOffset));
                    arr[3] = verts0.get(i + 1).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                    polis.add(new TexturedPolygon(arr));
                    if(bool) polis.get(polis.size() - 1 ).flipFace();
                }
            }
            verts0.clear(); verts1.clear(); xCur = xEnd; yCur = yEnd; zCur = zEnd; sCur = topScale;
        }
        int halfv2 = verts2.size() / 2;
        for(int i = 0; i < halfv2; i++){
            if(i >= seglimit && segl){
                TexturedVertex[] arr = new TexturedVertex[4]; float xpos = uStart + uOffset + (uCircle * 2f);
                arr[0] = verts2.get(0).setTexturePosition(xpos, vStart + vOffset + vCircle);
                arr[1] = verts3.get(0).setTexturePosition(xpos, vStart + vOffset + vCircle + vHeight);
                arr[2] = verts3.get(halfv2).setTexturePosition(xpos + ((radius - radius2) * uScale), vStart + vOffset + vCircle + vHeight);
                arr[3] = verts2.get(halfv2).setTexturePosition(xpos + ((radius - radius2) * uScale), vStart + vOffset + vCircle);
                polis.add(new TexturedPolygon(arr));
                if(!dirFront) polis.get(polis.size() - 1 ).flipFace();
                arr = new TexturedVertex[4];
                arr[0] = verts2.get(seglimit).setTexturePosition(xpos, vStart + vOffset + vCircle + vHeight);
                arr[1] = verts3.get(seglimit).setTexturePosition(xpos, vStart + vOffset + vCircle + vHeight + vHeight);
                arr[2] = verts3.get(seglimit + halfv2).setTexturePosition(xpos + ((radius - radius2) * uScale), vStart + vOffset + vCircle + vHeight + vHeight);
                arr[3] = verts2.get(seglimit + halfv2).setTexturePosition(xpos + ((radius - radius2) * uScale), vStart + vOffset + vCircle + vHeight);
                polis.add(new TexturedPolygon(arr));
                if(dirFront) polis.get(polis.size() - 1 ).flipFace();
                break;
            }
            if(i >= (halfv2 - 1)) break;
            TexturedVertex[] arr = new TexturedVertex[4];
            if(!bools[2]){
                arr[0] = verts2.get(i + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle);
                arr[1] = verts3.get(i + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight);
                arr[2] = verts3.get(i + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight);
                arr[3] = verts2.get(i + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle);
                polis.add(new TexturedPolygon(arr));
                if(dirFront) polis.get(polis.size() - 1 ).flipFace();
            }
            if(!bools[3]){
                arr = new TexturedVertex[4];
                arr[0] = verts2.get(i + halfv2 + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight);
                arr[1] = verts3.get(i + halfv2 + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight + vHeight);
                arr[2] = verts3.get(i + halfv2 + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight + vHeight);
                arr[3] = verts2.get(i + halfv2 + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight);
                polis.add(new TexturedPolygon(arr));
                if(!dirFront) polis.get(polis.size() - 1 ).flipFace();
            }
        }
        faces.addAll(polis);
        return this;
    }

    /**
     * Instances a new FMT CylinderBuilder
     */
    public CylinderBuilder newCylinderBuilder(){
        return new CylinderBuilder(this);
    }

    /**
     * Instances a new FMT BoxBuilder
     */
    public BoxBuilder newBoxBuilder(){
        return new BoxBuilder(this);
    }

    /**
     * Adds a Waveform .obj file as a model. Model files use the entire texture file.
     * @param file the location of the .obj file. The location is relative to the base directories,
     * which are either resources/models or resources/mods/models.
     */
    public void addObj(String file){
        addModel(file, ModelPool.OBJ);
    }

    public void addObjF(String file){
        try{
            addModelF(file, ModelPool.OBJ);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds model format support. Model files use the entire texture file.
     * @param file the location of the model file. The location is relative to the base directories,
     * which are either resources/models or resources/mods/models.
     * @param modelFormat the class of the model format interpreter
     */
    public void addModel(String file, Class<?> modelFormat){
        ModelPoolEntry entry = ModelPool.addFile(file, modelFormat);
        if(entry == null){
            return;
        }
        faces.addAll(Arrays.asList(entry.faces));
    }

    public void addModelF(String file, Class<?> modelFormat) throws IOException{
        ModelPoolEntry entry = ModelPool.addFileF(file, modelFormat);
        if(entry == null){
            return;
        }
        faces.addAll(Arrays.asList(entry.faces));
    }

    /**
     * Sets a new position for the texture offset.
     * @param x the x-coordinate of the texture start
     * @param y the y-coordinate of the texture start
     */
    public ModelRendererTurbo setTextureOffset(int x, int y){
        textureOffsetX = x;
        textureOffsetY = y;
        return this;
    }

    /**
     * Sets the position of the shape, relative to the model's origins. Note that changing
     * the offsets will not change the pivot of the model.
     * @param x the x-position of the shape
     * @param y the y-position of the shape
     * @param z the z-position of the shape
     */
    public ModelRendererTurbo setPosition(float x, float y, float z){
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
        return this;
    }

    /**
     * Sets the rotation point of the shape, relative to the model's origins. Note that changing
     * the offsets will not change the pivot of the model.
     * @param x the x-rotation point of the shape
     * @param y the y-rotation point of the shape
     * @param z the z-rotation point of the shape
     */
    public ModelRendererTurbo setRotationPoint(float x, float y, float z){
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
        return this;
    }
    /**
     *
     * Sets the rotation angles of the shape.
     * @param x the x-rotation angle of the shape
     * @param y the y-rotation angle of the shape
     * @param z the z-rotation angle of the shape
     */
    public ModelRendererTurbo setRotationAngle(float x, float y, float z){
        rotateAngleX = x;
        rotateAngleY = y;
        rotateAngleZ = z;
        return this;
    }

    /**
     * Mirrors the model in any direction.
     * @param x whether the model should be mirrored in the x-direction
     * @param y whether the model should be mirrored in the y-direction
     * @param z whether the model should be mirrored in the z-direction
     */
    public void doMirror(boolean x, boolean y, boolean z){
        for(TexturedPolygon face : faces){
            List<TexturedVertex> verts = face.vertices;
            for(TexturedVertex vert : verts){
                vert.vector3F.addVector(
                        vert.vector3F.xCoord * (x ? -1 : 1),
                        vert.vector3F.xCoord * (y ? -1 : 1),
                        vert.vector3F.xCoord * (z ? -1 : 1));
            }
            if(x^y^z){
                Collections.reverse(face.vertices);
            }
        }
    }

    /**
     * Sets whether the shape is mirrored or not. This has effect on the way the textures
     * get displayed. When working with addSprite, addPixel and addObj, it will be ignored.
     * @param isMirrored a boolean to define whether the shape is mirrored
     */
    public void setMirrored(boolean isMirrored){
        mirror = isMirrored;
    }


    /**
     * Clears the current shape. Since all shapes are stacked into one shape, you can't
     * just replace a shape by overwriting the shape with another one. In this case you
     * would need to clear the shape first.
     */
    public void clear(){
        faces = new ArrayList<>();
    }



    public void render(){
        render(0.0625F);
    }

    /**
     * Renders the shape.
     * @param scale the scale of the shape. Usually is 0.0625.
     */
    public void render(float scale){
        if(!showModel){
            return;
        }
        if (ignoresLighting){
            Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
        }
        if(rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F){
            GL11.glTranslatef(rotationPointX * scale, rotationPointY * scale, rotationPointZ * scale);
        }

        if(rotateAngleY != 0.0F){
            GL11.glRotatef(rotateAngleY, 0.0F, 1.0F, 0.0F);
        }
        if(rotateAngleZ != 0.0F){
            GL11.glRotatef(rotateAngleZ, 0.0F, 0.0F, 1.0F);
        }
        if(rotateAngleX != 0.0F){
            GL11.glRotatef(rotateAngleX, 1.0F, 0.0F, 0.0F);
        }

        for (TexturedPolygon poly : faces) {
            Tessellator.getInstance().drawTexturedVertsWithNormal(poly, scale);
        }
        if(rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F){
            GL11.glTranslatef(-rotationPointX * scale, -rotationPointY * scale, -rotationPointZ * scale);
        }
        if (ignoresLighting){
            Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
        }
    }




    //ETERNAL: changed w/h/d to floats for better support of the custom render on the rails.
    public ModelRendererTurbo addShapeBox(float x, float y, float z, float w, float h, float d, float scale, float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7, float z7){
        width=w;height=h;depth=d;
        if(w==0){
            x-=0.005f;
            w=0.005f;
        }
        if(h==0){
            y-=0.005f;
            h=0.005f;
        }
        if(d==0) {
            z -= 0.005f;
            d=0.005f;
        }
        float f4 = x + w, f5 = y + h, f6 = z + d;
        x -= scale; y -= scale; z -= scale;
        f4 += scale; f5 += scale; f6 += scale;
        if(mirror){
            float f7 = f4; f4 = x; x = f7;
        }

        float[][] v  = {{x  - x0, y  - y0, z  - z0}, {f4 + x1, y  - y1, z  - z1},{f4 + x5, f5 + y5, z  - z5}, {x  - x4, f5 + y4, z  - z4}, {x  - x3, y  - y3, f6 + z3}, {f4 + x2, y  - y2, f6 + z2},{f4 + x6, f5 + y6, f6 + z6}, {x  - x7, f5 + y7, f6 + z7}};
        if(w==0.005f){
            w=0;
        }
        if(h==0.005f){
            h=0;
        }
        if(d==0.005f){
            d=0;
        }
        addRectShape(v[0], v[1], v[2], v[3], v[4], v[5], v[6], v[7], w, h, d);
        return this;
    }


    public ModelRendererTurbo addShapeBox(float x, float y, float z, float w, float h, float d, float scale, float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7, float z7, boolean[] sides){
        if(sides==new boolean[]{true,true,true,true,true,true}){
            return addShapeBox(x, y, z, w, h, d, scale, x0, y0, z0, x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4, x5, y5, z5, x6, y6, z6, x7, y7, z7);
        } else {
            width=w;height=h;depth=d;
            newBoxBuilder().setCorners(x0, y0, z0, x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4, x5, y5, z5, x6, y6, z6, x7, y7, z7)
                    .setOffset(x, y, z).setSize(w, h, d).setExpansion(scale).removePolygons(sides);
            return this;
        }
    }


    @Override
    public String toString(){
        return (boxName==null?"unnamed model":boxName);
    }


    //name set for FMT compatibility.
    public ModelRendererTurbo setName(String n){
        boxName=n;
        return this;
    }


    //stub for FMT compatibility.
    public ModelRendererTurbo setTextured(boolean b){
        return this;
    }

    //stub for FMT compatibility.
    public ModelRendererTurbo setLines(boolean b){
        return this;
    }

}