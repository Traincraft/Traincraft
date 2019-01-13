package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockMushroom;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.List;

public class ItemTCRail extends ItemPart {
	private TrackTypes type;

	public enum TrackTypes {

		MEDIUM_TURN("MEDIUM_TURN", "TURN", ItemIDs.tcRailMediumTurn, "3x3"),
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
		LARGE_TURN("LARGE_TURN", "TURN", ItemIDs.tcRailLargeTurn, "5x5"),
		LARGE_RIGHT_TURN("LARGE_RIGHT_TURN", "TURN", ItemIDs.tcRailLargeTurn, ""),
		LARGE_LEFT_TURN("LARGE_LEFT_TURN", "TURN", ItemIDs.tcRailLargeTurn, ""),
		VERY_LARGE_TURN("VERY_LARGE_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, "10x10"),
		VERY_LARGE_RIGHT_TURN("VERY_LARGE_RIGHT_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, ""),
		VERY_LARGE_LEFT_TURN("VERY_LARGE_LEFT_TURN", "TURN", ItemIDs.tcRailVeryLargeTurn, ""),
		LONG_STRAIGHT("LONG_STRAIGHT", "STRAIGHT", ItemIDs.tcRailLongStraight, "1x6"),
		MEDIUM_STRAIGHT("MEDIUM_STRAIGHT", "STRAIGHT", ItemIDs.tcRailMediumStraight, "1x3"),
		SMALL_STRAIGHT("SMALL_STRAIGHT", "STRAIGHT", ItemIDs.tcRailSmallStraight, "1x1"),
		SMALL_ROAD_CROSSING("SMALL_ROAD_CROSSING", "STRAIGHT", ItemIDs.tcRailSmallRoadCrossing, "1x1"),
		SMALL_ROAD_CROSSING_1("SMALL_ROAD_CROSSING_1", "STRAIGHT", ItemIDs.tcRailSmallRoadCrossing1, "1x1"),
		SMALL_ROAD_CROSSING_2("SMALL_ROAD_CROSSING_2", "STRAIGHT", ItemIDs.tcRailSmallRoadCrossing2, "1x1"),
		TWO_WAYS_CROSSING("TWO_WAYS_CROSSING", "CROSSING", ItemIDs.tcRailTwoWaysCrossing, "3x3"),
		SLOPE_WOOD("SLOPE_WOOD", "SLOPE", ItemIDs.tcRailSlopeWood, "1x6"),
		SLOPE_GRAVEL("SLOPE_GRAVEL", "SLOPE", ItemIDs.tcRailSlopeGravel, "1x6"),
		SLOPE_BALLAST("SLOPE_BALLAST", "SLOPE", ItemIDs.tcRailSlopeBallast, "1x6"),
		LARGE_SLOPE_WOOD("LARGE_SLOPE_WOOD", "SLOPE", ItemIDs.tcRailLargeSlopeWood, "1x12"),
		LARGE_SLOPE_GRAVEL("LARGE_SLOPE_GRAVEL", "SLOPE", ItemIDs.tcRailLargeSlopeGravel, "1x12"),
		LARGE_SLOPE_BALLAST("LARGE_SLOPE_BALLAST", "SLOPE", ItemIDs.tcRailLargeSlopeBallast, "1x12"),
		VERY_LARGE_SLOPE_WOOD("VERY_LARGE_SLOPE_WOOD", "SLOPE", ItemIDs.tcRailVeryLargeSlopeWood, "1x18"),
		VERY_LARGE_SLOPE_GRAVEL("VERY_LARGE_SLOPE_GRAVEL", "SLOPE", ItemIDs.tcRailVeryLargeSlopeGravel, "1x18"),
		VERY_LARGE_SLOPE_BALLAST("VERY_LARGE_SLOPE_BALLAST", "SLOPE", ItemIDs.tcRailVeryLargeSlopeBallast, "1x18");

		private String label;
		private String type;
		private ItemIDs item;
		private String tooltip;

		TrackTypes(String label, String type, ItemIDs item, String tooltip) {
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
		return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState()) || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState()) || tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.LARGE_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.LARGE_LEFT_TURN.getLabel()) || tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel()) || tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_TURN.getLabel()) || tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel());
	}

	public static boolean isTCStraightTrack(TileTCRail tile) {
		return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				|| tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel())
				|| tile.getType().equals(TrackTypes.LONG_STRAIGHT.getLabel())
				|| tile.getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel())
				|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING.getLabel())
				|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_1.getLabel())
				|| tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_2.getLabel());
	}

	public static boolean isTCTwoWaysCrossingTrack(TileTCRail tile) {
		return tile.getType().equals(TrackTypes.TWO_WAYS_CROSSING.getLabel());
	}

	public static boolean isTCSwitch(TileTCRail tile) {
		return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()));
	}

	public static boolean isTCSlopeTrack(TileTCRail tile) {
		return tile.getType().equals(TrackTypes.SLOPE_WOOD.getLabel())
				|| tile.getType().equals(TrackTypes.SLOPE_GRAVEL.getLabel())
				|| tile.getType().equals(TrackTypes.SLOPE_BALLAST.getLabel())
				|| tile.getType().equals(TrackTypes.LARGE_SLOPE_WOOD.getLabel())
				|| tile.getType().equals(TrackTypes.LARGE_SLOPE_GRAVEL.getLabel())
				|| tile.getType().equals(TrackTypes.LARGE_SLOPE_BALLAST.getLabel())
				|| tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_WOOD.getLabel())
				|| tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_GRAVEL.getLabel())
				|| tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_BALLAST.getLabel())
		;
	}

	public ItemTCRail(TrackTypes t) {
		super(t.getItem().iconName);
		this.overridePath("tracks");
		this.type = t;
	}

	private boolean canPlaceTrack(World world, int x, int y, int z) {
		Block l1 = world.getBlock(x, y - 1, z);

		return canBeReplaced(world, x, y, z) && (World.doesBlockHaveSolidTopSurface(world ,x, y - 1, z) || l1 == BlockIDs.bridgePillar.block);
	}
	
	private boolean canBeReplaced(World world, int x, int y, int z){
		Block block = world.getBlock(x, y, z);
		return block == null || block.isReplaceable(world, x, y, z) || block instanceof BlockFlower
				|| block == Blocks.double_plant || block instanceof BlockMushroom;
	}

	/**
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * //@param posX[] array of gag
	 * //@param posZ[] array of gag
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
	private boolean putDownTurn(World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ,
			int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy,
			double cz, String type, Item idDrop) {
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
			placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
			TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
			tcRailStart.setType(TrackTypes.SMALL_STRAIGHT.getLabel());
			tcRailStart.setFacing(l);
			tcRailStart.isLinkedToRail = true;
			tcRailStart.linkedX = posX[0];
			tcRailStart.linkedY = y + 1;
			tcRailStart.linkedZ = posZ[0];
		}

		/** the turn starts with this rail */
		placeTrack(world,posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
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
			placeTrack(world,posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
			tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
		}

		if (putDownExitTrack) {
			/** Last rail is a 1 block straight */
			placeTrack(world,posExitX, y + 1, posExitZ, BlockIDs.tcRail.block, exitFacing);
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
		placeTrack(world,posX, posY, posZ, BlockIDs.tcRail.block, l);
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
		if(shouldDrop)tcRail.idDrop = ItemIDs.tcRailSmallStraight.item;
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
			
			if(canBeReplaced(world, x, y, z)){
				y--;
			}
			
			int l = MathHelper.floor_double((player!=null?player.rotationYaw:par10) * 4.0F / 360.0F + 0.5D) & 3;
			float yaw = MathHelper.wrapAngleTo180_float(player!=null?player.rotationYaw:par10);
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
					int[] xArray = { x, x, x + 1, x + 1, x + 2 };
					int[] zArray = { z, z - 1, z - 1, z - 2, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 3, z - 3, 2.5, x + 3,
							y + 1, z + 1, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;

				}
				if (l == 0) {
					int[] xArray = { x, x, x - 1, x - 1, x - 2 };
					int[] zArray = { z, z + 1, z + 1, z + 2, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 3, z + 3, 2.5, x - 2,
							y + 1, z, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x, x - 1, x - 1, x - 2, x - 2 };
					int[] zArray = { z, z, z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 3, z - 3, 2.5, x + 1,
							y + 1, z - 2, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 1, x + 2, x + 2 };
					int[] zArray = { z, z, z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 3, z + 3, 2.5, x, y + 1,
							z + 3, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}

				if (player==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.MEDIUM_LEFT_TURN) {

				if (l == 1) {
					int[] xArray = { x, x - 1, x - 1, x - 2, x - 2 };
					int[] zArray = { z, z, z + 1, z + 1, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x - 3, z + 3, 2.5, x + 1,
							y + 1, z + 3, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;

				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 1, x + 2, x + 2 };
					int[] zArray = { z, z, z - 1, z - 1, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x + 3, z - 3, 2.5, x, y + 1,
							z - 2, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x, x, x + 1, x + 1, x + 2 };
					int[] zArray = { z, z + 1, z + 1, z + 2, z + 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 3, x + 3, z + 3, 2.5, x + 3,
							y + 1, z, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}
				if (l == 2) {
					int[] xArray = { x, x, x - 1, x - 1, x - 2 };
					int[] zArray = { z, z - 1, z - 1, z - 2, z - 2 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 3, z - 3, 2.5, x - 2,
							y + 1, z + 1, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumTurn.item))
						return false;
				}

				if (player==null || !player.capabilities.isCreativeMode) {
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1,
							z, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1,
							z + 1, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1,
							z - 2, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1,
							z + 3, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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

				if (player==null || !player.capabilities.isCreativeMode) {
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1,
							z, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1,
							z + 1, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1,
							z + 3, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1,
							z - 2, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
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
				if (player ==null || !player.capabilities.isCreativeMode) {
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1,
							z, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1,
							z + 1, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1,
							z - 4, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1,
							z + 5, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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

				if (player ==null || !player.capabilities.isCreativeMode) {
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1,
							z, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1,
							z + 1, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1,
							z + 5, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1,
							z - 4, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
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
					
					/** Put down straight exit **/
					putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(),
							true, x + 2, y + 1, z - 1, false, false);

				}
				if (player ==null || !player.capabilities.isCreativeMode) {
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
				if (player ==null || !player.capabilities.isCreativeMode) {
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
				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.LARGE_RIGHT_TURN) {

				if (l == 2) {
					int[] xArray = { x, x, x + 1, x + 1, x + 2, x, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
					int[] zArray = { z, z - 1, z - 1, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 4, z - 4, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 5, z - 5, 4.5, x + 5,
							y + 1, z + 1, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x, x, x, x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
					int[] zArray = { z, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 3, z + 4, z + 4, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 5, z + 5, 4.5, x - 4,
							y + 1, z, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x, x - 1, x - 1, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 4, x - 4, x - 4 };
					int[] zArray = { z, z, z - 1, z, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 5, z - 5, 4.5, x + 1,
							y + 1, z - 4, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 2, x + 1, x + 2, x + 2, x + 3, x + 3, x + 3, x + 4, x + 4, x + 4 };
					int[] zArray = { z, z, z, z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 5, z + 5, 4.5, x, y + 1,
							z + 5, TrackTypes.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}

				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.LARGE_LEFT_TURN) {
				if (l == 2) {
					int[] xArray = { x, x, x - 1, x - 1, x - 2, x, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
					int[] zArray = { z, z - 1, z - 1, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 4, z - 4, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 5, z - 5, 4.5, x - 4,
							y + 1, z + 1, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x, x, x, x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
					int[] zArray = { z, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 3, z + 4, z + 4, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 5, z + 5, 4.5, x + 5,
							y + 1, z, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x, x - 1, x - 1, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 4, x - 4, x - 4 };
					int[] zArray = { z, z, z + 1, z, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 5, z + 5, 4.5, x + 1,
							y + 1, z + 5, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 2, x + 1, x + 2, x + 2, x + 3, x + 3, x + 3, x + 4, x + 4, x + 4 };
					int[] zArray = { z, z, z, z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 5, z - 5, 4.5, x, y + 1,
							z - 4, TrackTypes.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeTurn.item))
						return false;
				}
				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.VERY_LARGE_RIGHT_TURN) {

				if (l == 2) {
					int[] xArray = { x, x, x, x + 1, x, x + 1, x, x + 1, x + 1, x + 2, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 5, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 9 };
					int[] zArray = { z, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 4, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 7, z - 8, z - 9, z - 8, z - 9, z - 8, z - 9, z - 9, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 10, z - 10, 9.5, x + 10,
							y + 1, z + 1, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(),
							ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x, x, x, x - 1, x, x - 1, x, x - 1, x - 2, x - 1, x - 2, x - 2,
							x - 3, x - 3, x - 4, x - 5, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 9 };
					int[] zArray = { z, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 6,
							z + 6, z + 7, z + 7, z + 7, z + 8, z + 8, z + 9, z + 8, z + 9, z + 8, z + 9, z + 9, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 10, z + 10, 9.5, x - 9,
							y + 1, z, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 7, x - 8, x - 9, x - 8, x - 9, x - 8, x - 9, x - 9, x - 9 };
					int[] zArray = { z, z, z, z - 1, z, z - 1, z, z - 1, z - 2, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 10, z - 10, 9.5, x + 1,
							y + 1, z - 9, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(),
							ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 7, x + 8, x + 9, x + 8, x + 9, x + 8, x + 9, x + 9, x + 9 };
					int[] zArray = { z, z, z, z + 1, z, z + 1, z, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 5, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 8, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 10, z + 10, 9.5, x, y + 1,
							z + 10, TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}

				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (tempType == TrackTypes.VERY_LARGE_LEFT_TURN) {
				if (l == 2) {
					int[] xArray = { x, x, x, x - 1, x, x - 1, x, x - 1, x - 2, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 5, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 9 };
					int[] zArray = { z, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 7, z - 8, z - 8, z - 9, z - 8, z - 9, z - 8, z - 9, z - 9, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x - 10, z - 10, 9.5, x - 9,
							y + 1, z + 1, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 0) {
					int[] xArray = { x, x, x, x + 1, x, x + 1, x, x + 1, x + 2, x + 1, x + 2, x + 2,
							x + 3, x + 3, x + 4, x + 4, x + 5, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 9 };
					int[] zArray = { z, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 6,
							z + 6, z + 7, z + 7, z + 8, z + 7, z + 8, z + 9, z + 8, z + 9, z + 8, z + 9, z + 9, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 1, x + 10, z + 10, 9.5, x + 10,
							y + 1, z, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 1) {
					int[] xArray = { x, x - 1, x - 2, x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 6, x - 6, x - 7, x - 7, x - 8, x - 7, x - 8, x - 9, x - 8, x - 9, x - 8, x - 9, x - 9, x - 9 };
					int[] zArray = { z, z, z, z + 1, z, z + 1, z, z + 1, z + 2, z + 1, z + 2, z + 2, z + 3, z + 3, z + 4, z + 4, z + 5, z + 5, z + 5, z + 6, z + 6, z + 7, z + 7, z + 8, z + 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 2, x - 10, z + 10, 9.5, x + 1,
							y + 1, z + 10, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(),
							ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (l == 3) {
					int[] xArray = { x, x + 1, x + 2, x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 6, x + 6, x + 7, x + 7, x + 8, x + 7, x + 8, x + 9, x + 8, x + 9, x + 8, x + 9, x + 9, x + 9 };
					int[] zArray = { z, z, z, z - 1, z, z - 1, z, z - 1, z - 2, z - 1, z - 2, z - 2, z - 3, z - 3, z - 4, z - 4, z - 5, z - 5, z - 5, z - 6, z - 6, z - 7, z - 7, z - 8, z - 9 };
					if (!putDownTurn(world, false, x, y, z, xArray, zArray, l, false, 0, x + 10, z - 10, 9.5, x, y + 1,
							z - 9, TrackTypes.VERY_LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailVeryLargeTurn.item))
						return false;
				}
				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.SLOPE_WOOD || type == TrackTypes.SLOPE_GRAVEL || type == TrackTypes.SLOPE_BALLAST
					|| type == TrackTypes.LARGE_SLOPE_WOOD || type == TrackTypes.LARGE_SLOPE_GRAVEL
					|| type == TrackTypes.LARGE_SLOPE_BALLAST || type == TrackTypes.VERY_LARGE_SLOPE_WOOD
					|| type == TrackTypes.VERY_LARGE_SLOPE_GRAVEL || type == TrackTypes.VERY_LARGE_SLOPE_BALLAST
			) {
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}
	
				int gagEnd = 0;
				double slopeAngle = 0;
				/**
				 * Explanation: normally you would devide 100 by (gagEnd+1) but this seems to be
				 * against TCs own brain. you need to devide 100 by (gagEnd+1)
				 **/
				if (type == TrackTypes.SLOPE_WOOD || type == TrackTypes.SLOPE_GRAVEL
						|| type == TrackTypes.SLOPE_BALLAST) {
					gagEnd = 5;
					slopeAngle = 0.13;
				}
				
				if (type == TrackTypes.LARGE_SLOPE_WOOD || type == TrackTypes.LARGE_SLOPE_GRAVEL
						|| type == TrackTypes.LARGE_SLOPE_BALLAST) {
					gagEnd = 11;
					slopeAngle = 0.0666;
				}
				
				if (type == TrackTypes.VERY_LARGE_SLOPE_WOOD || type == TrackTypes.VERY_LARGE_SLOPE_GRAVEL
						|| type == TrackTypes.VERY_LARGE_SLOPE_BALLAST) {
					gagEnd = 17;
					slopeAngle = 0.0444;
				}
	
				Item idDropped = this.type.getItem().item;
				TileTCRailGag[] tileGag = new TileTCRailGag[gagEnd];

				for (int i = 1; i <= gagEnd; i++) {
					if (l == 2) {
						if (!canPlaceTrack(world, x, y + 1, z - i)) {
							return false;
						}
					}
					if (l == 0) {
						if (!canPlaceTrack(world, x, y + 1, z + i)) {
							return false;
						}
					}
					if (l == 1) {
						if (!canPlaceTrack(world, x - i, y + 1, z)) {
							return false;
						}
					}
					if (l == 3) {
						if (!canPlaceTrack(world, x + i, y + 1, z)) {
							return false;
						}
					}
				}
				placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
				TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
				tcRail.setFacing(l);
				tcRail.setType(type.getLabel());
				tcRail.idDrop = idDropped;
				tcRail.slopeHeight = 1;
				tcRail.slopeAngle = slopeAngle;
				tcRail.slopeLength = gagEnd + 1;
				for (int i2 = 1; i2 <= gagEnd; i2++) {
					if (l == 2) {
						placeTrack(world,x, y + 1, z - i2, BlockIDs.tcRailGag.block, l);
						tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - i2);
						tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd ));
					}
					if (l == 0) {
						placeTrack(world,x, y + 1, z + i2, BlockIDs.tcRailGag.block, l);
						tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + i2);
						tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
					}
					if (l == 1) {
						placeTrack(world,x - i2, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x - i2, y + 1, z);
						tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
					}
					if (l == 3) {
						placeTrack(world,x + i2, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x + i2, y + 1, z);
						tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
					}
				}
				for (int i = 0; i < tileGag.length; i++) {
					if (player != null && tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText(
								"There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = type.getLabel();
				}
				if (player ==null || !player.capabilities.isCreativeMode) {
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
						if (!canPlaceTrack(world, x, y + 1, z - 3) || !canPlaceTrack(world, x, y + 1, z - 4)
								|| !canPlaceTrack(world, x, y + 1, z - 5)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}
					
					placeTrack(world,x, y + 1, z - 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);
					
					placeTrack(world,x, y + 1, z - 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);
					
					if (type == TrackTypes.LONG_STRAIGHT) {
						placeTrack(world,x, y + 1, z - 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z - 3);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z - 1;
						
						placeTrack(world,x, y + 1, z - 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);
						
						placeTrack(world,x, y + 1, z - 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);
					}
					
				}
				if (l == 0) {
					if (!canPlaceTrack(world, x, y + 1, z + 1) || !canPlaceTrack(world, x, y + 1, z + 2)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x, y + 1, z + 3) || !canPlaceTrack(world, x, y + 1, z + 4)
								|| !canPlaceTrack(world, x, y + 1, z + 5)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}
					
					placeTrack(world,x, y + 1, z + 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);
					placeTrack(world,x, y + 1, z + 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);
					
					if (type == TrackTypes.LONG_STRAIGHT) {
						placeTrack(world,x, y + 1, z + 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z + 3);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z + 1;
						
						placeTrack(world,x, y + 1, z + 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);
						
						placeTrack(world,x, y + 1, z + 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);
					}
				}
				if (l == 1) {
					if (!canPlaceTrack(world, x - 1, y + 1, z) || !canPlaceTrack(world, x - 2, y + 1, z)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x - 3, y + 1, z) || !canPlaceTrack(world, x - 4, y + 1, z)
								|| !canPlaceTrack(world, x - 5, y + 1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}
					
					placeTrack(world,x - 1, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);
					placeTrack(world,x - 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z);
					if (type == TrackTypes.LONG_STRAIGHT) {
						placeTrack(world,x - 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x - 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z;
						
						placeTrack(world,x - 4, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);
						
						placeTrack(world,x - 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);
					}
				}
				if (l == 3) {
					if (!canPlaceTrack(world, x + 1, y + 1, z) || !canPlaceTrack(world, x + 2, y + 1, z)) {
						return false;
					}
					if (type == TrackTypes.LONG_STRAIGHT) {
						if (!canPlaceTrack(world, x + 3, y + 1, z) || !canPlaceTrack(world, x + 5, y + 1, z)
								|| !canPlaceTrack(world, x + 5, y + 1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
					if (type == TrackTypes.LONG_STRAIGHT) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}
					
					placeTrack(world,x + 1, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);
					
					placeTrack(world,x + 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z);
					
					if (type == TrackTypes.LONG_STRAIGHT) {
						placeTrack(world,x + 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(TrackTypes.MEDIUM_STRAIGHT.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x + 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z;
						
						placeTrack(world,x + 4, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);
						
						placeTrack(world,x + 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);
					}
				}
				
				for (int i = 0; i < tileGag.length; i++) {
					if (player !=null && tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = TrackTypes.MEDIUM_STRAIGHT.getLabel();
				}
				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}
			if (type == TrackTypes.SMALL_STRAIGHT || type == TrackTypes.SMALL_ROAD_CROSSING || type == TrackTypes.SMALL_ROAD_CROSSING_1 || type == TrackTypes.SMALL_ROAD_CROSSING_2) {
				if (!canPlaceTrack(world, x, y + 1, z)) {
					return false;
				}
				placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
				TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
				tcRail.setFacing(l);
				tcRail.cx = x;
				tcRail.cy = y + 1;
				tcRail.cz = z;
				tcRail.setType(type.getLabel());
				tcRail.idDrop = this.type.getItem().item;

				if (player ==null || !player.capabilities.isCreativeMode) {
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
					xSideDisplace = 1;
					sideFacing=1;
				}
				if (l == 3) {
					xDisplace = 1;
					zSideDisplace=1;
					sideFacing=2;
				}
				if (l == 0) {
					zDisplace = 1;
					xSideDisplace = 1;
					sideFacing = 1;
				}
				if (l == 1) {
					xDisplace = -1;
					zSideDisplace=1;
					sideFacing=2;
				}

				if (!canPlaceTrack(world, x + xDisplace, y + 1, z + zDisplace)
						|| !canPlaceTrack(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
					return false;
				}
				if (!canPlaceTrack(world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace))) {
					return false;
				}
				if (!canPlaceTrack(world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace))) {
					return false;
				}

				/*
				 * Bottom
				 */
				
				putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
						z + (zDisplace * 2), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace), y + 1,
						z + (zDisplace), false, false);
				
				// putDownSingleRail(world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l,
				// x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0,
				// TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1,
				// z+(zDisplace*3), false, false);



				placeTrack(world,x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
				TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
				tcRail2.setFacing(l);
				tcRail2.cx = x + (xDisplace);
				tcRail2.cy = y + 1;
				tcRail2.cz = z + (zDisplace);
				tcRail2.setType(type.getLabel());
				tcRail2.idDrop = this.type.getItem().item;

				/*
				 * Top
				 */
				
				// putDownSingleRail(world, x + (xDisplace), y + 1, z + (zDisplace), l, x +
				// (xDisplace), y + 1,
				// z + (zDisplace), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x +
				// (xDisplace * 2), y + 1,
				// z + (zDisplace * 2), false, false);

				putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true,
						x + (xDisplace), y + 1, z + (zDisplace), false, false);
				
				/*
				 * Right
				 */
				
				putDownSingleRail(world, x + (xDisplace) + (xSideDisplace), y + 1,
						z + (zDisplace) + (zSideDisplace), sideFacing,
						x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace) + (zSideDisplace), 0,
						TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);
				
				// putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace * 2), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace * 2), sideFacing,
				// x + (xDisplace * 2) + (xSideDisplace * 2), y + 1, z + (zDisplace * 2) +
				// (zSideDisplace * 2), 0,
				// TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace * 2) + (xSideDisplace
				//), y + 1,
				// z + (zDisplace * 2) + (zSideDisplace), false, false);
				
				/*
				 * Left
				 */
				
				putDownSingleRail(world, x + (xDisplace) - (xSideDisplace), y + 1,
						z + (zDisplace) - (zSideDisplace), sideFacing,
						x + (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace) - (zSideDisplace), 0,
						TrackTypes.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace), y + 1, z + (zDisplace),
						false, false);

//				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);
				
				if (player ==null || !player.capabilities.isCreativeMode) {
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9,
				TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5,
					TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8,
				TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6,
					TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 2;
		}

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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5,
				TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10,
					TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5,
				TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9,
					TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5,
				TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9,
					TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5,
				TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10,
					TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8,
				TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x + 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6,
					TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;

				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 4;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 2;
		}
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
		if (!putDownTurn(world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9,
				TrackTypes.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5,
					TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
		/** Put down straight **/
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), false, x - 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x - 3, y + 1, z + 1, false, false);
		}
		return true;
	}
	
	/**
	 * Drop the previous block before placing the track.
	 */
	private void placeTrack(World world, int x, int y, int z, Block block, int metadata){
		Block removed = world.getBlock(x, y, z);
		if(removed != null){
			removed.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		}
		world.setBlock(x, y, z, block, metadata, 3);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + type.getTooltip());
	}
}

