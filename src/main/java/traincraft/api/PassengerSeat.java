package traincraft.api;


import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public class PassengerSeat {

    private boolean controllingSeat;
    private AxisAlignedBB boundingBox;
    private Vec3d centerPoint;
    private Entity currentUser;
    
    public PassengerSeat(AxisAlignedBB boundingBox) {
        this.boundingBox = boundingBox;
        this.centerPoint = new Vec3d(boundingBox.minX + (this.getWidth() / 2D), boundingBox.minY + (this.getHeight() / 2D), boundingBox.minZ + (this.getDepth() / 2D));
    }
    
    public AxisAlignedBB getBoundingBox() {
        return boundingBox;
    }
    
    public Vec3d getCenter(){
        return this.centerPoint;
    }
    
    public double getWidth() {
        return this.boundingBox.maxX - this.boundingBox.minX;
    }
    
    public double getHeight() {
        return this.boundingBox.maxY - this.boundingBox.minY;
    }
    
    public double getDepth() {
        return this.boundingBox.maxZ - this.boundingBox.minZ;
    }
    
    public Entity getCurrentUser() {
        return currentUser;
    }
    
    public void setCurrentUser(Entity currentUser) {
        this.currentUser = currentUser;
    }
    
    public boolean isFree(){
        return this.currentUser == null;
    }
    
    public boolean isUsedBy(Entity entity){
        return !this.isFree() && this.currentUser.equals(entity);
    }
    
    public void setAsController(){
        this.controllingSeat = true;
    }
    
    public boolean isControllingSeat() {
        return controllingSeat;
    }
}
