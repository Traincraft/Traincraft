package ebf.tim.models;

import ebf.tim.entities.GenericRailTransport;
import fexcraft.tmt.slim.ModelRendererTurbo;

public abstract class AnimationBase {

    /**a reference to the ModelRendererTurbo part, with the previous modifications*/
    public ModelRendererTurbo modelRefrence;
    /**A copy of the original Vec6F for the model part*/
    public float[] originalRotationValuesXYZ;

    public abstract AnimationBase init(ModelRendererTurbo model, GenericRailTransport transport);

    public abstract boolean isPart(ModelRendererTurbo model);

    public abstract boolean culls(ModelRendererTurbo model);

    public abstract void animate(float rotationZ, float[] pistonOffset, GenericRailTransport host);
}
