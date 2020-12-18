package fexcraft.tmt.slim;

import java.util.ArrayList;
import java.util.List;

/**
 * Reverse engineered for TMT slim by EternalBlueFlame
 * @author Ferdinand Calo' (FEX___96)
 */
public class BoxBuilder {

    private static final Vec3f NULLVEC = new Vec3f(0, 0, 0);
    private final ModelRendererTurbo host;
    private float x, y, z, expansion, w, h, d;
    private boolean[] invisible = new boolean[]{false,false,false,false,false,false};
    private float[][] uv = new float[6][];
    private boolean[] detached = new boolean[6];
    private Vec3f[] corners = new Vec3f[]{NULLVEC,NULLVEC,NULLVEC,NULLVEC,NULLVEC,NULLVEC,NULLVEC,NULLVEC};

    public BoxBuilder(){
        this(null);
    }

    public BoxBuilder(ModelRendererTurbo root){
        this.host = root == null ? new ModelRendererTurbo("") : root;
    }

    public BoxBuilder setOffset(float x, float y, float z){
        this.x = x; this.y = y; this.z = z;
        return this;
    }

    public BoxBuilder setSize(float w, float h, float d){
        this.w = w; this.h = h; this.d = d;
        return this;
    }

    public BoxBuilder setExpansion(float exp){
        this.expansion = exp;
        return this;
    }

    public BoxBuilder removePolygon(int index){
        invisible[index] = true;
        return this;
    }

    public BoxBuilder removePolygons(int... poly_indices){
        for(int index : poly_indices){
            invisible[index] = true;
        }
        return this;
    }

    public BoxBuilder removePolygons(boolean... sides){
        for(int index = 0; index < 6; index++){
            if(sides.length >= (index + 1) && sides[index]) invisible[index] = true;
        }
        return this;
    }

    public BoxBuilder setPolygonUV(int poly_index, float[] uv){
        this.uv[poly_index] = uv;
        return this;
    }

    public BoxBuilder setPolygonUVs(int[] poly_indices, float[][] uvs){
        for(int i = 0; i < poly_indices.length; i++){
            setPolygonUV(poly_indices[i], uvs[i]);
        }
        return this;
    }

    public BoxBuilder setPolygonUVs(float[][] uvs){
        for(int index = 0; index < 6; index++){
            if(index >= uvs.length) break;
            setPolygonUV(index, uvs[index]);
        }
        return this;
    }

    public BoxBuilder setDetachedUV(int... indices){
        for(int index : indices){
            detached[index] = true;
        }
        return this;
    }

    public BoxBuilder setDetachedUV(boolean... bools){
        for(int index = 0; index < 6; index++){
            if(index >= bools.length) break;
            setDetachedUV(index);
        }
        return this;
    }

    private float detached(int i, float value){
        return invisible[i] || detached[i]?0:value;
    }

    public BoxBuilder setCorner(int index, Vec3f corner){
        corners[index] = corner==null?NULLVEC:corner;
        return this;
    }

    public BoxBuilder setCorner(int index, float x, float y, float z){
        corners[index] = new Vec3f(x, y, z);
        return this;
    }


    public BoxBuilder setCorners(Vec3f cor0, Vec3f cor1, Vec3f cor2, Vec3f cor3, Vec3f cor4, Vec3f cor5, Vec3f cor6, Vec3f cor7){
        corners[0] = cor0==null?NULLVEC:cor0;
        corners[1] = cor1==null?NULLVEC:cor1;
        corners[2] = cor2==null?NULLVEC:cor2;
        corners[3] = cor3==null?NULLVEC:cor3;
        corners[4] = cor4==null?NULLVEC:cor4;
        corners[5] = cor5==null?NULLVEC:cor5;
        corners[6] = cor6==null?NULLVEC:cor6;
        corners[7] = cor7==null?NULLVEC:cor7;
        return this;
    }

    public BoxBuilder setCorners(float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7, float z7){
        corners[0] = new Vec3f(x0, y0, z0);
        corners[1] = new Vec3f(x1, y1, z1);
        corners[2] = new Vec3f(x2, y2, z2);
        corners[3] = new Vec3f(x3, y3, z3);
        corners[4] = new Vec3f(x4, y4, z4);
        corners[5] = new Vec3f(x5, y5, z5);
        corners[6] = new Vec3f(x6, y6, z6);
        corners[7] = new Vec3f(x7, y7, z7);
        return this;
    }

