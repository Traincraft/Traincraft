package fexcraft.tmt.slim;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TexturedPolygon {


	public List<TexturedVertex> vertices;

	public TexturedPolygon(List<TexturedVertex> apositionTexturevertex){
		vertices=new ArrayList<>();

		if(apositionTexturevertex.size()==4) {
			if (apositionTexturevertex.get(0).vector3F.equals(apositionTexturevertex.get(1).vector3F)
					|| apositionTexturevertex.get(0).vector3F.equals(apositionTexturevertex.get(3).vector3F)) {
				vertices.add(apositionTexturevertex.get(1));
				vertices.add(apositionTexturevertex.get(2));
				vertices.add(apositionTexturevertex.get(3));
			} else if (apositionTexturevertex.get(1).vector3F.equals(apositionTexturevertex.get(2).vector3F)) {
				vertices.add(apositionTexturevertex.get(0));
				vertices.add(apositionTexturevertex.get(2));
				vertices.add(apositionTexturevertex.get(3));
			} else if (apositionTexturevertex.get(2).vector3F.equals(apositionTexturevertex.get(3).vector3F)) {
				vertices.add(apositionTexturevertex.get(0));
				vertices.add(apositionTexturevertex.get(1));
				vertices.add(apositionTexturevertex.get(3));
			} else {
				vertices=apositionTexturevertex;
			}
		} else {
			vertices=apositionTexturevertex;
		}
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