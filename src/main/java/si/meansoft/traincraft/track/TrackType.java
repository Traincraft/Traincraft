/*
 * This file ("TrackType.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.track;

import si.meansoft.traincraft.api.AbstractBlockTrack;

/**
 * @author canitzp
 */
public enum TrackType{

    TEST_TRACK("test_track", TrackGrid.getStraightSlope(32)),
    TEST_CURVE("test_curve", TrackGrid.getCurve(9), true, false),
    TEST_SLOPE("test_slope", TrackGrid.getStraightGrid(6), false, true),

    STRAIGHT_SINGLE("straight_single", TrackGrid.getStraightGrid(1)),
    STRAIGHT_SHORT("straight_short", TrackGrid.getStraightGrid(2)),
    STRAIGHT_MIDDLE("straight_middle", TrackGrid.getStraightGrid(4)),
    STRAIGHT_LONG("straight_long", TrackGrid.getStraightGrid(6)),
    STRAIGHT_EXTREME("straight_extreme", TrackGrid.getStraightGrid(12)),
    STRAIGHT_ULTIMATE("straight_ultimate", TrackGrid.getStraightGrid(18));

    private final String internName;
    private final TrackGrid grid;
    protected AbstractBlockTrack block;

    private final boolean isCurve, isSlope;

    TrackType(String internName, TrackGrid grid, boolean isCurve, boolean isSlope) {
        this.internName = internName;
        this.grid = grid;
        this.isCurve = isCurve;
        this.isSlope = isSlope;
    }

    TrackType(String internName, TrackGrid grid) {
        this(internName, grid, false, false);
    }

    public String getInternName() {
        return internName;
    }

    public TrackGrid getGrid() {
        return grid;
    }

    public AbstractBlockTrack getBlock() {
        return block;
    }

    public <T extends AbstractBlockTrack> T setBlock(T track){
        this.block = track;
        return track;
    }

    public boolean isCurve() {
        return isCurve;
    }

    public boolean isSlope() {
        return isSlope;
    }

    public boolean isStraight(){
        return !isSlope && !isCurve;
    }

}
