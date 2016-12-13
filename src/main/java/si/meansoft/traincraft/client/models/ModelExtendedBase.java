/*
 * This file ("ModelExtendedBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelBase;

/**
 * @author canitzp
 */
public abstract class ModelExtendedBase extends ModelBase{

    public ModelExtendedBase(){
    }

    public abstract void render(float scale);

}
