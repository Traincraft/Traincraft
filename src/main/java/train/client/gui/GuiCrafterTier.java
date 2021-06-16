package train.client.gui;

import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.gui.sideTabs.SideTabInfo;
import train.client.gui.sideTabs.SideTabRecipes;
import train.client.gui.sideTabs.SideTabSlots;
import train.common.api.AbstractTrains;
import train.common.containers.ContainerTier;
import train.common.core.interfaces.ITier;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.library.EnumTrains;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;


public class GuiCrafterTier extends GuiTraincraft {

	public static ITier tier1;
	private static int[] states = new int[10];
	public static int[] slotStates = new int[8];
	public static int recipeSize = 0;
	public static List<Item> recipes;
	public static List<TierRecipe> recipeList;

	public static boolean isShow = false;
	public static boolean isClear = false;
	public static boolean isTabRecipeOpen = false;

	private float yaw;
	private float roll;
	private boolean rollDown;
	public Item currentKnownItem=null;
	private int ticksInGui=0;
	private Item previousItem;
	private AbstractTrains renderEntity;
	private int color = 0;
	private int currentRenderTabY = 40;
	public GuiCrafterTier(InventoryPlayer inv, IInventory tier) {
		super(new ContainerTier(inv, tier), tier);

		tier1 = (ITier) tier;
		recipeList = TierRecipeManager.getInstance().getTierRecipeList(tier1.Tier());
		recipes = tier1.knownRecipes();
		ySize = 256;
		previousItem = ItemIDs.minecartLoco3.item;//just to init the thing
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(tier1.getGUIName(), 9 + 1, 6, 0x000000);
		fontRendererObj.drawString("Output:", 90 + 1, 118, 0x000000);
		fontRendererObj.drawString("Storage:", 9 + 1, 118, 0xffffff);
		fontRendererObj.drawString("Inventory:", 9 + 1, 164, 0xffffff);

		fontRendererObj.drawString(tier1.getGUIName(), 9, 6, 0xd3a900);
		fontRendererObj.drawString("Output:", 90, 118, 0xd3a900);
		fontRendererObj.drawString("Storage:", 9, 118, 0x202020);
		fontRendererObj.drawString("Inventory:", 9, 164, 0x202020);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);

		super.drawGuiContainerForegroundLayer(i, j);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		//List cs = inventorySlots.inventorySlots;

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,tier1.getGUITexture()));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);

		borderSlots(recipeList, states);

		if(!isTabRecipeOpen){
			currentRenderTabY=40;
		}
		/**Render the entity in GUI*/
		if(currentKnownItem!=null && isTabRecipeOpen){
			if(currentRenderTabY<120)currentRenderTabY++;
			ticksInGui++;
			for(int a=0;a<6;a++){
				for(int b=0;b<5;b++){
					drawTexturedModalRect(j - 120 + a*16, (k + currentRenderTabY + b*16), 240, 48, 16, 16);//black squares

					drawTexturedModalRect(j -120 -1, (k + currentRenderTabY+b*16), 252, 68, 2, 16);//border left
					drawTexturedModalRect(j -120 -1 + 6*16, (k + currentRenderTabY+b*16), 254, 68, 2, 16);//border right
					drawTexturedModalRect(j -120 + a*16, (k + (currentRenderTabY-1) +5*16), 240, 64, 16, 2);//border bottom
				}
			}
			if(currentRenderTabY==120){
				GL11.glPushMatrix();
				GL11.glColor3f(1, 1, 1);
				GL11.glTranslatef(guiLeft-70, this.guiTop+170, 100);

				RenderHelper.enableGUIStandardItemLighting();
				EnumTrains train = EnumTrains.getCurrentTrain(currentKnownItem);
				renderEntity = train.getEntity(mc.theWorld);
				if(renderEntity!=null && !Item.itemRegistry.getNameForObject(currentKnownItem).equals(Item.itemRegistry.getNameForObject(previousItem))){
					previousItem = currentKnownItem;
				}
				if(train.getColors()!=null){
					if(color < 0)color = 0;
					if(ticksInGui % 400 == 0)color++;
					if(color>train.getColors().length-1)color=0;
					if(renderEntity!=null)renderEntity.setColor((train.getColors()[color]));
				}
				GL11.glScalef(-train.getGuiRenderScale(), train.getGuiRenderScale(), train.getGuiRenderScale());
				GL11.glRotatef(180, 0, 0, 1);
				GL11.glRotatef(roll, 1, 0, 0);
				GL11.glRotatef(yaw, 0, 1, 0);
				if(renderEntity!=null)RenderManager.instance.renderEntityWithPosYaw(renderEntity, 0, 0, 0, 0, 0);
				RenderHelper.disableStandardItemLighting();
				GL11.glPopMatrix();
				yaw += 0.5F;
				if(rollDown){
					roll -= 0.05F;
					if(roll < -5){
						rollDown = false;
						roll = -5;
					}
				}else{
					roll += 0.05F;
					if(roll > 15){
						rollDown = true;
						roll = 15;
					}
				}
			}
		}

		if (isShow) {
			if (tier1.knownRecipes().size() != 0) {
				drawOverlays(recipeSize, recipes);
			}
		}

		for (int i = 0; i < slotStates.length / 2; i++) {
			if (slotStates[i] == 1) {
				colorSlot(92 + i * 18, 128);
			}
			if (slotStates[i + 4] == 1) {
				colorSlot(92 + i * 18, 146);
			}
		}

		if (recipeSize > tier1.knownRecipes().size() - 1) {
			recipeSize = 0;
		}
		else if (recipeSize < 0) {
			recipeSize = tier1.knownRecipes().size() - 1;
		}

		recipes = tier1.knownRecipes();
	}

	@Override
	protected void mouseClicked(int x, int y, int button) {
		super.mouseClicked(x, y, button);
	}
	@Override
	protected void initSideTabs(IInventory inventory) {
		super.initSideTabs(inventory);
		sideTabManager.add(new SideTabInfo(this, true, true, true, Info.tooltipsTierI));
		sideTabManager.add(new SideTabRecipes(this, true, true, true));
		sideTabManager.add(new SideTabSlots(tier1, this, true, true, true, slotStates));
	}
}
