package traincraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ItemConnector extends BaseItem {

	private static final String SAVED_ROLLING_STOCK_KEY = "rolling_stock_id";
	
	public ItemConnector() {
		super("connector");
		
		this.maxStackSize = 1;
		this.setMaxDamage(200);
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public boolean shouldRotateAroundWhenRendering() {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00a77" + "Right click on a rolling stock");
		tooltip.add("\u00a77" + " to enter attaching mode.");
		tooltip.add("\u00a77" + "Click a few time to reset links.");
		tooltip.add("\u00a77" + "Sneak+Right click on a locomotive");
		tooltip.add("\u00a77" + " to set mode: 'Can pull/Can be pulled'");
	}
	
	@Nonnull
	@Override
	public ActionResult<ItemStack> onItemRightClick(@Nonnull World world, @Nonnull EntityPlayer player, @Nonnull EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if(!stack.isEmpty() && stack.getItem() instanceof ItemConnector){
			if(player.isSneaking() && hasRollingStockOnStack(stack)){
				removeRollingStockFromStack(stack);
				player.sendMessage(new TextComponentString("Connector cleared."));
				return new ActionResult<>(EnumActionResult.SUCCESS, stack);
			}
		}
		return super.onItemRightClick(world, player, hand);
	}
	
	public static boolean hasRollingStockOnStack(@Nonnull ItemStack stack){
		return stack.getOrCreateSubCompound(Traincraft.MOD_ID).hasKey(SAVED_ROLLING_STOCK_KEY, Constants.NBT.TAG_INT);
	}
	
	public static void putRollingStockOnStack(@Nonnull ItemStack stack, @Nonnull AbstractRollingStock<?> rollingStock){
		NBTTagCompound nbt = stack.getOrCreateSubCompound(Traincraft.MOD_ID);
		nbt.setInteger(SAVED_ROLLING_STOCK_KEY, rollingStock.getEntityId());
	}
	
	public static void removeRollingStockFromStack(@Nonnull ItemStack stack){
		stack.getOrCreateSubCompound(Traincraft.MOD_ID).removeTag(SAVED_ROLLING_STOCK_KEY);
	}
	
	@Nullable
	public static AbstractRollingStock<?> getRollingStockFromStack(@Nonnull ItemStack stack, @Nonnull World world){
		if(hasRollingStockOnStack(stack)){
			int entityId = stack.getOrCreateSubCompound(Traincraft.MOD_ID).getInteger(SAVED_ROLLING_STOCK_KEY);
			Entity entity = world.getEntityByID(entityId);
			if(entity instanceof AbstractRollingStock<?>){
				return (AbstractRollingStock<?>) entity;
			}
		}
		return null;
	}
	
	public static void handleEntityClick(@Nonnull AbstractRollingStock<?> rollingStock, @Nonnull EntityPlayer player, @Nonnull EnumHand hand, @Nonnull ItemStack connectorStack){
		if(hasRollingStockOnStack(connectorStack)){
			AbstractRollingStock<?> otherRollingStock = getRollingStockFromStack(connectorStack, player.getEntityWorld());
			if(otherRollingStock != null){
				if(otherRollingStock.canLinkToAnotherRollingStock(otherRollingStock, rollingStock, player)){
					if(rollingStock.canLinkToAnotherRollingStock(rollingStock, otherRollingStock, player)){
						otherRollingStock.linkToAnotherRollingStock(otherRollingStock, rollingStock, player);
						rollingStock.linkToAnotherRollingStock(rollingStock, otherRollingStock, player);
						removeRollingStockFromStack(connectorStack);
						player.sendMessage(new TextComponentString("Connection established."));
					} else {
						player.sendMessage(new TextComponentString("This rolling stock can't be connected to the saved one."));
					}
				} else {
					player.sendMessage(new TextComponentString("The saved rolling stock can't be connected to this one."));
				}
			} else {
				removeRollingStockFromStack(connectorStack);
				player.sendMessage(new TextComponentString("The first rolling stock was invalid and removed."));
			}
		} else {
			putRollingStockOnStack(connectorStack, rollingStock);
			player.sendMessage(new TextComponentString("This rolling stock was saved."));
		}
	}
}