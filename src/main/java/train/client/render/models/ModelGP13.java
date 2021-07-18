//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.12.2018 - 18:00:18
// Last changed on: 31.12.2018 - 18:00:18

package train.client.render.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGP13 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelGP13() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);

			}
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
			}
			if(m.boxName.equals("cull")){
				GL11.glEnable(GL11.GL_CULL_FACE);
			}
		}
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 77, 2, textureX, textureY); // Box
		bodyModel[1] = new ModelRendererTurbo(this, 3, 7, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 120, 33, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 232, 111, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 232, 111, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 79, 2, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 50, 70, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 68, 66, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 219, 32, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 114, 106, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 116, 52, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 189, 46, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 6, 2, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 128, 6, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 1, 108, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 88, 94, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 88, 94, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 120, 33, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 125, 56, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 125, 56, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 47, 74, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 92, 59, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 23, 61, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 23, 61, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 116, 64, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 212, 47, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 99, 26, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 4, 12, textureX, textureY); // Box 4
		bodyModel[36] = new ModelRendererTurbo(this, 221, 108, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 221, 108, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 81, 51, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 81, 51, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 183, 33, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 219, 32, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 112, 77, textureX, textureY,"cull"); // Box 49 cull
		bodyModel[44] = new ModelRendererTurbo(this, 166, 50, textureX, textureY); // Box 5
		bodyModel[45] = new ModelRendererTurbo(this, 248, 77, textureX, textureY, "lamp"); // Box 50 glow
		bodyModel[46] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 248, 77, textureX, textureY, "lamp"); // Box 53 glow
		bodyModel[49] = new ModelRendererTurbo(this, 242, 83, textureX, textureY, "lamp"); // Box 54 glow
		bodyModel[50] = new ModelRendererTurbo(this, 141, 38, textureX, textureY, "lamp"); // Box 58 glow
		bodyModel[51] = new ModelRendererTurbo(this, 248, 77, textureX, textureY, "lamp"); // Box 59 glow
		bodyModel[52] = new ModelRendererTurbo(this, 166, 50, textureX, textureY); // Box 6
		bodyModel[53] = new ModelRendererTurbo(this, 248, 77, textureX, textureY, "lamp"); // Box 60 glow
		bodyModel[54] = new ModelRendererTurbo(this, 170, 54, textureX, textureY, "lamp"); // Box 63 top bit
		bodyModel[55] = new ModelRendererTurbo(this, 148, 54, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 232, 111, textureX, textureY); // Box 7
		bodyModel[57] = new ModelRendererTurbo(this, 232, 111, textureX, textureY); // Box 8
		bodyModel[58] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Box 9

		bodyModel[0].addBox(0F, 0F, 0F, 7, 3, 14, 0F); // Box
		bodyModel[0].setRotationPoint(11F, 3F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 46, 2, 14, 0F); // Box 0
		bodyModel[1].setRotationPoint(-23F, 8F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 1
		bodyModel[2].setRotationPoint(-26F, 9F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 10
		bodyModel[3].setRotationPoint(27F, 2F, 2F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 11
		bodyModel[4].setRotationPoint(27F, 2F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 12
		bodyModel[5].setRotationPoint(-10F, 7F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 13
		bodyModel[6].setRotationPoint(-10F, 7F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 3, 14, 0F); // Box 14
		bodyModel[7].setRotationPoint(-18F, 3F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 19, 2, 0F); // Box 15
		bodyModel[8].setRotationPoint(-23F, 11F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 16
		bodyModel[9].setRotationPoint(-20F, 11F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 19, 6, 0F); // Box 17
		bodyModel[10].setRotationPoint(-20F, 11F, -6F);
		bodyModel[10].rotateAngleY = 0.54105207F;

		bodyModel[11].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 18
		bodyModel[11].setRotationPoint(-20F, 11F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 19
		bodyModel[12].setRotationPoint(-19F, 29F, -3F);

		bodyModel[13].addBox(0F, 0F, 0F, 46, 9, 12, 0F); // Box 2
		bodyModel[13].setRotationPoint(-23F, 0F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 11, 7, 0F); // Box 20
		bodyModel[14].setRotationPoint(20F, 11F, 6F);
		bodyModel[14].rotateAngleY = 3.68264472F;

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 21
		bodyModel[15].setRotationPoint(14F, 27F, 6F);
		bodyModel[15].rotateAngleY = 3.68264472F;

		bodyModel[16].addBox(0F, 0F, 0F, 7, 11, 4, 0F); // Box 22
		bodyModel[16].setRotationPoint(20F, 11F, -6F);
		bodyModel[16].rotateAngleY = 1.01229097F;

		bodyModel[17].addBox(0F, 0F, 0F, 60, 3, 4, 0F); // Box 23
		bodyModel[17].setRotationPoint(-30F, 6F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 46, 2, 18, 0F); // Box 24
		bodyModel[18].setRotationPoint(-23F, 9F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 46, 9, 10, 0F); // Box 25
		bodyModel[19].setRotationPoint(-23F, 0F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 10, 7, 7, 0F); // Box 26
		bodyModel[20].setRotationPoint(-5F, 2F, -6F);
		bodyModel[20].rotateAngleX = -0.2443461F;

		bodyModel[21].addBox(0F, 0F, 0F, 10, 7, 7, 0F); // Box 27
		bodyModel[21].setRotationPoint(5F, 2F, 7F);
		bodyModel[21].rotateAngleX = -0.2443461F;
		bodyModel[21].rotateAngleY = 3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 6, 11, 1, 0F); // Box 28
		bodyModel[22].setRotationPoint(14F, 11F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 11, 1, 0F); // Box 29
		bodyModel[23].setRotationPoint(14F, 11F, 5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 3
		bodyModel[24].setRotationPoint(23F, 9F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 31, 3, 18, 0F); // Box 30
		bodyModel[25].setRotationPoint(-12F, 11F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 31
		bodyModel[26].setRotationPoint(-14F, 11F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 32
		bodyModel[27].setRotationPoint(19F, 11F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 33
		bodyModel[28].setRotationPoint(2F, 14F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 34
		bodyModel[29].setRotationPoint(13F, 14F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 35
		bodyModel[30].setRotationPoint(3F, 14F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 36
		bodyModel[31].setRotationPoint(3F, 14F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 37
		bodyModel[32].setRotationPoint(14F, 27F, -6F);
		bodyModel[32].rotateAngleY = 1.01229097F;

		bodyModel[33].addBox(0F, 0F, 0F, 7, 11, 14, 0F); // Box 38
		bodyModel[33].setRotationPoint(-6F, 14F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 19, 4, 0F); // Box 39
		bodyModel[34].setRotationPoint(-20F, 11F, 6F);
		bodyModel[34].rotateAngleY = 4.17133691F;

		bodyModel[35].addBox(0F, 0F, 0F, 14, 5, 8, 0F); // Box 4
		bodyModel[35].setRotationPoint(-21F, 3F, -4F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 40
		bodyModel[36].setRotationPoint(26F, 11F, -2F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 41
		bodyModel[37].setRotationPoint(-27F, 11F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 33, 1, 12, 0F); // Box 43
		bodyModel[38].setRotationPoint(-20F, 29F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 44
		bodyModel[39].setRotationPoint(14F, 28F, -9F);
		bodyModel[39].rotateAngleX = -1.13446401F;
		bodyModel[39].rotateAngleY = 3.14159265F;

		bodyModel[40].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 45
		bodyModel[40].setRotationPoint(2F, 28F, 9F);
		bodyModel[40].rotateAngleX = -1.13446401F;

		bodyModel[41].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 46
		bodyModel[41].setRotationPoint(2F, 30F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 48
		bodyModel[42].setRotationPoint(-9F, 29F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 54, 11, 18, 0F); // Box 49 cull
		bodyModel[43].setRotationPoint(-27F, 11F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 9, 18, 0F); // Box 5
		bodyModel[44].setRotationPoint(-27F, 2F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 50 glow
		bodyModel[45].setRotationPoint(-27F, 11F, 4F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 9, 16, 0F); // Box 51
		bodyModel[46].setRotationPoint(23F, 2F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 9, 16, 0F); // Box 52
		bodyModel[47].setRotationPoint(-26F, 2F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 53 glow
		bodyModel[48].setRotationPoint(-27F, 11F, -6F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 54 glow
		bodyModel[49].setRotationPoint(-24F, 25F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 58 glow
		bodyModel[50].setRotationPoint(15F, 27F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 59 glow
		bodyModel[51].setRotationPoint(27F, 11F, 6F);
		bodyModel[51].rotateAngleY = 3.14159265F;

		bodyModel[52].addBox(0F, 0F, 0F, 1, 9, 18, 0F); // Box 6
		bodyModel[52].setRotationPoint(27F, 2F, 9F);
		bodyModel[52].rotateAngleY = 3.14159265F;

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 60 glow
		bodyModel[53].setRotationPoint(27F, 11F, -4F);
		bodyModel[53].rotateAngleY = 3.14159265F;

		bodyModel[54].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 63 top bit
		bodyModel[54].setRotationPoint(12F, 31F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 64
		bodyModel[55].setRotationPoint(14F, 21F, -5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 7
		bodyModel[56].setRotationPoint(-29F, 2F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 8
		bodyModel[57].setRotationPoint(-29F, 2F, 2F);

		bodyModel[58].addBox(0F, 0F, 0F, 14, 5, 8, 0F); // Box 9
		bodyModel[58].setRotationPoint(8F, 3F, -4F);
	}
}