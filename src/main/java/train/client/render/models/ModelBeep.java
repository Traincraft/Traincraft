
package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBeep extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBeep() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[174];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // box20
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // box21
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // box22
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // box23
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // box08
		bodyModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // box24
		bodyModel[12] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // box25
		bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // box28
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // box29
		bodyModel[15] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // box04
		bodyModel[16] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // box70
		bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box81
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // box82
		bodyModel[19] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 134
		bodyModel[20] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 217
		bodyModel[22] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 371
		bodyModel[23] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 372
		bodyModel[24] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 376
		bodyModel[25] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 377
		bodyModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 389
		bodyModel[27] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 467
		bodyModel[28] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 468
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // box64
		bodyModel[30] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // box65
		bodyModel[31] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 478
		bodyModel[32] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 479
		bodyModel[33] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 485
		bodyModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 487
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 488
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 489
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 490
		bodyModel[38] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 491
		bodyModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 494
		bodyModel[40] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 497
		bodyModel[41] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 500
		bodyModel[42] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 501
		bodyModel[43] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 502
		bodyModel[44] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 503
		bodyModel[45] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 504
		bodyModel[46] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 505
		bodyModel[47] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 506
		bodyModel[48] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 512
		bodyModel[49] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 513
		bodyModel[50] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 514
		bodyModel[51] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 515
		bodyModel[52] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 516
		bodyModel[53] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 518
		bodyModel[54] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 523
		bodyModel[55] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 524
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 525
		bodyModel[57] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 526
		bodyModel[58] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 528
		bodyModel[59] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 529
		bodyModel[60] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 530
		bodyModel[61] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 534
		bodyModel[62] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 535
		bodyModel[63] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 536
		bodyModel[64] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 537
		bodyModel[65] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 538
		bodyModel[66] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 539
		bodyModel[67] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 540
		bodyModel[68] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 541
		bodyModel[69] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 542
		bodyModel[70] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 550
		bodyModel[71] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 552
		bodyModel[72] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 554
		bodyModel[73] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 555
		bodyModel[74] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 708
		bodyModel[75] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 709
		bodyModel[76] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 710
		bodyModel[77] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 711
		bodyModel[78] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 712
		bodyModel[79] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 713
		bodyModel[80] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 792
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 878
		bodyModel[82] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 314 door swing right
		bodyModel[83] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 315 door swing right
		bodyModel[84] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 883
		bodyModel[85] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 884
		bodyModel[86] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 900 liveryimg 1
		bodyModel[87] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 901 liveryimg 1
		bodyModel[88] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 178
		bodyModel[89] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 179
		bodyModel[90] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 180
		bodyModel[91] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 181
		bodyModel[92] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 187
		bodyModel[93] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 188
		bodyModel[94] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 547
		bodyModel[97] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 547
		bodyModel[98] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 534
		bodyModel[99] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 535
		bodyModel[100] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 536
		bodyModel[101] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 537
		bodyModel[102] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 538
		bodyModel[103] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 539
		bodyModel[104] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 540
		bodyModel[105] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // box56
		bodyModel[106] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box57
		bodyModel[107] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // box58
		bodyModel[108] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // box56
		bodyModel[109] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // box57
		bodyModel[110] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // box58
		bodyModel[111] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // box56
		bodyModel[112] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // box57
		bodyModel[113] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // box58
		bodyModel[114] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // box56
		bodyModel[115] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // box57
		bodyModel[116] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // box58
		bodyModel[117] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 518
		bodyModel[118] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 523
		bodyModel[119] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 489
		bodyModel[120] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 494
		bodyModel[121] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 31 socket
		bodyModel[125] = new ModelRendererTurbo(this, 49, 89, textureX, textureY, "lamp"); // Back left lamp
		bodyModel[126] = new ModelRendererTurbo(this, 57, 89, textureX, textureY, "lamp"); // Back right lamp
		bodyModel[127] = new ModelRendererTurbo(this, 57, 81, textureX, textureY, "cull"); // Box 890 cull
		bodyModel[128] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 887
		bodyModel[129] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 888
		bodyModel[130] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 177
		bodyModel[131] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 67
		bodyModel[132] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 70
		bodyModel[133] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 216
		bodyModel[134] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 217
		bodyModel[135] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 218
		bodyModel[136] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 357
		bodyModel[137] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 184
		bodyModel[138] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 185
		bodyModel[139] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 186
		bodyModel[140] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 187
		bodyModel[141] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 188
		bodyModel[142] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 189
		bodyModel[143] = new ModelRendererTurbo(this, 65, 89, textureX, textureY, "lamp"); // Box 215 lamp
		bodyModel[144] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 216 socket
		bodyModel[145] = new ModelRendererTurbo(this, 121, 89, textureX, textureY, "lamp"); // Box 217 lamp
		bodyModel[146] = new ModelRendererTurbo(this, 113, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[147] = new ModelRendererTurbo(this, 193, 73, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[148] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 223
		bodyModel[149] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 184
		bodyModel[150] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 185
		bodyModel[151] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 550
		bodyModel[152] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 552
		bodyModel[153] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 547
		bodyModel[154] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 547
		bodyModel[155] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 890
		bodyModel[156] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 540
		bodyModel[157] = new ModelRendererTurbo(this, 194, 120, textureX, textureY); // Box 190
		bodyModel[158] = new ModelRendererTurbo(this, 214, 156, textureX, textureY, "lamp"); // Box 399 glow green
		bodyModel[159] = new ModelRendererTurbo(this, 213, 159, textureX, textureY); // Box 400 socket
		bodyModel[160] = new ModelRendererTurbo(this, 207, 156, textureX, textureY, "lamp"); // Box 399 glow yellow
		bodyModel[161] = new ModelRendererTurbo(this, 206, 159, textureX, textureY); // Box 400 socket
		bodyModel[162] = new ModelRendererTurbo(this, 200, 156, textureX, textureY, "lamp"); // Box 399 glow red
		bodyModel[163] = new ModelRendererTurbo(this, 199, 159, textureX, textureY); // Box 400 socket
		bodyModel[164] = new ModelRendererTurbo(this, 193, 156, textureX, textureY, "lamp"); // Box 399 glow beacon
		bodyModel[165] = new ModelRendererTurbo(this, 192, 159, textureX, textureY); // Box 400 socket
		bodyModel[166] = new ModelRendererTurbo(this, 214, 147, textureX, textureY, "lamp"); // Box 399 glow green
		bodyModel[167] = new ModelRendererTurbo(this, 213, 150, textureX, textureY); // Box 400 socket
		bodyModel[168] = new ModelRendererTurbo(this, 207, 147, textureX, textureY, "lamp"); // Box 399 glow yellow
		bodyModel[169] = new ModelRendererTurbo(this, 206, 150, textureX, textureY); // Box 400 socket
		bodyModel[170] = new ModelRendererTurbo(this, 200, 147, textureX, textureY, "lamp"); // Box 399 glow red
		bodyModel[171] = new ModelRendererTurbo(this, 199, 150, textureX, textureY); // Box 400 socket
		bodyModel[172] = new ModelRendererTurbo(this, 193, 147, textureX, textureY, "lamp"); // Box 399 glow beacon
		bodyModel[173] = new ModelRendererTurbo(this, 192, 150, textureX, textureY); // Box 400 socket

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(-35F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(33F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 5
		bodyModel[3].setRotationPoint(-32F, 0F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 6
		bodyModel[4].setRotationPoint(-32.01F, 0F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // box20
		bodyModel[5].setRotationPoint(18F, -18F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box21
		bodyModel[6].setRotationPoint(19F, -18F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box22
		bodyModel[7].setRotationPoint(19F, -18F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // box23
		bodyModel[8].setRotationPoint(29F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 20
		bodyModel[9].setRotationPoint(30F, 0F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // box08
		bodyModel[10].setRotationPoint(18F, -22F, -3F);

		bodyModel[11].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // box24
		bodyModel[11].setRotationPoint(8F, -5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // box25
		bodyModel[12].setRotationPoint(8F, -5F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // box28
		bodyModel[13].setRotationPoint(6F, -2.5F, 7F);

		bodyModel[14].addBox(0F, 0F, -14F, 2, 0, 4, 0F); // box29
		bodyModel[14].setRotationPoint(6F, -2.5F, 3F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // box04
		bodyModel[15].setRotationPoint(-6F, 2F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // box70
		bodyModel[16].setRotationPoint(-5F, 2F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // box81
		bodyModel[17].setRotationPoint(5F, 0.5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // box82
		bodyModel[18].setRotationPoint(-6F, 0.5F, -8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 134
		bodyModel[19].setRotationPoint(-5F, 2F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 135
		bodyModel[20].setRotationPoint(-5F, 2F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 217
		bodyModel[21].setRotationPoint(-32F, -8F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[22].setRotationPoint(18F, -19F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[23].setRotationPoint(18F, -21F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[24].setRotationPoint(18F, -22F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[25].setRotationPoint(18F, -22F, 3F);

		bodyModel[26].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 389
		bodyModel[26].setRotationPoint(18F, -21F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[27].setRotationPoint(18F, -21F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[28].setRotationPoint(18F, -19F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[29].setRotationPoint(21.5F, -18F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[30].setRotationPoint(21.5F, -18F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		bodyModel[31].setRotationPoint(-32F, -8F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 479
		bodyModel[32].setRotationPoint(-32F, -6F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 485
		bodyModel[33].setRotationPoint(-32F, 6F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 487
		bodyModel[34].setRotationPoint(-32F, 2F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 488
		bodyModel[35].setRotationPoint(-32F, 4F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		bodyModel[36].setRotationPoint(-29F, 1F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 490
		bodyModel[37].setRotationPoint(-32F, 4F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 491
		bodyModel[38].setRotationPoint(-32F, 6F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[39].setRotationPoint(-29F, 1F, 6F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 497
		bodyModel[40].setRotationPoint(-32F, 2F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 500
		bodyModel[41].setRotationPoint(-32F, -6F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 501
		bodyModel[42].setRotationPoint(-32F, -8F, 9F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 502
		bodyModel[43].setRotationPoint(-35F, 7F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 503
		bodyModel[44].setRotationPoint(-35F, 7F, 3F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 504
		bodyModel[45].setRotationPoint(33.01F, 0F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 505
		bodyModel[46].setRotationPoint(33F, 7F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 506
		bodyModel[47].setRotationPoint(33F, 7F, 3F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 512
		bodyModel[48].setRotationPoint(33F, -6F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 513
		bodyModel[49].setRotationPoint(33F, -8F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 514
		bodyModel[50].setRotationPoint(33F, -8F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 515
		bodyModel[51].setRotationPoint(33F, -8F, 9F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 516
		bodyModel[52].setRotationPoint(33F, -6F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 518
		bodyModel[53].setRotationPoint(30F, 1F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 523
		bodyModel[54].setRotationPoint(30F, 1F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 524
		bodyModel[55].setRotationPoint(30F, 6F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 525
		bodyModel[56].setRotationPoint(30F, 4F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 526
		bodyModel[57].setRotationPoint(30F, 2F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 528
		bodyModel[58].setRotationPoint(30F, 6F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 529
		bodyModel[59].setRotationPoint(30F, 4F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 530
		bodyModel[60].setRotationPoint(30F, 2F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		bodyModel[61].setRotationPoint(30F, -19F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 535
		bodyModel[62].setRotationPoint(30F, -21F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[63].setRotationPoint(30F, -19F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 537
		bodyModel[64].setRotationPoint(30F, -21F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[65].setRotationPoint(30F, -22F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[66].setRotationPoint(30F, -22F, 3F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 540
		bodyModel[67].setRotationPoint(30F, -22F, -3F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 541
		bodyModel[68].setRotationPoint(-29F, -6F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 542
		bodyModel[69].setRotationPoint(-29F, -8F, 11F);

		bodyModel[70].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 550
		bodyModel[70].setRotationPoint(-27F, -8F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 552
		bodyModel[71].setRotationPoint(7F, -13F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 554
		bodyModel[72].setRotationPoint(-29F, -8F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 555
		bodyModel[73].setRotationPoint(-29F, -6F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 708
		bodyModel[74].setRotationPoint(5F, 0.5F, 7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 709
		bodyModel[75].setRotationPoint(-5F, 2F, 8F);

		bodyModel[76].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 710
		bodyModel[76].setRotationPoint(-5F, 2F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 711
		bodyModel[77].setRotationPoint(-5F, 2F, 6F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 712
		bodyModel[78].setRotationPoint(-6F, 0.5F, 7.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[79].setRotationPoint(-20F, 2F, -2F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 792
		bodyModel[80].setRotationPoint(16F, 2F, -2F);

		bodyModel[81].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 878
		bodyModel[81].setRotationPoint(18F, -5F, -11F);

		bodyModel[82].addBox(-0.5F, 0F, -5.5F, 1, 13, 6, 0F); // Box 314 door swing right
		bodyModel[82].setRotationPoint(29.5F, -18F, 2.5F);

		bodyModel[83].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[83].setRotationPoint(18.5F, -18F, -10.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // Box 883
		bodyModel[84].setRotationPoint(29F, -18F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyModel[85].setRotationPoint(30F, -3F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 900 liveryimg 1
		bodyModel[86].setRotationPoint(20.05F, -10F, 11.05F);

		bodyModel[87].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 901 liveryimg 1
		bodyModel[87].setRotationPoint(20.05F, -10F, -11.05F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[88].setRotationPoint(30.05F, -11F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[89].setRotationPoint(30.05F, -11F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[90].setRotationPoint(30.05F, -1F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[91].setRotationPoint(30.05F, -1F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 187
		bodyModel[92].setRotationPoint(29.5F, -16F, 3.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
		bodyModel[93].setRotationPoint(29.5F, -16F, -3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[94].setRotationPoint(-33F, 2F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(33F, 2F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F); // Box 547
		bodyModel[96].setRotationPoint(3F, -11F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F); // Box 547
		bodyModel[97].setRotationPoint(12F, -13F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		bodyModel[98].setRotationPoint(17F, -19F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 535
		bodyModel[99].setRotationPoint(17F, -21F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[100].setRotationPoint(17F, -19F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 537
		bodyModel[101].setRotationPoint(17F, -21F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[102].setRotationPoint(17F, -22F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[103].setRotationPoint(17F, -22F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 540
		bodyModel[104].setRotationPoint(17F, -22F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box56
		bodyModel[105].setRotationPoint(26F, 1F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box57
		bodyModel[106].setRotationPoint(28F, 1F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // box58
		bodyModel[107].setRotationPoint(29F, 1F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box56
		bodyModel[108].setRotationPoint(26F, 1F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box57
		bodyModel[109].setRotationPoint(28F, 1F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // box58
		bodyModel[110].setRotationPoint(29F, 1F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box56
		bodyModel[111].setRotationPoint(-27F, 1F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box57
		bodyModel[112].setRotationPoint(-28F, 1F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // box58
		bodyModel[113].setRotationPoint(-29F, 1F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box56
		bodyModel[114].setRotationPoint(-27F, 1F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box57
		bodyModel[115].setRotationPoint(-28F, 1F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // box58
		bodyModel[116].setRotationPoint(-29F, 1F, 11F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 518
		bodyModel[117].setRotationPoint(-29F, 1F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 523
		bodyModel[118].setRotationPoint(-29F, 1F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		bodyModel[119].setRotationPoint(30F, 1F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[120].setRotationPoint(30F, 1F, 6F);

		bodyModel[121].addBox(0F, 0F, 0F, 59, 1, 16, 0F); // Box 0
		bodyModel[121].setRotationPoint(-29F, 1F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(-32F, 2F, -2.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[123].setRotationPoint(29F, 2F, -2.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 socket
		bodyModel[124].setRotationPoint(29F, -21F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back left lamp
		bodyModel[125].setRotationPoint(30.25F, -21F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back right lamp
		bodyModel[126].setRotationPoint(30.25F, -21F, 0F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 890 cull
		bodyModel[127].setRotationPoint(29F, -24F, -0.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 887
		bodyModel[128].setRotationPoint(27.5F, -25F, -1.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 888
		bodyModel[129].setRotationPoint(29F, -25F, -0.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		bodyModel[130].setRotationPoint(27F, -25F, 0.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		bodyModel[131].setRotationPoint(16.5F, -11.98F, -2.5F);
		bodyModel[131].rotateAngleY = -0.48869219F;

		bodyModel[132].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[132].setRotationPoint(18.5F, -12F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[133].setRotationPoint(-30F, -21F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[134].setRotationPoint(-30F, -21F, 1F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 218
		bodyModel[135].setRotationPoint(-30F, -21F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 357
		bodyModel[136].setRotationPoint(-28F, -19F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[137].setRotationPoint(-11F, -23F, -1.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[138].setRotationPoint(0F, -23F, -1.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[139].setRotationPoint(-18.5F, -22F, -2.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[140].setRotationPoint(-24.5F, -22F, -2.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[141].setRotationPoint(10.5F, -22F, -2.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[142].setRotationPoint(4.5F, -22F, -2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 lamp
		bodyModel[143].setRotationPoint(-31.25F, -19F, -1F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216 socket
		bodyModel[144].setRotationPoint(-30.5F, -19F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 lamp
		bodyModel[145].setRotationPoint(-31.25F, -17F, -1F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[146].setRotationPoint(-27.51F, -17.5F, -6F);
		bodyModel[146].rotateAngleY = 0.4712389F;

		bodyModel[147].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[147].setRotationPoint(-27.51F, -17.5F, 6F);
		bodyModel[147].rotateAngleY = -0.4712389F;

		bodyModel[148].addBox(0F, 0F, 0F, 45, 21, 14, 0F); // Box 223
		bodyModel[148].setRotationPoint(-27F, -21F, -7F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 184
		bodyModel[149].setRotationPoint(-7F, -23F, -1.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 185
		bodyModel[150].setRotationPoint(-3F, -23F, -1.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 550
		bodyModel[151].setRotationPoint(-27F, -8F, 11F);

		bodyModel[152].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 552
		bodyModel[152].setRotationPoint(7F, -13F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F); // Box 547
		bodyModel[153].setRotationPoint(3F, -11F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F); // Box 547
		bodyModel[154].setRotationPoint(12F, -13F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 890
		bodyModel[155].setRotationPoint(20F, -23.5F, -0.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 540
		bodyModel[156].setRotationPoint(23F, -23.5F, -3F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[157].setRotationPoint(-28F, -21.5F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow green
		bodyModel[158].setRotationPoint(28.35F, -17F, -12F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[159].setRotationPoint(28.5F, -17F, -12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow yellow
		bodyModel[160].setRotationPoint(28.35F, -15.5F, -12F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[161].setRotationPoint(28.5F, -15.5F, -12F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow red
		bodyModel[162].setRotationPoint(28.35F, -14F, -12F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[163].setRotationPoint(28.5F, -14F, -12F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow beacon
		bodyModel[164].setRotationPoint(28.35F, -12.5F, -12F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[165].setRotationPoint(28.5F, -12.5F, -12F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow green
		bodyModel[166].setRotationPoint(28.35F, -17F, 11.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[167].setRotationPoint(28.5F, -17F, 10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow yellow
		bodyModel[168].setRotationPoint(28.35F, -15.5F, 11.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[169].setRotationPoint(28.5F, -15.5F, 10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow red
		bodyModel[170].setRotationPoint(28.35F, -14F, 11.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[171].setRotationPoint(28.5F, -14F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow beacon
		bodyModel[172].setRotationPoint(28.35F, -12.5F, 11.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -1F, 0.1F, 0F, 0.3F, 0.1F, 0F); // Box 400 socket
		bodyModel[173].setRotationPoint(28.5F, -12.5F, 10.5F);
	}
	ModelTypeA theTrucks = new ModelTypeA();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 174; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==135465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.10F ,-0.1F,0F);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslated(1.15F,-0.1F,0);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public ModelRendererTurbo ModelBeep[];
	public float[] getTrans() {
		return new float[]{-1.1F, 0.05F, 0F};
	}
}