package train.client.tmt;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.client.renderer.GLAllocation;
import org.lwjgl.opengl.GL11;

import java.util.*;

/**
 * An extension to the ModelRenderer class that contains various new methods to make your models.
 * <br /><br />
 * Since the ModelRendererTurbo class gets loaded during startup, the models made
 * can be very complex. This is why I can afford to add, for example, Wavefont OBJ
 * support or have the addSprite method, methods that add a lot of vertices and polygons.
 * @author GaryCXJk
 * @license http://fexcraft.net/license?id=tmt
 * <br /><br />
 * This version of TMT has been heavily modified by Eternal Blue Flame and does not reflect the quality or features of any other version.
 * Models made for other versions of TMT may not work with this version, and models made for this version may not work in other versions.
 * Shape3D is not supported in this version, use Shape Boxes instead.
 * The shape's name is used by the Model Animators for various functionality, there are specific pre-defined names to use for said features
 */
public class ModelRendererTurbo extends ModelRenderer {


    /**converts a radians float to degrees */
    public static final float degreesF = (float) (180.0d / Math.PI);

    /**
     * Creates a new ModelRenderTurbo object with a defined name.
     * @param modelbase
     * @param s the name of the shape
     */
	public ModelRendererTurbo(ModelBase modelbase, String s) {
		super(modelbase, s);
        transformGroup.put("0", new TransformGroupBone(new Bone(0, 0, 0, 0), 1D));
        textureGroup.put("0", new ArrayList<TexturedPolygon>());
        currentTextureGroup = textureGroup.get("0");
	}
    /**
     * Creates a new ModelRenderTurbo object with no defined name.
     * @param modelbase
     */
	public ModelRendererTurbo(ModelBase modelbase)
	{
		this(modelbase, "");
	}
	
