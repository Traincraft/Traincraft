package train.common.api;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.core.handlers.ConfigHandler;

public class SpeedHandler {

	public double handleSpeed(double railMaxSpeed, float maxSpeed, Entity entity) {
		//System.out.println(railMaxSpeed);
		if (railMaxSpeed >= 0.4 && railMaxSpeed <= 0.45 && entity instanceof Locomotive) {
			return convertSpeed(entity);
		}
		else if (railMaxSpeed < 0.4 && entity instanceof Locomotive) {
			if (convertSpeed(entity) < railMaxSpeed)
				return convertSpeed(entity);
			return railMaxSpeed;
		}
		else if ((railMaxSpeed > 0.45 && railMaxSpeed<1.1) && entity instanceof Locomotive) {
			return convertSpeed(entity) + 0.2;
		}
		else if (entity instanceof Locomotive) {
			return convertSpeed(entity);
		}
		else {
			return 3;
		}
	}

	/**
	 * 
	 * @param world
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	public static boolean isSpeedRailAt(World world, int i, int j, int k) {
		Block block = world.getBlock(i, j, k);
		//Block block = Block.blocksList[id];
		if (block != null && block.getClass().getName().equals("IRailSpeed")) {
			return true;
		}
		TileEntity tile = world.getTileEntity(i, j, k);
		return tile != null && tile.getClass().getName().equals("IRailSpeed");
	}

	public double speedXFromPitch(EntityPlayer player, double var3) {
		//System.out.println("X Y: " + player.rotationYaw + " |P: " + player.rotationPitch + " |Sin: " + (-MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI)) + " |Cos: " + (MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI)));
		return -MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI) * var3 * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * var3;
	}

	public double speedZFromPitch(EntityPlayer player, double var3) {
		//System.out.println("Z Y: " + player.rotationYaw + " |P: " + player.rotationPitch + " |Sin: " + (-MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI)) + " |Cos: " + (MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI)));
		return MathHelper.cos(player.rotationYaw / 180.0F * (float) Math.PI) * var3 * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * var3;
	}

	/**
	 * 
	 */
	private double convertSpeed(Entity entity) {
		double speed = ((Locomotive) entity).getCustomSpeed();// speed is in m/s
		if(ConfigHandler.REAL_TRAIN_SPEED){
			speed /= 2;// applying ratio
		}else{
			speed /= 6;
		}
		speed /= 10;// converted in minecraft speed
		if (speed > 0.695D && ((Locomotive) entity).isAttached) {
			return 0.912D;// max speed when carts are attached
		}
		return speed;
	}
}
