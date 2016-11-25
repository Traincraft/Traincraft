/*
 * This file ("TrainModelRenderer.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * @author canitzp
 */
public class TrainModelRenderer extends ModelRenderer {

    public TrainModelRenderer(ModelBase model, String boxNameIn) {
        super(model, boxNameIn);
    }

    public TrainModelRenderer(ModelBase model) {
        super(model);
    }

    public TrainModelRenderer(ModelBase model, int texOffX, int texOffY) {
        super(model, texOffX, texOffY);
    }

    public TrainModelRenderer setRotationAngle(float x, float y, float z){
        this.rotateAngleX = x;
        this.rotateAngleY = y;
        this.rotateAngleZ = z;
        return this;
    }
}
