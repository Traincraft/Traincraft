package ebf.tim.models;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.fcl.common.lang.ArrayList;
import fexcraft.tmt.slim.ModelRendererTurbo;

import java.util.List;

import static ebf.tim.utility.CommonUtil.degreesF;

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

    /**tag for rods that move in a simple circle such as wheel connectors.*/
    public static final String tagCouplingRod = " simplepiston ";
    /**tag for advanced pistons, ones that rotate and move in a simple circle.*/
    public static final String tagAdvancedPiston = " advancedpiston ";
    /**tag for animatedPart, axles, and other geometry that just spins.*/
    public static final String tagSimpleRotate = " simplerotate ";
    /**tag for wheels, adds support for the sparks on top of what tagSimpleRotate does.*/
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

    /**
     * used to create an instance of the class, use this to store any variables from the model or transport before animation starts.
     * @param model a refrence to the model geometry to animate.
     */
    public AnimationBase init(ModelRendererTurbo model, GenericRailTransport transport){
        StaticModelAnimator s = new StaticModelAnimator();
        switch (model.boxName) {
            case tagAdvancedPiston:
            case tagCouplingRod:
            case tagSimpleRotate:
            case tagWheel: {
                //DebugUtil.println("registering animated part: ", model.boxName);
                s.originalRotationValuesXYZ = new float[]{model.rotationPointX, model.rotationPointY, model.rotationPointZ,
                        model.rotateAngleX, model.rotateAngleY, model.rotateAngleZ};
                s.modelRefrence = model;
                return s;
            }
            case tagGlow:{
                s.modelRefrence.ignoresLighting=true;
                return s;
            }
            default:{return null;}
        }
    }

    /**
     * returns true if the part being checked should be added to the animation list for the entity.
     * when overriding, do not call the super method, it's unnecessary overhead.
     * @param part the part to check
     */
    public boolean isPart(ModelRendererTurbo part){
        if(part==null || part.boxName==null){return false;}
        return CommonUtil.stringContains(part.boxName,tagAdvancedPiston) ||
                CommonUtil.stringContains(part.boxName, tagCouplingRod) ||
                CommonUtil.stringContains(part.boxName,tagSimpleRotate) ||
                CommonUtil.stringContains(part.boxName,tagWheel) ||
                CommonUtil.stringContains(part.boxName," smoke ") ||
                CommonUtil.stringContains(part.boxName," steam ") ||
                CommonUtil.stringContains(part.boxName," door ");// ||
                //CommonUtil.stringContains(part.boxName," lamp ");
    }


    public boolean culls(ModelRendererTurbo part){
        return CommonUtil.stringContains(part.boxName, tagHide);
    }


    /**
     * Actually animate the geometry.
     * to add more animations override this and add your own checks before calling the super.
     * when overriding, do not call the super method, it's unnecessary overhead.
     * @param rotationZ the rotation degree for the animation.
     */
    public void animate(float rotationZ, float[] pistonOffset, GenericRailTransport host){
        if(modelRefrence ==null || modelRefrence.boxName ==null){
            return;
        }
        //animate wheels
        if(CommonUtil.stringContains(modelRefrence.boxName,tagSimpleRotate)
                || CommonUtil.stringContains(modelRefrence.boxName,tagWheel)){
            modelRefrence.rotateAngleZ = rotationZ*-29f;
        }
        //animate simple pistons, just rotates around center
        if(CommonUtil.stringContains(modelRefrence.boxName, tagCouplingRod)){
            float[] positionOffset = CommonUtil.rotatePointF(pistonOffset[0],pistonOffset[1],pistonOffset[2],
                    rotationZ *degreesF,
                    rotationZ *degreesF, 0);

            modelRefrence.rotationPointY = originalRotationValuesXYZ[1] -  positionOffset[1];
            modelRefrence.rotationPointX = originalRotationValuesXYZ[0] - positionOffset[0];
        }
        //animate advanced pistons, uses position and rotation
        if(CommonUtil.stringContains(modelRefrence.boxName, tagAdvancedPiston)){
            float[] positionOffset = CommonUtil.rotatePointF(pistonOffset[0],pistonOffset[1],pistonOffset[2],
                    rotationZ *degreesF,
                    rotationZ *degreesF, 0);

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
