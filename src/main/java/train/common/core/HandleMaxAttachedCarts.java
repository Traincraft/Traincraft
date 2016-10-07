package train.common.core;

import net.minecraft.entity.Entity;
import train.common.api.Locomotive;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;

/**
 * Power is not limited to 1000 anymore. Power is shared between locomotives in a train.
 * 
 * Speed: MaxSpeed-= (totalMass/(power/400));
 * 
 * Then fuel rate: fuelRate -= (int) (scaledPower * totalMass*100)
 * 
 * Power is scaled again to fit the acceleration/brake values
 * scaledPower = (totalMass/(power/200));
 * Then
 * scaledPower = scalePower(scaledPower)
 * scalePower() => (power/1000)*0.8
 * 
 * Then acceleration: accelerate-=ScaledPower*Mass
 * 
 * Then brake: brake+=ScaledPower*Mass
 * 
 */
public class HandleMaxAttachedCarts {
	
	public HandleMaxAttachedCarts() {

	}

	/**
	 * handles the physic for the locomotive speed, acceleration, brake and fuel consumption depending of the carts attached to it
	 */
	public void PullPhysic(Entity cart1) {
		double totalMass = 0;
		if (((EntityRollingStock) cart1).train != null && ((EntityRollingStock) cart1).train.getTrains().size() != 0) {
			for (int j1 = 0; j1 < ((EntityRollingStock) cart1).train.getTrains().size(); j1++) {
				AbstractTrains entity = ((EntityRollingStock) cart1).train.getTrains().get(j1);
				totalMass += entity.mass;
			}
			((Locomotive) cart1).currentNumCartsPulled = ((EntityRollingStock) cart1).train.getTrains().size() - 1;
			((Locomotive) cart1).currentMassPulled = Math.round(totalMass * 10000);
			((Locomotive) cart1).currentMassPulled/=1000;
		}
		else {
			totalMass = 0;
			((Locomotive) cart1).currentNumCartsPulled = 0;
			((Locomotive) cart1).currentMassPulled = 0;
		}
		/**
		 * Speed is scaled by the mass of carts pulled and the power of the locomotive Power is converted before this calculation MaxSpeed-=exp((Power*Mass)/2)
		 */

		double power = 0;
		if (((EntityRollingStock) cart1).train != null && ((EntityRollingStock) cart1).train.getTrains().size() != 0 && ((EntityRollingStock) cart1).train.getTrains().size()>1){
			power = ((Locomotive) cart1).getPower();
			for (int i = 0; i < ((EntityRollingStock) cart1).train.getTrains().size(); i++) {
				EntityRollingStock stock = ((EntityRollingStock) cart1).train.getTrains().get(i);
				if(stock!=null && stock instanceof Locomotive && stock.uniqueID != ((EntityRollingStock)cart1).uniqueID){
					power += ((Locomotive)stock).getPower();
				}
			}
			//power = ((Locomotive) cart1).getPower();//((EntityRollingStock) cart1).train.getTrainPower();
			double maxSpeed = ((Locomotive) cart1).getMaxSpeed();// reset speed and get default

			maxSpeed -= (totalMass/(power/400));
			if (maxSpeed > 0) {// if maxSpeed=0 then default is used: not good here! and we don't want negative speed
				((Locomotive) cart1).setCustomSpeed(maxSpeed);
			}else{
				((Locomotive) cart1).setCustomSpeed(0.1);
			}
			((Locomotive) cart1).currentSpeedSlowDown = (totalMass/(power/400));
			//System.out.println("mass "+totalMass +" power "+power +" "+cart1 );
			
		}else if (((Locomotive) cart1).train == null || ((Locomotive) cart1).train.getTrains().size() < 2) {
			double maxSpeed = ((Locomotive) cart1).getMaxSpeed();
			((Locomotive) cart1).setCustomSpeed(maxSpeed);
			((Locomotive) cart1).currentSpeedSlowDown = 0;
		}

		/**
		 * acceleration is scaled by the mass of carts pulled and the power of the locomotive Power is converted and scaled before this calculation accelerate-=ScaledPower*Mass
		 */
		double scaledPower = (totalMass/(power/200));//(power*totalMass)/(power*6);//scalePower(power);
		scaledPower = scalePower(scaledPower);
		double accelerate = ((Locomotive) cart1).setAccel(0);// reset acceleration and get default
		if((power * totalMass)>0)accelerate -= (scaledPower * totalMass * 1.13);
		if (accelerate > 0) {// if accelerate=0 then default is used: not good here! and we don't want negative acceleration
			((Locomotive) cart1).setAccel(accelerate);
		}
		if((power * totalMass)>0){
			((Locomotive) cart1).currentAccelSlowDown = (scaledPower * (totalMass * 1.13));
		}else{
			((Locomotive) cart1).currentAccelSlowDown =0;
		}


		/**
		 * brake is scaled by the mass of carts pulled and the power of the locomotive Power is converted and scaled before this calculation brake+=ScaledPower*Mass
		 */
		double brake = ((Locomotive) cart1).setBrake(0);// reset brake and get default
		brake += (scaledPower * totalMass);
		if (brake > 1)
			brake = 0.998;
		if (brake > 0) {// if accelerate=0 then default is used: not good here! and we don't want negative brake or brake values higher than 1 (which mean acceleration)
			if((power * totalMass)>0)((Locomotive) cart1).setBrake(brake);
		}
		if((power * totalMass)>0){
			((Locomotive) cart1).currentBrakeSlowDown = (scaledPower * (totalMass));
		}else{
			((Locomotive) cart1).currentBrakeSlowDown = 0;
		}


		/**
		 * fuel consumption is scaled by the mass of carts pulled and the power of the locomotive Power is converted before this calculation fuelRate-=power*Mass
		 */

		int fuelRate = ((Locomotive) cart1).setFuelConsumption(0);// reset and get default
		fuelRate -= (int) (scaledPower * totalMass*100);
		//if((power * totalMass)>0)System.out.println(cart1+"fuelRate "+fuelRate);
		if (fuelRate > 0) {// if fuelRate=0 then default is used: not good here! and we don't want negative fuelRate
			((Locomotive) cart1).setFuelConsumption(fuelRate);
		}
		if((power * totalMass)>0){
			((Locomotive) cart1).currentFuelConsumptionChange = (fuelRate);
		}else{
			((Locomotive) cart1).currentFuelConsumptionChange=0;
		}


	}

	/**
	 * Possible values: from 0 to 1000 example: power=800 800/1000=0.8 1-0.8=0.2 return 0.2
	 * 
	 * @param power
	 * @return
	 */
	@Deprecated
	private double convertPower(double power) {
		power /= 1000;
		power = 1 - power;

		return power;

	}

	/**
	 * Used to scale power for calculation like Brake and Acceleration rates
	 * 
	 * @return
	 */
	private double scalePower(double power) {
		power /= 1000;
		power *= 0.8;
		return power;

	}

}