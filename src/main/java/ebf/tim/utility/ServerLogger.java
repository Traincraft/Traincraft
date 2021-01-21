package ebf.tim.utility;

import cpw.mods.fml.common.registry.GameData;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author EternalBlueFlame
 */
public class ServerLogger {
    /*
    --------------------------------------------------
    Writing
    --------------------------------------------------
     */

    //run this on server side when inventory opens or player mounts, maybe other common but not constant events.
    public static void writeWagonToFolder(GenericRailTransport wagon){
        FileOutputStream fileoutputstream=null;
        try {
            //make a stringbuilder to build the filename, faster than string+string+string+string etc. MUCH faster.
            StringBuilder sb = new StringBuilder();
            sb.append(CommonProxy.configDirectory);
            //be sure both directories are made.
            sb.append("/TrainsInMotion/");
            if (!new File(sb.toString()).exists()){
                new File(sb.toString()).mkdir();
            }
            sb.append("/logging/");
            if (!new File(sb.toString()).exists()){
                new File(sb.toString()).mkdir();
            }
            sb.append(wagon.getOwnerName().equals("")?"Unknown_Player":wagon.getOwnerName());
            sb.append("/");
            if (!new File(sb.toString()).exists()){
                new File(sb.toString()).mkdir();
            }
            sb.append(wagon.getItem().delegate.name().replace(":", "~"));
            sb.append("_");
            sb.append(wagon.getUniqueID());
            sb.append(".txt");
            //gen the file with the path
            fileoutputstream = new FileOutputStream(new File(sb.toString()));
            //reset the string builder then add all the data in an XML seeming format.
            //you don't HAVE to do XML, you can use other formats and use libraries, i just like this way because its easy to read.
            sb = new StringBuilder();
            sb.append("<xmlRoot>\n   <uuid>");
            sb.append(wagon.getUniqueID());
            sb.append("</uuid>\n   <delegate>");
            sb.append(wagon.getItem().delegate.name());
            sb.append("</delegate>\n   <pos_x>");
            sb.append(wagon.posX);
            sb.append("</pos_x>\n   <pos_y>");
            sb.append(wagon.posY);
            sb.append("</pos_y>\n   <pos_z>");
            sb.append(wagon.posZ);
            sb.append("</pos_z>\n    <inventory>\n");
            //cover inventory from a loop of an external function to simplify code
            if(wagon.inventory!=null) {
                for (ItemStackSlot stack : wagon.inventory) {
                    addItemXML(sb, stack.getStack());
                }
            }
            sb.append("   </inventory>\n   <fuel>");
            //if it's a train we can get the fuel from the fuel handler
            if(wagon instanceof EntityTrainCore){
                sb.append((((EntityTrainCore) wagon).fuelHandler.burnHeat!=0?
                        (int)(((EntityTrainCore) wagon).fuelHandler.burnHeat/((EntityTrainCore) wagon).getEfficiency())*0.000625//casting as an int rounds down
                        :0));
                sb.append("</fuel>");
            } else {
                sb.append("N/A</fuel>\n   <fluids>");
                for(FluidTankInfo tank : wagon.getTankInfo(ForgeDirection.UNKNOWN)) {
                    addFluidXML(sb, tank.fluid);
                }
                sb.append("</fluids>\n");
            }
            sb.append("\n</xmlRoot>");//seemingly unnecessary new line added to the end, linux needs this sometimes.
            fileoutputstream.write(sb.toString().getBytes());
            fileoutputstream.close();
        } catch (Exception e){
            //be sure to attempt to close the stream in case of failure
            // requires another try/catch as permissions errors may not have let it open in the first place
            if(fileoutputstream!=null){
                try {
                    fileoutputstream.close();
                } catch (IOException ignored) {}
            }
            //apparently we don't have permission, so, nevermind.
            e.printStackTrace();
        }
    }

    //run this on attack entity event if the entity dies
    public static void deleteWagon(GenericRailTransport wagon){
        StringBuilder sb = new StringBuilder();
        sb.append(CommonProxy.configDirectory);
        sb.append("/TrainsInMotion/logging/");
        sb.append(wagon.getOwner()==null || wagon.getOwner().getName()==null || wagon.getOwner().getName().equals("")?"Unknown_Player": wagon.getOwner().getName());
        sb.append("/");
        sb.append(wagon.getInventoryName());
        sb.append("_");
        sb.append(wagon.getUniqueID());
        sb.append(".txt");
        try {
            File f = new File(sb.toString());
            if (f.exists() && !f.isDirectory()) {
                f.delete();
            }
        } catch (Exception e){e.printStackTrace();}//if it fails there was nothing to delete, so same result
    }



    private static void addItemXML(StringBuilder string, ItemStack item){
        if (item == null || item.getItem() == null || item.stackSize<=0){
            return;
        }
        string.append("        <ItemStack>\n            <ID>");
        string.append(Item.getIdFromItem(item.getItem()));
        string.append("</ID>\n            <delegate>");
        string.append(item.getItem().delegate.name());
        string.append("</delegate>\n            <meta>");
        string.append(item.getItemDamage());
        string.append("</meta>\n            <StackSize>");
        string.append(item.stackSize);
        string.append("</StackSize>\n        </ItemStack>\n");
    }

    private static void addFluidXML(StringBuilder string, FluidStack item){
        if (item == null || item.getFluid() == null || item.amount<=0){
            return;
        }

        string.append("    <FluidStack>\n        <ID>");
        string.append(item.getFluidID());
        string.append("</ID>\n            <delegate>");
        string.append(FluidContainerRegistry.fillFluidContainer(item, new ItemStack(Items.bucket)).getItem().delegate.name());
        string.append("</delegate>\n            <StackSize>");
        string.append((int)(item.amount*0.001));
        string.append("</StackSize>\n    </FluidStack>\n");
    }




    /*
    --------------------------------------------------
    Reading
    --------------------------------------------------
     */

    //parses the document for itemstacks
    public static List<ItemStack> getItems(String doc){
        try {
            ArrayList<ItemStack> itemStacks = new ArrayList<>();

            List<String> stacks = new ArrayList<>();
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
            e.printStackTrace();
            return new ArrayList<ItemStack>();
        }
    }

    //parses the individual item
    public static ItemStack parseItemFromXML(String doc){
        try {
            ItemStack stack = new ItemStack(
                    GameData.getItemRegistry().getObject(doc.substring(doc.indexOf("<delegate>")+10, doc.indexOf("</delegate>"))),//get item by delegate name since it's static
                    Integer.parseInt(doc.substring(doc.indexOf("<StackSize>")+11, doc.indexOf("</StackSize>")))//we always get strings so gotta parse.
            );

            stack.setItemDamage(Integer.parseInt(doc.substring(doc.indexOf("<meta>")+6, doc.indexOf("</meta>"))));

            return stack;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



}
