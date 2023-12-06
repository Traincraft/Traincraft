package train.common.items;

import com.mojang.authlib.GameProfile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.CommonUtil;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.core.items.IMinecartItem;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.*;
import train.common.core.handlers.ConfigHandler;
import train.common.core.util.DepreciatedUtil;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.items.ItemTCRail.TrackTypes;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import javax.annotation.Nullable;
import java.util.List;

public class ItemRollingStock extends ItemMinecart implements IMinecart, IMinecartItem {

	private String iconName = "";
	private final String trainName;
	private String trainCreator;

	private AbstractTrains entity=null;

	private AbstractTrains getEntity(){
		if(entity==null){
			entity=Traincraft.instance.traincraftRegistry.findTrainRecordByItem(this).getEntity(null);
		}
		return entity;
	}

	public ItemRollingStock(String iconName) {
		super(1);
		this.iconName = iconName;
		maxStackSize = 1;
		trainName = this.getUnlocalizedName();
		if(!ConfigHandler.SPLIT_CREATIVE) {
			setCreativeTab(Traincraft.tcTab);
		} else {
			setCreativeTab(Traincraft.tcTrainTab);
		}
	}

	public ItemRollingStock(String iconName, CreativeTabs tab) {
		super(1);
		this.iconName = iconName;
		maxStackSize = 1;
		trainName = this.getUnlocalizedName();
		setCreativeTab(tab);
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
			if (!trainCreator.isEmpty()) {
				par3List.add("\u00a77" + "Creator: " + trainCreator);
			}
			if (var5.hasKey("train_Color")) {
				par3List.add("\u00a77" + "Color: " + var5.getString("train_Color"));
			}

		}

