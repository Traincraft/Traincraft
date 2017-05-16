/*
 * This file ("TrainModelRenderer.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * @author canitzp
 */
public class TrainModelRenderer extends ModelRenderer {

    private float width, height, depth, offX, offY, offZ, morePartsWidth, morePartsHeight, morePartsDepth;

    public TrainModelRenderer(ModelBase model, String boxNameIn) {
        super(model, boxNameIn);
    }

    public TrainModelRenderer(ModelBase model) {
        super(model);
    }

    public TrainModelRenderer(ModelBase model, int texOffX, int texOffY) {
        super(model, texOffX, texOffY);
    }

    public TrainModelRenderer setRotationAngle(float x, float y, float z) {
        this.rotateAngleX = x;
        this.rotateAngleY = y;
        this.rotateAngleZ = z;
        return this;
    }

    public TrainModelRenderer setTextureOffset(int x, int y) {
        super.setTextureOffset(x, y);
        return this;
    }

    @Override
    public ModelRenderer addBox(String partName, float offX, float offY, float offZ, int width, int height, int depth) {
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (this.morePartsWidth < offX + width) {
            this.morePartsWidth = offX + width;
        }
        if (this.morePartsHeight < offY + height) {
            this.morePartsHeight = offY + height;
        }
        if (this.morePartsDepth < offZ + depth) {
            this.morePartsDepth = offZ + depth;
        }
        return super.addBox(partName, offX, offY, offZ, width, height, depth);
    }

    @Override
    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth) {
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (this.morePartsWidth < offX + width) {
            this.morePartsWidth = offX + width;
        }
        if (this.morePartsHeight < offY + height) {
            this.morePartsHeight = offY + height;
        }
        if (this.morePartsDepth < offZ + depth) {
            this.morePartsDepth = offZ + depth;
        }
        return super.addBox(offX, offY, offZ, width, height, depth);
    }

    @Override
    public ModelRenderer addBox(float offX, float offY, float offZ, int width, int height, int depth, boolean mirrored) {
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (this.morePartsWidth < offX + width) {
            this.morePartsWidth = offX + width;
        }
        if (this.morePartsHeight < offY + height) {
            this.morePartsHeight = offY + height;
        }
        if (this.morePartsDepth < offZ + depth) {
            this.morePartsDepth = offZ + depth;
        }
        return super.addBox(offX, offY, offZ, width, height, depth, mirrored);
    }

    @Override
    public void addBox(float offX, float offY, float offZ, int width, int height, int depth, float scaleFactor) {
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (this.morePartsWidth < offX + width) {
            this.morePartsWidth = offX + width;
        }
        if (this.morePartsHeight < offY + height) {
            this.morePartsHeight = offY + height;
        }
        if (this.morePartsDepth < offZ + depth) {
            this.morePartsDepth = offZ + depth;
        }
        super.addBox(offX, offY, offZ, width, height, depth, scaleFactor);
    }

    public float getMaxWidth() {
        return Math.max(width, depth);
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public float getDepth() {
        return this.depth;
    }

    public float getOffX() {
        return offX;
    }

    public float getOffY() {
        return offY;
    }

    public float getOffZ() {
        return offZ;
    }

    public float getMorePartsWidth() {
        return morePartsWidth;
    }

    public float getMorePartsHeight() {
        return morePartsHeight;
    }

    public float getMorePartsDepth() {
        return morePartsDepth;
    }
}
