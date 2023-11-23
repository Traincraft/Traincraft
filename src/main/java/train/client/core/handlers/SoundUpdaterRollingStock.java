package train.client.core.handlers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MathHelper;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.core.handlers.ConfigHandler;
import train.common.entity.rollingStock.EntityJukeBoxCart;

//TODO Fix the sounds
@SideOnly(Side.CLIENT)
public class SoundUpdaterRollingStock {
    private boolean isMoving = false;
    private boolean flag = false;
    private float soundPitch = 0.0F;
    private float volume1 = 0.0F;
    private float volume2 = 0.0F;

    public void update(SoundHandler par1SoundManager, EntityRollingStock rollingStock, EntityPlayerSP par3EntityPlayerSP) {
        if (par1SoundManager == null || rollingStock == null || par3EntityPlayerSP == null) {
            return;
        }

        if (!ConfigHandler.SOUNDS || rollingStock instanceof EntityJukeBoxCart || rollingStock instanceof Locomotive) {
            // Somehow interferes with music discs.
            return;
        }

        boolean isMoving = this.isMoving;
        boolean isDead = rollingStock.isDead;
        double cartSpeed = MathHelper.sqrt_double(rollingStock.getMotionXClient() * rollingStock.getMotionXClient() + rollingStock.getMotionZClient() * rollingStock.getMotionZClient()) / 100;
        this.isMoving = cartSpeed >= 0.01D;

        if (isDead || !this.flag && this.volume1 == 0.0F && this.volume2 == 0.0F) {
            this.flag = true;
            if (isDead) {
                return;
            }
        }

        if (this.isMoving) {
            if (this.soundPitch < 1.0F) {
                this.soundPitch += 0.0025F;
            }

            if (this.soundPitch > 1.0F) {
                this.soundPitch = 1.0F;
            }

            float var10 = MathHelper.clamp_float((float) cartSpeed, 0.0F, 4.0F) / 4.0F;
            this.volume2 = 0.0F + var10 * 0.75F;
            var10 = MathHelper.clamp_float(var10 * 2.0F, 0.0F, 1.0F);
            this.volume1 = 0.0F + var10 * 0.7F;
        } else if (isMoving) {
            this.volume1 = 0.0F;
            this.soundPitch = 0.0F;
            this.volume2 = 0.0F;
        }
    }
}