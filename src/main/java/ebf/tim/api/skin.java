package ebf.tim.api;

import net.minecraft.util.ResourceLocation;

/**
 * This class is replaced by TransportSkin to support better naming conventions
 * and to prevent nameplace conflicts with JavaFX
 */
@Deprecated
public class skin extends TransportSkin {
    public skin(String modId, String[] texture, String name, String description) {
        super(modId, texture, name, description);
    }

    @Deprecated
    @Override
    public skin setBogieTextures(String[] textures){
        super.setBogieTextures(textures);
        return this;
    }
    @Deprecated
    @Override
    public skin setBogieTextures(ResourceLocation... textures){
        super.setBogieTextures(textures);
        return this;
    }
}
