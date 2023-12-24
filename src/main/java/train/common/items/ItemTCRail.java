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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.util.vector.Matrix2f;
import org.lwjgl.util.vector.Vector2f;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import javax.annotation.Nullable;
import java.util.List;

import static train.common.items.TCRailTypes.*;

public class ItemTCRail extends ItemPart {


    private final TrackTypes type;

    private String typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
    private String typeVariantDiagonal = TrackTypes.SMALL_DIAGONAL_STRAIGHT.getLabel();
    private String typeVariant90Turn;
    private String typeVariantCrossing;
    private Item idVariantSwitch;
    TrackTypes tempType;

    public enum TrackTypes {
        /**
         * Normal Tracks
         */
        SMALL_STRAIGHT("SMALL_STRAIGHT", STRAIGHT, ItemIDs.tcRailSmallStraight, "1x1"),
        MEDIUM_STRAIGHT("MEDIUM_STRAIGHT", STRAIGHT, ItemIDs.tcRailMediumStraight, "1x3"),
        LONG_STRAIGHT("LONG_STRAIGHT", STRAIGHT, ItemIDs.tcRailLongStraight, "1x6"),
        VERY_LONG_STRAIGHT("VERY_LONG_STRAIGHT", STRAIGHT, ItemIDs.tcRailVeryLongStraight, "1x12"),

