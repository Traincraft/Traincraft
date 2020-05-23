package tmt;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import com.sun.javafx.geom.Vec3f;


public class TexturedPolygon {

    private float[] normals;
    private ArrayList<Vec3f> iNormals;
	public PositionTransformVertex[] vertices;
	
	public TexturedPolygon(PositionTransformVertex[] apositionTexturevertex){
		normals = new float[0];
		iNormals = new ArrayList<>();
		vertices = apositionTexturevertex;
    }
	
	public void setNormals(float x, float y, float z){
		normals = new float[] {x, y, z};
	}
	
	public void setNormals(ArrayList<Vec3f> iNormal){
		iNormals = iNormal;
	}

	public void draw(Tessellator tessellator, float f){
        if(vertices.length == 3){
        	tessellator.startDrawing(GL11.GL_TRIANGLES);
        }
        else if (vertices.length == 4){
        	tessellator.startDrawing(GL11.GL_QUADS);
        }
        else{
        	tessellator.startDrawing(GL11.GL_POLYGON);
        }

        if(iNormals.size() == 0){
	        if(normals.length == 3){
	        	tessellator.setNormal(normals[0], normals[1], normals[2]);
	        }
	        else if(vertices.length >= 3){
	        	Vec3f afterCalculation = new Vec3f(vertices[1].vector3F);
	        	afterCalculation.sub(vertices[2].vector3F);
	        	Vec3f nextCalculation = new Vec3f(vertices[1].vector3F);
	        	nextCalculation.sub(vertices[0].vector3F);
	        	afterCalculation.cross(afterCalculation, nextCalculation);
	        	afterCalculation.normalize();
	        	
		        tessellator.setNormal(afterCalculation.x, afterCalculation.y, afterCalculation.z);
	        }
	        else{
	        	return;
	        }
        }
        for(int i = 0; i < vertices.length; i++){
            PositionTransformVertex positionTexturevertex = vertices[i];
            if(i < iNormals.size()){
            	tessellator.setNormal(iNormals.get(i).x, iNormals.get(i).y, iNormals.get(i).z);
            }
            tessellator.addVertexWithUV(positionTexturevertex.vector3F.x * f, positionTexturevertex.vector3F.y * f, positionTexturevertex.vector3F.z * f, positionTexturevertex.textureX, positionTexturevertex.textureY);
        }
        tessellator.draw();
    }


	public void flipFace() {
		PositionTransformVertex[] apositiontexturevertex = new PositionTransformVertex[this.vertices.length];

		for (int i = 0; i < this.vertices.length; ++i) {
			apositiontexturevertex[i] = this.vertices[this.vertices.length - i - 1];
		}

		this.vertices = apositiontexturevertex;
	}
	
}
