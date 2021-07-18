package tmt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
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

    public TexturedPolygon faces[];
    public float rotationPointX, rotationPointY, rotationPointZ;
    public float rotateAngleX, rotateAngleY, rotateAngleZ;
    public int textureOffsetX, textureWidth;
    public int textureOffsetY, textureHeight;
    public boolean compiled;
    private int displayList;
    private int displayListArray[];
    public Map<String, TextureGroup> textureGroup;
    private TextureGroup currentTextureGroup;
    public boolean mirror;
    public boolean flip;
    public boolean rotorder = false;
    public boolean showModel;
    public boolean field_1402_i;
    public boolean forcedRecompile;
    public boolean useLegacyCompiler;
    public List<?> childModels;
    public String boxName;
    public boolean isShape = false;
    
    private String defaultTexture;
    
    public static final int MR_FRONT = 0;
    public static final int MR_BACK = 1;
    public static final int MR_LEFT = 2;
    public static final int MR_RIGHT = 3;
    public static final int MR_TOP = 4;
    public static final int MR_BOTTOM = 5;

    //Eternal: added scaling to boxes for use with animator.
    public float xScale;
    public float yScale;
    public float zScale;
    
	private static final float pi = (float)Math.PI;
	
	public ModelRendererTurbo(Object Object, String s){
    	flip = false;
        compiled = false;
        displayList = 0;
        mirror = false;
        showModel = true;
        field_1402_i = false;
        faces = new TexturedPolygon[0];
        forcedRecompile = false;
        textureGroup = new HashMap<String, TextureGroup>();
        textureGroup.put("0", new TextureGroup());
        currentTextureGroup = textureGroup.get("0");
        boxName = s;
        defaultTexture = "";
        useLegacyCompiler = true;
	}
	
	public ModelRendererTurbo(Object Object){
		this(Object, "");
	}
	
	/**
	 * Creates a new ModelRenderTurbo object. It requires the coordinates of the
	 * position of the texture.
	 * @param Object
	 * @param textureX the x-coordinate on the texture
	 * @param textureY the y-coordinate on the texture
	 */
    public ModelRendererTurbo(Object Object, int textureX, int textureY){
    	this(Object, textureX, textureY, 64, 32);
    }

    /**
     * Creates a new ModelRenderTurbo object. It requires the coordinates of the
     * position of the texture, but also allows you to specify the width and height
     * of the texture, allowing you to use bigger textures instead.
     * @param Object
     * @param textureX
     * @param textureY
     * @param textureU
     * @param textureV
     */
    public ModelRendererTurbo(Object Object, int textureX, int textureY, int textureU, int textureV){
    	this(Object);
        textureOffsetX = textureX;
        textureOffsetY = textureY;
        textureWidth = textureU;
        textureHeight = textureV;
    }

    /**
     * ETERNAL: new object initialization method for animator support
     * Creates a new ModelRenderTurbo object with a name. It requires the coordinates of the
     * position of the texture, but also allows you to specify the width and height
     * of the texture, allowing you to use bigger textures instead.
     * It also requires a string to define the name of the box, this is used for animation
     * @param Object the shape.
     * @param textureX the texture left position
     * @param textureY the texture top position
     * @param textureU the texture width
     * @param textureV the texture heught
     * @param boxName the name of the shape.
     */
    public ModelRendererTurbo(Object Object, int textureX, int textureY, int textureU, int textureV, String boxName) {
        this(Object, boxName);
        textureOffsetX = textureX;
        textureOffsetY = textureY;
        textureWidth = textureU;
        textureHeight = textureV;
    }

    /**
     * Creates a new polygon.
     * @param verts an array of vertices
     */
    public void addPolygon(TexturedVertex[] verts){
    	copyTo(verts, new TexturedPolygon[] {new TexturedPolygon(verts)});
    }

    /**
     * Creates a new polygon, and adds UV mapping to it.
     * @param verts an array of vertices
     * @param uv an array of UV coordinates
     */
    public void addPolygon(TexturedVertex[] verts, int[][] uv){
    	try{
    		for(int i = 0; i < verts.length; i++){
    			verts[i] = verts[i].setTexturePosition(uv[i][0] / textureWidth, uv[i][1] / textureHeight);
    		}
    	}
    	finally{
    		addPolygon(verts);
    	}
    }

    /**
     * Creates a new polygon with a given UV.
     * @param verts an array of vertices
     * @param u1
     * @param v1
     * @param u2
     * @param v2
     */
    public void addPolygon(TexturedVertex[] verts, int u1, int v1, int u2, int v2){
    	copyTo(verts, new TexturedPolygon[] {addPolygonReturn(verts, u1, v1, u2, v2)});
    }

    private TexturedPolygon addPolygonReturn(TexturedVertex[] verts, float f, float g, float h, float j){
    	if(verts.length < 3){
    		return null;
    	}
    	float uOffs = 1.0F / (textureWidth * 10.0F);
    	float vOffs = 1.0F / (textureHeight * 10.0F);
    	if(verts.length < 4){
    		float xMin = -1;
    		float yMin = -1;
    		float xMax = 0;
    		float yMax = 0;
    		for(int i = 0; i < verts.length; i++){
    			float xPos = verts[i].textureX;
    			float yPos = verts[i].textureY;
    			xMax = Math.max(xMax, xPos);
    			xMin = (xMin < -1 ? xPos : Math.min(xMin, xPos));
    			yMax = Math.max(yMax, yPos);
    			yMin = (yMin < -1 ? yPos : Math.min(yMin, yPos));
    		}
    		float uMin = f / textureWidth + uOffs;
    		float vMin = g / textureHeight + vOffs;
    		float uSize = (h - f) / textureWidth - uOffs * 2;
    		float vSize = (j - g) / textureHeight - vOffs * 2;
    		float xSize = xMax - xMin;
    		float ySize = yMax - yMin;
    		for(int i = 0; i < verts.length; i++){
    			float xPos = verts[i].textureX;
    			float yPos = verts[i].textureY;
    			xPos = (xPos - xMin) / xSize;
    			yPos = (yPos - yMin) / ySize;
    			verts[i] = verts[i].setTexturePosition(uMin + (xPos * uSize), vMin + (yPos * vSize));
    		}
    	}
    	else{
	    	verts[0] = verts[0].setTexturePosition(h / textureWidth - uOffs, g / textureHeight + vOffs);
	    	verts[1] = verts[1].setTexturePosition(f / textureWidth + uOffs, g / textureHeight + vOffs);
	    	verts[2] = verts[2].setTexturePosition(f / textureWidth + uOffs, j / textureHeight - vOffs);
	    	verts[3] = verts[3].setTexturePosition(h / textureWidth - uOffs, j / textureHeight - vOffs);
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
     * @param sides 
     * @return 
     */
    public ModelRendererTurbo addRectShape(float[] v, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6, float[] v7, float w, float h, float d){
    	return addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d, null);
    }
    
    /** Updated to match the addRectShape method from FCL at 18.Jul.2021 @author Ferdinand (FEX___96) */
    public ModelRendererTurbo addRectShape(float[] v0, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6, float[] v7, float w, float h, float d, boolean[] sides){
        TexturedPolygon[] poly = new TexturedPolygon[6];
        TexturedVertex tv0 = new TexturedVertex(v0[0], v0[1], v0[2], 0.0F, 0.0F);
        TexturedVertex tv1 = new TexturedVertex(v1[0], v1[1], v1[2], 0.0F, 8.0F);
        TexturedVertex tv2 = new TexturedVertex(v2[0], v2[1], v2[2], 8.0F, 8.0F);
        TexturedVertex tv3 = new TexturedVertex(v3[0], v3[1], v3[2], 8.0F, 0.0F);
        TexturedVertex tv4 = new TexturedVertex(v4[0], v4[1], v4[2], 0.0F, 0.0F);
        TexturedVertex tv5 = new TexturedVertex(v5[0], v5[1], v5[2], 0.0F, 8.0F);
        TexturedVertex tv6 = new TexturedVertex(v6[0], v6[1], v6[2], 8.0F, 8.0F);
        TexturedVertex tv7 = new TexturedVertex(v7[0], v7[1], v7[2], 8.0F, 0.0F);
        if(w % 1 != 0) w = w < 1 ? 1 : (int)w + (w % 1 > 0.5f ? 1 : 0);
        if(h % 1 != 0) h = h < 1 ? 1 : (int)h + (h % 1 > 0.5f ? 1 : 0);
        if(d % 1 != 0) d = d < 1 ? 1 : (int)d + (d % 1 > 0.5f ? 1 : 0);
        if(sides == null){
            poly[0] = addPolygonReturn(new TexturedVertex[] { tv5, tv1, tv2, tv6 }, textureOffsetX + d + w, textureOffsetY + d, textureOffsetX + d + w + d, textureOffsetY + d + h);
            poly[1] = addPolygonReturn(new TexturedVertex[] { tv0, tv4, tv7, tv3 }, textureOffsetX + 0, textureOffsetY + d, textureOffsetX + d, textureOffsetY + d + h);
            poly[2] = addPolygonReturn(new TexturedVertex[] { tv5, tv4, tv0, tv1 }, textureOffsetX + d, textureOffsetY + 0, textureOffsetX + d + w, textureOffsetY + d);
            poly[3] = addPolygonReturn(new TexturedVertex[] { tv2, tv3, tv7, tv6 }, textureOffsetX + d + w, textureOffsetY + 0, textureOffsetX + d + w + w, textureOffsetY + d);
            poly[4] = addPolygonReturn(new TexturedVertex[] { tv1, tv0, tv3, tv2 }, textureOffsetX + d, textureOffsetY + d, textureOffsetX + d + w, textureOffsetY + d + h);
            poly[5] = addPolygonReturn(new TexturedVertex[] { tv4, tv5, tv6, tv7 }, textureOffsetX + d + w + d, textureOffsetY + d, textureOffsetX + d + w + d + w, textureOffsetY + d + h);
        }
        else{
        	float yp = sides[2] && sides[3] ? 0 : d;
        	float x0 = sides[1] ? 0 : d;
        	float x1 = sides[2] ? 0 : w;
        	float x2 = sides[4] ? 0 : w;
        	float x3 = sides[0] ? 0 : d;
            if(sides.length > 0 && !sides[0]) poly[0] = addPolygonReturn(new TexturedVertex[] { tv5, tv1, tv2, tv6 }, textureOffsetX + x0 + x2, textureOffsetY + yp, textureOffsetX + x0 + x2 + d, textureOffsetY + yp + h);
            if(sides.length > 1 && !sides[1]) poly[1] = addPolygonReturn(new TexturedVertex[] { tv0, tv4, tv7, tv3 }, textureOffsetX + 0, textureOffsetY + yp, textureOffsetX + d, textureOffsetY + yp + h);
            if(sides.length > 2 && !sides[2]) poly[2] = addPolygonReturn(new TexturedVertex[] { tv5, tv4, tv0, tv1 }, textureOffsetX + x0, textureOffsetY + 0, textureOffsetX + x0 + w, textureOffsetY + d);
            if(sides.length > 3 && !sides[3]) poly[3] = addPolygonReturn(new TexturedVertex[] { tv2, tv3, tv7, tv6 }, textureOffsetX + x0 + x1, textureOffsetY + 0, textureOffsetX + x0 + x1 + w, textureOffsetY + d);
            if(sides.length > 4 && !sides[4]) poly[4] = addPolygonReturn(new TexturedVertex[] { tv1, tv0, tv3, tv2 }, textureOffsetX + x0, textureOffsetY + yp, textureOffsetX + x0 + w, textureOffsetY + yp + h);
            if(sides.length > 5 && !sides[5]) poly[5] = addPolygonReturn(new TexturedVertex[] { tv4, tv5, tv6, tv7 }, textureOffsetX + x0 + x2 + x3, textureOffsetY + yp, textureOffsetX + x0 + x2 + x3 + w, textureOffsetY + yp + h);
        }
        if(mirror ^ flip){
            for(int l = 0; l < poly.length; l++){
            	poly[l].flipFace();
            }
        }
        if(sides != null){
        	int polis = 0, processed = 0;
        	for(int i = 0; i < poly.length; i++) if(poly[i] != null) polis++;
            TexturedPolygon[] polygons = new TexturedPolygon[polis];
        	for(int i = 0; i < poly.length; i++){
        		if(poly[i] != null){
        			polygons[processed] = poly[i];
        			processed++;
        		}
        	}
        	poly = polygons;
        }
        return copyTo(null, poly);
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
        return addBox(x, y, z, w, h, d, 0.0F);
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
    public ModelRendererTurbo addBox(float x, float y, float z, int w, int h, int d, float expansion){
    	return addBox(x, y, z, w, h, d, expansion, 1F);
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
     * @param bs 
     */
    public ModelRendererTurbo addBox(float x, float y, float z, float w, float h, float d, float expansion, float scale){
    	return addBox(x, y, z, w, h, d, expansion, scale, null);
    }
    
    public ModelRendererTurbo addBox(float x, float y, float z, float w, float h, float d, float expansion, float scale, boolean[] sides){
    	if(w <1){
    	    w=0.01F;
    	    x-=0.005F;
    	}
    	if(h <1){
    	    h=0.01F;
            y-=0.005F;
    	}
    	if(d <1){
    	    d=0.01F;
            z-=0.005F;
    	}
    	
        xScale = w * scale;
        yScale = h * scale;
        zScale = d * scale;
        
        float x1 = x + xScale;
        float y1 = y + yScale;
        float z1 = z + zScale;
        
        float expX = expansion + xScale - w;
        float expY = expansion + yScale - h;
        float expZ = expansion + zScale - d;
        
        x -= expX;
        y -= expY;
        z -= expZ;
        x1 += expansion;
        y1 += expansion;
        z1 += expansion;
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
        return addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d, sides);
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
    public ModelRendererTurbo addShape3D(float x, float y, float z, Coord2D[] coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction){
    	return addShape3D(x, y, z, coordinates, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
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
     * @return 
     */
    public ModelRendererTurbo addShape3D(float x, float y, float z, Coord2D[] coordinates, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction, float[] faceLengths){
    	return addShape3D(x, y, z, new Shape2D(coordinates), depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, faceLengths);
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
     * @return 
     */
    public ModelRendererTurbo addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, int direction, float[] faceLengths){
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
    	return addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, rotX, rotY, rotZ, faceLengths);
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
     * @return 
     * @Ferdinand
     */
    public ModelRendererTurbo addShape3D(float x, float y, float z, Shape2D shape, float depth, int shapeTextureWidth, int shapeTextureHeight, int sideTextureWidth, int sideTextureHeight, float rotX, float rotY, float rotZ, float[] faceLengths){
    	Shape3D shape3D = shape.extrude(-x, y, -z, rotX, rotY, rotZ, depth, textureOffsetX, textureOffsetY, textureWidth, textureHeight, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, faceLengths);
        for(int idx = 0; idx < shape3D.faces.length; idx++){
            shape3D.faces[idx].flipFace();
        }
        isShape = true;
    	return copyTo(shape3D.vertices, shape3D.faces);
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
    public void addPixel(float x, float y, float z, float width, float height, float length){
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
    public void addPixel(float x, float y, float z, float[] scale, int w, int h){
    	TexturedVertex[] verts = new TexturedVertex[8];
	    TexturedPolygon[] poly = new TexturedPolygon[6];
    	float x1 = x + scale[0];
    	float y1 = y + scale[1];
    	float z1 = z + scale[2];
        float[] f = {x, y, z};
        float[] f1 = {x1, y, z};
        float[] f2 = {x1, y1, z};
        float[] f3 = {x, y1, z};
        float[] f4 = {x, y, z1};
        float[] f5 = {x1, y, z1};
        float[] f6 = {x1, y1, z1};
        float[] f7 = {x, y1, z1};
        TexturedVertex positionTexturevertex = new TexturedVertex(f[0], f[1], f[2], 0.0F, 0.0F);
        TexturedVertex positionTexturevertex1 = new TexturedVertex(f1[0], f1[1], f1[2], 0.0F, 8F);
        TexturedVertex positionTexturevertex2 = new TexturedVertex(f2[0], f2[1], f2[2], 8F, 8F);
        TexturedVertex positionTexturevertex3 = new TexturedVertex(f3[0], f3[1], f3[2], 8F, 0.0F);
        TexturedVertex positionTexturevertex4 = new TexturedVertex(f4[0], f4[1], f4[2], 0.0F, 0.0F);
        TexturedVertex positionTexturevertex5 = new TexturedVertex(f5[0], f5[1], f5[2], 0.0F, 8F);
        TexturedVertex positionTexturevertex6 = new TexturedVertex(f6[0], f6[1], f6[2], 8F, 8F);
        TexturedVertex positionTexturevertex7 = new TexturedVertex(f7[0], f7[1], f7[2], 8F, 0.0F);
        verts[0] = positionTexturevertex;
        verts[1] = positionTexturevertex1;
        verts[2] = positionTexturevertex2;
        verts[3] = positionTexturevertex3;
        verts[4] = positionTexturevertex4;
        verts[5] = positionTexturevertex5;
        verts[6] = positionTexturevertex6;
        verts[7] = positionTexturevertex7;
        poly[0] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex5, positionTexturevertex1, positionTexturevertex2, positionTexturevertex6
        }, w, h, w + 1, h + 1);
        poly[1] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex, positionTexturevertex4, positionTexturevertex7, positionTexturevertex3
        }, w, h, w + 1, h + 1);
        poly[2] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex5, positionTexturevertex4, positionTexturevertex, positionTexturevertex1
        }, w, h, w + 1, h + 1);
        poly[3] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex2, positionTexturevertex3, positionTexturevertex7, positionTexturevertex6
        }, w, h, w + 1, h + 1);
        poly[4] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex1, positionTexturevertex, positionTexturevertex3, positionTexturevertex2
        }, w, h, w + 1, h + 1);
        poly[5] = addPolygonReturn(new TexturedVertex[] {
            positionTexturevertex4, positionTexturevertex5, positionTexturevertex6, positionTexturevertex7
        }, w, h, w + 1, h + 1);
        copyTo(verts, poly);
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
    public void addSprite(float x, float y, float z, int w, int h, float expansion){
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
    public void addSprite(float x, float y, float z, int w, int h, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion){
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
    public void addSprite(float x, float y, float z, int w, int h, int d, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion){
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
    public void addSprite(float x, float y, float z, int w, int h, int d, float pixelScale, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion){
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
    public void addSprite(float x, float y, float z, String[] mask, int d, float pixelScale, boolean rotX, boolean rotY, boolean rotZ, boolean mirrorX, boolean mirrorY, float expansion){
    	int w = mask[0].length();
    	int h = mask.length;
    	float x1 = x - expansion;
    	float y1 = y - expansion;
    	float z1 = z - expansion;
    	int wDir = 0;
    	int hDir = 0;
    	int dDir = 0;
    	float wScale = 1F + (expansion / ( w * pixelScale));
    	float hScale = 1F + (expansion / ( h * pixelScale));	    	
    	if(!rotX){
    		if(!rotY){
    			if(!rotZ){
    				wDir = 0;
    				hDir = 1;
    				dDir = 2;
    			}
    			else{
    				wDir = 1;
    				hDir = 0;
    				dDir = 2;
    			}
    		}
    		else{
    			if(!rotZ){
    				wDir = 2;
    				hDir = 1;
    				dDir = 0;
       			}
    			else{
    				wDir = 2;
    				hDir = 0;
    				dDir = 1;
    			}
    		}
    	}
    	else{
    		if(!rotY){
    			if(!rotZ){
    				wDir = 0;
    				hDir = 2;
    				dDir = 1;
    			}
    			else{
    				wDir = 1;
    				hDir = 2;
    				dDir = 0;
    			}
    		}
    		else{
    			if(!rotZ){
    				wDir = 2;
    				hDir = 0;
    				dDir = 1;
       			}
    			else{
    				wDir = 2;
    				hDir = 1;
    				dDir = 0;
    			}
    		}
    	}
    	int texStartX = textureOffsetX + (mirrorX ? w * 1 - 1 : 0);
    	int texStartY = textureOffsetY + (mirrorY ? h * 1 - 1 : 0);
    	int texDirX = (mirrorX ? -1 : 1);
    	int texDirY = (mirrorY ? -1 : 1);
    	float wVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, wDir, 1, 1);
    	float hVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, hDir, 1, 1);
    	float dVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2, 0, 1, dDir, 1, 1);	
    	for(int i = 0; i < w; i++){
    		for(int j = 0; j < h; j++){
    			if(mask[j].charAt(i) == '1'){
	    			addPixel(x1 + getPixelSize(wScale, hScale, 0, wDir, hDir, 0, i, j),
	    					 y1 + getPixelSize(wScale, hScale, 0, wDir, hDir, 1, i, j),
	    					 z1 + getPixelSize(wScale, hScale, 0, wDir, hDir, 2, i, j),
	    					 new float[] {wVoxSize, hVoxSize, dVoxSize}, texStartX + texDirX * i, texStartY + texDirY * j);
    			}
    		}
    	}
    }
    
    private float getPixelSize(float wScale, float hScale, float dScale, int wDir, int hDir, int checkDir, int texPosX, int texPosY){
    	return (wDir == checkDir ? wScale * texPosX : (hDir == checkDir ? hScale * texPosY : dScale));
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
    	TexturedPolygon[] poly = new TexturedPolygon[segs * rings];
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
    	int currentFace = 0;
    	for(int j = 1; j < rings; j++){
    		for(int i = 0; i < segs; i++){
    			float yWidth = MathHelper.cos(-pi / 2 + (pi / rings) *  j);
    			float yHeight = MathHelper.sin(-pi / 2 + (pi / rings) *  j);
    			float xSize = MathHelper.sin((pi / segs) * i * 2F + pi) * yWidth;
    			float zSize = -MathHelper.cos((pi / segs) * i * 2F + pi) * yWidth;
    			int curVert = 1 + i + segs * (j - 1);
    			tempVerts[curVert] = new TexturedVertex(x + xSize * r, y + yHeight * r, z + zSize * r, 0, 0);
    			if(i > 0){
    				TexturedVertex[] verts;
	    			if(j == 1){
	    				verts = new TexturedVertex[4];
	    				verts[0] = tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j);
	    				verts[1] = tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j);
	    				verts[2] = tempVerts[0].setTexturePosition(startU + segW * (i - 1), startV);
	    				verts[3] = tempVerts[0].setTexturePosition(startU + segW + segW * i, startV);
	    			}
	    			else{
	    				verts = new TexturedVertex[4];
	    				verts[0] = tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j);
	    				verts[1] = tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j);
	    				verts[2] = tempVerts[curVert - 1 - segs].setTexturePosition(startU + segW * (i - 1), startV + segH * (j - 1));	    				
	    				verts[3] = tempVerts[curVert - segs].setTexturePosition(startU + segW * i, startV + segH * (j - 1));
	    			}
	    			poly[currentFace] = new TexturedPolygon(verts);
	    			currentFace++;
    			}
    		}
			TexturedVertex[] verts;
   			if(j == 1){
    			verts = new TexturedVertex[4];
    			verts[0] = tempVerts[1].setTexturePosition(startU + segW * segs, startV + segH * j);
    			verts[1] = tempVerts[segs].setTexturePosition(startU + segW * (segs - 1), startV + segH * j);
    			verts[2] = tempVerts[0].setTexturePosition(startU + segW * (segs - 1), startV);
    			verts[3] = tempVerts[0].setTexturePosition(startU + segW * segs, startV);
    		}
    		else{
    			verts = new TexturedVertex[4];
    			verts[0] = tempVerts[1 + segs * (j - 1)].setTexturePosition(startU + texW, startV + segH * j);
    			verts[1] = tempVerts[segs * (j - 1) + segs].setTexturePosition(startU + texW - segW, startV + segH * j);
    			verts[2] = tempVerts[segs * (j - 1)].setTexturePosition(startU + texW - segW, startV + segH * (j - 1));	    				
    			verts[3] = tempVerts[1 + segs * (j - 1) - segs].setTexturePosition(startU + texW, startV + segH * (j - 1));
			}
   			poly[currentFace] = new TexturedPolygon(verts);
   			currentFace++;
    	}
		for(int i = 0; i < segs; i++){
			TexturedVertex[] verts = new TexturedVertex[3];
			int curVert = tempVerts.length - (segs + 1);
			verts[0] = tempVerts[tempVerts.length - 1].setTexturePosition(startU + segW * (i + 0.5F), startV + texH);
			verts[1] = tempVerts[curVert + i].setTexturePosition(startU + segW * i, startV + texH - segH);
			verts[2] = tempVerts[curVert + ((i + 1) % segs)].setTexturePosition(startU + segW * (i + 1), startV + texH - segH);
			poly[currentFace] = new TexturedPolygon(verts);
			currentFace++;
		}
		return copyTo(tempVerts, poly);
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
    	return addCylinder(x, y, z, radius, length, segments, baseScale, 0.0F, baseDirection, textureCircleDiameterW, textureCircleDiameterH, 1);
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
    
    /**
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
    public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale, int baseDirection, int textureCircleDiameterW, int textureCircleDiameterH, int textureH){
    	return addCylinder(x, y, z, radius, length, segments, baseScale, topScale, baseDirection, textureCircleDiameterW, textureCircleDiameterH, textureH, null);
    }
    
	public ModelRendererTurbo addCylinder(float x, float y, float z, float radius, float length, int segments, float baseScale, float topScale, int baseDirection, int textureCircleDiameterW, int textureCircleDiameterH, int textureH, Vec3f topoff){
		if(radius < 1){
			int rad = radius < 0.5 ? 1 : 2;
			if(textureCircleDiameterW < rad) textureCircleDiameterW = rad;
			if(textureCircleDiameterH < rad) textureCircleDiameterH = rad;
		}
		if(length < 1) textureH = 1;
		else if(length % 1 != 0){
			textureH = (int)length + (length % 1 > 0.5f ? 1 : 0);
		}
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
				float xSize = (float)((mirror ^ dirMirror ? -1 : 1) * Math.sin((pi / segments) * index * 2F + pi) * radius * sCur);
				float zSize = (float)(-Math.cos((pi / segments) * index * 2F + pi) * radius * sCur);
				float xPlace = xCur + (!dirSide ? xSize : 0);
				float yPlace = yCur + (!dirTop ? zSize : 0);
				float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
				tempVerts[1 + index + repeat * segments] = new TexturedVertex(xPlace, yPlace, zPlace, 0, 0 );
			}
			xCur = xEnd; yCur = yEnd; zCur = zEnd; sCur = topScale;
		}
		float uScale = 1.0F / textureWidth;
		float vScale = 1.0F / textureHeight;
		float uOffset = 0;//uScale / 20.0F;
		float vOffset = 0;//vScale / 20.0F;
		float uCircle = textureCircleDiameterW * uScale;
		float vCircle = textureCircleDiameterH * vScale;
		float uWidth = (uCircle * 2F - uOffset * 2F) / segments;
		float vHeight = textureH * vScale - uOffset * 2f;
		float uStart = textureOffsetX * uScale;
		float vStart = textureOffsetY * vScale;	
		TexturedVertex[] vert;
		for(int index = 0; index < segments; index++){
			int index2 = (index + 1) % segments;
			float uSize = (float)(Math.sin((pi / segments) * index * 2F + (!dirTop ? 0 : pi)) * (0.5F * uCircle - 2F * uOffset));
			float vSize = (float)(Math.cos((pi / segments) * index * 2F + (!dirTop ? 0 : pi)) * (0.5F * vCircle - 2F * vOffset));
			float uSize1 = (float)(Math.sin((pi / segments) * index2 * 2F + (!dirTop ? 0 : pi)) * (0.5F * uCircle - 2F * uOffset));
			float vSize1 = (float)(Math.cos((pi / segments) * index2 * 2F + (!dirTop ? 0 : pi)) * (0.5F * vCircle - 2F * vOffset));
			vert = new TexturedVertex[3];	
			vert[0] = tempVerts[0].setTexturePosition(uStart + 0.5F * uCircle, vStart + 0.5F * vCircle);
			vert[1] = tempVerts[1 + index2].setTexturePosition(uStart + 0.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
			vert[2] = tempVerts[1 + index].setTexturePosition(uStart + 0.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);
			poly[index] = new TexturedPolygon(vert);
			if(!dirFront || mirror || flip){
				poly[index].flipFace();
			}
			if(!coneBase && !coneTop){
				vert = new TexturedVertex[4];
				vert[0] = tempVerts[1 + index].setTexturePosition(uStart + uOffset + uWidth * index, vStart + vOffset + vCircle);
				vert[1] = tempVerts[1 + index2].setTexturePosition(uStart + uOffset + uWidth * (index + 1), vStart + vOffset + vCircle);
				vert[2] = tempVerts[1 + segments + index2].setTexturePosition(uStart + uOffset + uWidth * (index + 1), vStart + vOffset + vCircle + vHeight);
				vert[3] = tempVerts[1 + segments + index].setTexturePosition(uStart + uOffset + uWidth * index, vStart + vOffset + vCircle + vHeight);
				poly[index + segments] = new TexturedPolygon(vert);
				if(!dirFront || mirror || flip){
					poly[index + segments].flipFace();
				}
			}
			vert = new TexturedVertex[3];
			vert[0] = tempVerts[tempVerts.length - 1].setTexturePosition(uStart + 1.5F * uCircle, vStart + 0.5F * vCircle);
			vert[1] = tempVerts[tempVerts.length - 2 - index].setTexturePosition(uStart + 1.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
			vert[2] = tempVerts[tempVerts.length - (1 + segments) + ((segments - index) % segments)].setTexturePosition(uStart + 1.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);
			poly[poly.length - segments + index]  = new TexturedPolygon(vert);
			if(!dirFront || mirror || flip){
				poly[poly.length - segments + index].flipFace();
			}
		}
		return copyTo(null, poly);
	}
    
    /**
     * Adds a Waveform .obj file as a model. Model files use the entire texture file.
     * @param file the location of the .obj file. The location is relative to the base directories,
     * which are either resources/models or resources/mods/models.
     */
    public ModelRendererTurbo addObj(String file){
        useLegacyCompiler = false;
    	addModel(file, ModelPool.OBJ);
    	return this;
    }
    
    public void addObjF(String file){
    	try{
            useLegacyCompiler = false;
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
    	ModelPoolEntry entry = ModelPool.addFile(file, modelFormat, textureGroup);
    	if(entry == null){
    		return;
    	}
    	TexturedVertex[] verts = Arrays.copyOf(entry.vertices, entry.vertices.length);
    	TexturedPolygon[] poly = Arrays.copyOf(entry.faces, entry.faces.length);
    	if(flip){
            for(int l = 0; l < faces.length; l++){
                faces[l].flipFace();
            }
    	}
    	copyTo(verts, poly, false);
    }
    
    public void addModelF(String file, Class<?> modelFormat) throws IOException{
    	ModelPoolEntry entry = ModelPool.addFileF(file, modelFormat, textureGroup);
    	if(entry == null){
    		return;
    	}
    	TexturedVertex[] verts = Arrays.copyOf(entry.vertices, entry.vertices.length);
    	TexturedPolygon[] poly = Arrays.copyOf(entry.faces, entry.faces.length);
    	if(flip){
            for(int l = 0; l < faces.length; l++){
                faces[l].flipFace();
            }
    	}
    	copyTo(verts, poly, false);
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
     * @return 
     */
    public ModelRendererTurbo setPosition(float x, float y, float z){
        rotationPointX = x;
        rotationPointY = y;
        rotationPointZ = z;
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
    		TexturedVertex[] verts = face.vertices;
    		for(TexturedVertex vert : verts){
    			vert.vector3F.addVector(
    					vert.vector3F.xCoord * (x ? -1 : 1),
    					vert.vector3F.xCoord * (y ? -1 : 1),
    					vert.vector3F.xCoord * (z ? -1 : 1));
    		}
    		if(x^y^z){
    			face.flipFace();
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
     * Sets whether the shape's faces are flipped or not. When GL_CULL_FACE is enabled,
     * it won't render the back faces, effectively giving you the possibility to make
     * "hollow" shapes. When working with addSprite and addPixel, it will be ignored.
     * @param isFlipped a boolean to define whether the shape is flipped
     */
    public void setFlipped(boolean isFlipped){
    	flip = isFlipped;
    }
    
    /**
     * Clears the current shape. Since all shapes are stacked into one shape, you can't
     * just replace a shape by overwriting the shape with another one. In this case you
     * would need to clear the shape first.
     */
    public void clear(){
    	faces = new TexturedPolygon[0];
    }
    
    /**
     * Copies an array of vertices and polygons to the current shape. This mainly is
     * used to copy each shape to the main class, but you can just use it to copy
     * your own shapes, for example from other classes, into the current class.
     * @param verts the array of vertices you want to copy
     * @param poly the array of polygons you want to copy
     * @return 
     */
    public ModelRendererTurbo copyTo(TexturedVertex[] verts, TexturedPolygon[] poly){
    	return copyTo(verts, poly, true);
    }
    
    public ModelRendererTurbo copyTo(TexturedVertex[] verts, TexturedPolygon[] poly, boolean copyGroup){
        faces = Arrays.copyOf(faces, faces.length + poly.length);
        for(int idx = 0; idx < poly.length; idx++){
        	faces[faces.length - poly.length + idx] = poly[idx];
        	if(copyGroup){
        		currentTextureGroup.addPoly(poly[idx]);
        	}
        }
        return this;
    }
    
    /**
     * Sets the current texture group, which is used to switch the
     * textures on a per-model base. Do note that any model that is
     * rendered afterwards will use the same texture. To counter it,
     * set a default texture, either at initialization or before
     * rendering.
     * @param groupName The name of the texture group. If the texture
     * group doesn't exist, it creates a new group automatically.
     */
    public void setTextureGroup(String groupName){
    	if(!textureGroup.containsKey(groupName)){
    		textureGroup.put(groupName, new TextureGroup());
    	}
    	currentTextureGroup = textureGroup.get(groupName);
    }
    
    /**
     * Gets the current texture group.
     * @return a TextureGroup object.
     */
    public TextureGroup getTextureGroup(){
    	return currentTextureGroup;
    }
    
    /**
     * Gets the texture group with the given name.
     * @param groupName the name of the texture group to return
     * @return a TextureGroup object.
     */
    public TextureGroup getTextureGroup(String groupName){
    	if(!textureGroup.containsKey(groupName))
    		return null;
    	return textureGroup.get(groupName);
    }
    
    /**
     * Sets the texture of the current texture group.
     * @param s the filename
     */
    public void setGroupTexture(String s){
    	currentTextureGroup.texture = s;
    }
    
    /**
     * Sets the default texture. When left as an empty string,
     * it will use the texture that has been set previously.
     * Note that this will also move on to other rendered models
     * of the same entity.
     * @param s the filename
     */
    public void setDefaultTexture(String s){
    	defaultTexture = s;
    }
    
    public void render(){
    	render(0.0625F, rotorder);
    }

    //Eternal: why was this removed....?
    public void render(float scale){
        render(scale, rotorder);
    }
    
    /**
     * Renders the shape.
     * @param scale the scale of the shape. Usually is 0.0625.
     */
    public void render(float scale, boolean bool){
        if(field_1402_i){
            return;
        }
        if(!showModel){
            return;
        }
        if(!compiled || forcedRecompile){
            compileDisplayList(scale);
        }
        if(rotateAngleX != 0.0F || rotateAngleY != 0.0F || rotateAngleZ != 0.0F){
            GL11.glPushMatrix();
            GL11.glTranslatef(rotationPointX * scale, rotationPointY * scale, rotationPointZ * scale);
            if(bool){
                if(rotateAngleZ != 0.0F){
                    GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
                }
                if(rotateAngleY != 0.0F){
                    GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
                }
            }
            else{
                if(rotateAngleY != 0.0F){
                    GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
                }
                if(rotateAngleZ != 0.0F){
                    GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
                }
            }
            if(rotateAngleX != 0.0F){
                GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
            callDisplayList();
            if(childModels != null){
                for(Object child : childModels){
                    ((ModelRenderer)child).render(scale);
                }
            }
            GL11.glPopMatrix();
        } else
        if(rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F){
            GL11.glTranslatef(rotationPointX * scale, rotationPointY * scale, rotationPointZ * scale);
            callDisplayList();
            if(childModels != null){
                for(Object child : childModels){
                    ((ModelRenderer)child).render(scale);
                }
            }
            GL11.glTranslatef(-rotationPointX * scale, -rotationPointY * scale, -rotationPointZ * scale);
        }
        else{
        	callDisplayList();
        	if(childModels != null){
                for(Object child : childModels){
                    ((ModelRenderer)child).render(scale);
                }
            }
        }
    }
    
    public void renderWithRotation(float f){
        if(field_1402_i){
            return;
        }
        if(!showModel){
            return;
        }
        if(!compiled){
            compileDisplayList(f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(rotationPointX * f, rotationPointY * f, rotationPointZ * f);
        if(rotateAngleY != 0.0F){
            GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
        }
        if(rotateAngleX != 0.0F){
            GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
        }
        if(rotateAngleZ != 0.0F){
            GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
        }
        callDisplayList();
        GL11.glPopMatrix();
    }

    public void postRender(float f){
        if(field_1402_i){
            return;
        }
        if(!showModel){
            return;
        }
        if(!compiled || forcedRecompile){
            compileDisplayList(f);
        }
        if(rotateAngleX != 0.0F || rotateAngleY != 0.0F || rotateAngleZ != 0.0F){
            GL11.glTranslatef(rotationPointX * f, rotationPointY * f, rotationPointZ * f);
            if(rotateAngleZ != 0.0F){
                GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(rotateAngleY != 0.0F){
                GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(rotateAngleX != 0.0F){
                GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
        }
        else if(rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F){
            GL11.glTranslatef(rotationPointX * f, rotationPointY * f, rotationPointZ * f);
        }
    }
    
    public void callDisplayList(){
    	if(useLegacyCompiler){
    		GL11.glCallList(displayList);
    	}
    	else{
    		Iterator<TextureGroup> itr = textureGroup.values().iterator();
    		for(int i = 0; itr.hasNext(); i++){
    			TextureGroup curTexGroup = itr.next();
    			curTexGroup.loadTexture();
    			GL11.glCallList(displayListArray[i]);
    			if(!defaultTexture.equals("")){
    				Tessellator.bindTexture(new ResourceLocation("", defaultTexture));
    			}
    		}
    	}
    }

    public void compileDisplayList(float scale){
    	if(useLegacyCompiler){
    		compileLegacyDisplayList(scale);
    	}
    	else{
    		Iterator<TextureGroup> itr = textureGroup.values().iterator();
    		displayListArray = new int[textureGroup.size()];
    		for(int i = 0; itr.hasNext(); i++){
    			displayListArray[i] = GLAllocation.generateDisplayLists(1);
    			GL11.glNewList(displayListArray[i], GL11.GL_COMPILE);
    			Tessellator tessellator = Tessellator.getInstance();
    			TextureGroup usedGroup = itr.next();
    			for(int j = 0; j < usedGroup.poly.size(); j++){
    				usedGroup.poly.get(j).draw(tessellator, scale);
    			}
    			GL11.glEndList();
    		}
    	}
        compiled = true;
    }
    
    private void compileLegacyDisplayList(float scale){
        displayList = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayList, GL11.GL_COMPILE);
        Tessellator tessellator = Tessellator.getInstance();
        for(TexturedPolygon poly : faces){
            poly.draw(tessellator, scale);
        }
        GL11.glEndList();
    }

    //ETERNAL: changed w/h/d to floats for better support of the custom render on the rails.
	public ModelRendererTurbo addShapeBox(float x, float y, float z, float w, float h, float d, float scale, float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7, float z7){
        w+=w<1?0.0015f:0.001F;
        h+=h<1?0.0015f:0.001F;
        d+=d<1?0.0015f:0.001F;
        x-=w<1?0.001f:0.0005F;
        y-=h<1?0.001f:0.0005F;
        z-=d<1?0.001f:0.0005F;
		float f4 = x + w, f5 = y + h, f6 = z + d;
		x -= scale; y -= scale; z -= scale;
		f4 += scale; f5 += scale; f6 += scale;
		if(mirror){
			float f7 = f4; f4 = x; x = f7;
		}

		float[][] v  = {{x  - x0, y  - y0, z  - z0}, {f4 + x1, y  - y1, z  - z1},{f4 + x5, f5 + y5, z  - z5}, {x  - x4, f5 + y4, z  - z4}, {x  - x3, y  - y3, f6 + z3}, {f4 + x2, y  - y2, f6 + z2},{f4 + x6, f5 + y6, f6 + z6}, {x  - x7, f5 + y7, f6 + z7}};
		return addRectShape(v[0], v[1], v[2], v[3], v[4], v[5], v[6], v[7], w, h, d);
	}
	
	public final ModelRendererTurbo setOldRotationOrder(boolean bool){
		this.rotorder = bool;
		return this;
	}
	
	public String toString(String alt){
		String str = this.toString();
		return str == null || str.equals("") ? alt : str;
	}

	public static void filterGeometry(float size, float... params ){
	    int param=0;
	    boolean wasChanged = false;
	    for(int i=0; i<params.length; i++){
	        if (params[i]==-size){
	            System.out.println(params[i]);
                params[i]+=0.001f;
	            System.out.println("resized");
	            wasChanged=true;
	            break;
            } else {
                param++;
            }
        }
        if (wasChanged) {
            System.out.println(params[param]);
        }

    }
	
	@Override
	public String toString(){
		return boxName;
	}

	public ModelRendererTurbo setRotationPoint(float x, float y, float z){
		return setPosition(x, y, z);
	}

	/** we'll be assuming only the fmt exported models use this */
	public ModelRendererTurbo setRotationAngle(float x, float y, float z){
		rotateAngleX = x / 180f * pi;
		rotateAngleY = -y / 180f * pi;
		rotateAngleZ = -z / 180f * pi;
		return this;
	}

	public ModelRendererTurbo setName(String string){
		this.boxName = string;
		return this;
	}
	
}
