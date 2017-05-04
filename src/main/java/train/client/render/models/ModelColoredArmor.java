package train.client.render.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ModelColoredArmor extends ModelBiped{
	private ItemStack itemStack;
	private int armorSlot;
	public static String[] armorFilenamePrefix = new String[] {"cloth", "chain", "iron", "diamond", "gold"};
	public ModelColoredArmor(EntityLiving entityLiving, ItemStack itemStack, int armorSlot,float par1)
    {
        super(par1, 0.0F, 64, 32);
        this.itemStack=itemStack;
        this.armorSlot=armorSlot;
    }
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
		super.render(par1Entity,par2,par3,par4,par5,par6,par7);
		
		ItemStack itemstack = ((EntityPlayer)par1Entity).inventory.armorItemInSlot(3 - armorSlot);

        if (itemstack != null)
        {
        	Item item = itemstack.getItem();
        	if (item instanceof ItemArmor)
            {
                ItemArmor itemarmor = (ItemArmor)item;
                //this.loadTexture(ForgeHooksClient.getArmorTexture(par1Entity, itemstack, "/armor/" + armorFilenamePrefix[itemarmor.renderIndex] + "_" + (armorSlot == 2 ? 2 : 1) + ".png", armorSlot, 1));
                bipedHead.showModel = armorSlot == 0;
                bipedHeadwear.showModel = armorSlot == 0;
                bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
                bipedRightArm.showModel = armorSlot == 1;
                bipedLeftArm.showModel = armorSlot == 1;
                bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
                bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
               
                
                float f1 = 1.0F;

                //Move outside if to allow for more then just CLOTH
                int j = itemarmor.getColor(itemstack);
                if (j != -1)
                {
                    float f2 = (float)(j >> 16 & 255) / 255.0F;
                    float f3 = (float)(j >> 8 & 255) / 255.0F;
                    float f4 = (float)(j & 255) / 255.0F;
                    GL11.glColor3f(f1 * f2, f1 * f3, f1 * f4);
                }
            }
        }
        
    }
}
