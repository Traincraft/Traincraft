package train.entity.rollingStock;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemPaintBucket;
import ebf.tim.networking.PacketInteract;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import train.Traincraft;
import train.core.util.MP3Player;
import train.library.GuiIDs;

public class EntityJukeBoxCart extends GenericRailTransport {
	
	public boolean isPlaying = false;
	public boolean isInvalid = false;
	public String streamURL = "";
	private Side side;
	public float volume = 1.0f;
	public MP3Player player;

	public EntityJukeBoxCart(World world) {
		super(world);
		dataWatcher.addObject(22, streamURL);
		dataWatcher.addObject(23, 0);
		side = FMLCommonHandler.instance().getEffectiveSide();
	}

	public EntityJukeBoxCart(World world, double d, double d1, double d2) {
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
	public void setDead() {
		this.stopStream();
		super.setDead();
		isDead = true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!worldObj.isRemote && this.ticksExisted % 10 == 0) {
			this.dataWatcher.updateObject(22, streamURL);
			if (isPlaying) {
				this.dataWatcher.updateObject(23, 1);
			}
			else {
				this.dataWatcher.updateObject(23, 0);
			}
		}
		if (side == Side.CLIENT) {
			
			if (this.ticksExisted % 10 == 0 && !this.isPlaying() && this.dataWatcher.getWatchableObjectInt(23) != 0) {
				this.streamURL = this.dataWatcher.getWatchableObjectString(22);
				this.startStream();
			}
			if ((Minecraft.getMinecraft().thePlayer != null) && (this.player != null) && (!isInvalid)) {
				float vol = (float) getDistanceSq(Minecraft.getMinecraft().thePlayer.posX,
						Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ);
				if (vol >= (volume * 1000.0F)) {
					this.player.setVolume(0.0F);
				} else {
					float v2 = 10000.0F / vol / 100.0F;
//					System.out.println(vol);
					if (v2 > 1.0F) {
						this.player.setVolume(volume);
					} else {
						float v1 = 1.0f - volume;
						if (v2 - v1 > 0) {
							v2 = v2 - v1;
						} else {
							v2 = 0.0f;
						}
						this.player.setVolume(v2);
					}
				}
				if (vol == 0) {
					this.invalidate();
				}
				if (this.isPlaying && rand.nextInt(5) == 0 && (this.player != null && this.player.isPlaying())) {
					int random2 = rand.nextInt(24) + 1;
					worldObj.spawnParticle("note", posX, posY + 1.2D, posZ, random2 / 24.0D, 0.0D, 0.0D);
				}
			}
			
		}
	}

	/**
	 * server side
	 * 
	 * @param url
	 * @param playing
	 */
	public void recievePacket(String url, boolean playing) {
		this.streamURL = url;
		this.isPlaying = playing;
	}

	@SideOnly(Side.CLIENT)
	public void invalidate() {
		isInvalid = true;
		stopStream();
	}

	@SuppressWarnings("static-access")
	public void startStream() {
		
		if (!this.isPlaying) {
			this.isPlaying = true;
			if (side == Side.CLIENT) {
				this.player = new MP3Player(this.streamURL, this.worldObj, this.getEntityId());
				player.setVolume(0);
				Traincraft.proxy.playerList.add(this.player);
			}
		}
		
	}

	@SuppressWarnings("static-access")
	public void stopStream() {
		
		if (this.isPlaying) {
			this.isPlaying = false;
			if (side == Side.CLIENT && this.player != null) {
				this.player.stop();
				Traincraft.proxy.playerList.remove(this.player);
			}
		}
		
	}

	public boolean isPlaying() {
		return this.isPlaying;
	}

	@Override
	public boolean interact(int player, boolean isFront, boolean isBack, int key) {

		EntityPlayer p =((EntityPlayer)worldObj.getEntityByID(player));
		if (worldObj.isRemote) {
			if (p.getHeldItem() != null && p.getHeldItem().getItem() instanceof ItemPaintBucket) {
				p.openGui(Traincraft.instance, GuiIDs.JUKEBOX, worldObj, this.getEntityId(), -1, (int) this.posZ);
			}
			TrainsInMotion.keyChannel.sendToServer(new PacketInteract(key, getEntityId()));
		} else {
			super.interact(player,isFront,isBack,key);
		}
		return true;
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.85F;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setString("StreamUrl", this.streamURL);
		nbttagcompound.setBoolean("isPlaying", this.isPlaying());
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.streamURL = nbttagcompound.getString("StreamUrl");
		this.isPlaying = nbttagcompound.getBoolean("isPlaying");
		this.dataWatcher.updateObject(22, streamURL);
		if (isPlaying) {
			this.dataWatcher.updateObject(23, 1);
		} else {
			this.dataWatcher.updateObject(23, 0);
		}
	}
}