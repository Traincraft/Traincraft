package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.*;
import train.common.items.ItemTCRail;
import train.common.tile.TileTCRail;

public class RenderTCRail extends TileEntitySpecialRenderer {

	private ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
	private ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
	private ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();
	private ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
	private ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();
	private ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
	private ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
	private ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();
	private ModelSlopeTCTrack modelSlope = new ModelSlopeTCTrack();
	private ModelLargeSlopeTCTrack modelLargeSlope = new ModelLargeSlopeTCTrack();
	private ModelVeryLargeSlopeTCTrack	modelVeryLargeSlope = new ModelVeryLargeSlopeTCTrack();

	public RenderTCRail() {
		
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		if(var1 instanceof TileTCRail){

			TileTCRail railTile = (TileTCRail) var1;
			
			if (railTile.hasModel && railTile.getType() != null) {
				String type = railTile.getType();
				
				if (ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel().equals(type)) {
					modelSmallStraight.render("straight", railTile, x, y, z);
				}
				if (ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING.getLabel().equals(type)) {
					modelRoadCrossing.render("crossing", railTile, x, y, z);
				}
				if (ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1.getLabel().equals(type)) {
					modelRoadCrossing.render("crossing1", railTile, x, y, z);
				}
				if (ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2.getLabel().equals(type)) {
					modelRoadCrossing.render("crossing2", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.TWO_WAYS_CROSSING.getLabel().equals(type)) {
					modelTwoWaysCrossing.render(x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_STRAIGHT.getLabel().equals(type)) {
					modelMediumStraight.render(railTile, x, y, z);
				}
			
				else if (ItemTCRail.TrackTypes.SLOPE_WOOD.getLabel().equals(type)) {
					modelSlope.render("wood", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.SLOPE_GRAVEL.getLabel().equals(type)) {
					modelSlope.render("gravel", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.SLOPE_BALLAST.getLabel().equals(type)) {
					modelSlope.render("ballast", railTile, x, y, z);
				}
			
				else if (ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD.getLabel().equals(type)) {
					modelLargeSlope.render("wood", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL.getLabel().equals(type)) {
					modelLargeSlope.render("gravel", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST.getLabel().equals(type)) {
					modelLargeSlope.render("ballast", railTile, x, y, z);
				}
			
				else if (ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD.getLabel().equals(type)) {
					modelVeryLargeSlope.render("wood", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL.getLabel().equals(type)) {
					modelVeryLargeSlope.render("gravel", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST.getLabel().equals(type)) {
					modelVeryLargeSlope.render("ballast", railTile, x, y, z);
				}
			
				else if (ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel().equals(type)) {
					modelRightTurn.render("medium", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel().equals(type)) {
					modelLeftTurn.render("medium", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel().equals(type)) {
					modelRightTurn.render("large", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.VERY_LARGE_RIGHT_TURN.getLabel().equals(type)) {
					modelRightTurn.render("very_large", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel().equals(type)) {
					modelLeftTurn.render("large", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.VERY_LARGE_LEFT_TURN.getLabel().equals(type)) {
					modelLeftTurn.render("very_large", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel().equals(type)) {
					modelRightSwitchTurn.render("medium", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel().equals(type)) {
					modelLeftSwitchTurn.render("medium", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel().equals(type)) {
					modelRightSwitchTurn.render("large_90", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel().equals(type)) {
					modelLeftSwitchTurn.render("large_90", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel().equals(type)) {
					modelRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
				}
				else if (ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel().equals(type)) {
					modelLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
				}
				
			}
		}
	}
}
