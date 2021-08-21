package train.client.render;


import org.lwjgl.opengl.GL11;

import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;

public class CustomModelRenderer extends ModelRendererTurbo {


	public CustomModelRenderer(ModelBase m, int i, int j, int w, int h) {
		super(m,i,j,w,h);
	}

	@Override
	public ModelRendererTurbo addBox(float f, float f1, float f2, int i, int j, int k) {
		addBox(f, f1, f2, i, j, k, 0.0f);
		return this;
	}

	//for some odd reason the boxes seem inside out normally, so it's likely the values are reversed
	@Override
	public ModelRendererTurbo addBox(float f, float f1, float f2, int i, int j, int k, float f3) {
		faces = new TexturedPolygon[6];
		float f4 = f + i +f3;
		float f5 = f1 + j +f3;
		float f6 = f2 + k +f3;
		f -= f3;
		f1 -= f3;
		f2 -= f3;
		TexturedVertex PositionTransformVertex = new TexturedVertex(f, f1, f2, 0.0F, 0.0F);
		TexturedVertex PositionTransformVertex1 = new TexturedVertex(f4, f1, f2, 0.0F, 8F);
		TexturedVertex PositionTransformVertex2 = new TexturedVertex(f4, f5, f2, 8F, 8F);
		TexturedVertex PositionTransformVertex3 = new TexturedVertex(f, f5, f2, 8F, 0.0F);
		TexturedVertex PositionTransformVertex4 = new TexturedVertex(f, f1, f6, 0.0F, 0.0F);
		TexturedVertex PositionTransformVertex5 = new TexturedVertex(f4, f1, f6, 0.0F, 8F);
		TexturedVertex PositionTransformVertex6 = new TexturedVertex(f4, f5, f6, 8F, 8F);
		TexturedVertex PositionTransformVertex7 = new TexturedVertex(f, f5, f6, 8F, 0.0F);
		faces[0] = generateFaces(new TexturedVertex[] { PositionTransformVertex5, PositionTransformVertex1, PositionTransformVertex2, PositionTransformVertex6 }, textureOffsetX + k + i, textureOffsetY + k, textureOffsetX + k + i + k, textureOffsetY + k + j, textureWidth, textureHeight);
		faces[1] = generateFaces(new TexturedVertex[] { PositionTransformVertex, PositionTransformVertex4, PositionTransformVertex7, PositionTransformVertex3 }, textureOffsetX, textureOffsetY + k, textureOffsetX + k, textureOffsetY + k + j, textureWidth, textureHeight);
		faces[2] = generateFaces(new TexturedVertex[] { PositionTransformVertex5, PositionTransformVertex4, PositionTransformVertex, PositionTransformVertex1 }, textureOffsetX + k, textureOffsetY, textureOffsetX + k + i, textureOffsetY + k, textureWidth, textureHeight);
		faces[3] = generateFaces(new TexturedVertex[] { PositionTransformVertex2, PositionTransformVertex3, PositionTransformVertex7, PositionTransformVertex6 }, textureOffsetX + k + i, textureOffsetY, textureOffsetX + k + i + i, textureOffsetY + k, textureWidth, textureHeight);
		faces[4] = generateFaces(new TexturedVertex[] { PositionTransformVertex1, PositionTransformVertex, PositionTransformVertex3, PositionTransformVertex2 }, textureOffsetX + k, textureOffsetY + k, textureOffsetX + k + i, textureOffsetY + k + j, textureWidth, textureHeight);
		faces[5] = generateFaces(new TexturedVertex[] { PositionTransformVertex4, PositionTransformVertex5, PositionTransformVertex6, PositionTransformVertex7 }, textureOffsetX + k + i + k, textureOffsetY + k, textureOffsetX + k + i + k + i, textureOffsetY + k + j, textureWidth, textureHeight);

		textureGroup.get("0").poly.clear();
		textureGroup.get("0").poly.add(faces[0]);
		textureGroup.get("0").poly.add(faces[1]);
		textureGroup.get("0").poly.add(faces[2]);
		textureGroup.get("0").poly.add(faces[3]);
		textureGroup.get("0").poly.add(faces[4]);
		textureGroup.get("0").poly.add(faces[5]);
		return this;
	}

	private static TexturedPolygon generateFaces(TexturedVertex aPositionTransformVertex[], int i, int j, int k, int l, float textureWidth, float textureHeight) {
		aPositionTransformVertex[0] = new TexturedVertex(aPositionTransformVertex[0].vector3F, (float) k / textureWidth - 0.0015625F, (float) j / textureHeight + 0.003125F);
		aPositionTransformVertex[1] = new TexturedVertex(aPositionTransformVertex[1].vector3F,(float) i / textureWidth + 0.0015625F, (float) j / textureHeight + 0.003125F);
		aPositionTransformVertex[2] = new TexturedVertex(aPositionTransformVertex[2].vector3F,(float) i / textureWidth + 0.0015625F, (float) l / textureHeight - 0.003125F);
		aPositionTransformVertex[3] = new TexturedVertex(aPositionTransformVertex[3].vector3F,(float) k / textureWidth - 0.0015625F, (float) l / textureHeight - 0.003125F);
		return new TexturedPolygon(aPositionTransformVertex);
	}

	private static final float degreesF = (float)(180D/Math.PI);

	//same as super, but old models have inverse Y rotations and I don't even understand the Z rotation
	public void render(float worldScale, boolean invertYZ) {

		if(!showModel) {
			return;
		}
		if(!compiled) {
			compileDisplayList(worldScale);
			return;
		}
		if (rotateAngleX != 0.0F || rotateAngleY != 0.0F || rotateAngleZ != 0.0F) {
			GL11.glPushMatrix();
			GL11.glTranslatef(rotationPointX * worldScale, rotationPointY * worldScale, rotationPointZ *worldScale);
			if (rotateAngleZ != 0.0F) {
				GL11.glRotatef(rotateAngleZ * degreesF, 0.0F, 0.0F, 1.0F);
			}
			if (rotateAngleY != 0.0F) {
				GL11.glRotatef(rotateAngleY * degreesF, 0.0F, 1.0F, 0.0F);
			}
			if (rotateAngleX != 0.0F) {
				GL11.glRotatef(rotateAngleX * degreesF, 1.0F, 0.0F, 0.0F);
			}
			callDisplayList();
			GL11.glPopMatrix();
		}
		else if (rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F) {
			GL11.glTranslatef(rotationPointX * worldScale, rotationPointY * worldScale, rotationPointZ * worldScale);
			callDisplayList();
			GL11.glTranslatef(-rotationPointX * worldScale, -rotationPointY * worldScale, -rotationPointZ * worldScale);
		}
		else {
			callDisplayList();
		}
	}

}
