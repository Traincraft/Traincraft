package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class EntityPassengerICE_1class extends EntityRollingStock implements IPassenger {

	public EntityPassengerICE_1class(World world) {
		super(world);
	}

	public EntityPassengerICE_1class(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() {
		//if(this.bogie[0]!=null){
			/*double dX = this.posX - this.bogie[0].posX;
			double dZ = this.posZ - this.bogie[0].posZ;
			dX/=2;
			dZ/=2;*/
			//System.out.println(worldObj.isRemote+ " "+(posX - dX) +" " + (posZ - dZ));
			//riddenByEntity.setPosition(posX - dX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ-dZ);	
		//}
		/*double rads = this.rotationYawClientReal-90 * 3.141592653589793D / 180.0D;
		double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		double distance = 1.3;
		riddenByEntity.setPosition(posX - Math.cos(rads)*distance, posY + (Math.tan(pitchRads)*-distance)+( getMountedYOffset() + riddenByEntity.getYOffset() + 0.2F), posZ - Math.sin(rads)*distance);
		*/
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
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
		return 3.1F;
	}
}