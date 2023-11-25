package train.common.api;

import fexcraft.tmt.slim.ModelBase;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public interface TrainRenderRecord {

    Class<? extends AbstractTrains> getEntityClass();

    ModelBase getModel();

    boolean hasSmoke();

    boolean hasSmokeOnSlopes();

    String getSmokeType();

    ArrayList<double[]> getSmokeFX();

    String getExplosionType();

    boolean hasExplosion();

    ArrayList<double[]> getExplosionFX();

    float[] getTrans();

    float[] getRotate();

    float[] getScale();

    ResourceLocation getTextureFile(String colorString);

    int getSmokeIterations();

    int getExplosionFXIterations();
}
