/*
 * This file ("TrainModel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
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
import java.util.ArrayList;
import java.util.List;

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

    public void reInitParts(){
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
        renderer.setRotationAngle(0, 0, (float) Math.PI);
        this.partWheels.add(renderer);
        return renderer;
    }

    protected TrainModelRenderer addPart(float offsetX, float offsetY, float offsetZ, int textureX, int textureY, PredefinedTrainShapes shape){
        TrainModelRenderer renderer = new TrainModelRenderer(this, textureX, textureY);
        for(PredefinedTrainShapes.Part part : shape.getPart()){
            renderer.addBox(offsetX + part.offsetX, offsetY + part.offsetY, offsetZ + part.offsetZ, part.width, part.height, part.depth);
        }
        renderer.setTextureSize(this.textureSize, this.textureSize);
        renderer.setRotationAngle(shape.getRotationX(), shape.getRotationY(), shape.getRotationZ());
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

    public List<TrainModelRenderer> getAllRenderer(){
        List<TrainModelRenderer> list = new ArrayList<>();
        list.addAll(this.partBody);
        list.addAll(this.partWheels);
        return list;
    }

    public NonNullList<TrainModelRenderer> getPartBody() {
        return partBody;
    }

    public NonNullList<TrainModelRenderer> getPartWheels() {
        return partWheels;
    }

    public float getMaxWidth(){
        float width = 0;
        for(TrainModelRenderer renderer : getAllRenderer()){
            if(width < renderer.getMorePartsWidth()){
                width = renderer.getMorePartsWidth();
            }
        }
        return width / 16;
    }

    public float getMaxHeight(){
        float height = 0;
        for(TrainModelRenderer renderer : getAllRenderer()){
            if(height < renderer.getMorePartsHeight()){
                height = renderer.getMorePartsHeight();
            }
        }
        return height / 16;
    }

    public float getMaxDepth(){
        float depth = 0;
        for(TrainModelRenderer renderer : getAllRenderer()){
            if(depth < renderer.getMorePartsDepth()){
                depth = renderer.getMorePartsDepth();
            }
        }
        return depth / 16;
    }

    public float getWheelHeight(){
        float height = 0;
        for(TrainModelRenderer renderer : partWheels){
            if(height < renderer.getMorePartsHeight()){
                height = renderer.getMorePartsHeight();
            }
        }
        return height / 16;
    }

}
