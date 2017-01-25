/*
 * This file ("TrainRenderer.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.renderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import si.meansoft.traincraft.api.TrainBase;
import si.meansoft.traincraft.client.models.TrainModel;

import javax.annotation.Nullable;

/**
 * @author canitzp
 */
public class TrainRenderer<T extends TrainBase> extends Render<T> implements IResourceManagerReloadListener{

    private TrainModel<T> model;
    private ResourceLocation loc;
    private boolean dirty = true;

    public TrainRenderer(RenderManager renderManager, TrainModel<T> model) {
        super(renderManager);
        this.model = model;
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        if(this.dirty){
            this.dirty = false;
            //entity.processModelChanges(this.model);
            return this.loc = this.model.getTexture(entity);
        }
        return this.loc;
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.rotate(-entity.rotationYaw, 0, 1, 0);
        GlStateManager.rotate(entity.rotationPitch, 1, 0, 0);
        System.out.println(Math.round((-model.getMaxWidth() / 2 + model.getXOffset()) * 10.0F) / 10.0F);
        GlStateManager.translate(Math.round((-model.getMaxWidth() / 2 + model.getXOffset()) * 10.0F) / 10.0F, -model.getYOffset() + model.getWheelHeight(), -model.getMaxDepth() / 2 + model.getZOffset());
        this.bindEntityTexture(entity);
        this.model.render();
        GlStateManager.popMatrix();
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {
        this.model.reInitParts();
        this.dirty = true;
    }

}
