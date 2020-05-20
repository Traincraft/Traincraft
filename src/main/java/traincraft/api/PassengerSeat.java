package traincraft.api;


import net.minecraft.entity.Entity;

public class PassengerSeat {

    private boolean controllingSeat;
    private float x, y, z, width, height;
    private Entity currentUser;
    
    public PassengerSeat(float x, float y, float z, float width, float height) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public float getZ() {
        return z;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float getHeight() {
        return height;
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
