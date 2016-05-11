package si.meansoft.traincraft.tileEntities;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import si.meansoft.traincraft.Traincraft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityRail extends TileEntity{

    public List<BlockPos> harvestPositions = new ArrayList<BlockPos>();

    public static class RailRenderer extends TileEntitySpecialRenderer{
        OBJModel.Parser parser;
        ResourceLocation texture;
        public RailRenderer(ResourceLocation modelLocation, ResourceLocation modelTexture){
            System.out.println("render");
            IResourceManager manager = Minecraft.getMinecraft().getResourceManager();
            try{
                parser = new OBJModel.Parser(manager.getResource(modelLocation), manager);
                this.texture = modelTexture;
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        @Override
        public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage){
            try{
                OBJLoader.INSTANCE.loadModel(new ResourceLocation(Traincraft.MODID, "models/long_straight.obj"));
            } catch(Exception e){
                e.printStackTrace();
            }
            /*
            if(this.parser != null){
                System.out.println(this.texture);
                GlStateManager.pushMatrix();
                GlStateManager.translate(x, y, z);
                Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                try{

                } catch(Exception e){
                    e.printStackTrace();
                }
                GlStateManager.popMatrix();
            }
            */
        }
    }

}
