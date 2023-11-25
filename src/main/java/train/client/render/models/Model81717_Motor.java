//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.07.2021 - 18:52:32
// Last changed on: 29.07.2021 - 18:52:32

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import train.common.library.Info;

public class Model81717_Motor extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model81717_Motor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[82];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (ModelRendererTurbo mrt : bodyModel) {
			if (mrt.boxName.equals("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(f5);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/81-717_motor.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.35,0.1,0.06);

		GL11.glTranslated(3,0,0);
		GL11.glPopMatrix();
	}
	
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 46, 7, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 216, 16, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 216, 16, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 8, 57, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 244, 57, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 261, 147, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 261, 200, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 191, 271, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 300, 147, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, -6, 0, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 114, 415, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 114, 415, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 59, 300, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 400, 14, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 445, 14, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 400, 14, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 445, 14, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 61 Lamp
		bodyModel[53] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 62 Lamp
		bodyModel[54] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 63 Lamp
		bodyModel[55] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 64 Lamp
		bodyModel[56] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 65 Lamp
		bodyModel[57] = new ModelRendererTurbo(this, 445, 400, textureX, textureY, "lamp"); // Box 66 Lamp
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 339, 339, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 353, 339, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 339, 339, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 346, 368, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 191, 301, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 5, 466, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 5, 466, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 300, 256, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 314, 256, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 314, 256, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 300, 256, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 314, 256, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-47.9F, -22F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 17, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-47.9F, -22F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 6, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-50F, -5F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-50F, -5F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 117, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 10
		bodyModel[4].setRotationPoint(-44.8F, -22F, -13.35F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 117, 24, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-44.8F, -22F, 12.55F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 11
		bodyModel[6].setRotationPoint(-36F, 2F, -4.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 13
		bodyModel[7].setRotationPoint(-38.5F, 3.5F, -5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 16
		bodyModel[8].setRotationPoint(-21.5F, 6.5F, -5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 17
		bodyModel[9].setRotationPoint(-35.5F, 6.5F, -5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 18
		bodyModel[10].setRotationPoint(-24.5F, 3.5F, -5.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 19
		bodyModel[11].setRotationPoint(-38.5F, 3.5F, 5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 20
		bodyModel[12].setRotationPoint(-24.5F, 3.5F, 5.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 21
		bodyModel[13].setRotationPoint(48F, 2F, -4.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 22
		bodyModel[14].setRotationPoint(48.5F, 6.5F, -5.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 23
		bodyModel[15].setRotationPoint(62.5F, 6.5F, -5.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 24
		bodyModel[16].setRotationPoint(59.5F, 3.5F, 5.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 25
		bodyModel[17].setRotationPoint(45.5F, 3.5F, 5.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 26
		bodyModel[18].setRotationPoint(45.5F, 3.5F, -5.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 27
		bodyModel[19].setRotationPoint(59.5F, 3.5F, -5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 24, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(72.2F, -22F, -13.15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(72.2F, -22F, 0.35F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 118, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 33
		bodyModel[22].setRotationPoint(-46F, 1F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[23].setRotationPoint(-29.8F, -22F, 0.35F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 24, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(-29.8F, -22F, -13.15F);

		bodyModel[25].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 33
		bodyModel[25].setRotationPoint(62F, -1F, -13F);

		bodyModel[26].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 34
		bodyModel[26].setRotationPoint(61F, -2F, -13F);

		bodyModel[27].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 35
		bodyModel[27].setRotationPoint(-6F, -2F, -13F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 36
		bodyModel[28].setRotationPoint(61F, -2F, -13F);
		bodyModel[28].rotateAngleX = 1.57079633F;

		bodyModel[29].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 37
		bodyModel[29].setRotationPoint(-6F, -2F, -13F);
		bodyModel[29].rotateAngleX = 1.57079633F;

		bodyModel[30].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 38
		bodyModel[30].setRotationPoint(-6.05F, -8F, -13F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 39
		bodyModel[31].setRotationPoint(41.05F, -8F, -13F);

		bodyModel[32].addBox(0F, 0F, 0F, 45, 2, 5, 0F); // Box 40
		bodyModel[32].setRotationPoint(-5F, -1F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 41
		bodyModel[33].setRotationPoint(-6F, -2F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 42
		bodyModel[34].setRotationPoint(-6F, -2F, 12F);
		bodyModel[34].rotateAngleX = 1.57079633F;

		bodyModel[35].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 43
		bodyModel[35].setRotationPoint(41.05F, -8F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 44
		bodyModel[36].setRotationPoint(-6.05F, -8F, 13F);
		bodyModel[36].rotateAngleY = -3.14159265F;

		bodyModel[37].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 45
		bodyModel[37].setRotationPoint(60.95F, -8F, -13F);

		bodyModel[38].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 46
		bodyModel[38].setRotationPoint(62F, -1F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 47
		bodyModel[39].setRotationPoint(61F, -2F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 48
		bodyModel[40].setRotationPoint(61F, -2F, 12F);
		bodyModel[40].rotateAngleX = 1.57079633F;

		bodyModel[41].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 49
		bodyModel[41].setRotationPoint(60.95F, -8F, 13F);
		bodyModel[41].rotateAngleY = -3.14159265F;

		bodyModel[42].addBox(0F, 0F, 0F, 88, 0, 4, 0F); // Box 50
		bodyModel[42].setRotationPoint(-28F, -18F, -7F);
		bodyModel[42].rotateAngleX = 1.6406095F;

		bodyModel[43].addBox(0F, 0F, 0F, 88, 0, 4, 0F); // Box 51
		bodyModel[43].setRotationPoint(-28F, -18F, 7F);
		bodyModel[43].rotateAngleX = 1.50098316F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 10, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		bodyModel[44].setRotationPoint(-47F, -9F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 54
		bodyModel[45].setRotationPoint(-12F, 2F, -0.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 55
		bodyModel[46].setRotationPoint(9F, 2F, -7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 56
		bodyModel[47].setRotationPoint(24F, 2F, 1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(-52F, 2F, -2.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 58
		bodyModel[49].setRotationPoint(-53F, 2.5F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[50].setRotationPoint(75F, 2F, 2.5F);
		bodyModel[50].rotateAngleY = 3.14159265F;

		bodyModel[51].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 60
		bodyModel[51].setRotationPoint(76F, 2.5F, 2F);
		bodyModel[51].rotateAngleY = 3.14159265F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 61 Lamp
		bodyModel[52].setRotationPoint(-48.5F, -8.5F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 62 Lamp
		bodyModel[53].setRotationPoint(-48.5F, -8.5F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 63 Lamp
		bodyModel[54].setRotationPoint(-48.5F, -8.5F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 64 Lamp
		bodyModel[55].setRotationPoint(-48.5F, -8.5F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 65 Lamp
		bodyModel[56].setRotationPoint(-48F, -8.5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 66 Lamp
		bodyModel[57].setRotationPoint(-48F, -8.5F, 6F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 67
		bodyModel[58].setRotationPoint(69.2F, -22F, -13.2F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 68
		bodyModel[59].setRotationPoint(69.2F, -22F, 11.4F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 69
		bodyModel[60].setRotationPoint(69.2F, -22F, 11.4F);

		bodyModel[61].addBox(0F, 0F, 0F, 45, 2, 5, 0F); // Box 61
		bodyModel[61].setRotationPoint(-5F, -1F, -13F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.85F, -1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.85F); // Box 62
		bodyModel[62].setRotationPoint(-47F, -22F, -13.2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, -1F, -1F, 0F, -1.2F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, -1F, -1F, 0F, -1.2F); // Box 63
		bodyModel[63].setRotationPoint(-47F, -22F, 11.6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.85F, -1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, -0.85F); // Box 65
		bodyModel[64].setRotationPoint(-47F, 2F, -13.2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, -1F, -1F, 0F, -1.2F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, -1F, -1F, 0F, -1.2F); // Box 66
		bodyModel[65].setRotationPoint(-47F, 1F, 11.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 67
		bodyModel[66].setRotationPoint(-47F, 1F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[67].setRotationPoint(-47F, 1F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[68].setRotationPoint(-38F, 1F, -13.3F);
		bodyModel[68].rotateAngleY = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[69].setRotationPoint(-45F, 1F, 13.5F);
		bodyModel[69].rotateAngleY = -1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 118, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 72
		bodyModel[70].setRotationPoint(-46F, -22F, -13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 113, 2, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(-44F, -24F, -13.4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 113, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-44F, -24F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-44F, -24F, -10.45F);
		bodyModel[73].rotateAngleY = 1.57079633F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[74].setRotationPoint(69F, -24F, 10.55F);
		bodyModel[74].rotateAngleY = -1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 113, 2, 10, 0F,0F, -1.25F, -4F, 0F, -1.25F, -4F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 81
		bodyModel[75].setRotationPoint(-44F, -26F, -10.4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 113, 2, 10, 0F,0F, -1.25F, -4F, 0F, -1.25F, -4F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 82
		bodyModel[76].setRotationPoint(69F, -26F, 10.6F);
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 84
		bodyModel[77].setRotationPoint(-49F, -13F, -14F);
		bodyModel[77].rotateAngleY = -1.04719755F;

		bodyModel[78].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 85
		bodyModel[78].setRotationPoint(-49.5F, -15.7F, -13F);
		bodyModel[78].rotateAngleY = -2.70526034F;

		bodyModel[79].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 86
		bodyModel[79].setRotationPoint(-49.5F, -15.7F, -13F);
		bodyModel[79].rotateAngleY = -2.70526034F;

		bodyModel[80].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 87
		bodyModel[80].setRotationPoint(-46F, -13F, 12F);
		bodyModel[80].rotateAngleY = 1.04719755F;

		bodyModel[81].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 88
		bodyModel[81].setRotationPoint(-49.3F, -15.7F, 14.5F);
		bodyModel[81].rotateAngleY = 2.70526034F;
	}
}