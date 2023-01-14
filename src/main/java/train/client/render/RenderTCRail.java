package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.*;
import train.common.tile.TileTCRail;

public class RenderTCRail extends TileEntitySpecialRenderer {
	/**Normal Tracks*/
	public static final ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
	public static final ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
	public static final ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();
	public static final ModelSmallDiagonalStraightTCTrack modelSmallDiagonalStraight = new ModelSmallDiagonalStraightTCTrack();
	public static final ModelMediumDiagonalStraightTCTrack modelMediumDiagonalStraight = new ModelMediumDiagonalStraightTCTrack();
	public static final ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
	public static final ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();
	public static final ModelRight45DegreeTurnTCTrack model45DegreeRightTurn = new ModelRight45DegreeTurnTCTrack();
	public static final ModelLeft45DegreeTurnTCTrack model45DegreeLeftTurn = new ModelLeft45DegreeTurnTCTrack();
	public static final ModelRightParallelCurveTCTrack modelRightParallelCurve = new ModelRightParallelCurveTCTrack();
	public static final ModelLeftParallelCurveTCTrack modelLeftParallelCurve = new ModelLeftParallelCurveTCTrack();
	public static final ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();
	public static final ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
	public static final ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
	public static final ModelSlopeTCTrack modelSlope = new ModelSlopeTCTrack();
	public static final ModelLargeSlopeTCTrack modelLargeSlope = new ModelLargeSlopeTCTrack();
	public static final ModelVeryLargeSlopeTCTrack	modelVeryLargeSlope = new ModelVeryLargeSlopeTCTrack();
	public static final ModelRightCurvedSlopeTCTrack modelRightCurvedSlope = new ModelRightCurvedSlopeTCTrack();
	public static final ModelLeftCurvedSlopeTCTrack modelLeftCurvedSlope = new ModelLeftCurvedSlopeTCTrack();
	/**Embedded Tracks*/
	public static final ModelEmbeddedSmallStraightTCTrack modelEmbeddedSmallStraight = new ModelEmbeddedSmallStraightTCTrack();
	public static final ModelEmbeddedMediumStraightTCTrack modelEmbeddedMediumStraight = new ModelEmbeddedMediumStraightTCTrack();
	public static final ModelEmbeddedSmallDiagonalStraightTCTrack modelEmbeddedSmallDiagonalStraight = new ModelEmbeddedSmallDiagonalStraightTCTrack();
	public static final ModelEmbeddedMediumDiagonalStraightTCTrack modelEmbeddedMediumDiagonalStraight = new ModelEmbeddedMediumDiagonalStraightTCTrack();
	public static final ModelEmbeddedRightTurnTCTrack modelEmbeddedRightTurn = new ModelEmbeddedRightTurnTCTrack();
	public static final ModelEmbeddedLeftTurnTCTrack modelEmbeddedLeftTurn = new ModelEmbeddedLeftTurnTCTrack();
	public static final ModelEmbeddedRight45DegreeTurnTCTrack modelEmbeddedRight45DegreeTurn = new ModelEmbeddedRight45DegreeTurnTCTrack();
	public static final ModelEmbeddedLeft45DegreeTurnTCTrack modelEmbeddedLeft45DegreeTurn = new ModelEmbeddedLeft45DegreeTurnTCTrack();
	public static final ModelEmbeddedRightParallelCurveTCTrack modelEmbeddedRightParallelCurve = new ModelEmbeddedRightParallelCurveTCTrack();
	public static final ModelEmbeddedLeftParallelCurveTCTrack modelEmbeddedLeftParallelCurve = new ModelEmbeddedLeftParallelCurveTCTrack();
	public static final ModelEmbeddedRightSwitchTCTrack modelEmbeddedRightSwitchTurn = new ModelEmbeddedRightSwitchTCTrack();
	public static final ModelEmbeddedLeftSwitchTCTrack modelEmbeddedLeftSwitchTurn = new ModelEmbeddedLeftSwitchTCTrack();
	public static final ModelEmbeddedTwoWaysCrossingTCTrack modelEmbeddedTwoWaysCrossing = new ModelEmbeddedTwoWaysCrossingTCTrack();



