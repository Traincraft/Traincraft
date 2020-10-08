package ebf.tim.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.ModelBase;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>New Bogie</h1>
 * This is used to keep track of where bogies are supposed to render, and is intended to be client only.
 * @author Eternal Blue Flame
 */
public class Bogie {

    /**the current yaw rotation.*/
    public float rotationYaw;
    /**the model defined in the registration of this.*/
    public ModelBase bogieModel;
    public float[] offset = new float[]{0,0,0},prevPos = null, position = new float[]{0,0,0};

    public List<Bogie> subBogies=new ArrayList<>();


    public double sqrtPos = 0, oldSqrtPos = 0;


    public Bogie(ModelBase model, @Nullable float[] offset){
        this.bogieModel = model;
        if(offset!=null) {
            this.offset = offset;
        }
    }

    public Bogie(ModelBase model, float offset){
        this.bogieModel = model;
        this.offset = new float[]{offset,0,0};
    }
    public Bogie(ModelBase model, float offsetX, float offsetY, float offsetZ){
        this.bogieModel = model;
        this.offset = new float[]{offsetX,offsetY,offsetZ};
    }
    public Bogie(ModelBase model, float offsetX, float offsetY, float offsetZ, Bogie[] bogies){
        this.bogieModel = model;
        this.offset = new float[]{offsetX,offsetY,offsetZ};
        Collections.addAll(this.subBogies, bogies);
    }
    public Bogie(ModelBase model, @Nullable float[] offset, Bogie[] bogies){
        this.bogieModel = model;
        if(offset!=null) {
            this.offset = offset;
        }
        Collections.addAll(this.subBogies, bogies);
    }

    public Bogie addSubBogie(ModelBase model, float offsetX, float offsetY, float offsetZ){
        subBogies.add(new Bogie(model,offsetX,offsetY,offsetZ));
        return this;
    }

    public Bogie addSubBogie(ModelBase model, float[] offset){
        subBogies.add(new Bogie(model,offset));
        return this;
    }

    public Bogie addSubBogie(Bogie sub){
        subBogies.add(sub);
        return this;
    }

    /**
     * <h2>handle rotation of model</h2>
     * updates the positions of the model, and then uses that data to set the rotations.
     * @param entity the GenericRailTransport to get the pitch from.
     */
    public void setRotation(GenericRailTransport entity){
        //update positions
        if(prevPos == null){
            rotationYaw = entity.rotationYaw;
            sqrtPos= oldSqrtPos = Math.sqrt(entity.posX * entity.posX) + Math.sqrt(entity.posZ * entity.posZ);
        } else if (sqrtPos - 2 > oldSqrtPos || sqrtPos + 2 <oldSqrtPos) {
            oldSqrtPos = Math.sqrt(entity.posX * entity.posX) + Math.sqrt(entity.posZ * entity.posZ);
            rotationYaw = CommonUtil.atan2degreesf(position[2] - prevPos[2], position[0] - prevPos[0]);
            prevPos = position;
        } else {
            sqrtPos = Math.sqrt(entity.posX * entity.posX) + Math.sqrt(entity.posZ * entity.posZ);
        }
    }
}
