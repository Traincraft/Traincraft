package ebf.tim.render;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.fcl.common.lang.ArrayList;
import fexcraft.tmt.slim.ModelRendererTurbo;

import java.util.List;

/**
 * <h2>Static model animator</h2>
 * used to add animations to otherwise static .java models.
 * to add own animations override render and this, or ASM this class and add functionality before the switch.
 * @author Eternal Blue Flame
 */
public class StaticModelAnimator extends AnimationBase {

    private static List<AnimationBase> customAnimators = makelist();

    private static List< AnimationBase> makelist(){
        List<AnimationBase> list = new ArrayList<>();
        list.add(new StaticModelAnimator());
        return list;
    }

    /**tag for rods that move in a simple circle such as wheel connectors, this is assumed to have an offset of 0.*/
    public static final String tagCouplingRod = " simplepiston ";
    /**tag for advanced pistons, ones that rotate and move in a simple circle, this is assumed to have an offset of 0.*/
    public static final String tagAdvancedPiston = " advancedpiston ";
    /**tag for animatedPart, axles, and other geometry that just spins.*/
    public static final String tagSimpleRotate = " simplerotate ";
    /**tag for wheels, adds support for the sparks on top of what tagSimpleRotate does, this is assumed to have an offset of 0.*/
    public static final String tagWheel = " wheel ";
    /**tag for lamp bases to glow and ignore MC lighting*/
    public static final String tagGlow=" glow ";
    /**animation tag to prevent the part from rendering*/
    public static final String tagHide=" cull ";

    /**
     * Note that types 2, 3, and 4 are not yet implemented.
     * @param type 0/unknown:cone. 1: sphere. 2:mars. 3:siren. 4:glare
     * @param id the ID associated with the transport method to define density, scale, and color:
     * @see GenericRailTransport#getParticleData(int)
     */
    public static String tagLamp(int type, int id){
        switch (type) {
            case 1: return " lamp sphere " + id;
            case 2: return " lamp mars " + id; //todo: does that weird Y/Z oogly spinning
            case 3: return " lamp siren " + id;//todo:spins on X at a set rate
            case 4: return " lamp glare " + id;//todo: perhaps render at point and disable 3d and depth?
            default: return " lamp cone " + id;
        }
    }

    public static String tagDoor(String type, int side, boolean mirror){
        return "";
    }
    //todo: door types - swing, swing up, slide sideways, slide vertical(stair covers), slide out (retractable stairs).

    public static String tagSmoke(int id){
        return " smoke " + id;
    }
    public static String tagSteam(int id){
        return " steam " + id;
    }


    public static String tagWheelOffset(int id){
        return " offsetwheel "+id;
    }

    public static String tagConnectingRodOffset(int id){
        return " offsetconnectingrod "+id;
    }

    public static String tagEccentricRodOffset(int id){
        return " offseteccentricrod "+id;
    }

    /**
     * used to create an instance of the class, use this to store any variables from the model or transport before animation starts.
     * @param model a refrence to the model geometry to animate.
     */
    public AnimationBase init(ModelRendererTurbo model, GenericRailTransport transport){
        StaticModelAnimator s = new StaticModelAnimator();
        boolean animating=false;

        if(CommonUtil.stringContains(model.boxName,
                tagAdvancedPiston,tagCouplingRod,tagSimpleRotate,tagWheel)){
            s.originalRotationValuesXYZ = new float[]{model.rotationPointX,
                    model.rotationPointY,
                    model.rotationPointZ,
                    model.rotateAngleX, model.rotateAngleY, model.rotateAngleZ};
            s.modelRefrence = model;
            animating=true;
        } else if(CommonUtil.stringContains(model.boxName, model.boxName," offsetwheel "," offsetconnectingrod "," offseteccentricrod ")){
            float[] offset=transport.getAnimationData(getID(model));
            float[] offsets=CommonUtil.rotatePointF(offset[1],0,offset[2],offset[0], 0,0);

            model.rotationPointX+=offsets[0];
                    model.rotationPointY+=offsets[1];
                    model.rotationPointZ+=offsets[2];

            s.originalRotationValuesXYZ = new float[]{model.rotationPointX,
                    model.rotationPointY,
                    model.rotationPointZ,
                    model.rotateAngleX, model.rotateAngleY, model.rotateAngleZ};
            s.modelRefrence = model;
            animating=true;

        }
        if(CommonUtil.stringContains(tagGlow)){
            s.modelRefrence.ignoresLighting=true;
            animating=true;
        }

        return animating?s:null;
    }

