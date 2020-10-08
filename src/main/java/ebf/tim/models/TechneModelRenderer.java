package ebf.tim.models;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

/**
 * <h2>Techne model render</h2>
 * A middleman class to convert Techne models to something tmt can actually render properly.
 */
public class TechneModelRenderer extends ModelRendererTurbo {
    private static final int staticTextureSize =512;
    /**define the part with no texture offset, but using a static texture size of 512x512 and a defined name.*/
    public TechneModelRenderer(ModelBase modelBase, String name) {
        super(modelBase, name);
        this.textureWidth = this.textureHeight = staticTextureSize;
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

    /**
     * <h2>set Rotation point</h2>
     * this set's the rotation point with the offsets
     */
    @Override
    public ModelRendererTurbo setRotationPoint(float pointX, float pointY, float pointZ) {
            this.rotationPointX = pointX;
            this.rotationPointY = pointY-15;
            this.rotationPointZ = pointZ;
            return this;
    }

}
