package traincraft.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BaseFluidBlock extends BlockFluidClassic {
    
    public BaseFluidBlock(ResourceLocation registryName, Fluid fluid, Material material, MapColor mapColor) {
        super(fluid, material, mapColor);
        this.setRegistryName(registryName);
        this.displacements.put(this, false);
    }
    
    public BaseFluidBlock(ResourceLocation registryName, Fluid fluid, Material material) {
        this(registryName, fluid, material, material.getMaterialMapColor());
    }
    
    @Override
    public boolean canDisplace(IBlockAccess world, BlockPos pos) {
        return !world.getBlockState(pos).getMaterial().isLiquid() && super.canDisplace(world, pos);
    }
    
    @Override
    public boolean displaceIfPossible(World world, BlockPos pos) {
        return !world.getBlockState(pos).getMaterial().isLiquid() && super.displaceIfPossible(world, pos);
    }
}
