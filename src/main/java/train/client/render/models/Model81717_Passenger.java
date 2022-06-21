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
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class Model81717_Passenger extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Model81717_Passenger() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[66];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 14, 57, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 243, 57, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 261, 147, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 261, 200, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 191, 271, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, -6, 0, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 114, 415, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 114, 415, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 400, 14, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 445, 14, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 400, 14, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 445, 14, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[48] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 199, 301, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 72
		bodyModel[52] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 9, 445, textureX, textureY); // Box 80
		bodyModel[54] = new ModelRendererTurbo(this, 5, 466, textureX, textureY); // Box 81
		bodyModel[55] = new ModelRendererTurbo(this, 5, 466, textureX, textureY); // Box 82
		bodyModel[56] = new ModelRendererTurbo(this, 261, 147, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 261, 200, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 35, 347, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 175, 362, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(0F, 0F, 0F, 111, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 10
		bodyModel[0].setRotationPoint(-38.8F, -22F, -13.35F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 111, 24, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(-38.8F, -22F, 12.55F);

		bodyModel[2].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 11
		bodyModel[2].setRotationPoint(-29F, 2F, -4.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 13
		bodyModel[3].setRotationPoint(-31.5F, 3.5F, -5.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 16
		bodyModel[4].setRotationPoint(-14.5F, 6.5F, -5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 17
		bodyModel[5].setRotationPoint(-28.5F, 6.5F, -5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 18
		bodyModel[6].setRotationPoint(-17.5F, 3.5F, -5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 19
		bodyModel[7].setRotationPoint(-31.5F, 3.5F, 5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 20
		bodyModel[8].setRotationPoint(-17.5F, 3.5F, 5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 21
		bodyModel[9].setRotationPoint(48F, 2F, -4.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 22
		bodyModel[10].setRotationPoint(48.5F, 6.5F, -5.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 23
		bodyModel[11].setRotationPoint(62.5F, 6.5F, -5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 24
		bodyModel[12].setRotationPoint(59.5F, 3.5F, 5.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 25
		bodyModel[13].setRotationPoint(45.5F, 3.5F, 5.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 26
		bodyModel[14].setRotationPoint(45.5F, 3.5F, -5.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 27
		bodyModel[15].setRotationPoint(59.5F, 3.5F, -5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 24, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(72.2F, -22F, -13.15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(72.2F, -22F, 0.35F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 111, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 33
		bodyModel[18].setRotationPoint(-38.9F, 1F, -13F);

		bodyModel[19].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 33
		bodyModel[19].setRotationPoint(62F, -1F, -13F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 34
		bodyModel[20].setRotationPoint(61F, -2F, -13F);

		bodyModel[21].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 35
		bodyModel[21].setRotationPoint(-6F, -2F, -13F);

		bodyModel[22].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 36
		bodyModel[22].setRotationPoint(61F, -2F, -13F);
		bodyModel[22].rotateAngleX = 1.57079633F;

		bodyModel[23].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 37
		bodyModel[23].setRotationPoint(-6F, -2F, -13F);
		bodyModel[23].rotateAngleX = 1.57079633F;

		bodyModel[24].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 38
		bodyModel[24].setRotationPoint(-6.05F, -8F, -13F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 39
		bodyModel[25].setRotationPoint(41.05F, -8F, -13F);

		bodyModel[26].addBox(0F, 0F, 0F, 45, 2, 5, 0F); // Box 40
		bodyModel[26].setRotationPoint(-5F, -1F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 41
		bodyModel[27].setRotationPoint(-6F, -2F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 47, 1, 6, 0F); // Box 42
		bodyModel[28].setRotationPoint(-6F, -2F, 12F);
		bodyModel[28].rotateAngleX = 1.57079633F;

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 43
		bodyModel[29].setRotationPoint(41.05F, -8F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 44
		bodyModel[30].setRotationPoint(-6.05F, -8F, 13F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 45
		bodyModel[31].setRotationPoint(60.95F, -8F, -13F);

		bodyModel[32].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 46
		bodyModel[32].setRotationPoint(62F, -1F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 47
		bodyModel[33].setRotationPoint(61F, -2F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 48
		bodyModel[34].setRotationPoint(61F, -2F, 12F);
		bodyModel[34].rotateAngleX = 1.57079633F;

		bodyModel[35].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 49
		bodyModel[35].setRotationPoint(60.95F, -8F, 13F);
		bodyModel[35].rotateAngleY = -3.14159265F;

		bodyModel[36].addBox(0F, 0F, 0F, 88, 0, 4, 0F); // Box 50
		bodyModel[36].setRotationPoint(-28F, -18F, -7F);
		bodyModel[36].rotateAngleX = 1.6406095F;

		bodyModel[37].addBox(0F, 0F, 0F, 88, 0, 4, 0F); // Box 51
		bodyModel[37].setRotationPoint(-28F, -18F, 7F);
		bodyModel[37].rotateAngleX = 1.50098316F;

		bodyModel[38].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 54
		bodyModel[38].setRotationPoint(-5F, 2F, 1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 55
		bodyModel[39].setRotationPoint(9F, 2F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 16, 5, 9, 0F); // Box 56
		bodyModel[40].setRotationPoint(24F, 2F, 1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(-42F, 2F, -2.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 58
		bodyModel[42].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(75F, 2F, 2.5F);
		bodyModel[43].rotateAngleY = 3.14159265F;

		bodyModel[44].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 60
		bodyModel[44].setRotationPoint(76F, 2.5F, 2F);
		bodyModel[44].rotateAngleY = 3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 67
		bodyModel[45].setRotationPoint(69.2F, -22F, -13.2F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 68
		bodyModel[46].setRotationPoint(69.2F, -22F, 11.4F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 69
		bodyModel[47].setRotationPoint(69.2F, -22F, 11.4F);

		bodyModel[48].addBox(0F, 0F, 0F, 45, 2, 5, 0F); // Box 61
		bodyModel[48].setRotationPoint(-5F, -1F, -13F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 111, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 72
		bodyModel[49].setRotationPoint(-38.9F, -22F, -13F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 105, 2, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-36F, -24F, -13.4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 105, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[51].setRotationPoint(-36F, -24F, 10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[52].setRotationPoint(-36F, -24F, -10.45F);
		bodyModel[52].rotateAngleY = 1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[53].setRotationPoint(69F, -24F, 10.55F);
		bodyModel[53].rotateAngleY = -1.57079633F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 105, 2, 10, 0F,0F, -1.25F, -4F, 0F, -1.25F, -4F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 81
		bodyModel[54].setRotationPoint(-36F, -26F, -10.4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 105, 2, 10, 0F,0F, -1.25F, -4F, 0F, -1.25F, -4F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 82
		bodyModel[55].setRotationPoint(69F, -26F, 10.6F);
		bodyModel[55].rotateAngleY = -3.14159265F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 24, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[56].setRotationPoint(-38.85F, -22F, 13.6F);
		bodyModel[56].rotateAngleY = -3.14159265F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[57].setRotationPoint(-38.85F, -22F, -0.35F);
		bodyModel[57].rotateAngleY = -3.14159265F;

		bodyModel[58].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 84
		bodyModel[58].setRotationPoint(-37.4F, -1F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 85
		bodyModel[59].setRotationPoint(-38.4F, -2F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 86
		bodyModel[60].setRotationPoint(-38.4F, -2F, 12F);
		bodyModel[60].rotateAngleX = 1.57079633F;

		bodyModel[61].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 87
		bodyModel[61].setRotationPoint(-38.4F, -2F, -13F);

		bodyModel[62].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 88
		bodyModel[62].setRotationPoint(-37.4F, -1F, -13F);

		bodyModel[63].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 89
		bodyModel[63].setRotationPoint(-38.4F, -2F, -13F);
		bodyModel[63].rotateAngleX = 1.57079633F;

		bodyModel[64].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 90
		bodyModel[64].setRotationPoint(-27.3F, -8F, -13F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 91
		bodyModel[65].setRotationPoint(-27.3F, -8F, 13F);
		bodyModel[65].rotateAngleY = -3.14159265F;
	}
}