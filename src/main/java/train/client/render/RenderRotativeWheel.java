package train.client.render;

import fexcraft.tmt.slim.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelRotaryExcavator_Wheel;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.digger.EntityRotativeWheel;

public class RenderRotativeWheel extends Render {
    private long lastframe;
    private float mvt = 0.0F;

    private static final ModelBase modelRotaryExcavator_Wheel = new ModelRotaryExcavator_Wheel();

    public RenderRotativeWheel() {
        //shadowSize = 0.5F;
        lastframe = System.nanoTime();

    }

    private void render(EntityRotativeWheel wheel, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glRotatef(90F - f, 0.0F, 1.0F, 0.0F);

        GL11.glTranslatef(0.0F, 0.5F, 0.0F);
        GL11.glScalef(0.4F, 0.6F, 0.6F);

        EntityRotativeDigger entity = (EntityRotativeDigger) wheel.entity;

        if (entity != null && entity.getFuel() > 0) {
            long now = System.nanoTime();
            int elapsed = (int) ((now - lastframe) / (1000 * 1000));
            mvt -= (float) elapsed / 300.0f;
            lastframe = now;

            GL11.glRotatef((mvt + 0.4188790204786391F) * 100, 1F, 0F, 0F);
        }

        modelRotaryExcavator_Wheel.render(wheel, 0.0F, +0.2F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float pitch) {
        render((EntityRotativeWheel) entity, x, y, z, yaw);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