        SMALL_DIAGONAL_STRAIGHT("SMALL_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailSmallDiagonalStraight, "1x1"),
        MEDIUM_DIAGONAL_STRAIGHT("MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailMediumDiagonalStraight, "1x3"),
        LONG_DIAGONAL_STRAIGHT("LONG_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailLongDiagonalStraight, "1x6"),
        VERY_LONG_DIAGONAL_STRAIGHT("VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailVeryLongDiagonalStraight, "1x12"),


        MEDIUM_TURN("MEDIUM_TURN", TURN, ItemIDs.tcRailMediumTurn, "3x3"),
        MEDIUM_RIGHT_TURN("MEDIUM_RIGHT_TURN", TURN, ItemIDs.tcRailMediumTurn, ""),
        MEDIUM_LEFT_TURN("MEDIUM_LEFT_TURN", TURN, ItemIDs.tcRailMediumTurn, ""),

        LARGE_TURN("LARGE_TURN", TURN, ItemIDs.tcRailLargeTurn, "5x5"),
        LARGE_RIGHT_TURN("LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailLargeTurn, ""),
        LARGE_LEFT_TURN("LARGE_LEFT_TURN", TURN, ItemIDs.tcRailLargeTurn, ""),

        VERY_LARGE_TURN("VERY_LARGE_TURN", TURN, ItemIDs.tcRailVeryLargeTurn, "10x10"),
        VERY_LARGE_RIGHT_TURN("VERY_LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailVeryLargeTurn, ""),
        VERY_LARGE_LEFT_TURN("VERY_LARGE_LEFT_TURN", TURN, ItemIDs.tcRailVeryLargeTurn, ""),

        SUPER_LARGE_TURN("SUPER_LARGE_TURN", TURN, ItemIDs.tcRailSuperLargeTurn, "16x16"),
        SUPER_LARGE_LEFT_TURN("SUPER_LARGE_LEFT_TURN", TURN, ItemIDs.tcRailSuperLargeTurn, ""),
        SUPER_LARGE_RIGHT_TURN("SUPER_LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailSuperLargeTurn, ""),

        TURN_29X29("TURN_29X29", TURN, ItemIDs.tcRail29X29Turn, "29x29"),
        LEFT_TURN_29X29("LEFT_TURN_29X29", TURN, ItemIDs.tcRail29X29Turn, ""),
        RIGHT_TURN_29X29("RIGHT_TURN_29X29", TURN, ItemIDs.tcRail29X29Turn, ""),

        TURN_32X32("TURN_32X32", TURN, ItemIDs.tcRail32X32Turn, "32x32"),
        LEFT_TURN_32X32("LEFT_TURN_32X32", TURN, ItemIDs.tcRail32X32Turn, ""),
        RIGHT_TURN_32X32("RIGHT_TURN_32X32", TURN, ItemIDs.tcRail32X32Turn, ""),

        MEDIUM_45DEGREE_TURN("MEDIUM_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailMedium45DegreeTurn, "3x4 hold sneak to attach to the back of another curve"),
        MEDIUM_RIGHT_45DEGREE_TURN("MEDIUM_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailMedium45DegreeTurn, ""),
        MEDIUM_LEFT_45DEGREE_TURN("MEDIUM_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailMedium45DegreeTurn, ""),

        LARGE_45DEGREE_TURN("LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailLarge45DegreeTurn, "3x6 hold sneak to attach to the back of another curve"),
        LARGE_RIGHT_45DEGREE_TURN("LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailLarge45DegreeTurn, ""),
        LARGE_LEFT_45DEGREE_TURN("LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailLarge45DegreeTurn, ""),

        VERY_LARGE_45DEGREE_TURN("VERY_LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailVeryLarge45DegreeTurn, "4x8 hold sneak to attach to the back of another curve"),
        VERY_LARGE_RIGHT_45DEGREE_TURN("VERY_LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailVeryLarge45DegreeTurn, ""),
        VERY_LARGE_LEFT_45DEGREE_TURN("VERY_LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailVeryLarge45DegreeTurn, ""),



        SUPER_LARGE_45DEGREE_TURN("SUPER_LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailSuperLarge45DegreeTurn, "5x11 hold sneak to attach to the back of another curve"),
        SUPER_LARGE_RIGHT_45DEGREE_TURN("SUPER_LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailSuperLarge45DegreeTurn, ""),
        SUPER_LARGE_LEFT_45DEGREE_TURN("SUPER_LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailSuperLarge45DegreeTurn, ""),

        SMALL_PARALLEL_CURVE("SMALL_PARALLEL_CURVE", CURVE, ItemIDs.tcRailSmallParallelCurve, "2x8"),
        SMALL_RIGHT_PARALLEL_CURVE("SMALL_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailSmallParallelCurve, ""),
        SMALL_LEFT_PARALLEL_CURVE("SMALL_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailSmallParallelCurve, ""),

        MEDIUM_PARALLEL_CURVE("MEDIUM_PARALLEL_CURVE", CURVE, ItemIDs.tcRailMediumParallelCurve, "3x12"),
        MEDIUM_RIGHT_PARALLEL_CURVE("MEDIUM_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailMediumParallelCurve, ""),
        MEDIUM_LEFT_PARALLEL_CURVE("MEDIUM_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailMediumParallelCurve, ""),

        LARGE_PARALLEL_CURVE("LARGE_PARALLEL_CURVE", CURVE, ItemIDs.tcRailLargeParallelCurve, "4x16"),
        LARGE_RIGHT_PARALLEL_CURVE("LARGE_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailLargeParallelCurve, ""),
        LARGE_LEFT_PARALLEL_CURVE("LARGE_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailLargeParallelCurve, ""),

        TWO_WAYS_CROSSING("TWO_WAYS_CROSSING", CROSSING, ItemIDs.tcRailTwoWaysCrossing, "3x3"),

        DIAMOND_CROSSING("DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailDiamondCrossing, "3x3"),
        RIGHT_DIAMOND_CROSSING("RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailDiamondCrossing, "3x3"),
        LEFT_DIAMOND_CROSSING("LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailDiamondCrossing, "3x3"),

        DOUBLE_DIAMOND_CROSSING("DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailDoubleDiamondCrossing, "3x3"),
        DIAGONAL_TWO_WAYS_CROSSING("DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailDiagonalTwoWaysCrossing, "3x3"),
        FOUR_WAYS_CROSSING("FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailFourWaysCrossing, "3x3"),

        MEDIUM_SWITCH("MEDIUM_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailMediumSwitch, "4x4"),
        MEDIUM_RIGHT_SWITCH("MEDIUM_SWITCH", SWITCH, ItemIDs.tcRailMediumSwitch, ""),
        MEDIUM_LEFT_SWITCH("MEDIUM_LEFT_SWITCH", SWITCH, ItemIDs.tcRailMediumSwitch, ""),

        LARGE_SWITCH("LARGE_SWITCH", SWITCH, ItemIDs.tcRailLargeSwitch, "6x6"),
        LARGE_RIGHT_SWITCH("LARGE_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailLargeSwitch, ""),
        LARGE_LEFT_SWITCH("LARGE_LEFT_SWITCH", SWITCH, ItemIDs.tcRailLargeSwitch, ""),

        VERY_LARGE_SWITCH("VERY_LARGE_SWITCH", SWITCH, ItemIDs.tcRailVeryLargeSwitch, "11x11"),
        VERY_LARGE_RIGHT_SWITCH("VERY_LARGE_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailVeryLargeSwitch, ""),
        VERY_LARGE_LEFT_SWITCH("VERY_LARGE_LEFT_SWITCH", SWITCH, ItemIDs.tcRailVeryLargeSwitch, ""),

        MEDIUM_PARALLEL_SWITCH("MEDIUM_PARALLEL_SWITCH", SWITCH, ItemIDs.tcRailMediumParallelSwitch, "4x11"),
        MEDIUM_RIGHT_PARALLEL_SWITCH("MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, ItemIDs.tcRailMediumParallelSwitch, ""),
        MEDIUM_LEFT_PARALLEL_SWITCH("MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, ItemIDs.tcRailMediumParallelSwitch, ""),

        MEDIUM_45DEGREE_SWITCH("MEDIUM_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailMedium45DegreeSwitch, "3x5 hold sneak to attach to the back of another curve"),
        MEDIUM_RIGHT_45DEGREE_SWITCH("MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailMedium45DegreeSwitch, ""),
        MEDIUM_LEFT_45DEGREE_SWITCH("MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailMedium45DegreeSwitch, ""),

        SLOPE_WOOD("SLOPE_WOOD", SLOPE, ItemIDs.tcRailSlopeWood, "1x6"),
        LARGE_SLOPE_WOOD("LARGE_SLOPE_WOOD", SLOPE, ItemIDs.tcRailLargeSlopeWood, "1x12"),
        VERY_LARGE_SLOPE_WOOD("VERY_LARGE_SLOPE_WOOD", SLOPE, ItemIDs.tcRailVeryLargeSlopeWood, "1x18"),

        SLOPE_GRAVEL("SLOPE_GRAVEL", SLOPE, ItemIDs.tcRailSlopeGravel, "1x6"),
        LARGE_SLOPE_GRAVEL("LARGE_SLOPE_GRAVEL", SLOPE, ItemIDs.tcRailLargeSlopeGravel, "1x12"),
        VERY_LARGE_SLOPE_GRAVEL("VERY_LARGE_SLOPE_GRAVEL", SLOPE, ItemIDs.tcRailVeryLargeSlopeGravel, "1x18"),

        SLOPE_BALLAST("SLOPE_BALLAST", SLOPE, ItemIDs.tcRailSlopeBallast, "1x6"),
        LARGE_SLOPE_BALLAST("LARGE_SLOPE_BALLAST", SLOPE, ItemIDs.tcRailLargeSlopeBallast, "1x12"),
        VERY_LARGE_SLOPE_BALLAST("VERY_LARGE_SLOPE_BALLAST", SLOPE, ItemIDs.tcRailVeryLargeSlopeBallast, "1x18"),

        SLOPE_SNOW_GRAVEL("SLOPE_SNOW_GRAVEL", SLOPE, ItemIDs.tcRailSlopeSnowGravel, "1x6"),
        LARGE_SLOPE_SNOW_GRAVEL("LARGE_SLOPE_SNOW_GRAVEL", SLOPE, ItemIDs.tcRailLargeSlopeSnowGravel, "1x12"),
        VERY_LARGE_SLOPE_SNOW_GRAVEL("VERY_LARGE_SLOPE_SNOW_GRAVEL", SLOPE, ItemIDs.tcRailVeryLargeSlopeSnowGravel, "1x18"),

        SLOPE_DYNAMIC("SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailSlopeDynamic, "1x6"),
        LARGE_SLOPE_DYNAMIC("LARGE_SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailLargeSlopeDynamic, "1x12" ),
        VERY_LARGE_SLOPE_DYNAMIC("VERY_LARGE_SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailVeryLargeSlopeDynamic, "1x18"),

        LARGE_CURVED_SLOPE_DYNAMIC("LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailLargeCurvedSlopeDynamic, "5x5"),
        LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailLargeCurvedSlopeDynamic, "xxx"),
        LARGE_LEFT_CURVED_SLOPE_DYNAMIC("LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailLargeCurvedSlopeDynamic, "xxx"),

        VERY_LARGE_CURVED_SLOPE_DYNAMIC("VERY_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailVeryLargeCurvedSlopeDynamic, "9x9"),
        VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailVeryLargeSlopeDynamic, "xxx"),
        VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailVeryLargeCurvedSlopeDynamic, "xxx"),

        SUPER_LARGE_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailSuperLargeCurvedSlopeDynamic, "16x16"),
        SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailSuperLargeCurvedSlopeDynamic, "xxx"),
        SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailSuperLargeCurvedSlopeDynamic, "xxx"),
        /**
         * Embedded Tracks
         */

        EMBEDDED_SMALL_STRAIGHT("EMBEDDED_SMALL_STRAIGHT", STRAIGHT, ItemIDs.tcRailEmbeddedSmallStraight, "1x1"),
        EMBEDDED_MEDIUM_STRAIGHT("EMBEDDED_MEDIUM_STRAIGHT", STRAIGHT, ItemIDs.tcRailEmbeddedMediumStraight, "1x3"),
        EMBEDDED_LONG_STRAIGHT("EMBEDDED_LONG_STRAIGHT", STRAIGHT, ItemIDs.tcRailEmbeddedLongStraight, "1x6"),
        EMBEDDED_VERY_LONG_STRAIGHT("EMBEDDED_VERY_LONG_STRAIGHT", STRAIGHT, ItemIDs.tcRailEmbeddedVeryLongStraight, "1x12"),

        EMBEDDED_SMALL_DIAGONAL_STRAIGHT("EMBEDDED_SMALL_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailEmbeddedSmallDiagonalStraight, "1x1"),
        EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT("EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailEmbeddedMediumDiagonalStraight, "1x3"),
        EMBEDDED_LONG_DIAGONAL_STRAIGHT("EMBEDDED_LONG_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailEmbeddedLongDiagonalStraight, "1x6"),
        EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT("EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, ItemIDs.tcRailEmbeddedVeryLongDiagonalStraight, "1x12"),

        EMBEDDED_MEDIUM_TURN("EMBEDDED_MEDIUM_TURN", TURN, ItemIDs.tcRailEmbeddedMediumTurn, "3x3"),
        EMBEDDED_MEDIUM_RIGHT_TURN("EMBEDDED_MEDIUM_RIGHT_TURN", TURN, ItemIDs.tcRailEmbeddedMediumTurn, ""),
        EMBEDDED_MEDIUM_LEFT_TURN("EMBEDDED_MEDIUM_LEFT_TURN", TURN, ItemIDs.tcRailEmbeddedMediumTurn, ""),

        EMBEDDED_LARGE_TURN("EMBEDDED_LARGE_TURN", TURN, ItemIDs.tcRailEmbeddedLargeTurn, "5x5"),
        EMBEDDED_LARGE_RIGHT_TURN("EMBEDDED_LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailEmbeddedLargeTurn, ""),
        EMBEDDED_LARGE_LEFT_TURN("EMBEDDED_LARGE_LEFT_TURN", TURN, ItemIDs.tcRailEmbeddedLargeTurn, ""),

        EMBEDDED_VERY_LARGE_TURN("EMBEDDED_VERY_LARGE_TURN", TURN, ItemIDs.tcRailEmbeddedVeryLargeTurn, "10x10"),
        EMBEDDED_VERY_LARGE_RIGHT_TURN("EMBEDDED_VERY_LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailEmbeddedVeryLargeTurn, ""),
        EMBEDDED_VERY_LARGE_LEFT_TURN("EMBEDDED_VERY_LARGE_LEFT_TURN", TURN, ItemIDs.tcRailEmbeddedVeryLargeTurn, ""),

        EMBEDDED_SUPER_LARGE_TURN("EMBEDDED_SUPER_LARGE_TURN", TURN, ItemIDs.tcRailEmbeddedSuperLargeTurn, "16x16"),
        EMBEDDED_SUPER_LARGE_RIGHT_TURN("EMBEDDED_SUPER_LARGE_RIGHT_TURN", TURN, ItemIDs.tcRailEmbeddedSuperLargeTurn, ""),
        EMBEDDED_SUPER_LARGE_LEFT_TURN("EMBEDDED_SUPER_LARGE_LEFT_TURN", TURN, ItemIDs.tcRailEmbeddedSuperLargeTurn, ""),

        EMBEDDED_TURN_29X29("EMBEDDED_TURN_29X29", TURN, ItemIDs.tcRailEmbedded29X29Turn, "29x29"),
        EMBEDDED_LEFT_TURN_29X29("EMBEDDED_LEFT_TURN_29X29", TURN, ItemIDs.tcRailEmbedded29X29Turn, ""),
        EMBEDDED_RIGHT_TURN_29X29("EMBEDDED_RIGHT_TURN_29X29", TURN, ItemIDs.tcRailEmbedded29X29Turn, ""),
        EMBEDDED_TURN_32X32("EMBEDDED_TURN_32X32", TURN, ItemIDs.tcRailEmbedded32X32Turn, "32x32"),
        EMBEDDED_LEFT_TURN_32X32("EMBEDDED_LEFT_TURN_32X32", TURN, ItemIDs.tcRailEmbedded32X32Turn, ""),
        EMBEDDED_RIGHT_TURN_32X32("EMBEDDED_RIGHT_TURN_32X32", TURN, ItemIDs.tcRailEmbedded32X32Turn, ""),

        EMBEDDED_MEDIUM_45DEGREE_TURN("EMBEDDED_MEDIUM_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, "3x4 hold sneak to attach to the back of another curve"),
        EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN("EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, ""),
        EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN("EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, ""),

        EMBEDDED_LARGE_45DEGREE_TURN("EMBEDDED_LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, "3x6 hold sneak to attach to the back of another curve"),
        EMBEDDED_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, ""),
        EMBEDDED_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, ""),



        EMBEDDED_VERY_LARGE_45DEGREE_TURN("EMBEDDED_VERY_LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, "4x8 hold sneak to attach to the back of another curve"),
        EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, ""),
        EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, ""),


        EMBEDDED_SUPER_LARGE_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, "5x11 hold sneak to attach to the back of another curve"),
        EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, ""),
        EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN", SHARP_TURN, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, ""),

        EMBEDDED_SMALL_PARALLEL_CURVE("EMBEDDED_SMALL_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedSmallParallelCurve, "2x8"),
        EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE("EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedSmallParallelCurve, ""),
        EMBEDDED_SMALL_LEFT_PARALLEL_CURVE("EMBEDDED_SMALL_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedSmallParallelCurve, ""),

        EMBEDDED_MEDIUM_PARALLEL_CURVE("EMBEDDED_MEDIUM_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedMediumParallelCurve, "3x12"),
        EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE("EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedMediumParallelCurve, ""),
        EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE("EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedMediumParallelCurve, ""),

        EMBEDDED_LARGE_PARALLEL_CURVE("EMBEDDED_LARGE_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedLargeParallelCurve, "4x16"),
        EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE("EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedLargeParallelCurve, ""),
        EMBEDDED_LARGE_LEFT_PARALLEL_CURVE("EMBEDDED_LARGE_LEFT_PARALLEL_CURVE", CURVE, ItemIDs.tcRailEmbeddedLargeParallelCurve, ""),

        EMBEDDED_TWO_WAYS_CROSSING("EMBEDDED_TWO_WAYS_CROSSING", CROSSING, ItemIDs.tcRailEmbeddedTwoWaysCrossing, "3x3"),
        EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING("EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedDiagonalTwoWaysCrossing, "3x3"),
        EMBEDDED_FOUR_WAYS_CROSSING("EMBEDDED_FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedFourWaysCrossing, "3x3"),

        EMBEDDED_DIAMOND_CROSSING("EMBEDDED_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
        EMBEDDED_RIGHT_DIAMOND_CROSSING("EMBEDDED_RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
        EMBEDDED_LEFT_DIAMOND_CROSSING("EMBEDDED_LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
        EMBEDDED_DOUBLE_DIAMOND_CROSSING("EMBEDDED_DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, ItemIDs.tcRailEmbeddedDoubleDiamondCrossing, "3x3"),


        EMBEDDED_MEDIUM_SWITCH("EMBEDDED_MEDIUM_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMediumSwitch, "4x4"),
        EMBEDDED_MEDIUM_RIGHT_SWITCH("EMBEDDED_MEDIUM_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMediumSwitch, ""),
        EMBEDDED_MEDIUM_LEFT_SWITCH("EMBEDDED_MEDIUM_LEFT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMediumSwitch, ""),

        EMBEDDED_LARGE_SWITCH("EMBEDDED_LARGE_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedLargeSwitch, "6x6"),
        EMBEDDED_LARGE_RIGHT_SWITCH("EMBEDDED_LARGE_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedLargeSwitch, ""),
        EMBEDDED_LARGE_LEFT_SWITCH("EMBEDDED_LARGE_LEFT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedLargeSwitch, ""),

        EMBEDDED_VERY_LARGE_SWITCH("EMBEDDED_VERY_LARGE_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedVeryLargeSwitch, "11x11"),
        EMBEDDED_VERY_LARGE_RIGHT_SWITCH("EMBEDDED_VERY_LARGE_RIGHT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedVeryLargeSwitch, ""),
        EMBEDDED_VERY_LARGE_LEFT_SWITCH("EMBEDDED_VERY_LARGE_LEFT_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedVeryLargeSwitch, ""),
        EMBEDDED_MEDIUM_PARALLEL_SWITCH("EMBEDDED_", SWITCH, ItemIDs.tcRailEmbeddedMediumParallelSwitch, "4x11"),
        EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMediumParallelSwitch, ""),
        EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMediumParallelSwitch, ""),

        EMBEDDED_MEDIUM_45DEGREE_SWITCH("EMBEDDED_MEDIUM_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, "3x5 hold sneak to attach to the back of another curve"),
        EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, ""),
        EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch, ""),

        EMBEDDED_SLOPE_DYNAMIC("EMBEDDED_SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailEmbeddedSlopeDynamic, "1x6"),
        EMBEDDED_LARGE_SLOPE_DYNAMIC("EMBEDDED_LARGE_SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailEmbeddedLargeSlopeDynamic, "1x12"),
        EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC", SLOPE, ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic, "1x18"),

        EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "5x5"),
        EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "xxx"),
        EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "xxx"),

        EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "9x9"),
        EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "xxx"),
        EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "xxx"),

        EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "16x16"),
        EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "xxx"),
        EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "xxx"),

        SMALL_ROAD_CROSSING("SMALL_ROAD_CROSSING", STRAIGHT, ItemIDs.tcRailSmallRoadCrossing, "1x1"),
        SMALL_ROAD_CROSSING_1("SMALL_ROAD_CROSSING_1", STRAIGHT, ItemIDs.tcRailSmallRoadCrossing1, "1x1"),
        SMALL_ROAD_CROSSING_2("SMALL_ROAD_CROSSING_2", STRAIGHT, ItemIDs.tcRailSmallRoadCrossing2, "1x1");


        private final String label;
        private final TCRailTypes type;
        private final ItemIDs item;
        private final String tooltip;

        TrackTypes(String label, TCRailTypes type, ItemIDs item, String tooltip) {
            this.label = label;
            this.type = type;
            this.item = item;
            this.tooltip = tooltip;
        }

        public String getLabel() {
            return this.label;
        }

        public TCRailTypes getType() {
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
        if (tile == null || tile.getType() == null) {
            return false;
        }

        return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()) && tile.getSwitchState())
                || tile.getType().equals(TrackTypes.MEDIUM_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.RIGHT_TURN_29X29.getLabel())
                || tile.getType().equals(TrackTypes.LEFT_TURN_29X29.getLabel())
                || tile.getType().equals(TrackTypes.RIGHT_TURN_32X32.getLabel())
                || tile.getType().equals(TrackTypes.LEFT_TURN_32X32.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_LEFT_45DEGREE_TURN.getLabel())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()) && tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()) && tile.getSwitchState())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_RIGHT_TURN_29X29.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LEFT_TURN_29X29.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_RIGHT_TURN_32X32.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LEFT_TURN_32X32.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN.getLabel())

                ;

    }

    public static boolean isTCStraightTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()) && !tile.getSwitchState())
                || tile.getType().equals(TrackTypes.MEDIUM_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LONG_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.LONG_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()) && !tile.getSwitchState())
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()) && !tile.getSwitchState())
                || tile.getType().equals(TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LONG_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_1.getLabel())
                || tile.getType().equals(TrackTypes.SMALL_ROAD_CROSSING_2.getLabel())

                ;
    }

    public static boolean isTCTwoWaysCrossingTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return (tile.getType().equals(TrackTypes.TWO_WAYS_CROSSING.getLabel())) || (tile.getType().equals(TrackTypes.EMBEDDED_TWO_WAYS_CROSSING.getLabel()));
    }

    public static boolean isTCDiagonalCrossingTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return (tile.getType().equals(TrackTypes.RIGHT_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.LEFT_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.DOUBLE_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_RIGHT_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_LEFT_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_DOUBLE_DIAMOND_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.DIAGONAL_TWO_WAYS_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.FOUR_WAYS_CROSSING.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_FOUR_WAYS_CROSSING.getLabel()))
                ;
    }

    public static boolean isTCSwitch(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return (tile.getType().equals(TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.LARGE_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.LARGE_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH.getLabel()))
                || (tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH.getLabel()));
    }

    public static boolean isTCSlopeTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return tile.getType().equals(TrackTypes.SLOPE_WOOD.getLabel())
                || tile.getType().equals(TrackTypes.SLOPE_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.SLOPE_BALLAST.getLabel())
                || tile.getType().equals(TrackTypes.SLOPE_SNOW_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_SLOPE_WOOD.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_SLOPE_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_SLOPE_BALLAST.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_SLOPE_SNOW_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_WOOD.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_BALLAST.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC.getLabel())
                ;
    }

    public static boolean isTCCurvedSlopeTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return tile.getType().equals(TrackTypes.LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC.getLabel())
                ;
    }

    public static boolean isTCDiagonalStraightTrack(TileTCRail tile) {
        if (tile == null || tile.getType() == null) {
            return false;
        }
        return tile.getType().equals(TrackTypes.SMALL_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.MEDIUM_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.LONG_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT.getLabel())
                || tile.getType().equals(TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT.getLabel())

                ;
    }


    public ItemTCRail(TrackTypes t) {
        super(t.getItem().iconName);
        this.overridePath("tracks");
        this.type = t;
    }

    private boolean canPlaceTrack(EntityPlayer player, World world, int x, int y, int z) {
        Block l1 = world.getBlock(x, y - 1, z);

        if (player != null && (!player.canPlayerEdit(x, y - 1, z, 0, player.getCurrentEquippedItem()) ||
                !player.canPlayerEdit(x, y, z, 0, player.getCurrentEquippedItem()))
        ) {
            return false;
        }

        return canBeReplaced(world, x, y, z) && (World.doesBlockHaveSolidTopSurface(world, x, y - 1, z) || l1 == BlockIDs.bridgePillar.block);
    }

    private boolean canBeReplaced(World world, int x, int y, int z) {
        Block block = world.getBlock(x, y, z);
        return block == null || block.isReplaceable(world, x, y, z) || block instanceof BlockFlower
                || block == Blocks.double_plant || block instanceof BlockMushroom;
    }

    /**
     * @param world
     * @param x
     * @param y
     * @param z          //@param posX[] array of gag
     *                   //@param posZ[] array of gag
     * @param l          orientation
     * @param exitFacing
     * @param posExitX
     * @param posExitZ
     * @param r          ray
     * @param cx         circle center
     * @param cy         circle center
     * @param cz         circle center
     * @param type
     * @return
     */
    private boolean putDownTurn(@Nullable EntityPlayer player, World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ,
                                int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy,
                                double cz, String type, Item idDrop) {


        if (type.contains("EMBEDDED")) {
            typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
        }


        TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

        /* check if first straight rail can be placed */
        if (putDownEnterTrack && !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }

        /* check if Gag rails can be placed */
        for (int gag = 0; gag < posX.length; gag++) {
            if (!canPlaceTrack(player, world, posX[gag], y + 1, posZ[gag])) {
                return false;
            }
        }
        /* Check last block */
        if (putDownExitTrack && !canPlaceTrack(player, world, posExitX, y + 1, posExitZ)) {
            return false;
        }
        if (putDownEnterTrack) {
            /* first rail of the turn is a 1 block straight */
            placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
            TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
            tcRailStart.setType(typeVariantStraight);
            tcRailStart.setFacing(l);
            tcRailStart.isLinkedToRail = true;
            tcRailStart.linkedX = posX[0];
            tcRailStart.linkedY = y + 1;
            tcRailStart.linkedZ = posZ[0];
        }

        /* the turn starts with this rail */
        placeTrack(world, posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
        TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX[0], y + 1, posZ[0]);
        tcRail.setFacing(l);
        tcRail.r = r;
        tcRail.cx = cx;
        tcRail.cy = cy;
        tcRail.cz = cz;
        tcRail.setType(type);
        tcRail.idDrop = idDrop;

        /* Gag rails containing reference to first turn rail */
        for (int gag = 1; gag < posX.length; gag++) {
            placeTrack(world, posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
            tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
        }

        if (putDownExitTrack) {
            /* Last rail is a 1 block straight */
            placeTrack(world, posExitX, y + 1, posExitZ, BlockIDs.tcRail.block, exitFacing);
            TileTCRail tcRailEnd = (TileTCRail) world.getTileEntity(posExitX, y + 1, posExitZ);
            tcRailEnd.setFacing(exitFacing);
            tcRailEnd.setType(typeVariantStraight);
            tcRailEnd.isLinkedToRail = true;
            tcRailEnd.linkedX = posX[0];
            tcRailEnd.linkedY = y + 1;
            tcRailEnd.linkedZ = posZ[0];
        }

        for (TileTCRailGag tileTCRailGag : tileGag) {
            tileTCRailGag.originX = posX[0];
            tileTCRailGag.originY = y + 1;
            tileTCRailGag.originZ = posZ[0];
            tileTCRailGag.type = type;
        }
        return true;
    }

    private boolean putDownSlopedTurn(@Nullable EntityPlayer player, World world, int x, int y, int z, int[] posX, int[] posZ,
                                      int l, double r, double cx, double cy, double cz, float slopeAngle, double slopeLength, String type, Item idDrop) {


        if (world.getBlock(x, y, z) == BlockIDs.bridgePillar.block) {
            return false;
        }

        TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

        /** check if Gag rails can be placed */
        for (int gag = 0; gag < posX.length; gag++) {
            if (!canPlaceTrack(player, world, posX[gag], y + 1, posZ[gag])) {
                return false;
            }
        }

        /** the turn starts with this rail */
        placeTrack(world, posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
        TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX[0], y + 1, posZ[0]);
        tcRail.setFacing(l);
        tcRail.r = r;
        tcRail.cx = cx;
        tcRail.cy = cy;
        tcRail.cz = cz;
        tcRail.setType(type);
        tcRail.idDrop = idDrop;
        tcRail.slopeAngle = slopeAngle;
        tcRail.slopeHeight = 1;
        tcRail.slopeLength = slopeLength;
        Block block = world.getBlock(x, y, z);
        int blockID = Block.getIdFromBlock(block);
        tcRail.setBallastMaterial(blockID);
        tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);
        System.out.println(tcRail.cx + " ," + tcRail.cz + " , " + tcRail.r);
        /** Gag rails containing reference to first turn rail */
        for (int gag = 1; gag <= posX.length - 1; gag++) {
            placeTrack(world, posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
            tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
            //tileGag[gag - 1].bbHeight = Math.max(0.125f, Math.min(1f, (gag - 1) / (float) (posX.length - 1)));
            tileGag[gag - 1].bbHeight = Math.max(0.125f, Math.min(1f, gag / (float) (posX.length - 1)));

        }
        for (TileTCRailGag tileTCRailGag : tileGag) {
            tileTCRailGag.originX = posX[0];
            tileTCRailGag.originY = y + 1;
            tileTCRailGag.originZ = posZ[0];
            tileTCRailGag.type = type;
        }

        return true;
    }

    private void putDownSingleRail(World world, int posX, int posY, int posZ, int l, double cx, double cy, double cz, double r, String label, boolean hasModel, int linkedX, int linkedY, int linkedZ, boolean canTypeBeModifiedBySwitch, boolean shouldDrop) {
        /** Switch rail */
        placeTrack(world, posX, posY, posZ, BlockIDs.tcRail.block, l);
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
        if (shouldDrop) tcRail.idDrop = ItemIDs.tcRailSmallStraight.item;
    }

    public String getTrackOrientation(int l, float yaw) {
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


    public static Vector2f getDirectionVector(int facing) {
        Matrix2f nrot90 = new Matrix2f();
        nrot90.m00 = +0;
        nrot90.m01 = +1;
        nrot90.m10 = -1;
        nrot90.m11 = +0;

        Vector2f vec = new Vector2f();
        vec.x = 0;
        vec.y = 1;

        for (int i = 0; i < facing; i++) {
            Vector2f nvec = new Vector2f();
            nvec.x = vec.x * nrot90.m00 + vec.y * nrot90.m10;
            nvec.y = vec.x * nrot90.m01 + vec.y * nrot90.m11;
            vec = nvec;
        }
        return vec;

    }

    private int[][] getUsedSpaceFromType(TrackTypes type, @Nullable EntityPlayer player) {
        /** Straights */
        if (type == TrackTypes.SMALL_STRAIGHT
                || type == TrackTypes.SMALL_ROAD_CROSSING
                || type == TrackTypes.SMALL_ROAD_CROSSING_1
                || type == TrackTypes.SMALL_ROAD_CROSSING_2
                || type == TrackTypes.EMBEDDED_SMALL_STRAIGHT)
            return new int[][]{{0, 0}};
        else if (type == TrackTypes.MEDIUM_STRAIGHT || type == TrackTypes.EMBEDDED_MEDIUM_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}};
        else if (type == TrackTypes.LONG_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}};
        else if (type == TrackTypes.VERY_LONG_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0}, {11, 0}};
        /** Diagonals*/
        else if (type == TrackTypes.SMALL_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {0, 1}};
        else if (type == TrackTypes.MEDIUM_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}};
        else if (type == TrackTypes.LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}, {6, 5}, {5, 6}};
        else if (type == TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT)
            return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}, {6, 5}, {5, 6},
                    {6, 6}, {6, 7}, {7, 6}, {7, 7}, {8, 7}, {7, 8}, {8, 8}, {9, 8}, {8, 9}, {9, 9}, {10, 9}, {9, 10}, {10, 10}, {11, 10}, {10, 11}, {11, 11}, {12, 11}, {11, 12}};
        /** Slopes */
        else if (type == TrackTypes.SLOPE_BALLAST
                || type == TrackTypes.SLOPE_GRAVEL
                || type == TrackTypes.SLOPE_WOOD
                || type == TrackTypes.SLOPE_SNOW_GRAVEL
                || type == TrackTypes.SLOPE_DYNAMIC
                || type == TrackTypes.EMBEDDED_SLOPE_DYNAMIC
        )
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}};

        else if (type == TrackTypes.LARGE_SLOPE_BALLAST
                || type == TrackTypes.LARGE_SLOPE_GRAVEL
                || type == TrackTypes.LARGE_SLOPE_WOOD
                || type == TrackTypes.LARGE_SLOPE_SNOW_GRAVEL
                || type == TrackTypes.LARGE_SLOPE_DYNAMIC
                || type == TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0}, {11, 0}};
        else if (type == TrackTypes.VERY_LARGE_SLOPE_BALLAST
                || type == TrackTypes.VERY_LARGE_SLOPE_GRAVEL
                || type == TrackTypes.VERY_LARGE_SLOPE_WOOD
                || type == TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL
                || type == TrackTypes.VERY_LARGE_SLOPE_DYNAMIC
                || type == TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC
        )
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0}, {11, 0},
                    {12, 0}, {13, 0}, {14, 0}, {15, 0}, {16, 0}, {17, 0}};
        /** Crossing */
        else if (type == TrackTypes.TWO_WAYS_CROSSING || type == TrackTypes.EMBEDDED_TWO_WAYS_CROSSING)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {1, -1}};
        else if (type == TrackTypes.DIAMOND_CROSSING || type == TrackTypes.EMBEDDED_DIAMOND_CROSSING)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {0, -1}, {2, 1}};
        else if (type == TrackTypes.DOUBLE_DIAMOND_CROSSING || type == TrackTypes.EMBEDDED_DOUBLE_DIAMOND_CROSSING)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {0, -1}, {2, -1}, {0, 1}, {2, 1}};
        else if (type == TrackTypes.DIAGONAL_TWO_WAYS_CROSSING || type == TrackTypes.EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING)
            return new int[][]{{0, 0}, {-1, -1}, {1, -1}, {1, 1}, {-1, 1}};
        else if (type == TrackTypes.FOUR_WAYS_CROSSING || type == TrackTypes.EMBEDDED_FOUR_WAYS_CROSSING)
            return new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, -1}, {1, -1}, {-1, -1}, {0, 1}, {1, 1}, {-1, 1}};
        /** Turns */
        else if (type == TrackTypes.MEDIUM_TURN || type == TrackTypes.EMBEDDED_MEDIUM_TURN)
            return new int[][]{{0, 0}, {1, 0}, {1, 1}, {2, 1}, {2, 2}};
        else if (type == TrackTypes.LARGE_TURN || type == TrackTypes.EMBEDDED_LARGE_TURN)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}, {3, 1}, {2, 2}, {3, 2}, {4, 2}, {3, 3}, {4, 3}, {4, 4}};
        else if (type == TrackTypes.VERY_LARGE_TURN || type == TrackTypes.EMBEDDED_VERY_LARGE_TURN)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}, {6, 2},
                    {6, 3}, {7, 3}, {7, 4}, {8, 4}, {7, 5}, {8, 5}, {9, 5}, {8, 6}, {9, 6}, {8, 7}, {9, 7}, {9, 8}, {9, 9}};
        else if (type == TrackTypes.SUPER_LARGE_TURN || type == TrackTypes.EMBEDDED_SUPER_LARGE_TURN)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2},
                    {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}, {11, 5}, {12, 5}, {11, 6}, {12, 6}, {13, 6}, {12, 7}, {13, 7},
                    {12, 8}, {13, 8}, {14, 8}, {13, 9}, {14, 9}, {13, 10}, {14, 10}, {15, 10}, {14, 11}, {15, 11}, {14, 12}, {15, 12}, {14, 12,}, {15, 13}, {15, 14}, {15, 15}};
        else if (type == TrackTypes.TURN_29X29 || type == TrackTypes.EMBEDDED_TURN_29X29)
            return new int[][]{{0, 0}, {1, 0},{2, 0},{3, 0},{4, 0},{5, 0},{6, 0},{7, 0},{3, 1},{4, 1},{5, 1},{6, 1},{7, 1},{8, 1},{9, 1},{10, 1},{8, 2},{9, 2},{10, 2},{11, 2},{12, 2},{11, 3},{12, 3},{13, 3},{14, 3},{13, 4},{14, 4},{15, 4},{14, 5},{15, 5},{16, 5},{17, 5},{16, 6},{17, 6},{18, 6},{17, 7},{18, 7},{19, 7},{18, 8},{19, 8},{20, 8},{19, 9},{20, 9},{21, 9},{20, 10},{21, 10},{22, 10},{21, 11},{22, 11},{23, 11},{22, 12},{23, 12},{23, 13},{24, 13},{23, 14},{24, 14},{25, 14},{24, 15},{25, 15},{24, 16},{25, 16},{26, 16},{25, 17},{26, 17},{25, 18},{26, 18},{27, 18},{26, 19},{27, 19},{26, 20},{27, 20},{26, 21},{27, 21},{28, 21},{27, 22},{28, 22},{27, 23},{28, 23},{27, 24},{28, 24},{27, 25},{28, 25},{28, 26},{28, 27},{28, 28}};




        else if (type == TrackTypes.TURN_32X32 || type == TrackTypes.EMBEDDED_TURN_32X32)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1},
                    {10, 1}, {11, 1}, {8, 2}, {9, 2}, {10, 2}, {11, 2}, {12, 2}, {13, 2}, {11, 3}, {12, 3}, {13, 3}, {14, 3}, {15, 3}, {12, 4}, {13, 4}, {14, 4},
                    {15, 4}, {16, 4}, {15, 5}, {16, 5}, {17, 5}, {18, 5}, {16, 6}, {17, 6}, {18, 6}, {19, 6}, {20, 6}, {18, 7}, {19, 7}, {20, 7}, {19, 8}, {20, 8},
                    {21, 8}, {20, 9}, {21, 9}, {22, 9}, {21, 10}, {22, 10}, {23, 10}, {22, 11}, {23, 11}, {24, 11}, {23, 12}, {24, 12}, {25, 12}, {24, 13}, {25, 13},
                    {26, 13}, {25, 14}, {26, 14}, {25, 15}, {26, 15}, {27, 15}, {26, 16}, {27, 16}, {28, 16}, {27, 17}, {28, 17}, {27, 18}, {28, 18}, {29, 18}, {28, 19},
                    {29, 19}, {28, 20}, {29, 20}, {30, 20}, {29, 21}, {30, 21}, {29, 22}, {30, 22}, {29, 23}, {30, 23}, {30, 24}, {31, 24}, {30, 25}, {31, 25}, {30, 26},
                    {31, 26}, {30, 27}, {31, 27}, {30, 28}, {31, 28}, {30, 29}, {31, 29}, {31, 30}, {31, 31}};



        /** Switches*/
        else if (type == TrackTypes.MEDIUM_PARALLEL_SWITCH || type == TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0},
                    {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {6, 3}, {7, 3}, {8, 3}, {9, 3}, {10, 3}};
        else if (type == TrackTypes.MEDIUM_SWITCH || type == TrackTypes.EMBEDDED_MEDIUM_SWITCH)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, 1}, {3, 1}, {3, 2}, {3, 3}};
        else if (type == TrackTypes.LARGE_SWITCH || type == TrackTypes.EMBEDDED_LARGE_SWITCH)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0},
                    {2, 1}, {3, 1}, {4, 1}, {3, 2}, {4, 2}, {5, 2}, {4, 3}, {5, 3}, {5, 4}, {5, 5}};
        else if (type == TrackTypes.VERY_LARGE_SWITCH || type == TrackTypes.EMBEDDED_VERY_LARGE_SWITCH)
            return new int[][]{{0,0},{1,0}, {2,0},{3,0},{4,0},{5,0},{6,0}, {2, 1},{3, 1},{4, 1},{5, 1},{6, 1},{6, 2},{6, 2},{7, 2},{7, 3},{8, 3},{8, 4},{9, 4},{8, 5},{9, 5},{10, 5},{9, 6},{10, 6},{9, 7},{10, 7},{10, 8},{10, 9}, {10,10}};

		/*else if ( type == TrackTypes.VERY_LARGE_SWITCH )
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0},
					{2,1}, {3,1}, {4,1}, {5,1}, {4,2}, {5,2}, {6,2}, {6,3}, {7,3}, {7,4}, {8,4}, {7,5}, {8,5}, {9,5}, {8,6}, {9,6}, {8,7}, {9,7}, {9,8}, {9,9}};
		*/
        /** Parallel Curves */
        else if (type == TrackTypes.SMALL_PARALLEL_CURVE || type == TrackTypes.EMBEDDED_SMALL_PARALLEL_CURVE)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}};
        else if (type == TrackTypes.MEDIUM_PARALLEL_CURVE || type == TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {7, 2}, {8, 2}, {9, 2}, {10, 2}, {11, 2}};
        else if (type == TrackTypes.LARGE_PARALLEL_CURVE || type == TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {7, 2}, {8, 2}, {9, 2}, {10, 2}, {11, 2}, {10, 3}, {11, 3}, {12, 3}, {13, 3}, {14, 3}, {15, 3}};
        /**45 degree curves*/
        else if ((type == TrackTypes.MEDIUM_45DEGREE_TURN || type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN) && !player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}, {3, 1}, {2, 2}};
        else if ((type == TrackTypes.LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN) && !player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}, {6, 2}, {5, 3}};
        else if ((type == TrackTypes.VERY_LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN) && !player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {6, 3}, {7, 3}, {8, 3}, {7, 4}};
        else if ((type == TrackTypes.SUPER_LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN) && !player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 2}, {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}};
        else if ((type == TrackTypes.MEDIUM_45DEGREE_SWITCH || type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH) && !player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, 1}, {3, 1}, {4, 1}, {3, 2}};
        else if ((type == TrackTypes.MEDIUM_45DEGREE_TURN || type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN) && player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}};
        else if ((type == TrackTypes.LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN) && player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}};
        else if ((type == TrackTypes.VERY_LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN) && player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {6, 3}, {7, 3}};
        else if ((type == TrackTypes.SUPER_LARGE_45DEGREE_TURN || type == TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN) && player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 2}, {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}};
        else if ((type == TrackTypes.MEDIUM_45DEGREE_SWITCH || type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH) && player.isSneaking())
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, 1}, {3, 1}};
        else if (type == TrackTypes.LARGE_CURVED_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC)
            return new int[][]{{0, 0}, {1, 0}, {1, 1}, {2, 0}, {2, 1}, {3, 1}, {2, 2}, {3, 2}, {3, 3}, {4, 3}, {4, 4}};
        else if (type == TrackTypes.VERY_LARGE_CURVED_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}, {6, 2}, {5, 3}, {6, 3}, {7, 3}, {6, 4}, {7, 4}, {7, 5}, {8, 5}, {7, 6}, {8, 7}, {8, 8}};
        else if (type == TrackTypes.SUPER_LARGE_CURVED_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC)
            return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 2}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}, {11, 5}, {12, 5}, {11, 6}, {12, 6}, {13, 6}, {12, 7}, {13, 7}, {12, 8}, {13, 8}, {14, 8}, {13, 9}, {14, 9}, {13, 10}, {14, 10}, {15, 10}, {14, 11}, {15, 11}, {14, 12}, {15, 12}, {14, 13}, {15, 13}, {15, 14}, {15, 15}};

