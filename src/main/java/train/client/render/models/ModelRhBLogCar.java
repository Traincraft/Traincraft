//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RhB Woodwagon
// Model Creator:
// Created on:01.12.2017 - 21:02:10
// Last changed on: 01.12.2017 - 21:02:10

package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.Coord2D;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;

public class ModelRhBLogCar extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelRhBLogCar()
	{
		rhblogcarModel = new ModelRendererTurbo[62];
		rhblogcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rhblogcarModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		rhblogcarModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Log 1
		rhblogcarModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		rhblogcarModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		rhblogcarModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		rhblogcarModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		rhblogcarModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		rhblogcarModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
		rhblogcarModel[9] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 11
		rhblogcarModel[10] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 12
		rhblogcarModel[11] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 13
		rhblogcarModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		rhblogcarModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		rhblogcarModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		rhblogcarModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		rhblogcarModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		rhblogcarModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		rhblogcarModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		rhblogcarModel[19] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 21
		rhblogcarModel[20] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 22
		rhblogcarModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 23
		rhblogcarModel[22] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 24
		rhblogcarModel[23] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 25
		rhblogcarModel[24] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 26
		rhblogcarModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
		rhblogcarModel[26] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 28
		rhblogcarModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		rhblogcarModel[28] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 30
		rhblogcarModel[29] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 31
		rhblogcarModel[30] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 32
		rhblogcarModel[31] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 33
		rhblogcarModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34
		rhblogcarModel[33] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 35
		rhblogcarModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 43
		rhblogcarModel[35] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 44
		rhblogcarModel[36] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 45
		rhblogcarModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		rhblogcarModel[38] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Shape 47
		rhblogcarModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Shape 48
		rhblogcarModel[40] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Shape 49
		rhblogcarModel[41] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Shape 50
		rhblogcarModel[42] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Log 2
		rhblogcarModel[43] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Log 4
		rhblogcarModel[44] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Log 3
		rhblogcarModel[45] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Log 5
		rhblogcarModel[46] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Log 7
		rhblogcarModel[47] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Log 8
		rhblogcarModel[48] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Log 13
		rhblogcarModel[49] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Log 6
		rhblogcarModel[50] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Log 9
		rhblogcarModel[51] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Log 10
		rhblogcarModel[52] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Log 12
		rhblogcarModel[53] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Log 11
		rhblogcarModel[54] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Log 15
		rhblogcarModel[55] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Log 16
		rhblogcarModel[56] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Log 14
		rhblogcarModel[57] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Log 17
		rhblogcarModel[58] = new ModelRendererTurbo(this, 24, 185, textureX, textureY); // Shape 67
		rhblogcarModel[59] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Shape 69
		rhblogcarModel[60] = new ModelRendererTurbo(this, 24, 173, textureX, textureY); // Shape 70
		rhblogcarModel[61] = new ModelRendererTurbo(this, 1, 173, textureX, textureY); // Shape 71

		rhblogcarModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 0
		rhblogcarModel[0].setRotationPoint(3F, 6.5F, 6F);

		rhblogcarModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 1
		rhblogcarModel[1].setRotationPoint(3F, 6.5F, -6F);

		rhblogcarModel[2].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 1
		rhblogcarModel[2].setRotationPoint(-1F, -3.7F, 5F);
		rhblogcarModel[2].rotateAngleX = -0.17453293F;

		rhblogcarModel[3].addBox(0F, 0F, 0F, 54, 1, 19, 0F); // Box 3
		rhblogcarModel[3].setRotationPoint(-7F, 2F, -9.5F);

		rhblogcarModel[4].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 4
		rhblogcarModel[4].setRotationPoint(37F, 6.5F, -6F);

		rhblogcarModel[5].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 5
		rhblogcarModel[5].setRotationPoint(37F, 6.5F, 6F);

		rhblogcarModel[6].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 6
		rhblogcarModel[6].setRotationPoint(-7F, 3F, -9.5F);

		rhblogcarModel[7].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 8
		rhblogcarModel[7].setRotationPoint(36.5F, 6F, -7F);

		rhblogcarModel[8].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 9
		rhblogcarModel[8].setRotationPoint(2.5F, 6F, -7F);

		rhblogcarModel[9].addBox(0F, 0F, 0F, 1, 5, 19, 0F); // Box 11
		rhblogcarModel[9].setRotationPoint(-6F, -3F, -9.5F);

		rhblogcarModel[10].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 12
		rhblogcarModel[10].setRotationPoint(46F, 3F, -9.5F);

		rhblogcarModel[11].addBox(0F, 0F, 0F, 1, 5, 19, 0F); // Box 13
		rhblogcarModel[11].setRotationPoint(42.5F, -3F, -9.5F);

		rhblogcarModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 14
		rhblogcarModel[12].setRotationPoint(43.5F, -3F, -5.5F);

		rhblogcarModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 15
		rhblogcarModel[13].setRotationPoint(43.5F, -3F, 4.5F);

		rhblogcarModel[14].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 16
		rhblogcarModel[14].setRotationPoint(-7F, -3F, 4.5F);

		rhblogcarModel[15].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 17
		rhblogcarModel[15].setRotationPoint(-7F, -3F, -5.5F);

		rhblogcarModel[16].addBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F); // Box 18
		rhblogcarModel[16].setRotationPoint(46F, 2.5F, -10.5F);

		rhblogcarModel[17].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 19
		rhblogcarModel[17].setRotationPoint(-10F, 4F, -2F);

		rhblogcarModel[18].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 20
		rhblogcarModel[18].setRotationPoint(47F, 4F, -2F);

		rhblogcarModel[19].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 21
		rhblogcarModel[19].setRotationPoint(-5F, 3F, -9F);

		rhblogcarModel[20].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 22
		rhblogcarModel[20].setRotationPoint(36F, 3F, 8F);

		rhblogcarModel[21].addBox(0F, 0F, 0F, 11, 3, 3, 0F); // Box 23
		rhblogcarModel[21].setRotationPoint(9F, 3F, -4F);

		rhblogcarModel[22].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 24
		rhblogcarModel[22].setRotationPoint(19F, 4F, -3F);
		rhblogcarModel[22].rotateAngleZ = 0.15009832F;

		rhblogcarModel[23].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 25
		rhblogcarModel[23].setRotationPoint(0.5F, 1F, -4F);

		rhblogcarModel[24].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 26
		rhblogcarModel[24].setRotationPoint(34.5F, 1F, -4F);

		rhblogcarModel[25].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 27
		rhblogcarModel[25].setRotationPoint(36.5F, 1F, 4F);

		rhblogcarModel[26].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 28
		rhblogcarModel[26].setRotationPoint(2.5F, 1F, 4F);

		rhblogcarModel[27].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 29
		rhblogcarModel[27].setRotationPoint(2.5F, 1F, -10F);

		rhblogcarModel[28].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 30
		rhblogcarModel[28].setRotationPoint(36.5F, 1F, -10F);

		rhblogcarModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 31
		rhblogcarModel[29].setRotationPoint(45.7F, -5F, -9.5F);

		rhblogcarModel[30].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 32
		rhblogcarModel[30].setRotationPoint(36.5F, -11F, -10F);

		rhblogcarModel[31].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 33
		rhblogcarModel[31].setRotationPoint(36.5F, -11F, 9F);

		rhblogcarModel[32].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 34
		rhblogcarModel[32].setRotationPoint(2.5F, -11F, 9F);

		rhblogcarModel[33].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 35
		rhblogcarModel[33].setRotationPoint(2.5F, -11F, -10F);

		rhblogcarModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 43
		rhblogcarModel[34].setRotationPoint(45.7F, -5F, 9F);

		rhblogcarModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 44
		rhblogcarModel[35].setRotationPoint(45.7F, -5F, 3F);

		rhblogcarModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 45
		rhblogcarModel[36].setRotationPoint(45.7F, -5F, -3.5F);

		rhblogcarModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
		rhblogcarModel[37].setRotationPoint(45.7F, -6F, -9.5F);

		rhblogcarModel[38].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 5, 7, 5) }), 1, 7, 5, 22, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3 ,6}); // Shape 47
		rhblogcarModel[38].setRotationPoint(6.5F, 8F, 7.5F);

		rhblogcarModel[39].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 5, 7, 5) }), 1, 7, 5, 22, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3 ,6}); // Shape 48
		rhblogcarModel[39].setRotationPoint(6.5F, 8F, -6.5F);

		rhblogcarModel[40].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 5, 7, 5) }), 1, 7, 5, 22, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3 ,6}); // Shape 49
		rhblogcarModel[40].setRotationPoint(40.5F, 8F, -6.5F);

		rhblogcarModel[41].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 5, 7, 5) }), 1, 7, 5, 22, 1, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3 ,6}); // Shape 50
		rhblogcarModel[41].setRotationPoint(40.5F, 8F, 7.5F);

		rhblogcarModel[42].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 2
		rhblogcarModel[42].setRotationPoint(-2F, -2.7F, 0F);
		rhblogcarModel[42].rotateAngleX = 0.40142573F;

		rhblogcarModel[43].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 4
		rhblogcarModel[43].setRotationPoint(0F, -2.7F, -9F);
		rhblogcarModel[43].rotateAngleX = 0.40142573F;

		rhblogcarModel[44].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 3
		rhblogcarModel[44].setRotationPoint(-1F, -4.3F, -3.5F);
		rhblogcarModel[44].rotateAngleX = -0.34906585F;

		rhblogcarModel[45].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 5
		rhblogcarModel[45].setRotationPoint(-3F, -7F, -2.5F);
		rhblogcarModel[45].rotateAngleX = 0.13962634F;

		rhblogcarModel[46].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 7
		rhblogcarModel[46].setRotationPoint(-1F, -8F, -7.5F);
		rhblogcarModel[46].rotateAngleX = -0.20943951F;

		rhblogcarModel[47].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 8
		rhblogcarModel[47].setRotationPoint(-2F, -11.7F, -5F);
		rhblogcarModel[47].rotateAngleX = -0.17453293F;

		rhblogcarModel[48].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 13
		rhblogcarModel[48].setRotationPoint(0F, -13.7F, -9F);
		rhblogcarModel[48].rotateAngleX = 0.43633231F;

		rhblogcarModel[49].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 6
		rhblogcarModel[49].setRotationPoint(0F, -8.7F, 4F);
		rhblogcarModel[49].rotateAngleX = -0.61086524F;

		rhblogcarModel[50].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 9
		rhblogcarModel[50].setRotationPoint(-1F, -10.5F, -1F);
		rhblogcarModel[50].rotateAngleX = 0.54105207F;

		rhblogcarModel[51].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 10
		rhblogcarModel[51].setRotationPoint(-2F, -11.5F, 4F);
		rhblogcarModel[51].rotateAngleX = 0.31415927F;

		rhblogcarModel[52].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 12
		rhblogcarModel[52].setRotationPoint(0F, -15.5F, -3F);
		rhblogcarModel[52].rotateAngleX = -0.01745329F;

		rhblogcarModel[53].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 11
		rhblogcarModel[53].setRotationPoint(-3F, -16.5F, 4F);
		rhblogcarModel[53].rotateAngleX = -0.62831853F;

		rhblogcarModel[54].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 15
		rhblogcarModel[54].setRotationPoint(-2F, -15.75F, 5F);
		rhblogcarModel[54].rotateAngleX = 1.72787596F;

		rhblogcarModel[55].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 16
		rhblogcarModel[55].setRotationPoint(-1F, -16.5F, -9F);
		rhblogcarModel[55].rotateAngleX = 1.23918377F;

		rhblogcarModel[56].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 14
		rhblogcarModel[56].setRotationPoint(-1F, -16.5F, -1F);
		rhblogcarModel[56].rotateAngleX = 0.83775804F;

		rhblogcarModel[57].addBox(0F, 0F, 0F, 42, 4, 4, 0F); // Log 17
		rhblogcarModel[57].setRotationPoint(-2F, -20.5F, -4.5F);
		rhblogcarModel[57].rotateAngleX = 0.2443461F;

		rhblogcarModel[58].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 9, 0, 9), new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0) }), 1, 1, 9, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9}); // Shape 67
		rhblogcarModel[58].setRotationPoint(3.5F, -11F, 9F);
		rhblogcarModel[58].rotateAngleY = -1.57079633F;

		rhblogcarModel[59].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 9, 0, 9), new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0) }), 1, 1, 9, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9}); // Shape 69
		rhblogcarModel[59].setRotationPoint(37.5F, -11F, 9F);
		rhblogcarModel[59].rotateAngleY = -1.57079633F;

		rhblogcarModel[60].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 9, 0, 9), new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0) }), 1, 1, 9, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9}); // Shape 70
		rhblogcarModel[60].setRotationPoint(36.5F, -11F, -9F);
		rhblogcarModel[60].rotateAngleY = 1.57079633F;

		rhblogcarModel[61].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 9, 0, 9), new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0) }), 1, 1, 9, 20, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,1 ,9}); // Shape 71
		rhblogcarModel[61].setRotationPoint(2.5F, -11F, -9F);
		rhblogcarModel[61].rotateAngleY = 1.57079633F;

		fixRotations(rhblogcarModel);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 62; i++)
		{
			rhblogcarModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo rhblogcarModel[];
}