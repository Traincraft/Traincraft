package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.*;
import train.common.tile.TileTCRail;

public class RenderTCRail extends TileEntitySpecialRenderer {

	private static final ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
	private static final ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
	private static final ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();
	private static final ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
	private static final ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();
	private static final ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
	private static final ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
	private static final ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();
	private static final ModelSlopeTCTrack modelSlope = new ModelSlopeTCTrack();
	private static final ModelLargeSlopeTCTrack modelLargeSlope = new ModelLargeSlopeTCTrack();
	private static final ModelVeryLargeSlopeTCTrack	modelVeryLargeSlope = new ModelVeryLargeSlopeTCTrack();

	public RenderTCRail() {
		
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		if(var1 instanceof TileTCRail){
			TileTCRail railTile = (TileTCRail) var1;
			
			if (railTile.hasModel && railTile.getTrackType() != null) {
				switch (railTile.getTrackType()){
					case MEDIUM_TURN:
					case MEDIUM_RIGHT_TURN: {
						modelRightTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_TURN: {
						modelLeftTurn.render("medium", railTile, x, y, z);
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
					case LONG_STRAIGHT:
						break;
					case MEDIUM_STRAIGHT: {
						modelMediumStraight.render(railTile, x, y, z);
						break;
					}
					case SMALL_STRAIGHT:{
						modelSmallStraight.render("straight", railTile, x, y, z);break;
					}
					case SMALL_ROAD_CROSSING:{
						modelRoadCrossing.render("crossing", railTile, x, y, z); break;
					}
					case SMALL_ROAD_CROSSING_1:{
						modelRoadCrossing.render("crossing1", railTile, x, y, z); break;
					}
					case SMALL_ROAD_CROSSING_2:{
						modelRoadCrossing.render("crossing2", railTile, x, y, z); break;
					}
					case TWO_WAYS_CROSSING: {
						modelTwoWaysCrossing.render(x, y, z);
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
				}


			}
		}
	}
}
