/*
 * This file ("FluidBlockBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.fluids;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;

/**
 * @author canitzp
 */
public class FluidBlockBase extends BlockFluidClassic implements IRegistryEntry {

    public FluidBlockBase(Fluid fluid, Material material) {
        super(fluid, material);
        setUnlocalizedName(Traincraft.MODID + "." + fluid.getName());
    }

    @Override
    public IRegistryEntry[] getRegisterElements() {
        return new IRegistryEntry[]{this};
    }

    @Override
    public String getRegisterName() {
        return this.fluidName;
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries) {
    }

    @Override
    public void ownRegistry() {

    }

}
