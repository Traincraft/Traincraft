package train.common.mtc;

public class LineWaypoint {
    private String waypointName;
    private Double xCoord;
    private Double yCoord;
    private Double zCoord;

    public LineWaypoint (String waypointName, Double xCoord, Double yCoord, Double zCoord) {
        this.waypointName = waypointName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public String getWaypointName() {
        return waypointName;
    }
    public Double getXCoord() {
        return xCoord;
    }
    public Double getYCoord() {
        return yCoord;
    }
    public Double getZCoord() {
        return zCoord;
    }

}
