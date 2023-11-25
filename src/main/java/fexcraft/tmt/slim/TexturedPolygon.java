package fexcraft.tmt.slim;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TexturedPolygon {


	public List<TexturedVertex> vertices;

	public TexturedPolygon(List<TexturedVertex> apositionTexturevertex){
		vertices = apositionTexturevertex;
	}
	public TexturedPolygon(TexturedVertex[] apositionTexturevertex){
		vertices = Arrays.asList(apositionTexturevertex);
	}

	public void flipFace(){
		Collections.reverse(vertices);
	}

	public TexturedPolygon flipFace(boolean check){
		if(check){Collections.reverse(vertices);}
		return this;
	}


}