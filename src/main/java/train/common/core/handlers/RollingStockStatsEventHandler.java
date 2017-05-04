package train.common.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import train.common.api.AbstractTrains;

import java.util.ArrayList;

public class RollingStockStatsEventHandler {

	/**
	 * Stores the distance a player has done on this train
	 */
	private ArrayList<playerDistance> plDist = new ArrayList<playerDistance>();
	private AbstractTrains train;

	public RollingStockStatsEventHandler(AbstractTrains train) {
		this.train = train;
	}

	/**
	 * Calculates the distance this train has done if a player rides it, also calculates
	 */
	/* Ready for stats implement, unused for now** */
	public void trainDistance() {
		double xDist = train.prevPosX - train.posX;
		double yDist = train.prevPosY - train.posY;
		double zDist = train.prevPosZ - train.posZ;
		int var7 = Math.round(MathHelper.sqrt_double(xDist * xDist + yDist * yDist + zDist * zDist) * 100);
		train.trainDistanceTraveled += (var7);
		//System.out.println(trainDistanceTraveled);
		if (train.riddenByEntity != null && train.riddenByEntity instanceof EntityPlayer) {
			for (playerDistance d : plDist) {
				if (((EntityPlayer) train.riddenByEntity).getDisplayName().equals(d.getUsername())) {
					d.setDistance(d.getDistance() + (var7));
					//System.out.println(d.getDistance()+" "+((EntityPlayer)riddenByEntity).username);
					return;
				}
			}
			plDist.add(new playerDistance(((EntityPlayer) train.riddenByEntity).getDisplayName(), (var7)));
		}
	}

	/**
	 * just an object to register the distance a player has done
	 * 
	 */
	private class playerDistance {
		private String username;
		private double distance;

		private playerDistance(String username, double distance) {
			this.username = username;
			this.distance = distance;
		}

		protected double getDistance() {
			return distance;
		}

		protected String getUsername() {
			return username;
		}

		protected void setDistance(double distance) {
			this.distance = distance;
		}
	}

}
