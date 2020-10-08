package ebf.tim.models;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;


/**
 * <h2>Cubik pro model render</h2>
 * A middleman class to convert Cubik pro models to something tmt can actually render properly.
 * Theoretically this should work with any models that use the setRotationPoint instead of defining position with addBox.
 * @author Eternal Blue Flame
 */
public class CubikModelRenderer extends ModelRendererTurbo {
    /**transitional value for the width of a cube*/
    private float width=0;
    /**transitional value for the height of a cube*/
    private float height=0;
    /**transitional value for the depth of a cube*/
    private float depth=0;
    /**base constructor*/
    public CubikModelRenderer(ModelBase p_i1172_1_, String p_i1172_2_) {
        super(p_i1172_1_, p_i1172_2_);
    }
    /**base constructor with a texture offset*/
    public CubikModelRenderer(ModelBase p_i1174_1_, int p_i1174_2_, int p_i1174_3_) {
        this(p_i1174_1_, "void");
        this.setTextureOffset(p_i1174_2_,p_i1174_3_);
    }
    /**base constructor with a texture offset and box name*/
    public CubikModelRenderer(ModelBase p_i1174_1_, int p_i1174_2_, int p_i1174_3_, String name) {
        this(p_i1174_1_, name);
        this.setTextureOffset(p_i1174_2_,p_i1174_3_);
    }

    /**
     * <h2>add Box to the render</h2>
     * adds a box to the render with the defined values, we use the width, height, and depth to help define the center point used for rotation.
     * we use this to convert the model from BDCraft Cubik Pro's .java format to the TMT format.
     */
    @Override
    public ModelRendererTurbo addBox(float unused1, float unused2, float unused3, int boxWidth, int boxHeight, int boxDepth) {
        width = (-(boxWidth)*0.5f);
        height = (-(boxHeight )*0.5f);
        depth = (-(boxDepth)*0.5f);
        super.addBox(width,height,depth,boxWidth,boxHeight,boxDepth);
        return this;
    }


    /**
     * <h2>set Rotation point</h2>
     * this set's the rotation point with the offsets defined in
     * @see #addBox(float, float, float, float, float, float)
     */
    @Override
    public ModelRendererTurbo setRotationPoint(float pointX, float pointY, float pointZ) {
            this.rotationPointX = pointX+ Math.copySign(width,1);
            this.rotationPointY = pointY+Math.copySign(height,1);
            this.rotationPointZ = pointZ+Math.copySign(depth,1);
            return this;
    }

}