	public RenderTCRail() {

	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8 ) {
		if(var1 instanceof TileTCRail){
			TileTCRail railTile = (TileTCRail) var1;
			if (railTile.hasModel && railTile.getTrackType() != null) {
				switch (railTile.getTrackType()){



					/**Normal Tracks*/
					case SMALL_STRAIGHT:{
						modelSmallStraight.render("straight", railTile, x, y, z);
						break;
					}
					case MEDIUM_STRAIGHT:
					case LONG_STRAIGHT:
					case VERY_LONG_STRAIGHT:{
						modelMediumStraight.render(railTile, x, y, z);
						break;
					}
					case SMALL_DIAGONAL_STRAIGHT:{
						modelSmallDiagonalStraight.render("diagonal", railTile, x, y, z);
						break;
					}
					case MEDIUM_DIAGONAL_STRAIGHT:
					case LONG_DIAGONAL_STRAIGHT:
					case VERY_LONG_DIAGONAL_STRAIGHT:{
						modelMediumDiagonalStraight.render("diagonal", railTile, x, y, z);
						break;
					}

					case MEDIUM_TURN:
					case MEDIUM_RIGHT_TURN: {
						modelRightTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_TURN: {
						modelLeftTurn.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_TURN:
					case LARGE_RIGHT_TURN: {
						modelRightTurn.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_TURN: {
						modelLeftTurn.render("large", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_TURN:
					case VERY_LARGE_RIGHT_TURN: {
						modelRightTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_LEFT_TURN: {
						modelLeftTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case SUPER_LARGE_TURN:
					case SUPER_LARGE_RIGHT_TURN: {
						modelRightTurn.render("super_large", railTile, x , y, z);
						break;
					}
					case SUPER_LARGE_LEFT_TURN: {
						modelLeftTurn.render("super_large", railTile, x , y, z);
						break;
					}
					case MEDIUM_45DEGREE_TURN:
					case MEDIUM_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_45DEGREE_TURN:{
						model45DegreeLeftTurn.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_45DEGREE_TURN:
					case LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_45DEGREE_TURN:{
						model45DegreeLeftTurn.render("large", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_45DEGREE_TURN:
					case VERY_LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("verylarge", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_LEFT_45DEGREE_TURN:{
						model45DegreeLeftTurn.render("verylarge", railTile, x, y, z);
						break;
					}
					case SUPER_LARGE_45DEGREE_TURN:
					case SUPER_LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("superlarge", railTile, x, y, z);
						break;
					}
					case SUPER_LARGE_LEFT_45DEGREE_TURN:{
						model45DegreeLeftTurn.render("superlarge", railTile, x, y, z);
						break;
					}
					case SMALL_PARALLEL_CURVE:
					case SMALL_RIGHT_PARALLEL_CURVE:{
						modelRightParallelCurve.render("small", railTile, x, y, z);
						break;
					}
					case SMALL_LEFT_PARALLEL_CURVE:{
						modelLeftParallelCurve.render("small", railTile, x, y, z);
						break;
					}

					case MEDIUM_PARALLEL_CURVE:
					case MEDIUM_RIGHT_PARALLEL_CURVE:{
						modelRightParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_PARALLEL_CURVE:{
						modelLeftParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_PARALLEL_CURVE:
					case LARGE_RIGHT_PARALLEL_CURVE: {
						modelRightParallelCurve.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_PARALLEL_CURVE: {
						modelLeftParallelCurve.render("large", railTile, x, y, z);
						break;
					}
					case TWO_WAYS_CROSSING: {
						modelTwoWaysCrossing.render(x, y, z);
						break;
					}
					case MEDIUM_SWITCH:
					case MEDIUM_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_SWITCH:
					case LARGE_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case MEDIUM_PARALLEL_SWITCH:
					case MEDIUM_RIGHT_PARALLEL_SWITCH: {
						modelRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_PARALLEL_SWITCH: {
						modelLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case MEDIUM_45DEGREE_SWITCH:
					case MEDIUM_RIGHT_45DEGREE_SWITCH: {
						modelRightSwitchTurn.render("medium_45degree", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_45DEGREE_SWITCH: {
						modelLeftSwitchTurn.render("medium_45degree", railTile, x, y, z);
						break;
					}
					case SLOPE_WOOD: {
						modelSlope.render("wood", railTile, x, y, z);
						break;
					}
					case SLOPE_GRAVEL: {
						modelSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case SLOPE_BALLAST: {
						modelSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case SLOPE_SNOW_GRAVEL: {
						modelSlope.render("snow", railTile, x, y, z);
						break;
					}
					case SLOPE_DYNAMIC: {
						modelSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SLOPE_DYNAMIC: {
						modelSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_WOOD: {
						modelLargeSlope.render("wood", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_GRAVEL: {
						modelLargeSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_BALLAST: {
						modelLargeSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_SNOW_GRAVEL: {
						modelLargeSlope.render("snow", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_DYNAMIC: {
						modelLargeSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_SLOPE_DYNAMIC: {
						modelLargeSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_WOOD: {
						modelVeryLargeSlope.render("wood", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_GRAVEL: {
						modelVeryLargeSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_BALLAST: {
						modelVeryLargeSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_SNOW_GRAVEL: {
						modelVeryLargeSlope.render("snow", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_DYNAMIC: {
						modelVeryLargeSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC: {
						modelVeryLargeSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}
					case LARGE_CURVED_SLOPE_DYNAMIC:
					case LARGE_RIGHT_CURVED_SLOPE_DYNAMIC:{
						modelRightCurvedSlope.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_CURVED_SLOPE_DYNAMIC:{
						modelLeftCurvedSlope.render("large", railTile, x, y, z);
						break;
					}

					/**Embedded Tracks*/
					case EMBEDDED_SMALL_STRAIGHT: {
						modelEmbeddedSmallStraight.render("straight", railTile, x, y, z);
						break;
					}
					case SMALL_ROAD_CROSSING:{
						modelRoadCrossing.render("crossing", railTile, x, y, z);
						break;
					}
					case SMALL_ROAD_CROSSING_1:{
						modelRoadCrossing.render("crossing1", railTile, x, y, z);
						break;
					}
					case SMALL_ROAD_CROSSING_2:{
						modelRoadCrossing.render("crossing2", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_STRAIGHT:
					case EMBEDDED_LONG_STRAIGHT:
					case EMBEDDED_VERY_LONG_STRAIGHT:{
						modelEmbeddedMediumStraight.render(railTile, x, y, z);
						break;
					}
					case EMBEDDED_SMALL_DIAGONAL_STRAIGHT:{
						modelEmbeddedSmallDiagonalStraight.render("diagonal", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT:
					case EMBEDDED_LONG_DIAGONAL_STRAIGHT:
					case EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT:{
						modelEmbeddedMediumDiagonalStraight.render("diagonal", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_TURN:
					case EMBEDDED_MEDIUM_RIGHT_TURN: {
						modelEmbeddedRightTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_TURN: {
						modelEmbeddedLeftTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_TURN:
					case EMBEDDED_LARGE_RIGHT_TURN: {
						modelEmbeddedRightTurn.render("large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_TURN: {
						modelEmbeddedLeftTurn.render("large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_TURN:
					case EMBEDDED_VERY_LARGE_RIGHT_TURN: {
						modelEmbeddedRightTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_LEFT_TURN: {
						modelEmbeddedLeftTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_TURN:
					case EMBEDDED_SUPER_LARGE_RIGHT_TURN: {
						modelEmbeddedRightTurn.render("super_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_LEFT_TURN: {
						modelEmbeddedLeftTurn.render("super_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_45DEGREE_TURN:
					case EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN: {
						modelEmbeddedRight45DegreeTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN:{
						modelEmbeddedLeft45DegreeTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_45DEGREE_TURN:
					case EMBEDDED_LARGE_RIGHT_45DEGREE_TURN: {
						modelEmbeddedRight45DegreeTurn.render("large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_45DEGREE_TURN:{
						modelEmbeddedLeft45DegreeTurn.render("large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_45DEGREE_TURN:
					case EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN: {
						modelEmbeddedRight45DegreeTurn.render("verylarge", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN: {
						modelEmbeddedLeft45DegreeTurn.render("verylarge", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_45DEGREE_TURN:
					case EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN: {
						modelEmbeddedRight45DegreeTurn.render("superlarge", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN: {
						modelEmbeddedLeft45DegreeTurn.render("superlarge", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SMALL_PARALLEL_CURVE:
					case EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE:{
						modelEmbeddedRightParallelCurve.render("small", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SMALL_LEFT_PARALLEL_CURVE:{
						modelEmbeddedLeftParallelCurve.render("small", railTile, x, y, z);
						break;
					}

					case EMBEDDED_MEDIUM_PARALLEL_CURVE:
					case EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE:{
						modelEmbeddedRightParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE:{
						modelEmbeddedLeftParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_PARALLEL_CURVE:
					case EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE:{
						modelEmbeddedRightParallelCurve.render("large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_PARALLEL_CURVE:{
						modelEmbeddedLeftParallelCurve.render("large", railTile, x, y, z);
						break;
					}

					case EMBEDDED_TWO_WAYS_CROSSING: {
						modelEmbeddedTwoWaysCrossing.render(x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_SWITCH:
					case EMBEDDED_MEDIUM_RIGHT_SWITCH: {
						modelEmbeddedRightSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_SWITCH: {
						modelEmbeddedLeftSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_SWITCH:
					case EMBEDDED_LARGE_RIGHT_SWITCH: {
						modelEmbeddedRightSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_SWITCH: {
						modelEmbeddedLeftSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_PARALLEL_SWITCH:
					case EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH: {
						modelEmbeddedRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH: {
						modelEmbeddedLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_45DEGREE_SWITCH:
					case EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH: {
						modelEmbeddedRightSwitchTurn.render("medium_45degree", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH: {
						modelEmbeddedLeftSwitchTurn.render("medium_45degree", railTile, x, y, z);
						break;
					}










				}


			}
		}
	}
}
