package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class EntityPassengerBlue extends EntityRollingStock implements IPassenger {

	public EntityPassengerBlue(World world) {
		super(world);
	}

	public EntityPassengerBlue(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void updateRiderPosition() {
		/*double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		
		double distance = 2;
		double yOffset = 0.01;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.rotationYawClientReal + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.rotationYawClientReal + 90)));
		float pitch = (float) (posY + ((Math.tan(pitchRads)*distance)+getMountedYOffset()) + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		//System.out.println(rotationCos1+" "+ rotationSin1);
		if(anglePitchClient>20 && rotationCos1 == -1){
			bogieX1-=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == -1){
			bogieZ1+=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);*/
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!worldObj.isRemote) {
			ItemStack itemstack = entityplayer.inventory.getCurrentItem();
			if(lockThisCart(itemstack, entityplayer))return true;
			if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
				return true;
			}
			if (!worldObj.isRemote) {
				entityplayer.mountEntity(this);
			}
		}
		return true;
	}

	@Override
	public boolean canBeRidden() {
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
		return 2.2F;
	}
}