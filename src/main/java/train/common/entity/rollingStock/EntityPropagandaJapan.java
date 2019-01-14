package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import train.common.adminbook.ServerLogger;
import train.common.api.EntityRollingStock;

public class EntityPropagandaJapan extends EntityRollingStock {


	public EntityPropagandaJapan(World world) {
		super(world);
	}

	public EntityPropagandaJapan(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote) {
			return true;
		}
		if(canBeDestroyedByPlayer(damagesource))return true;
		super.attackEntityFrom(damagesource, i);
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setBeenAttacked();
		setDamage(getDamage() + i * 10);
		if (getDamage() > 40) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
			}
			this.setDead();
			ServerLogger.deleteWagon(this);
			if(damagesource.getEntity() instanceof EntityPlayer) {
				dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
			}
		}
		return true;
	}
	
	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}


	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		//ItemStack var2 = entityplayer.inventory.getCurrentItem();
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (locked && !entityplayer.getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())) {
			if (!worldObj.isRemote)
				entityplayer.addChatMessage(new ChatComponentText("this train is locked"));
			return true;
		}
		return true;
	}

	@Override
	public boolean isStorageCart() {
		return false;
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.7F;
	}
}