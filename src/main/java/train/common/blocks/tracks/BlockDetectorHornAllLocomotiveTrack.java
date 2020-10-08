/**
 * A track that detects all instance of Locomotive
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import ebf.tim.entities.EntityTrainCore;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.AxisAlignedBB;
import train.common.library.EnumSounds;
import train.common.library.Info;
import train.common.library.Tracks;

import java.util.List;

public class BlockDetectorHornAllLocomotiveTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.HORN_ALL_LOCOMOTIVES;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof EntityTrainCore) {
			for (EnumSounds sounds : EnumSounds.values()) {
				if (sounds.getEntityClass() != null && !sounds.getHornString().equals("")&& sounds.getEntityClass().equals(this.getClass())) {
					cart.worldObj.playSoundAtEntity(cart, Info.resourceLocation + ":" + sounds.getHornString(), sounds.getHornVolume(), 1.0F);
				}
			}
			List entities = cart.worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(
					cart.posX-20,cart.posY-5,cart.posZ-20,
					cart.posX+20,cart.posY+5,cart.posZ+20));

			for(Object e : entities) {
				if(e instanceof EntityAnimal) {
					((EntityAnimal) e).setTarget(cart);
					((EntityAnimal) e).getNavigator().setPath(null, 0);
				}
			}
		}
	}

}
