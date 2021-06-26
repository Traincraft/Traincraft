package train.client;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.TexturedPolygon;
import fexcraft.tmt.slim.TexturedVertex;

/**
 * <h2>Techne model render</h2>
 * A middleman class to convert Techne models to something tmt can actually render properly.
 */
public class TechneModelRenderer extends ModelRendererTurbo {
    private static final int staticTextureSize =512;
    /**define the part with no texture offset, but using a static texture size of 512x512 and a defined name.*/
    public TechneModelRenderer(ModelBase modelBase, String name) {
        super(modelBase, name);
        textureWidth=staticTextureSize;
        textureHeight=staticTextureSize;
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
    public ModelRendererTurbo addBox(float f, float f1, float f2, int i, int j, int k, float f3) {
        faces = new TexturedPolygon[6];
        float f4 = f + i +f3;
        float f5 = f1 + j +f3;
        float f6 = f2 + k +f3;
        f -= f3;
        f1 -= f3;
        f2 -= f3;
        TexturedVertex TexturedVertex = new TexturedVertex(f, f1, f2, 0.0F, 0.0F);
        TexturedVertex TexturedVertex1 = new TexturedVertex(f4, f1, f2, 0.0F, 8F);
        TexturedVertex TexturedVertex2 = new TexturedVertex(f4, f5, f2, 8F, 8F);
        TexturedVertex TexturedVertex3 = new TexturedVertex(f, f5, f2, 8F, 0.0F);
        TexturedVertex TexturedVertex4 = new TexturedVertex(f, f1, f6, 0.0F, 0.0F);
        TexturedVertex TexturedVertex5 = new TexturedVertex(f4, f1, f6, 0.0F, 8F);
        TexturedVertex TexturedVertex6 = new TexturedVertex(f4, f5, f6, 8F, 8F);
        TexturedVertex TexturedVertex7 = new TexturedVertex(f, f5, f6, 8F, 0.0F);
        faces[0] = generateFaces(new TexturedVertex[] { TexturedVertex5, TexturedVertex1, TexturedVertex2, TexturedVertex6 }, textureOffsetX + k + i, textureOffsetY + k, textureOffsetX + k + i + k, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[1] = generateFaces(new TexturedVertex[] { TexturedVertex, TexturedVertex4, TexturedVertex7, TexturedVertex3 }, textureOffsetX, textureOffsetY + k, textureOffsetX + k, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[2] = generateFaces(new TexturedVertex[] { TexturedVertex5, TexturedVertex4, TexturedVertex, TexturedVertex1 }, textureOffsetX + k, textureOffsetY, textureOffsetX + k + i, textureOffsetY + k, textureWidth, textureHeight);
        faces[3] = generateFaces(new TexturedVertex[] { TexturedVertex2, TexturedVertex3, TexturedVertex7, TexturedVertex6 }, textureOffsetX + k + i, textureOffsetY, textureOffsetX + k + i + i, textureOffsetY + k, textureWidth, textureHeight);
        faces[4] = generateFaces(new TexturedVertex[] { TexturedVertex1, TexturedVertex, TexturedVertex3, TexturedVertex2 }, textureOffsetX + k, textureOffsetY + k, textureOffsetX + k + i, textureOffsetY + k + j, textureWidth, textureHeight);
        faces[5] = generateFaces(new TexturedVertex[] { TexturedVertex4, TexturedVertex5, TexturedVertex6, TexturedVertex7 }, textureOffsetX + k + i + k, textureOffsetY + k, textureOffsetX + k + i + k + i, textureOffsetY + k + j, textureWidth, textureHeight);
        return this;
    }
    private static TexturedPolygon generateFaces(TexturedVertex aTexturedVertex[], int i, int j, int k, int l, float textureWidth, float textureHeight) {
        aTexturedVertex[0] = new TexturedVertex(aTexturedVertex[0].vector3F, (float) k / textureWidth - 0.0015625F, (float) j / textureHeight + 0.003125F);
        aTexturedVertex[1] = new TexturedVertex(aTexturedVertex[1].vector3F,(float) i / textureWidth + 0.0015625F, (float) j / textureHeight + 0.003125F);
        aTexturedVertex[2] = new TexturedVertex(aTexturedVertex[2].vector3F,(float) i / textureWidth + 0.0015625F, (float) l / textureHeight - 0.003125F);
        aTexturedVertex[3] = new TexturedVertex(aTexturedVertex[3].vector3F,(float) k / textureWidth - 0.0015625F, (float) l / textureHeight - 0.003125F);
        return new TexturedPolygon(aTexturedVertex);
    }

    /**
     * <h2>set Rotation point</h2>
     * this set's the rotation point with the offsets defined in
     * @see #addBox(float, float, float, float, float, float)
     */
    @Override
    public ModelRendererTurbo setRotationPoint(float pointX, float pointY, float pointZ) {
            this.rotationPointX = pointX;
            this.rotationPointY = pointY-15;
            this.rotationPointZ = pointZ;
            return this;
    }

}
