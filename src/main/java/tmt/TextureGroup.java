package tmt;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class TextureGroup {
	
	public ArrayList<TexturedPolygon> poly;
	public String texture;
	
	public TextureGroup(){
		poly = new ArrayList<TexturedPolygon>();
		texture = "";
	}
	
	public void addPoly(TexturedPolygon quad){
		poly.add(quad);
	}

	public void loadTexture(){
		loadTexture(-1);
	}
	
	public void loadTexture(int defaultTexture){
		if(!texture.equals("")){
			TextureManager renderengine = Minecraft.getMinecraft().renderEngine;
	        renderengine.bindTexture(new ResourceLocation("", texture));
		}
		else if(defaultTexture > -1){
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("", ""));
		}
	}
	
}
