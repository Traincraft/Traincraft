package fexcraft.fvtm;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import org.lwjgl.opengl.GL11;

/**
 * A compatibility class for "FVTM Scheme/Format" or "FMT" models.
 * @Author Eternal BlueFlame
 *
 * @OriginalAuthor Ferdinand Calo' (FEX___96)
 */
public class TurboList extends ModelBase {

    public String boxname;
    public TurboList(String name){
        boxname=name;
    }

    public boolean add(ModelRendererTurbo t){
        super.addPart(t);
        return true;
    }

    @Override
    public void flip(ModelRendererTurbo[] model) {
        if(model==null){return;}
        for(ModelRendererTurbo mod : model){
            mod.rotateAngleY = -mod.rotateAngleY;
            mod.rotateAngleZ = -mod.rotateAngleZ;
        }
    }

    @Override
    public void render(){
        for(ModelRendererTurbo sub : boxList){
            if(sub!=null) {
                GL11.glPushMatrix();
                sub.render();
                GL11.glPopMatrix();
            }
        }
        for(ModelRendererTurbo sub : namedList){
            if(sub!=null) {
                GL11.glPushMatrix();
                sub.render();
                GL11.glPopMatrix();
            }
        }
    }

}
