package tmt;

import java.util.ArrayList;

import static tmt.ModelRendererTurbo.*;


/**
 * Cylinder Builder Tool, to prevent the need of XYZ amount of chained methods.
 * @author Ferdinand Calo' (FEX___96)
 */
public class CylinderBuilder {

    private ModelRendererTurbo root;
    private float x, y, z, radius, radius2, length, base_scale, top_scale;
    private int segments, seglimit, direction, texDiameterW, texDiameterH, texHeight;
    private Vec3f topoff = new Vec3f();
    private boolean[] togglesides = new boolean[]{false,false,false,false};
    private Vec3f toprot;
    //
    private boolean radialtexture = false;
    private float seg_width, seg_height;

    public CylinderBuilder(ModelRendererTurbo root){
        this.root = root == null ? new ModelRendererTurbo("") : root;
    }

    public CylinderBuilder setPosition(float x, float y, float z){
        this.x = x; this.y = y; this.z = z; return this;
    }

    public CylinderBuilder setRadius(float first, float second){
        this.radius = first; this.radius2 = second;
        texDiameterW = (int)Math.floor(radius * 2F); texDiameterH = (int)Math.floor(radius * 2F); return this;
    }

    /** Use AFTER `setRadius`, else values will get overriden. */
    public CylinderBuilder setTextureDiameter(int width, int height){
        texDiameterW = width; texDiameterH = height; return this;
    }

    public CylinderBuilder setLength(float length){
        this.length = length; texHeight = (int)Math.floor(length); return this;
    }

    /** Use AFTER `setLength`, else value will get overriden. */
    public CylinderBuilder setTextureHeight(int height){
        texHeight = height; return this;
    }

    public CylinderBuilder setTopOffset(float x, float y, float z){
        topoff = new Vec3f(x, y, z); return this;
    }

    public CylinderBuilder setTopOffset(Vec3f vec){
        topoff = vec; return this;
    }

    public CylinderBuilder setSidesVisible(boolean[] arr){
        this.togglesides = arr; return this;
    }

    public CylinderBuilder setSidesVisible(boolean base, boolean top, boolean outer, boolean inner){
        this.togglesides = new boolean[]{ base, top, outer, inner }; return this;
    }

    /** Currently no support for hollow-less cylinders to be segmented. */
    public CylinderBuilder setSegments(int amount, int limit){
        this.segments = amount; this.seglimit = limit; return this;
    }

    public CylinderBuilder setScale(float base, float top){
        this.base_scale = base; this.top_scale = top; return this;
    }

    /** Currently no support for hollow-less cylinders to be radial-textured. */
    public CylinderBuilder setRadialTexture(float seg_width, float seg_height){
        if(seg_width==0 && seg_height==0){
            return this;
        }
        radialtexture = true; this.seg_width = seg_width; this.seg_height = seg_height; return this;
    }

    public CylinderBuilder setDirection(int dir){
        this.direction = dir; return this;
    }

    public CylinderBuilder setTopRotation(float x, float y, float z){
        toprot = new Vec3f(x,y,z);
        return this;
    }

    public CylinderBuilder setTopRotation(Vec3f vec){
        return setTopRotation(vec.xCoord, vec.yCoord, vec.zCoord);
    }

    public CylinderBuilder removePolygon(int index){
        if(index >= 0 && index < 4){
            togglesides[index] = true;
        }
        return this;
    }

    public CylinderBuilder removePolygons(int... poly_indices){
        for(int index : poly_indices){
            if(index >= 0 && index < 4){
                togglesides[index] = true;
            }
        }
        return this;
    }

    public CylinderBuilder removePolygons(boolean... sides){
        for(int index = 0; index < 4; index++){
            if(sides.length >= (index + 1) && sides[index]){
                togglesides[index] = true;
            }
        }
        return this;
    }

