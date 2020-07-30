/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TraincraftModel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.renderer;

import com.google.gson.JsonObject;
import net.fexcraft.lib.tmt.Format2Model;

/**
 * A class representing general model data for Traincraft.
 * A sub class can be used to animate models or just call specific methods.
 *
 * @author Fexcraft
 * @since 5.0.0
 */
public class TraincraftModel extends Format2Model {
    
    public TraincraftModel(){
    }
    
    public TraincraftModel(JsonObject jsonObject){
        super(jsonObject);
    }
    
}
