package ebf.tim.gui;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.*;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Train crafting table GUI</h1>
 * @author Eternal Blue Flame
 * @author ComputerButter
 */
public class GUITrainTable extends GuiContainer {
    private static List<ItemStack> slots = new ArrayList<>();
    private static List<ItemStack> overlays = new ArrayList<>();
    private static List<Integer> slotx = new ArrayList<>();
    private static List<Integer> sloty = new ArrayList<>();
    private static final ResourceLocation[] asmTableGUIs = { //hardcoded modID to avoid having to import traincraft.
            new ResourceLocation("traincraft", "textures/gui/gui_tierI_ironAge.png"),
            new ResourceLocation("traincraft", "textures/gui/gui_tierII_steelAge.png"),
            new ResourceLocation("traincraft", "textures/gui/gui_tierIII_advancedAge.png")
    };

    private String hostname;

    //TODO: button placement broken, functionality broken, possibly re-evaluate how to do this (need access to TileEntityStorage)
    private GuiButton upButton = new GuiButton(0, 146, 127, 21, 21, "UP");
    private GuiButton downButton = new GuiButton(0, 146, 147, 21, 21, "DN");

    public GUITrainTable(InventoryPlayer inventoryPlayer, World world, int x, int y, int z) {
        super(new TransportSlotManager(inventoryPlayer, (TileEntityStorage) world.getTileEntity(x,y,z)));
        hostname=world.getBlock(x,y,z).getUnlocalizedName();

        if (ClientProxy.isTraincraft) {
            this.ySize = 256;
        }
    }

    @Override
    public void initGui() {
        super.initGui();

//        this.buttonList.add(upButton);
//        this.buttonList.add(downButton);
//        upButton.enabled = false;
//        downButton.enabled = false;
//        upButton.visible = false;
//        downButton.visible = false;
    }

    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        if (!ClientProxy.isTraincraft) {
            this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
        } else {
            if (hostname.equals("tile.block.traintabletier1") || hostname.equals("tile.block.traintabletier2") || hostname.equals("tile.block.traintabletier3")) {
                //assembly table and traincraft
                //TODO: localize strings, edit colors if need be.
                this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 92, 4210752);
                this.fontRendererObj.drawString(I18n.format(hostname), 8, 5, 12241200);
                this.fontRendererObj.drawString(I18n.format("container.storage"), 8, 118, 4210752);
                this.fontRendererObj.drawString(I18n.format("container.output"), 90, 118, 12241200);
            }
        }
    }
    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int mouseX, int mouseY) {
        GL11.glPushMatrix();

        if(hostname.equals("tile.block.railtable")){

            ClientUtil.drawTextOutlined(fontRendererObj,"Rail", guiLeft+8, guiTop+2,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Ties", guiLeft+6, guiTop+24,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Ballast", guiLeft-8, guiTop+41,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Old Shape", guiLeft+108, guiTop+18,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Output", guiLeft+116, guiTop+53,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Unused", guiLeft+50, guiTop-4,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Unused", guiLeft+50, guiTop+46,0xffffff);


            slots = new ArrayList<>();
            overlays = new ArrayList<>();
            slotx = new ArrayList<>();
            sloty = new ArrayList<>();
            for (ItemStackSlot s : ((TileEntityStorage)((TransportSlotManager)this.inventorySlots).hostInventory).inventory) {
                slots.add(s.getStack());
                overlays.add(s.getOverlay());
                slotx.add(s.xDisplayPosition);
                sloty.add(s.yDisplayPosition);

            }

            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glColor4f(1,1,1,1);
            GL11.glEnable(GL11.GL_BLEND);
            ClientUtil.drawSlots(slots,overlays, slotx,sloty,mouseX,mouseY,guiLeft,guiTop,itemRender);



            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            mc.getTextureManager().bindTexture(ClientUtil.vanillaChest);
            //draw the player inventory and toolbar background.
            ClientUtil.drawTexturedRect(guiLeft, guiTop+64, 0, 0, 176,  16);//top
            ClientUtil.drawTexturedRect(guiLeft,   guiTop+78, 0, 134, 176, 88);//actual inventory
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();

        } else if (hostname.equals("tile.block.traintabletier1") || hostname.equals("tile.block.traintabletier2") || hostname.equals("tile.block.traintabletier3")){
            if (!ClientProxy.isTraincraft) { //TiM stuff
                this.mc.getTextureManager().bindTexture(ClientUtil.craftingTableGuiTextures);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);

                slots = new ArrayList<>();
                overlays = new ArrayList<>();
                slotx = new ArrayList<>();
                sloty = new ArrayList<>();
                for (ItemStackSlot s : ((TileEntityStorage) ((TransportSlotManager) this.inventorySlots).hostInventory).inventory) {
                    slots.add(s.getStack());
                    overlays.add(s.getOverlay());
                    slotx.add(s.xDisplayPosition);
                    sloty.add(s.yDisplayPosition);

                }

                GL11.glPushMatrix();
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glEnable(GL11.GL_BLEND);
                ClientUtil.drawSlots(slots, overlays, slotx, sloty, mouseX, mouseY, guiLeft, guiTop, itemRender);


                GL11.glDisable(GL11.GL_LIGHTING);
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glPopMatrix();
            } else {
                //traincraft assembly tables gui.
                //No need to generate the slot backgrounds because texture already has it.
                //TODO: fancy itemSlot borders and glowing

                switch (hostname) {
                    case "tile.block.traintabletier1":
                        this.mc.getTextureManager().bindTexture(asmTableGUIs[0]);
                        break;
                    case "tile.block.traintabletier2":
                        this.mc.getTextureManager().bindTexture(asmTableGUIs[1]);
                        break;
                    case "tile.block.traintabletier3":
                        this.mc.getTextureManager().bindTexture(asmTableGUIs[2]);
                        break;
                    default:
                        this.mc.getTextureManager().bindTexture(asmTableGUIs[0]);
                        DebugUtil.println("Block comparison failed, defaulting to original");
                        break;
                }
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
            }

        } else {
            this.mc.getTextureManager().bindTexture(ClientUtil.craftingTableGuiTextures);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
        }
        GL11.glPopMatrix();
    }

    @Override
    public void actionPerformed(GuiButton button) {
        if (button == this.upButton) {
            //TODO: get the TileEntityStorage and run incrementPage() function.
        } else if (button ==  this.downButton) {
            //TODO: get the TileEntityStorage and run decrementPage() function.
        }
    }

}
