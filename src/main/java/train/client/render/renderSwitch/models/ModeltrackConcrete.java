package train.client.render.renderSwitch.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.tileSwitch.TiletrackConcrete;


public class ModeltrackConcrete extends ModelBase {

    private IModelCustom trackConcrete;

    public ModeltrackConcrete() {
        trackConcrete = new AdvancedModelLoader().loadModel(new ResourceLocation(Info.modelPrefix + "track_concrete.obj"));
    }

    public void render() {
        trackConcrete.renderAll();
    }

    public void render(TiletrackConcrete pillar, double x, double y, double z) {
        GL11.glPushMatrix();

        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
        //GL11.glScalef(0.1f,0.1f,0.1f);

        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_concreteTexture2.png"));
        GL11.glColor4f(1, 1, 1, 1);
        int facing = pillar.getWorldObj().getBlockMetadata((int) pillar.xCoord, (int) pillar.yCoord, (int) pillar.zCoord);
        if(facing == 2){
            GL11.glRotatef(90, 0, 1, 0);
        }
        if(facing == 0){
            GL11.glRotatef(90, 0, 1, 0);
        }
        render();
        GL11.glPopMatrix();
    }
}