	/**
	 * Creates a new ModelRenderTurbo object. It requires the coordinates of the
	 * position of the texture, and assumes the texture has a base resolution of 128x64
	 * @param modelbase
	 * @param textureX the x-coordinate on the texture
	 * @param textureY the y-coordinate on the texture
	 */
    public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY) {
    	this(modelbase, textureX, textureY, 128, 64);
    }

    /**
     * Creates a new ModelRenderTurbo object. It requires the coordinates of the
     * position of the texture, but also allows you to specify the width and height
     * of the texture, allowing you to use bigger textures instead.
     * @param modelbase
     * @param textureX
     * @param textureY
     * @param textureU
     * @param textureV
     */
    public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY, int textureU, int textureV) {
    	this(modelbase);
        textureOffsetX = textureX;
        textureOffsetY = textureY;
        textureWidth = textureU;
        textureHeight = textureV;
    }

    /**
     * Creates a new ModelRenderTurbo object with a name. It requires the coordinates of the
     * position of the texture, but also allows you to specify the width and height
     * of the texture, allowing you to use bigger textures instead.
     * It also requires a string to define the name of the box, this is used for animation
     * @param modelbase the shape.
     * @param textureX the texture left position
     * @param textureY the texture top position
     * @param textureU the texture width
     * @param textureV the texture heught
     * @param boxName the name of the shape.
     */
    public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY, int textureU, int textureV, String boxName) {
        this(modelbase, boxName);
        textureOffsetX = textureX;
        textureOffsetY = textureY;
        textureWidth = textureU;
        textureHeight = textureV;
    }
    
    /**
     * Creates a new polygon.
     * @param verts an array of vertices
     */
    public void addPolygon(PositionTextureVertex[] verts) {
    	copyTo(verts, new TexturedPolygon[] {new TexturedPolygon(verts)});
    }
    
    /**
     * Creates a new polygon, and adds UV mapping to it.
     * @param verts an array of vertices
     * @param uv an array of UV coordinates
     */
    public void addPolygon(PositionTextureVertex[] verts, int[][] uv) {
        for(int i = 0; i < verts.length; i++) {
            verts[i] = verts[i].setTexturePosition(uv[i][0] / textureWidth, uv[i][1] / textureHeight);
        }
        addPolygon(verts);
    }
    
    /**
     * Creates a new polygon with a given UV.
     * @param verts an array of vertices
     * @param u1
     * @param v1
     * @param u2
     * @param v2
     */
    public void addPolygon(PositionTextureVertex[] verts, int u1, int v1, int u2, int v2) {
    	copyTo(verts, new TexturedPolygon[] {addPolygonReturn(verts, u1, v1, u2, v2)});
    }
    
    private TexturedPolygon addPolygonReturn(PositionTextureVertex[] verts, float u1, float v1, float u2, float v2) {
    	if(verts.length < 3) {
            return null;
        }
    	float uOffs = 1.0F / (textureWidth * 10.0F);
    	float vOffs = 1.0F / (textureHeight * 10.0F);
    	if(verts.length < 4) {
    		float xMin = -1;
    		float yMin = -1;
    		float xMax = 0;
    		float yMax = 0;
    		
    		for(PositionTextureVertex vert : verts) {
    			xMax = Math.max(xMax, vert.texturePositionX);
    			xMin = (xMin < -1 ? vert.texturePositionX : Math.min(xMin, vert.texturePositionX));
    			yMax = Math.max(yMax, vert.texturePositionY);
    			yMin = (yMin < -1 ? vert.texturePositionY : Math.min(yMin, vert.texturePositionY));
    		}
    		float uMin = u1 / textureWidth + uOffs;
    		float vMin = v1 / textureHeight + vOffs;
    		float uSize = (u2 - u1) / textureWidth - uOffs * 2;
    		float vSize = (v2 - v1) / textureHeight - vOffs * 2;
    		
    		float xSize = xMax - xMin;
    		float ySize = yMax - yMin;
    		for(int i = 0; i < verts.length; i++) {
    			float xPos = verts[i].texturePositionX;
    			float yPos = verts[i].texturePositionY;
    			xPos = (xPos - xMin) / xSize;
    			yPos = (yPos - yMin) / ySize;
    			verts[i] = verts[i].setTexturePosition(uMin + (xPos * uSize), vMin + (yPos * vSize));
    		}
    	} else {
	    	verts[0] = verts[0].setTexturePosition(u2 / textureWidth - uOffs, v1 / textureHeight + vOffs);
	    	verts[1] = verts[1].setTexturePosition(u1 / textureWidth + uOffs, v1 / textureHeight + vOffs);
	    	verts[2] = verts[2].setTexturePosition(u1 / textureWidth + uOffs, v2 / textureHeight - vOffs);
	    	verts[3] = verts[3].setTexturePosition(u2 / textureWidth - uOffs, v2 / textureHeight - vOffs);
    	}
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
    public void addRectShape(float[] v, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6, float[] v7, float w, float h, float d) {
        //check which sides should be rendered.
        boolean showZ= w!=0;
        boolean showY= h!=0;
        boolean showX= d!=0;

        //small edit to prevent depth errors
        if (w ==0){
            w=0.001f;
        } else if (h ==0){
            h=0.001f;
        } else if (d ==0){
            d=0.001f;
        }

        PositionTextureVertex[] verts = new PositionTextureVertex[8];
        TexturedPolygon[] poly = new TexturedPolygon[(showX?2:0) + (showY?2:0) +(showZ?2:0)];
        verts[0] = new PositionTextureVertex(v[0], v[1], v[2], 0.0F, 0.0F);
        verts[1] = new PositionTextureVertex(v1[0], v1[1], v1[2], 0.0F, 8F);
        verts[2] = new PositionTextureVertex(v2[0], v2[1], v2[2], 8F, 8F);
        verts[3] = new PositionTextureVertex(v3[0], v3[1], v3[2], 8F, 0.0F);
        verts[4] = new PositionTextureVertex(v4[0], v4[1], v4[2], 0.0F, 0.0F);
        verts[5] = new PositionTextureVertex(v5[0], v5[1], v5[2], 0.0F, 8F);
        verts[6] = new PositionTextureVertex(v6[0], v6[1], v6[2], 8F, 8F);
        verts[7] = new PositionTextureVertex(v7[0], v7[1], v7[2], 8F, 0.0F);

        int normal =0;

        if(showX) {
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[5], verts[1], verts[2], verts[6]
            }, textureOffsetX + d + w, textureOffsetY + d, textureOffsetX + d + w + d, textureOffsetY + d + h);
            normal++;
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[0], verts[4], verts[7], verts[3]
            }, textureOffsetX, textureOffsetY + d, textureOffsetX + d, textureOffsetY + d + h);
            normal++;
        }
        if(showY) {
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[5], verts[4], verts[0], verts[1]
            }, textureOffsetX + d, textureOffsetY, textureOffsetX + d + w, textureOffsetY + d);
            normal++;
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[2], verts[3], verts[7], verts[6]
            }, textureOffsetX + d + w, textureOffsetY, textureOffsetX + d + w + w, textureOffsetY + d);
            normal++;
        }
        if(showZ) {
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[1], verts[0], verts[3], verts[2]
            }, textureOffsetX + d, textureOffsetY + d, textureOffsetX + d + w, textureOffsetY + d + h);
            normal++;
            poly[normal] = addPolygonReturn(new PositionTextureVertex[]{
                    verts[4], verts[5], verts[6], verts[7]
            }, textureOffsetX + d + w + d, textureOffsetY + d, textureOffsetX + d + w + d + w, textureOffsetY + d + h);
        }

        if(mirror ^ flip) {
            for(TexturedPolygon polygon : poly) {
            	polygon.flipFace();
            }

        }
        
        copyTo(verts, poly);
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
    public ModelRendererTurbo addBox(float x, float y, float z, float w, float h, float d) {
        addBox(x, y, z, w, h, d, 0.0F, 1F);
        return this;
    }
    @Override
    public void addBox(float x, float y, float z, int w, int h, int d, float s) {
        addBox(x, y, z, w, h, d, s, 1F);
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
     * @param scale unused, only remains for reference purposes. It's supposed to define overall scale, but never got a value besides 1, and never seemed to be used by the editing software.
     */
    public void addBox(float x, float y, float z, float w, float h, float d, float expansion, float scale) {
        xScale = w * 0.065f;
        yScale = h * 0.065f;
        zScale = d * 0.065f;

        float x1 = x + w + expansion;
        float y1 = y + h + expansion;
        float z1 = z + d + expansion;

        x -= expansion;
        y -= expansion;
        z -= expansion;
        if(mirror) {
            float xTemp = x1;
            x1 = x;
            x = xTemp;
        }

        float[][] v = {{x, y, z}, {x1, y, z}, {x1, y1, z}, {x, y1, z}, {x, y, z1}, {x1, y, z1}, {x1, y1, z1}, {x, y1, z1}};
        addRectShape(v[0],v[1],v[2],v[3],v[4],v[5],v[6],v[7], w, h, d);
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
    public void addTrapezoid(float x, float y, float z, int w, int h, int d, float scale, float bottomScale, int dir) {
        float f4 = x + w + scale;
        float f5 = y + h+ scale;
        float f6 = z + d+ scale;
        x -= scale;
        y -= scale;
        z -= scale;
                
        int m = (mirror ? -1 : 1);
        if(mirror) {
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
        
        switch(dir) {
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
     * Adds a cube the size of one pixel. It will take a pixel from the texture and
     * uses that as the texture of said cube. The accurate name would actually be
     * "addVoxel". This method has been added to make it more compatible with Techne,
     * and allows for easy single-colored boxes.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param width the width of the box
     * @param height the height of the box
     * @param length the length of the box
     */
    public void addPixel(float x, float y, float z, float width, float height, float length) {
    	addPixel(x, y, z, new float[] {width, height, length}, textureOffsetX, textureOffsetY);
    }
    
    /**
     * Adds a cube the size of one pixel. It will take a pixel from the texture and
     * uses that as the texture of said cube. The accurate name would actually be
     * "addVoxel". It will not overwrite the model data, but rather, it will add to
     * the model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param scale the "scale" of the cube, where scale is a float integer consisting of three values
     * @param w the x-coordinate on the texture
     * @param h the y-coordinate on the texture
     */
    public void addPixel(float x, float y, float z, float[] scale, int w, int h) {
    	    	
    	float x1 = x + scale[0];
    	float y1 = y + scale[1];
    	float z1 = z + scale[2];

        PositionTextureVertex positionTexturevertex = new PositionTextureVertex(x,y,z, 0.0F, 0.0F);
        PositionTextureVertex positionTexturevertex1 = new PositionTextureVertex(x1,y,z, 0.0F, 8F);
        PositionTextureVertex positionTexturevertex2 = new PositionTextureVertex(x1, y1, z, 8F, 8F);
        PositionTextureVertex positionTexturevertex3 = new PositionTextureVertex(x, y1, z, 8F, 0.0F);
        PositionTextureVertex positionTexturevertex4 = new PositionTextureVertex(x, y, z1, 0.0F, 0.0F);
        PositionTextureVertex positionTexturevertex5 = new PositionTextureVertex(x1, y, z1, 0.0F, 8F);
        PositionTextureVertex positionTexturevertex6 = new PositionTextureVertex(x1, y1, z1, 8F, 8F);
        PositionTextureVertex positionTexturevertex7 = new PositionTextureVertex(x, y1, z1, 8F, 0.0F);

        
        copyTo(
                new PositionTextureVertex[]{
                        positionTexturevertex,positionTexturevertex1,positionTexturevertex2,positionTexturevertex3,positionTexturevertex4,
                        positionTexturevertex5,positionTexturevertex6,positionTexturevertex7
                },
                new TexturedPolygon[]{
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex5, positionTexturevertex1, positionTexturevertex2, positionTexturevertex6
                }, w, h, w + 1, h + 1),
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex, positionTexturevertex4, positionTexturevertex7, positionTexturevertex3
                }, w, h, w + 1, h + 1),
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex5, positionTexturevertex4, positionTexturevertex, positionTexturevertex1
                }, w, h, w + 1, h + 1),
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex2, positionTexturevertex3, positionTexturevertex7, positionTexturevertex6
                }, w, h, w + 1, h + 1),
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex1, positionTexturevertex, positionTexturevertex3, positionTexturevertex2
                }, w, h, w + 1, h + 1),
                addPolygonReturn(new PositionTextureVertex[] {
                        positionTexturevertex4, positionTexturevertex5, positionTexturevertex6, positionTexturevertex7
                }, w, h, w + 1, h + 1)
        });
    }
    
    /**
     * Creates a model shaped like the exact image on the texture. Note that this method will
     * increase the amount of quads on your model, which could effectively slow down your
     * PC, so unless it is really a necessity to use it, I'd suggest you avoid using this
     * method to create your model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width of the sprite
     * @param h the height of the sprite
     * @param expansion the expansion of the sprite. It only increases the size in each direction by that many.
     */
    public void addSprite(float x, float y, float z, int w, int h, float expansion) {
    	addSprite(x, y, z, w, h, 1, false, false, false, false, false, expansion);
    }
    
    /**
     * Creates a model shaped like the exact image on the texture. Note that this method will
     * increase the amount of quads on your model, which could effectively slow down your
     * PC, so unless it is really a necessity to use it, I'd suggest you avoid using this
     * method to create your model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width of the sprite
     * @param h the height of the sprite
     * @param rotX a boolean to define if it rotates 90 degrees around its yaw-axis
     * @param rotY a boolean to define if it rotates 90 degrees around its pitch-axis
     * @param rotZ a boolean to define if it rotates 90 degrees around its roll-axis
     * @param mirrorX a boolean to define if the sprite should be mirrored
     * @param mirrorY a boolean to define if the sprite should be flipped
     * @param expansion the expansion of the sprite. It only increases the size in each direction by that many.
     */
    public void addSprite(float x, float y, float z, int w, int h, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion) {
    	addSprite(x, y, z, w, h, 1, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }
    
    /**
     * Creates a model shaped like the exact image on the texture. Note that this method will
     * increase the amount of quads on your model, which could effectively slow down your
     * PC, so unless it is really a necessity to use it, I'd suggest you avoid using this
     * method to create your model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width of the sprite
     * @param h the height of the sprite
     * @param d the depth of the shape itself
     * @param rotX a boolean to define if it rotates 90 degrees around its yaw-axis
     * @param rotY a boolean to define if it rotates 90 degrees around its pitch-axis
     * @param rotZ a boolean to define if it rotates 90 degrees around its roll-axis
     * @param mirrorX a boolean to define if the sprite should be mirrored
     * @param mirrorY a boolean to define if the sprite should be flipped
     * @param expansion the expansion of the sprite. It only increases the size in each direction by that many.
     */
    public void addSprite(float x, float y, float z, int w, int h, int d, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion) {
    	addSprite(x, y, z, w, h, d, 1.0F, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }
    
    /**
     * Creates a model shaped like the exact image on the texture. Note that this method will
     * increase the amount of quads on your model, which could effectively slow down your
     * PC, so unless it is really a necessity to use it, I'd suggest you avoid using this
     * method to create your model.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param w the width of the sprite
     * @param h the height of the sprite
     * @param d the depth of the shape itself
     * @param pixelScale the scale of each individual pixel
     * @param rotX a boolean to define if it rotates 90 degrees around its yaw-axis
     * @param rotY a boolean to define if it rotates 90 degrees around its pitch-axis
     * @param rotZ a boolean to define if it rotates 90 degrees around its roll-axis
     * @param mirrorX a boolean to define if the sprite should be mirrored
     * @param mirrorY a boolean to define if the sprite should be flipped
     * @param expansion the expansion of the sprite. It only increases the size in each direction by that many.
     */
    public void addSprite(float x, float y, float z, int w, int h, int d, float pixelScale, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion) {
    	String[] mask = new String[h];
        char[] str = new char[w];
        Arrays.fill(str, '1');
        Arrays.fill(mask, new String(str));
    	
    	addSprite(x, y, z, mask, d, pixelScale, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }

    /**
     * Creates a model shaped like the exact image on the texture. Note that this method will
     * increase the amount of quads on your model, which could effectively slow down your
     * PC, so unless it is really a necessity to use it, I'd suggest you avoid using this
     * method to create your model.
     * <br /><br />
     * This method uses a mask string. This way you can reduce the amount of quads used. To
     * use this, create a String array, where you use a 1 to signify that the pixel will be
     * drawn. Any other character will cause that pixel to not be drawn.
     * @param x the starting x-position
     * @param y the starting y-position
     * @param z the starting z-position
     * @param mask an array with the mask string
     * @param d the depth of the shape itself
     * @param pixelScale the scale of each individual pixel
     * @param rotX a boolean to define if it rotates 90 degrees around its yaw-axis
     * @param rotY a boolean to define if it rotates 90 degrees around its pitch-axis
     * @param rotZ a boolean to define if it rotates 90 degrees around its roll-axis
     * @param mirrorX a boolean to define if the sprite should be mirrored
     * @param mirrorY a boolean to define if the sprite should be flipped
     * @param expansion the expansion of the sprite. It only increases the size in each direction by that many.
     */
    public void addSprite(float x, float y, float z, String[] mask, int d, float pixelScale, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion) {
    	int w = mask[0].length();
    	int h = mask.length;

    	int wDir;
    	int hDir;
    	int dDir;
    	
    	float wScale = 1F + (expansion / ( w * pixelScale));
    	float hScale = 1F + (expansion / ( h * pixelScale));
    	    	    	
    	if(!rotX) {
    		if(!rotY) {
    			if(!rotZ) {
    				wDir = 0;
    				hDir = 1;
    				dDir = 2;
    			} else {
    				wDir = 1;
    				hDir = 0;
    				dDir = 2;
    			}
    		} else {
    			if(!rotZ) {
    				wDir = 2;
    				hDir = 1;
    				dDir = 0;
       			} else {
    				wDir = 2;
    				hDir = 0;
    				dDir = 1;
    			}
    		}
    	} else {
    		if(!rotY) {
    			if(!rotZ) {
    				wDir = 0;
    				hDir = 2;
    				dDir = 1;
    			} else {
    				wDir = 1;
    				hDir = 2;
    				dDir = 0;
    			}
    		} else {
    			if(!rotZ) {
    				wDir = 2;
    				hDir = 0;
    				dDir = 1;
       			} else {
    				wDir = 2;
    				hDir = 1;
    				dDir = 0;
    			}
    		}
    	}
    	


    	for(int i = 0; i < w; i++) {
    		for(int j = 0; j < h; j++) {
    			if(mask[j].charAt(i) == '1') {
	    			addPixel((x - expansion) + getPixelSize(wScale, hScale, 0, wDir, hDir, 0, i, j),
                            (y - expansion) + getPixelSize(wScale, hScale, 0, wDir, hDir, 1, i, j),
                            (z - expansion) + getPixelSize(wScale, hScale, 0, wDir, hDir, 2, i, j),
	    					 new float[] {getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, wDir, 1, 1),
                                     getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, hDir, 1, 1),
                                     getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, dDir, 1, 1)
                             },
                            (textureOffsetX + (mirrorX ? w - 1 : 0)) + (mirrorY ? -1 : 1) * i, (textureOffsetY + (mirrorY ? h - 1 : 0)) + (mirrorY ? -1 : 1) * j);
    			}
    		}
    	}
    }
    
    private float getPixelSize(float wScale, float hScale, float dScale, int wDir, int hDir, int checkDir, int texPosX, int texPosY) {
    	return (wDir == checkDir ? wScale * texPosX : (hDir == checkDir ? hScale * texPosY : dScale));
    }
    
    /**
     * Adds a Waveform .obj file as a model. Model files use the entire texture file.
     * @param file the location of the .obj file. The location is relative to the base directories,
     * which are either resources/models or resources/mods/models.
     */
    public void addObj(String file){
        addModel(file);
    }
    
    /**
     * Adds model format support. Model files use the entire texture file.
     * @param file the location of the model file. The location is relative to the base directories,
     * which are either resources/models or resources/mods/models.
     */
    public void addModel(String file){

    	ModelPoolEntry entry = ModelPool.addFile(file, transformGroup, textureGroup);
    	if(entry == null){
    		return;
    	}
    	PositionTextureVertex[] verts = Arrays.copyOf(entry.vertices, entry.vertices.length);
    	TexturedPolygon[] poly = Arrays.copyOf(entry.faces, entry.faces.length);
    	if(flip){
            for(TexturedPolygon face : faces) {
                face.flipFace();
            }
    	}
    	copyTo(verts, poly, false);
    }
    
    /**
     * Sets a new position for the texture offset.
     * @param x the x-coordinate of the texture start
     * @param y the y-coordinate of the texture start
     */
    public ModelRendererTurbo setTextureOffset(int x, int y) {
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
    public void setPosition(float x, float y, float z) {
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
    }
    
    /**
     * Mirrors the model in any direction.
     * @param x whether the model should be mirrored in the x-direction
     * @param y whether the model should be mirrored in the y-direction
     * @param z whether the model should be mirrored in the z-direction
     */
    public void doMirror(boolean x, boolean y, boolean z) {
        for(TexturedPolygon face : faces) {
            for (PositionTextureVertex vert : face.vertexPositions) {
    			vert.vector3D.xCoord *= (x ? -1 : 1);
    			vert.vector3D.yCoord *= (y ? -1 : 1);
    			vert.vector3D.zCoord *= (z ? -1 : 1);
            }
            if (x ^ y ^ z) {
                face.flipFace();
            }
        }
    }
    
    /**
     * Sets whether the shape is mirrored or not. This has effect on the way the textures
     * get displayed. When working with addSprite, addPixel and addObj, it will be ignored.
     * @param isMirrored a boolean to define whether the shape is mirrored
     */
    public void setMirrored(boolean isMirrored)
    {
    	mirror = isMirrored;
    }
    
    /**
     * Sets whether the shape's faces are flipped or not. When GL_CULL_FACE is enabled,
     * it won't render the back faces, effectively giving you the possibility to make
     * "hollow" shapes. When working with addSprite and addPixel, it will be ignored.
     * @param isFlipped a boolean to define whether the shape is flipped
     */
    public void setFlipped(boolean isFlipped)
    {
    	flip = isFlipped;
    }

    /**
     * Clears the current shape. Since all shapes are stacked into one shape, you can't
     * just replace a shape by overwriting the shape with another one. In this case you
     * would need to clear the shape first.
     */
    public void clear() {
    	vertices = new PositionTextureVertex[0];
    	faces = new TexturedPolygon[0];
        transformGroup.clear();
        transformGroup.put("0", new TransformGroupBone(new Bone(0, 0, 0, 0), 1D));
        currentGroup = transformGroup.get("0");
    }
    
    /**
     * Copies an array of vertices and polygons to the current shape. This mainly is
     * used to copy each shape to the main class, but you can just use it to copy
     * your own shapes, for example from other classes, into the current class.
     * @param verts the array of vertices you want to copy
     * @param poly the array of polygons you want to copy
     */
    public void copyTo(PositionTextureVertex[] verts, TexturedPolygon[] poly)
    {
    	copyTo(verts, poly, true);
    }
    
    public void copyTo(PositionTextureVertex[] verts, TexturedPolygon[] poly, boolean copyGroup) {
        vertices = Arrays.copyOf(vertices, vertices.length + verts.length);
        faces = Arrays.copyOf(faces, faces.length + poly.length);
        
        for(int idx = 0; idx < verts.length; idx++) {
        	vertices[vertices.length - verts.length + idx] = verts[idx];
        	if(copyGroup && verts[idx] instanceof PositionTransformVertex)
        		((PositionTransformVertex)verts[idx]).addGroup(currentGroup);
        }
        
        for(int idx = 0; idx < poly.length; idx++) {
        	faces[faces.length - poly.length + idx] = poly[idx];
        	if(copyGroup)
        		currentTextureGroup.add(poly[idx]);
        }
    }
    
    /**
     * Copies an array of vertices and quads to the current shape. This method
     * converts quads to polygons and then calls the main copyTo method.
     * @param verts the array of vertices you want to copy
     * @param quad the array of quads you want to copy
     */
    public void copyTo(PositionTextureVertex[] verts, TexturedQuad[] quad) {
    	TexturedPolygon[] poly = new TexturedPolygon[quad.length];
    	for(int idx = 0; idx < quad.length; idx++) {
    		poly[idx] = new TexturedPolygon(quad[idx].vertexPositions);
    	}
    	
    	copyTo(verts, poly);
    }
       
    /**
     * Sets the current transformation group. The transformation group is used
     * to allow for vertex transformation. If a transformation group does not exist,
     * a new one will be created.
     * @param groupName the name of the transformation group you want to switch to
     */
    public void setGroup(String groupName)
    {
    	setGroup(groupName, new Bone(0, 0, 0, 0), 1D);
    }
    
    /**
     * Sets the current transformation group. The transformation group is used
     * to allow for vertex transformation. If a transformation group does not exist,
     * a new one will be created.
     * @param groupName the name of the transformation group you want to switch to
     * @param bone the Bone this transformation group is attached to
     * @param weight the weight of the transformation group
     */
    public void setGroup(String groupName, Bone bone, double weight) {
    	if(!transformGroup.containsKey(groupName))
    		transformGroup.put(groupName, new TransformGroupBone(bone, weight));
    	currentGroup = transformGroup.get(groupName);
    }

    /**
     * Gets the current transformation group.
     * @return the current PositionTransformGroup.
     */
    public TransformGroupBone getGroup()
    {
    	return currentGroup;
    }

    /**
     * Render's the shape with the default world scale
     */
    public void render(){
    	render(0.0625F, false);
    }

    public void render(float worldScale){
        render(worldScale, false);
    }

    /**
     * Renders the shape.
     * @param worldScale the scale of the shape. Usually is 0.0625.
     * @param invertYZ inverts the Y and Z render, works better for some models, default is false.
     */
    public void render(float worldScale, boolean invertYZ) {

        if(!showModel) {
            return;
        }
        if(!compiled) {
            compileDisplayList(worldScale);
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(rotationPointX * worldScale, rotationPointY * worldScale, rotationPointZ * worldScale);

        if(invertYZ){
            GL11.glRotatef(rotateAngleZ * degreesF, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-rotateAngleY * degreesF, 0.0F, 1.0F, 0.0F);
        } else{
            GL11.glRotatef(-rotateAngleY * degreesF, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(rotateAngleZ * degreesF, 0.0F, 0.0F, 1.0F);
        }
        GL11.glRotatef(rotateAngleX * degreesF, 1.0F, 0.0F, 0.0F);
        callDisplayList();
        GL11.glPopMatrix();
    }

    /**
     * Same as normal render but skips child models.
     * @param worldScale
     */
    public void renderWithRotation(float worldScale) {
        render(worldScale);
    }

    public void postRender(float worldScale) {}
    
    public void callDisplayList() {
        for(int displayList : displayListArray){
            GL11.glCallList(displayList);
        }
    }

    public void compileDisplayList(float worldScale) {
        Iterator<List<TexturedPolygon>> itr = textureGroup.values().iterator();
        displayListArray = new int[textureGroup.size()];
        for(int i = 0; itr.hasNext(); i++) {
            displayListArray[i] = GLAllocation.generateDisplayLists(1);
            GL11.glNewList(displayListArray[i], GL11.GL_COMPILE);
            Tessellator tessellator = Tessellator.getInstance();

            List<TexturedPolygon> usedGroup = itr.next();
            for(TexturedPolygon poly : usedGroup) {
                poly.draw(tessellator, worldScale);
            }

            GL11.glEndList();
        }

        compiled = true;
    }

    private PositionTextureVertex vertices[] = new PositionTextureVertex[0];
    private TexturedPolygon faces[] = new TexturedPolygon[0];
    public int textureOffsetX;
    public int textureOffsetY;
    public boolean compiled = false;
    private int displayListArray[];
    private Map<String, TransformGroupBone> transformGroup = new HashMap<String, TransformGroupBone>();
    public Map<String, List<TexturedPolygon>> textureGroup = new HashMap<String, List<TexturedPolygon>>();
    private TransformGroupBone currentGroup;
    private List<TexturedPolygon> currentTextureGroup;
    public boolean mirror = false;
    public boolean flip = false;
    public boolean showModel = true;
    //ETERNAL EDIT: removed field_1402_i, use ShowModel instead.
    //ETERNAL EDIT: removed forcedRecompile, just use compiled
    public float xScale;
    public float yScale;
    public float zScale;
    
    public static final int MR_FRONT = 0;
    public static final int MR_BACK = 1;
    public static final int MR_LEFT = 2;
    public static final int MR_RIGHT = 3;
    public static final int MR_TOP = 4;
    public static final int MR_BOTTOM = 5;
    
	private static final float pi = (float) Math.PI;

	public void addShapeBox(float x, float y, float z, int w, int h, int d, float scale, float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7, float z7){
		float f4 = x + w + scale;
        float f5 = y + h + scale;
        float f6 = z + d + scale;
		x -= scale; y -= scale; z -= scale;
		if(mirror){
			float f7 = f4;
			f4 = x;
			x = f7;
		}
		float[] v  = {x  - x0, y  - y0, z  - z0};
		float[] v1 = {f4 + x1, y  - y1, z  - z1};
		float[] v2 = {f4 + x5, f5 + y5, z  - z5};
		float[] v3 = {x  - x4, f5 + y4, z  - z4};
		float[] v4 = {x  - x3, y  - y3, f6 + z3};
		float[] v5 = {f4 + x2, y  - y2, f6 + z2};
		float[] v6 = {f4 + x6, f5 + y6, f6 + z6};
		float[] v7 = {x  - x7, f5 + y7, f6 + z7};
		addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
	}
}
