package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class EntityPassengerGS4_Tail extends EntityRollingStock implements IPassenger {

	public EntityPassengerGS4_Tail(World world) {
		super(world);
	}

	public EntityPassengerGS4_Tail(World world, double d, double d1, double d2) {
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
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = -0.5;
		double yOffset = 0;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 0));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 0)));
		if (side.isServer()) {
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 0));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 0)));
			anglePitchClient = serverRealPitch * 60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1 * distance));
		// System.out.println(rotationCos1+" "+rotationSin1);
		if (anglePitchClient > 20 && rotationCos1 == 1) {
			bogieX1 -= pitchRads * 2;
			pitch -= pitchRads * 1.2;
		}
		if (anglePitchClient > 20 && rotationSin1 == 1) {
			bogieZ1 -= pitchRads * 2;
			pitch -= pitchRads * 1.2;
		}
		double rads = this.rotationYawClientReal-90 * 3.141592653589793D / 180.0D;
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1- (Math.cos(rads)*-0.05), pitch1+ (Math.tan(this.anglePitchClient * 3.141592653589793D / 180.0D)*0.05), bogieZ1- (Math.sin(rads)*-0.05));
		}
		else if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1- (Math.cos(rads)*-0.05), pitch+ (Math.tan(this.anglePitchClient * 3.141592653589793D / 180.0D)*0.05), bogieZ1- (Math.sin(rads)*-0.05));
		}
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
		return 3F;
	}
}