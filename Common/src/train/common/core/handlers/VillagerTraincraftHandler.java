package src.train.common.core.handlers;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import src.train.common.generation.ComponentVillageTrainstation;
import src.train.common.items.ItemRollingStock;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillagerTraincraftHandler implements IVillageCreationHandler,IVillageTradeHandler{
	//private Random rand = new Random();
	@Override
	public void manipulateTradesForVillager(EntityVillager villager,
			MerchantRecipeList recipeList, Random random) {
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.rail.blockID, random,20), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,20), new ItemStack(Block.rail)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.railActivator.blockID, random,4), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,4), new ItemStack(Block.railActivator)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.railDetector.blockID, random,4), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,4), new ItemStack(Block.railDetector)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.railPowered.blockID, random,10), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,10), new ItemStack(Block.railPowered)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.brick.blockID, random,10), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,10), new ItemStack(Block.brick)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.minecartEmpty.itemID, random,2), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,2), new ItemStack(Item.minecartEmpty)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.minecartCrate.itemID, random,4), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,4), new ItemStack(Item.minecartCrate)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.minecartHopper.itemID, random,1), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,1), new ItemStack(Item.minecartHopper)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.minecartPowered.itemID, random,2), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,2), new ItemStack(Item.minecartPowered)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.minecartTnt.itemID, random,1), Item.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Item.emerald.itemID, random,1), new ItemStack(Item.minecartTnt)));
		
		for(ItemIDs item : ItemIDs.values()){
			if(item!=null && item.item!=null){
				if(item.item instanceof ItemRollingStock){
					recipeList.add(new MerchantRecipe(new ItemStack(item.item), new ItemStack(Item.emerald,item.amountForEmerald)));
					recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald,item.amountForEmerald), item.item));
				}else if(item.amountForEmerald>0){
					if(!(item.item instanceof ItemRollingStock) && item.amountForEmerald>0){
						recipeList.add(new MerchantRecipe(new ItemStack(item.item,item.amountForEmerald), Item.emerald));
						recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald), new ItemStack(item.item,item.amountForEmerald)));
					}
				}
			}
		}
	}
	private ItemStack getRandomSizedStack(int par0, Random random, int amount)
    {
        return new ItemStack(par0, random.nextInt(amount)+1, 0);
    }
	
	@Override
	public StructureVillagePieceWeight getVillagePieceWeight(Random random,
			int size) {
		 return new StructureVillagePieceWeight(ComponentVillageTrainstation.class, 15, MathHelper.getRandomIntegerInRange(random, 0 + size, 1 + size));
	}
	@Override
	public Class<?> getComponentClass() {
		return ComponentVillageTrainstation.class;
	}
	@Override
	public Object buildComponent(StructureVillagePieceWeight villagePiece,
			ComponentVillageStartPiece startPiece, List pieces, Random random,
			int p1, int p2, int p3, int p4, int p5) {
		return ComponentVillageTrainstation.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	}
}
