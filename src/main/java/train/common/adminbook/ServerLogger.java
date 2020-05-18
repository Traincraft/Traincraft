package train.common.adminbook;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.LiquidTank;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author EternalBlueFlame
 */
@Deprecated
// todo remove as soon as possible and replace with proper way for handling the book
public class ServerLogger {
    /*
    --------------------------------------------------
    Writing
    --------------------------------------------------
     */

    //run this on server side when inventory opens or player mounts, maybe other common but not constant events.
    public static void writeWagonToFolder(EntityRollingStock wagon){
        try {
            //make a stringbuilder to build the filename, faster than string+string+string+string etc. MUCH faster.
            StringBuilder sb = new StringBuilder();
            sb.append(Traincraft.configDirectory.getAbsolutePath());
            sb.append("/traincraft/");
            if (!new File(sb.toString()).exists()){
                new File(sb.toString()).mkdir();
            }
            if(wagon.getOwner() != null && wagon.getOwner().getName()!=null && !wagon.getOwner().getName().equals("")){
                sb.append(wagon.getOwner().getName().toLowerCase());
            } else if (wagon.getTrainOwner() !=null && !wagon.getTrainOwner().equals("")){
                sb.append(wagon.getTrainOwner().toLowerCase());
            } else {
                sb.append("unknown_player");
            }
            sb.append("/");
            if (!new File(sb.toString()).exists()){
                new File(sb.toString()).mkdir();
            }
            sb.append(wagon.getCartItem().getItem().delegate.name().toString().replace(":", "~").toLowerCase());
            sb.append("_");
            sb.append(wagon.getUniqueID().toString().toLowerCase());
            sb.append(".txt");
            //gen the file with the path
            FileOutputStream fileoutputstream = new FileOutputStream(new File(sb.toString()));
            //reset the string builder then add all the data in an XML seeming format.
            //you don't HAVE to do XML, you can use other formats and use libraries, i just like this way because its easy to read.
            sb = new StringBuilder();
            sb.append("<xmlRoot>\n   <uuid>");
            sb.append(wagon.getUniqueID());
            sb.append("</uuid>\n   <delegate>");
            sb.append(wagon.getCartItem().getItem().delegate.name());
            sb.append("</delegate>\n   <pos_x>");
            sb.append(wagon.posX);
            sb.append("</pos_x>\n   <pos_y>");
            sb.append(wagon.posY);
            sb.append("</pos_y>\n   <pos_z>");
            sb.append(wagon.posZ);
            sb.append("</pos_z>\n    <inventory>\n");
            //cover inventory from a loop of an external function to simplify code
            if (wagon instanceof IInventory) {
                if (wagon.getInventory() != null) {
                    for (ItemStack stack : wagon.getInventory()) {
                        addItemXML(sb, stack);
                    }
                }
                if (wagon instanceof LiquidTank) {
                    /*for (FluidTankInfo tank : ((LiquidTank)wagon).getTankInfo(EnumFacing.NORTH)) {
                        addFluidXML(sb, tank.fluid);
                    }*/ // removed because nothing works yet. todo reimplement
                }
                sb.append("   </inventory>");
            }
            sb.append("\n</xmlRoot>");//seemingly unnecessary new line added to the end, linux needs this sometimes.
            fileoutputstream.write(sb.toString().getBytes());
            fileoutputstream.close();
        } catch (Exception e){
            //apparently we don't have permission, so, nevermind.

        }
    }

    //run this on attack entity event if the entity dies
    public static void deleteWagon(EntityRollingStock wagon){
        StringBuilder sb = new StringBuilder();
        sb.append(Traincraft.configDirectory.getAbsolutePath());
        sb.append("/traincraft/");
        if(wagon.getOwner() != null && wagon.getOwner().getName()!=null && !wagon.getOwner().getName().equals("")){
            sb.append(wagon.getOwner().getName().toLowerCase());
        } else if (wagon.getTrainOwner() !=null && !wagon.getTrainOwner().equals("")){
            sb.append(wagon.getTrainOwner().toLowerCase());
        } else {
         sb.append("unknown_player");
        }
        sb.append("/");
        sb.append(wagon.getCartItem().getItem().delegate.name().toString().replace(":", "~").toLowerCase());
        sb.append("_");
        sb.append(wagon.getUniqueID().toString().toLowerCase());
        sb.append(".txt");
        try {
            File f = new File(sb.toString());
            if (f.exists() && !f.isDirectory()) {
                f.delete();
            }
        } catch (Exception e){}//if it fails there was nothing to delete, so same result
    }



    private static void addItemXML(StringBuilder string, ItemStack stack){
        if (stack.isEmpty() ||stack.getCount() <= 0){
            return;
        }
        string.append("        <ItemStack>\n            <ID>");
        string.append(Item.getIdFromItem(stack.getItem()));
        string.append("</ID>\n            <delegate>");
        string.append(stack.getItem().delegate.name());
        string.append("</delegate>\n            <meta>");
        string.append(stack.getItemDamage());
        string.append("</meta>\n            <StackSize>");
        string.append(stack.getCount());
        string.append("</StackSize>\n        </ItemStack>\n");
    }

    // todo addFluidXML
    private static void addFluidXML(StringBuilder string, FluidStack item){
        if (item == null || item.getFluid() == null || item.amount<=0){
            return;
        }

        int fill=1000;
        while(fill < item.amount) {
         //addItemXML(string, FluidContainerRegistry.fillFluidContainer(item, new ItemStack(Items.bucket)));
         fill +=1000;
        }
    }
    
    /*
    --------------------------------------------------
    Reading
    --------------------------------------------------
     */

    //parses the document for itemstacks
    public static List<ItemStack> getItems(String doc){
        try {
            ArrayList<ItemStack> itemStacks = new ArrayList<ItemStack>();
            Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(doc.substring(doc.indexOf("<delegate>")+10, doc.indexOf("</delegate>"))));
            if(item == null){
                return new ArrayList<>();
            }
            itemStacks.add(new ItemStack(item));

            List<String> stacks = new ArrayList<String>();
            while (doc.contains("<ItemStack>")){
                stacks.add(doc.substring(doc.indexOf("<ItemStack>")+11, doc.indexOf("</ItemStack>")));
                doc = doc.substring(doc.indexOf("</ItemStack>")+12);
            }


            for (String s : stacks){
                ItemStack stack = parseItemFromXML(s);
                if (stack != null){
                    itemStacks.add(stack);
                }
            }
            return itemStacks;

        } catch (Exception e){
            return new ArrayList<ItemStack>();
        }
    }

    //parses the individual item
    public static ItemStack parseItemFromXML(String doc) {
        try{
            Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(doc.substring(doc.indexOf("<delegate>") + 10, doc.indexOf("</delegate>"))));
            if(item == null){
                return ItemStack.EMPTY;
            }
            ItemStack stack = new ItemStack(item, Integer.parseInt(doc.substring(doc.indexOf("<StackSize>") + 11, doc.indexOf("</StackSize>"))));
            stack.setItemDamage(Integer.parseInt(doc.substring(doc.indexOf("<meta>") + 6, doc.indexOf("</meta>"))));
            return stack;
        }catch(NumberFormatException e){
            return ItemStack.EMPTY;
        }
    }
    
}
