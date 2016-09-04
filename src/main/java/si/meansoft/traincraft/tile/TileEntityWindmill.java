package si.meansoft.traincraft.tile;

import net.minecraft.util.ITickable;

/**
 * @author canitzp
 */
public class TileEntityWindmill extends TileEntityBase implements ITickable{

    public int currentWindStrenght;

    public TileEntityWindmill(){
        super("Windmill");
    }

    public int getWindValue(){
        int windStrength = (int) (currentWindStrenght + (((double) getPos().getY() / 256) * 10));
        if (getWorld().isThundering()) {
            windStrength *= 7.5;
        }else if (getWorld().isRaining()) {
            windStrength *= 4.5;
        }
        if (windStrength > 80){
            windStrength = 80;
        } else if(windStrength <= 0){
            windStrength = 1;
        }
        return windStrength;
    }

    @Override
    public void update(){

    }

}