		if(getEntity()!=null){
			//year is the tell for if the TC4.5 API was used in favor of 4.3's.
			if(!getEntity().transportYear().equals("")) {
				if (getEntity().transportYear() != null) {
					par3List.add(EnumChatFormatting.GRAY + t("menu.item.year") + ": " + getEntity().transportYear());
				}
				if(getEntity().transportcountry()!=null) {
					par3List.add(EnumChatFormatting.GRAY + t("menu.item.country") + ": " +
							t("menu.item." + getEntity().transportcountry().toLowerCase()));
				}
			}

			if(getEntity().transportFuelType()!=null && !getEntity().transportFuelType().equals("")) {
				par3List.add(EnumChatFormatting.RED + t("menu.item.fueltype") + ": " +
						t("menu.item."+getEntity().transportFuelType().toLowerCase()));
			}

			StringBuilder s = new StringBuilder();
			par3List.add(EnumChatFormatting.RED + t("menu.item.types")+":");
			if (getEntity() instanceof Locomotive){
				s.append(t("menu.item.locomotive")+", ");
				if(entity instanceof IPassenger){
					s.append(t("menu.item.passenger")+", ");
				}
				if(entity instanceof Freight){
					s.append(t("menu.item.freight")+", ");
				}
			} else {
				s.append(t("menu.item.rollingstock")+", ");
				if(entity instanceof IPassenger){
					s.append(t("menu.item.passenger")+", ");
				}
				if(entity instanceof Tender){
					s.append(t("menu.item.tender")+", ");
				} else if(entity instanceof LiquidTank){
					s.append(t("menu.item.tanker")+", ");
				}
				if(entity instanceof AbstractWorkCart){
					s.append(t("menu.item.workcart")+", ");
				}
				if(entity instanceof Freight){
					s.append(t("menu.item.freight")+", ");
				}
			}
			s.delete(s.lastIndexOf(", "),s.length());

			par3List.add(EnumChatFormatting.RED +s.toString());

			par3List.add(EnumChatFormatting.GREEN + t("menu.item.weight") +": " + getEntity().weightKg() + "kg");
			if (getEntity().transportTopSpeed()!=0){
				par3List.add(EnumChatFormatting.GREEN + t("menu.item.speed") +": " + getEntity().transportTopSpeed() +" km/h");

				if (getEntity().transportMetricHorsePower() !=0){
					par3List.add(EnumChatFormatting.GREEN +t("menu.item.mhp") +": " + getEntity().transportMetricHorsePower());
				}
				if (getEntity().transportTractiveEffort() != 0){
					par3List.add(EnumChatFormatting.GREEN + t("menu.item.tractiveeffort") +": " + getEntity().transportTractiveEffort() + " lbf");
				}
			}
			if(getEntity().getInventoryRows()>0){
				par3List.add(EnumChatFormatting.BLUE +t("menu.item.isizeof")+ ": " + (getEntity().getInventoryRows()*9) + " " + t("menu.item.slots"));
			}
			if(getEntity().getRiderOffsets()!=null){
				par3List.add(EnumChatFormatting.BLUE +t("menu.item.seats")+ ": " + getEntity().getRiderOffsets().length);
			}
			if (getEntity().isFictional()){
				par3List.add(EnumChatFormatting.WHITE +t("menu.item.fictional"));
			}
			if (getEntity().additionalItemText()!=null){
				for (String a : getEntity().additionalItemText()) {
					if(!a.equals("")) {
						par3List.add(EnumChatFormatting.LIGHT_PURPLE + a);
					}
				}
			}
		}

	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	public String getTrainType() {
		return Traincraft.instance.traincraftRegistry.findTrainRecordByItem(this).getTrainType();
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
			if (tile.getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel())
					||tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.VERY_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_1.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_2.getLabel())
					|| tile.getType().equals(TrackTypes.SMALL_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.MEDIUM_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT.getLabel())

			)
			{
				this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
				return true;
			}

			par2EntityPlayer.addChatMessage(new ChatComponentText("Place me on a straight piece of track !"));
			return false;
		}
		else if(tileentity!=null && tileentity instanceof TileTCRailGag){

			TileTCRailGag tileGag = (TileTCRailGag) tileentity;
			TileTCRail tile = (TileTCRail) par3World.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);

			if(tile!=null  && (tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.VERY_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.MEDIUM_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT.getLabel())
					|| tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT.getLabel()))){
				if (tile.getTrackType().getLabel().contains("DIAGONAL")){
					if (tileGag.canPlaceRollingstock == true) {
						this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
						return true;
					}
					else {
					par2EntityPlayer.addChatMessage(new ChatComponentText("Place me on the middle of the track! (also try replacing old tracks if that does not work)"));
					return false;
					}

				}


				this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
				return true;
			}
			par2EntityPlayer.addChatMessage(new ChatComponentText("Place me on a straight piece of track !"));
			return false;
		}
		else if (TraincraftUtil.isRailBlockAt(par3World, par4, par5, par6) && (meta < 2 || meta > 5)) {
			this.placeCart(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
			return true;
		}
		else {
			return false;
		}
	}

	public EntityMinecart placeCart(EntityPlayer player, ItemStack itemstack, World world, int i, int j, int k) {
		EntityRollingStock rollingStock = null;
		TrainRecord train = Traincraft.instance.traincraftRegistry.findTrainRecordByItem(itemstack.getItem());
		if (train != null) {
			rollingStock = (EntityRollingStock) train.getEntity(world, i + 0.5F, j + 0.2F, k + 0.5F);
			if (train.getLiveries().size()>0) {
				if (rollingStock != null) {
					//rollingStock.setColor(AbstractTrains.getColorFromString(train.getColors()[0]));
					rollingStock.setColor((train.getLiveries().get(0)));
				}
			}
		}
		if (rollingStock != null) {
			if (!world.isRemote) {

				if ((rollingStock instanceof SteamTrain && !ConfigHandler.ENABLE_STEAM) || (rollingStock instanceof ElectricTrain && !ConfigHandler.ENABLE_ELECTRIC) || (rollingStock instanceof DieselTrain && !ConfigHandler.ENABLE_DIESEL) || (rollingStock instanceof EntityTracksBuilder && !ConfigHandler.ENABLE_BUILDER) || (rollingStock instanceof Tender && !ConfigHandler.ENABLE_TENDER)) {
					if (player != null)
						player.addChatMessage(new ChatComponentText("This type of train has been deactivated by the OP"));
					rollingStock.setDead();
					return rollingStock;
				}

				int dir = 0;
				int meta;
				if (world.getBlock(i, j, k) instanceof BlockRailBase) {
					meta = ((BlockRailBase) world.getBlock(i, j, k)).getBasicRailMetadata(world, rollingStock, i, j, k);
				} else {
					meta = world.getBlockMetadata(i, j, k);
				}

				if (player != null)
					dir = MathHelper.floor_double((player.rotationYaw * 8F) / 360F + 0.5D) & 7;
				// 0    = 0 = SOUTH
				// 45   = 1 = SOUTH-WEST
				// 90   = 2 = WEST
				// 135  = 3 = NORTH-WEST
				// 180  = 4 = NORTH
				// -135 = 5 = NORTH-EAST
				// -90  = 6 = EAST
				// -45  = 7 = SOUTH-EAST


				if (dir == 0) {

					rollingStock.rotationYaw = 180; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = 90; // RIGHT
					}
					else {
						rollingStock.serverRealRotation = 0; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {

						if (meta == 0 || meta == 2) {
							rollingStock.rotationYaw = -90; // LEFT
						}
						else if (meta == 6 || meta == 4) {
							rollingStock.rotationYaw = -45; // LEFT
						}
						else if (meta == 5 || meta == 7){
							rollingStock.rotationYaw = -135;
						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie) {
						if ((meta == 2 || meta == 0) && (world.getBlock(i, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 1))) && (world.getBlock(i, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 2)))) {
							rollingStock.serverRealRotation = 90;
						} else if ((meta == 6 || meta == 4) && (world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k + 1))) && (world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k + 2)))) {
							rollingStock.serverRealRotation = 135; //RIGHT
						} else if ((meta == 5 || meta == 7) && (world.getBlock(i + 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k + 1))) && (world.getBlock(i + 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k + 2)))) {
							rollingStock.serverRealRotation = 45;
						} else {
							if (player != null) {
								player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
								rollingStock.setDead();
								return rollingStock;
							}


						}
					}

				}

				if (dir == 1) {
					rollingStock.rotationYaw = -135; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = 90; // RIGHT
					}
					else {
						rollingStock.serverRealRotation = 180; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 6 || meta == 4) {
							rollingStock.rotationYaw = -45; // LEFT
						} else if (meta == 2 || meta == 0) {
							rollingStock.rotationYaw = -90; // LEFT
						} else if (meta == 1 || meta == 3) {
							rollingStock.rotationYaw = 0; // LEFT
						} else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie ) {
						if ((meta == 2 || meta == 0) && (world.getBlock(i, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 1))) && (world.getBlock(i, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 2)))) {
							rollingStock.serverRealRotation = 90;
						} else if ((meta == 1 || meta == 3) && (world.getBlock(i - 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k))) && (world.getBlock(i - 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k)))) {
							rollingStock.serverRealRotation = 180;

						} else if ((meta == 6 || meta == 4) && (world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k + 1))) && (world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k + 2)))) {
							rollingStock.serverRealRotation = 135; //RIGHT
						} else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}

				if (dir == 2) {
					rollingStock.rotationYaw = -90; //BACK
					if (meta == 1) {
						rollingStock.serverRealRotation = 180; //RIGHT
					} else {
						rollingStock.serverRealRotation = 90; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 1 || meta == 3){
							rollingStock.rotationYaw = 0; // LEFT
						}
						else if(meta == 5 || meta == 7){
							rollingStock.rotationYaw = 45;
						}
						else if (meta == 6 || meta == 4){
							rollingStock.rotationYaw = -45;

						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie) {
						if ((meta == 1 || meta == 3) && (world.getBlock(i - 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k))) && (world.getBlock(i - 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k)))) {
							rollingStock.serverRealRotation = 180; //RIGHT
						}
						else if ((meta == 5 || meta == 7) && (world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k - 1))) && (world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k - 2)))) {
							rollingStock.serverRealRotation = -135;
						}
						else if ((meta == 6 || meta == 4) && (world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k + 1))) && (world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k + 2)))) {
							rollingStock.serverRealRotation = 135;
						}

						else {
						player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
						rollingStock.setDead();
						return rollingStock;
						}
					}
				}

				if (dir == 3) {
					rollingStock.rotationYaw = -45; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = -90; // RIGHT
					} else {
						rollingStock.serverRealRotation = 180; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 5 || meta == 7) {
							rollingStock.rotationYaw = 45; // LEFT
						}
					 	else if (meta == 2 || meta == 0) {
							rollingStock.rotationYaw = 90;
					    }
						else if (meta == 1 || meta == 3){
							rollingStock.rotationYaw = 0; // LEFT
						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie) {
						if ((meta == 5 || meta == 7) && (world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k - 1))) && (world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k - 2)))) {
							rollingStock.serverRealRotation = -135; //RIGHT
						}
					    else if ((meta == 2 || meta == 0) && (world.getBlock(i, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 1))) && (world.getBlock(i, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 2)))) {rollingStock.serverRealRotation = 90;
							rollingStock.serverRealRotation = -90;
						}
						else if ((meta == 1 || meta == 3) && (world.getBlock(i - 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k))) && (world.getBlock(i - 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k)))) {
							rollingStock.serverRealRotation = 180; //RIGHT
						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}

				if (dir == 4) {
					rollingStock.rotationYaw = 0; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = -90; // RIGHT
					} else {
						rollingStock.serverRealRotation = 180; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 0 || meta == 2) {
							rollingStock.rotationYaw = 90; // LEFT
						}
						else if (meta == 5 || meta == 7) {
							rollingStock.rotationYaw = 45; // LEFT
						}
						else if (meta == 6 || meta == 4){
							rollingStock.rotationYaw = 135;
						}

						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}

					}

					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie) {
						if ((meta == 0 || meta == 2) && (world.getBlock(i, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k - 1))) && (world.getBlock(i, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k - 2)))) {
							rollingStock.serverRealRotation = -90; // RIGHT
						}
						else if ((meta == 5 || meta == 7) && (world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k - 1))) && (world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k - 2)))) {
							rollingStock.serverRealRotation = -135; //RIGHT
						}
						else if ((meta == 6 || meta == 4) && (world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k + 1))) && (world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k + 2)))) {
							rollingStock.serverRealRotation = -45;
						}else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}

				if (dir == 5) {
					rollingStock.rotationYaw = 45; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = -90; // RIGHT
					} else {
						rollingStock.serverRealRotation = 0; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 6 || meta == 4) {
							rollingStock.rotationYaw = 135; // LEFT
						}
						else if (meta == 0 || meta == 2) {
							rollingStock.rotationYaw = 90; // LEFT
						}
						else if (meta == 1 || meta == 3){
							rollingStock.rotationYaw = 178.5f; // LEFT
						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof  ISecondBogie) {
						if ((meta == 6 || meta == 4) && (world.getBlock(i + 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k - 1))) && (world.getBlock(i + 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k - 2)))) {
							rollingStock.serverRealRotation = -45; //RIGHT
						}
						else if ((meta == 1 || meta == 3) && (world.getBlock(i + 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k))) && (world.getBlock(i + 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k)))) {
							rollingStock.serverRealRotation = 0; //RIGHT
						}
						else if ((meta == 0 || meta == 2) && (world.getBlock(i, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k - 1))) && (world.getBlock(i, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k - 2)))) {
							rollingStock.serverRealRotation = -90; // RIGHT
						}else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}

				if (dir == 6) {
					rollingStock.rotationYaw = 90; // BACK
					if (meta == 1) {
						rollingStock.serverRealRotation = 0; // RIGHT
					} else {
						rollingStock.serverRealRotation = -90; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 1 || meta == 3) {
							rollingStock.rotationYaw = -178.5f; // LEFT
						}
						else if (meta == 6 || meta == 4) {
							rollingStock.rotationYaw = 135; // LEFT
						}
						else if (meta == 5 || meta == 7) {
							rollingStock.rotationYaw = -135; // LEFT
						}else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof ISecondBogie) {
						if ((meta == 1 || meta == 3) && (world.getBlock(i + 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k))) && (world.getBlock(i + 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k)))) {
							rollingStock.serverRealRotation = 0; //RIGHT
						} else if ((meta == 5 || meta == 7) && (world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i - 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 1, j, k - 1))) && (world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i - 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i - 2, j, k - 2)))) {
							rollingStock.serverRealRotation = 45; //RIGHT
						}
						else if ((meta == 6 || meta == 4) && (world.getBlock(i + 1, j, k - 1) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k - 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k - 1))) && (world.getBlock(i + 2, j, k - 2) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k - 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k - 2)))) {
							rollingStock.serverRealRotation = -45; //RIGHT
						}else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
				}

				if (dir == 7) {
					rollingStock.rotationYaw = 135; // BACK
					if (meta == 0) {
						rollingStock.serverRealRotation = 90; // RIGHT
					} else {
						rollingStock.serverRealRotation = 0; // FRONT
					}
					if (world.getBlock(i, j, k) == BlockIDs.tcRail.block || world.getBlock(i, j, k) == BlockIDs.tcRailGag.block) {
						if (meta == 5 || meta == 7) {
							rollingStock.rotationYaw = -135; // LEFT
						}
						else if (meta == 1 || meta == 3) {
							rollingStock.rotationYaw = -178.5f; // LEFT
						}
						else if (meta == 0 || meta == 2) {
							rollingStock.rotationYaw = -90; // LEFT
						}
						else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}
					}
					if (rollingStock instanceof Locomotive || rollingStock instanceof  ISecondBogie) {
						if ((meta == 5 || meta == 7) && (world.getBlock(i + 1, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k + 1))) && (world.getBlock(i + 2, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k + 2)))) {
							rollingStock.serverRealRotation = 45; //RIGHT
						}
						else if ((meta == 1 || meta == 3) && (world.getBlock(i + 1, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 1, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 1, j, k))) && (world.getBlock(i + 2, j, k) == BlockIDs.tcRail.block || world.getBlock(i + 2, j, k) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i + 2, j, k)))) {
							rollingStock.serverRealRotation = 0; //RIGHT
						}
						else if ((meta == 0 || meta == 2) && (world.getBlock(i, j, k + 1) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 1) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 1))) && (world.getBlock(i, j, k + 2) == BlockIDs.tcRail.block || world.getBlock(i, j, k + 2) == BlockIDs.tcRailGag.block || BlockRailBase.func_150051_a(world.getBlock(i, j, k + 2)))) {
							rollingStock.serverRealRotation = 90; // RIGHT
						}else {
							player.addChatMessage(new ChatComponentText("Place me on a straight piece of track!"));
							rollingStock.setDead();
							return rollingStock;
						}

					}
				}



					rollingStock.trainType = ((ItemRollingStock) itemstack.getItem()).getTrainType();
					rollingStock.trainName = (itemstack.getItem()).getItemStackDisplayName(itemstack);
					if (player != null) {
						rollingStock.trainOwner = player.getDisplayName();
					}
					rollingStock.mass = rollingStock.weightKg();

					int uniID = -1;
					if (itemstack.hasTagCompound()) {
						NBTTagCompound var5 = itemstack.getTagCompound();
						uniID = var5.getInteger("uniqueID");
						if (uniID != -1)
							rollingStock.uniqueID = uniID;
						if (uniID != -1)
							rollingStock.getEntityData().setInteger("uniqueID", uniID);
						trainCreator = var5.getString("trainCreator");
						if (var5.hasKey("train_Color"))
							rollingStock.setColor(var5.getString("train_Color"));
						rollingStock.trainCreator = trainCreator;
						if (var5.hasKey("overlayTextureConfigTag")) // Import overlay configuration from NBT and apply it to the entity.
							rollingStock.getOverlayTextureContainer().importFromConfigTag(var5.getCompoundTag("overlayTextureConfigTag"));
					}
					if (player != null)
						rollingStock.setInformation(((ItemRollingStock) itemstack.getItem()).getTrainType(), player.getDisplayName(), trainCreator, (itemstack.getItem()).getItemStackDisplayName(itemstack), uniID);
					if (player == null)
						rollingStock.setInformation(((ItemRollingStock) itemstack.getItem()).getTrainType(), "", trainCreator, (itemstack.getItem()).getItemStackDisplayName(itemstack), uniID);

					if (ConfigHandler.SHOW_POSSIBLE_COLORS && rollingStock.getSpec().getLiveries().size()>0) {
						String concatColors = ": ";
						for (int t = 0; t < rollingStock.getSpec().getLiveries().size(); t++) {
							if (!rollingStock.getSpec().getLiveries().get(t).equals("Empty")
									&& !rollingStock.getSpec().getLiveries().get(t).equals("Full"))
								concatColors+=rollingStock.getSpec().getLiveries().get(t)+", ";
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
			}
				--itemstack.stackSize;


		return rollingStock;
	}


	public static ItemStack setPersistentData(@Nullable ItemStack oldStack, @Nullable AbstractTrains train, @Nullable Integer trainID, @Nullable String player, @Nullable String creator, String color) {

		ItemStack stack = oldStack;

		if (train != null){
			TrainRecord trainRecord = Traincraft.instance.traincraftRegistry.getTrainRecord(train.getClass());
			if (trainRecord != null) {
				stack = (new ItemStack(trainRecord.getItem()));
			}
		}
		if(stack!=null) {
			NBTTagCompound tag = stack.getTagCompound();
			if(tag==null){
				tag=new NBTTagCompound();
			}
			if(train!=null) {
				tag.setString("puuid", train.getPersistentUUID());
				tag.setString("trainCreator", creator==null?train.getEntityData().getString("theCreator"):creator);
				if(player!=null && player.length()>1) {
					tag.setString("theOwner", player);
				}
				tag.setString("train_Color",color);
			} else {
				tag.setString("trainCreator", creator!=null && creator.length()>1?creator:"Creative");
			}
			tag.setInteger("uniqueID", trainID==null?AbstractTrains.uniqueIDs++:trainID);


			stack.setTagCompound(tag);
		} else {
			return null;//THIS SHOULD NEVER HAPPEN, but compensate anyway because java is stupid and forge is unreliable.
		}
		return stack;

	}

	private static String t(String translate){
		return translate==null?"":CommonUtil.translate(translate);
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
		this.itemIcon = iconRegister.registerIcon(this.iconName);
	}
}
