package traincraft.api;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import traincraft.blocks.TCBlocks;
import traincraft.items.TCItems;

/**
 * @author PseudonymPatel
 */
public class RecipeHandler {

    public static void initBlockRecipes() {
        //most if not all will be in json format, remove function later if necessary
        /* List of block recipes, for lack of a better place to list them
        Note - in original handler, all the armor dye recipes imported, due to json might not be needed (line 39 in train.common.core.handlers.RecipeHandler)
        * train workbench (if !disable_train_workbench)
        * openFurnaceIdle (if !make modpacks great again)
        * all 3 sets of clothes (9 total) (SKIPPED)
        */
        //TODO: remove trainWorkbench/openFurnaceIdle from crafting if set in config
        return;
    }

    public static void initItemRecipes() {
        //same idea as block recipes.
        //not started
        return;
    }

    public static void initSmeltingRecipes() {
        //smelting recipes are not in json format in 1.12.2
        GameRegistry.addSmelting(TCBlocks.COPPER_ORE, new ItemStack(TCItems.COPPER_INGOT, 1), 0.7f);

        //TODO: hearth furnace smelting recipe
        //iron to steel w/ graphite
    }
}
