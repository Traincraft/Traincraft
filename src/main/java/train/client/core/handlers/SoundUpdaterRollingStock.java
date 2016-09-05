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

	private SoundHandler theSoundManager;

	/** Minecart which sound is being updated. */
	private EntityRollingStock theMinecart;

	/** The player that is getting the minecart sound updates. */
	private EntityPlayerSP thePlayer;
	private boolean riddenByPlayer = false;
	private boolean isDead = false;
	private boolean isMoving = false;
	private boolean flag = false;
	private float soundPitch = 0.0F;
	private float volume1 = 0.0F;
	private float volume2 = 0.0F;
	private double cartSpeed = 0.0D;

	public void update(SoundHandler par1SoundManager, EntityRollingStock rollingStock, EntityPlayerSP par3EntityPlayerSP) {
		this.theSoundManager = par1SoundManager;
		this.theMinecart = rollingStock;
		this.thePlayer = par3EntityPlayerSP;
		if (this.theSoundManager == null || this.theMinecart == null || this.thePlayer == null)
			return;
		if (!ConfigHandler.SOUNDS || rollingStock instanceof EntityJukeBoxCart || rollingStock instanceof Locomotive)
			return;//it somehow interferes with the music disks
		boolean var1 = false;
		boolean var2 = this.riddenByPlayer;
		boolean var3 = this.isDead;
		boolean var4 = this.isMoving;
		float var5 = this.volume1;
		float var6 = this.soundPitch;
		float var7 = this.volume2;
		double var8 = this.cartSpeed;
		this.riddenByPlayer = this.thePlayer != null && this.theMinecart.riddenByEntity == this.thePlayer;
		this.isDead = this.theMinecart.isDead;
		//System.out.println(MathHelper.sqrt_double(this.theMinecart.getMotionXClient()*this.theMinecart.getMotionXClient()+this.theMinecart.getMotionZClient()*this.theMinecart.getMotionZClient())/100);
		this.cartSpeed = MathHelper.sqrt_double(this.theMinecart.getMotionXClient() * this.theMinecart.getMotionXClient() + this.theMinecart.getMotionZClient() * this.theMinecart.getMotionZClient()) / 100;
		this.isMoving = this.cartSpeed >= 0.01D;
		//System.out.println(isMoving);
		//if (var2 && !this.riddenByPlayer) {
			//this.theSoundManager.stopEntitySound(this.thePlayer);
		//}

		if (this.isDead || !this.flag && this.volume1 == 0.0F && this.volume2 == 0.0F) {
			/*if (!var3) {
				//this.theSoundManager.stopEntitySound(this.theMinecart);
				if (var2 || this.riddenByPlayer) {
					//this.theSoundManager.stopEntitySound(this.thePlayer);
				}
			}*/
			this.flag = true;
			if (this.isDead) {
				return;
			}
		}

		/*
		if (!this.theSoundManager.isEntitySoundPlaying(this.theMinecart) && this.volume1 > 0.0F) {
			this.theSoundManager.playEntitySound("minecart.base", this.theMinecart, this.volume1, this.soundPitch, false);
			this.flag = false;
			var1 = true;
		}
		*/
		if (this.isMoving) {
			if (this.soundPitch < 1.0F) {
				this.soundPitch += 0.0025F;
			}
			if (this.soundPitch > 1.0F) {
				this.soundPitch = 1.0F;
			}
			float var10 = MathHelper.clamp_float((float) this.cartSpeed, 0.0F, 4.0F) / 4.0F;
			this.volume2 = 0.0F + var10 * 0.75F;
			var10 = MathHelper.clamp_float(var10 * 2.0F, 0.0F, 1.0F);
			this.volume1 = 0.0F + var10 * 0.7F;
		}
		else if (var4) {
			this.volume1 = 0.0F;
			this.soundPitch = 0.0F;
			this.volume2 = 0.0F;
		}
		/*if (!this.flag) {
			if (this.soundPitch != var6) {
				//this.theSoundManager.setEntitySoundPitch(this.theMinecart, this.soundPitch);
			}
			if (this.volume1 != var5) {
				//this.theSoundManager.setEntitySoundVolume(this.theMinecart, this.volume1);
			}
			if (this.volume2 != var7) {
				//this.theSoundManager.setEntitySoundVolume(this.thePlayer, this.volume2);
			}
		}
		if (!var1 && (this.volume1 > 0.0F || this.volume2 > 0.0F)) {
			//this.theSoundManager.updateSoundLocation(this.theMinecart);
			if (this.riddenByPlayer) {
				//this.theSoundManager.updateSoundLocation(this.thePlayer, this.theMinecart);
			}
		}
		else {
			if (this.theSoundManager.isEntitySoundPlaying(this.theMinecart)) {
				this.theSoundManager.stopEntitySound(this.theMinecart);
			}
			if (this.theSoundManager.isEntitySoundPlaying(this.thePlayer)) {
				this.theSoundManager.stopEntitySound(this.thePlayer);
			}
		}
		*/
	}
}