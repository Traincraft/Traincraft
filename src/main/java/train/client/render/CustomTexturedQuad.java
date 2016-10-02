package train.client.render;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Vec3;

public class CustomTexturedQuad {
	private PositionTextureVertex vertexPositions[];

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[]) {
		invertNormal = false;
		vertexPositions = apositiontexturevertex;
	}

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[], int i, int j, int k, int l) {
		this(apositiontexturevertex);
		apositiontexturevertex[0] = apositiontexturevertex[0].setTexturePosition((float) k / 64F - 0.0015625F, (float) j / 32F + 0.003125F);
		apositiontexturevertex[1] = apositiontexturevertex[1].setTexturePosition((float) i / 64F + 0.0015625F, (float) j / 32F + 0.003125F);
		apositiontexturevertex[2] = apositiontexturevertex[2].setTexturePosition((float) i / 64F + 0.0015625F, (float) l / 32F - 0.003125F);
		apositiontexturevertex[3] = apositiontexturevertex[3].setTexturePosition((float) k / 64F - 0.0015625F, (float) l / 32F - 0.003125F);
	}

	public CustomTexturedQuad(PositionTextureVertex apositiontexturevertex[], int i, int j, int k, int l, int texWidth, int texHeight) {
		this(apositiontexturevertex);
		apositiontexturevertex[0] = apositiontexturevertex[0].setTexturePosition((float) k / texWidth - 0.0015625F, (float) j / texHeight + 0.003125F);
		apositiontexturevertex[1] = apositiontexturevertex[1].setTexturePosition((float) i / texWidth + 0.0015625F, (float) j / texHeight + 0.003125F);
		apositiontexturevertex[2] = apositiontexturevertex[2].setTexturePosition((float) i / texWidth + 0.0015625F, (float) l / texHeight - 0.003125F);
		apositiontexturevertex[3] = apositiontexturevertex[3].setTexturePosition((float) k / texWidth - 0.0015625F, (float) l / texHeight - 0.003125F);
	}

	public void flipFace() {
		PositionTextureVertex apositiontexturevertex[] = new PositionTextureVertex[vertexPositions.length];
		for (int i = 0; i < vertexPositions.length; i++) {
			apositiontexturevertex[i] = vertexPositions[vertexPositions.length - i - 1];
		}

		vertexPositions = apositiontexturevertex;
	}

	public void draw(Tessellator tessellator, float f) {
		Vec3 vec3d2 = vertexPositions[1].vector3D.subtract(vertexPositions[2].vector3D).crossProduct(vertexPositions[1].vector3D.subtract(vertexPositions[0].vector3D)).normalize();
		tessellator.startDrawingQuads();
		if (invertNormal) {
			tessellator.setNormal(-(float) vec3d2.xCoord, -(float) vec3d2.yCoord, -(float) vec3d2.zCoord);
		}
		else {
			tessellator.setNormal((float) vec3d2.xCoord, (float) vec3d2.yCoord, (float) vec3d2.zCoord);
		}
		for (int i = 0; i < 4; i++) {
			tessellator.addVertexWithUV((float) vertexPositions[i].vector3D.xCoord * f, (float) vertexPositions[i].vector3D.yCoord * f, (float) vertexPositions[i].vector3D.zCoord * f, vertexPositions[i].texturePositionX, vertexPositions[i].texturePositionY);
		}

		tessellator.draw();
	}

	private boolean invertNormal;
}
