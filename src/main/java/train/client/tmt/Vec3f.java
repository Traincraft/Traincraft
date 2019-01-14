package train.client.tmt;

/**
 * basically the same as Vec3D, but a float. Usually used for storing rotations.
 * @author Ferdinand
 */

public class Vec3f {

    public float xCoord;
    public float yCoord;
    public float zCoord;

    public Vec3f(){
        xCoord = 0;
        yCoord = 0;
        zCoord = 0;
    }

    public Vec3f(float f, float g, float h){
        xCoord = f;
        yCoord = g;
        zCoord = h;
    }
}
