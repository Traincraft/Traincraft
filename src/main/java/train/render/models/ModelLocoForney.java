package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.render.CustomModelRenderer;

public class ModelLocoForney extends ModelBase {

	public ModelLocoForney() {
		r1= new ModelRendererTurbo[2];
		bodyModel=new ModelRendererTurbo[92];
		r1[0] = new CustomModelRenderer(this, 19, 75, 256, 256);
		r1[0].addBox(0F, 0F, 0F, 1, 6, 6);
		r1[0].setPosition(-6F, 0F, -22F);

		r1[1] = new CustomModelRenderer(this, 19, 75, 256, 256);
		r1[1].addBox(0F, 0F, 0F, 1, 6, 6);
		r1[1].setPosition(5F, 0F, -22F);

		bodyModel[91]= new CustomModelRenderer(this, 121, 57, 256, 256);
		bodyModel[91].addBox(0F, 0F, 0F, 16, 8, 1);
		bodyModel[91].setPosition(-8F, 1F, -24F);

		bodyModel[0]= new CustomModelRenderer(this, 94, 45, 256, 256);
		bodyModel[0].addBox(0F, 0F, 0F, 10, 2, 5);
		bodyModel[0].setPosition(-5F, 7F, -23F);

		bodyModel[1]= new CustomModelRenderer(this, 135, 67, 256, 256);
		bodyModel[1].addBox(0F, 0F, 0F, 2, 6, 0);
		bodyModel[1].setPosition(-1F, 2F, -27F);
		bodyModel[1].rotateAngleX = -5.689773361501515F;

		bodyModel[10] = new CustomModelRenderer(this, 132, 67, 256, 256);
		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 0);
		bodyModel[10].setPosition(-2F, 2F, -26F);
		bodyModel[10].rotateAngleX = -5.8643062867009474F;

