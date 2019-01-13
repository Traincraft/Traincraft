package train.common.api;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.core.handlers.ConfigHandler;

public class SpeedHandler {

	public static float handleSpeed(float railMaxSpeed, float maxSpeed, Entity entity) {
		// System.out.println("Rail: " + railMaxSpeed);
		// System.out.println("Max: " + maxSpeed);
		if(entity instanceof Locomotive) {
			if (railMaxSpeed >= 0.4f) {
				return convertSpeed(entity, maxSpeed);
			} else {
				return convertSpeed(entity, maxSpeed);
			}
		}else {
			return 15;
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
	private static float convertSpeed(Entity entity, float maxSpeed) {
		float speed = ((Locomotive) entity).getMaxSpeed()*0.28f;// speed is in m/s
		if(ConfigHandler.REAL_TRAIN_SPEED){
			speed /= 2f;// applying ratio
		}else{
			speed /= 6f;
		}
		speed /= 10;// converted in minecraft speed
		//if (speed > 0.912f && ((Locomotive) entity).isAttached) {
		//	return 0.912f;// max speed when carts are attached
		//}
		return speed;
	}
}
