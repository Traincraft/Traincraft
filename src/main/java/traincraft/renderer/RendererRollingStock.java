package traincraft.renderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import traincraft.api.AbstractRollingStock;

import javax.annotation.Nullable;

public class RendererRollingStock<T extends AbstractRollingStock<T>> extends Render<T> {
    
    public RendererRollingStock(RenderManager renderManager) {
        super(renderManager);
    }
    
    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
        
        GlStateManager.pushMatrix();
        
        entity.preRender(entity, this.renderManager, x, y, z, entityYaw, partialTicks);
        
        GlStateManager.translate(x, y, z);
        GlStateManager.rotate(180.0F - entityYaw, 0.0F, 1.0F, 0.0F);
        this.bindTexture(entity.getTexture(entity));
        entity.getModel(entity).render();
        
        entity.postRender(entity, this.renderManager, x, y, z, entityYaw, partialTicks);
        
        GlStateManager.popMatrix();
    }
    
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return entity.getTexture(entity);
    }
}
