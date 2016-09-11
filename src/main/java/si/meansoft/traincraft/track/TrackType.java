package si.meansoft.traincraft.track;

import si.meansoft.traincraft.api.AbstractBlockTrack;

/**
 * @author canitzp
 */
public enum TrackType{

    TEST_TRACK("TestTrack", TrackGrid.getStraightSlope(32)),
    TEST_CURVE("TestCurve", TrackGrid.getCurve(9), true, false),
    TEST_SLOPE("TestSlope", TrackGrid.getStraightGrid(6), false, true),

    STRAIGHT_SINGLE("StraightSingle", TrackGrid.getStraightGrid(1)),
    STRAIGHT_SHORT("StraightShort", TrackGrid.getStraightGrid(2)),
    STRAIGHT_MIDDLE("StraightMiddle", TrackGrid.getStraightGrid(4)),
    STRAIGHT_LONG("StraightLong", TrackGrid.getStraightGrid(6)),
    STRAIGHT_EXTREME("StraightExtreme", TrackGrid.getStraightGrid(12)),
    STRAIGHT_ULTIMATE("StraightUltimate", TrackGrid.getStraightGrid(18));

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
