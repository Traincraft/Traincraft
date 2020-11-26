package ebf.tim.render;

import ebf.tim.entities.GenericRailTransport;

public class AnimList {


    /**
     ------------------------------
     Group Effects
     ------------------------------
     The following effects use their groupID to divide up which sets should render.
     for example:
     a model that uses 2 groupID's will split the inventory in two, with the first group rendering at >=50%
     use and the second at 100%.
     A model that uses 4 group ID's will split the inventory in four, rendering each group in increments of >=25%

     these are managed by:
     @see GroupedModelRender
     */

    /**renders cargo blocks using the model texture*/
    public String tagCargoTextured(int groupID){return GroupedModelRender.tagRenderModelCargo+groupID;}
    /**renders cargo blocks using the texture from the relevant block in the inventory*/
    public String tagCargoBlockTexture(int groupID){return GroupedModelRender.tagRenderBlockCargo+groupID;}
    /**renders cargo blocks using the model texture, the height is scaled based on slots filled*/
    public String tagScaleTextured(int groupID){return GroupedModelRender.tagScaleInventory+groupID;}
    /**renders cargo blocks using the texture from the relevant block in the inventory,
     * s the height is scaled based on slots filled*/
    public String tagScaleBlockTexture(int groupID){return GroupedModelRender.tagBlockScaleInventory+groupID;}


    /**
     ------------------------------
     Individual Effects
     ------------------------------
     these effects are all simple and to the point
     these are managed by
     @see StaticModelAnimator
     */

    /**tag for rods that move in a simple circle such as coupling rods.*/
    public String tagCouplingRod(){ return " simplepiston ";}
    /**tag for advanced pistons, ones that rotate and move in a simple circle.*/
    public String tagAdvancedPiston(){return " advancedpiston ";}
    /**tag for animatedPart, axles, and other geometry that just spins.*/
    public String tagSimpleRotate(){return " simplerotate ";}
    /**tag for wheels, adds support for the sparks on top of what tagSimpleRotate does.*/
    public String tagWheel(){return " wheel ";}
    /**tag for lamp bases to glow and ignore MC lighting*/
    public String tagGlow(){return " glow ";}
    /**animation tag to prevent the part from rendering*/
    public String tagHide(){return " cull ";}


    public String tagDoorSlide(int direction){return "";}

    public String tagDoorSwing(int direction, boolean flip){return "";}
    //todo: door types - swing, swing up, slide sideways, slide vertical(stair covers), slide out (retractable stairs).




    /**
     ------------------------------
     Particle Effects
     ------------------------------
     * These effects are a bit more advanced, and configured in the entity using the id value
     * @see GenericRailTransport#getParticleData(int)
     */

    /**Lamp tag for sphere lamps, usually things like decorative lights*/
    public String lampSphere(int id){return " lamp sphere " + id;}
    /**Lamp tag for cone lamps, usually things like headlamps*/
    public String lampCone(int id){return " lamp cone " + id;}
    /**Lamp tag for mars lamps, usually for headlamps that have a slight spin on them, often used on emergency vehicles*/
    public String lampMars(int id){return " lamp mars " + id;}
    /**Lamp tag for siren lamps, that do a full rotation on one axis, often used on emergency vehicles*/
    public String lampSiren(int id){return " lamp siren " + id;}
    /**Lamp tag for lamp glare, usually things like tail lights that let off enough light to see but not actually emit*/
    public String lampGlare(int id){return " lamp glare " + id;}
    /**tag for smoke like on a chimney or diesel exhaust*/
    public static String tagSmoke(int id){return " smoke " + id;}
    /**Tag for steam like in a steam locomotive valve gear*/
    public static String tagSteam(int id){return " steam " + id;}

    //offset animations
    /**tag for rods that move in a simple circle such as coupling rods.
     * @param id references an index in:
     * @see GenericRailTransport#getAnimationData(int) */
    public static String tagOffsetCouplingRod(int id){return StaticModelAnimator.tagConnectingRodOffset(id);}
    /**tag for advanced pistons, ones that rotate and move in a simple circle.
     * @param id references an index in:
     * @see GenericRailTransport#getAnimationData(int) */
    public static String tagOffsetEccentricRod(int id){return StaticModelAnimator.tagEccentricRodOffset(id);}
    /**tag for wheels, axels, or parts of wheels/axels.
     * @param id references an index in:
     * @see GenericRailTransport#getAnimationData(int) */
    public static String tagOffsetWheel(int id){return StaticModelAnimator.tagWheelOffset(id);}

}
