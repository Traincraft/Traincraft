//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:11.06.2018 - 13:28:00
// Last changed on: 11.06.2018 - 13:28:00

package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelPassenger_DB_oriental extends ModelBase
{
	int textureX = 256;
	int textureY = 128;

	public ModelPassenger_DB_oriental()
	{
		passenger_db_orientalModel = new ModelRendererTurbo[84];
		passenger_db_orientalModel[0] = new ModelRendererTurbo(this, 74, 15, textureX, textureY); // Box 0
		passenger_db_orientalModel[1] = new ModelRendererTurbo(this, 232, 0, textureX, textureY); // Box 5
		passenger_db_orientalModel[2] = new ModelRendererTurbo(this, 140, 63, textureX, textureY); // Box 6
		passenger_db_orientalModel[3] = new ModelRendererTurbo(this, 207, 107, textureX, textureY); // Box 8
		passenger_db_orientalModel[4] = new ModelRendererTurbo(this, 201, 10, textureX, textureY); // Box 9
		passenger_db_orientalModel[5] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 10
		passenger_db_orientalModel[6] = new ModelRendererTurbo(this, 222, 92, textureX, textureY); // Box 16
		passenger_db_orientalModel[7] = new ModelRendererTurbo(this, 134, 1, textureX, textureY); // Box 17
		passenger_db_orientalModel[8] = new ModelRendererTurbo(this, 0, 66, textureX, textureY); // Box 18
		passenger_db_orientalModel[9] = new ModelRendererTurbo(this, 5, 12, textureX, textureY); // Box 19
		passenger_db_orientalModel[10] = new ModelRendererTurbo(this, 20, 5, textureX, textureY); // Box 21
		passenger_db_orientalModel[11] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 22
		passenger_db_orientalModel[12] = new ModelRendererTurbo(this, 180, 24, textureX, textureY); // Box 23
		passenger_db_orientalModel[13] = new ModelRendererTurbo(this, 48, 0, textureX, textureY); // Box 25
		passenger_db_orientalModel[14] = new ModelRendererTurbo(this, 109, 2, textureX, textureY); // Box 26
		passenger_db_orientalModel[15] = new ModelRendererTurbo(this, 189, 108, textureX, textureY); // Box 27
		passenger_db_orientalModel[16] = new ModelRendererTurbo(this, 232, 0, textureX, textureY); // Box 28
		passenger_db_orientalModel[17] = new ModelRendererTurbo(this, 176, 72, textureX, textureY); // Box 29
		passenger_db_orientalModel[18] = new ModelRendererTurbo(this, 20, 5, textureX, textureY); // Box 31
		passenger_db_orientalModel[19] = new ModelRendererTurbo(this, 199, 0, textureX, textureY); // Box 32
		passenger_db_orientalModel[20] = new ModelRendererTurbo(this, 5, 12, textureX, textureY); // Box 33
		passenger_db_orientalModel[21] = new ModelRendererTurbo(this, 140, 63, textureX, textureY); // Box 34
		passenger_db_orientalModel[22] = new ModelRendererTurbo(this, 5, 12, textureX, textureY); // Box 36
		passenger_db_orientalModel[23] = new ModelRendererTurbo(this, 5, 12, textureX, textureY); // Box 38
		passenger_db_orientalModel[24] = new ModelRendererTurbo(this, 20, 5, textureX, textureY); // Box 39
		passenger_db_orientalModel[25] = new ModelRendererTurbo(this, 119, 22, textureX, textureY); // Box 40
		passenger_db_orientalModel[26] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 41
		passenger_db_orientalModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		passenger_db_orientalModel[28] = new ModelRendererTurbo(this, 20, 5, textureX, textureY); // Box 43
		passenger_db_orientalModel[29] = new ModelRendererTurbo(this, 176, 1, textureX, textureY); // Box 44
		passenger_db_orientalModel[30] = new ModelRendererTurbo(this, 247, 3, textureX, textureY); // Box 45
		passenger_db_orientalModel[31] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 47
		passenger_db_orientalModel[32] = new ModelRendererTurbo(this, 201, 10, textureX, textureY); // Box 48
		passenger_db_orientalModel[33] = new ModelRendererTurbo(this, 63, 0, textureX, textureY); // Box 49
		passenger_db_orientalModel[34] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 50
		passenger_db_orientalModel[35] = new ModelRendererTurbo(this, 74, 15, textureX, textureY); // Box 51
		passenger_db_orientalModel[36] = new ModelRendererTurbo(this, 218, 24, textureX, textureY); // Box 52
		passenger_db_orientalModel[37] = new ModelRendererTurbo(this, 199, 0, textureX, textureY); // Box 53
		passenger_db_orientalModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		passenger_db_orientalModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		passenger_db_orientalModel[40] = new ModelRendererTurbo(this, 134, 1, textureX, textureY); // Box 58
		passenger_db_orientalModel[41] = new ModelRendererTurbo(this, 109, 2, textureX, textureY); // Box 59
		passenger_db_orientalModel[42] = new ModelRendererTurbo(this, 201, 4, textureX, textureY); // Box 60
		passenger_db_orientalModel[43] = new ModelRendererTurbo(this, 13, 5, textureX, textureY); // Box 61
		passenger_db_orientalModel[44] = new ModelRendererTurbo(this, 247, 3, textureX, textureY); // Box 62
		passenger_db_orientalModel[45] = new ModelRendererTurbo(this, 148, 29, textureX, textureY); // Box 63
		passenger_db_orientalModel[46] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 64
		passenger_db_orientalModel[47] = new ModelRendererTurbo(this, 201, 10, textureX, textureY); // Box 66
		passenger_db_orientalModel[48] = new ModelRendererTurbo(this, 180, 24, textureX, textureY); // Box 67
		passenger_db_orientalModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		passenger_db_orientalModel[50] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 69
		passenger_db_orientalModel[51] = new ModelRendererTurbo(this, 218, 24, textureX, textureY); // Box 70
		passenger_db_orientalModel[52] = new ModelRendererTurbo(this, 148, 29, textureX, textureY); // Box 71
		passenger_db_orientalModel[53] = new ModelRendererTurbo(this, 140, 63, textureX, textureY); // Box 72
		passenger_db_orientalModel[54] = new ModelRendererTurbo(this, 180, 24, textureX, textureY); // Box 73
		passenger_db_orientalModel[55] = new ModelRendererTurbo(this, 201, 4, textureX, textureY); // Box 75
		passenger_db_orientalModel[56] = new ModelRendererTurbo(this, 63, 0, textureX, textureY); // Box 76
		passenger_db_orientalModel[57] = new ModelRendererTurbo(this, 232, 0, textureX, textureY); // Box 77
		passenger_db_orientalModel[58] = new ModelRendererTurbo(this, 247, 3, textureX, textureY); // Box 78
		passenger_db_orientalModel[59] = new ModelRendererTurbo(this, 222, 92, textureX, textureY); // Box 79
		passenger_db_orientalModel[60] = new ModelRendererTurbo(this, 219, 25, textureX, textureY); // Box 80
		passenger_db_orientalModel[61] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 81
		passenger_db_orientalModel[62] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 82
		passenger_db_orientalModel[63] = new ModelRendererTurbo(this, 78, 0, textureX, textureY); // Box 84
		passenger_db_orientalModel[64] = new ModelRendererTurbo(this, 74, 15, textureX, textureY); // Box 88
		passenger_db_orientalModel[65] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 90
		passenger_db_orientalModel[66] = new ModelRendererTurbo(this, 49, 22, textureX, textureY); // Box 92
		passenger_db_orientalModel[67] = new ModelRendererTurbo(this, 108, 108, textureX, textureY); // Box 93
		passenger_db_orientalModel[68] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 94
		passenger_db_orientalModel[69] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 95
		passenger_db_orientalModel[70] = new ModelRendererTurbo(this, 78, 0, textureX, textureY); // Box 96
		passenger_db_orientalModel[71] = new ModelRendererTurbo(this, 119, 22, textureX, textureY); // Box 98
		passenger_db_orientalModel[72] = new ModelRendererTurbo(this, 63, 0, textureX, textureY); // Box 100
		passenger_db_orientalModel[73] = new ModelRendererTurbo(this, 149, 50, textureX, textureY); // Box 100
		passenger_db_orientalModel[74] = new ModelRendererTurbo(this, 201, 4, textureX, textureY); // Box 100
		passenger_db_orientalModel[75] = new ModelRendererTurbo(this, 148, 29, textureX, textureY); // Box 101
		passenger_db_orientalModel[76] = new ModelRendererTurbo(this, 209, 74, textureX, textureY); // Box 104
		passenger_db_orientalModel[77] = new ModelRendererTurbo(this, -1, 107, textureX, textureY); // Box 105
		passenger_db_orientalModel[78] = new ModelRendererTurbo(this, 186, 0, textureX, textureY); // Box 106
		passenger_db_orientalModel[79] = new ModelRendererTurbo(this, 199, 0, textureX, textureY); // Box 107
		passenger_db_orientalModel[80] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 82
		passenger_db_orientalModel[81] = new ModelRendererTurbo(this, 22, 111, textureX, textureY); // Box 82
		passenger_db_orientalModel[82] = new ModelRendererTurbo(this, 15, 111, textureX, textureY); // Box 83
		passenger_db_orientalModel[83] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 85

		passenger_db_orientalModel[0].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 0
		passenger_db_orientalModel[0].setRotationPoint(-14F, 17F, -10F);

		passenger_db_orientalModel[1].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // Box 5
		passenger_db_orientalModel[1].setRotationPoint(7F, 10F, -7F);
		passenger_db_orientalModel[1].rotateAngleY = 5.77703982F;

		passenger_db_orientalModel[2].addBox(0F, 0F, 0F, 1, 7, 15, 0F); // Box 6
		passenger_db_orientalModel[2].setRotationPoint(-4F, 13F, -10F);
		passenger_db_orientalModel[2].rotateAngleZ = 6.10865238F;

		passenger_db_orientalModel[3].addBox(0F, 0F, -1F, 6, 20, 1, 0F); // Box 8
		passenger_db_orientalModel[3].setRotationPoint(-27F, 10F, 1.9F);
		passenger_db_orientalModel[3].rotateAngleY = 0.55850536F;

		passenger_db_orientalModel[4].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 9
		passenger_db_orientalModel[4].setRotationPoint(12.3F, 13.7F, -10F);

		passenger_db_orientalModel[5].addShapeBox(0F, -2F, 0F, 68, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		passenger_db_orientalModel[5].setRotationPoint(-34F, 30F, 8F);
		passenger_db_orientalModel[5].rotateAngleX = -5.55014702F;

		passenger_db_orientalModel[6].addBox(0F, 0F, 0F, 1, 20, 16, 0F); // Box 16
		passenger_db_orientalModel[6].setRotationPoint(34F, 6F, 8F);
		passenger_db_orientalModel[6].rotateAngleY = 3.14159265F;

		passenger_db_orientalModel[7].addShapeBox(0F, 0F, 0F, 8, 5, 22, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 17
		passenger_db_orientalModel[7].setRotationPoint(-26F, 25F, 11F);
		passenger_db_orientalModel[7].rotateAngleY = 3.14159265F;

		passenger_db_orientalModel[8].addBox(0F, 0F, 0F, 52, 2, 20, 0F); // Box 18
		passenger_db_orientalModel[8].setRotationPoint(-26F, 8F, -10F);

		passenger_db_orientalModel[9].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 19
		passenger_db_orientalModel[9].setRotationPoint(34F, 7F, -7F);

		passenger_db_orientalModel[10].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 21
		passenger_db_orientalModel[10].setRotationPoint(27F, 1F, -10F);

		passenger_db_orientalModel[11].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 22
		passenger_db_orientalModel[11].setRotationPoint(-33F, 5F, -9F);

		passenger_db_orientalModel[12].addBox(0F, -2F, 0F, 1, 3, 15, 0F); // Box 23
		passenger_db_orientalModel[12].setRotationPoint(-21F, 22F, -10F);
		passenger_db_orientalModel[12].rotateAngleZ = -6.24827872F;

		passenger_db_orientalModel[13].addBox(-6F, 0F, 0F, 6, 17, 0, 0F); // Box 25
		passenger_db_orientalModel[13].setRotationPoint(-33F, 10F, 8F);
		passenger_db_orientalModel[13].rotateAngleY = 3.14159265F;

		passenger_db_orientalModel[14].addBox(0F, 0F, 0F, 7, 1, 16, 0F); // Box 26
		passenger_db_orientalModel[14].setRotationPoint(-33F, 9F, -8F);

		passenger_db_orientalModel[15].addBox(0F, 0F, -1F, 8, 20, 0, 0F); // Box 27
		passenger_db_orientalModel[15].setRotationPoint(18.1F, 10F, 6F);
		passenger_db_orientalModel[15].rotateAngleY = 6.16101226F;

		passenger_db_orientalModel[16].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // Box 28
		passenger_db_orientalModel[16].setRotationPoint(-9F, 10F, -7F);
		passenger_db_orientalModel[16].rotateAngleY = 5.77703982F;

		passenger_db_orientalModel[17].addBox(0F, 0F, 0F, 1, 19, 15, 0F); // Box 29
		passenger_db_orientalModel[17].setRotationPoint(26F, 8F, -11F);

		passenger_db_orientalModel[18].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 31
		passenger_db_orientalModel[18].setRotationPoint(27F, 1F, 7F);

		passenger_db_orientalModel[19].addBox(0F, 0F, 0F, 1, 20, 15, 0F); // Box 32
		passenger_db_orientalModel[19].setRotationPoint(10F, 10F, -10F);

		passenger_db_orientalModel[20].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 33
		passenger_db_orientalModel[20].setRotationPoint(34F, 7F, 4F);

		passenger_db_orientalModel[21].addBox(0F, 0F, 0F, 1, 7, 15, 0F); // Box 34
		passenger_db_orientalModel[21].setRotationPoint(-20F, 13F, -10F);
		passenger_db_orientalModel[21].rotateAngleZ = 6.10865238F;

		passenger_db_orientalModel[22].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 36
		passenger_db_orientalModel[22].setRotationPoint(-35F, 7F, -7F);

		passenger_db_orientalModel[23].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 38
		passenger_db_orientalModel[23].setRotationPoint(-35F, 7F, 4F);

		passenger_db_orientalModel[24].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 39
		passenger_db_orientalModel[24].setRotationPoint(-34F, 1F, -10F);

		passenger_db_orientalModel[25].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 40
		passenger_db_orientalModel[25].setRotationPoint(-36F, 6F, -2F);

		passenger_db_orientalModel[26].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 41
		passenger_db_orientalModel[26].setRotationPoint(-33F, 5F, 7F);

		passenger_db_orientalModel[27].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 42
		passenger_db_orientalModel[27].setRotationPoint(32F, 1F, 8F);
		passenger_db_orientalModel[27].rotateAngleX = -6.12610567F;
		passenger_db_orientalModel[27].rotateAngleY = 3.14159265F;

		passenger_db_orientalModel[28].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 43
		passenger_db_orientalModel[28].setRotationPoint(-34F, 1F, 7F);

		passenger_db_orientalModel[29].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 44
		passenger_db_orientalModel[29].setRotationPoint(-26F, 8F, 11F);
		passenger_db_orientalModel[29].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[30].addBox(0F, 0F, 0F, 1, 17, 3, 0F); // Box 45
		passenger_db_orientalModel[30].setRotationPoint(-9F, 10F, -10F);

		passenger_db_orientalModel[31].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 47
		passenger_db_orientalModel[31].setRotationPoint(27F, 5F, -9F);

		passenger_db_orientalModel[32].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 48
		passenger_db_orientalModel[32].setRotationPoint(-19.7F, 13.7F, -10F);

		passenger_db_orientalModel[33].addBox(-6F, 0F, 0F, 6, 17, 0, 0F); // Box 49
		passenger_db_orientalModel[33].setRotationPoint(33F, 10F, 8F);

		passenger_db_orientalModel[34].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 50
		passenger_db_orientalModel[34].setRotationPoint(27F, 5F, 7F);

		passenger_db_orientalModel[35].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 51
		passenger_db_orientalModel[35].setRotationPoint(2F, 17F, -10F);

		passenger_db_orientalModel[36].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 52
		passenger_db_orientalModel[36].setRotationPoint(-10F, 27F, -10F);

		passenger_db_orientalModel[37].addBox(0F, 0F, 0F, 1, 20, 15, 0F); // Box 53
		passenger_db_orientalModel[37].setRotationPoint(-6F, 10F, -10F);

		passenger_db_orientalModel[38].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 55
		passenger_db_orientalModel[38].setRotationPoint(-32F, 1F, -8F);
		passenger_db_orientalModel[38].rotateAngleX = -6.12610567F;

		passenger_db_orientalModel[39].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 56
		passenger_db_orientalModel[39].setRotationPoint(-28F, 1F, 8F);
		passenger_db_orientalModel[39].rotateAngleX = -6.12610567F;
		passenger_db_orientalModel[39].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[40].addShapeBox(0F, 0F, 0F, 8, 5, 22, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 58
		passenger_db_orientalModel[40].setRotationPoint(26F, 25F, -11F);

		passenger_db_orientalModel[41].addBox(0F, 0F, 0F, 7, 1, 16, 0F); // Box 59
		passenger_db_orientalModel[41].setRotationPoint(26F, 9F, -8F);

		passenger_db_orientalModel[42].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 60
		passenger_db_orientalModel[42].setRotationPoint(-14.7F, 13.7F, 5F);
		passenger_db_orientalModel[42].rotateAngleY = 3.14159265F;

		passenger_db_orientalModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 61
		passenger_db_orientalModel[43].setRotationPoint(26F, 8F, 7F);

		passenger_db_orientalModel[44].addBox(0F, 0F, 0F, 1, 17, 3, 0F); // Box 62
		passenger_db_orientalModel[44].setRotationPoint(7F, 10F, -10F);

		passenger_db_orientalModel[45].addBox(0F, 0F, 0F, 6, 2, 15, 0F); // Box 63
		passenger_db_orientalModel[45].setRotationPoint(-4F, 14F, 5F);
		passenger_db_orientalModel[45].rotateAngleX = 3.14159265F;
		passenger_db_orientalModel[45].rotateAngleZ = -6.23082543F;

		passenger_db_orientalModel[46].addShapeBox(0F, -2F, 0F, 68, 2, 6, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 64
		passenger_db_orientalModel[46].setRotationPoint(34F, 31F, 3F);
		passenger_db_orientalModel[46].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[47].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 66
		passenger_db_orientalModel[47].setRotationPoint(-3.7F, 13.7F, -10F);

		passenger_db_orientalModel[48].addBox(0F, -2F, 0F, 1, 3, 15, 0F); // Box 67
		passenger_db_orientalModel[48].setRotationPoint(-5F, 22F, -10F);
		passenger_db_orientalModel[48].rotateAngleZ = -6.24827872F;

		passenger_db_orientalModel[49].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 68
		passenger_db_orientalModel[49].setRotationPoint(28F, 1F, -8F);
		passenger_db_orientalModel[49].rotateAngleX = -6.12610567F;

		passenger_db_orientalModel[50].addShapeBox(0F, -2F, 0F, 68, 2, 5, 0F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 69
		passenger_db_orientalModel[50].setRotationPoint(-34F, 31F, 3F);
		passenger_db_orientalModel[50].rotateAngleX = -6.09119909F;

		passenger_db_orientalModel[51].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 70
		passenger_db_orientalModel[51].setRotationPoint(6F, 27F, -10F);

		passenger_db_orientalModel[52].addBox(0F, 0F, 0F, 6, 2, 15, 0F); // Box 71
		passenger_db_orientalModel[52].setRotationPoint(12F, 14F, 5F);
		passenger_db_orientalModel[52].rotateAngleX = 3.14159265F;
		passenger_db_orientalModel[52].rotateAngleZ = -6.23082543F;

		passenger_db_orientalModel[53].addBox(0F, 0F, 0F, 1, 7, 15, 0F); // Box 72
		passenger_db_orientalModel[53].setRotationPoint(12F, 13F, -10F);
		passenger_db_orientalModel[53].rotateAngleZ = 6.10865238F;

		passenger_db_orientalModel[54].addBox(0F, -2F, 0F, 1, 3, 15, 0F); // Box 73
		passenger_db_orientalModel[54].setRotationPoint(11F, 22F, -10F);
		passenger_db_orientalModel[54].rotateAngleZ = -6.24827872F;

		passenger_db_orientalModel[55].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 75
		passenger_db_orientalModel[55].setRotationPoint(17.3F, 13.7F, 5F);
		passenger_db_orientalModel[55].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[56].addBox(-6F, 0F, 0F, 6, 17, 0, 0F); // Box 76
		passenger_db_orientalModel[56].setRotationPoint(-33F, 10F, -8F);
		passenger_db_orientalModel[56].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[57].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // Box 77
		passenger_db_orientalModel[57].setRotationPoint(23F, 10F, -7F);
		passenger_db_orientalModel[57].rotateAngleY = 5.77703982F;

		passenger_db_orientalModel[58].addBox(0F, 0F, 0F, 1, 17, 3, 0F); // Box 78
		passenger_db_orientalModel[58].setRotationPoint(23F, 10F, -10F);

		passenger_db_orientalModel[59].addBox(0F, 0F, 0F, 1, 20, 16, 0F); // Box 79
		passenger_db_orientalModel[59].setRotationPoint(-34F, 6F, -8F);

		passenger_db_orientalModel[60].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 80
		passenger_db_orientalModel[60].setRotationPoint(22F, 27F, -10F);

		passenger_db_orientalModel[61].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 81
		passenger_db_orientalModel[61].setRotationPoint(-35F, 11F, -5F);

		passenger_db_orientalModel[62].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 82
		passenger_db_orientalModel[62].setRotationPoint(-35F, 11F, 3F);

		passenger_db_orientalModel[63].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 84
		passenger_db_orientalModel[63].setRotationPoint(-35F, 26F, -6F);

		passenger_db_orientalModel[64].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 88
		passenger_db_orientalModel[64].setRotationPoint(18F, 17F, -10F);

		passenger_db_orientalModel[65].addBox(0F, 0F, 0F, 66, 3, 14, 0F); // Box 90
		passenger_db_orientalModel[65].setRotationPoint(-33F, 6F, -7F);

		passenger_db_orientalModel[66].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 92
		passenger_db_orientalModel[66].setRotationPoint(-2F, 2F, -4F);

		passenger_db_orientalModel[67].addBox(0F, 0F, -1F, 39, 20, 0, 0F); // Box 93
		passenger_db_orientalModel[67].setRotationPoint(-21F, 10F, 6F);

		passenger_db_orientalModel[68].addBox(-1F, 0F, 0F, 1, 15, 2, 0F); // Box 94
		passenger_db_orientalModel[68].setRotationPoint(35F, 11F, 3F);

		passenger_db_orientalModel[69].addBox(-1F, 0F, 0F, 1, 15, 2, 0F); // Box 95
		passenger_db_orientalModel[69].setRotationPoint(35F, 11F, -5F);

		passenger_db_orientalModel[70].addBox(-1F, 0F, 0F, 1, 2, 12, 0F); // Box 96
		passenger_db_orientalModel[70].setRotationPoint(35F, 26F, -6F);

		passenger_db_orientalModel[71].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 98
		passenger_db_orientalModel[71].setRotationPoint(34F, 6F, -2F);

		passenger_db_orientalModel[72].addBox(0F, 0F, 0F, 6, 17, 0, 0F); // Box 100
		passenger_db_orientalModel[72].setRotationPoint(33F, 10F, -8F);
		passenger_db_orientalModel[72].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[73].addBox(0F, 0F, 0F, 52, 19, 1, 0F); // Box 100
		passenger_db_orientalModel[73].setRotationPoint(-26F, 8F, 10F);

		passenger_db_orientalModel[74].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 100
		passenger_db_orientalModel[74].setRotationPoint(1.3F, 13.7F, 5F);
		passenger_db_orientalModel[74].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[75].addBox(0F, 0F, 0F, 6, 2, 15, 0F); // Box 101
		passenger_db_orientalModel[75].setRotationPoint(-20F, 14F, 5F);
		passenger_db_orientalModel[75].rotateAngleX = 3.14159265F;
		passenger_db_orientalModel[75].rotateAngleZ = -6.23082543F;

		passenger_db_orientalModel[76].addBox(0F, 0F, 0F, 1, 19, 13, 0F); // Box 104
		passenger_db_orientalModel[76].setRotationPoint(-27F, 8F, -11F);
		passenger_db_orientalModel[76].rotateAngleY = -0.01745329F;

		passenger_db_orientalModel[77].addBox(0F, 0F, 0F, 52, 19, 1, 0F); // Box 105
		passenger_db_orientalModel[77].setRotationPoint(-26F, 8F, -11F);

		passenger_db_orientalModel[78].addBox(0F, 0F, 0F, 1, 19, 4, 0F); // Box 106
		passenger_db_orientalModel[78].setRotationPoint(26F, 8F, 7F);

		passenger_db_orientalModel[79].addBox(0F, 0F, 0F, 1, 20, 15, 0F); // Box 107
		passenger_db_orientalModel[79].setRotationPoint(-22F, 10F, -10F);

		passenger_db_orientalModel[80].addShapeBox(0F, -2F, 0F, 68, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		passenger_db_orientalModel[80].setRotationPoint(34F, 30F, -8F);
		passenger_db_orientalModel[80].rotateAngleX = -5.55014702F;
		passenger_db_orientalModel[80].rotateAngleY = -3.14159265F;

		passenger_db_orientalModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 82
		passenger_db_orientalModel[81].setRotationPoint(-3F, 12F, -11.1F);

		passenger_db_orientalModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		passenger_db_orientalModel[82].setRotationPoint(-3F, 12F, 10.1F);

		passenger_db_orientalModel[83].addShapeBox(0F, -2F, 0F, 68, 2, 5, 0F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 85
		passenger_db_orientalModel[83].setRotationPoint(34F, 31F, -3F);
		passenger_db_orientalModel[83].rotateAngleX = -6.09119909F;
		passenger_db_orientalModel[83].rotateAngleY = -3.14159265F;

		fixRotation(passenger_db_orientalModel, false, true, true);

	}

	ModelPassenger_DB_oriental_bogie bogie = new ModelPassenger_DB_oriental_bogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 84; i++)
		{
			passenger_db_orientalModel[i].render(f5);
		}
        GL11.glPushMatrix();
        GL11.glTranslated(0,0.0,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(2.15,0,0);
        bogie.render(entity, f, f1, f2, f3, f4, f5);
        GL11.glPopMatrix();

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo passenger_db_orientalModel[];
}