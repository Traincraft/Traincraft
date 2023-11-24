package tmt;

import java.util.ArrayList;

import net.minecraft.entity.Entity;

/**
 * Basic Compatiblity class for FVTM Format Models
 * 
 * @author Ferdinand (FEX___96)
 *
 */
public class FVTMFormatBase extends ModelBase {
	
	protected int textureX, textureY;
	public ArrayList<TurboList> groups = new ArrayList<TurboList>();

	public void addToCreators(String author){
		//
	}
	
	@SuppressWarnings("serial")
	public static class TurboList extends ArrayList<ModelRendererTurbo>{
		
		public final String name;
		
		public TurboList(String groupname){
			this.name = groupname;
		}
		
	}
	
	@Override
	public void render(){
		for(TurboList list : groups){
			for(ModelRendererTurbo turbo : list) turbo.render();
		}
	}
	

	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		for(TurboList list : groups){
			for(ModelRendererTurbo turbo : list) turbo.render();
		}
	}

}
