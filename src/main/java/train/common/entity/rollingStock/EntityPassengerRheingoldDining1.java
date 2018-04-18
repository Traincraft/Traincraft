package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.GuiIDs;

public class EntityPassengerRheingoldDining1 extends AbstractWorkCart implements IInventory {
	public EntityPassengerRheingoldDining1(World world) {
		super(world);
		initWorkCart();
	}

	public void initWorkCart() {
		furnaceItemStacks = new ItemStack[3];
		furnaceBurnTime = 0;
		currentItemBurnTime = 0;
		furnaceCookTime = 0;
	}

	public EntityPassengerRheingoldDining1(World world, double d, double d1, double d2) {
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
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 1;
		double yOffset = -0.1;
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
			riddenByEntity.setPosition(bogieX1- (Math.cos(rads)*-0.3), pitch1+ (Math.tan(this.anglePitchClient * 3.141592653589793D / 180.0D)*0.3), bogieZ1- (Math.sin(rads)*-0.3));
		}
		else if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1- (Math.cos(rads)*-0.3), pitch+ (Math.tan(this.anglePitchClient * 3.141592653589793D / 180.0D)*0.3), bogieZ1- (Math.sin(rads)*-0.3));
		}
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	public void pressKey(int i) {
		if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			if (locked && !((EntityPlayer) riddenByEntity).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())) {
				return;
			}
			if (i == 7) {
				((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CRAFTING_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
			}
			if (i == 9) {
				((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.FURNACE_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
			}
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		updateBurning();
	}

	@Override
	public String getInventoryName() {
		return "Rheingold Dining 1";
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
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
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public boolean isStorageCart() {
		return false;
	}

	@Override
	public boolean canBeRidden() {
		return true;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.45F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public void markDirty(){}
}