		bodyModel[11] = new CustomModelRenderer(this, 115, 75, 256, 256);
		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 8);
		bodyModel[11].setPosition(-7F, 1F, -24F);
		bodyModel[11].rotateAngleY = -4.4156830075456535F;

		bodyModel[12] = new CustomModelRenderer(this, 127, 77, 256, 256);
		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 8);
		bodyModel[12].setPosition(8F, 1F, -25F);
		bodyModel[12].rotateAngleY = -1.8500490071139892F;

		bodyModel[13] = new CustomModelRenderer(this, 126, 45, 256, 256);
		bodyModel[13].addBox(0F, 0F, 0F, 4, 4, 7);
		bodyModel[13].setPosition(5F, 6F, -19F);

		bodyModel[14] = new CustomModelRenderer(this, 136, 20, 256, 256);
		bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 5);
		bodyModel[14].setPosition(6F, 10F, -18F);

		bodyModel[15] = new CustomModelRenderer(this, 178, 142, 256, 256);
		bodyModel[15].addBox(0F, 0F, 0F, 10, 12, 12);
		bodyModel[15].setPosition(-5F, 10F, -10F);

		bodyModel[16] = new CustomModelRenderer(this, 93, 34, 256, 256);
		bodyModel[16].addBox(0F, 0F, 0F, 10, 5, 5);
		bodyModel[16].setPosition(-5F, 4F, -18F);

		bodyModel[17] = new CustomModelRenderer(this, 105, 25, 256, 256);
		bodyModel[17].addBox(0F, 0F, 0F, 6, 2, 5);
		bodyModel[17].setPosition(-3F, 9F, -18F);

		bodyModel[18] = new CustomModelRenderer(this, 157, 10, 256, 256);
		bodyModel[18].addBox(0F, 0F, 0F, 10, 10, 8);
		bodyModel[18].setPosition(-5F, 11F, -18F);

		bodyModel[19] = new CustomModelRenderer(this, 102, 1, 256, 256);
		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 11);
		bodyModel[19].setPosition(-8F, 11F, -12F);

		bodyModel[2]= new CustomModelRenderer(this, 129, 67, 256, 256);
		bodyModel[2].addBox(0F, 0F, 0F, 1, 6, 0);
		bodyModel[2].setPosition(-4F, 1F, -26F);
		bodyModel[2].rotateAngleX = -5.934119456780721F;

		bodyModel[20] = new CustomModelRenderer(this, 103, 13, 256, 256);
		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 11);
		bodyModel[20].setPosition(4F, 11F, -12F);

		bodyModel[21] = new CustomModelRenderer(this, 205, 2, 256, 256);
		bodyModel[21].addBox(0F, 0F, 0F, 8, 8, 16);
		bodyModel[21].setPosition(-4F, 3F, -7F);

		bodyModel[22] = new CustomModelRenderer(this, 11, 91, 256, 256);
		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 22);
		bodyModel[22].setPosition(-5F, 4F, -13F);

		bodyModel[23] = new CustomModelRenderer(this, 11, 91, 256, 256);
		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 22);
		bodyModel[23].setPosition(4F, 4F, -13F);

		bodyModel[24] = new CustomModelRenderer(this, 42, 79, 256, 256);
		bodyModel[24].addBox(0F, 0F, 0F, 1, 9, 9);
		bodyModel[24].setPosition(-6F, 0F, -10F);

		bodyModel[25] = new CustomModelRenderer(this, 42, 79, 256, 256);
		bodyModel[25].addBox(0F, 0F, 0F, 1, 9, 9);
		bodyModel[25].setPosition(-6F, 0F, 1F);

		bodyModel[26] = new CustomModelRenderer(this, 12, 101, 256, 256);
		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 9);
		bodyModel[26].setPosition(4F, 4F, 9F);
		bodyModel[26].rotateAngleX = -0.9948376736367679F;

		bodyModel[27] = new CustomModelRenderer(this, 4, 175, 256, 256);
		bodyModel[27].addBox(0F, 0F, 0F, 1, 9, 13);
		bodyModel[27].setPosition(-8F, 13F, 19F);

		bodyModel[28] = new CustomModelRenderer(this, 37, 117, 256, 256);
		bodyModel[28].addBox(0F, 0F, 0F, 1, 9, 9);
		bodyModel[28].setPosition(5F, 0F, 1F);

		bodyModel[29] = new CustomModelRenderer(this, 37, 117, 256, 256);
		bodyModel[29].addBox(0F, 0F, 0F, 1, 9, 9);
		bodyModel[29].setPosition(5F, 0F, -10F);

		bodyModel[3]= new CustomModelRenderer(this, 126, 67, 256, 256);
		bodyModel[3].addBox(0F, 0F, 0F, 1, 6, 0);
		bodyModel[3].setPosition(-6F, 1F, -25F);
		bodyModel[3].rotateAngleX = -6.09119908946021F;

		bodyModel[30] = new CustomModelRenderer(this, 8, 28, 256, 256);
		bodyModel[30].addBox(0F, 0F, 0F, 1, 7, 16);
		bodyModel[30].setPosition(-9F, 13F, 0F);

		bodyModel[31] = new CustomModelRenderer(this, 43, 28, 256, 256);
		bodyModel[31].addBox(0F, 0F, 0F, 1, 7, 16);
		bodyModel[31].setPosition(8F, 13F, 0F);

		bodyModel[32] = new CustomModelRenderer(this, 106, 80, 256, 256);
		bodyModel[32].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[32].setPosition(8F, 20F, 0F);

		bodyModel[33] = new CustomModelRenderer(this, 96, 80, 256, 256);
		bodyModel[33].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[33].setPosition(8F, 20F, 7F);

		bodyModel[34] = new CustomModelRenderer(this, 86, 80, 256, 256);
		bodyModel[34].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[34].setPosition(8F, 20F, 14F);

		bodyModel[35] = new CustomModelRenderer(this, 148, 94, 256, 256);
		bodyModel[35].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[35].setPosition(-9F, 20F, 0F);

		bodyModel[36] = new CustomModelRenderer(this, 138, 94, 256, 256);
		bodyModel[36].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[36].setPosition(-9F, 20F, 7F);

		bodyModel[37] = new CustomModelRenderer(this, 128, 94, 256, 256);
		bodyModel[37].addBox(0F, 0F, 0F, 1, 10, 2);
		bodyModel[37].setPosition(-9F, 20F, 14F);

		bodyModel[38] = new CustomModelRenderer(this, 89, 115, 256, 256);
		bodyModel[38].addBox(0F, 0F, 0F, 3, 10, 1);
		bodyModel[38].setPosition(-8F, 13F, 0F);

		bodyModel[39] = new CustomModelRenderer(this, 111, 100, 256, 256);
		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 1);
		bodyModel[39].setPosition(4F, 26F, 0F);

		bodyModel[4]= new CustomModelRenderer(this, 121, 66, 256, 256);
		bodyModel[4].addBox(0F, 0F, 0F, 1, 5, 1);
		bodyModel[4].setPosition(-8F, 1F, -25F);
		bodyModel[4].rotateAngleX = -6.073745796940266F;

		bodyModel[40] = new CustomModelRenderer(this, 114, 115, 256, 256);
		bodyModel[40].addBox(0F, 0F, 0F, 3, 10, 1);
		bodyModel[40].setPosition(5F, 13F, 0F);

		bodyModel[41] = new CustomModelRenderer(this, 94, 107, 256, 256);
		bodyModel[41].addBox(0F, 0F, 0F, 10, 5, 1);
		bodyModel[41].setPosition(-5F, 21F, 0F);

		bodyModel[42] = new CustomModelRenderer(this, 95, 100, 256, 256);
		bodyModel[42].addBox(0F, 0F, 0F, 1, 4, 1);
		bodyModel[42].setPosition(-5F, 26F, 0F);

		bodyModel[43] = new CustomModelRenderer(this, 36, 54, 256, 256);
		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 21);
		bodyModel[43].setPosition(8F, 30F, 0F);

		bodyModel[44] = new CustomModelRenderer(this, 102, 100, 256, 256);
		bodyModel[44].addBox(0F, 0F, 0F, 2, 4, 1);
		bodyModel[44].setPosition(-1F, 26F, 0F);

		bodyModel[45] = new CustomModelRenderer(this, 59, 52, 256, 256);
		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 21);
		bodyModel[45].setPosition(-9F, 30F, 0F);

		bodyModel[46] = new CustomModelRenderer(this, 89, 97, 256, 256);
		bodyModel[46].addBox(0F, 0F, 0F, 16, 1, 1);
		bodyModel[46].setPosition(-8F, 30F, 0F);

		bodyModel[47] = new CustomModelRenderer(this, 90, 94, 256, 256);
		bodyModel[47].addBox(0F, 0F, 0F, 14, 1, 1);
		bodyModel[47].setPosition(-7F, 31F, 0F);

		bodyModel[48] = new CustomModelRenderer(this, 37, 115, 256, 256);
		bodyModel[48].addBox(0F, 0F, 0F, 10, 1, 23);
		bodyModel[48].setPosition(0F, 32F, -1F);
		bodyModel[48].rotateAngleZ = -0.13962634015954636F;

		bodyModel[49] = new CustomModelRenderer(this, 103, 115, 256, 256);
		bodyModel[49].addBox(0F, 0F, 0F, 10, 1, 23);
		bodyModel[49].setPosition(0F, 32F, 22F);
		bodyModel[49].rotateAngleY = 3.141592653589793F;
		bodyModel[49].rotateAngleZ = 0.13962634015954636F;

		bodyModel[5]= new CustomModelRenderer(this, 33, 174, 256, 256);
		bodyModel[5].addBox(0F, 0F, 0F, 1, 9, 13);
		bodyModel[5].setPosition(7F, 13F, 19F);

		bodyModel[50] = new CustomModelRenderer(this, 161, 66, 256, 256);
		bodyModel[50].addBox(0F, 0F, 0F, 8, 8, 1);
		bodyModel[50].setPosition(-4F, 12F, -19F);

		bodyModel[51] = new CustomModelRenderer(this, 179, 118, 256, 256);
		bodyModel[51].addBox(0F, 0F, 0F, 6, 5, 6);
		bodyModel[51].setPosition(-3F, 21F, -17F);

		bodyModel[52] = new CustomModelRenderer(this, 183, 104, 256, 256);
		bodyModel[52].addBox(0F, 0F, 0F, 4, 10, 4);
		bodyModel[52].setPosition(-2F, 26F, -16F);

		bodyModel[53] = new CustomModelRenderer(this, 8, 141, 256, 256);
		bodyModel[53].addBox(0F, 0F, 0F, 1, 6, 14);
		bodyModel[53].setPosition(5F, 0F, 15F);

		bodyModel[54] = new CustomModelRenderer(this, 8, 141, 256, 256);
		bodyModel[54].addBox(0F, 0F, 0F, 1, 6, 14);
		bodyModel[54].setPosition(-6F, 0F, 15F);

		bodyModel[55] = new CustomModelRenderer(this, 209, 114, 256, 256);
		bodyModel[55].addBox(0F, 0F, 0F, 6, 6, 6);
		bodyModel[55].setPosition(-3F, 21F, -8F);

		bodyModel[56] = new CustomModelRenderer(this, 41, 143, 256, 256);
		bodyModel[56].addBox(0F, 0F, 0F, 1, 6, 14);
		bodyModel[56].setPosition(6F, 0F, 15F);

		bodyModel[57] = new CustomModelRenderer(this, 69, 10, 256, 256);
		bodyModel[57].addBox(0F, 0F, 0F, 6, 7, 5);
		bodyModel[57].setPosition(-3F, 22F, -24F);

		bodyModel[58] = new CustomModelRenderer(this, 40, 14, 256, 256);
		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 5);
		bodyModel[58].setPosition(-2F, 21F, -22F);

		bodyModel[59] = new CustomModelRenderer(this, 61, 3, 256, 256);
		bodyModel[59].addBox(0F, 0F, 0F, 4, 3, 3);
		bodyModel[59].setPosition(-2F, 29F, -23F);

		bodyModel[6]= new CustomModelRenderer(this, 148, 67, 256, 256);
		bodyModel[6].addBox(0F, 0F, 0F, 1, 6, 0);
		bodyModel[6].setPosition(5F, 1F, -25F);
		bodyModel[6].rotateAngleX = -6.09119908946021F;

		bodyModel[60] = new CustomModelRenderer(this, 81, 4, 256, 256);
		bodyModel[60].addBox(0F, 0F, 0F, 4, 4, 1);
		bodyModel[60].setPosition(-2F, 24F, -25F);

		bodyModel[61] = new CustomModelRenderer(this, 212, 105, 256, 256);
		bodyModel[61].addBox(0F, 0F, 0F, 4, 3, 4);
		bodyModel[61].setPosition(-2F, 27F, -7F);

		bodyModel[62] = new CustomModelRenderer(this, 0, 83, 256, 256);
		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 14);
		bodyModel[62].setPosition(2F, 8F, -14F);
		bodyModel[62].rotateAngleX = -6.09119908946021F;

		bodyModel[63] = new CustomModelRenderer(this, 0, 83, 256, 256);
		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 14);
		bodyModel[63].setPosition(-3F, 8F, -14F);
		bodyModel[63].rotateAngleX = -6.14355896702004F;

		bodyModel[64] = new CustomModelRenderer(this, 38, 100, 256, 256);
		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 10);
		bodyModel[64].setPosition(6F, 8F, -14F);
		bodyModel[64].rotateAngleX = -5.8817595792208905F;

		bodyModel[65] = new CustomModelRenderer(this, 61, 97, 256, 256);
		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 13);
		bodyModel[65].setPosition(6F, 4F, -5F);

		bodyModel[66] = new CustomModelRenderer(this, 38, 100, 256, 256);
		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 10);
		bodyModel[66].setPosition(-7F, 7F, -14F);
		bodyModel[66].rotateAngleX = -6.178465552059927F;

		bodyModel[67] = new CustomModelRenderer(this, 61, 97, 256, 256);
		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 13);
		bodyModel[67].setPosition(-7F, 6F, -5F);

		bodyModel[68] = new CustomModelRenderer(this, 12, 122, 256, 256);
		bodyModel[68].addBox(0F, 0F, 0F, 4, 2, 7);
		bodyModel[68].setPosition(-2F, 7F, 30F);

		bodyModel[69] = new CustomModelRenderer(this, 90, 56, 256, 256);
		bodyModel[69].addBox(0F, 0F, 0F, 12, 5, 1);
		bodyModel[69].setPosition(-6F, 6F, 31F);

		bodyModel[7]= new CustomModelRenderer(this, 151, 66, 256, 256);
		bodyModel[7].addBox(0F, 0F, 0F, 1, 5, 1);
		bodyModel[7].setPosition(7F, 1F, -25F);
		bodyModel[7].rotateAngleX = -6.073745796940266F;

		bodyModel[70] = new CustomModelRenderer(this, 89, 64, 256, 256);
		bodyModel[70].addBox(0F, 0F, 0F, 14, 1, 1);
		bodyModel[70].setPosition(-7F, 5F, 31F);

		bodyModel[71] = new CustomModelRenderer(this, 41, 143, 256, 256);
		bodyModel[71].addBox(0F, 0F, 0F, 1, 6, 14);
		bodyModel[71].setPosition(-7F, 0F, 15F);

		bodyModel[72] = new CustomModelRenderer(this, 0, 0, 256, 256);
		bodyModel[72].addBox(0F, 0F, 0F, 14, 1, 1);
		bodyModel[72].setPosition(-7F, 5F, 14F);

		bodyModel[73] = new CustomModelRenderer(this, 4, 197, 256, 256);
		bodyModel[73].addBox(0F, 0F, 0F, 14, 9, 1);
		bodyModel[73].setPosition(-7F, 13F, 31F);

		bodyModel[74] = new CustomModelRenderer(this, 136, 11, 256, 256);
		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 5);
		bodyModel[74].setPosition(-8F, 10F, -18F);

		bodyModel[75] = new CustomModelRenderer(this, 40, 7, 256, 256);
		bodyModel[75].addBox(0F, 0F, 0F, 4, 4, 1);
		bodyModel[75].setPosition(-2F, 14F, -20F);

		bodyModel[76] = new CustomModelRenderer(this, 41, 12, 256, 256);
		bodyModel[76].addBox(0F, 0F, 0F, 0, 1, 11);
		bodyModel[76].setPosition(6F, 7F, -23F);
		bodyModel[76].rotateAngleX = -0.9424777960769379F;
		bodyModel[76].rotateAngleY = -0.17453292519943295F;

		bodyModel[77] = new CustomModelRenderer(this, 41, 13, 256, 256);
		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 11);
		bodyModel[77].setPosition(-6F, 7F, -23F);
		bodyModel[77].rotateAngleX = -0.9424777960769379F;
		bodyModel[77].rotateAngleY = -6.09119908946021F;

		bodyModel[78] = new CustomModelRenderer(this, 0, 0, 256, 256);
		bodyModel[78].addBox(0F, 0F, 0F, 14, 1, 1);
		bodyModel[78].setPosition(-7F, 5F, 29F);

		bodyModel[79] = new CustomModelRenderer(this, 0, 2, 256, 256);
		bodyModel[79].addBox(0F, 0F, 0F, 12, 2, 2);
		bodyModel[79].setPosition(-6F, 4F, 21F);

		bodyModel[8]= new CustomModelRenderer(this, 127, 31, 256, 256);
		bodyModel[8].addBox(0F, 0F, 0F, 4, 4, 7);
		bodyModel[8].setPosition(-9F, 6F, -19F);

		bodyModel[80] = new CustomModelRenderer(this, 0, 16, 256, 256);
		bodyModel[80].addBox(0F, 0F, 0F, 4, 5, 4);
		bodyModel[80].setPosition(-2F, 6F, 20F);

		bodyModel[81] = new CustomModelRenderer(this, 64, 152, 256, 256);
		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 22);
		bodyModel[81].setPosition(3F, 7F, 9F);

		bodyModel[82] = new CustomModelRenderer(this, 64, 152, 256, 256);
		bodyModel[82].addBox(0F, 0F, 0F, 1, 4, 22);
		bodyModel[82].setPosition(-4F, 7F, 9F);

		bodyModel[83] = new CustomModelRenderer(this, 0, 6, 256, 256);
		bodyModel[83].addBox(0F, 0F, 0F, 10, 2, 2);
		bodyModel[83].setPosition(-5F, 2F, -20F);

		bodyModel[84] = new CustomModelRenderer(this, 144, 67, 256, 256);
		bodyModel[84].addBox(0F, 0F, 0F, 1, 6, 0);
		bodyModel[84].setPosition(3F, 1F, -26F);
		bodyModel[84].rotateAngleX = -5.934119456780721F;

		bodyModel[85] = new CustomModelRenderer(this, 160, 50, 256, 256);
		bodyModel[85].addBox(0F, 0F, 0F, 6, 6, 6);
		bodyModel[85].setPosition(0F, 13F, 24F);

		bodyModel[86] = new CustomModelRenderer(this, 188, 50, 256, 256);
		bodyModel[86].addBox(0F, 0F, 0F, 6, 6, 6);
		bodyModel[86].setPosition(-4F, 17F, 21F);

		bodyModel[87] = new CustomModelRenderer(this, 160, 35, 256, 256);
		bodyModel[87].addBox(0F, 0F, 0F, 6, 6, 6);
		bodyModel[87].setPosition(-7F, 14F, 25F);

		bodyModel[88] = new CustomModelRenderer(this, 188, 50, 256, 256);
		bodyModel[88].addBox(0F, 0F, 0F, 6, 6, 6);
		bodyModel[88].setPosition(-6F, 12F, 20F);

		bodyModel[89] = new CustomModelRenderer(this, 23, 18, 256, 256);
		bodyModel[89].addBox(0F, 0F, 0F, 4, 3, 3);
		bodyModel[89].setPosition(-2F, 4F, -21F);

		bodyModel[90] = new CustomModelRenderer(this, 141, 67, 256, 256);
		bodyModel[90].addBox(0F, 0F, 0F, 1, 5, 0);
		bodyModel[90].setPosition(1F, 2F, -26F);
		bodyModel[90].rotateAngleX = -5.8643062867009474F;

		bodyModel[9] = new CustomModelRenderer(this, 89, 178, 256, 256);
		bodyModel[9].addBox(0F, 0F, 0F, 18, 2, 35);
		bodyModel[9].setPosition(-9F, 11F, -1F);

		fixRotation(bodyModel);

	}

}