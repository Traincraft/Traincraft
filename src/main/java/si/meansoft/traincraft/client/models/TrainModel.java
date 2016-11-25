/*
 * This file ("TrainModel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import si.meansoft.traincraft.api.TrainBase;

import javax.annotation.Nullable;

/**
 * @author canitzp
 */
public abstract class TrainModel<T extends TrainBase> extends ModelBase{

    private NonNullList<TrainModelRenderer> partWheels = NonNullList.create();
    private NonNullList<TrainModelRenderer> partBody = NonNullList.create();

    private int textureSize;

    public TrainModel(int textureSize){
        this.textureSize = textureSize;
        initParts();
    }

    public void reinitParts(){
        this.partWheels.clear();
        this.partBody.clear();
        initParts();
    }

    public abstract void initParts();

    public void render() {
        float scale = 0.0625F;
        this.renderBody(scale);
        this.renderWheels(scale);
    }

    private void renderWheels(float scale){
        for(ModelRenderer renderer : partWheels){
            renderer.render(scale);
        }
    }

    private void renderBody(float scale){
        for(ModelRenderer renderer : partBody){
            renderer.render(scale);
        }
    }

    protected TrainModelRenderer addWheel(float offX, float offY, float offZ, int textureOffsetX, int textureOffsetY, int width, int height, int depth){
        TrainModelRenderer renderer = new TrainModelRenderer(this, textureOffsetX, textureOffsetY);
        renderer.addBox(offX, offY, offZ, width, height, depth);
        renderer.setTextureSize(this.textureSize, this.textureSize);
        this.partWheels.add(renderer);
        return renderer;
    }

    protected TrainModelRenderer addBody(float offX, float offY, float offZ, int textureOffsetX, int textureOffsetY, int width, int height, int depth){
        TrainModelRenderer renderer = new TrainModelRenderer(this, textureOffsetX, textureOffsetY);
        renderer.addBox(offX, offY, offZ, width, height, depth);
        renderer.setTextureSize(this.textureSize, this.textureSize);
        this.partBody.add(renderer);
        return renderer;
    }

    public float getXOffset(){
        return 0.0F;
    }

    public float getYOffset(){
        return 0.0F;
    }

    public float getZOffset(){
        return 0.0F;
    }

    @Nullable
    public ResourceLocation getTexture(T train){
        return TextureMap.LOCATION_MISSING_TEXTURE;
    }
}
