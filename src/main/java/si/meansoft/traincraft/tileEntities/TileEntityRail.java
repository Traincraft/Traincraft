package si.meansoft.traincraft.tileEntities;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.common.model.TRSRTransformation;
import org.lwjgl.opengl.GL11;
import si.meansoft.traincraft.Traincraft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityRail extends TileEntity{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();
    public EnumFacing rotation = EnumFacing.NORTH;

    public void placeTrack(List<BlockPos> harvestPositions, EnumFacing rotation){
        this.harvestPositions = harvestPositions;
        this.rotation = rotation;
    }

    public static class RailRenderer extends TileEntitySpecialRenderer<TileEntityRail>{
        IBakedModel bakedModel;
        IModel model;
        ResourceLocation modelLocation;
        public RailRenderer(ResourceLocation modelLocation){
            this.modelLocation = modelLocation;
        }

        private IBakedModel bake(){
            if(bakedModel == null){
                try{
                    model = ModelLoaderRegistry.getModel(new ResourceLocation(Traincraft.MODID, "block/long_straight.obj"));
                    bakedModel = model.bake(TRSRTransformation.identity(), DefaultVertexFormats.ITEM, location -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(location.toString()));
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
            return bakedModel;
        }

        @Override
        public void renderTileEntityAt(TileEntityRail te, double x, double y, double z, float partialTicks, int destroyStage){
            GlStateManager.pushAttrib();
            GlStateManager.pushMatrix();
            GlStateManager.translate(x, y, z);

            GlStateManager.disableRescaleNormal();
            renderOBJ(te);
            GlStateManager.popMatrix();
            GlStateManager.popAttrib();
        }

        private void renderOBJ(TileEntityRail te){
            GlStateManager.pushMatrix();
            /*
            switch(te.rotation){
                case NORTH: GlStateManager.rotate(90, 0, 0, 0);
            }*/
            GlStateManager.translate(0.5F, 0, 0.5F);
            RenderHelper.disableStandardItemLighting();
            this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            /*
            if (Minecraft.isAmbientOcclusionEnabled()) {
                GlStateManager.shadeModel(GL11.GL_SMOOTH);
            } else {
                GlStateManager.shadeModel(GL11.GL_FLAT);
            }
            */
            GlStateManager.translate(-te.getPos().getX(), -te.getPos().getY(), -te.getPos().getZ());
            Tessellator tessy = Tessellator.getInstance();
            tessy.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.BLOCK);
            Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModel(te.getWorld(), bake(), te.getWorld().getBlockState(te.getPos()), te.getPos(), Tessellator.getInstance().getBuffer(), false);
            tessy.draw();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.popMatrix();
        }
    }

}
