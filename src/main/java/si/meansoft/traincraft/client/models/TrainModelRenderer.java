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

    private float width, height, depth;

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

    @Override
    public ModelRenderer addBox(String partName, float offX, float offY, float offZ, int width, int height, int depth) {
        setWidthAndHeight(width, height, depth);
        return super.addBox(partName, offX, offY, offZ, width, height, depth);
    }

    @Override
    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth) {
        setWidthAndHeight(width, height, depth);
        return super.addBox(offX, offY, offZ, width, height, depth);
    }

    @Override
    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth, boolean mirrored) {
        setWidthAndHeight(width, height, depth);
        return super.addBox(offX, offY, offZ, width, height, depth, mirrored);
    }

    @Override
    public void addBox(float offX, float offY, float offZ, int width, int height, int depth, float scaleFactor) {
        setWidthAndHeight(width, height, depth);
        super.addBox(offX, offY, offZ, width, height, depth, scaleFactor);
    }

    private void setWidthAndHeight(float width, float height, float depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public float getMaxWidth(){
        return Math.max(width, depth);
    }

    public float getWidth(){
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public float getDepth() {
        return this.depth;
    }

}
