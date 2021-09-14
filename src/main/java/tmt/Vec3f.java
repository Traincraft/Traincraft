package tmt;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

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

    public Vec3f(Vec3 v){
        xCoord = (float)v.xCoord;
        yCoord = (float)v.yCoord;
        zCoord= (float)v.zCoord;
    }

    public Vec3f(float f, float g, float h){
        xCoord = f;
        yCoord = g;
        zCoord = h;
    }

    public Vec3f(double x, double y, double z){
        xCoord = (float) x;
        yCoord = (float) y;
        zCoord = (float) z;
    }

    public Vec3f crossProduct(Vec3f p_72431_1_) {
        return new Vec3f(this.yCoord * p_72431_1_.zCoord - this.zCoord * p_72431_1_.yCoord, this.zCoord * p_72431_1_.xCoord - this.xCoord * p_72431_1_.zCoord, this.xCoord * p_72431_1_.yCoord - this.yCoord * p_72431_1_.xCoord);
    }

    public Vec3f normalize() {
        float d0 = MathHelper.sqrt_double(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
        return d0 < 1.0E-4D ? new Vec3f(0.0F, 0.0F, 0.0F) : new Vec3f(this.xCoord / d0, this.yCoord / d0, this.zCoord / d0);
    }

    public void add(Vec3f vec){
        xCoord+=vec.xCoord;
        yCoord+=vec.yCoord;
        zCoord+=vec.zCoord;
    }
    public Vec3f addVector(float x, float y, float z){
        return new Vec3f(xCoord + x,yCoord + y,zCoord + z);
    }

    public Vec3f subtract(Vec3f vec){
        return new Vec3f(xCoord-vec.xCoord,
        yCoord-vec.yCoord,
        zCoord-vec.zCoord);
    }


    //this could be moved to vec3f
    public Vec3f getRelativeVector(Vec3f vec){
        Matrix4f mat = new Matrix4f();
        mat.m00 = vec.xCoord; mat.m10 = vec.yCoord; mat.m20 = vec.zCoord;
        Matrix4f.rotate(zCoord  * 3.14159265F / 180, new Vector3f(1F, 0F, 0F), mat, mat);
        Matrix4f.rotate(yCoord * 3.14159265F / 180, new Vector3f(0F, 0F, 1F), mat, mat);
        Matrix4f.rotate(xCoord   * 3.14159265F / 180, new Vector3f(0F, 1F, 0F), mat, mat);
        return new Vec3f(mat.m00, mat.m10, mat.m20);
    }
}