    public ModelRendererTurbo build(){
        if(radius2 == 0f && toprot == null){
            return root.addCylinder(x, y, z, radius, length, segments, base_scale, top_scale, direction, texDiameterW, texDiameterH, texHeight, topoff);
        }
        if(radius < 1){ texDiameterW = 2; texDiameterH = 2; } if(length < 1){ texHeight = 2; }
        //
        boolean dirTop = (direction == MR_TOP || direction == MR_BOTTOM);
        boolean dirSide = (direction == MR_RIGHT || direction == MR_LEFT);
        boolean dirFront = (direction == MR_FRONT || direction == MR_BACK);
        boolean dirMirror = (direction == MR_LEFT || direction == MR_BOTTOM || direction == MR_BACK);
        if(base_scale == 0) base_scale = 1f; if(top_scale == 0) top_scale = 1f;
        if(segments < 3) segments = 3; if(seglimit <= 0) seglimit = segments; boolean segl = seglimit < segments;
        ArrayList<TexturedPolygon> polis = new ArrayList<>();
        //Vertex
        float xLength = (dirSide ? length : 0), yLength = (dirTop ? length : 0), zLength = (dirFront ? length : 0);
        float xStart = (dirMirror ? x + xLength : x);
        float yStart = (dirMirror ? y + yLength : y);
        float zStart = (dirMirror ? z + zLength : z);
        float xEnd = (!dirMirror ? x + xLength : x) + (topoff == null ? 0 : topoff.xCoord);
        float yEnd = (!dirMirror ? y + yLength : y) + (topoff == null ? 0 : topoff.yCoord);
        float zEnd = (!dirMirror ? z + zLength : z) + (topoff == null ? 0 : topoff.zCoord);
        float xCur = xStart, yCur = yStart, zCur = zStart, sCur = base_scale;
        //Texture
        float uScale = 1.0F / root.textureWidth, vScale = 1.0F / root.textureHeight;
        float uOffset = uScale / 20.0F, vOffset = vScale / 20.0F;
        float uCircle = texDiameterW * uScale;
        float vCircle = texDiameterH * vScale;
        float uCircle2 = ((int)Math.floor(radius2 * 2F)) * uScale;
        float vCircle2 = ((int)Math.floor(radius2 * 2F)) * vScale;
        float uWidth = (uCircle * 2F - uOffset * 2F) / segments;
        float vHeight = texHeight * vScale - uOffset * 2f;
        float uStart = root.textureOffsetX * uScale, vStart = root.textureOffsetY * vScale;
        //Temporary Arrays
        ArrayList<TexturedVertex> verts0 = new ArrayList<>();
        ArrayList<TexturedVertex> verts1 = new ArrayList<>();
        ArrayList<TexturedVertex> verts2 = new ArrayList<>();
        ArrayList<TexturedVertex> verts3 = new ArrayList<>();
        float xSize,ySize,zSize,xPlace,yPlace,zPlace;
        for(int repeat = 0; repeat < 2; repeat++){//top/base faces
            for(int index = 0; index < segments; index++){
                xSize = (float)((root.mirror ^ dirMirror ? -1 : 1) * Math.sin((ModelRendererTurbo.pi / segments) * index * 2F + ModelRendererTurbo.pi) * radius * sCur);
                zSize = (float)(-Math.cos((ModelRendererTurbo.pi / segments) * index * 2F + ModelRendererTurbo.pi) * radius * sCur);
                xPlace = xCur + (!dirSide ? xSize : 0);
                yPlace = yCur + (!dirTop ? zSize : 0);
                zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
                verts0.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    verts0.add(new TexturedVertex(verts0.get(0)));
                }
                //
                xSize = (float)((root.mirror ^ dirMirror ? -1 : 1) * Math.sin((ModelRendererTurbo.pi / segments) * index * 2F + ModelRendererTurbo.pi) * radius2 * sCur);
                zSize = (float)(-Math.cos((ModelRendererTurbo.pi / segments) * index * 2F + ModelRendererTurbo.pi) * radius2 * sCur);
                xPlace = xCur + (!dirSide ? xSize : 0);
                yPlace = yCur + (!dirTop ? zSize : 0);
                zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));
                verts1.add(new TexturedVertex(xPlace, yPlace, zPlace, 0, 0));
                if(index == segments - 1){
                    verts1.add(new TexturedVertex(verts1.get(0)));
                }
            }
            if(repeat == 0){
                verts2.addAll(verts0);
                verts2.addAll(verts1);
            } else{
                verts3.addAll(verts0);
                verts3.addAll(verts1);
            }
            float mul = radialtexture ? repeat == 0 ? 0 : seg_height : repeat == 0 ? 0.5f : 1.5f;
            if((repeat == 0 && !togglesides[0]) || (repeat == 1 && !togglesides[1])){
                for(int i = 0; i < verts0.size(); i++){
                    if(i >= (verts0.size() - 1) || i >= seglimit){
                        if(repeat != 0 && toprot != null){
                            verts0.get(i).vector3F = toprot.getRelativeVector(verts0.get(i).vector3F);
                            verts1.get(i).vector3F = toprot.getRelativeVector(verts1.get(i).vector3F);
                        }
                        break;
                    }
                    TexturedVertex[] arr = new TexturedVertex[4];
                    if(!radialtexture){
                        xSize = (float)(Math.sin((ModelRendererTurbo.pi / segments) * i * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * uCircle - 2F * uOffset));
                        ySize = (float)(Math.cos((ModelRendererTurbo.pi / segments) * i * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * vCircle - 2F * vOffset));
                        arr[0] = verts0.get(i).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                        //
                        xSize = (float)(Math.sin((ModelRendererTurbo.pi / segments) * i * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * uCircle2 - 2F * uOffset));
                        ySize = (float)(Math.cos((ModelRendererTurbo.pi / segments) * i * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * vCircle2 - 2F * vOffset));
                        arr[1] = verts1.get(i).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                        //
                        xSize = (float)(Math.sin((ModelRendererTurbo.pi / segments) * (i + 1) * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * uCircle2 - 2F * uOffset));
                        ySize = (float)(Math.cos((ModelRendererTurbo.pi / segments) * (i + 1) * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * vCircle2 - 2F * vOffset));
                        arr[2] = verts1.get(i + 1).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                        //
                        xSize = (float)(Math.sin((ModelRendererTurbo.pi / segments) * (i + 1) * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * uCircle - 2F * uOffset));
                        ySize = (float)(Math.cos((ModelRendererTurbo.pi / segments) * (i + 1) * 2F + (!dirTop ? 0 : ModelRendererTurbo.pi)) * (0.5F * vCircle - 2F * vOffset));
                        arr[3] = verts0.get(i + 1).setTexturePosition(uStart + mul * uCircle + xSize, vStart + 0.5F * vCircle + ySize);
                    }
                    else {
                        float diff = (radius - radius2) * uScale / 4;
                        arr[0] = verts0.get(i).setTexturePosition(uStart + (i * seg_width) * uScale, vStart + (mul * vScale));
                        arr[1] = verts1.get(i).setTexturePosition(uStart + (i * seg_width) * uScale + diff, vStart + ((seg_height + mul) * vScale));
                        arr[2] = verts1.get(i + 1).setTexturePosition(uStart + ((i + 1) * seg_width) * uScale - diff, vStart + ((seg_height + mul) * vScale));
                        arr[3] = verts0.get(i + 1).setTexturePosition(uStart + ((i + 1) * seg_width) * uScale, vStart + (mul * vScale));
                    }
                    if(repeat != 0 && toprot != null){
                        arr[0].vector3F = verts0.get(i).vector3F = toprot.getRelativeVector(arr[0].vector3F);
                        arr[1].vector3F = verts1.get(i).vector3F = toprot.getRelativeVector(arr[1].vector3F);
                        arr[2].vector3F = /*verts1.get(i + 1).vector3F =*/ toprot.getRelativeVector(arr[2].vector3F);
                        arr[3].vector3F = /*verts0.get(i + 1).vector3F =*/ toprot.getRelativeVector(arr[3].vector3F);
                    }
                    polis.add(new TexturedPolygon(arr));
                    if((repeat == 0) != dirFront) {
                        polis.get(polis.size() - 1 ).flipFace();
                    }
                }
            }
            verts0.clear(); verts1.clear(); xCur = xEnd; yCur = yEnd; zCur = zEnd; sCur = top_scale;
        }
        int halfv2 = verts2.size() / 2;
        if(radialtexture){ vCircle = (seg_height + seg_height) * vScale; }
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
            if(!togglesides[2]){
                arr[0] = verts2.get(i + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle);
                arr[1] = verts3.get(i + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight);
                arr[2] = verts3.get(i + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight);
                arr[3] = verts2.get(i + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle);
                polis.add(new TexturedPolygon(arr));
                if(dirFront) polis.get(polis.size() - 1 ).flipFace();
            }
            if(!togglesides[3]){
                arr = new TexturedVertex[4];
                arr[0] = verts2.get(i + halfv2 + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight);
                arr[1] = verts3.get(i + halfv2 + 0).setTexturePosition(uStart + uOffset + uWidth * (i + 0), vStart + vOffset + vCircle + vHeight + vHeight);
                arr[2] = verts3.get(i + halfv2 + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight + vHeight);
                arr[3] = verts2.get(i + halfv2 + 1).setTexturePosition(uStart + uOffset + uWidth * (i + 1), vStart + vOffset + vCircle + vHeight);
                polis.add(new TexturedPolygon(arr));
                if(!dirFront) polis.get(polis.size() - 1 ).flipFace();
            }
        }
        return root.copyTo(null, polis.toArray(new TexturedPolygon[0]));
    }

}