package ebf.tim.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.DebugUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <h1>Core Transport Item</h1>
 * this re-useable item is intended to work as an automation to create items for evert train and rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemTransport extends Item {

    /**the list of strings to use for the item description*/
    private final List<String> subtext = new ArrayList<>();
    /**the class for the entity*/
    private final Class<? extends GenericRailTransport> transport;
    @SideOnly(Side.CLIENT)
    GenericRailTransport entity;
    /**the main constructor.
     * @param cart the class for the entity*/
    public ItemTransport(GenericRailTransport cart, String MODID, CreativeTabs tabs) {
        super();
        setUnlocalizedName(cart.transportName().replace(" ",""));
        subtext.add(EnumChatFormatting.GRAY + t("menu.item.year") +": " + cart.transportYear());
        subtext.add(EnumChatFormatting.GRAY + t("menu.item.country") + ": " +
                t("menu.item."+cart.transportcountry().toLowerCase()));

        if(cart.transportFuelType()!=null && !cart.transportFuelType().equals("")) {
            subtext.add(EnumChatFormatting.RED + t("menu.item.fueltype") + ": " +
                    t("menu.item."+cart.transportFuelType().toLowerCase()));
        }
        if(cart.getTypes()!=null && cart.getTypes().size()>0){
            StringBuilder s = new StringBuilder();
            subtext.add(EnumChatFormatting.RED + t("menu.item.types")+":");
            boolean b=false;
            for(TrainsInMotion.transportTypes type : cart.getTypes()){
                if(type.isTrain()) {
                    s.append(t("menu.item.locomotive")+", ");
                    b=true;
                    break;
                }
            }
            if(!b){
                s.append(t("menu.item.rollingstock")+", ");
            }

            for(TrainsInMotion.transportTypes type : cart.getTypes()){
                if(type.isTrain()) {
                    continue;
                }
                s.append(t("menu.item."+type.name())).append(", ");
            }
            s.delete(s.lastIndexOf(", "),s.length());

            subtext.add(EnumChatFormatting.RED +s.toString());
        }
        subtext.add(EnumChatFormatting.GREEN + t("menu.item.weight") +": " + cart.weightKg() + "kg");
        if (cart.transportTopSpeed()!=0){
            subtext.add(EnumChatFormatting.GREEN + t("menu.item.speed") +": " + cart.transportTopSpeed() +" km/h");

            if (cart.transportMetricHorsePower() !=0){
                subtext.add(EnumChatFormatting.GREEN +t("menu.item.mhp") +": " + cart.transportMetricHorsePower());
            }
            if (cart.transportTractiveEffort() != 0){
                subtext.add(EnumChatFormatting.GREEN + t("menu.item.tractiveeffort") +": " + cart.transportTractiveEffort() + " lbf");
            }
        }
        if(cart.getInventoryRows()>0){
            subtext.add(EnumChatFormatting.BLUE +t("menu.item.isizeof")+ ": " + (cart.getInventoryRows()*9) + " " + t("menu.item.slots"));
        }
        if(cart.getRiderOffsets()!=null){
            subtext.add(EnumChatFormatting.BLUE +t("menu.item.seats")+ ": " + cart.getRiderOffsets().length);
        }
        if (cart.isFictional()){
            subtext.add(EnumChatFormatting.WHITE +t("menu.item.fictional"));
        }

        if (cart.additionalItemText()!=null){
            for (String s : cart.additionalItemText()) {
                if(!s.equals("")) {
                    subtext.add(EnumChatFormatting.LIGHT_PURPLE + s);
                }
            }
        }
        transport=cart.getClass();
        setTextureName(MODID+":transports/"+getUnlocalizedName());
        setCreativeTab(tabs);
        if(TrainsInMotion.proxy.isClient()){
            entity=cart;
        }
    }

    /**
     * <h2>description text</h2>
     * this modifies the functionality of showing description text. in this case we're just adding more.
     * @param par1ItemStack the itemstack of which text is being displayed.
     * @param par2EntityPlayer the player holding said itemstack.
     * @param par3List the list of strings to define the description. rather than using \n like normal people, forge decided it a good idea to make each string in the array a new line.
     * @param par4 I have no idea what this is.
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.addAll(subtext);
    }

    /**
     * <h2>place transport</h2>
     * this will place the transport in world, and decrease, or null, the itemstack if placement actually worked.
     * on the off chance the transport failed to cast to the proper class it will be printed to the log, the issue should ALWAYS be the fault of the transport's class.
     */
    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer playerEntity, World worldObj, int posX, int posY, int posZ, int blockSide, float pointToRayX, float pointToRayY, float pointToRayZ) {
        try {
            if(CommonUtil.placeOnRail(transport.getConstructor(UUID.class, World.class, double.class, double.class, double.class)
                    .newInstance(playerEntity.getUniqueID(), worldObj, posX + 0.5D, posY, posZ + 0.5D), playerEntity, itemStack, worldObj, posX, posY, posZ)){
                if (!playerEntity.capabilities.isCreativeMode) {
                    itemStack.stackSize--;
                    if (itemStack.stackSize <= 0) {
                        itemStack = null;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e){
        	if(DebugUtil.dev()){
            	e.printStackTrace();
        	}
        	DebugUtil.log("Failed to cast : " + transport.toString() + "to a new generic transport entity");
        }
        return true;
    }

    private static String t(String translate){
        return CommonUtil.translate(translate);
    }

}
