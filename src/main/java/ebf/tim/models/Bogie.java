package ebf.tim.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.Vec3f;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bogie {

    /**the current yaw rotation.*/
    public float rotationYaw;
    /**the model defined in the registration of this.*/
    public ModelBase bogieModel;
    public float[] offset = new float[]{0,0},prevPos = null, position = new float[]{0,0};

    public List<Bogie> subBogies=new ArrayList<>();



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
        if(prevPos!=position && prevPos!=null && position!=null&&entity.getVelocity()>0.001) {
            rotationYaw = CommonUtil.atan2degreesf(prevPos[1] - position[1], prevPos[0] - position[0]);
            //DebugUtil.println(entity.rotationYaw, rotationYaw);
            if(rotationYaw>entity.rotationYaw+120||rotationYaw<entity.rotationYaw-120){
                rotationYaw=-rotationYaw;
            }
            for(Bogie b : subBogies){
                b.setRotation(entity);
            }
        } else if(prevPos==null){
            rotationYaw=entity.rotationYaw;
        }
    }

    public void setPosition(GenericRailTransport entity, Vec3f prevOffset){
        prevPos = position;
        if(prevOffset==null){
            prevOffset= CommonUtil.rotatePoint(new Vec3f(offset[0],0,offset[1]),0,entity.rotationYaw,0);
            rotationYaw=entity.rotationYaw;
        } else {
            prevOffset.add(CommonUtil.rotatePoint(new Vec3f(offset[0],0,offset[1]),0,entity.rotationYaw,0));
        }
        position=new float[]{(float)entity.posX+prevOffset.xCoord, (float)entity.posZ+prevOffset.zCoord};

        for(Bogie b : subBogies){
            b.setPosition(entity,prevOffset);
        }
    }
}
