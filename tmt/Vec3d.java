package tmt;

import net.minecraft.util.Vec3;

/**
 * @author EternalBlueFlame
 * <h1>Vector 3d</h1>
 * this is intended to replicate the Vec3d from minecraft 1.8+
 * mostly it just makes handling vector 3's simpler.
 */
public class Vec3d extends Vec3 {

    public Vec3d(double x, double y, double z){
        super(x,y,z);
    }

    public Vec3d(Vec3 vec){super(vec.xCoord, vec.yCoord, vec.zCoord);}

    public void add(Vec3d vec2){
        xCoord += vec2.xCoord;
        yCoord += vec2.yCoord;
        zCoord += vec2.zCoord;
    }

    public Vec3d subtract(Vec3d vec2){
        return new Vec3d(xCoord-vec2.xCoord,yCoord-vec2.yCoord,zCoord-vec2.zCoord);
    }
}
