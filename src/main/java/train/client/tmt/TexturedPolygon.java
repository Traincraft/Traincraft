package train.client.tmt;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

/**
 * An extension of TexturedQuad that adds support for more shapes beyond simple quads.
 */
public class TexturedPolygon extends TexturedQuad {
	public TexturedPolygon(PositionTextureVertex apositionTexturevertex[]) {
		super(apositionTexturevertex);
    }

	public void setNormals(int x, int y, int z)
	{
		normals = new int[] {x, y, z};
	}

	public void setNormals(ArrayList<int[]> vec)
	{
		iNormals = vec;
	}

	public void draw(Tessellator tessellator, float f) {

        if(nVertices == 3) {
			tessellator.startDrawing(GL11.GL_TRIANGLES);
		}else if (nVertices == 4) {
			tessellator.startDrawing(GL11.GL_QUADS);
		}else {
			tessellator.startDrawing(GL11.GL_POLYGON);
		}
        if(iNormals.size() == 0) {
	        if(normals.length == 3) {
	        	tessellator.setNormal(normals[0], normals[1], normals[2]);
	        } else if(vertexPositions.length > 3) {
		        Vec3d2 = new Vec3d(vertexPositions[1].vector3D.subtract(vertexPositions[2].vector3D)
						.crossProduct(vertexPositions[1].vector3D.subtract(vertexPositions[0].vector3D)).normalize());

		        tessellator.setNormal((int)Vec3d2.xCoord, (int)Vec3d2.yCoord, (int)Vec3d2.zCoord);
	        } else {
	        	return;
	        }
        }
        for(int i = 0; i < nVertices; i++) {
            PositionTextureVertex positionTexturevertex = vertexPositions[i];
            if(positionTexturevertex instanceof PositionTransformVertex) {
				((PositionTransformVertex) positionTexturevertex).setTransformation();
			}
            if(i < iNormals.size()) {
				tessellator.setNormal(iNormals.get(i)[0], iNormals.get(i)[1], iNormals.get(i)[2]);
            }
            tessellator.addVertexWithUV((float) positionTexturevertex.vector3D.xCoord * f, (float) positionTexturevertex.vector3D.yCoord * f, (float) positionTexturevertex.vector3D.zCoord * f, (float)positionTexturevertex.texturePositionX, (float)positionTexturevertex.texturePositionY);
        }

        tessellator.draw();
    }

    private int[] normals = new int[0];
    private Vec3d Vec3d2;
    private ArrayList<int[]> iNormals = new ArrayList<int[]>();
}
