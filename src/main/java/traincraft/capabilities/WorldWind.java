package traincraft.capabilities;

public class WorldWind {
 
    private int windStrength = 0;
    
    public WorldWind(int windStrength) {
        this.windStrength = windStrength;
    }
    
    public int getWindStrength() {
        return windStrength;
    }
    
    public void setWindStrength(int windStrength) {
        this.windStrength = windStrength;
    }
}
