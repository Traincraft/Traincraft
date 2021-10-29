package train.common.items;

import com.mojang.authlib.GameProfile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.core.items.IMinecartItem;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.*;
import train.common.core.handlers.ConfigHandler;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.items.ItemTCRail.TrackTypes;
import train.common.library.BlockIDs;
import train.common.library.EnumTrains;
import train.common.library.Info;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.List;

public class ItemRollingStock extends ItemMinecart implements IMinecart, IMinecartItem {

	private String iconName = "";
	private String trainName;
	private String trainCreator;
	private int trainColor = -1;

	public ItemRollingStock(String iconName) {
		super(1);
		this.iconName = iconName;
		maxStackSize = 1;
		trainName = this.getUnlocalizedName();
		setCreativeTab(Traincraft.tcTab);
	}

	public int setNewUniqueID(ItemStack stack, EntityPlayer player, int numberOfTrains) {
		NBTTagCompound var3 = stack.getTagCompound();
		if (numberOfTrains <= 0) {
			numberOfTrains = AbstractTrains.uniqueIDs++;
		}
		else {
			AbstractTrains.uniqueIDs = numberOfTrains++;
		}
		if (var3 == null) {
			var3 = new NBTTagCompound();
			stack.setTagCompound(var3);
		}
		stack.getTagCompound().setInteger("uniqueID", numberOfTrains);
		stack.getTagCompound().setString("trainCreator", player.getDisplayName());
		return numberOfTrains;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		if (par1ItemStack.hasTagCompound()) {
			NBTTagCompound var5 = par1ItemStack.getTagCompound();
			trainCreator = var5.getString("trainCreator");
			/*if (id > 0)
				par3List.add("\u00a77" + "ID: " + id);*/
			if (trainCreator.length() > 0) {
				par3List.add("\u00a77" + "Creator: " + trainCreator);
			}
			int color = var5.getInteger("trainColor");
			if (var5.hasKey("trainColor") && color <= 16) {
				par3List.add("\u00a77" + "Color: " + AbstractTrains.getColorAsString(color));
			}

		}
		double mass = getMass();
		int power = getMHP();
		int maxSpeed = getMaxSpeed();
		String additionnalInfo = getAdditionnalInfo();
		if (getTrainType().length() > 0) {
			par3List.add("\u00a77" + "Type: " + getTrainType());
		}
		if (power > 0) {
			par3List.add("\u00a77" + "Power: " + power + " Mhp");
		}
		if (mass != 0) {
			par3List.add("\u00a77" + "Mass: " + (mass * 10));
		}
		if (maxSpeed > 0) {
			par3List.add("\u00a77" + "Max Speed: " + maxSpeed);
		}
		if(getCargoCapacity()>0){
			par3List.add("\u00a77" + "Slots: "+getCargoCapacity());
		}
		/*if(additionnalInfo!=null){
			for(String info : additionnalInfo){
				par3List.add("\u00a77" + info);
			}
		}*/
		if(getAdditionnalInfo()!=null){
			par3List.add("\u00a77" + getAdditionnalInfo());
		}
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	public String getTrainType() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getTrainType();
			}
		}
		return "";
	}
	public double getMass() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getMass();
			}
		}
		return 0;
	}
	public int getMaxSpeed() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getMaxSpeed();
			}
		}
		return 0;
	}
	public int getMHP() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getMHP();
			}
		}
		return 0;
	}
	public String getAdditionnalInfo() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getAdditionnalTooltip();
			}
		}
		return null;
	}
	public int getCargoCapacity() {
		for(EnumTrains trains : EnumTrains.values()){
			if(trains.getItem() == this){
				return trains.getCargoCapacity();
			}
		}
		return 0;
	}
	public String getTrainName() {
		return trainName;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int meta = par3World.getBlockMetadata(par4, par5, par6);
		TileEntity tileentity = par3World.getTileEntity(par4, par5, par6);
		//System.out.println(meta);
		if (par3World.isRemote) {
			return false;
		}
		if(tileentity!=null && tileentity instanceof TileTCRail){
			TileTCRail tile = (TileTCRail) tileentity;
			if (tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_1.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_2.getLabel())
					|| tile.getType().equals(TrackTypes.CONCRETE_SMALL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.SUPER_LONG.getLabel())  ) {
				this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
				return true;
			}
			par2EntityPlayer.addChatMessage(new ChatComponentText("Place me on a straight piece of track !"));
			return false;
		}else
		if(tileentity!=null && tileentity instanceof TileTCRailGag){
			TileTCRailGag tileGag = (TileTCRailGag) tileentity;
			TileTCRail tile = (TileTCRail) par3World.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
			if(tile!=null && tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel()) || tile.getType().equals((TrackTypes.SUPER_LONG))){
				this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
				return true;
			}
			par2EntityPlayer.addChatMessage(new ChatComponentText("Place me on a straight piece of track !"));
			return false;
		}else
		if (TraincraftUtil.isRailBlockAt(par3World, par4, par5, par6) && (meta < 2 || meta > 5)) {
			this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
			return true;
		}
		else {
			return false;
		}
	}

	public EntityMinecart placeCart(EntityPlayer player, ItemStack itemstack, World world, int i, int j, int k) {
		EntityRollingStock rollingStock = null;
		for(EnumTrains train : EnumTrains.values()){
			if(train.getItem() == itemstack.getItem()){
				//System.out.println(train.getItem().getUnlocalizedName());
				//System.out.println(world!=null);
				rollingStock = (EntityRollingStock) train.getEntity(world, i + 0.5F, j + 0.5F, k + 0.5F);
				if(train.getColors()!=null){
					if(rollingStock != null){
						//rollingStock.setColor(AbstractTrains.getColorFromString(train.getColors()[0]));
						rollingStock.setColor((train.getColors()[0]));
					}
				}

				break;
			}
		}
		if (rollingStock != null) {
			if (!world.isRemote) {

				if((rollingStock instanceof SteamTrain && !ConfigHandler.ENABLE_STEAM) || (rollingStock instanceof ElectricTrain && !ConfigHandler.ENABLE_ELECTRIC) || (rollingStock instanceof DieselTrain && !ConfigHandler.ENABLE_DIESEL) || (rollingStock instanceof EntityTracksBuilder && !ConfigHandler.ENABLE_BUILDER) ||(rollingStock instanceof Tender && !ConfigHandler.ENABLE_TENDER)){
					if(player != null)player.addChatMessage(new ChatComponentText("This type of train has been deactivated by the OP"));
					rollingStock.setDead();
					return rollingStock;
				}

				int dir = 0;
				int meta = world.getBlockMetadata(i, j, k);
				if (player != null)
					dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
				//180 = 3 = EAST
				//0 = 0 = SOUTH
				//90 = 1 = WEST
				// -180 = 2 = NORTH
				// System.out.println("Direction: " + dir + " Meta: " + meta);
				if (dir == 2) {
					rollingStock.rotationYaw = 0;
					if(meta==0){
						rollingStock.serverRealRotation = -90;
					}else{
						rollingStock.serverRealRotation = 180;
					}
					if(world.getBlock(i, j, k)==BlockIDs.tcRail.block || world.getBlock(i, j, k)==BlockIDs.tcRailGag.block){
						if(meta==0 || meta == 2){
							rollingStock.rotationYaw = 90;
						}else{
							rollingStock.rotationYaw = 0;
						}
					}
					if(rollingStock instanceof Locomotive){
						if((world.getBlock(i, j, k-1)==BlockIDs.tcRail.block || world.getBlock(i, j, k-1)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k-1)))&&(world.getBlock(i, j, k-2)==BlockIDs.tcRail.block || world.getBlock(i, j, k-2)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k-2)))){
							if(meta==0 || meta == 2){
								rollingStock.serverRealRotation = -90;
							}
						}else{
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}
				if (dir == 1) {
					rollingStock.rotationYaw = 90;
					if(meta==1){
						rollingStock.serverRealRotation = 180;
					}else{
						rollingStock.serverRealRotation = -90;
					}
					if(world.getBlock(i, j, k)==BlockIDs.tcRail.block || world.getBlock(i, j, k)==BlockIDs.tcRailGag.block){
						if(meta==1 || meta == 3){
							rollingStock.rotationYaw = 0;
						}else{
							rollingStock.rotationYaw = 90;
						}
					}
					if(rollingStock instanceof Locomotive){
						if((world.getBlock(i-1, j, k)==BlockIDs.tcRail.block || world.getBlock(i-1, j, k)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i-1, j, k)))&&(world.getBlock(i-2, j, k)==BlockIDs.tcRail.block || world.getBlock(i-2, j, k)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i-2, j, k)))){
							if(meta==1 || meta == 3){
								rollingStock.serverRealRotation = 180;
							}
						}else{
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}
				if (dir == 0) {
					rollingStock.rotationYaw = -178.5F;
					if(meta == 0){
						rollingStock.serverRealRotation = 90;
					}else{
						rollingStock.serverRealRotation = 0;
					}
					if(world.getBlock(i, j, k)==BlockIDs.tcRail.block || world.getBlock(i, j, k)==BlockIDs.tcRailGag.block){
						if(meta==0 || meta == 2){
							rollingStock.rotationYaw = -90;
						}else{
							rollingStock.rotationYaw = 178.5F;
						}
					}
					if(rollingStock instanceof Locomotive){
						if((world.getBlock(i, j, k+1)==BlockIDs.tcRail.block || world.getBlock(i, j, k+1)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k+1)))&&(world.getBlock(i, j, k+2)==BlockIDs.tcRail.block || world.getBlock(i, j, k+2)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k+2)))){
							if(meta == 0 || meta == 2){
								rollingStock.serverRealRotation = 90;
							}
						}else{
							if(player!=null) {
								player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
								rollingStock.setDead();
								return rollingStock;
							} else {
								if(meta == 0 || meta == 2){
									rollingStock.serverRealRotation = 90;
								}
							}
						}
					}
				}
				if (dir == 3) {
					rollingStock.rotationYaw = 178.5F;
					if(meta==1){
						rollingStock.serverRealRotation = 0;
					}else{
						rollingStock.serverRealRotation = 90;
					}
					if(world.getBlock(i, j, k)==BlockIDs.tcRail.block || world.getBlock(i, j, k)==BlockIDs.tcRailGag.block){
						if(meta==1 || meta == 3){
							rollingStock.rotationYaw = 178.5F;
						} else {
							rollingStock.rotationYaw = 90;
						}
					}
					if(rollingStock instanceof Locomotive){
						if((world.getBlock(i+1, j, k)==BlockIDs.tcRail.block || world.getBlock(i+1, j, k)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i+1, j, k)))&&(world.getBlock(i+2, j, k)==BlockIDs.tcRail.block || world.getBlock(i+2, j, k)==BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i+2, j, k)))){
							if(meta == 1 || meta == 3){
								rollingStock.serverRealRotation = 0;
							}
						}else{
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}
				
				// System.out.println("ServerRealRotation: " + rollingStock.serverRealRotation + "
				// RotationYaw: "
				// + rollingStock.rotationYaw);

				rollingStock.trainType = ((ItemRollingStock) itemstack.getItem()).getTrainType();
				rollingStock.trainName = (itemstack.getItem()).getItemStackDisplayName(itemstack);
				if (player != null){
					rollingStock.trainOwner = player.getDisplayName();
				}
				rollingStock.mass = getMass();

				int uniID = -1;
				if (itemstack.hasTagCompound()) {
					NBTTagCompound var5 = itemstack.getTagCompound();
					uniID = var5.getInteger("uniqueID");
					if (uniID != -1)
						rollingStock.uniqueID = uniID;
					if (uniID != -1)
						rollingStock.getEntityData().setInteger("uniqueID", uniID);
					trainCreator = var5.getString("trainCreator");
					trainColor = var5.getInteger("trainColor");
					if (var5.hasKey("trainColor"))
						rollingStock.setColor(trainColor);
					rollingStock.trainCreator = trainCreator;
				}
				if (player != null)
					rollingStock.setInformation(((ItemRollingStock) itemstack.getItem()).getTrainType(), player.getDisplayName(), trainCreator, (itemstack.getItem()).getItemStackDisplayName(itemstack), uniID);
				if (player == null)
					rollingStock.setInformation(((ItemRollingStock) itemstack.getItem()).getTrainType(), "", trainCreator, (itemstack.getItem()).getItemStackDisplayName(itemstack), uniID);

				if (ConfigHandler.SHOW_POSSIBLE_COLORS && rollingStock.acceptedColors != null && rollingStock.acceptedColors.size() > 0) {
					String concatColors = ": ";
					for (int t = 0; t < rollingStock.acceptedColors.size(); t++) {
						if (!AbstractTrains.getColorAsString(rollingStock.acceptedColors.get(t)).equals("Empty")
								&& !AbstractTrains.getColorAsString(rollingStock.acceptedColors.get(t)).equals("Full"))
							concatColors = concatColors
									.concat(AbstractTrains.getColorAsString(rollingStock.acceptedColors.get(t)) + ", ");
					}
					if (concatColors.length() > 4) {
						if (player != null) {
							player.addChatMessage(new ChatComponentText("Possible colors" + concatColors));
							player.addChatMessage(new ChatComponentText("To paint, click me with the right (vanilla) dye"));
						}
					}
				}
				world.spawnEntityInWorld(rollingStock);
			}
			--itemstack.stackSize;
		}
		return rollingStock;
	}

	@Override
	public boolean canBePlacedByNonPlayer(ItemStack cart) {
		return true;
	}

	@Override
	public EntityMinecart placeCart(GameProfile owner, ItemStack cart, World world, int i, int j, int k) {
		return placeCart((EntityPlayer) null, cart, world, i, j, k);
	}

	@Override
	public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":trains/" + this.iconName);
	}
}
