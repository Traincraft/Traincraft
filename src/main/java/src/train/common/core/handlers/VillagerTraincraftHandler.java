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
import net.minecraft.world.gen.structure.StructureVillagePieces;
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
		//388 is the item id for emerald.
		//336 is a clay brick
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.getBlockFromName("rail"), random,20), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,20), new ItemStack(Block.getBlockFromName("rail"))));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.getBlockFromName("railActivator"), random,4), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,4), new ItemStack(Block.getBlockFromName("railActivator"))));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.getBlockFromName("railDetector"), random,4), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,4), new ItemStack(Block.getBlockFromName("railDetector"))));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.getBlockFromName("railPowered"), random,10), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,10), new ItemStack(Block.getBlockFromName("railPowered"))));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Block.getBlockById(336), random,10), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,10), new ItemStack(Block.getBlockFromName("brick"))));
		//minecartEmpty is now minecrat with an id of 328
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(328), random,2), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,2), new ItemStack(Item.getItemById(328))));
		//minecartCrate is now minecart_chest with an id of 342
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(342), random,4), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,4), new ItemStack(Item.getItemById(342))));
		//minecartHopper is now hopper_minecart with an id of 408
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(408), random,1), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,1), new ItemStack(Item.getItemById(408))));
		//minecartPowered is now furnace_minecart with an id of 343
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(343), random,2), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,2), new ItemStack(Item.getItemById(343))));
		//minecartTnt is now tnt_minecart with an id of 407
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(407), random,1), Item.getItemById(388)));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Item.getItemById(388), random,1), new ItemStack(Item.getItemById(407))));
		
		for(ItemIDs item : ItemIDs.values()){
			if(item!=null && item.item!=null){
				if(item.item instanceof ItemRollingStock){
					recipeList.add(new MerchantRecipe(new ItemStack(item.item), new ItemStack(Item.getItemById(388),item.amountForEmerald)));
					recipeList.add(new MerchantRecipe(new ItemStack(Item.getItemById(388),item.amountForEmerald), item.item));
				}else if(item.amountForEmerald>0){
					if(!(item.item instanceof ItemRollingStock) && item.amountForEmerald>0){
						recipeList.add(new MerchantRecipe(new ItemStack(item.item,item.amountForEmerald), Item.getItemById(388)));
						recipeList.add(new MerchantRecipe(new ItemStack(Item.getItemById(388)), new ItemStack(item.item,item.amountForEmerald)));
					}
				}
			}
		}
	}
	private ItemStack getRandomSizedStack(Block par0, Random random, int amount)
    {
        return new ItemStack(par0, random.nextInt(amount)+1, 0);
    }
	private ItemStack getRandomSizedItemStack(Item par0, Random random, int amount)
	{
		return new ItemStack(par0, random.nextInt(amount)+1, 0);
	}
	
	@Override
	public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random random,
																	int size) {
		 return new StructureVillagePieces.PieceWeight(ComponentVillageTrainstation.class, 15, MathHelper.getRandomIntegerInRange(random, 0 + size, 1 + size));
	}
	@Override
	public Class<?> getComponentClass() {
		return ComponentVillageTrainstation.class;
	}
	@Override
	public Object buildComponent(StructureVillagePieces.PieceWeight villagePiece,
								 StructureVillagePieces.Start startPiece, List pieces, Random random,
			int p1, int p2, int p3, int p4, int p5) {
		return ComponentVillageTrainstation.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	}
}
