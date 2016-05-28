package train.client.render;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Vec3;

public class CustomTexturedQuad {

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[]) {
		nVertices = 0;
		invertNormal = false;
		vertexPositions = apositiontexturevertex;
		nVertices = apositiontexturevertex.length;
	}

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[], int i, int j, int k, int l) {
		this(apositiontexturevertex);
		float f = 0.0015625F;
		float f1 = 0.003125F;
		apositiontexturevertex[0] = apositiontexturevertex[0].setTexturePosition((float) k / 64F - f, (float) j / 32F + f1);
		apositiontexturevertex[1] = apositiontexturevertex[1].setTexturePosition((float) i / 64F + f, (float) j / 32F + f1);
		apositiontexturevertex[2] = apositiontexturevertex[2].setTexturePosition((float) i / 64F + f, (float) l / 32F - f1);
		apositiontexturevertex[3] = apositiontexturevertex[3].setTexturePosition((float) k / 64F - f, (float) l / 32F - f1);
	}

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[], int i, int j, int k, int l, int texWidth, int texHeight) {
		this(apositiontexturevertex);
		float f = 0.0015625F;
		float f1 = 0.003125F;
		float w = (float) texWidth;
		float h = (float) texHeight;
		apositiontexturevertex[0] = apositiontexturevertex[0].setTexturePosition((float) k / w - f, (float) j / h + f1);
		apositiontexturevertex[1] = apositiontexturevertex[1].setTexturePosition((float) i / w + f, (float) j / h + f1);
		apositiontexturevertex[2] = apositiontexturevertex[2].setTexturePosition((float) i / w + f, (float) l / h - f1);
		apositiontexturevertex[3] = apositiontexturevertex[3].setTexturePosition((float) k / w - f, (float) l / h - f1);
	}

	public void flipFace() {
		PositionTextureVertex apositiontexturevertex[] = new PositionTextureVertex[vertexPositions.length];
		for (int i = 0; i < vertexPositions.length; i++) {
			apositiontexturevertex[i] = vertexPositions[vertexPositions.length - i - 1];
		}

		vertexPositions = apositiontexturevertex;
	}

	public void draw(Tessellator tessellator, float f) {
		Vec3 vec3d = vertexPositions[1].vector3D.subtract(vertexPositions[0].vector3D);
		Vec3 vec3d1 = vertexPositions[1].vector3D.subtract(vertexPositions[2].vector3D);
		Vec3 vec3d2 = vec3d1.crossProduct(vec3d).normalize();
		tessellator.startDrawingQuads();
		if (invertNormal) {
			tessellator.setNormal(-(float) vec3d2.xCoord, -(float) vec3d2.yCoord, -(float) vec3d2.zCoord);
		}
		else {
			tessellator.setNormal((float) vec3d2.xCoord, (float) vec3d2.yCoord, (float) vec3d2.zCoord);
		}
		for (int i = 0; i < 4; i++) {
			PositionTextureVertex positiontexturevertex = vertexPositions[i];
			tessellator.addVertexWithUV((float) positiontexturevertex.vector3D.xCoord * f, (float) positiontexturevertex.vector3D.yCoord * f, (float) positiontexturevertex.vector3D.zCoord * f, positiontexturevertex.texturePositionX, positiontexturevertex.texturePositionY);
		}

		tessellator.draw();
	}

	public PositionTextureVertex vertexPositions[];
	public int nVertices;
	private boolean invertNormal;
	private int texWidth;
	private int texHeight;
}
