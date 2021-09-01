package train.common.blocks.blockSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileSpeedSign;

public class BlockSpeedSign extends Block {
	private IIcon texture;
	private int skinstate = 0;

	public BlockSpeedSign() {
		super(Material.wood);
		setCreativeTab(Traincraft.tcTab);
		//this.setTickRandomly(true);
		//this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
	}

	public void setSkinstate(int skinstate) {
		this.skinstate = skinstate;
	}

	public int getSkinstate() {
		return skinstate;
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}


	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		TileSpeedSign te = (TileSpeedSign) p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_);
		te.increaseSkinState();

		return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileSpeedSign();
	}



	@Override
	public int getRenderType() {
		return -1;
	}







	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
	{
		if ((p_149749_6_ & 8) > 0)
		{
			p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_, this);
			int i1 = p_149749_6_ & 7;

			if (i1 == 1)
			{
				p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
			}
			else if (i1 == 2)
			{
				p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
			}
			else if (i1 == 3)
			{
				p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
			}
			else if (i1 == 4)
			{
				p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
			}
			else if (i1 != 5 && i1 != 6)
			{
				if (i1 == 0 || i1 == 7)
				{
					p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
				}
			}
			else
			{
				p_149749_1_.notifyBlocksOfNeighborChange(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
			}
		}

		super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
	}






	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}
}
