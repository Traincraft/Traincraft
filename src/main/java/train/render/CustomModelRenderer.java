package train.render;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.TexturedPolygon;
import fexcraft.tmt.slim.TexturedVertex;
import org.lwjgl.opengl.GL11;
import scala.actors.threadpool.Arrays;

import java.util.ArrayList;

public class CustomModelRenderer extends ModelRendererTurbo {

    Integer glID=null;

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
		faces = new ArrayList<TexturedPolygon>();
		float f4 = f + i +f3;
		float f5 = f1 + j +f3;
		float f6 = f2 + k +f3;
		f -= f3;
		f1 -= f3;
		f2 -= f3;
		TexturedVertex TexturedVertex = new TexturedVertex(f, f1, f2, 0.0F, 0.0F);
		TexturedVertex TexturedVertex1 = new TexturedVertex(f4, f1, f2, 0.0F, 8F);
		TexturedVertex TexturedVertex2 = new TexturedVertex(f4, f5, f2, 8F, 8F);
		TexturedVertex TexturedVertex3 = new TexturedVertex(f, f5, f2, 8F, 0.0F);
		TexturedVertex TexturedVertex4 = new TexturedVertex(f, f1, f6, 0.0F, 0.0F);
		TexturedVertex TexturedVertex5 = new TexturedVertex(f4, f1, f6, 0.0F, 8F);
		TexturedVertex TexturedVertex6 = new TexturedVertex(f4, f5, f6, 8F, 8F);
		fexcraft.tmt.slim.TexturedVertex TexturedVertex7 = new TexturedVertex(f, f5, f6, 8F, 0.0F);
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex5, TexturedVertex1, TexturedVertex2, TexturedVertex6 }, textureOffsetX + k + i, textureOffsetY + k, textureOffsetX + k + i + k, textureOffsetY + k + j, textureWidth, textureHeight));
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex, TexturedVertex4, TexturedVertex7, TexturedVertex3 }, textureOffsetX, textureOffsetY + k, textureOffsetX + k, textureOffsetY + k + j, textureWidth, textureHeight));
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex5, TexturedVertex4, TexturedVertex, TexturedVertex1 }, textureOffsetX + k, textureOffsetY, textureOffsetX + k + i, textureOffsetY + k, textureWidth, textureHeight));
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex2, TexturedVertex3, TexturedVertex7, TexturedVertex6 }, textureOffsetX + k + i, textureOffsetY, textureOffsetX + k + i + i, textureOffsetY + k, textureWidth, textureHeight));
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex1, TexturedVertex, TexturedVertex3, TexturedVertex2 }, textureOffsetX + k, textureOffsetY + k, textureOffsetX + k + i, textureOffsetY + k + j, textureWidth, textureHeight));
		faces.add(generateFaces(new TexturedVertex[] { TexturedVertex4, TexturedVertex5, TexturedVertex6, TexturedVertex7 }, textureOffsetX + k + i + k, textureOffsetY + k, textureOffsetX + k + i + k + i, textureOffsetY + k + j, textureWidth, textureHeight));
		return this;
	}


	private static TexturedPolygon generateFaces(TexturedVertex aTexturedVertex[], int i, int j, int k, int l, float textureWidth, float textureHeight) {
		aTexturedVertex[0] = new TexturedVertex(aTexturedVertex[0].vector3F, (float) k / textureWidth - 0.0015625F, (float) j / textureHeight + 0.003125F);
		aTexturedVertex[1] = new TexturedVertex(aTexturedVertex[1].vector3F,(float) i / textureWidth + 0.0015625F, (float) j / textureHeight + 0.003125F);
		aTexturedVertex[2] = new TexturedVertex(aTexturedVertex[2].vector3F,(float) i / textureWidth + 0.0015625F, (float) l / textureHeight - 0.003125F);
		aTexturedVertex[3] = new TexturedVertex(aTexturedVertex[3].vector3F,(float) k / textureWidth - 0.0015625F, (float) l / textureHeight - 0.003125F);
		return new TexturedPolygon(Arrays.asList(aTexturedVertex));
	}

	private static final float degreesF = (float)(180D/Math.PI);

	//same as super, but old models have inverse Y rotations and I don't even understand the Z rotation
	public void render(float worldScale, boolean invertYZ) {

		if(!showModel) {
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
			super.render(worldScale);
			GL11.glPopMatrix();
		}
		else if (rotationPointX != 0.0F || rotationPointY != 0.0F || rotationPointZ != 0.0F) {
			GL11.glTranslatef(rotationPointX * worldScale, rotationPointY * worldScale, rotationPointZ * worldScale);
            super.render(worldScale);
			GL11.glTranslatef(-rotationPointX * worldScale, -rotationPointY * worldScale, -rotationPointZ * worldScale);
		}
		else {
            super.render(worldScale);
		}
	}

}
