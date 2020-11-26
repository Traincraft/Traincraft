package ebf.tim.gui;

import ebf.tim.TrainsInMotion;
import ebf.tim.render.ModelBook;
import ebf.tim.utility.ClientUtil;
import ebf.tim.utility.CommonProxy;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.Recipe;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.*;


/**
 * new data storage management, pages as Objects, as either List<ItemStack>[] or String
 *
 * the each entry in the list defines the itemstacks from the ore directory and every x seconds it cycles through them. it's very likely to be only 1 entry.
 * each entry in the array of lists denotes a different item in the recipe, with the 9th being the result.
 *
 * GUI needs a custom inherant class to define things like the dynamic resolution and methods for scaling and rendering geometry.
 * can inherit normal item rendering for the stacks, simplify it to it's own method with an offset so two pages can be done at once
 * if the recipe value for a page is null then just draw a blank page
 *
 *
 * TODO: mod index has been changed to a string rather than an integer, convert accordingly.
 */


public class GUICraftBook extends GuiScreen {

    private static Map<String, List<bookPage>> infoPages=new HashMap<>();
    public static int guiLeft=0,guiTop=0, page=0;
    private static List<Object> pageData = null;
    private static ModelBook book = new ModelBook();
    int frame=0;
    public static @Nullable Object getPage(int current){
        if(pageData==null) {
            List<Object> pages = new ArrayList<>();

            List<String> modids = new ArrayList<>();
            modids.addAll(CommonProxy.recipesInMods.keySet());
            modids.addAll(infoPages.keySet());
            modids.remove(TrainsInMotion.MODID);
            java.util.Collections.sort(modids);
            modids.add(0,TrainsInMotion.MODID);//make sure core mod entries are at start

            for (String mod : modids) {
                DebugUtil.println(mod);
                if(infoPages.containsKey(mod)) {
                    for(bookPage p : infoPages.get(mod)){
                        pages.add(p);//Collections.addAll does not work with this. i have no idea why.
                    }
                }
                if(CommonProxy.recipesInMods.containsKey(mod)) {
                    for (Recipe r : CommonProxy.recipesInMods.get(mod)) {
                        if (r.getresult() != null) {//for some unknown reason this must be called for the recipe to initialize at all...
                            pages.add(r);
                        }
                    }
                }
            }
            pageData=pages;
        }
        return pageData.size()>current?pageData.get(current):null;
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        super.drawScreen(mouseX, mouseY, par3);

        GL11.glPushMatrix();
        //GL11.glTranslatef(,, 300);
        GL11.glColor4f(1,1,1,1);

        GL11.glDisable(GL11.GL_LIGHTING);
        TextureManager.bindTexture(new ResourceLocation("textures/gui/book.png"));
        ClientUtil.drawTexturedRect(percentLeft(10),percentTop(15),166,0,percentLeft(40),percentTop(60),-140,192);

        ClientUtil.drawTexturedRect(percentLeft(50),percentTop(15),26,0,percentLeft(40),percentTop(60),140,192);
        GL11.glPopMatrix();

        renderpage(true, mouseX, mouseY);
        renderpage(false, mouseX, mouseY);

        GL11.glEnable(GL11.GL_LIGHTING);

        //change the item displayed every 2 seconds (120 frames)
        frame++;
        if(frame>120){
            if(getPage(page) instanceof Recipe) {
                ((Recipe)getPage(page)).nextDisplayItem();
            }
            if(getPage(page+1) instanceof Recipe) {
                ((Recipe)getPage(page+1)).nextDisplayItem();
            }
        }
    }



    public static int getBookSlotPlacement(boolean x, int index){
        if(x){
            return 32* (index>8?1:index>5?index-6:index>2?index-3:index);
        } else {
            return index>8?-32:index>5?64:index>2?32:0;
        }
    }

    public static void renderpage(boolean leftPage, int mouseX, int mouseY){
        if(getPage(leftPage?page:page+1)==null){return;}
        if(getPage(leftPage?page:page+1) instanceof Recipe) {

            Minecraft.getMinecraft().fontRenderer.drawString(((Recipe) getPage(leftPage?page:page+1)).getresult().get(0).getDisplayName()
                    ,percentLeft(leftPage?15:55), percentTop(20), 0x000000);

            List<ItemStack> slots = new ArrayList<>();
            List<Integer> slotx = new ArrayList<>();
            List<Integer> sloty = new ArrayList<>();
            for (int slot = 0; slot < 10; slot++) {
                slots.add(((Recipe)getPage(leftPage?page:page+1)).getDisplayArray()[slot]);
                slotx.add((leftPage?22:60)+getBookSlotPlacement(true, slot));
                sloty.add(30+getBookSlotPlacement(false, slot));

            }
            GL11.glPushMatrix();
            GL11.glColor4f(1,1,1,1);
            GL11.glDisable(GL11.GL_CULL_FACE);
            ClientUtil.drawSlots(slots,null, slotx,sloty,mouseX,mouseY,guiLeft,guiTop,itemRender);
            GL11.glPopMatrix();
        } else if(getPage(leftPage?page:page+1) instanceof bookPage){
            String[] disp = ((bookPage)getPage(leftPage?page:page+1)).text.split("\n");
            for (int i=0;i<disp.length;i++){
                Minecraft.getMinecraft().fontRenderer.drawString(disp[i],percentLeft(leftPage?15:54), percentTop(20)+(i*12), 0x000000);
            }

            //todo: draw images from pages
        }
    }

    public GUICraftBook(){}



    @Override
    public void initGui() {
        super.initGui();
        guiLeft=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();

        buttonList =new ArrayList();

        buttonList.add(new GuiButton(-1, percentLeft(30)-10,percentTop(80)-10, 20,20,"<"));//left
        buttonList.add(new GuiButton(1,percentLeft(70)-10,percentTop(80)-10,20,20,">"));//right

    }


    @Override
    protected void actionPerformed(GuiButton p_146284_1_) {
        switch (p_146284_1_.id){
            case -1:{
                if(page>0){page-=2;}
                break;
            }
            case 1:{
                if (page+2<pageData.size()){page+=2;}
                break;
            }
        }
    }
    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}



    private static class bookPage{
        String text;
        bookImage[] pictures;
        public bookPage(String t, bookImage[] images){
            text=t;
            pictures=images;
        }
    }

    public static void addPage(String modid, String text, bookImage ... images){
        if(infoPages.containsKey(modid)){
            infoPages.get(modid).add(new bookPage(text,images));
        } else {
            infoPages.put(modid, Collections.singletonList(new bookPage(text,images)));
        }
    }
    public static void addPage(String modid, String text){
        if(infoPages.containsKey(modid)){
            infoPages.get(modid).add(new bookPage(text,null));
        } else {
            List<bookPage> pages = new ArrayList<>();
            pages.add(new bookPage(text,null));
            infoPages.put(modid, pages);
        }
    }

    private static class bookImage{
        ResourceLocation texture;
        int x,y,width,height;
    }

    public static bookImage addImage(ResourceLocation texture, int x, int y, int width, int height){
        bookImage img = new bookImage();
        img.texture=texture;
        img.x=x;img.y=y;img.width=width;img.height=height;
        return img;
    }

}