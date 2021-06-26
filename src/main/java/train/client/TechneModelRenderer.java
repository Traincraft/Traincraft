package train.client;


import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.PositionTransformVertex;
import tmt.TexturedPolygon;

/**
 * <h2>Techne model render</h2>
 * A middleman class to convert Techne models to something tmt can actually render properly.
 */
public class TechneModelRenderer extends ModelRendererTurbo {
    private static final int staticTextureSize =512;
    /**define the part with no texture offset, but using a static texture size of 512x512 and a defined name.*/
    public TechneModelRenderer(ModelBase modelBase, String name) {
        super(modelBase, name);
        this.setTextureSize(staticTextureSize,staticTextureSize);
    }
    /**define the part with a texture offset, but using a static name and texture size of 512x512*/
    public TechneModelRenderer(ModelBase modelBase, int textureOffsetX, int textureOffsetY) {
        this(modelBase, "void");
        this.setTextureOffset(textureOffsetX,textureOffsetY);
    }
    /**define the part with all data.*/
    public TechneModelRenderer(ModelBase modelBase, int textureOffsetX, int textureOffsetY, String name) {
        this(modelBase, name);
        this.setTextureOffset(textureOffsetX,textureOffsetY);
    }
    private TexturedPolygon faces[];
    @Override
    public void addBox(float f, float f1, float f2, int i, int j, int k, float f3) {
        faces = new TexturedPolygon[6];
        float f4 = f + i +f3;
        float f5 = f1 + j +f3;
        float f6 = f2 + k +f3;
        f -= f3;
        f1 -= f3;
        f2 -= f3;
        PositionTransformVertex PositionTransformVertex = new PositionTransformVertex(f, f1, f2, 0.0F, 0.0F);
        PositionTransformVertex PositionTransformVertex1 = new PositionTransformVertex(f4, f1, f2, 0.0F, 8F);
        PositionTransformVertex PositionTransformVertex2 = new PositionTransformVertex(f4, f5, f2, 8F, 8F);
        PositionTransformVertex PositionTransformVertex3 = new PositionTransformVertex(f, f5, f2, 8F, 0.0F);
        PositionTransformVertex PositionTransformVertex4 = new PositionTransformVertex(f, f1, f6, 0.0F, 0.0F);
        PositionTransformVertex PositionTransformVertex5 = new PositionTransformVertex(f4, f1, f6, 0.0F, 8F);
        PositionTransformVertex PositionTransformVertex6 = new PositionTransformVertex(f4, f5, f6, 8F, 8F);
        PositionTransformVertex PositionTransformVertex7 = new PositionTransformVertex(f, f5, f6, 8F, 0.0F);
        faces[0] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex5, PositionTransformVertex1, PositionTransformVertex2, PositionTransformVertex6 }, textureOffsetX + k + i, textureOffsetY + k, textureOffsetX + k + i + k, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[1] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex, PositionTransformVertex4, PositionTransformVertex7, PositionTransformVertex3 }, textureOffsetX, textureOffsetY + k, textureOffsetX + k, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[2] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex5, PositionTransformVertex4, PositionTransformVertex, PositionTransformVertex1 }, textureOffsetX + k, textureOffsetY, textureOffsetX + k + i, textureOffsetY + k, textureWidth, textureHeight);
        faces[3] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex2, PositionTransformVertex3, PositionTransformVertex7, PositionTransformVertex6 }, textureOffsetX + k + i, textureOffsetY, textureOffsetX + k + i + i, textureOffsetY + k, textureWidth, textureHeight);
        faces[4] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex1, PositionTransformVertex, PositionTransformVertex3, PositionTransformVertex2 }, textureOffsetX + k, textureOffsetY + k, textureOffsetX + k + i, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[5] = generateFaces(new PositionTransformVertex[] { PositionTransformVertex4, PositionTransformVertex5, PositionTransformVertex6, PositionTransformVertex7 }, textureOffsetX + k + i + k, textureOffsetY + k, textureOffsetX + k + i + k + i, textureOffsetY + k + j, textureWidth, textureHeight);

        textureGroup.get("0").poly.clear();
        textureGroup.get("0").addPoly(faces[0]);
        textureGroup.get("0").addPoly(faces[1]);
        textureGroup.get("0").addPoly(faces[2]);
        textureGroup.get("0").addPoly(faces[3]);
        textureGroup.get("0").addPoly(faces[4]);
        textureGroup.get("0").addPoly(faces[5]);

    }
    private static TexturedPolygon generateFaces(PositionTransformVertex aPositionTransformVertex[], int i, int j, int k, int l, float textureWidth, float textureHeight) {
        aPositionTransformVertex[0] = new PositionTransformVertex(aPositionTransformVertex[0].vector3F, (float) k / textureWidth - 0.0015625F, (float) j / textureHeight + 0.003125F);
        aPositionTransformVertex[1] = new PositionTransformVertex(aPositionTransformVertex[1].vector3F,(float) i / textureWidth + 0.0015625F, (float) j / textureHeight + 0.003125F);
        aPositionTransformVertex[2] = new PositionTransformVertex(aPositionTransformVertex[2].vector3F,(float) i / textureWidth + 0.0015625F, (float) l / textureHeight - 0.003125F);
        aPositionTransformVertex[3] = new PositionTransformVertex(aPositionTransformVertex[3].vector3F,(float) k / textureWidth - 0.0015625F, (float) l / textureHeight - 0.003125F);
        return new TexturedPolygon(aPositionTransformVertex);
    }

    /**
     * <h2>set Rotation point</h2>
     * this set's the rotation point with the offsets defined in
     * @see #addBox(float, float, float, float, float, float)
     */
    @Override
    public void setRotationPoint(float pointX, float pointY, float pointZ) {
            this.rotationPointX = pointX;
            this.rotationPointY = pointY-15;
            this.rotationPointZ = pointZ;
    }

}
