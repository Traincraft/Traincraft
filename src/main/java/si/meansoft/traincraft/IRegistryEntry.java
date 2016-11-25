/*
 * This file ("IRegistryEntry.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author canitzp
 */
public interface IRegistryEntry{

    IRegistryEntry[] getRegisterElements();

    String getRegisterName();

    void onRegister(IRegistryEntry[] otherEntries);

    void ownRegistry();

    @SideOnly(Side.CLIENT)
    default void loadClientSide(){}

}
