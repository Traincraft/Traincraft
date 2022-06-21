/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.common.Traincraft;
import train.common.api.EntityBogie;
import train.common.core.EntityIds;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.library.EnumTrains;

public class EntityHandler {
	public static void init() {	
		EntityRegistry.registerModEntity(EntityZeppelinTwoBalloons.class, "zeppelin", EntityIds.ZEPPELIN, Traincraft.instance, 512, 1, true);//zepplin
		EntityRegistry.registerModEntity(EntityBogie.class, "Entity Front Bogie", EntityIds.LOCOMOTIVE_BOGIE, Traincraft.instance, 512, 1, true);//front bogie
		EntityRegistry.registerModEntity(EntityZeppelinOneBalloon.class, "zeppelin big", EntityIds.ZEPPELIN_BIG, Traincraft.instance, 512, 1, true);//zepplin big
		int trainID= 32;
		for(EnumTrains trains : EnumTrains.values()){
			EntityRegistry.registerModEntity(trains.getEntityClass(), trains.getInternalName(), trainID, Traincraft.instance, 512, 1, true);
			trainID++;
			if(trainID== 112 || trainID==51){
				trainID++;
			}
		}
	}

	public static Entity getEntityServer(World world, int entityId) {
		if ((world != null) && (world instanceof WorldServer)) {
			return ((WorldServer) world).getEntityByID(entityId);
		}
		return null;
	}
}