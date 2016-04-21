package src.train.common.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import src.train.common.Traincraft;
import src.train.common.library.BlockIDs;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import src.train.common.tile.TileTCRail;
import src.train.common.tile.TileTCRailGag;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTCRail extends Item {
	private TrackTypes type;

	public enum TrackTypes {

		MEDIUM_TURN("MEDIUM_TURN", "TURN", ItemIDs.tcRailMediumTurn, "4x4"),
		MEDIUM_RIGHT_TURN("MEDIUM_RIGHT_TURN", "TURN", ItemIDs.tcRailMediumTurn, ""),
		MEDIUM_LEFT_TURN("MEDIUM_LEFT_TURN", "TURN", ItemIDs.tcRailMediumTurn, ""),
		MEDIUM_SWITCH("MEDIUM_RIGHT_SWITCH", "SWITCH", ItemIDs.tcRailMediumSwitch, "4x4"),
		MEDIUM_RIGHT_SWITCH("MEDIUM_SWITCH", "SWITCH", ItemIDs.tcRailMediumSwitch, ""),
		MEDIUM_LEFT_SWITCH("MEDIUM_LEFT_SWITCH", "SWITCH", ItemIDs.tcRailMediumSwitch, ""),
		LARGE_SWITCH("LARGE_SWITCH", "SWITCH", ItemIDs.tcRailLargeSwitch, "6x6"),
		LARGE_RIGHT_SWITCH("LARGE_RIGHT_SWITCH", "SWITCH", ItemIDs.tcRailLargeSwitch, ""),
		LARGE_LEFT_SWITCH("LARGE_LEFT_SWITCH", "SWITCH", ItemIDs.tcRailLargeSwitch, ""),
		MEDIUM_PARALLEL_SWITCH("MEDIUM_PARALLEL_SWITCH", "SWITCH", ItemIDs.tcRailMediumParallelSwitch, "4x11"),
		MEDIUM_RIGHT_PARALLEL_SWITCH("MEDIUM_RIGHT_PARALLEL_SWITCH", "SWITCH", ItemIDs.tcRailMediumParallelSwitch, ""),
		MEDIUM_LEFT_PARALLEL_SWITCH("MEDIUM_LEFT_PARALLEL_SWITCH", "SWITCH", ItemIDs.tcRailMediumParallelSwitch, ""),
		LARGE_TURN("LARGE_TURN", "TURN", ItemIDs.tcRailLargeTurn, "6x6"),
		LARGE_RIGHT_TURN("LARGE_RIGHT_TURN", "TURN", ItemIDs.tcRailLargeTurn, ""),
		LARGE_LEFT_TURN("LARGE_LEFT_TURN", "TURN", ItemIDs.tcRailLargeTurn, ""),
		VERY_LARGE_TURN("VERY_LARGE_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, "10x10"),
		VERY_LARGE_RIGHT_TURN("VERY_LARGE_RIGHT_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, ""),
		VERY_LARGE_LEFT_TURN("VERY_LARGE_LEFT_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, ""),
		LONG_STRAIGHT("LONG_STRAIGHT", "STRAIGHT", ItemIDs.tcRailLongStraight, "1x6"),
		MEDIUM_STRAIGHT("MEDIUM_STRAIGHT", "STRAIGHT", ItemIDs.tcRailMediumStraight, "1x3"),
		SMALL_STRAIGHT("SMALL_STRAIGHT", "STRAIGHT", ItemIDs.tcRailSmallStraight, "1x1"),
		TWO_WAYS_CROSSING("TWO_WAYS_CROSSING", "CROSSING", ItemIDs.tcRailTwoWaysCrossing, "5x5"),
		LARGE_SLOPE_WOOD("LARGE_SLOPE_WOOD", "SLOPE", ItemIDs.tcRailLargeSlopeWood, "1x6"),
		LARGE_SLOPE_GRAVEL("LARGE_SLOPE_GRAVEL", "SLOPE", ItemIDs.tcRailLargeSlopeGravel, "1x6"),
		LARGE_SLOPE_BALLAST("LARGE_SLOPE_BALLAST", "SLOPE", ItemIDs.tcRailLargeSlopeBallast, "1x6");

		private String label;
		private String type;
		private ItemIDs item;
		private String tooltip;

		private TrackTypes(String label, String type, ItemIDs item, String tooltip) {
			this.label = label;
			this.type = type;
			this.item = item;
			this.tooltip = tooltip;
		}

		public String getLabel() {
			return this.label;
		}

		public String getType() {
			return this.type;
		}

		public ItemIDs getItem() {
			return this.item;
		}

		public String getTooltip() {
			return this.tooltip;
		}

	}

	public static boolean isTCTurnTrack(TileTCRail tile) {
		if ((tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState()) || tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.LARGE_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.LARGE_LEFT_TURN.getLabel()) || tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_TURN.getLabel()) || tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel()))
			return true;
		return false;
	}

	public static boolean isTCStraightTrack(TileTCRail tile) {
		if ((tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState()) || tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel()) || tile.getType().equals(TrackTypes.LONG_STRAIGHT.getLabel()) || tile.getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel()))
			return true;
		return false;
	}

	public static boolean isTCTwoWaysCrossingTrack(TileTCRail tile) {
		if (tile.getType().equals(TrackTypes.TWO_WAYS_CROSSING.getLabel()))
			return true;
		return false;
	}

	public static boolean isTCSwitch(TileTCRail tile) {
		if ((tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())))
			return true;
		return false;
	}

	public static boolean isTCSlopeTrack(TileTCRail tile) {
		if (tile.getType().equals(TrackTypes.LARGE_SLOPE_WOOD.getLabel()) || tile.getType().equals(TrackTypes.LARGE_SLOPE_GRAVEL.getLabel()) || tile.getType().equals(TrackTypes.LARGE_SLOPE_BALLAST.getLabel()))
			return true;
		return false;
	}

	public ItemTCRail(TrackTypes t) {
		super();
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
		this.type = t;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":tracks/" + ItemIDs.getIcon(Item.getIdFromItem(this)));
	}

	private boolean canPlaceTrack(World world, int x, int y, int z) {
		Block l = world.getBlock(x, y, z);
		Block l1 = world.getBlock(x, y - 1, z);
		Block block = Block.blocksList[l];
		return (block == null || block.isBlockReplaceable(world, x, y, z)) && (world.doesBlockHaveSolidTopSurface(x, y - 1, z) || l1 == BlockIDs.bridgePillar.blockID);
	}

	/**
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param posX[] array of gag
	 * @param posZ[] array of gag
	 * @param l orientation
	 * @param exitFacing
	 * @param posExitX
	 * @param posExitZ
	 * @param r ray
	 * @param cx circle center
	 * @param cy circle center
	 * @param cz circle center
	 * @param type
	 * @return
	 */
	private boolean putDownTurn(World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ, int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy, double cz, String type, int idDrop) {
		TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

		/** check if first straight rail can be placed */
		if (putDownEnterTrack && !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}

		/** Check first turn block */
		if (!canPlaceTrack(world, posX[0], y + 1, posZ[0])) {
			return false;
		}

		/** check if Gag rails can be placed */
		for (int gag = 1; gag < posX.length; gag++) {
			if (!canPlaceTrack(world, posX[gag], y + 1, posZ[gag])) {
				return false;
			}
		}
		/** Check last block */
		if (putDownExitTrack && !canPlaceTrack(world, posExitX, y + 1, posExitZ)) {
			return false;
		}
		if (putDownEnterTrack) {
			/** first rail of the turn is a 1 block straight */
			world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
			TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
			tcRailStart.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
			tcRailStart.setFacing(l);
			tcRailStart.isLinkedToRail = true;
			tcRailStart.linkedX = posX[0];
			tcRailStart.linkedY = y + 1;
			tcRailStart.linkedZ = posZ[0];
		}

		/** the turn starts with this rail */
		world.setBlock(posX[0], y + 1, posZ[0], Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX[0], y + 1, posZ[0]);
		tcRail.setFacing(l);
		tcRail.r = r;
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.setType(type);
		tcRail.idDrop = idDrop;

		/** Gag rails containing reference to first turn rail */
		for (int gag = 1; gag < posX.length; gag++) {
			world.setBlock(posX[gag], y + 1, posZ[gag], Block.getBlockById(BlockIDs.tcRailGag.blockID), 0, 2);
			tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
		}

		if (putDownExitTrack) {
			/** Last rail is a 1 block straight */
			world.setBlock(posExitX, y + 1, posExitZ, Block.getBlockById(BlockIDs.tcRail.blockID), exitFacing, 2);
			TileTCRail tcRailEnd = (TileTCRail) world.getTileEntity(posExitX, y + 1, posExitZ);
			tcRailEnd.setFacing(exitFacing);
			tcRailEnd.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
			tcRailEnd.isLinkedToRail = true;
			tcRailEnd.linkedX = posX[0];
			tcRailEnd.linkedY = y + 1;
			tcRailEnd.linkedZ = posZ[0];
		}

		for (int i = 0; i < tileGag.length; i++) {
			tileGag[i].originX = posX[0];
			tileGag[i].originY = y + 1;
			tileGag[i].originZ = posZ[0];
			tileGag[i].type = type;
		}
		return true;
	}

	private void putDownSingleRail(World world, int posX, int posY, int posZ, int l, double cx, double cy, double cz, double r, String label, boolean hasModel, int linkedX, int linkedY, int linkedZ, boolean canTypeBeModifiedBySwitch, boolean shouldDrop) {
		/** Switch rail */
		world.setBlock(posX, posY, posZ, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX, posY, posZ);
		//world.setBlockMetadataWithNotify(posX, posY, posZ, l, 2);
		tcRail.setFacing(l);
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.r = r;
		tcRail.setType(label);
		tcRail.hasModel = hasModel;
		tcRail.isLinkedToRail = true;
		tcRail.linkedX = linkedX;
		tcRail.linkedY = linkedY;
		tcRail.linkedZ = linkedZ;
		tcRail.canTypeBeModifiedBySwitch = canTypeBeModifiedBySwitch;
		if(shouldDrop)tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailSmallStraight.item);
	}

	private String getTrackOrientation(int l, float yaw) {
		if (l == 2 && yaw >= -180 && yaw <= -135) {
			return "right";
		}
		if (l == 2 && yaw <= 180 && yaw >= 135) {
			return "left";
		}
		if (l == 3 && yaw > -135 && yaw <= -90) {
			return "left";
		}
		if (l == 3 && yaw > -90 && yaw <= -45) {
			return "right";
		}
		if (l == 0 && yaw > -45 && yaw <= 0) {
			return "left";
		}
		if (l == 0 && yaw > 0 && yaw <= 45) {
			return "right";
		}
		if (l == 1 && yaw > 45 && yaw <= 90) {
			return "left";
		}
		if (l == 1 && yaw > 90 && yaw <= 135) {
			return "right";
		}
		return "";
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (!world.isRemote) {
			int l = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
			TrackTypes tempType = type;
			if (type == TrackTypes.LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.LARGE_LEFT_TURN;
				}
			}
			if (type == TrackTypes.VERY_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.VERY_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.VERY_LARGE_LEFT_TURN;
				}
			}
			if (type == TrackTypes.MEDIUM_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.MEDIUM_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.MEDIUM_LEFT_TURN;
				}
			}
			if (type == TrackTypes.MEDIUM_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.MEDIUM_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.MEDIUM_LEFT_SWITCH;
				}
			}
			if (type == TrackTypes.LARGE_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.LARGE_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.LARGE_LEFT_SWITCH;
				}
			}
			if (type == TrackTypes.MEDIUM_PARALLEL_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH;
				}
			}
			//System.out.println(type +" "+l);
			if (tempType == TrackTypes.MEDIUM_RIGHT_TURN) {

				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x + 1, x + 1, x + 2 };
					int[] zArray = { z - 0, z - 1, z - 1, z - 2, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 3, z - 3, 2.5, x + 3, y + 1, z + 1, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;

				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x - 1, x - 1, x - 2 };
					int[] zArray = { z + 0, z + 1, z + 1, z + 2, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 3, z + 3, 2.5, x - 2, y + 1, z, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 1, x - 2, x - 2 };
					int[] zArray = { z + 0, z + 0, z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 3, z - 3, 2.5, x + 1, y + 1, z - 2, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 1, x + 2, x + 2 };
					int[] zArray = { z + 0, z + 0, z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 3, z + 3, 2.5, x, y + 1, z + 3, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.MEDIUM_LEFT_TURN) {

				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 1, x - 2, x - 2 };
					int[] zArray = { z + 0, z + 0, z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x - 3, z + 3, 2.5, x + 1, y + 1, z + 3, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;

				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 1, x + 2, x + 2 };
					int[] zArray = { z + 0, z + 0, z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x + 3, z - 3, 2.5, x, y + 1, z - 2, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x + 1, x + 1, x + 2 };
					int[] zArray = { z + 0, z + 1, z + 1, z + 2, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 3, x + 3, z + 3, 2.5, x + 3, y + 1, z, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}
				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x - 1, x - 1, x - 2 };
					int[] zArray = { z - 0, z - 1, z - 1, z - 2, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 3, z - 3, 2.5, x - 2, y + 1, z + 1, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumTurn.item)))
						return false;
				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.MEDIUM_RIGHT_SWITCH) {
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 2) || !canPlaceTrack(world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1, z, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x + 3, y + 1, z, 2.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x + 3, y + 1, z, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 2) || !canPlaceTrack(world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1, z + 1, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x - 2, y + 1, z + 1, 2.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x - 2, y + 1, z + 1, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z) || !canPlaceTrack(world, x - 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1, z - 2, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 2, 2.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 2, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z) || !canPlaceTrack(world, x + 1, y + 1, z)) {
						return false;
					}

					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1, z + 3, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 2, y + 1, z + 1, false, false);

				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.MEDIUM_LEFT_SWITCH) {
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 2) || !canPlaceTrack(world, x, y + 1, z - 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1, z, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null) {
						tcRailTurn.hasModel = false;
					}
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x - 2, y + 1, z, 2.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x - 2, y + 1, z, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 2) || !canPlaceTrack(world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2 };
					int[] zArray = { z + 2, z + 3, z + 3 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1, z + 1, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x + 3, y + 1, z + 1, 2.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x + 3, y + 1, z + 1, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z) || !canPlaceTrack(world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3 };
					int[] zArray = { z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1, z + 3, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 3, 2.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 3, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 2, y + 1, z + 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z) || !canPlaceTrack(world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3 };
					int[] zArray = { z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1, z - 2, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 2, y + 1, z - 1, false, false);

				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.LARGE_RIGHT_SWITCH) {
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z - 5) || !canPlaceTrack(world, x, y + 1, z - 4) || !canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 2) || !canPlaceTrack(world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1, z, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x + 5, y + 1, z, 4.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x + 5, y + 1, z, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x + 5, y + 1, z, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z + 5) || !canPlaceTrack(world, x, y + 1, z + 4) || !canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 2) || !canPlaceTrack(world, x, y + 1, z + 1)) {
						return false;
					}

					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1, z + 1, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x - 4, y + 1, z + 1, 4.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x - 4, y + 1, z + 1, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x - 4, y + 1, z + 1, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x - 5, y + 1, z) || !canPlaceTrack(world, x - 4, y + 1, z) || !canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z) || !canPlaceTrack(world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1, z - 4, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 4, 4.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 4, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z - 4, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z - 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 2, y + 1, z - 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x + 5, y + 1, z) || !canPlaceTrack(world, x + 4, y + 1, z) || !canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z) || !canPlaceTrack(world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1, z + 5, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 2, y + 1, z + 1, false, false);

				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}

			if (tempType == TrackTypes.LARGE_LEFT_SWITCH) {
				if (l == 2) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z - 5) || !canPlaceTrack(world, x, y + 1, z - 4) || !canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 2) || !canPlaceTrack(world, x, y + 1, z - 1)) {
						return false;
					}
					int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
					int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1, z, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;
					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z - 1, l, x - 4, y + 1, z, 4.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z - 2, l, x - 4, y + 1, z, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z - 3, l, x - 4, y + 1, z, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z - 2, false, false);

				}
				if (l == 0) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x, y + 1, z + 5) || !canPlaceTrack(world, x, y + 1, z + 4) || !canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 2) || !canPlaceTrack(world, x, y + 1, z + 1)) {
						return false;
					}
					int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
					int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1, z + 1, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x, y + 1, z + 1, l, x + 5, y + 1, z + 1, 4.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x, y + 1, z + 2, l, x + 5, y + 1, z + 1, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x, y + 1, z + 3, l, x + 5, y + 1, z + 1, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 2, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 2, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z + 2, false, false);

				}
				if (l == 1) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x - 5, y + 1, z) || !canPlaceTrack(world, x - 4, y + 1, z) || !canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z) || !canPlaceTrack(world, x - 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
					int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1, z + 5, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 5, 4.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 5, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z + 5, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z + 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 2, y + 1, z + 1, false, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 2, y + 1, z + 1, false, false);

				}
				if (l == 3) {
					/** Check if straight exit can be put down */
					if (!canPlaceTrack(world, x + 5, y + 1, z) || !canPlaceTrack(world, x + 4, y + 1, z) || !canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z) || !canPlaceTrack(world, x + 1, y + 1, z)) {
						return false;
					}
					int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
					int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1, z - 4, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeSwitch.item)))
						return false;

					TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
					if (tcRailTurn != null)
						tcRailTurn.hasModel = false;
					world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

					/** Switch rail 1 */
					putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

					/** Switch rail 2 **/
					putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Switch rail 3 **/
					putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 2, y + 1, z - 1, true, false);

					/** Put down straight exit **/
					putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 2, y + 1, z - 1, false, false);

				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}

			if (tempType == TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH) {
				if (l == 2) {
					if (!parallelRightSwitchNorth(world, x, y, z, l, tempType))
						return false;

				}
				if (l == 0) {
					if (!parallelRightSwitchSouth(world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelRightSwitchWest(world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelRightSwitchEast(world, x, y, z, l, tempType))
						return false;
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH) {
				if (l == 2) {
					if (!parallelLeftSwitchNorth(world, x, y, z, l, tempType))
						return false;
				}
				if (l == 0) {
					if (!parallelLeftSwitchSouth(world, x, y, z, l, tempType))
						return false;
				}
				if (l == 1) {
					if (!parallelLeftSwitchWest(world, x, y, z, l, tempType))
						return false;
				}
				if (l == 3) {
					if (!parallelLeftSwitchEast(world, x, y, z, l, tempType))
						return false;
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.LARGE_RIGHT_TURN) {

				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x + 1, x + 1, x + 2, x + 0, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
					int[] zArray = { z - 0, z - 1, z - 1, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 4, z - 4, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 5, z - 5, 4.5, x + 5, y + 1, z + 1, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x + 0, x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
					int[] zArray = { z + 0, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 3, z + 4, z + 4, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 5, z + 5, 4.5, x - 4, y + 1, z, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 1, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 4, x - 4, x - 4 };
					int[] zArray = { z + 0, z + 0, z - 1, z + 0, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 5, z - 5, 4.5, x + 1, y + 1, z - 4, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 2, x + 1, x + 2, x + 2, x + 3, x + 3, x + 3, x + 4, x + 4, x + 4 };
					int[] zArray = { z + 0, z + 0, z + 0, z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 5, z + 5, 4.5, x, y + 1, z + 5, TrackTypes.LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.LARGE_LEFT_TURN) {
				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x - 1, x - 1, x - 2, x + 0, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
					int[] zArray = { z - 0, z - 1, z - 1, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 4, z - 4, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 5, z - 5, 4.5, x - 4, y + 1, z + 1, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x + 0, x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
					int[] zArray = { z + 0, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 3, z + 4, z + 4, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 5, z + 5, 4.5, x + 5, y + 1, z, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 1, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 4, x - 4, x - 4 };
					int[] zArray = { z + 0, z + 0, z + 1, z + 0, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 5, z + 5, 4.5, x + 1, y + 1, z + 5, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 2, x + 1, x + 2, x + 2, x + 3, x + 3, x + 3, x + 4, x + 4, x + 4 };
					int[] zArray = { z + 0, z + 0, z + 0, z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 5, z - 5, 4.5, x, y + 1, z - 4, TrackTypes.LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailLargeTurn.item)))
						return false;
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.VERY_LARGE_RIGHT_TURN) {

				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x + 0, x + 1, x + 0, x + 1, x + 0, x + 1, x + 1, x + 2, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 5, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 9 };
					int[] zArray = { z - 0, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 4, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 7, z - 8, z - 9, z - 8, z - 9, z - 8, z - 9, z - 9, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 10, z - 10, 9.5, x + 10, y + 1, z + 1, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x + 0, x - 1, x + 0, x - 1, x + 0, x - 1, x - 2, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 5, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 9 };
					int[] zArray = { z + 0, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 7, z + 8, z + 9, z + 8, z + 9, z + 8, z + 9, z + 9, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 10, z + 10, 9.5, x - 9, y + 1, z, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 7, x - 8, x - 9, x - 8, x - 9, x - 8, x - 9, x - 9, x - 9 };
					int[] zArray = { z + 0, z + 0, z + 0, z - 1, z + 0, z - 1, z + 0, z - 1, z - 2, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 10, z - 10, 9.5, x + 1, y + 1, z - 9, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 7, x + 8, x + 9, x + 8, x + 9, x + 8, x + 9, x + 9, x + 9 };
					int[] zArray = { z + 0, z + 0, z + 0, z + 1, z + 0, z + 1, z + 0, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 5, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 8, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 10, z + 10, 9.5, x, y + 1, z + 10, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.VERY_LARGE_LEFT_TURN) {
				if (l == 2) {
					int[] xArray = { x + 0, x + 0, x + 0, x - 1, x + 0, x - 1, x + 0, x - 1, x - 2, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 5, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 9 };
					int[] zArray = { z - 0, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 7, z - 8, z - 8, z - 9, z - 8, z - 9, z - 8, z - 9, z - 9, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 10, z - 10, 9.5, x - 9, y + 1, z + 1, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x + 0, x + 0, x + 0, x + 1, x + 0, x + 1, x + 0, x + 1, x + 2, x + 1, x + 2, x + 2, x + 3, x + 3, x + 4, x + 5, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 9 };
					int[] zArray = { z + 0, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 7, z + 8, z + 9, z + 8, z + 9, z + 8, z + 9, z + 9, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 10, z + 10, 9.5, x + 10, y + 1, z, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x - 0, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 7, x - 8, x - 9, x - 8, x - 9, x - 8, x - 9, x - 9, x - 9 };
					int[] zArray = { z + 0, z + 0, z + 0, z + 1, z + 0, z + 1, z + 0, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 5, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 8, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 10, z + 10, 9.5, x + 1, y + 1, z + 10, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x + 0, x + 1, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 7, x + 8, x + 9, x + 8, x + 9, x + 8, x + 9, x + 9, x + 9 };
					int[] zArray = { z + 0, z + 0, z + 0, z - 1, z + 0, z - 1, z + 0, z - 1, z - 2, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 10, z - 10, 9.5, x, y + 1, z - 9, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailVeryLargeTurn.item)))
						return false;
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.LARGE_SLOPE_WOOD || type == TrackTypes.LARGE_SLOPE_GRAVEL || type == TrackTypes.LARGE_SLOPE_BALLAST) {
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}
				int idDropped = Item.getIdFromItem(type.getItem().item);
				TileTCRailGag[] tileGag = new TileTCRailGag[5];
				if (l == 2) {
					if (!canPlaceTrack(world, x, y + 1, z - 1) || !canPlaceTrack(world, x, y + 1, z - 2) || !canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 4) || !canPlaceTrack(world, x, y + 1, z - 5)) {
						return false;
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					tcRail.slopeAngle = 0.13;//0.1551;//0.3218;
					tcRail.slopeHeight = 1;
					tcRail.slopeLength = 7;
					world.setBlock(x, y + 1, z - 1, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);
					tileGag[0].bbHeight = 0.2f;

					world.setBlock(x, y + 1, z - 2, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);
					tileGag[1].bbHeight = 0.4f;

					world.setBlock(x, y + 1, z - 3, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 3);
					tileGag[2].bbHeight = 0.5f;

					world.setBlock(x, y + 1, z - 4, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);
					tileGag[3].bbHeight = 0.7f;

					world.setBlock(x, y + 1, z - 5, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);
					tileGag[4].bbHeight = 0.8f;
				}
				if (l == 0) {
					if (!canPlaceTrack(world, x, y + 1, z + 1) || !canPlaceTrack(world, x, y + 1, z + 2) || !canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 4) || !canPlaceTrack(world, x, y + 1, z + 5)) {
						return false;
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					tcRail.slopeAngle = 0.13;//0.1551;//0.3218;
					tcRail.slopeHeight = 1;
					tcRail.slopeLength = 7;
					world.setBlock(x, y + 1, z + 1, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);
					tileGag[0].bbHeight = 0.2f;

					world.setBlock(x, y + 1, z + 2, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);
					tileGag[1].bbHeight = 0.4f;

					world.setBlock(x, y + 1, z + 3, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 3);
					tileGag[2].bbHeight = 0.5f;

					world.setBlock(x, y + 1, z + 4, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);
					tileGag[3].bbHeight = 0.7f;

					world.setBlock(x, y + 1, z + 5, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);
					tileGag[4].bbHeight = 0.8f;
				}
				if (l == 1) {
					if (!canPlaceTrack(world, x - 1, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z) || !canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 4, y + 1, z) || !canPlaceTrack(world, x - 5, y + 1, z)) {
						return false;
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					tcRail.slopeAngle = 0.13;//0.1551;//0.1651;//0.3218;
					tcRail.slopeHeight = 1;
					tcRail.slopeLength = 7;
					world.setBlock(x - 1, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);
					tileGag[0].bbHeight = 0.2f;

					world.setBlock(x - 2, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z);
					tileGag[1].bbHeight = 0.4f;

					world.setBlock(x - 3, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 3, y + 1, z);
					tileGag[2].bbHeight = 0.5f;

					world.setBlock(x - 4, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);
					tileGag[3].bbHeight = 0.7f;

					world.setBlock(x - 5, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[4] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);
					tileGag[4].bbHeight = 0.8f;
				}
				if (l == 3) {
					if (!canPlaceTrack(world, x + 1, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z) || !canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 4, y + 1, z) || !canPlaceTrack(world, x + 5, y + 1, z)) {
						return false;
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());
					tcRail.idDrop = idDropped;
					tcRail.slopeAngle = 0.13;//0.1551;//0.3218;
					tcRail.slopeHeight = 1;
					tcRail.slopeLength = 7;
					world.setBlock(x + 1, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);
					tileGag[0].bbHeight = 0.2f;

					world.setBlock(x + 2, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z);
					tileGag[1].bbHeight = 0.4f;

					world.setBlock(x + 3, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 3, y + 1, z);
					tileGag[2].bbHeight = 0.5f;

					world.setBlock(x + 4, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);
					tileGag[3].bbHeight = 0.7f;

					world.setBlock(x + 5, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[4] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);
					tileGag[4].bbHeight = 0.8f;
				}
				for (int i = 0; i < tileGag.length; i++) {
					if (tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = type.getLabel();
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.MEDIUM_STRAIGHT || type == TrackTypes.LONG_STRAIGHT) {
				/** check if first rail can be placed */
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}

				TileTCRailGag[] tileGag = new TileTCRailGag[2];
				if (type == TrackTypes.LONG_STRAIGHT) {
					tileGag = new TileTCRailGag[4];
				}
				if (l == 2) {
					if (!canPlaceTrack(world, x, y + 1, z - 1) || !canPlaceTrack(world, x, y + 1, z - 2)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 4) || !canPlaceTrack(world, x, y + 1, z - 5)) {
							return false;
						}
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailLongStraight.item);
					}
					else {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailMediumStraight.item);
					}

					world.setBlock(x, y + 1, z - 1, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);

					world.setBlock(x, y + 1, z - 2, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);

					if (type == TrackTypes.LONG_STRAIGHT) {
						world.setBlock(x, y + 1, z - 3, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z - 3);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z - 1;

						world.setBlock(x, y + 1, z - 4, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);

						world.setBlock(x, y + 1, z - 5, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);
					}

				}
				if (l == 0) {
					if (!canPlaceTrack(world, x, y + 1, z + 1) || !canPlaceTrack(world, x, y + 1, z + 2)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 4) || !canPlaceTrack(world, x, y + 1, z + 5)) {
							return false;
						}
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailLongStraight.item);
					}
					else {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailMediumStraight.item);
					}

					world.setBlock(x, y + 1, z + 1, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);
					world.setBlock(x, y + 1, z + 2, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);

					if (type == TrackTypes.LONG_STRAIGHT) {
						world.setBlock(x, y + 1, z + 3, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z + 3);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z + 1;

						world.setBlock(x, y + 1, z + 4, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);

						world.setBlock(x, y + 1, z + 5, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);
					}
				}
				if (l == 1) {
					if (!canPlaceTrack(world, x - 1, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 4, y + 1, z) || !canPlaceTrack(world, x - 5, y + 1, z)) {
							return false;
						}
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailLongStraight.item);
					}
					else {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailMediumStraight.item);
					}

					world.setBlock(x - 1, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);
					world.setBlock(x - 2, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z);
					if (type == TrackTypes.LONG_STRAIGHT) {
						world.setBlock(x - 3, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x - 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z;

						world.setBlock(x - 4, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);

						world.setBlock(x - 5, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);
					}
				}
				if (l == 3) {
					if (!canPlaceTrack(world, x + 1, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 5, y + 1, z) || !canPlaceTrack(world, x + 5, y + 1, z)) {
							return false;
						}
					}
					world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailLongStraight.item);
					}
					else {
						tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailMediumStraight.item);
					}

					world.setBlock(x + 1, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);

					world.setBlock(x + 2, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z);

					if (type == TrackTypes.LONG_STRAIGHT) {
						world.setBlock(x + 3, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x + 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z;

						world.setBlock(x + 4, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);

						world.setBlock(x + 5, y + 1, z, Block.getBlockById(BlockIDs.tcRailGag.blockID), l, 2);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);
					}
				}

				for (int i = 0; i < tileGag.length; i++) {
					if (tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = TrackTypes.MEDIUM_STRAIGHT.getLabel();
				}
				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.SMALL_STRAIGHT) {
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}
				world.setBlock(x, y + 1, z, Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
				TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
				tcRail.setFacing(l);
				tcRail.cx = x;
				tcRail.cy = y + 1;
				tcRail.cz = z;
				tcRail.setType(type.getLabel());
				tcRail.idDrop = Item.getIdFromItem(ItemIDs.tcRailSmallStraight.item);

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.TWO_WAYS_CROSSING) {
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}

				int zDisplace = 0;
				int xDisplace = 0;
				int xSideDisplace = 0;
				int zSideDisplace = 0;
				int sideFacing = l;

				if (l == 2) {
					zDisplace = -1;
					xSideDisplace=1;
					sideFacing=1;
				}
				if (l == 0) {
					zDisplace = 1;
					xSideDisplace=1;
					sideFacing=1;
				}
				if (l == 3) {
					xDisplace = 1;
					zSideDisplace=1;
					sideFacing=2;
				}
				if (l == 1) {
					xDisplace = -1;
					zSideDisplace=1;
					sideFacing=2;
				}

				if (!canPlaceTrack(world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(world, x+(xDisplace*2), y + 1, z + (zDisplace*2)) || !canPlaceTrack(world, x+(xDisplace*3), y + 1, z + (zDisplace*3)) || !canPlaceTrack(world, x+(xDisplace*4), y + 1, z + (zDisplace*4))) {
					return false;
				}
				if (!canPlaceTrack(world, x+(xDisplace*2)+(xSideDisplace*1), y + 1, z + (zDisplace*2)+(zSideDisplace*1)) || !canPlaceTrack(world, x+(xDisplace*2)+(xSideDisplace*2), y + 1, z + (zDisplace*2)+(zSideDisplace*2))) {
					return false;
				}
				if (!canPlaceTrack(world, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z + (zDisplace*2)-(zSideDisplace*1)) || !canPlaceTrack(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z + (zDisplace*2)-(zSideDisplace*2))) {
					return false;
				}

				putDownSingleRail(world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l, x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1, z+(zDisplace*3), false, false);

				putDownSingleRail(world, x+(xDisplace*3), y + 1, z+(zDisplace*3), l, x+(xDisplace*3) , y + 1, z+(zDisplace*3), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2), y + 1, z+(zDisplace*2), false, false);

				world.setBlock(x+(xDisplace*2), y + 1, z+(zDisplace*2), Block.getBlockById(BlockIDs.tcRail.blockID), l, 2);
				TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x+(xDisplace*2), y + 1, z+(zDisplace*2));
				tcRail2.setFacing(l);
				tcRail2.cx = x+(xDisplace*2);
				tcRail2.cy = y + 1;
				tcRail2.cz = z+(zDisplace*2);
				tcRail2.setType(type.getLabel());
				tcRail2.idDrop = Item.getIdFromItem(ItemIDs.tcRailTwoWaysCrossing.item);

				putDownSingleRail(world, x+(xDisplace*1), y + 1, z+(zDisplace*1), l, x+(xDisplace*1) , y + 1, z+(zDisplace*1), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2), y + 1, z+(zDisplace*2), false, false);

				putDownSingleRail(world, x, y + 1, z, l, x , y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*1), y + 1, z+(zDisplace*1), false, false);
				
				putDownSingleRail(world, x+(xDisplace*2)+(xSideDisplace*1), y + 1, z+(zDisplace*2)+(zSideDisplace*1), sideFacing, x+(xDisplace*2)+(xSideDisplace*1) , y + 1, z+(zDisplace*2)+(zSideDisplace*1), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2), y + 1, z+(zDisplace*2), false, false);

				putDownSingleRail(world, x+(xDisplace*2)+(xSideDisplace*2), y + 1, z+(zDisplace*2)+(zSideDisplace*2), sideFacing, x+(xDisplace*2)+(xSideDisplace*2) , y + 1, z+(zDisplace*2)+(zSideDisplace*2), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2)+(xSideDisplace*1), y + 1, z+(zDisplace*2)+(zSideDisplace*1), false, false);

				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), sideFacing, x+(xDisplace*2)-(xSideDisplace*1) , y + 1, z+(zDisplace*2)-(zSideDisplace*1), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2), y + 1, z+(zDisplace*2), false, false);

				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);

				if (!player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
		}
		return false;
	}

	private boolean parallelRightSwitchEast(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(world, x + 3, y + 1, z + 1) || !canPlaceTrack(world, x + 4, y + 1, z + 1) || !canPlaceTrack(world, x + 5, y + 1, z + 1) || !canPlaceTrack(world, x + 4, y + 1, z + 2) || !canPlaceTrack(world, x + 5, y + 1, z + 2) || !canPlaceTrack(world, x + 6, y + 1, z + 2) || !canPlaceTrack(world, x + 7, y + 1, z + 2) || !canPlaceTrack(world, x + 8, y + 1, z + 2) || !canPlaceTrack(world, x + 6, y + 1, z + 3) || !canPlaceTrack(world, x + 7, y + 1, z + 3) || !canPlaceTrack(world, x + 8, y + 1, z + 3) || !canPlaceTrack(world, x + 9, y + 1, z + 3) || !canPlaceTrack(world, x + 10, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z + 1, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z + 1, true, false);

		int[] xArray2 = { x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9 };
		int[] zArray2 = { z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z + 2);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x + 3;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z + 1;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x + 4;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z + 2;

		/** Put down straight **/
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchWest(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(world, x - 3, y + 1, z - 1) || !canPlaceTrack(world, x - 4, y + 1, z - 1) || !canPlaceTrack(world, x - 5, y + 1, z - 1) || !canPlaceTrack(world, x - 4, y + 1, z - 2) || !canPlaceTrack(world, x - 5, y + 1, z - 2) || !canPlaceTrack(world, x - 6, y + 1, z - 2) || !canPlaceTrack(world, x - 7, y + 1, z - 2) || !canPlaceTrack(world, x - 8, y + 1, z - 2) || !canPlaceTrack(world, x - 6, y + 1, z - 3) || !canPlaceTrack(world, x - 7, y + 1, z - 3) || !canPlaceTrack(world, x - 8, y + 1, z - 3) || !canPlaceTrack(world, x - 9, y + 1, z - 3) || !canPlaceTrack(world, x - 10, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z - 1, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z - 1, true, false);

		int[] xArray2 = { x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9 };
		int[] zArray2 = { z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z - 2);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x - 3;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z - 1;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x - 4;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z - 2;

		/** Put down straight **/
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchSouth(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(world, x - 1, y + 1, z + 3) || !canPlaceTrack(world, x - 1, y + 1, z + 4) || !canPlaceTrack(world, x - 1, y + 1, z + 5) || !canPlaceTrack(world, x - 2, y + 1, z + 4) || !canPlaceTrack(world, x - 2, y + 1, z + 5) || !canPlaceTrack(world, x - 2, y + 1, z + 6) || !canPlaceTrack(world, x - 2, y + 1, z + 7) || !canPlaceTrack(world, x - 2, y + 1, z + 8) || !canPlaceTrack(world, x - 3, y + 1, z + 6) || !canPlaceTrack(world, x - 3, y + 1, z + 7) || !canPlaceTrack(world, x - 3, y + 1, z + 8) || !canPlaceTrack(world, x - 3, y + 1, z + 9) || !canPlaceTrack(world, x - 3, y + 1, z + 10) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 3, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 3, true, false);

		int[] xArray2 = { x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3 };
		int[] zArray2 = { z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 4);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x - 1;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z + 3;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x - 2;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z + 4;

		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchNorth(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(world, x + 1, y + 1, z - 3) || !canPlaceTrack(world, x + 1, y + 1, z - 4) || !canPlaceTrack(world, x + 1, y + 1, z - 5) || !canPlaceTrack(world, x + 2, y + 1, z - 4) || !canPlaceTrack(world, x + 2, y + 1, z - 5) || !canPlaceTrack(world, x + 2, y + 1, z - 6) || !canPlaceTrack(world, x + 2, y + 1, z - 7) || !canPlaceTrack(world, x + 2, y + 1, z - 8) || !canPlaceTrack(world, x + 3, y + 1, z - 6) || !canPlaceTrack(world, x + 3, y + 1, z - 7) || !canPlaceTrack(world, x + 3, y + 1, z - 8) || !canPlaceTrack(world, x + 3, y + 1, z - 9) || !canPlaceTrack(world, x + 3, y + 1, z - 10) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 3, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 3, true, false);

		int[] xArray2 = { x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3 };
		int[] zArray2 = { z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 4);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x + 1;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z - 3;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x + 2;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z - 4;

		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchNorth(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(world, x - 1, y + 1, z - 3) || !canPlaceTrack(world, x - 1, y + 1, z - 4) || !canPlaceTrack(world, x - 1, y + 1, z - 5) || !canPlaceTrack(world, x - 2, y + 1, z - 4) || !canPlaceTrack(world, x - 2, y + 1, z - 5) || !canPlaceTrack(world, x - 2, y + 1, z - 6) || !canPlaceTrack(world, x - 2, y + 1, z - 7) || !canPlaceTrack(world, x - 2, y + 1, z - 8) || !canPlaceTrack(world, x - 3, y + 1, z - 6) || !canPlaceTrack(world, x - 3, y + 1, z - 7) || !canPlaceTrack(world, x - 3, y + 1, z - 8) || !canPlaceTrack(world, x - 3, y + 1, z - 9) || !canPlaceTrack(world, x - 3, y + 1, z - 10) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 3, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 3, true, false);

		int[] xArray2 = { x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3 };
		int[] zArray2 = { z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 4);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x - 1;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z - 3;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x - 2;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z - 4;

		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchSouth(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(world, x + 1, y + 1, z + 3) || !canPlaceTrack(world, x + 1, y + 1, z + 4) || !canPlaceTrack(world, x + 1, y + 1, z + 5) || !canPlaceTrack(world, x + 2, y + 1, z + 4) || !canPlaceTrack(world, x + 2, y + 1, z + 5) || !canPlaceTrack(world, x + 2, y + 1, z + 6) || !canPlaceTrack(world, x + 2, y + 1, z + 7) || !canPlaceTrack(world, x + 2, y + 1, z + 8) || !canPlaceTrack(world, x + 3, y + 1, z + 6) || !canPlaceTrack(world, x + 3, y + 1, z + 7) || !canPlaceTrack(world, x + 3, y + 1, z + 8) || !canPlaceTrack(world, x + 3, y + 1, z + 9) || !canPlaceTrack(world, x + 3, y + 1, z + 10) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 3, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 3, true, false);

		int[] xArray2 = { x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3 };
		int[] zArray2 = { z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 4);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x + 1;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z + 3;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x + 2;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z + 4;

		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchEast(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(world, x + 3, y + 1, z - 1) || !canPlaceTrack(world, x + 4, y + 1, z - 1) || !canPlaceTrack(world, x + 5, y + 1, z - 1) || !canPlaceTrack(world, x + 4, y + 1, z - 2) || !canPlaceTrack(world, x + 5, y + 1, z - 2) || !canPlaceTrack(world, x + 6, y + 1, z - 2) || !canPlaceTrack(world, x + 7, y + 1, z - 2) || !canPlaceTrack(world, x + 8, y + 1, z - 2) || !canPlaceTrack(world, x + 6, y + 1, z - 3) || !canPlaceTrack(world, x + 7, y + 1, z - 3) || !canPlaceTrack(world, x + 8, y + 1, z - 3) || !canPlaceTrack(world, x + 9, y + 1, z - 3) || !canPlaceTrack(world, x + 10, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z - 1, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z - 1, true, false);

		int[] xArray2 = { x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9 };
		int[] zArray2 = { z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z - 2);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x + 3;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z - 1;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x + 4;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z - 2;

		/** Put down straight **/
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchWest(World world, int x, int y, int z, int l, TrackTypes tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(world, x - 3, y + 1, z + 1) || !canPlaceTrack(world, x - 4, y + 1, z + 1) || !canPlaceTrack(world, x - 5, y + 1, z + 1) || !canPlaceTrack(world, x - 4, y + 1, z + 2) || !canPlaceTrack(world, x - 5, y + 1, z + 2) || !canPlaceTrack(world, x - 6, y + 1, z + 2) || !canPlaceTrack(world, x - 7, y + 1, z + 2) || !canPlaceTrack(world, x - 8, y + 1, z + 2) || !canPlaceTrack(world, x - 6, y + 1, z + 3) || !canPlaceTrack(world, x - 7, y + 1, z + 3) || !canPlaceTrack(world, x - 8, y + 1, z + 3) || !canPlaceTrack(world, x - 9, y + 1, z + 3) || !canPlaceTrack(world, x - 10, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), Item.getIdFromItem(ItemIDs.tcRailMediumParallelSwitch.item)))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
		if (tcRailTurn != null)
			tcRailTurn.hasModel = false;

		/** Switch rail 1 */
		putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, false, false);

		/** Switch rail 2 **/
		putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, true, false);
		/** Switch rail 3 **/
		putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, true, false);

		int[] xArray2 = { x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9 };
		int[] zArray2 = { z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3 };
		if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), 0))
			return false;
		TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z + 2);
		if (tcRailTurn2 != null)
			tcRailTurn2.hasModel = false;
		tcRailTurn2.isLinkedToRail = true;
		tcRailTurn2.linkedX = x - 3;
		tcRailTurn2.linkedY = y + 1;
		tcRailTurn2.linkedZ = z + 1;

		tcRailTurn.isLinkedToRail = true;
		tcRailTurn.linkedX = x - 4;
		tcRailTurn.linkedY = y + 1;
		tcRailTurn.linkedZ = z + 2;

		/** Put down straight **/
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + type.getTooltip());
	}
}
