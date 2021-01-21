package ebf.tim.render;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>grouped model render</h2>
 * renders several geometry as if they are one, good for grouping geometry together to display inventory contents and use percentage.
 * also used to render blocks since they are often rendered as a group rather than individually.
 *         Can still be used to render blocks individually.
 * @author Eternal Blue Flame
 */
public class GroupedModelRender {

    /**tag for all the cargo to render as a block, similar to what enderman does.
     * NOTE: this supports grouping, parts with the same exact name will represent the same percentage of inventory used.
     * NOTE 2: order is defined in the model geometry order, not by name, so be sure they are organized properly in your editor.
     * EXAMPLE: (tagRenderBlockCargo + "myblock5") and (tagRenderBlockCargo + "myblock2")
     * what is shown in the example will be two separate groups, each representing half the inventory, with 5 actually being the first because it was defined first.*/
    public static final String tagRenderBlockCargo = "renderblock";
    /**tag for all the cargo to render from the model, but as representation of inventory use.
     * NOTE: this supports grouping, parts with the same exact name will represent the same percentage of inventory used.
     * NOTE 2: order is defined in the model geometry order, not by name, so be sure they are organized properly in your editor.
     * EXAMPLE: (tagRenderModelCargo + "myblock5") and (tagRenderModelCargo + "myblock2")
     * what is shown in the example will be two separate groups, each representing half the inventory, with 5 actually being the first because it was defined first.*/
    public static final String tagRenderModelCargo = "rendercrate";
    /**tag for geometry that scales the Y size to represent inventory use. Renders using the block texture.*/
    public static final String tagBlockScaleInventory = "scaleblockinventory";
    /**tag for geometry that scales the Y size to represent inventory use. renders using the model's texture.*/
    public static final String tagScaleInventory = "scaleinventory";
    /**tag for livery spots, it's marked here so multiple spots can host the same texture value.*/
    public static final String tagLivery = "liveryimg";

    /**if it should be rendered as a normal block from the inventory, similar to enderman, or part of the model*/
    private boolean isBlock;
    /**if it should be rendered as a normal block from the inventory, similar to enderman, or part of the model*/
    private boolean isScaled;
    /**a reference to the geometry we will modify in this sub-class*/
    private List<ModelRendererTurbo> boxRefrence = new ArrayList<ModelRendererTurbo>();


    /**
     *
     * @param type options:
     *             0 - renders a block to show cargo
     *             1 - renders the geometry with texture to show cargo.
     *             2 - renders a block and stretches the height from 0 to the part height based on percentage of used slots.
     *             3 - same as 2, but uses the model's geometry and texture.
     *             4 - livery slot.
     * @param groupID
     * @return
     */
    public static String groupedPart(int type, int groupID){
        switch (type){
            case 1:{return tagRenderModelCargo + groupID;}
            case 2:{return tagBlockScaleInventory + groupID;}
            case 3:{return tagScaleInventory + groupID;}
            case 4:{return tagLivery + groupID;}
            case 0: default:{return tagRenderBlockCargo + groupID;}
        }
    }

    /**
     * used to add geometry to the group.
     * @param boxToRender the geometry to add
     * @return returns this instance of GroupedModelRender
     */
    public GroupedModelRender add(ModelRendererTurbo boxToRender){
        boxRefrence.add(boxToRender);
        isBlock = (CommonUtil.stringContains(boxToRender.boxName,tagRenderBlockCargo) || CommonUtil.stringContains(boxToRender.boxName,tagBlockScaleInventory));;
        isScaled = (CommonUtil.stringContains(boxToRender.boxName,tagScaleInventory) || CommonUtil.stringContains(boxToRender.boxName,tagBlockScaleInventory));
        return this;
    }

    /**
     * to add more allowed types extend this function and add more circumstances before calling super.
     * @param modelReference the geometry to check
     * @return if the box refrence can be added
     */
    public static boolean canAdd(ModelRendererTurbo modelReference){
        return ClientProxy.EnableAnimations && (CommonUtil.stringContains(modelReference.boxName,tagRenderModelCargo) || CommonUtil.stringContains(modelReference.boxName,tagRenderBlockCargo) ||  CommonUtil.stringContains(modelReference.boxName,tagScaleInventory)
        ||  CommonUtil.stringContains(modelReference.boxName,tagBlockScaleInventory));
    }

    /**
     * to add more allowed types extend this function and add more circumstances before calling super.
     * @param modelReference the geometry to check
     * @return if the box is supposed to be scaled with the percentage of inventory used.
     */
    public static boolean isLivery(ModelRendererTurbo modelReference){
        return (CommonUtil.stringContains(modelReference.boxName,tagLivery));
    }

    /**
     * used to actually render the models in this group, either as actual blocks, or as a part of the host model.
     * if you wanna change this stuff in your own mod you'll have to make you're own render that extends our RenderWagon.
     * @param field_147909_c the RenderBlocks variable from the render class, since it's private.
     * @param blockStack the Itemstack to render as a block.
     * @param render the render class used for binding the texture.
     * @param entityRenderScale the scale to render at.
     */
    public void doRender(RenderBlocks field_147909_c, ItemStack blockStack, RenderWagon render, float entityRenderScale, GenericRailTransport transport){
        if(field_147909_c==null){
            return;
        }
        if (isBlock) {
            float yScale=1;
            if(isScaled){
                yScale = transport.calculatePercentageOfSlotsUsed(100)*0.01f;
                if (yScale == 0) {
                    return;
                }
            }
           // GL11.glPushMatrix();
            //render a block in place of the geometry.
            // bind the texture
            Tessellator.bindTexture(TextureMap.locationBlocksTexture);
            for (ModelRendererTurbo block : boxRefrence) {
                GL11.glPushMatrix();
                //define position from model
                GL11.glTranslated(((block.rotationPointX) / 16),
                        ((block.rotationPointY) / 16) -0.06,
                        ((block.rotationPointZ) / 16) +0.06);
                //define the rotation from the model
                GL11.glRotated(block.rotateAngleX * CommonUtil.degreesD, 1, 0, 0);
                GL11.glRotated(block.rotateAngleY * CommonUtil.degreesD, 0, 1, 0);
                GL11.glRotated((block.rotateAngleZ * CommonUtil.degreesD)+90, 0, 0, 1);
                //define scale based on the model
                GL11.glScaled(0.0625f*block.width, (0.0625f*block.height)*yScale, (0.0625f*block.depth));
                //now actually render the block.
                field_147909_c.renderBlockAsItem( Block.getBlockFromItem(blockStack.getItem()), blockStack.getItemDamage(), 1.0f);
                GL11.glPopMatrix();
            }
           // GL11.glPopMatrix();
        } else {
            //render the geometry normally if it's not a block.
            Tessellator.bindTexture(transport.getTexture(Minecraft.getMinecraft().thePlayer).getTexture(0));
            int liveryIndex=-1;
            String lastLivery="";
            for (ModelRendererTurbo block : boxRefrence) {
                if (isLivery(block)){
                    if (!block.boxName.equals(lastLivery)){
                        liveryIndex++;lastLivery = block.boxName;
                    }
                    //Tessellator.bindTexture(transport.getLivery(liveryIndex));
                }
                block.render(entityRenderScale);
            }
        }
    }


    /**returns the group name*/
    public String getGroupName(){
        return boxRefrence.size()>0?boxRefrence.get(0).boxName:"";
    }

}
