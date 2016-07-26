package train.common.items;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.ItemIDs;

import java.util.List;
@Optional.Interface(iface = "buildcraft.api.tools.IToolWrench", modid = "BuildCraft|Core")
public class ItemWrench extends ItemPart implements buildcraft.api.tools.IToolWrench{

	public ItemWrench() {
		super(ItemIDs.composite_wrench.iconName);
		maxStackSize = 1;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		Block blockId = world.getBlock(x, y, z);
		if (blockId.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(side))) {
			player.swingItem();
			return !world.isRemote;
		}
		return false;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "Works same as a BuildCraft wrench.");
		par3List.add("\u00a77" + "Use it to change lantern color.");
		par3List.add("\u00a77" + "Use it to lock/unlock certain carts (passenger)");
		par3List.add("\u00a77" + "Use it to remove locked trains (OP only)");
	}

	@Optional.Method(modid = "BuildCraft|Core")
	@Override
	public boolean canWrench(EntityPlayer player, int x, int y, int z) {
		return true;
	}

	@Optional.Method(modid = "BuildCraft|Core")
	@Override
	public void wrenchUsed(EntityPlayer player, int x, int y, int z) {}

	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
	}
}