    public ModelRendererTurbo build(){
        if(w == 0) w = 0.01F; if(h == 0) h = 0.01F; if(d == 0) d = 0.01F;
        float xw = x + w, yh = y + h, zd = z + d;
        xw += expansion;  yh += expansion; zd += expansion;
        if(host.mirror){ float fl = xw; xw = x; x = fl; }
        List<TexturedPolygon> poly = new ArrayList<>();
        TexturedVertex tv0 = new TexturedVertex(x  - corners[0].xCoord, y  - corners[0].yCoord, z  - corners[0].zCoord, 0.0F, 0.0F);
        TexturedVertex tv1 = new TexturedVertex(xw + corners[1].xCoord, y  - corners[1].yCoord, z  - corners[1].zCoord, 0.0F, 8.0F);
        TexturedVertex tv2 = new TexturedVertex(xw + corners[5].xCoord, yh + corners[5].yCoord, z  - corners[5].zCoord, 8.0F, 8.0F);
        TexturedVertex tv3 = new TexturedVertex(x  - corners[4].xCoord, yh + corners[4].yCoord, z  - corners[4].zCoord, 8.0F, 0.0F);
        TexturedVertex tv4 = new TexturedVertex(x  - corners[3].xCoord, y  - corners[3].yCoord, zd + corners[3].zCoord, 0.0F, 0.0F);
        TexturedVertex tv5 = new TexturedVertex(xw + corners[2].xCoord, y  - corners[2].yCoord, zd + corners[2].zCoord, 0.0F, 8.0F);
        TexturedVertex tv6 = new TexturedVertex(xw + corners[6].xCoord, yh + corners[6].yCoord, zd + corners[6].zCoord, 8.0F, 8.0F);
        TexturedVertex tv7 = new TexturedVertex(x  - corners[7].xCoord, yh + corners[7].yCoord, zd + corners[7].zCoord, 8.0F, 0.0F);
        if(w % 1 != 0){
            w = w < 1 ? 1 : (int)w + 1;
        }
        if(h % 1 != 0){
            h = h < 1 ? 1 : (int)h + 1;
        }
        if(d % 1 != 0){
            d = d < 1 ? 1 : (int)d + 1;
        }

        float yp = (invisible[2] || detached[2]) && invisible[3] || detached[3] ? 0 : d;
        if(!invisible[0]){
            poly.add(genPolygonWithUV(0, new TexturedVertex[] { tv5, tv1, tv2, tv6 }, host.textureOffsetX, host.textureOffsetY, detached(1,d) + detached(4,w), yp, d, h));
        }
        if(!invisible[1]){
            poly.add(genPolygonWithUV(1, new TexturedVertex[] { tv0, tv4, tv7, tv3 }, host.textureOffsetX, host.textureOffsetY, 0, yp, d, h));
        }
        if(!invisible[2]){
            poly.add(genPolygonWithUV(2, new TexturedVertex[] { tv5, tv4, tv0, tv1 }, host.textureOffsetX, host.textureOffsetY, detached(1,d), 0, w, d));
        }
        if(!invisible[3]){
            poly.add(genPolygonWithUV(3, new TexturedVertex[] { tv2, tv3, tv7, tv6 }, host.textureOffsetX, host.textureOffsetY, detached(1,d) + detached(2,w), 0, w, d));
        }
        if(!invisible[4]){
            poly.add(genPolygonWithUV(4, new TexturedVertex[] { tv1, tv0, tv3, tv2 }, host.textureOffsetX, host.textureOffsetY, detached(1,d), yp, w, h));
        }
        if(!invisible[5]){
            poly.add(genPolygonWithUV(5, new TexturedVertex[] { tv4, tv5, tv6, tv7 }, host.textureOffsetX, host.textureOffsetY, detached(1,d) + detached(4,w) + detached(0,d), yp, w, h));
        }
        if(host.mirror){
            for (TexturedPolygon aPoly : poly) {
                if (aPoly != null){
                    aPoly.flipFace();
                }
            }
        }
        host.faces.addAll(poly);
        return host;
    }

    private TexturedPolygon genPolygonWithUV(int index, TexturedVertex[] vertices, float texX, float texY, float x, float y, float x2, float y2){
        if(detached[index]){
            texX = 0;
            texY = 0;
        }
        float texX1,texX2,texY1,texY2;
        if(uv[index] == null){
            texX1 = (texX + x) / host.textureWidth;
            texX2 = (texX + x + x2) / host.textureWidth;
            texY1 = (texY + y) / host.textureHeight;
            texY2 = (texY + y + y2) / host.textureHeight;
        }
        else if(uv[index].length == 2){
            texX1 = (texX + uv[index][0]) / host.textureWidth;
            texX2 = (texX + uv[index][0] + x2) / host.textureWidth;
            texY1 = (texY + uv[index][1]) / host.textureHeight;
            texY2 = (texY + uv[index][1] + y2) / host.textureHeight;
        }
        else if(uv[index].length == 4){
            texX1 = (texX + uv[index][0]) / host.textureWidth;
            texX2 = (texX + uv[index][2]) / host.textureWidth;
            texY1 = (texY + uv[index][1]) / host.textureHeight;
            texY2 = (texY + uv[index][3]) / host.textureHeight;
        }
        else if(uv[index].length == 8){//8 is weird, this needs to be overly exact.
            vertices[0].setUV((texX + uv[index][0]) / host.textureWidth, (texY + uv[index][1]) / host.textureHeight);
            vertices[1].setUV((texX + uv[index][2]) / host.textureWidth, (texY + uv[index][3]) / host.textureHeight);
            vertices[2].setUV((texX + uv[index][4]) / host.textureWidth, (texY + uv[index][5]) / host.textureHeight);
            vertices[3].setUV((texX + uv[index][6]) / host.textureWidth, (texY + uv[index][7]) / host.textureHeight);
            return new TexturedPolygon(vertices);
        }
        else {
            texX1 = (texX + x) / host.textureWidth;
            texX2 = (texX + x + x2) / host.textureWidth;
            texY1 = (texY + y) / host.textureHeight;
            texY2 = (texY + y + y2) / host.textureHeight;
        }
        vertices[0].setUV(texX2,texY1);
        vertices[1].setUV(texX1, texY1);
        vertices[2].setUV(texX1, texY2);
        vertices[3].setUV(texX2, texY2);
        return new TexturedPolygon(vertices);
    }
}
