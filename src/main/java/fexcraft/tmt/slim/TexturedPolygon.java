package fexcraft.tmt.slim;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TexturedPolygon {


	public List<TexturedVertex> vertices;

	public TexturedPolygon(List<TexturedVertex> apositionTexturevertex){
		vertices = apositionTexturevertex;
		if(vertices.size()==4) {
			if (vertices.get(0).vector3F.equals(vertices.get(1).vector3F) || vertices.get(0).vector3F.equals(vertices.get(3).vector3F)) {
				vertices.remove(0);
			} else if (vertices.get(1).vector3F.equals(vertices.get(2).vector3F)) {
				vertices.remove(1);
			} else if (vertices.get(2).vector3F.equals(vertices.get(3).vector3F)) {
				vertices.remove(2);
			}
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