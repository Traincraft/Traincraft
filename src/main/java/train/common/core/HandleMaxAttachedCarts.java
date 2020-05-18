package train.common.core;

import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

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
	public static void PullPhysic(Locomotive cart1) {
		double totalMass = 0;
		if (( cart1).train != null && ( cart1).train.getTrains().size() != 0) {
			for (int j1 = 0; j1 < ( cart1).train.getTrains().size(); j1++) {
				totalMass += ( cart1).train.getTrains().get(j1).mass;
			}
			(cart1).currentNumCartsPulled = (cart1).train.getTrains().size() - 1;
			( cart1).currentMassPulled = Math.round(totalMass * 10);
		}
		else {
			totalMass = 0;
			(cart1).currentNumCartsPulled = 0;
			( cart1).currentMassPulled = 0;
		}
		/**
		 * Speed is scaled by the mass of carts pulled and the power of the locomotive Power is converted before this calculation MaxSpeed-=exp((Power*Mass)/2)
		 */
		if(totalMass<0){
			totalMass=0;
		} else {
			totalMass*=0.745;
		}

		double power = 0;
		if ((cart1).train != null && (cart1).train.getTrains().size() != 0 && ( cart1).train.getTrains().size()>1){
			power = (cart1).getPower();
			for (int i = 0; i < ( cart1).train.getTrains().size(); i++) {
				EntityRollingStock stock = (cart1).train.getTrains().get(i);
				if(stock instanceof Locomotive && stock.uniqueID != (cart1).uniqueID){
					power += ((Locomotive)stock).getPower();
				}
			}
			//power = ((Locomotive) cart1).getPower();//((EntityRollingStock) cart1).train.getTrainPower();
			double maxSpeed = (cart1).getMaxSpeed();// reset speed and get default

			maxSpeed -= totalMass==0?0:(totalMass/(power/74.57));
			if (maxSpeed > 0) {// if maxSpeed=0 then default is used: not good here! and we don't want negative speed
				(cart1).setCustomSpeed(maxSpeed);
			}else{
				(cart1).setCustomSpeed(0.1);
			}
			(cart1).currentSpeedSlowDown = totalMass==0?0:(totalMass/(power/74.57));
			//System.out.println("mass "+totalMass +" power "+power +" "+cart1 );
			
		}else if (( cart1).train == null || ( cart1).train.getTrains().size() < 2) {
			double maxSpeed = (cart1).getMaxSpeed();
			( cart1).setCustomSpeed(maxSpeed);
			(cart1).currentSpeedSlowDown = 0;
		}

		/**
		 * acceleration is scaled by the mass of carts pulled and the power of the locomotive Power is converted and scaled before this calculation accelerate-=ScaledPower*Mass
		 */
		double scaledPower = totalMass==0?0:(totalMass/(power/745.7));//(power*totalMass)/(power*6);//scalePower(power);
		scaledPower = scalePower(scaledPower);
		double accelerate = (cart1).setAccel(0);// reset acceleration and get default
		if((power * totalMass)>0){
			accelerate -= (scaledPower * totalMass * 1.13);
		}
		if (accelerate > 0) {// if accelerate=0 then default is used: not good here! and we don't want negative acceleration
			( cart1).setAccel(accelerate);
		}
		if((power * totalMass)>0){
			( cart1).currentAccelSlowDown = (scaledPower * (totalMass * 1.13));
		}else{
			( cart1).currentAccelSlowDown =0;
		}


		/**
		 * brake is scaled by the mass of carts pulled and the power of the locomotive Power is converted and scaled before this calculation brake+=ScaledPower*Mass
		 */
		double brake = ( cart1).setBrake(0);// reset brake and get default
		brake += (scaledPower * totalMass);
		if (brake > 1)
			brake = 0.998;
		if (brake > 0) {// if accelerate=0 then default is used: not good here! and we don't want negative brake or brake values higher than 1 (which mean acceleration)
			if((power * totalMass)>0)( cart1).setBrake(brake);
		}
		if((power * totalMass)>0){
			(cart1).currentBrakeSlowDown = (scaledPower * (totalMass));
		}else{
			( cart1).currentBrakeSlowDown = 0;
		}


		/**
		 * fuel consumption is scaled by the mass of carts pulled and the power of the locomotive Power is converted before this calculation fuelRate-=power*Mass
		 */

		int fuelRate = (cart1).setFuelConsumption(0);// reset and get default
		fuelRate -= (int) (scaledPower * totalMass*100);
		//if((power * totalMass)>0)System.out.println(cart1+"fuelRate "+fuelRate);
		if (fuelRate > 0) {// if fuelRate=0 then default is used: not good here! and we don't want negative fuelRate
			( cart1).setFuelConsumption(fuelRate);
		}
		if((power * totalMass)>0){
			( cart1).currentFuelConsumptionChange = (fuelRate);
		}else{
			(cart1).currentFuelConsumptionChange=0;
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
	private static double scalePower(double power) {
		if (power ==0){
			return 0;
		}
		power /= 1000;
		power *= 0.8;
		return power;

	}

}