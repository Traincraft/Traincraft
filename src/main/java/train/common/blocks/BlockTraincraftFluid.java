package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import train.common.library.Info;

public class BlockTraincraftFluid extends BlockFluidClassic {
	
	@SideOnly(Side.CLIENT)
	protected IIcon[] theIcon;
	protected boolean flammable;
	protected int flammability = 0;	

	public BlockTraincraftFluid(Fluid fluid, Material material) {
		super(fluid, material);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.theIcon != null ? side != 0 && side != 1 ? this.theIcon[1] : this.theIcon[0] : null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.theIcon = new IIcon[]{iconRegister.registerIcon(Info.modID.toLowerCase() + ":liquid_" + fluidName), iconRegister.registerIcon(Info.modID.toLowerCase() +":liquid_" + fluidName + "_flow")};
	}

	public BlockTraincraftFluid setFlammable(boolean flammable) {
		this.flammable = flammable;
		return this;
	}

	public BlockTraincraftFluid setFlammability(int flammability) {
		this.flammability = flammability;
		return this;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return flammable ? 300 : 0;
	}

	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return flammability;
	}

	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return flammable;
	}

	@Override
	public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {
		return flammable && flammability == 0;
	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		return  (world.getBlock(x,  y,  z).getMaterial().isLiquid() && super.canDisplace(world, x, y, z));
	}
	
	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) {
		return (!world.getBlock(x,  y,  z).getMaterial().isLiquid() && super.displaceIfPossible(world, x, y, z));
	}
	
	@Override
	public String getUnlocalizedName() {
		return "fluid." + Info.modID + ":" + fluidName;
	}
}
