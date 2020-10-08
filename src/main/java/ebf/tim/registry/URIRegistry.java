package ebf.tim.registry;

import net.minecraft.util.ResourceLocation;

import static ebf.tim.TrainsInMotion.MODID;

/**
 * <h1> Resource Locations</h1>
 * Similar to android design, we use enums to define URI's for individual things, to keep it organized.
 * this is less of a registry and more of a list, because nothing is actually registered, this is just variables.
 * but it makes more sense to organize it with the registries then in a folder of it's own.
 * @author Eternal Blue Flame
 */
public enum URIRegistry {
    /**used for non-vanilla GUI textures*/
    GUI_PREFIX("textures/gui/"),
    /**used for train textures*/
    MODEL_TRAIN_TEXTURE("textures/sd/train/"),
    HD_MODEL_TRAIN_TEXTURE("textures/hd/train/"),
    /**used for icons*/
    ITEM_TRANSPORT_ICON("item/transport/"),
    /**used for rollingstock textures*/
    MODEL_ROLLINGSTOCK_TEXTURE("textures/sd/rollingstock/"),
    HD_MODEL_ROLLINGSTOCK_TEXTURE("textures/hd/rollingstock/"),
    /**used for rail textures*/
    MODEL_RAIL_TEXTURE("textures/rail/"),
    /**used for block textures*/
    MODEL_BLOCK_TEXTURE("textures/block/"),
    /**used for textures that have nothing to do with GUI, icons, or models, good for particle effects and such*/
    TEXTURE_GENERIC("textures/generic/"),
    /**used for horn/whistle sounds*/
    SOUND_HORN("audio/horns/"),
    /**used for running sounds, like a diesel's engine or steam train's 'chug' noise*/
    SOUND_RUNNING("audio/running/");

        private String value;
        URIRegistry(String value) {this.value = value;}
        public String getValue(){return value;}

    /**
     * <h2>get URI Resource Location</h2>
     * returns a Resource location for a texture or sound based on the URI and provided filename.
     * filename must include format, for example: .png or .ogg
     */
    public ResourceLocation getResource(String fileName){
            return new ResourceLocation(MODID, value + fileName);
    }
}
