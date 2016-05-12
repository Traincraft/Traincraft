package src.train.common.entity.rollingStock;

import java.util.ArrayList;
import java.util.List;

import mods.railcraft.api.core.items.IToolCrowbar;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import paulscode.sound.SoundSystem;
import src.train.common.Traincraft;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.IPassenger;
import src.train.common.core.util.MP3Player;
import src.train.common.library.GuiIDs;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityJukeBoxCart extends EntityRollingStock {
	
	public MP3Player player = null;
	public boolean isPlaying = false;
	public boolean isInvalid = false;
	public String streamURL = "";
	private boolean streamWasStopped = false;
	Side side;
	public float volume = 1.0f;

	public EntityJukeBoxCart(World world) {
		super(world);
		dataWatcher.addObject(22, new String(streamURL));
		dataWatcher.addObject(23, new Integer(0));
		side = FMLCommonHandler.instance().getEffectiveSide();
	}

	public EntityJukeBoxCart(World world, double d, double d1, double d2) {
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
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote) {
			return true;
		}
		if(canBeDestroyedByPlayer(damagesource))return true;
		super.attackEntityFrom(damagesource, i);
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setBeenAttacked();
		setDamage(getDamage() + i * 10);
		if (getDamage() > 40) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
			}
			this.setDead();
			boolean flag = damagesource.getEntity() instanceof EntityPlayer && ((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode;
			if(!flag) {
				dropCartAsItem();
			}
		}
		return true;
	}
	
	@Override
	public void setDead() {
		this.stopStream();
		super.setDead();
		isDead = true;
		if (side == Side.CLIENT) {
			String s1 = "entity_" + this.getEntityId();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		updateTicks++;
		if (!worldObj.isRemote && this.updateTicks % 10 == 0) {
			this.dataWatcher.updateObject(22, streamURL);
			if (isPlaying) {
				this.dataWatcher.updateObject(23, 1);
			}
			else {
				this.dataWatcher.updateObject(23, 0);
			}
		}
		if (side == Side.CLIENT) {
			if (this.updateTicks % 10 == 0 && !this.isPlaying() && this.dataWatcher.getWatchableObjectInt(23) != 0) {
				this.streamURL = this.dataWatcher.getWatchableObjectString(22);
				this.startStream();
			}
			if ((Minecraft.getMinecraft().thePlayer != null) && (this.player != null) && (!isInvalid)) {
				float vol = (float) getDistanceSq(Minecraft.getMinecraft().thePlayer.posX, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ);
				if (vol > 1000.0F) {
					this.player.setVolume(0.0F);
				}
				else {
					float v2 = 10000.0F / vol / 100.0F;
					if (v2 > 1.0F) {
						this.player.setVolume(volume);
					}
					else {
						float v1 = 1.0f-volume;
						if(v2-v1 > 0) {
							v2 = v2 -v1;
						}
						else {
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
					worldObj.spawnParticle("note", (double) posX, (double) posY + 1.2D, (double) posZ, (double) random2 / 24.0D, 0.0D, 0.0D);
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

	public void startStream() {
		if (!this.isPlaying) {
			this.isPlaying = true;
			if (side == Side.CLIENT) {
				this.player = new MP3Player(this.streamURL, this.worldObj, this.getEntityId());
				Traincraft.proxy.playerList.add(this.player);
			}
		}
	}

	public void stopStream() {
		if (this.isPlaying) {
			if (side == Side.CLIENT && this.player != null) {
				this.player.stop();
				Traincraft.proxy.playerList.remove(this.player);
			}
			this.isPlaying = false;
		}
	}

	public boolean isPlaying() {
		return this.isPlaying;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		ItemStack var2 = entityplayer.inventory.getCurrentItem();
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (locked && !entityplayer.getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())) {
			if (!worldObj.isRemote)
				entityplayer.addChatMessage(new ChatComponentText("this train is locked"));
			return true;
		}
		
		entityplayer.openGui(Traincraft.instance, GuiIDs.JUKEBOX, worldObj, this.getEntityId(), -1, (int) this.posZ);
		return true;
	}
	

	@Override
	public List<ItemStack> getItemsDropped() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(ItemIDs.minecartJukeBoxCart.item));
		return items;
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
		float dist = 1.85F;
		return (dist);
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
		if (!worldObj.isRemote) {
			this.dataWatcher.updateObject(22, streamURL);
			if (isPlaying) {
				this.dataWatcher.updateObject(23, 1);
			}
			else {
				this.dataWatcher.updateObject(23, 0);
			}
		}
	}
}