        else {
            return null;
        }

    }

    public boolean tryToPlaceTrack(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, boolean changeWorld) {
        if (!(itemStack.getItem() instanceof ItemTCRail))
            return false;

        y = getPlacementHeight(world, x, y, z);

        ItemTCRail item = (ItemTCRail) itemStack.getItem();
        if (world.getBlock(x, y, z) == BlockIDs.bridgePillar.block && item.getTrackType().getLabel().contains("DYNAMIC")) {
            return false;
        }
        int facing0 = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        Vector2f dir0 = ItemTCRail.getDirectionVector(facing0);

        float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
        boolean isLeftTurn = item.getTrackOrientation(facing0, yaw).equals("left");
        int facing1 = isLeftTurn ? (facing0 + 4 - 1) % 4 : (facing0 + 1) % 4;
        Vector2f dir1 = getDirectionVector(facing1);

        int[][] trackPositions = getUsedSpaceFromType(item.getTrackType(), player);

        if (trackPositions != null) {

            for (int[] pos : trackPositions) {
                int dx = (int) (pos[0] * dir0.getX() + pos[1] * dir1.getX());
                int dz = (int) (pos[0] * dir0.getY() + pos[1] * dir1.getY());

                if (!canPlaceTrack(player, world, x + dx, y + 1, z + dz))
                    return false;
            }

            return true;
        } else {
            return false;
        }
    }

    public int getPlacementHeight(World world, int x, int y, int z) {
        if (canBeReplaced(world, x, y, z)) {
            y--;
        }
        return y;
    }

    /**
     * changes the sign of an array and adds the current world pos to it
     */
    public int[] flipArraySign(int[] array, int pos, boolean needsConverting) {
        if (needsConverting)
            for (int i = 0; i < array.length; i++) {
                array[i] = (array[i] * -1) + pos;
            }
        else {
            for (int i = 0; i < array.length; i++) {
                array[i] = (array[i] + pos);
            }
        }

        return array;
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (!world.isRemote) {


            y = getPlacementHeight(world, x, y, z);
            int l;

            if (type.getType().equals(DIAGONAL)) {
                l = MathHelper.floor_double((player != null ? player.rotationYaw : par10) * 4.0F / 360.0F) & 3;
                l += 4;
            } else {
                l = MathHelper.floor_double((player != null ? player.rotationYaw : par10) * 4.0F / 360.0F + 0.5D) & 3;
            }

            tempType = getPlacementDirection(player, world, l, par10);


            /** This code below actually places the stuff
             * l = direction
             *  l = 0 = south
             *  l = 1 = west
             *  l = 2 = north
             *  l = 3 = east
             *  l = 4 = south-west
             *  l = 5 = north-west
             *  l = 6 = north-east
             *  l = 7 = south-east
             **/

            /*todo: switch below logic to a simplified switch statement. will reduce overall code dramatically as requested by doc a long time ago
            switch (type){
                case SMALL_STRAIGHT: case EMBEDDED_SMALL_STRAIGHT: case SMALL_ROAD_CROSSING: case SMALL_ROAD_CROSSING_1: case SMALL_ROAD_CROSSING_2 :{
                    if (!smallStraight(player, world, x, y, z, l, type)) {return false;}
                }

            }
            if (player == null || !player.capabilities.isCreativeMode) {
                --itemstack.stackSize;
            }
            return true;*/

            if (type == TrackTypes.SMALL_STRAIGHT || type == TrackTypes.EMBEDDED_SMALL_STRAIGHT || type == TrackTypes.SMALL_ROAD_CROSSING || type == TrackTypes.SMALL_ROAD_CROSSING_1 || type == TrackTypes.SMALL_ROAD_CROSSING_2) {

                if (!smallStraight(player, world, x, y, z, l, type))
                    return false;

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.MEDIUM_STRAIGHT || type == TrackTypes.LONG_STRAIGHT || type == TrackTypes.VERY_LONG_STRAIGHT ||
                    type == TrackTypes.EMBEDDED_MEDIUM_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT) {

                if (!straight(player, world, x, y, z, l, type))
                    return false;

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.SMALL_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT) {


                if (!smallDiagonalStraight(player, world, x, y, z, l, type)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.MEDIUM_DIAGONAL_STRAIGHT || type == TrackTypes.LONG_DIAGONAL_STRAIGHT || type == TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT) {

                if (!diagonalStraight(player, world, x, y, z, l, type)) {

                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_RIGHT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN) {

                if (!mediumRight45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_LEFT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN) {

                if (!mediumLeft45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_RIGHT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_LARGE_RIGHT_45DEGREE_TURN) {

                if (!largeRight45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_LEFT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_LARGE_LEFT_45DEGREE_TURN) {

                if (!largeLeft45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_RIGHT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN) {

                if (!veryLargeRight45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_LEFT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN) {

                if (!veryLargeLeft45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_RIGHT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN) {

                if (!superLargeRight45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_LEFT_45DEGREE_TURN || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN) {

                if (!superLargeLeft45DegreeTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_RIGHT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC) {
                if (!largeRightCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_LEFT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC) {
                if (!largeLeftCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC) {
                if (!veryLargeRightCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC) {
                if (!veryLargeLeftCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC) {
                if (!superLargeRightCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC) {
                if (!superLargeLeftCurvedSlope(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SMALL_RIGHT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE) {
                if (!smallRightParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SMALL_LEFT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE) {
                if (!smallLeftParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.RIGHT_DIAMOND_CROSSING || tempType == TrackTypes.EMBEDDED_RIGHT_DIAMOND_CROSSING) {
                if (!rightDiamondCrossing(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LEFT_DIAMOND_CROSSING || tempType == TrackTypes.EMBEDDED_LEFT_DIAMOND_CROSSING) {
                if (!leftDiamondCrossing(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.DOUBLE_DIAMOND_CROSSING || type == TrackTypes.EMBEDDED_DOUBLE_DIAMOND_CROSSING) {
                if (!doubleDiamondCrossing(player, world, x, y, z, l, type)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.DIAGONAL_TWO_WAYS_CROSSING || type == TrackTypes.EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING) {
                if (!diagonalTwoWaysCrossing(player, world, x, y, z, l, type)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (type == TrackTypes.FOUR_WAYS_CROSSING || type == TrackTypes.EMBEDDED_FOUR_WAYS_CROSSING) {
                if (!fourWaysCrossing(player, world, x, y, z, l, type)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_RIGHT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE) {

                if (!mediumRightParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;


            } else if (tempType == TrackTypes.MEDIUM_LEFT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE) {


                if (!mediumLeftParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;

            } else if (tempType == TrackTypes.LARGE_RIGHT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE) {

                if (!largeRightParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_LEFT_PARALLEL_CURVE || tempType == TrackTypes.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE) {

                if (!largeLeftParallelCurve(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;

            }
            else if (tempType == TrackTypes.MEDIUM_RIGHT_45DEGREE_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH) {
                switch (tempType) {
                    case MEDIUM_RIGHT_45DEGREE_SWITCH:
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        typeVariant90Turn = TrackTypes.MEDIUM_RIGHT_TURN.getLabel();
                        idVariantSwitch = ItemIDs.tcRailMedium45DegreeSwitch.item;
                        break;
                    case EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH:
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        typeVariant90Turn = TrackTypes.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel();
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item;
                        break;
                }

                if (player.isSneaking()) {
                    if (l == 2) {
                        int[] xArray = {x + 1, x + 1};
                        int[] zArray = {z - 2, z - 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 3, x + 1, z - 3, 3.75, x + 4.25, y + 1,
                                z, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z - 1, l, x + 4.25, y + 1, z, 3.75, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z - 2, l, x + 4.25, y + 1, z, 3.75, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
                    }

                    if (l == 0) {
                        int[] xArray = {x - 1, x - 1};
                        int[] zArray = {z + 2, z + 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 1, x - 1, z + 3, 3.75, x - 3.25, y + 1,
                                z + 1, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z + 1, l, x - 3.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z + 2, l, x - 3.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
                    }
                    if (l == 1) {
                        int[] xArray = {x - 2, x - 3};
                        int[] zArray = {z - 1, z - 1};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 2, x - 3, z - 1, 3.75, x, y + 1,
                                z - 3.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
                    }
                    if (l == 3) {
                        int[] xArray = {x + 2, x + 3};
                        int[] zArray = {z + 1, z + 1};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 2, x + 3, z + 1, 3.75, x + 1, y + 1,
                                z + 4.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
                    }
                } else {
                    if (l == 2) {
                        int[] xArray = {x + 1, x + 1, x + 1, x + 2};
                        int[] zArray = {z - 2, z - 3, z - 4, z - 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 3, x + 1, z - 3, 3.75, x + 4.25, y + 1,
                                z, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z - 1, l, x + 4.25, y + 1, z, 3.75, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z - 2, l, x + 4.25, y + 1, z, 3.75, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
                    }

                    if (l == 0) {
                        int[] xArray = {x - 1, x - 1, x - 1, x - 2};
                        int[] zArray = {z + 2, z + 3, z + 4, z + 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 1, x - 1, z + 3, 3.75, x - 3.25, y + 1,
                                z + 1, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z + 1, l, x - 3.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z + 2, l, x - 3.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);
                    }
                    if (l == 1) {
                        int[] xArray = {x - 2, x - 3, x - 4, x - 3};
                        int[] zArray = {z - 1, z - 1, z - 1, z - 2};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 2, x - 3, z - 1, 3.75, x, y + 1,
                                z - 3.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);
                    }
                    if (l == 3) {
                        int[] xArray = {x + 2, x + 3, x + 4, x + 3};
                        int[] zArray = {z + 1, z + 1, z + 1, z + 2};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 0, x + 3, z + 1, 3.75, x + 1, y + 1,
                                z + 4.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
                    }

                }


                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_LEFT_45DEGREE_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH) {
                switch (tempType) {
                    case MEDIUM_LEFT_45DEGREE_SWITCH:
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        typeVariant90Turn = TrackTypes.MEDIUM_LEFT_TURN.getLabel();
                        idVariantSwitch = ItemIDs.tcRailMedium45DegreeSwitch.item;
                        break;
                    case EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH:
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        typeVariant90Turn = TrackTypes.EMBEDDED_MEDIUM_LEFT_TURN.getLabel();
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item;
                        break;
                }
                if (player.isSneaking()) {
                    if (l == 2) {
                        int[] xArray = {x - 1, x - 1};
                        int[] zArray = {z - 2, z - 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 1, x - 1, z - 3, 3.75, x - 3.25, y + 1,
                                z, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z - 1, l, x - 3.25, y + 1, z, 3.75, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z - 2, l, x - 3.25, y + 1, z, 3.75, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
                    }

                    if (l == 0) {
                        int[] xArray = {x + 1, x + 1};
                        int[] zArray = {z + 2, z + 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 3, x + 1, z + 3, 3.75, x + 4.25, y + 1,
                                z + 1, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z + 1, l, x + 4.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z + 2, l, x + 4.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
                    }
                    if (l == 1) {
                        int[] xArray = {x - 2, x - 3};
                        int[] zArray = {z + 1, z + 1};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 0, x - 3, z + 1, 3.75, x, y + 1,
                                z + 4.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
                    }
                    if (l == 3) {
                        int[] xArray = {x + 2, x + 3};
                        int[] zArray = {z - 1, z - 1};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 2, x + 3, z - 1, 3.75, x + 1, y + 1,
                                z - 3.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
                    }
                } else {
                    if (l == 2) {
                        int[] xArray = {x - 1, x - 1, x - 1, x - 2};
                        int[] zArray = {z - 2, z - 3, z - 4, z - 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 1, x - 1, z - 3, 3.75, x - 3.25, y + 1,
                                z, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z - 1, l, x - 3.25, y + 1, z, 3.75, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z - 2, l, x - 3.25, y + 1, z, 3.75, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
                    }

                    if (l == 0) {
                        int[] xArray = {x + 1, x + 1, x + 1, x + 2};
                        int[] zArray = {z + 2, z + 3, z + 4, z + 3};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 3, x + 1, z + 3, 3.75, x + 4.25, y + 1,
                                z + 1, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x, y + 1, z + 1, l, x + 4.25, y + 1, z + 1, 3.75, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x, y + 1, z + 2, l, x + 4.25, y + 1, z + 1, 3.75, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);
                    }
                    if (l == 1) {
                        int[] xArray = {x - 2, x - 3, x - 4, x - 3};
                        int[] zArray = {z + 1, z + 1, z + 1, z + 2};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 0, x - 3, z + 1, 3.75, x, y + 1,
                                z + 4.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 4.25, 3.75, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 4.25, 3.75, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
                    }
                    if (l == 3) {
                        int[] xArray = {x + 2, x + 3, x + 4, x + 3};
                        int[] zArray = {z - 1, z - 1, z - 1, z - 2};
                        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, false, 2, x + 3, z - 1, 3.75, x + 1, y + 1,
                                z - 3.25, typeVariant90Turn, idVariantSwitch))
                            return false;
                        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
                        if (tcRailTurn != null) {
                            tcRailTurn.hasModel = false;
                        }

                        world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update
                        /** Switch rail 1 **/
                        putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);
                        /** Switch rail 2 **/
                        putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 3.25, 3.75, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
                        /** Put down straight exit **/
                        putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
                    }
                }


                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_RIGHT_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_SWITCH) {

                switch (tempType) {
                    case MEDIUM_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailMediumSwitch.item;
                        typeVariant90Turn = TrackTypes.MEDIUM_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_MEDIUM_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMediumSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }


                if (l == 2) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
                        return false;
                    }

                    int[] xArray = {x + 1, x + 1, x + 2};
                    int[] zArray = {z - 2, z - 3, z - 3};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
                    if (tcRailTurn != null) {
                        tcRailTurn.hasModel = false;
                    }
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z - 1, l, x + 3, y + 1, z, 2.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x + 3, y + 1, z, 2.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z - 2, false, false);
                }
                if (l == 0) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
                        return false;
                    }

                    int[] xArray = {x - 1, x - 1, x - 2};
                    int[] zArray = {z + 2, z + 3, z + 3};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z + 1, l, x - 2, y + 1, z + 1, 2.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x - 2, y + 1, z + 1, 2.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z + 2, false, false);

                }
                if (l == 1) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
                        return false;
                    }

                    int[] xArray = {x - 2, x - 3, x - 3};
                    int[] zArray = {z - 1, z - 1, z - 2};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1,
                            z - 2, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 2, 2.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 2, 2.5, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 2, y + 1, z - 1, false, false);

                }
                if (l == 3) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
                        return false;
                    }

                    int[] xArray = {x + 2, x + 3, x + 3};
                    int[] zArray = {z + 1, z + 1, z + 2};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1,
                            z + 3, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 2, y + 1, z + 1, false, false);

                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_LEFT_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_SWITCH) {
                switch (tempType) {
                    case MEDIUM_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailMediumSwitch.item;
                        typeVariant90Turn = TrackTypes.MEDIUM_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_MEDIUM_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMediumSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_MEDIUM_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }
                if (l == 2) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
                        return false;
                    }

                    int[] xArray = {x - 1, x - 1, x - 2};
                    int[] zArray = {z - 2, z - 3, z - 3};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
                    if (tcRailTurn != null) {
                        tcRailTurn.hasModel = false;
                    }
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z - 1, l, x - 2, y + 1, z, 2.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x - 2, y + 1, z, 2.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z - 2, false, false);

                }
                if (l == 0) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
                        return false;
                    }
                    int[] xArray = {x + 1, x + 1, x + 2};
                    int[] zArray = {z + 2, z + 3, z + 3};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z + 1, l, x + 3, y + 1, z + 1, 2.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x + 3, y + 1, z + 1, 2.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z + 2, false, false);

                }
                if (l == 1) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x - 2, x - 3, x - 3};
                    int[] zArray = {z + 1, z + 1, z + 2};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1,
                            z + 3, typeVariant90Turn, idVariantSwitch))
                        return false;

                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 3, 2.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 3, 2.5, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 2, y + 1, z + 1, false, false);

                }
                if (l == 3) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x + 2, x + 3, x + 3};
                    int[] zArray = {z - 1, z - 1, z - 2};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1,
                            z - 2, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 2, y + 1, z - 1, false, false);

                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_RIGHT_SWITCH || tempType == TrackTypes.EMBEDDED_LARGE_RIGHT_SWITCH) {
                switch (tempType) {
                    case LARGE_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.LARGE_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_LARGE_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_LARGE_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }
                if (l == 2) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
                        return false;
                    }
                    int[] xArray = {x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2};
                    int[] zArray = {z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z - 1, l, x + 5, y + 1, z, 4.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x + 5, y + 1, z, 4.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x + 5, y + 1, z, 4.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);


                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z - 2, false, false);

                }
                if (l == 0) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
                        return false;
                    }

                    int[] xArray = {x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4};
                    int[] zArray = {z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z + 1, l, x - 4, y + 1, z + 1, 4.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z + 2, false, false);

                }
                if (l == 1) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5};
                    int[] zArray = {z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1,
                            z - 4, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 4, 4.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 2, y + 1, z - 1, false, false);

                }
                if (l == 3) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5};
                    int[] zArray = {z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1,
                            z + 5, typeVariant90Turn, idVariantSwitch))
                        return false;

                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 2, y + 1, z + 1, false, false);

                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_LEFT_SWITCH || tempType == TrackTypes.EMBEDDED_LARGE_LEFT_SWITCH) {
                switch (tempType) {
                    case LARGE_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.LARGE_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_LARGE_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_LARGE_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }
                if (l == 2) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
                        return false;
                    }
                    int[] xArray = {x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2};
                    int[] zArray = {z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z - 1, l, x - 4, y + 1, z, 4.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x - 4, y + 1, z, 4.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x - 4, y + 1, z, 4.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z - 2, false, false);

                }
                if (l == 0) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
                        return false;
                    }
                    int[] xArray = {x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4};
                    int[] zArray = {z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;

                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x, y + 1, z + 1, l, x + 5, y + 1, z + 1, 4.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z + 2, false, false);

                }
                if (l == 1) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5};
                    int[] zArray = {z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1,
                            z + 5, typeVariant90Turn, idVariantSwitch))
                        return false;

                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 5, 4.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 2, y + 1, z + 1, false, false);

                }
                if (l == 3) {
                    /** Check if straight exit can be put down */
                    if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
                        return false;
                    }
                    int[] xArray = {x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5};
                    int[] zArray = {z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4};
                    if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1,
                            z - 4, typeVariant90Turn, idVariantSwitch))
                        return false;

                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

                    /** Switch rail 1 */
                    putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 2, y + 1, z - 1, false, false);

                    /** Put down straight exit **/
                    putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight,
                            true, x + 2, y + 1, z - 1, false, false);

                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.VERY_LARGE_RIGHT_SWITCH || tempType == TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_SWITCH) {
                switch (tempType) {
                    case VERY_LARGE_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailVeryLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_VERY_LARGE_RIGHT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedVeryLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }

                int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
                int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};


                if(l == 2) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x, y + 1, z - i)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, true, 3, x + 10, z - 10, 9.5, x + 10, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x, y + 1, z - 1, l, x + 10, y + 1, z, 9.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x + 10, y + 1, z, 9.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x + 10, y + 1, z, 9.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x, y + 1, z - 4, l, x + 10, y + 1, z, 9.5, typeVariantStraight, false, x + 1, y + 1, z - 2, true, false);
                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 2, false, false);

                    }

                }

                if(l == 0) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x, y + 1, z + i)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, true, 1, x - 10, z + 10, 9.5, x - 9, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 0);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x, y + 1, z + 1, l, x - 9, y + 1, z + 1, 9.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x, y + 1, z + 4, l, x - 9, y + 1, z + 1, 9.5, typeVariantStraight, false, x - 1, y + 1, z + 2, true, false);


                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 2, false, false);

                    }

                }

                if(l == 1) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x - i, y + 1, z)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, true, 2, x - 10, z - 10, 9.5, x , y + 1,
                            z - 9, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x  - 2, y + 1, z - 1, l, 1);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x - 1, y + 1, z , l, x , y + 1, z - 9, 9.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z , l, x, y + 1, z - 9, 9.5, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z - 9, 9.5, typeVariantStraight, false, x - 2 , y + 1, z - 1, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z - 9, 9.5, typeVariantStraight, false, x - 2, y + 1, z - 1, true, false);


                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z - 1, false, false);

                    }

                }

                if(l == 3) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x + i, y + 1, z)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, true, 0, x + 10, z + 10, 9.5, x + 1, y + 1,
                            z + 10, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x  + 2, y + 1, z + 1, l, 3);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x + 1, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z + 10, 9.5, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x + 3, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, typeVariantStraight, false, x + 2 , y + 1, z + 1, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x + 4, y + 1, z , l, x + 1, y + 1, z + 10, 9.5, typeVariantStraight, false, x + 2, y + 1, z + 1, true, false);
                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z + 1, false, false);

                    }

                }




                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.VERY_LARGE_LEFT_SWITCH || tempType == TrackTypes.EMBEDDED_VERY_LARGE_LEFT_SWITCH) {
                switch (tempType) {
                    case VERY_LARGE_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailVeryLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.VERY_LARGE_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        break;
                    case EMBEDDED_VERY_LARGE_LEFT_SWITCH:
                        idVariantSwitch = ItemIDs.tcRailEmbeddedVeryLargeSwitch.item;
                        typeVariant90Turn = TrackTypes.EMBEDDED_VERY_LARGE_LEFT_TURN.getLabel();
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        break;
                }

                int[] xArray = { 1,1,1,1,1,2,2,2,3,3,4,4,5,5,5,6,6,7,7,8,9};
                int[] zArray = { 2,3,4,5,6,6,6,7,7,8,8,9,8,9,10,9,10,9,10, 10,10};


                if(l == 2) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x, y + 1, z - i)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, true, 1, x - 10, z - 10, 9.5, x - 9, y + 1,
                            z, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x, y + 1, z - 1, l, x - 9, y + 1, z, 9.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z - 2, l, x - 9, y + 1, z, 9.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z - 3, l, x - 9, y + 1, z, 9.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x, y + 1, z - 4, l, x - 9, y + 1, z, 9.5, typeVariantStraight, false, x - 1, y + 1, z - 2, true, false);
                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 2, false, false);

                    }

                }

                if(l == 0) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x, y + 1, z + i)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, true, 1, x + 10, z + 10, 9.5, x + 10, y + 1,
                            z + 1, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 0);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x, y + 1, z + 1, l, x + 10, y + 1, z + 1, 9.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x, y + 1, z + 2, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x, y + 1, z + 3, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x, y + 1, z + 4, l, x + 10, y + 1, z + 1, 9.5, typeVariantStraight, false, x + 1, y + 1, z + 2, true, false);


                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 2, false, false);

                    }

                }

                if(l == 1) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x - i, y + 1, z)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, true, 0, x - 10, z + 10, 9.5, x , y + 1,
                            z + 10, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x  - 2, y + 1, z + 1, l, 1);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x - 1, y + 1, z , l, x , y + 1, z + 10, 9.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x - 2, y + 1, z , l, x, y + 1, z + 10, 9.5, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x - 3, y + 1, z , l, x , y + 1, z + 10 , 9.5, typeVariantStraight, false, x - 2 , y + 1, z + 1, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x - 4, y + 1, z , l, x , y + 1, z + 10, 9.5, typeVariantStraight, false, x - 2, y + 1, z + 1, true, false);
                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 2, y + 1, z + 1, false, false);

                    }

                }

                if(l == 3) {
                    for (int i = 1; i < 7; i++) {

                        if (!canPlaceTrack(player, world, x + i, y + 1, z)) return false;
                    }

                    if (!putDownTurn(player, world, true, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, true, 2, x + 10, z - 10, 9.5, x + 1, y + 1,
                            z - 9, typeVariant90Turn, idVariantSwitch))
                        return false;
                    TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
                    if (tcRailTurn != null)
                        tcRailTurn.hasModel = false;
                    world.setBlockMetadataWithNotify(x  + 2, y + 1, z - 1, l, 3);//to force client update

                    /** Switch rail 1 **/
                    putDownSingleRail(world, x + 1, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, true, false);

                    /** Switch rail 2 **/
                    putDownSingleRail(world, x + 2, y + 1, z , l, x + 1 , y + 1, z - 9, 9.5, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);

                    /** Switch rail 3 **/
                    putDownSingleRail(world, x + 3, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, typeVariantStraight, false, x + 2 , y + 1, z - 1, true, false);

                    /** Switch rail 4 **/
                    putDownSingleRail(world, x + 4, y + 1, z , l, x + 1, y + 1, z - 9, 9.5, typeVariantStraight, false, x + 2, y + 1, z - 1, true, false);
                    for (int straight = 5 ; straight < 7 ; straight++){
                        putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x + 2, y + 1, z - 1, false, false);

                    }

                }




                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH) {
                switch (tempType) {
                    case MEDIUM_RIGHT_PARALLEL_SWITCH:
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        idVariantSwitch = ItemIDs.tcRailMediumParallelSwitch.item;
                        break;
                    case EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH:
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMediumParallelSwitch.item;
                        break;
                }

                if (l == 2) {
                    if (!parallelRightSwitchNorth(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 0) {
                    if (!parallelRightSwitchSouth(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 1) {
                    if (!parallelRightSwitchWest(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 3) {
                    if (!parallelRightSwitchEast(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH) {
                switch (tempType) {
                    case MEDIUM_LEFT_PARALLEL_SWITCH:
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        idVariantSwitch = ItemIDs.tcRailMediumParallelSwitch.item;
                        break;
                    case EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH:
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        idVariantSwitch = ItemIDs.tcRailEmbeddedMediumParallelSwitch.item;
                        break;
                }
                if (l == 2) {
                    if (!parallelLeftSwitchNorth(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 0) {
                    if (!parallelLeftSwitchSouth(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 1) {
                    if (!parallelLeftSwitchWest(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (l == 3) {
                    if (!parallelLeftSwitchEast(player, world, x, y, z, l, tempType, typeVariantStraight, idVariantSwitch))
                        return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_RIGHT_TURN || tempType == TrackTypes.EMBEDDED_MEDIUM_RIGHT_TURN) {

                if (!mediumRightTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.MEDIUM_LEFT_TURN || tempType == TrackTypes.EMBEDDED_MEDIUM_LEFT_TURN) {

                if (!mediumLeftTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_RIGHT_TURN || tempType == TrackTypes.EMBEDDED_LARGE_RIGHT_TURN) {

                if (!largeRightTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.LARGE_LEFT_TURN || tempType == TrackTypes.EMBEDDED_LARGE_LEFT_TURN) {

                if (!largeLeftTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_RIGHT_TURN || tempType == TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_TURN) {

                if (!veryLargeRightTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.VERY_LARGE_LEFT_TURN || tempType == TrackTypes.EMBEDDED_VERY_LARGE_LEFT_TURN) {

                if (!veryLargeLeftTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_RIGHT_TURN || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_TURN) {

                if (!superLargeRightTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            } else if (tempType == TrackTypes.SUPER_LARGE_LEFT_TURN || tempType == TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_TURN) {


                if (!superLargeLeftTurn(player, world, x, y, z, l, tempType)) {
                    return false;
                }

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.RIGHT_TURN_29X29 || tempType == TrackTypes.EMBEDDED_RIGHT_TURN_29X29) {


                if (!turn29XRight(player, world, x, y, z, l, tempType)){
                    return false;
                }

                if (player ==null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.LEFT_TURN_29X29 || tempType == TrackTypes.EMBEDDED_LEFT_TURN_29X29) {

                if (!turn29XLeft(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player ==null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }

                return true;
            }


            else if (tempType == TrackTypes.RIGHT_TURN_32X32 || tempType == TrackTypes.EMBEDDED_RIGHT_TURN_32X32) {


                if (!turn32XRight(player, world, x, y, z, l, tempType)){
                    return false;
                }

                if (player ==null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;
            }

            else if (tempType == TrackTypes.LEFT_TURN_32X32 || tempType == TrackTypes.EMBEDDED_LEFT_TURN_32X32) {

                if (!turn32XLeft(player, world, x, y, z, l, tempType)) {
                    return false;
                }
                if (player ==null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }

                return true;
             }




            else if (type == TrackTypes.SLOPE_WOOD || type == TrackTypes.SLOPE_GRAVEL || type == TrackTypes.SLOPE_BALLAST
                    || type == TrackTypes.SLOPE_SNOW_GRAVEL || type == TrackTypes.SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_SLOPE_DYNAMIC
                    || type == TrackTypes.LARGE_SLOPE_WOOD || type == TrackTypes.LARGE_SLOPE_GRAVEL
                    || type == TrackTypes.LARGE_SLOPE_BALLAST || type == TrackTypes.LARGE_SLOPE_SNOW_GRAVEL
                    || type == TrackTypes.LARGE_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC
                    || type == TrackTypes.VERY_LARGE_SLOPE_WOOD || type == TrackTypes.VERY_LARGE_SLOPE_GRAVEL
                    || type == TrackTypes.VERY_LARGE_SLOPE_BALLAST || type == TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL
                    || type == TrackTypes.VERY_LARGE_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC
            ) {
                if (!canPlaceTrack(player, world, x, y + 1, z)) {
                    return false;
                }
                if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block) {
                    return false;
                }


                int gagEnd = 0;
                double slopeAngle = 0;
                /**
                 * Explanation: normally you would devide 100 by (gagEnd+1) but this seems to be
                 * against TCs own brain. you need to devide 100 by (gagEnd+1)
                 **/
                if (type == TrackTypes.SLOPE_WOOD || type == TrackTypes.SLOPE_GRAVEL
                        || type == TrackTypes.SLOPE_BALLAST || type == TrackTypes.SLOPE_SNOW_GRAVEL
                        || type == TrackTypes.SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_SLOPE_DYNAMIC) {
                    gagEnd = 5;
                    slopeAngle = 0.13;
                }

                if (type == TrackTypes.LARGE_SLOPE_WOOD || type == TrackTypes.LARGE_SLOPE_GRAVEL
                        || type == TrackTypes.LARGE_SLOPE_BALLAST || type == TrackTypes.LARGE_SLOPE_SNOW_GRAVEL
                        || type == TrackTypes.LARGE_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC) {
                    gagEnd = 11;
                    slopeAngle = 0.0666;
                }

                if (type == TrackTypes.VERY_LARGE_SLOPE_WOOD || type == TrackTypes.VERY_LARGE_SLOPE_GRAVEL
                        || type == TrackTypes.VERY_LARGE_SLOPE_BALLAST || type == TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL
                        || type == TrackTypes.VERY_LARGE_SLOPE_DYNAMIC || type == TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC) {
                    gagEnd = 17;
                    slopeAngle = 0.0444;
                }


                Item idDropped = this.type.getItem().item;
                TileTCRailGag[] tileGag = new TileTCRailGag[gagEnd];

                for (int i = 1; i <= gagEnd; i++) {
                    if (l == 2) {
                        if (!canPlaceTrack(player, world, x, y + 1, z - i)) {
                            return false;
                        }
                    }
                    if (l == 0) {
                        if (!canPlaceTrack(player, world, x, y + 1, z + i)) {
                            return false;
                        }
                    }
                    if (l == 1) {
                        if (!canPlaceTrack(player, world, x - i, y + 1, z)) {
                            return false;
                        }
                    }
                    if (l == 3) {
                        if (!canPlaceTrack(player, world, x + i, y + 1, z)) {
                            return false;
                        }
                    }
                }
                placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
                TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
                tcRail.setFacing(l);
                tcRail.setType(type.getLabel());
                tcRail.idDrop = idDropped;
                tcRail.slopeHeight = 1;
                tcRail.slopeAngle = slopeAngle;
                tcRail.slopeLength = gagEnd + 1;

                Block block = world.getBlock(x, y, z);
                int blockID = Block.getIdFromBlock(block);
                tcRail.setBallastMaterial(blockID);
                tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);


                for (int i2 = 1; i2 <= gagEnd; i2++) {
                    if (l == 2) {
                        placeTrack(world, x, y + 1, z - i2, BlockIDs.tcRailGag.block, l);
                        tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - i2);
                        tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
                    }
                    if (l == 0) {
                        placeTrack(world, x, y + 1, z + i2, BlockIDs.tcRailGag.block, l);
                        tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + i2);
                        tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
                    }
                    if (l == 1) {
                        placeTrack(world, x - i2, y + 1, z, BlockIDs.tcRailGag.block, l);
                        tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x - i2, y + 1, z);
                        tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
                    }
                    if (l == 3) {
                        placeTrack(world, x + i2, y + 1, z, BlockIDs.tcRailGag.block, l);
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
                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;


            }
            else if (type == TrackTypes.TWO_WAYS_CROSSING || type == TrackTypes.EMBEDDED_TWO_WAYS_CROSSING) {
                switch (type) {
                    case TWO_WAYS_CROSSING:
                        typeVariantStraight = TrackTypes.SMALL_STRAIGHT.getLabel();
                        typeVariantCrossing = TrackTypes.TWO_WAYS_CROSSING.getLabel();
                        break;

                    case EMBEDDED_TWO_WAYS_CROSSING:
                        typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
                        typeVariantCrossing = TrackTypes.EMBEDDED_TWO_WAYS_CROSSING.getLabel();
                        break;

                }



                if (!canPlaceTrack(player, world, x, y + 1, z)) {
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
                    sideFacing = 1;
                }
                if (l == 3) {
                    xDisplace = 1;
                    zSideDisplace = 1;
                    sideFacing = 2;
                }
                if (l == 0) {
                    zDisplace = 1;
                    xSideDisplace = 1;
                    sideFacing = 1;
                }
                if (l == 1) {
                    xDisplace = -1;
                    zSideDisplace = 1;
                    sideFacing = 2;
                }

                if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
                    return false;
                }
                if (!canPlaceTrack(player, world, x + (xDisplace) + (xSideDisplace), y + 1,
                        z + (zDisplace) + (zSideDisplace))) {
                    return false;
                }
                if (!canPlaceTrack(player, world, x + (xDisplace) - (xSideDisplace), y + 1,
                        z + (zDisplace) - (zSideDisplace))) {
                    return false;
                }

                /*
                 * Top
                 */

                putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
                        z + (zDisplace * 2), 0, typeVariantStraight, true, x + (xDisplace), y + 1,
                        z + (zDisplace), false, false);

                // putDownSingleRail(world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l,
                // x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0,
                // TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1,
                // z+(zDisplace*3), false, false);

                //Main

                placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
                TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
                tcRail2.setFacing(l);
                tcRail2.cx = x + (xDisplace);
                tcRail2.cy = y + 1;
                tcRail2.cz = z + (zDisplace);
                tcRail2.setType(typeVariantCrossing);
                tcRail2.idDrop = this.type.getItem().item;

                /*
                 * Bottom
                 */

                // putDownSingleRail(world, x + (xDisplace), y + 1, z + (zDisplace), l, x +
                // (xDisplace), y + 1,
                // z + (zDisplace), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x +
                // (xDisplace * 2), y + 1,
                // z + (zDisplace * 2), false, false);

                putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true,
                        x + (xDisplace), y + 1, z + (zDisplace), false, false);

                /*
                 * Right
                 */

                putDownSingleRail(world, x + (xDisplace) + (xSideDisplace), y + 1,
                        z + (zDisplace) + (zSideDisplace), sideFacing,
                        x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace) + (zSideDisplace), 0,
                        typeVariantStraight, true, x + (xDisplace), y + 1, z + (zDisplace),
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
                        typeVariantStraight, true, x + (xDisplace), y + 1, z + (zDisplace),
                        false, false);

//				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, TrackTypes.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);

                if (player == null || !player.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
                return true;

            }
        }
        return false;
    }


    private TrackTypes getPlacementDirection(EntityPlayer player, World world, int l, float par10) {
        if (!world.isRemote) {

            /** Determines if track is left or right*/
            float yaw = MathHelper.wrapAngleTo180_float(player != null ? player.rotationYaw : par10);
            tempType = type;

            if (type == TrackTypes.MEDIUM_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.MEDIUM_RIGHT_TURN;

                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.MEDIUM_LEFT_TURN;
                }
            }
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
            if (type == TrackTypes.SUPER_LARGE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.SUPER_LARGE_RIGHT_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.SUPER_LARGE_LEFT_TURN;
                }
            }
            if (type == TrackTypes.TURN_29X29) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.RIGHT_TURN_29X29;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LEFT_TURN_29X29;

                }
            }
            if (type == TrackTypes.TURN_32X32) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.RIGHT_TURN_32X32;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LEFT_TURN_32X32;

                }
            }
            if (type == TrackTypes.MEDIUM_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.MEDIUM_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.MEDIUM_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.VERY_LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.VERY_LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.VERY_LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.SUPER_LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.SUPER_LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.SUPER_LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.SMALL_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.SMALL_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.SMALL_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == TrackTypes.MEDIUM_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.MEDIUM_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.MEDIUM_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == TrackTypes.LARGE_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.LARGE_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LARGE_LEFT_PARALLEL_CURVE;
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
            if (type == TrackTypes.VERY_LARGE_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.VERY_LARGE_RIGHT_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.VERY_LARGE_LEFT_SWITCH;
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
            if (type == TrackTypes.MEDIUM_45DEGREE_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.MEDIUM_RIGHT_45DEGREE_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.MEDIUM_LEFT_45DEGREE_SWITCH;
                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_TURN;
                }
            }
            if (type == TrackTypes.EMBEDDED_LARGE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_RIGHT_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_LEFT_TURN;
                }
            }
            if (type == TrackTypes.EMBEDDED_VERY_LARGE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_LEFT_TURN;
                }
            }
            if (type == TrackTypes.EMBEDDED_SUPER_LARGE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_TURN;
                }
            }
            if (type == TrackTypes.EMBEDDED_TURN_32X32) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_RIGHT_TURN_32X32;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LEFT_TURN_32X32;

                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN;

                }
            }
            if (type == TrackTypes.EMBEDDED_SMALL_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_SWITCH;
                }
            }
            if (type == TrackTypes.EMBEDDED_LARGE_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_RIGHT_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_LEFT_SWITCH;
                }
            }
            if (type == TrackTypes.EMBEDDED_VERY_LARGE_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_LEFT_SWITCH;
                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH;
                }
            }
            if (type == TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH;
                }
            }
            if (type == TrackTypes.LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }

            if (type == TrackTypes.EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }
            if (type == TrackTypes.VERY_LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }

            if (type == TrackTypes.EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }
            if (type == TrackTypes.SUPER_LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }

            if (type == TrackTypes.EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC;
                }
            }
            if (type == TrackTypes.DIAMOND_CROSSING) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.RIGHT_DIAMOND_CROSSING;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.LEFT_DIAMOND_CROSSING;
                }
            }
            if (type == TrackTypes.EMBEDDED_DIAMOND_CROSSING) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = TrackTypes.EMBEDDED_RIGHT_DIAMOND_CROSSING;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = TrackTypes.EMBEDDED_LEFT_DIAMOND_CROSSING;
                }
            }

        }
        return tempType;
    }

    /**
     * Track Placement (because onItemUse is getting too big)
     */

    private boolean smallStraight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {
        if (!canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
        TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
        tcRail.setFacing(l);
        tcRail.cx = x;
        tcRail.cy = y + 1;
        tcRail.cz = z;
        tcRail.setType(type.getLabel());
        tcRail.idDrop = this.type.getItem().item;
        return true;
    }

    private boolean straight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {

        int trackLength = 0; // Initialise tracklength for medium.
        int dx = 0;
        int dz = 0;

        //Adjust tracklength based on track type.
        if (type == TrackTypes.LONG_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_STRAIGHT) trackLength = 3;
        if (type == TrackTypes.VERY_LONG_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT) trackLength = 57;

        //Initialise arrays of Rails and Gags, based on tracklength.
        TileTCRail[] tileRail = new TileTCRail[(trackLength / 3) + 1];
        TileTCRailGag[] tileGag = new TileTCRailGag[(2*(trackLength / 3)) + 2];

        //determine direction for placement
        if (l == 0) dz = 1;
        if (l == 1) dx = -1;
        if (l == 2) dz = -1;
        if (l == 3) dx = 1;

        //Check placement

        for (int i = 0; i <= trackLength ; i += 3){
            if (
                    !canPlaceTrack(player,world, x + (i * dx), y + 1, z + (i * dz))
                    || !canPlaceTrack(player,world, x + (i * dx) + (dx), y + 1, z + (i * dz) + dz)
                    || !canPlaceTrack(player,world, x + (i * dx) + (dx * 2), y + 1, z + (i * dz) + (dz) * 2)){
                return false;
            }

        }
        //places track
        for (int i = 0; i <= trackLength ; i += 3){
            placeTrack(world, x + (i * dx), y + 1, z + (i * dz), BlockIDs.tcRail.block, l);
            tileRail[i / 3] = (TileTCRail) world.getTileEntity(x + (i * dx), y + 1, z + (i * dz));
            tileRail[i / 3].setType(type.getLabel());
            tileRail[i / 3].setFacing(l);
            tileRail[i / 3].idDrop = this.type.getItem().item;
            if (i / 3 != 0){
                tileRail[i / 3].isLinkedToRail = true;
                tileRail[i / 3].linkedX = x + dx;
                tileRail[i / 3].linkedY = y + 1;
                tileRail[i / 3].linkedZ = z + dz;
            }
            for (int j = 1; j < 3; j++){
                placeTrack(world, x + (i * dx) + (j * dx ), y + 1,z + (i * dz) + (j * dz ), BlockIDs.tcRailGag.block, l );
                tileGag[(i - (i/3))+ j - 1] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx ), y + 1,z + (i * dz) + (j * dz ));
            }
        }

        //gives Gag rails the TileTCRail as their origin
        for (TileTCRailGag tileTCRailGag : tileGag) {
            if (player != null && tileTCRailGag == null) {
                player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
                return false;
            }
            tileTCRailGag.originX = x;
            tileTCRailGag.originY = y + 1;
            tileTCRailGag.originZ = z;
            tileTCRailGag.type = TrackTypes.MEDIUM_STRAIGHT.getLabel();
        }



        return true;
    }
    private boolean rightDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {


        if (tempType.getLabel().contains("EMBEDDED")) {
            typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
            typeVariantDiagonal = TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
        }


        if (!canPlaceTrack(player, world, x, y + 1, z)) {
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
            sideFacing = 6;
        }
        if (l == 0) {
            zDisplace = 1;
            xSideDisplace = -1;
            sideFacing = 4;
        }
        if (l == 1) {
            xDisplace = -1;
            zSideDisplace = -1;
            sideFacing = 5;
        }
        if (l == 3) {
            xDisplace = 1;
            zSideDisplace = 1;
            sideFacing = 7;
        }

        if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
            return false;
        }

        //Top

        putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
                z + (zDisplace * 2), 0, typeVariantStraight, false, x + (xDisplace), y + 1,
                z + (zDisplace), false, false);

        //Main

        placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
        TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
        tcRail2.setFacing(l);
        tcRail2.cx = x + (xDisplace);
        tcRail2.cy = y + 1;
        tcRail2.cz = z + (zDisplace);
        tcRail2.setType(tempType.getLabel());
        tcRail2.idDrop = this.type.getItem().item;

        //Bottom


        putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false,
                x + (xDisplace), y + 1, z + (zDisplace), false, false);

        //Right

        putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
                z + (zDisplace * 2) + (zSideDisplace), sideFacing,
                x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);

        //Left

        putDownSingleRail(world, x - (xSideDisplace), y + 1,
                z - (zSideDisplace), sideFacing,
                x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);


        return true;
    }
    private boolean leftDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        if (tempType.getLabel().contains("EMBEDDED")) {
            typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
            typeVariantDiagonal = TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
        }


        if (!canPlaceTrack(player, world, x, y + 1, z)) {
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
            sideFacing = 5;
        }
        if (l == 0) {
            zDisplace = 1;
            xSideDisplace = -1;
            sideFacing = 7;
        }
        if (l == 1) {
            xDisplace = -1;
            zSideDisplace = -1;
            sideFacing = 4;
        }
        if (l == 3) {
            xDisplace = 1;
            zSideDisplace = 1;
            sideFacing = 6;
        }


        if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
            return false;
        }

        //Top

        putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
                z + (zDisplace * 2), 0, typeVariantStraight, false, x + (xDisplace), y + 1,
                z + (zDisplace), false, false);

        //Main

        placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
        TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
        tcRail2.setFacing(l);
        tcRail2.cx = x + (xDisplace);
        tcRail2.cy = y + 1;
        tcRail2.cz = z + (zDisplace);
        tcRail2.setType(tempType.getLabel());
        tcRail2.idDrop = this.type.getItem().item;

        //Bottom


        putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false,
                x + (xDisplace), y + 1, z + (zDisplace), false, false);

        //Left

        putDownSingleRail(world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
                z + (zDisplace * 2) - (zSideDisplace), sideFacing,
                x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);

        //Right

        putDownSingleRail(world, x + (xSideDisplace), y + 1,
                z + (zSideDisplace), sideFacing,
                x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);


        return true;
    }
    private boolean doubleDiamondCrossing(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {

        if (type.getLabel().contains("EMBEDDED")) {
            typeVariantStraight = TrackTypes.EMBEDDED_SMALL_STRAIGHT.getLabel();
            typeVariantDiagonal = TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
        }


        if (!canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }

        int zDisplace = 0;
        int xDisplace = 0;
        int xSideDisplace = 0;
        int zSideDisplace = 0;
        int sideFacing = l;
        int sideFacing2 = l;

        if (l == 2) {
            zDisplace = -1;
            xSideDisplace = 1;
            sideFacing = 6;
            sideFacing2 = 5;
        }
        if (l == 0) {
            zDisplace = 1;
            xSideDisplace = -1;
            sideFacing = 4;
            sideFacing2 = 7;
        }
        if (l == 1) {
            xDisplace = -1;
            zSideDisplace = -1;
            sideFacing = 5;
            sideFacing2 = 4;
        }
        if (l == 3) {
            xDisplace = 1;
            zSideDisplace = 1;
            sideFacing = 7;
            sideFacing2 = 6;
        }

        if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace) || !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2))) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xDisplace * 2) - xSideDisplace, y + 1, z + (zDisplace * 2) - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xSideDisplace), y + 1, z + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + (xDisplace * 2) + xSideDisplace, y + 1, z + (zDisplace * 2) + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - (xSideDisplace), y + 1, z - zSideDisplace)) {
            return false;
        }

        //Top

        putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
                z + (zDisplace * 2), 0, typeVariantStraight, false, x + (xDisplace), y + 1,
                z + (zDisplace), false, false);

        //Main

        placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
        TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
        tcRail2.setFacing(l);
        tcRail2.cx = x + (xDisplace);
        tcRail2.cy = y + 1;
        tcRail2.cz = z + (zDisplace);
        tcRail2.setType(type.getLabel());
        tcRail2.idDrop = this.type.getItem().item;

        //Bottom


        putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false,
                x + (xDisplace), y + 1, z + (zDisplace), false, false);
        //RIGHT
        putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
                z + (zDisplace * 2) + (zSideDisplace), sideFacing,
                x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace * 2) + (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);

        //Left

        putDownSingleRail(world, x - (xSideDisplace), y + 1,
                z - (zSideDisplace), sideFacing,
                x - (xSideDisplace), y + 1, z - (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);
        //Left2

        putDownSingleRail(world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
                z + (zDisplace * 2) - (zSideDisplace), sideFacing2,
                x - (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace * 2) - (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);

        //Right2

        putDownSingleRail(world, x + (xSideDisplace), y + 1,
                z + (zSideDisplace), sideFacing2,
                x + (xSideDisplace), y + 1, z + (zSideDisplace), 0,
                typeVariantDiagonal, false, x + (xDisplace), y + 1, z + (zDisplace),
                false, false);

        return true;
    }
    private boolean diagonalTwoWaysCrossing(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {
        if (type.getLabel().contains("EMBEDDED")) {
            typeVariantDiagonal = TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
        }


        if (!canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }

        int zDisplace = 0;
        int xDisplace = 0;
        int xSideDisplace = 0;
        int zSideDisplace = 0;
        int sideFacing = l;
        int sideFacing2 = l;

        if (l == 2) {
            zDisplace = -1;
            xSideDisplace = 1;
            sideFacing = 6;
            sideFacing2 = 5;
        }
        if (l == 0) {
            zDisplace = 1;
            xSideDisplace = -1;
            sideFacing = 4;
            sideFacing2 = 7;
        }
        if (l == 1) {
            xDisplace = -1;
            zSideDisplace = -1;
            sideFacing = 5;
            sideFacing2 = 4;
        }
        if (l == 3) {
            xDisplace = 1;
            zSideDisplace = 1;
            sideFacing = 7;
            sideFacing2 = 6;
        }

        if (!canPlaceTrack(player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
            return false;
        }


        //Main
        placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
        TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
        tcRail2.setFacing(l);
        tcRail2.cx = x + (xDisplace);
        tcRail2.cy = y + 1;
        tcRail2.cz = z + (zDisplace);
        tcRail2.setType(type.getLabel());
        tcRail2.idDrop = this.type.getItem().item;

        //RIGHT
        putDownSingleRail(world, x + xDisplace + (xSideDisplace), y + 1,
                z + zDisplace + (zSideDisplace), sideFacing,
                x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);

        //Left

        putDownSingleRail(world, x - xDisplace - (xSideDisplace), y + 1,
                z - zDisplace - (zSideDisplace), sideFacing,
                x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);
        //Left2

        putDownSingleRail(world, x + xDisplace - (xSideDisplace), y + 1,
                z + zDisplace - (zSideDisplace), sideFacing2,
                x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);

        //Right2

        putDownSingleRail(world, x - xDisplace + (xSideDisplace), y + 1,
                z - zDisplace + (zSideDisplace), sideFacing2,
                x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);


        return true;
    }
    private boolean fourWaysCrossing(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {

        if (type.getLabel().contains("EMBEDDED")) {
            typeVariantDiagonal = TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT.getLabel();
        }


        if (!canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }

        int zDisplace = 0;
        int xDisplace = 0;
        int xSideDisplace = 0;
        int zSideDisplace = 0;
        int sideFacing = l;
        int sideFacing2 = l;
        int facing = l;

        if (l == 2) {
            zDisplace = -1;
            xSideDisplace = 1;
            sideFacing = 6;
            sideFacing2 = 5;
            facing = 1;
        }
        if (l == 0) {
            zDisplace = 1;
            xSideDisplace = -1;
            sideFacing = 4;
            sideFacing2 = 7;
            facing = 1;
        }
        if (l == 1) {
            xDisplace = -1;
            zSideDisplace = -1;
            sideFacing = 5;
            sideFacing2 = 4;
            facing = 2;
        }
        if (l == 3) {
            xDisplace = 1;
            zSideDisplace = 1;
            sideFacing = 7;
            sideFacing2 = 6;
            facing = 2;
        }

        if (!canPlaceTrack(player, world, x + xDisplace + xSideDisplace, y + 1, z + zDisplace + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + xDisplace - xSideDisplace, y + 1, z + zDisplace - zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xDisplace, y + 1, z - zDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x + xSideDisplace, y + 1, z + zSideDisplace)) {
            return false;
        }
        if (!canPlaceTrack(player, world, x - xSideDisplace, y + 1, z - zSideDisplace)) {
            return false;
        }


        //Main
        placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
        TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z);
        tcRail2.setFacing(l);
        tcRail2.cx = x + (xDisplace);
        tcRail2.cy = y + 1;
        tcRail2.cz = z + (zDisplace);
        tcRail2.setType(type.getLabel());
        tcRail2.idDrop = this.type.getItem().item;


        //T
        putDownSingleRail(world, x + xDisplace, y + 1,
                z + zDisplace, l,
                x + (xDisplace), y + 1, z + zDisplace, 0,
                typeVariantStraight, false, x, y + 1, z,
                false, false);
        //B
        putDownSingleRail(world, x - xDisplace, y + 1,
                z - zDisplace, l,
                x - (xDisplace), y + 1, z - zDisplace, 0,
                typeVariantStraight, false, x, y + 1, z,
                false, false);
        //L
        putDownSingleRail(world, x + xSideDisplace, y + 1,
                z + zSideDisplace, facing,
                x + (xSideDisplace), y + 1, z + zSideDisplace, 0,
                typeVariantStraight, false, x, y + 1, z,
                false, false);
        //R
        putDownSingleRail(world, x - xSideDisplace, y + 1,
                z - zSideDisplace, facing,
                x - (xSideDisplace), y + 1, z - zSideDisplace, 0,
                typeVariantStraight, false, x, y + 1, z,
                false, false);


        //BR
        putDownSingleRail(world, x + xDisplace + (xSideDisplace), y + 1,
                z + zDisplace + (zSideDisplace), sideFacing,
                x + (xDisplace) + (xSideDisplace), y + 1, z + zDisplace + (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);

        //TL

        putDownSingleRail(world, x - xDisplace - (xSideDisplace), y + 1,
                z - zDisplace - (zSideDisplace), sideFacing,
                x - xDisplace - (xSideDisplace), y + 1, z - zDisplace - (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);
        //TR

        putDownSingleRail(world, x + xDisplace - (xSideDisplace), y + 1,
                z + zDisplace - (zSideDisplace), sideFacing2,
                x + (xDisplace) - (xSideDisplace), y + 1, z + zDisplace - (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);

        //BL

        putDownSingleRail(world, x - xDisplace + (xSideDisplace), y + 1,
                z - zDisplace + (zSideDisplace), sideFacing2,
                x - xDisplace + (xSideDisplace), y + 1, z - zDisplace + (zSideDisplace), 0,
                typeVariantDiagonal, false, x, y + 1, z,
                false, false);


        return true;
    }
    private boolean smallDiagonalStraight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {


        TileTCRailGag[] tileGag = new TileTCRailGag[2];

        int dx = 1;
        int dz = 1;

        if (l == 6) dz = -1;

        if (l == 4) dx = -1;

        if (l == 5){
            dx = -1;
            dz = -1;
        }

        if (!canPlaceTrack(player, world, x, y + 1, z) || !canPlaceTrack(player, world, x, y + 1, z + dz) || !canPlaceTrack(player, world, x + dx, y + 1, z)) {
            return false;
        }

        placeTrack(world, x, y + 1, z, BlockIDs.tcRail.block, l);
        TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);

        placeTrack(world, x, y + 1, z + dz, BlockIDs.tcRailGag.block, l);
        tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + dz);
        tileGag[0].canPlaceRollingstock = false;

        placeTrack(world, x + dx , y + 1, z, BlockIDs.tcRailGag.block, l);
        tileGag[1] = (TileTCRailGag) world.getTileEntity(x + dx, y + 1, z);
        tileGag[1].canPlaceRollingstock = false;
        tcRail.setFacing(l);
        tcRail.setType(type.getLabel());
        tcRail.setRailLength(1D);
        tcRail.idDrop = this.type.getItem().item;

        for (TileTCRailGag tileTCRailGag : tileGag) {
            if (player != null && tileTCRailGag == null) {
                player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
                return false;
            }
            tileTCRailGag.originX = x;
            tileTCRailGag.originY = y + 1;
            tileTCRailGag.originZ = z;
            tileTCRailGag.type = TrackTypes.SMALL_DIAGONAL_STRAIGHT.getLabel();
            tileTCRailGag.canPlaceRollingstock = false;
        }
        return true;
    }
    private boolean diagonalStraight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes type) {

        int trackLength = 0;
        if (type == TrackTypes.LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT) trackLength = 3;
        if (type == TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT || type == TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT) trackLength = 9;

        TileTCRail[] tcRail = new TileTCRail[(trackLength / 3) + 1];
        TileTCRailGag[] tcRailGag = new TileTCRailGag[8 * (trackLength / 3) + 8];

        int dx = 1;
        int dz = 1;

        if (l == 6) dz = -1;

        if (l == 4) dx = -1;

        if (l == 5){
            dx = -1;
            dz = -1;
        }

        for (int i = 0; i <= trackLength; i = i + 3){
            if (!canPlaceTrack(player, world, x + (i * dx), y + 1, z + (i * dz))
                    || !canPlaceTrack(player, world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz)
                    || !canPlaceTrack(player, world, x + (i * dx) + (2*dx), y + 1, z + (i * dz) + (2*dz)))

                return false;

            for(int j = 0; j < 3 ; j++){
                if(!canPlaceTrack(player, world, x + (i * dx) + dx, y + 1, z + (i * dz))
                || !canPlaceTrack(player, world, x + (i * dx) , y + 1, z + (i * dz) + dz))
                    return false;
            }
        }

        for (int i = 0; i <= trackLength; i = i + 3){
            placeTrack(world, x + (i * dx), y+ 1, z + (i * dz), BlockIDs.tcRail.block, l);
            tcRail[i / 3] = (TileTCRail) world.getTileEntity(x + (i * dx), y+ 1, z + (i * dz));
            tcRail[i / 3].setFacing(l);
            tcRail[(i / 3)].setType(type.getLabel());
            tcRail[0].setRailLength((double) trackLength + 3);
            tcRail[0].idDrop = this.type.getItem().item;
            tcRail[i / 3].setRailLength(3D);
            if (i / 3 != 0){
               tcRail[i / 3].isLinkedToRail = true;
               tcRail[i / 3].linkedX = x + dx;
                tcRail[i / 3].linkedY = y + 1;
                tcRail[i / 3].linkedZ = z + dz;
            }

            placeTrack(world, x + (i * dx) + dx, y + 1, z + (i * dz) + dz, BlockIDs.tcRailGag.block, l);
            tcRailGag[(3* i) - (i / 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + dx, y + 1, z + (i * dz) + dz);
            placeTrack(world,x + (i * dx) + (2 * dx), y + 1, z + (i * dz) + (2 * dz), BlockIDs.tcRailGag.block, l);
            tcRailGag[((3* i) - (i / 3)) + 1] = (TileTCRailGag) world.getTileEntity(x + (i * dx) +  (2 * dx), y + 1, z + (i * dz) + (2 * dz));

            for (int j = 0; j < 3; j++){
                placeTrack(world, x + (i * dx) + (j * dx ) + dx , y + 1, z + (i * dz) + (j * dz), BlockIDs.tcRailGag.block, l);
                tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 2)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx) + dx, y + 1, z + (i * dz) + (j * dz) );
                placeTrack(world, x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz, BlockIDs.tcRailGag.block, l);
                tcRailGag[((3 * i) - (i / 3)) + ((2 * j) + 3)] = (TileTCRailGag) world.getTileEntity(x + (i * dx) + (j * dx), y + 1, z + (i * dz) + (j * dz) + dz);
            }

        }

        for (TileTCRailGag tileTCRailGag : tcRailGag) {
            if (player != null && tileTCRailGag == null) {
                player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
                return false;
            }
            tileTCRailGag.originX = x;
            tileTCRailGag.originY = y + 1;
            tileTCRailGag.originZ = z;
            tileTCRailGag.type = type.getLabel();

        }

        return true;
    }
    private boolean mediumRightTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 1, 1, 2};
        int[] zArray = {0, 1, 1, 2, 2};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 1, x + 3, z - 3, 2.5, x + 3,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 3, 2.5, x - 2,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 3, z - 3, 2.5, x + 1,
                    y + 1, z - 2, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 3, z + 3, 2.5, x, y + 1,
                    z + 3, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean mediumLeftTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 1, 1, 2};
        int[] zArray = {0, 1, 1, 2, 2};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 3, z - 3, 2.5, x - 2,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 3, z + 3, 2.5, x + 3,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 3, z + 3, 2.5, x + 1,
                    y + 1, z + 3, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 3, z - 3, 2.5, x, y + 1,
                    z - 2, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean largeRightTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 1, 1, 2, 0, 1, 2, 3, 4, 3, 2};
        int[] zArray = {0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 1, x + 5, z - 5, 4.5, x + 5,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 5, z + 5, 4.5, x - 4,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 5, z - 5, 4.5, x + 1,
                    y + 1, z - 4, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 5, z + 5, 4.5, x, y + 1,
                    z + 5, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean largeLeftTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 1, 1, 2, 0, 1, 2, 3, 4, 3, 2};
        int[] zArray = {0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 5, z - 5, 4.5, x - 4,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x + 5, z + 5, 4.5, x + 5,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 5, z + 5, 4.5, x + 1,
                    y + 1, z + 5, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 5, z - 5, 4.5, x, y + 1,
                    z - 4, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean veryLargeRightTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9};
        int[] zArray = {0, 1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 6, 6, 7, 7, 8, 7, 8, 9, 8, 9, 8, 9, 9, 9};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 1, x + 10, z - 10, 9.5, x + 10,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 10, z + 10, 9.5, x - 9,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 10, z - 10, 9.5, x + 1,
                    y + 1, z - 9, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 10, z + 10, 9.5, x, y + 1,
                    z + 10, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean veryLargeLeftTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9};
        int[] zArray = {0, 1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 6, 6, 7, 7, 8, 7, 8, 9, 8, 9, 8, 9, 9, 9};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 10, z - 10, 9.5, x - 9,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x + 10, z + 10, 9.5, x + 10,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 10, z + 10, 9.5, x + 1,
                    y + 1, z + 10, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 10, z - 10, 9.5, x, y + 1,
                    z - 9, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean superLargeRightTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15};
        int[] zArray = {0, 1, 2, 3, 4, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 14, 15, 15, 15, 15};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 1, x + 16, z - 16, 15.5, x + 16,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 16, z + 16, 15.5, x - 15,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 16, z - 16, 15.5, x + 1,
                    y + 1, z - 15, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 2, x + 16, z + 16, 15.5, x, y + 1,
                    z + 16, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean superLargeLeftTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15};
        int[] zArray = {0, 1, 2, 3, 4, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 14, 15, 15, 15, 15};
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 15, z + 15, 15.5, x - 15,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x + 15, z + 15, 15.5, x + 16,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 15, z + 15, 15.5, x + 1,
                    y + 1, z + 16, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 15, z - 15, 15.5, x, y + 1,
                    z - 15, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean turn32XRight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1 ,1 ,2,2,2 ,2 ,2 ,2 ,3 ,3 ,3 ,3 ,3 ,4 ,4 , 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9,9 , 9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,15,15,15,16,16,16,17,17,18,18,18,19,19,20,20,20,21,21,22,22,23,23,24,24,25,25,26,26,27,27,28,28,29,29,30,31};
        int[] zArray = {0,1,2,3,4,5,6,7,2,3,4,5,6,7,8,9,10,11,8,9,10,11,12,13,11,12,13,14,15,12,13,14,15,16,15,16,17,18,16,17,18,19,20,18,19,20,19,20,21,20,21,22,21,22,23,22,23,24,23,24,25,24,25,26,25,26,25,26,27,26,27,28,27,28,27,28,29,28,29,28,29,30,29,30,29,30,29,30,30,31,30,31,30,31,30,31,30,31,30,31,31,31};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 32, z - 32, 31.5, x + 32,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 32, z + 32, 31.5, x - 31,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 32, z - 32, 31.5,  x + 1 ,
                    y + 1, z - 31 , tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 32, z + 32, 31.5, x, y + 1,
                    z + 32, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean turn32XLeft(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1 ,1 ,2,2,2 ,2 ,2 ,2 ,3 ,3 ,3 ,3 ,3 ,4 ,4 , 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9,9 , 9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,15,15,15,16,16,16,17,17,18,18,18,19,19,20,20,20,21,21,22,22,23,23,24,24,25,25,26,26,27,27,28,28,29,29,30,31};
        int[] zArray = {0,1,2,3,4,5,6,7,2,3,4,5,6,7,8,9,10,11,8,9,10,11,12,13,11,12,13,14,15,12,13,14,15,16,15,16,17,18,16,17,18,19,20,18,19,20,19,20,21,20,21,22,21,22,23,22,23,24,23,24,25,24,25,26,25,26,25,26,27,26,27,28,27,28,27,28,29,28,29,28,29,30,29,30,29,30,29,30,30,31,30,31,30,31,30,31,30,31,30,31,31,31};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 31, z + 31, 31.5, x - 31,
                    y + 1, z+1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x + 31, z + 31, 31.5, x + 32,
                    y + 1, z , tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 31, z + 31, 31.5, x + 1 ,
                    y + 1, z + 32, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 31, z - 31, 31.5, x, y + 1,
                    z - 31, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }


    private boolean turn29XRight(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType){
        int[] xArray = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1 ,2,2,2 ,2 ,2 ,3 ,3 ,3 ,3 ,4 ,4 ,4 , 5,5 ,5 ,5 ,6 ,6 ,6 ,7 , 7,7 ,8 ,8 ,8 ,9 ,9 ,9 ,10,10,10,11,11,11,12,12,13,13,14,14,14,15,15,16,16,16,17,17,18,18,18,19,19,20,20,21,21,21,22,22,23,23,24,24,25,25,26,27,28};
        int[] zArray = {0,1,2,3,4,5,6,7,3,4,5,6,7,8,9,10,8,9,10,11,12,11,12,13,14,13,14,15,14,15,16,17,16,17,18,17,18,19,18,19,20,19,20,21,20,21,22,21,22,23,22,23,23,24,23,24,25,24,25,24,25,26,25,26,25,26,27,26,27,26,27,26,27,28,27,28,27,28,27,28,27,28,28,28,28};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 29, z - 29, 28.5, x + 29,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 29, z + 29, 28.5, x - 28,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 29, z - 29, 28.5,  x + 1 ,
                    y + 1, z - 28 , tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 29, z + 29, 28.5, x, y + 1,
                    z + 29, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }

    private boolean turn29XLeft(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1 ,2,2,2 ,2 ,2 ,3 ,3 ,3 ,3 ,4 ,4 ,4 , 5,5 ,5 ,5 ,6 ,6 ,6 ,7 , 7,7 ,8 ,8 ,8 ,9 ,9 ,9 ,10,10,10,11,11,11,12,12,13,13,14,14,14,15,15,16,16,16,17,17,18,18,18,19,19,20,20,21,21,21,22,22,23,23,24,24,25,25,26,27,28};
        int[] zArray = {0,1,2,3,4,5,6,7,3,4,5,6,7,8,9,10,8,9,10,11,12,11,12,13,14,13,14,15,14,15,16,17,16,17,18,17,18,19,18,19,20,19,20,21,20,21,22,21,22,23,22,23,23,24,23,24,25,24,25,24,25,26,25,26,25,26,27,26,27,26,27,26,27,28,27,28,27,28,27,28,27,28,28,28,28};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 29, z + 29, 28.5, x - 28,
                    y + 1, z+1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x + 29, z + 29, 28.5, x + 29,
                    y + 1, z , tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 29, z + 28, 31.5, x + 1 ,
                    y + 1, z + 29, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 29, z - 29, 28.5, x, y + 1,
                    z - 28, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }

    private boolean mediumRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 1, 1};
            zArray = new int[]{0, 1, 2, 1, 2};
        } else {
            xArray = new int[]{0, 0, 0, 1, 1, 1, 2};
            zArray = new int[]{0, 1, 2, 1, 2, 3, 2};
        }
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 1, z - 2, 3.75, x + 4.25,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 1, z + 2, 3.75, x - 3.25,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 2, z - 1, 3.75, x + 1,
                    y + 1, z - 3.25, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 2, z + 1, 3.75, x, y + 1,
                    z + 4.25, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean mediumLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 1, 1};
            zArray = new int[]{0, 1, 2, 1, 2};
        } else {
            xArray = new int[]{0, 0, 0, 1, 1, 1, 2};
            zArray = new int[]{0, 1, 2, 1, 2, 3, 2};
        }

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 1, z - 2, 3.75, x - 3.25,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 1, z + 2, 3.75, x + 4.25,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 2, z + 1, 3.75, x + 1,
                    y + 1, z + 4.25, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 2, z - 1, 3.75, x, y + 1,
                    z - 3.25, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean largeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
            zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5};
        } else {
            xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3};
            zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5, 6, 5};
        }
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 2, z - 5, 8.49, x + 8.99,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 2, z + 5, 8.49, x - 7.99,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 5, z - 2, 8.49, x + 1,
                    y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 5, z + 2, 8.49, x,
                    y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    private boolean largeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
            zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5};
        } else {
            xArray = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3};
            zArray = new int[]{0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 5, 6, 5};
        }
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 2, z - 5, 8.49, x - 7.99,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 2, z + 5, 8.49, x + 8.99,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 5, z + 2, 8.49, x + 1,
                    y + 1, z + 8.99, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 5, z - 2, 8.49, x,
                    y + 1, z - 7.99, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean veryLargeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3};
            zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7};
        } else {
            xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
            zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7, 8, 7};

        }
        if (l == 2) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x + 11.39,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }

        if (l == 0) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x - 10.39,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 7, z - 3, 10.89, x + 1,
                    y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item))
                return false;
        }

        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 7, z + 3, 10.89, x,
                    y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean veryLargeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3};
            zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7};
        } else {
            xArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
            zArray = new int[]{0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 6, 7, 8, 7};
        }
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 3, x + 3, z - 7, 10.89, x - 10.39,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 1, x - 3, z + 7, 10.89, x + 11.39,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 2, x - 7, z - 3, 10.89, x + 1,
                    y + 1, z + 11.39, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 7, z + 3, 10.89, x,
                    y + 1, z - 10.39, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean superLargeRight45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4};
            zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10};
        } else {
            xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5};
            zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10, 11, 10};
        }

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 3, x + 4, z - 11, 15.69, x + 16.19,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 1, x - 4, z + 11, 15.69, x - 15.19,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 2, x - 11, z - 4, 15.69, x + 1,
                    y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 0, x + 11, z + 4, 15.69, x,
                    y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean superLargeLeft45DegreeTurn(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray;
        int[] zArray;
        if (player.isSneaking()) {
            xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4};
            zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10};
        } else {
            xArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5};
            zArray = new int[]{0, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 7, 8, 9, 10, 9, 10, 11, 10};
        }
        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 1, x - 4, z - 11, 15.69, x - 15.19,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
        }

        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 3, x + 4, z + 11, 15.69, x + 16.19,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
        }
        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 0, x - 11, z + 4, 15.69, x + 1,
                    y + 1, z + 16.19, tempType.getLabel(), tempType.getItem().item))
                return false;
        }

        if (l == 3) {
            return putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 2, x + 11, z - 4, 15.69, x,
                    y + 1, z - 15.19, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean largeRightCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4};
        int[] zArray = {0, 1, 1, 2, 2, 3, 2, 3, 4, 3, 4, 4};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, 4.5, x + 5,
                    y + 1, z + 1, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item)
                    ;
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, 4.5, x - 4,
                    y + 1, z, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, 4.5, x + 1,
                    y + 1, z - 4, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, 4.5, x,
                    y + 1, z + 5, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean largeLeftCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4};
        int[] zArray = {0, 1, 1, 2, 2, 3, 2, 3, 4, 3, 4, 4};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, 4.5, x - 4,
                    y + 1, z + 1, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item)
                    ;
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, 4.5, x + 5,
                    y + 1, z, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, 4.5, x + 1,
                    y + 1, z + 5, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, 4.5, x,
                    y + 1, z - 4, 0.1558f, 6.3639, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean veryLargeRightCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8};
        int[] zArray = {0, 1, 2, 3, 4, 2, 3, 4, 5, 4, 5, 6, 5, 6, 7, 6, 7, 7, 8, 7, 8, 8, 8};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, 8.5, x + 9,
                    y + 1, z + 1, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item)
                    ;
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, 8.5, x - 8,
                    y + 1, z, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, 8.5, x + 1,
                    y + 1, z - 8, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, 8.5, x,
                    y + 1, z + 9, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean veryLargeLeftCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8};
        int[] zArray = {0, 1, 2, 3, 4, 2, 3, 4, 5, 4, 5, 6, 5, 6, 7, 6, 7, 7, 8, 7, 8, 8, 8};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, 8.5, x - 8,
                    y + 1, z + 1, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item)
                    ;
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, 8.5, x + 9,
                    y + 1, z, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, 8.5, x + 1,
                    y + 1, z + 9, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, 8.5, x,
                    y + 1, z - 8, 0.083003f, 12.0208, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean superLargeRightCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {
        int[] xArray = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 12, 13, 13, 14, 15};
        int[] zArray = {0, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 8, 9, 10, 9, 10, 11, 10, 11, 12, 11, 12, 13, 12, 13, 12, 13, 14, 13, 14, 13, 14, 15, 14, 15, 14, 15, 14, 15, 15, 15};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, 15.5, x + 16,
                    y + 1, z + 1, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item)
                    ;
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, 15.5, x - 15,
                    y + 1, z, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, 15.5, x + 1,
                    y + 1, z - 15, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, 15.5, x,
                    y + 1, z + 16, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean superLargeLeftCurvedSlope(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 12, 13, 13, 14, 15};
        int[] zArray = {0, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 7, 5, 6, 7, 8, 9, 8, 9, 10, 9, 10, 11, 10, 11, 12, 11, 12, 13, 12, 13, 12, 13, 14, 13, 14, 13, 14, 15, 14, 15, 14, 15, 14, 15, 15, 15};

        if (l == 2) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, 15.5, x - 15,
                    y + 1, z + 1, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 0) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, 15.5, x + 16,
                    y + 1, z, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 1) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, 15.5, x + 1,
                    y + 1, z + 16, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        if (l == 3) {
            return putDownSlopedTurn(player, world, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, 15.5, x,
                    y + 1, z - 15, 0.045589f, 21.9203, tempType.getLabel(), tempType.getItem().item);
        }
        return true;
    }
    public boolean smallRightParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 0};
        int[] zArray = {0, 1, 2, 3, 4, 5};
        int[] xArray2 = {1, 1, 1, 1, 1, 1};
        int[] zArray2 = {7, 3, 4, 2, 6, 5};


        if (l == 2) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 2, x + 1, z - 7, 16.25, x + 16.75,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, true), 3, false, 2, x + 1, z - 7, 16.25, x - 14.75,
                        y + 1, z - 7, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 7);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 1;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 7;
            }
            return true;
        }
        if (l == 0) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 0, x - 1, z + 8, 16.25, x - 15.75,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);
            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, false), 1, false, 0, x - 1, z + 8, 16.25, x + 15.75,
                        y + 1, z + 8, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 7);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 1;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 7;
            }
            return true;
        }

        if (l == 1) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 1, x - 7, z - 1, 16.25, x + 1,
                    y + 1, z - 15.75, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, true), 2, false, 1, x - 7, z - 1, 16.25, x - 7,
                        y + 1, z + 15.75, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 7, y + 1, z - 1);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 7;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 1;
            }
            return true;
        }

        if (l == 3) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 3, x + 7, z + 1, 16.25, x,
                    y + 1, z + 16.75, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, false), 0, false, 3, x + 7, z + 1, 16.25, x + 8,
                        y + 1, z - 14.75, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 7, y + 1, z + 1);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 7;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 1;
            }
            return true;
        }
        return true;
    }
    public boolean smallLeftParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 0};
        int[] zArray = {0, 1, 2, 3, 4, 5};
        int[] xArray2 = {1, 1, 1, 1, 1, 1};
        int[] zArray2 = {7, 3, 4, 2, 6, 5};

        if (l == 2) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 2, x - 1, z - 7, 16.25, x - 15.75,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, true), 1, false, 2, x - 1, z - 7, 16.25, x + 15.75,
                        y + 1, z - 7, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 7);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 1;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 7;
            }
            return true;
        }

        if (l == 0) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 0, x + 1, z + 8, 16.25, x + 16.75,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, false), 3, false, 0, x + 1, z + 8, 16.25, x - 14.75,
                        y + 1, z + 8, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 7);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 1;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 7;
            }
            return true;
        }

        if (l == 1) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 1, x - 7, z + 1, 16.25, x + 1,
                    y + 1, z + 16.75, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, false), 0, false, 1, x - 7, z + 1, 16.25, x - 7,
                        y + 1, z - 14.75, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 7, y + 1, z + 1);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 7;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 1;
            }
            return true;
        }

        if (l == 3) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 3, x + 7, z - 1, 16.25, x,
                    y + 1, z - 15.75, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, true), 0, false, 3, x + 7, z - 1, 16.25, x + 8,
                        y + 1, z + 15.75, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 7, y + 1, z - 1);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 7;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 1;
            }
            return true;
        }

        return true;
    }
    private boolean parallelRightSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x + check, y + 1, z))
                return false;
        }
        if (!canPlaceTrack(player, world, x + 3, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 1) || !canPlaceTrack(player, world, x + 5, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 2) || !canPlaceTrack(player, world, x + 5, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 2) || !canPlaceTrack(player, world, x + 7, y + 1, z + 2) || !canPlaceTrack(player, world, x + 8, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 3) || !canPlaceTrack(player, world, x + 7, y + 1, z + 3) || !canPlaceTrack(player, world, x + 8, y + 1, z + 3) || !canPlaceTrack(player, world, x + 9, y + 1, z + 3) || !canPlaceTrack(player, world, x + 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x + 3, x + 2, x + 4, x + 5};
        int[] zArray = {z + 1, z + 1, z + 1, z + 1};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9,
                TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraight, false, x + 3, y + 1, z + 1, true, false);

            int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
            int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5,
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
        putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z + 1, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 3, y + 1, z + 1, false, false);
        }
        return true;
    }
    private boolean parallelRightSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x - check, y + 1, z))
                return false;
        }
        if (!canPlaceTrack(player, world, x - 3, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 1) || !canPlaceTrack(player, world, x - 5, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 2) || !canPlaceTrack(player, world, x - 5, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 2) || !canPlaceTrack(player, world, x - 7, y + 1, z - 2) || !canPlaceTrack(player, world, x - 8, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 3) || !canPlaceTrack(player, world, x - 7, y + 1, z - 3) || !canPlaceTrack(player, world, x - 8, y + 1, z - 3) || !canPlaceTrack(player, world, x - 9, y + 1, z - 3) || !canPlaceTrack(player, world, x - 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x - 3, x - 2, x - 4, x - 5};
        int[] zArray = {z - 1, z - 1, z - 1, z - 1};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8,
                TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraight, false, x - 3, y + 1, z - 1, true, false);

            int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
            int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6,
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
        putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z - 1, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 3, y + 1, z - 1, false, false);
        }
        return true;
    }
    private boolean parallelRightSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x, y + 1, z + check))
                return false;
        }
        if (!canPlaceTrack(player, world, x - 1, y + 1, z + 3) || !canPlaceTrack(player, world, x - 1, y + 1, z + 4) || !canPlaceTrack(player, world, x - 1, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 4) || !canPlaceTrack(player, world, x - 2, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 6) || !canPlaceTrack(player, world, x - 2, y + 1, z + 7) || !canPlaceTrack(player, world, x - 2, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 6) || !canPlaceTrack(player, world, x - 3, y + 1, z + 7) || !canPlaceTrack(player, world, x - 3, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 9) || !canPlaceTrack(player, world, x - 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x - 1, x - 1, x - 1, x - 1};
        int[] zArray = {z + 3, z + 2, z + 4, z + 5};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5,
                TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x - 1, y + 1, z + 3, true, false);

            int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
            int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10,
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
        putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z + 3, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z + 3, false, false);
        }
        return true;
    }
    private boolean parallelRightSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x, y + 1, z - check))
                return false; /** checks if the next 11 blocks can be placed */
        }
        if (!canPlaceTrack(player, world, x + 1, y + 1, z - 3) || !canPlaceTrack(player, world, x + 1, y + 1, z - 4) || !canPlaceTrack(player, world, x + 1, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 4) || !canPlaceTrack(player, world, x + 2, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 6) || !canPlaceTrack(player, world, x + 2, y + 1, z - 7) || !canPlaceTrack(player, world, x + 2, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 6) || !canPlaceTrack(player, world, x + 3, y + 1, z - 7) || !canPlaceTrack(player, world, x + 3, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 9) || !canPlaceTrack(player, world, x + 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x + 1, x + 1, x + 1, x + 1};
        int[] zArray = {z - 3, z - 2, z - 4, z - 5};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5,
                TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x + 1, y + 1, z - 3, true, false);

            int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
            int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9,
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
        putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z - 3, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z - 3, false, false);
        }

        return true;
    }
    private boolean parallelLeftSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String variantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x, y + 1, z - check))
                return false;
        }
        if (!canPlaceTrack(player, world, x - 1, y + 1, z - 3) || !canPlaceTrack(player, world, x - 1, y + 1, z - 4) || !canPlaceTrack(player, world, x - 1, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 4) || !canPlaceTrack(player, world, x - 2, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 6) || !canPlaceTrack(player, world, x - 2, y + 1, z - 7) || !canPlaceTrack(player, world, x - 2, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 6) || !canPlaceTrack(player, world, x - 3, y + 1, z - 7) || !canPlaceTrack(player, world, x - 3, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 9) || !canPlaceTrack(player, world, x - 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x - 1, x - 1, x - 1, x - 1};
        int[] zArray = {z - 3, z - 2, z - 4, z - 5};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5,
                TrackTypes.MEDIUM_LEFT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x - 1, y + 1, z - 3, true, false);

            int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
            int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9,
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
        putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraight, false, x - 1, y + 1, z - 3, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraight, true, x - 1, y + 1, z - 3, false, false);
        }
        return true;
    }
    private boolean parallelLeftSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x, y + 1, z + check))
                return false;
        }
        if (!canPlaceTrack(player, world, x + 1, y + 1, z + 3) || !canPlaceTrack(player, world, x + 1, y + 1, z + 4) || !canPlaceTrack(player, world, x + 1, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 4) || !canPlaceTrack(player, world, x + 2, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 6) || !canPlaceTrack(player, world, x + 2, y + 1, z + 7) || !canPlaceTrack(player, world, x + 2, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 6) || !canPlaceTrack(player, world, x + 3, y + 1, z + 7) || !canPlaceTrack(player, world, x + 3, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 9) || !canPlaceTrack(player, world, x + 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x + 1, x + 1, x + 1, x + 1};
        int[] zArray = {z + 3, z + 2, z + 4, z + 5};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5,
                TrackTypes.MEDIUM_LEFT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraight, false, x + 1, y + 1, z + 3, true, false);

            int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
            int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10,
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
        putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraight, false, x + 1, y + 1, z + 3, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraight, true, x + 1, y + 1, z + 3, false, false);
        }
        return true;
    }
    private boolean parallelLeftSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x + check, y + 1, z))
                return false;
        }
        if (!canPlaceTrack(player, world, x + 3, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 1) || !canPlaceTrack(player, world, x + 5, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 2) || !canPlaceTrack(player, world, x + 5, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 2) || !canPlaceTrack(player, world, x + 7, y + 1, z - 2) || !canPlaceTrack(player, world, x + 8, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 3) || !canPlaceTrack(player, world, x + 7, y + 1, z - 3) || !canPlaceTrack(player, world, x + 8, y + 1, z - 3) || !canPlaceTrack(player, world, x + 9, y + 1, z - 3) || !canPlaceTrack(player, world, x + 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x + 3, x + 2, x + 4, x + 5};
        int[] zArray = {z - 1, z - 1, z - 1, z - 1};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8,
                TrackTypes.MEDIUM_LEFT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraight, false, x + 3, y + 1, z - 1, true, false);

            int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
            int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6,
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
        putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x + 3, y + 1, z - 1, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x + 3, y + 1, z - 1, false, false);
        }
        return true;
    }
    private boolean parallelLeftSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType, String typeVariantStraight, Item idVariantSwitch) {
        for (int check = 1; check < 10; check++) {
            if (!canPlaceTrack(player, world, x - check, y + 1, z))
                return false;
        }
        if (!canPlaceTrack(player, world, x - 3, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 1) || !canPlaceTrack(player, world, x - 5, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 2) || !canPlaceTrack(player, world, x - 5, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 2) || !canPlaceTrack(player, world, x - 7, y + 1, z + 2) || !canPlaceTrack(player, world, x - 8, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 3) || !canPlaceTrack(player, world, x - 7, y + 1, z + 3) || !canPlaceTrack(player, world, x - 8, y + 1, z + 3) || !canPlaceTrack(player, world, x - 9, y + 1, z + 3) || !canPlaceTrack(player, world, x - 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
            return false;
        }
        int[] xArray = {x - 3, x - 2, x - 4, x - 5};
        int[] zArray = {z + 1, z + 1, z + 1, z + 1};
        if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9,
                TrackTypes.MEDIUM_LEFT_TURN.getLabel(), idVariantSwitch))
            return false;
        TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
        if (tcRailTurn != null) {
            tcRailTurn.hasModel = false;

            /** Switch rail 1 */
            putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, true, false);

            /** Switch rail 2 **/
            putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);
            /** Switch rail 3 **/
            putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraight, false, x - 3, y + 1, z + 1, true, false);

            int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
            int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
            if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5,
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
        putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, false, x - 3, y + 1, z + 1, false, false);
        for (int straight = 5; straight < 10; straight++) {
            putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraight, true, x - 3, y + 1, z + 1, false, false);
        }
        return true;
    }
    private boolean mediumRightParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1};
        int[] zArray = {0, 1, 2, 3, 4, 3, 4, 5};

        int[] xArray2 = {2, 1, 1, 1, 2, 2, 2, 2};
        int[] zArray2 = {11, 6, 7, 8, 7, 8, 9, 10};

        if (l == 2) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 2, x + 2, z - 11, 18.5, x + 19,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;


                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, true), 3, false, 2, x + 2, z - 11, 18.5, x - 16,
                        y + 1, z - 11, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 11);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 2;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 11;
            }
            return true;
        }

        if (l == 0) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 0, x - 2, z + 11, 18.5, x - 18,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;


                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, false), 3, false, 0, x - 2, z + 11, 18.5, x + 17,
                        y + 1, z + 12, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 11);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 2;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 11;
            }
            return true;
        }

        if (l == 1) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 1, x - 11, z - 2, 18.5, x + 1,
                    y + 1, z - 18, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;


                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, true), 2, false, 1, x - 11, z - 2, 18.5, x - 11,
                        y + 1, z + 17, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 11, y + 1, z - 2);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 11;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 2;
            }
            return true;
        }

        if (l == 3) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 3, x + 11, z + 2, 18.5, x,
                    y + 1, z + 19, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, false), 0, false, 3, x + 11, z + 2, 18.5, x + 12,
                        y + 1, z - 16, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 11, y + 1, z + 2);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 11;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 2;
            }
            return true;
        }

        return false;

    }
    private boolean mediumLeftParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 1, 1, 1};
        int[] zArray = {0, 1, 2, 3, 4, 3, 4, 5};
        int[] xArray2 = {2, 1, 1, 1, 2, 2, 2, 2};
        int[] zArray2 = {11, 6, 7, 8, 7, 8, 9, 10};

        if (l == 2) {
            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 2, x - 2, z - 11, 18.5, x - 18,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, true), 1, false, 2, x - 2, z - 11, 18.5, x + 17,
                        y + 1, z - 11, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 11);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 2;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 11;
            }
            return true;
        }

        if (l == 0) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 0, x + 2, z + 11, 18.5, x + 19,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;


                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, false), 3, false, 0, x + 2, z + 11, 18.5, x - 16,
                        y + 1, z + 12, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 11);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 2;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 11;
            }
            return true;
        }

        if (l == 1) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 1, x - 11, z + 2, 18.5, x + 1,
                    y + 1, z + 19, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;


                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, false), 0, false, 1, x - 11, z + 2, 18.5, x - 11,
                        y + 1, z - 16, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 11, y + 1, z + 2);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 11;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 2;
            }
            return true;
        }

        if (l == 3) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 3, x + 11, z - 2, 18.5, x,
                    y + 1, z - 18, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;

                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, true), 2, false, 3, x + 11, z - 2, 18.5, x + 12,
                        y + 1, z + 17, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;

                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 11, y + 1, z - 2);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;

                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 11;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 2;
            }
            return true;
        }
        return false;
    }
    private boolean largeRightParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int[] zArray = {0, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8};
        int[] xArray2 = {3, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        int[] zArray2 = {15, 7, 8, 9, 10, 11, 10, 11, 12, 13, 14};

        if (l == 2) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, true), l, false, 2, x + 3, z - 15, 22, x + 22.5,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, true), 3, false, 2, x + 3, z - 15, 22, x - 18.5,
                        y + 1, z - 15, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 15);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 3;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 15;
            }
            return true;

        }

        if (l == 0) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, false), l, false, 0, x - 3, z + 15, 22, x - 21.5,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, false), 1, false, 0, x - 3, z + 15, 22, x + 19.5,
                        y + 1, z + 16, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 15);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 3;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 15;
            }
            return true;

        }

        if (l == 1) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, true), l, false, 1, x - 15, z - 3, 22, x + 1,
                    y + 1, z - 21.5, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, true), 2, false, 1, x - 15, z - 3, 22, x - 15,
                        y + 1, z + 19.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 15, y + 1, z - 3);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 15;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 3;
            }
            return true;

        }
        if (l == 3) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, false), l, false, 3, x + 15, z + 3, 22, x,
                    y + 1, z + 22.5, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, false), 0, false, 3, x - 15, z + 3, 22, x + 16,
                        y + 1, z - 18.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 15, y + 1, z + 3);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 15;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 3;
            }
            return true;

        }
        return false;
    }
    private boolean largeLeftParallelCurve(EntityPlayer player, World world, int x, int y, int z, int l, TrackTypes tempType) {

        int[] xArray = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int[] zArray = {0, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8};
        int[] xArray2 = {3, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        int[] zArray2 = {15, 7, 8, 9, 10, 11, 10, 11, 12, 13, 14};

        if (l == 2) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, true), flipArraySign(zArray, z, true), l, false, 2, x - 3, z - 15, 22, x - 21.5,
                    y + 1, z + 1, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, true), flipArraySign(zArray2, z, true), 1, false, 2, x - 3, z - 15, 22, x + 19.5,
                        y + 1, z - 15, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 15);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 3;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 15;
            }
            return true;

        }

        if (l == 0) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray, x, false), flipArraySign(zArray, z, false), l, false, 0, x + 3, z + 15, 22, x + 22.5,
                    y + 1, z, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(xArray2, x, false), flipArraySign(zArray2, z, false), 3, false, 0, x + 3, z + 15, 22, x - 18.5,
                        y + 1, z + 16, TrackTypes.MEDIUM_RIGHT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 15);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 3;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 15;
            }
            return true;

        }

        if (l == 1) {


            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, true), flipArraySign(xArray, z, false), l, false, 1, x - 15, z + 3, 22, x + 1,
                    y + 1, z + 22.5, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);

            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, true), flipArraySign(xArray2, z, false), 0, false, 1, x - 15, z + 3, 22, x - 15,
                        y + 1, z - 18.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 15, y + 1, z + 3);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x - 15;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z + 3;
            }
            return true;

        }
        if (l == 3) {

            if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray, x, false), flipArraySign(xArray, z, true), l, false, 0, x + 15, z - 3, 22, x,
                    y + 1, z - 21.5, tempType.getLabel(), tempType.getItem().item))
                return false;
            TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


            if (tcRailTurn != null) {
                tcRailTurn.hasModel = true;
                if (!putDownTurn(player, world, false, x, y, z, flipArraySign(zArray2, x, false), flipArraySign(xArray2, z, true), 0, false, 0, x - 15, z - 3, 22, x + 16,
                        y + 1, z + 19.5, TrackTypes.MEDIUM_LEFT_TURN.getLabel(), null))
                    return false;
                TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 15, y + 1, z - 3);

                if (tcRailTurn2 != null) {
                    tcRailTurn2.hasModel = false;
                    tcRailTurn2.isLinkedToRail = true;
                    tcRailTurn2.linkedX = x;
                    tcRailTurn2.linkedY = y + 1;
                    tcRailTurn2.linkedZ = z;
                }
                tcRailTurn.isLinkedToRail = true;
                tcRailTurn.linkedX = x + 15;
                tcRailTurn.linkedY = y + 1;
                tcRailTurn.linkedZ = z - 3;
            }
            return true;

        }
        return false;
    }

    /**
     * Drop the previous block before placing the track.
     */
    private void placeTrack(World world, int x, int y, int z, Block block, int metadata) {
        Block removed = world.getBlock(x, y, z);
        if (removed != null) {
            removed.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
        }
        world.setBlock(x, y, z, block, metadata, 3);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + type.getTooltip());
    }

    public TrackTypes getTrackType() {
        return this.type;

    }

}

