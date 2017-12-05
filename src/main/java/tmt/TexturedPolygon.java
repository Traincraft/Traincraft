package tmt;

import org.lwjgl.opengl.GL11;

import java.util.ArrayList;


public class TexturedPolygon {

    private boolean invertNormal;
    private float[] normals;
    private ArrayList<Vec3f> iNormals;
	public PositionTransformVertex[] vertices;
	
	public TexturedPolygon(PositionTransformVertex apositionTexturevertex[]){
		invertNormal = false;
		normals = new float[0];
		iNormals = new ArrayList<Vec3f>();
		vertices = apositionTexturevertex;
    }

	public void setInvertNormal(boolean isSet){
		invertNormal = isSet;
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
	        	if(invertNormal){
	        		tessellator.setNormal(-normals[0], -normals[1], -normals[2]);
	        	}
	        	else{
	        		tessellator.setNormal(normals[0], normals[1], normals[2]);
	        	}
	        }
	        else if(vertices.length >= 3){
		        Vec3f Vec3d2 =
		        		vertices[1].vector3F.subtract(vertices[2].vector3F)
								.crossProduct(vertices[1].vector3F.subtract(vertices[0].vector3F))
								.normalize();
		        if(invertNormal){
		            tessellator.setNormal(-Vec3d2.xCoord, -Vec3d2.yCoord, -Vec3d2.zCoord);
		        }
		        else{
		            tessellator.setNormal(Vec3d2.xCoord, Vec3d2.yCoord, Vec3d2.zCoord);
		        }
	        }
	        else{
	        	return;
	        }
        }
        for(int i = 0; i < vertices.length; i++){
            PositionTransformVertex positionTexturevertex = vertices[i];
            if(i < iNormals.size()){
            	if(invertNormal){
            		tessellator.setNormal(-iNormals.get(i).xCoord, -iNormals.get(i).yCoord, -iNormals.get(i).zCoord);
            	}
            	else{
            		tessellator.setNormal(iNormals.get(i).xCoord, iNormals.get(i).yCoord, iNormals.get(i).zCoord);
            	}
            }
            tessellator.addVertexWithUV(positionTexturevertex.vector3F.xCoord * f, positionTexturevertex.vector3F.yCoord * f, positionTexturevertex.vector3F.zCoord * f, positionTexturevertex.textureX, positionTexturevertex.textureY);
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