    /**
     * returns true if the part being checked should be added to the animation list for the entity.
     * when overriding, do not call the super method, it's unnecessary overhead.
     * @param part the part to check
     */
    public boolean isPart(ModelRendererTurbo part){
        if(part==null || part.boxName==null){return false;}
        return CommonUtil.stringContains(part.boxName,tagAdvancedPiston,
                tagCouplingRod, tagSimpleRotate,tagWheel," smoke "," steam "," door ",
                " offsetwheel "," offsetconnectingrod "," offseteccentricrod ");// ||
                //CommonUtil.stringContains(part.boxName," lamp ");
    }


    public boolean culls(ModelRendererTurbo part){
        return CommonUtil.stringContains(part.boxName, tagHide);
    }

    public int getID(ModelRendererTurbo part){
        if(CommonUtil.stringContains(part.boxName, " offsetwheel ")){
            return Integer.parseInt(part.boxName.split( " offsetwheel ")[1]);
        } else if(CommonUtil.stringContains(part.boxName, " offsetconnectingrod ")){
            return Integer.parseInt(part.boxName.split( " offsetconnectingrod ")[1]);
        } else if(CommonUtil.stringContains(part.boxName, " offseteccentricrod ")){
            return Integer.parseInt(part.boxName.split( " offseteccentricrod ")[1]);
        } else {
            return -1;
        }
    }


    /**
     * Actually animate the geometry.
     * to add more animations override this and add your own checks before calling the super.
     * when overriding, do not call the super method, it's unnecessary overhead.
     * @param rotationZ the rotation degree for the animation.
     */
    public void animate(float rotationZ, float[] pistonOffset, GenericRailTransport host){
        if(modelRefrence ==null || modelRefrence.boxName ==null || rotationZ==0){
            return;
        }
        //animate wheels
        if(CommonUtil.stringContains(modelRefrence.boxName,tagSimpleRotate,tagWheel, " offsetwheel ")){
            modelRefrence.rotateAngleZ =(rotationZ/(modelRefrence.height*3.14f));
        }
        //animate simple pistons, just rotates around center
        if(CommonUtil.stringContains(modelRefrence.boxName, tagCouplingRod, " offsetconnectingrod ")){
            float[] positionOffset = CommonUtil.rotatePointF(pistonOffset[1],0,pistonOffset[2],
                    rotationZ/(pistonOffset[1]*-31.4f),
                    rotationZ/((pistonOffset[1]+pistonOffset[2])*-31.4f), 0);

            modelRefrence.rotationPointY = originalRotationValuesXYZ[1] - positionOffset[1];
            modelRefrence.rotationPointX = originalRotationValuesXYZ[0] - positionOffset[0];
        }
        //animate advanced pistons, uses position and rotation
        if(CommonUtil.stringContains(modelRefrence.boxName, tagAdvancedPiston, " offseteccentricrod ")){
            float[] positionOffset = CommonUtil.rotatePointF(pistonOffset[1],0,pistonOffset[2],
                    rotationZ/(pistonOffset[1]*-31.4f),
                    rotationZ/((pistonOffset[1]+pistonOffset[2])*-31.4f), 0);

            modelRefrence.rotateAngleZ = originalRotationValuesXYZ[5] - (float)(positionOffset[2] * -0.1d);
        }
    }


    /*
    Internal methods to iterate all animators when finding support for a specific part.
     */
    static AnimationBase initPart(ModelRendererTurbo part, GenericRailTransport entity){
        if(part==null || part.boxName==null){return null;}
        for(AnimationBase b : customAnimators){
            if (b.isPart(part)) {
                return b.init(part, entity);
            }
        }
        return null;
    }

    static boolean checkAnimators(ModelRendererTurbo part){
    for (AnimationBase animator : customAnimators){
            if (animator != null && animator.isPart(part)) {
                return true;
            }
        }
        return false;
    }
    static boolean checkCulls(ModelRendererTurbo part){
        for (AnimationBase animator : customAnimators){
            if (animator != null && animator.culls(part)) {
                return true;
            }
        }
        return false;
    }

}
