package train.client.render.models;
//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

// Model: PRR X31a Wagon Top
// Model Creator: Mr. Rail
// Created on:20.08.2017 - 10:25:49
// Last changed on: 20.08.2017 - 10:25:49

public class ModelPRRX31Wagon extends ModelBase
{
    int textureX = 512;
    int textureY = 512;
    private ModelBettendorf_Trucks fronttrucks = new ModelBettendorf_Trucks();
    private ModelBettendorf_Trucks backtrucks = new ModelBettendorf_Trucks();

    public ModelPRRX31Wagon()
    {
		prrx31wagonModel = new ModelRendererTurbo[164];
		prrx31wagonModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 175
		prrx31wagonModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 200
		prrx31wagonModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 206
		prrx31wagonModel[3] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 207
		prrx31wagonModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 208
		prrx31wagonModel[5] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 209
		prrx31wagonModel[6] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 210
		prrx31wagonModel[7] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 211
		prrx31wagonModel[8] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 212
		prrx31wagonModel[9] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 213
		prrx31wagonModel[10] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box
																							 // 214
		prrx31wagonModel[11] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 215
		prrx31wagonModel[12] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 216
		prrx31wagonModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 217
		prrx31wagonModel[14] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 218
		prrx31wagonModel[15] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 219
		prrx31wagonModel[16] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 220
		prrx31wagonModel[17] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 221
		prrx31wagonModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 222
		prrx31wagonModel[19] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 224
		prrx31wagonModel[20] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 225
		prrx31wagonModel[21] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 226
		prrx31wagonModel[22] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 227
		prrx31wagonModel[23] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 228
		prrx31wagonModel[24] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 229
		prrx31wagonModel[25] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 230
		prrx31wagonModel[26] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 231
		prrx31wagonModel[27] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 232
		prrx31wagonModel[28] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 233
		prrx31wagonModel[29] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 234
		prrx31wagonModel[30] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box
																							 // 238
		prrx31wagonModel[31] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box
																							 // 239
		prrx31wagonModel[32] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box
																							 // 240
		prrx31wagonModel[33] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box
																							 // 241
		prrx31wagonModel[34] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box
																							 // 242
		prrx31wagonModel[35] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box
																							 // 243
		prrx31wagonModel[36] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box
																							 // 244
		prrx31wagonModel[37] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box
																							 // 245
		prrx31wagonModel[38] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box
																							 // 246
		prrx31wagonModel[39] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box
																							 // 247
		prrx31wagonModel[40] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box
																							 // 248
		prrx31wagonModel[41] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 249
		prrx31wagonModel[42] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 250
		prrx31wagonModel[43] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box
																							 // 251
		prrx31wagonModel[44] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box
																							 // 252
		prrx31wagonModel[45] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box
																							 // 253
		prrx31wagonModel[46] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box
																							 // 254
		prrx31wagonModel[47] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box
																							 // 255
		prrx31wagonModel[48] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box
																							 // 256
		prrx31wagonModel[49] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box
																							 // 257
		prrx31wagonModel[50] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box
																							 // 258
		prrx31wagonModel[51] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 259
		prrx31wagonModel[52] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 260
		prrx31wagonModel[53] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box
																							 // 261
		prrx31wagonModel[54] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box
																							 // 262
		prrx31wagonModel[55] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 263
		prrx31wagonModel[56] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 264
		prrx31wagonModel[57] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 265
		prrx31wagonModel[58] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 266
		prrx31wagonModel[59] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 267
		prrx31wagonModel[60] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 268
		prrx31wagonModel[61] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 269
		prrx31wagonModel[62] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 270
		prrx31wagonModel[63] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 271
		prrx31wagonModel[64] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 272
		prrx31wagonModel[65] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box
																							 // 273
		prrx31wagonModel[66] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 274
		prrx31wagonModel[67] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 277
		prrx31wagonModel[68] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box
																							 // 279
		prrx31wagonModel[69] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box
																							 // 280
		prrx31wagonModel[70] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box
																							 // 281
		prrx31wagonModel[71] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 283
		prrx31wagonModel[72] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 284
		prrx31wagonModel[73] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 285
		prrx31wagonModel[74] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 286
		prrx31wagonModel[75] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box
																							 // 287
		prrx31wagonModel[76] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 288
		prrx31wagonModel[77] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 289
		prrx31wagonModel[78] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 290
		prrx31wagonModel[79] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box
																							 // 291
		prrx31wagonModel[80] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box
																							 // 292
		prrx31wagonModel[81] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box
																							 // 293
		prrx31wagonModel[82] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box
																							 // 294
		prrx31wagonModel[83] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box
																							 // 295
		prrx31wagonModel[84] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box
																							 // 297
		prrx31wagonModel[85] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box
																							 // 298
		prrx31wagonModel[86] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 299
		prrx31wagonModel[87] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 300
		prrx31wagonModel[88] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 301
		prrx31wagonModel[89] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 302
		prrx31wagonModel[90] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box
																							 // 304
		prrx31wagonModel[91] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box
																							 // 305
		prrx31wagonModel[92] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box
																							 // 307
		prrx31wagonModel[93] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box
																							 // 308
		prrx31wagonModel[94] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 311
		prrx31wagonModel[95] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 312
		prrx31wagonModel[96] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box
																							 // 313
		prrx31wagonModel[97] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 314
		prrx31wagonModel[98] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 315
		prrx31wagonModel[99] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box
																							 // 316
		prrx31wagonModel[100] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box
																							 // 317
		prrx31wagonModel[101] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box
																							 // 318
		prrx31wagonModel[102] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box
																							 // 319
		prrx31wagonModel[103] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box
																							 // 320
		prrx31wagonModel[104] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box
																							 // 321
		prrx31wagonModel[105] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 322
		prrx31wagonModel[106] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box
																							 // 323
		prrx31wagonModel[107] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box
																							 // 324
		prrx31wagonModel[108] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box
																							 // 325
		prrx31wagonModel[109] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box
																							 // 326
		prrx31wagonModel[110] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box
																							 // 327
		prrx31wagonModel[111] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box
																							 // 328
		prrx31wagonModel[112] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box
																							 // 329
		prrx31wagonModel[113] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box
																							 // 331
		prrx31wagonModel[114] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box
																							 // 332
		prrx31wagonModel[115] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box
																							 // 333
		prrx31wagonModel[116] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box
																							 // 341
		prrx31wagonModel[117] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 342
		prrx31wagonModel[118] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box
																							 // 343
		prrx31wagonModel[119] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box
																							 // 344
		prrx31wagonModel[120] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box
																							 // 345
		prrx31wagonModel[121] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box
																							 // 346
		prrx31wagonModel[122] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box
																							 // 347
		prrx31wagonModel[123] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box
																							 // 348
		prrx31wagonModel[124] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box
																							 // 349
		prrx31wagonModel[125] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 350
		prrx31wagonModel[126] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 351
		prrx31wagonModel[127] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box
																							 // 175
		prrx31wagonModel[128] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 176
		prrx31wagonModel[129] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 177
		prrx31wagonModel[130] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 178
		prrx31wagonModel[131] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box
																							 // 179
		prrx31wagonModel[132] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box
																							 // 180
		prrx31wagonModel[133] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box
																							 // 181
		prrx31wagonModel[134] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box
																							 // 182
		prrx31wagonModel[135] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box
																							 // 183
		prrx31wagonModel[136] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box
																							 // 184
		prrx31wagonModel[137] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box
																							 // 185
		prrx31wagonModel[138] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box
																							 // 186
		prrx31wagonModel[139] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box
																							 // 187
		prrx31wagonModel[140] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box
																							 // 188
		prrx31wagonModel[141] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box
																							 // 189
		prrx31wagonModel[142] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 190
		prrx31wagonModel[143] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box
																							 // 191
		prrx31wagonModel[144] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box
																							 // 192
		prrx31wagonModel[145] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box
																							 // 193
		prrx31wagonModel[146] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box
																							 // 194
		prrx31wagonModel[147] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box
																							 // 195
		prrx31wagonModel[148] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box
																							 // 196
		prrx31wagonModel[149] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 197
		prrx31wagonModel[150] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 199
		prrx31wagonModel[151] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box
																							 // 200
		prrx31wagonModel[152] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box
																							 // 201
		prrx31wagonModel[153] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box
																							 // 202
		prrx31wagonModel[154] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box
																							 // 203
		prrx31wagonModel[155] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box
																							 // 204
		prrx31wagonModel[156] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 205
		prrx31wagonModel[157] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box
																							 // 206
		prrx31wagonModel[158] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box
																							 // 207
		prrx31wagonModel[159] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box
																							 // 208
		prrx31wagonModel[160] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box
																							 // 209
		prrx31wagonModel[161] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box
																							 // 210
		prrx31wagonModel[162] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box
																							 // 211
		prrx31wagonModel[163] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box
																							 // 212

		prrx31wagonModel[0].addBox(0F, 0F, 0F, 99, 2, 2, 0F); // Box 175
		prrx31wagonModel[0].setRotationPoint(-50F, -5.5F, -1F);

		prrx31wagonModel[1].addBox(0F, 0F, 0F, 93, 0, 22, 0F); // Box 200
		prrx31wagonModel[1].setRotationPoint(-47F, -4.5F, -11F);

		prrx31wagonModel[2].addShapeBox(0F, 0F, 0F, 80, 44, 0, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F,
				0F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, 0F, -22F, 0F); // Box 206
		prrx31wagonModel[2].setRotationPoint(-47F, -26F, 11F);

		prrx31wagonModel[3].addBox(0F, 0F, 0F, 94, 1, 23, 0F); // Box 207
		prrx31wagonModel[3].setRotationPoint(-47.5F, -26.5F, -11.5F);

		prrx31wagonModel[4].addShapeBox(0F, 0F, 0F, 75, 2, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		prrx31wagonModel[4].setRotationPoint(-38F, -29.25F, -11F);

		prrx31wagonModel[5].addBox(0F, 0F, 0F, 75, 1, 22, 0F); // Box 209
		prrx31wagonModel[5].setRotationPoint(-38F, -27.25F, -11F);

		prrx31wagonModel[6].addShapeBox(0F, 0F, 0F, 75, 1, 20, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		prrx31wagonModel[6].setRotationPoint(-38F, -30.25F, -10F);

		prrx31wagonModel[7].addShapeBox(0F, 0F, 0F, 75, 1, 16, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		prrx31wagonModel[7].setRotationPoint(-38F, -31.25F, -8F);

		prrx31wagonModel[8].addBox(0F, 0F, 0F, 93, 1, 21, 0F); // Box 212
		prrx31wagonModel[8].setRotationPoint(-47F, -26.75F, -10.5F);

		prrx31wagonModel[9].addShapeBox(0F, 0F, 0F, 93, 1, 21, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		prrx31wagonModel[9].setRotationPoint(-47F, -27.75F, -10.5F);

		prrx31wagonModel[10].addShapeBox(0F, 0F, 0F, 93, 1, 15, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		prrx31wagonModel[10].setRotationPoint(-47F, -29.75F, -7.5F);

		prrx31wagonModel[11].addShapeBox(0F, 0F, 0F, 93, 1, 19, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		prrx31wagonModel[11].setRotationPoint(-47F, -28.75F, -9.5F);

		prrx31wagonModel[12].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 216
		prrx31wagonModel[12].setRotationPoint(-47F, -25.5F, -11F);

		prrx31wagonModel[13].addBox(0F, 0F, 0F, 0, 21, 22, 0F); // Box 217
		prrx31wagonModel[13].setRotationPoint(46F, -25.5F, -11F);

		prrx31wagonModel[14].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 218
		prrx31wagonModel[14].setRotationPoint(-39F, -27.5F, -11.5F);

		prrx31wagonModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		prrx31wagonModel[15].setRotationPoint(-39F, -29.5F, -11.5F);

		prrx31wagonModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		prrx31wagonModel[16].setRotationPoint(-39F, -30.5F, -10.5F);

		prrx31wagonModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		prrx31wagonModel[17].setRotationPoint(-39F, -31.5F, -8.5F);

		prrx31wagonModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		prrx31wagonModel[18].setRotationPoint(37F, -31.5F, -8.5F);

		prrx31wagonModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		prrx31wagonModel[19].setRotationPoint(37F, -30.5F, -10.5F);

		prrx31wagonModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		prrx31wagonModel[20].setRotationPoint(37F, -29.5F, -11.5F);

		prrx31wagonModel[21].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 226
		prrx31wagonModel[21].setRotationPoint(37F, -27.5F, -11.5F);

		prrx31wagonModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		prrx31wagonModel[22].setRotationPoint(28F, -31.5F, -8.5F);

		prrx31wagonModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		prrx31wagonModel[23].setRotationPoint(19F, -31.5F, -8.5F);

		prrx31wagonModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		prrx31wagonModel[24].setRotationPoint(11F, -31.5F, -8.5F);

		prrx31wagonModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		prrx31wagonModel[25].setRotationPoint(3F, -31.5F, -8.5F);

		prrx31wagonModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		prrx31wagonModel[26].setRotationPoint(-5F, -31.5F, -8.5F);

		prrx31wagonModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		prrx31wagonModel[27].setRotationPoint(-13F, -31.5F, -8.5F);

		prrx31wagonModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		prrx31wagonModel[28].setRotationPoint(-21F, -31.5F, -8.5F);

		prrx31wagonModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		prrx31wagonModel[29].setRotationPoint(-30F, -31.5F, -8.5F);

		prrx31wagonModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		prrx31wagonModel[30].setRotationPoint(-30F, -30.5F, -10.5F);

		prrx31wagonModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		prrx31wagonModel[31].setRotationPoint(-21F, -30.5F, -10.5F);

		prrx31wagonModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		prrx31wagonModel[32].setRotationPoint(-13F, -30.5F, -10.5F);

		prrx31wagonModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		prrx31wagonModel[33].setRotationPoint(-5F, -30.5F, -10.5F);

		prrx31wagonModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		prrx31wagonModel[34].setRotationPoint(3F, -30.5F, -10.5F);

		prrx31wagonModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		prrx31wagonModel[35].setRotationPoint(11F, -30.5F, -10.5F);

		prrx31wagonModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		prrx31wagonModel[36].setRotationPoint(19F, -30.5F, -10.5F);

		prrx31wagonModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		prrx31wagonModel[37].setRotationPoint(28F, -30.5F, -10.5F);

		prrx31wagonModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		prrx31wagonModel[38].setRotationPoint(28F, -29.5F, -11.5F);

		prrx31wagonModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		prrx31wagonModel[39].setRotationPoint(19F, -29.5F, -11.5F);

		prrx31wagonModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		prrx31wagonModel[40].setRotationPoint(11F, -29.5F, -11.5F);

		prrx31wagonModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		prrx31wagonModel[41].setRotationPoint(3F, -29.5F, -11.5F);

		prrx31wagonModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		prrx31wagonModel[42].setRotationPoint(-5F, -29.5F, -11.5F);

		prrx31wagonModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		prrx31wagonModel[43].setRotationPoint(-13F, -29.5F, -11.5F);

		prrx31wagonModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		prrx31wagonModel[44].setRotationPoint(-21F, -29.5F, -11.5F);

		prrx31wagonModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		prrx31wagonModel[45].setRotationPoint(-30F, -29.5F, -11.5F);

		prrx31wagonModel[46].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 254
		prrx31wagonModel[46].setRotationPoint(-30F, -27.5F, -11.5F);

		prrx31wagonModel[47].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 255
		prrx31wagonModel[47].setRotationPoint(-21F, -27.5F, -11.5F);

		prrx31wagonModel[48].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 256
		prrx31wagonModel[48].setRotationPoint(-13F, -27.5F, -11.5F);

		prrx31wagonModel[49].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 257
		prrx31wagonModel[49].setRotationPoint(-5F, -27.5F, -11.5F);

		prrx31wagonModel[50].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 258
		prrx31wagonModel[50].setRotationPoint(3F, -27.5F, -11.5F);

		prrx31wagonModel[51].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 259
		prrx31wagonModel[51].setRotationPoint(11F, -27.5F, -11.5F);

		prrx31wagonModel[52].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 260
		prrx31wagonModel[52].setRotationPoint(19F, -27.5F, -11.5F);

		prrx31wagonModel[53].addBox(0F, 0F, 0F, 1, 1, 23, 0F); // Box 261
		prrx31wagonModel[53].setRotationPoint(28F, -27.5F, -11.5F);

		prrx31wagonModel[54].addBox(0F, 0F, 0F, 97, 0, 3, 0F); // Box 262
		prrx31wagonModel[54].setRotationPoint(-49F, -31.5F, -1.5F);

		prrx31wagonModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		prrx31wagonModel[55].setRotationPoint(-49F, -31.5F, -1.5F);

		prrx31wagonModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F,
				0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 264
		prrx31wagonModel[56].setRotationPoint(46F, -31.5F, -1.5F);

		prrx31wagonModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		prrx31wagonModel[57].setRotationPoint(-46F, -31.5F, 1.5F);

		prrx31wagonModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		prrx31wagonModel[58].setRotationPoint(-46F, -30F, 2.5F);

		prrx31wagonModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 267
		prrx31wagonModel[59].setRotationPoint(39F, -31.5F, -9.5F);

		prrx31wagonModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 268
		prrx31wagonModel[60].setRotationPoint(39F, -30F, -10.5F);

		prrx31wagonModel[61].addBox(0F, -2F, 0F, 4, 18, 1, 0F); // Box 269
		prrx31wagonModel[61].setRotationPoint(41.5F, -22F, -11.5F);

		prrx31wagonModel[62].addBox(0F, -2F, 0F, 3, 3, 0, 0F); // Box 270
		prrx31wagonModel[62].setRotationPoint(-46.5F, -2F, -11F);

		prrx31wagonModel[63].addBox(0F, -2F, 0F, 3, 3, 0, 0F); // Box 271
		prrx31wagonModel[63].setRotationPoint(42.5F, -2F, -11F);

		prrx31wagonModel[64].addBox(0F, -2F, 0F, 4, 18, 1, 0F); // Box 272
		prrx31wagonModel[64].setRotationPoint(-46.5F, -22F, 10.5F);

		prrx31wagonModel[65].addBox(0F, -2F, 0F, 14, 19, 1, 0F); // Box 273
		prrx31wagonModel[65].setRotationPoint(-7.5F, -22.5F, 10.25F);

		prrx31wagonModel[66].addBox(0F, -2F, 0F, 60, 1, 1, 0F); // Box 274
		prrx31wagonModel[66].setRotationPoint(-23.5F, -23F, 10.5F);

		prrx31wagonModel[67].addBox(0F, -2F, 0F, 60, 1, 1, 0F); // Box 277
		prrx31wagonModel[67].setRotationPoint(-23.5F, -4F, 10.5F);

		prrx31wagonModel[68].addBox(0F, -2F, 0F, 60, 1, 1, 0F); // Box 279
		prrx31wagonModel[68].setRotationPoint(-37.5F, -4F, -11.5F);

		prrx31wagonModel[69].addBox(0F, -2F, 0F, 60, 1, 1, 0F); // Box 280
		prrx31wagonModel[69].setRotationPoint(-37.5F, -23F, -11.5F);

		prrx31wagonModel[70].addBox(0F, -2F, 0F, 14, 19, 1, 0F); // Box 281
		prrx31wagonModel[70].setRotationPoint(-21.5F, -22.5F, -11.25F);

		prrx31wagonModel[71].addBox(0F, -2F, 0F, 4, 4, 1, 0F); // Box 283
		prrx31wagonModel[71].setRotationPoint(-46.5F, -11F, -11.5F);

		prrx31wagonModel[72].addBox(0F, -2F, 0F, 4, 4, 1, 0F); // Box 284
		prrx31wagonModel[72].setRotationPoint(41.5F, -11F, 10.5F);

		prrx31wagonModel[73].addBox(0F, -2F, 0F, 2, 1, 5, 0F); // Box 285
		prrx31wagonModel[73].setRotationPoint(-48.5F, -17F, 1F);

		prrx31wagonModel[74].addBox(0F, -2F, 0F, 1, 18, 4, 0F); // Box 286
		prrx31wagonModel[74].setRotationPoint(-47.75F, -22F, 6.5F);

		prrx31wagonModel[75].addBox(0F, 0F, 0F, 96, 3, 4, 0F); // Box 287
		prrx31wagonModel[75].setRotationPoint(-48.5F, -6F, -2F);

		prrx31wagonModel[76].addBox(0F, -2F, 0F, 2, 3, 2, 0F); // Box 288
		prrx31wagonModel[76].setRotationPoint(-48.5F, -22F, 2.5F);

		prrx31wagonModel[77].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 289
		prrx31wagonModel[77].setRotationPoint(-49F, -21F, 3F);

		prrx31wagonModel[78].addShapeBox(0F, -2F, 0F, 0, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F,
				-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 290
		prrx31wagonModel[78].setRotationPoint(-49F, -22.5F, 1.5F);

		prrx31wagonModel[79].addShapeBox(0F, 0F, 0F, 52, 44, 0, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F,
				0F, -22F, 0F, -26F, -22F, 0F, -26F, -22F, 0F, 0F, -22F, 0F); // Box 291
		prrx31wagonModel[79].setRotationPoint(20F, -26F, 11F);

		prrx31wagonModel[80].addBox(0F, 0F, 0F, 27, 2, 0, 0F); // Box 292
		prrx31wagonModel[80].setRotationPoint(-7F, -26F, 11F);

		prrx31wagonModel[81].addBox(0F, 0F, 0F, 27, 1, 0, 0F); // Box 293
		prrx31wagonModel[81].setRotationPoint(-7F, -5F, 11F);

		prrx31wagonModel[82].addBox(0F, 0F, 0F, 27, 2, 0, 0F); // Box 294
		prrx31wagonModel[82].setRotationPoint(-21F, -26F, -11F);

		prrx31wagonModel[83].addBox(0F, 0F, 0F, 27, 2, 0, 0F); // Box 295
		prrx31wagonModel[83].setRotationPoint(-21F, -6F, -11F);

		prrx31wagonModel[84].addBox(0F, -2F, 0F, 14, 19, 1, 0F); // Box 297
		prrx31wagonModel[84].setRotationPoint(-7.5F, -22.5F, -11.25F);

		prrx31wagonModel[85].addBox(0F, -2F, 0F, 14, 19, 1, 0F); // Box 298
		prrx31wagonModel[85].setRotationPoint(6.5F, -22.5F, 10.25F);

		prrx31wagonModel[86].addBox(0F, -2F, 0F, 1, 18, 4, 0F); // Box 299
		prrx31wagonModel[86].setRotationPoint(45.75F, -22F, -10.5F);

		prrx31wagonModel[87].addBox(0F, -2F, 0F, 1, 3, 4, 0F); // Box 300
		prrx31wagonModel[87].setRotationPoint(45.75F, -16F, 5.5F);

		prrx31wagonModel[88].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 301
		prrx31wagonModel[88].setRotationPoint(46F, -23F, -10.5F);

		prrx31wagonModel[89].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 302
		prrx31wagonModel[89].setRotationPoint(46F, -20.5F, -10.5F);

		prrx31wagonModel[90].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 304
		prrx31wagonModel[90].setRotationPoint(46F, -18F, -10.5F);

		prrx31wagonModel[91].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 305
		prrx31wagonModel[91].setRotationPoint(46F, -15.5F, -10.5F);

		prrx31wagonModel[92].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 307
		prrx31wagonModel[92].setRotationPoint(46F, -13F, -10.5F);

		prrx31wagonModel[93].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 308
		prrx31wagonModel[93].setRotationPoint(46F, -8F, -10.5F);

		prrx31wagonModel[94].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 311
		prrx31wagonModel[94].setRotationPoint(46F, -10.5F, -10.5F);

		prrx31wagonModel[95].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 312
		prrx31wagonModel[95].setRotationPoint(46F, -5.5F, -10.5F);

		prrx31wagonModel[96].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 313
		prrx31wagonModel[96].setRotationPoint(-48F, -23F, -10.5F);

		prrx31wagonModel[97].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 314
		prrx31wagonModel[97].setRotationPoint(-48F, -20.5F, -10.5F);

		prrx31wagonModel[98].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 315
		prrx31wagonModel[98].setRotationPoint(-48F, -18F, -10.5F);

		prrx31wagonModel[99].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 316
		prrx31wagonModel[99].setRotationPoint(-48F, -15.5F, -10.5F);

		prrx31wagonModel[100].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 317
		prrx31wagonModel[100].setRotationPoint(-48F, -13F, -10.5F);

		prrx31wagonModel[101].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 318
		prrx31wagonModel[101].setRotationPoint(-48F, -10.5F, -10.5F);

		prrx31wagonModel[102].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 319
		prrx31wagonModel[102].setRotationPoint(-48F, -8F, -10.5F);

		prrx31wagonModel[103].addShapeBox(0F, -2F, 0F, 1, 1, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 320
		prrx31wagonModel[103].setRotationPoint(-48F, -5.5F, -10.5F);

		prrx31wagonModel[104].addShapeBox(0F, -2F, 0F, 1, 17, 21, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F,
				0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 321
		prrx31wagonModel[104].setRotationPoint(-47.75F, -22F, -10.5F);

		prrx31wagonModel[105].addShapeBox(0F, -2F, 0F, 1, 17, 21, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		prrx31wagonModel[105].setRotationPoint(45.75F, -22F, -10.5F);

		prrx31wagonModel[106].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		prrx31wagonModel[106].setRotationPoint(-38.5F, -5F, -11F);

		prrx31wagonModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		prrx31wagonModel[107].setRotationPoint(-38.5F, -5F, 2F);

		prrx31wagonModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 325
		prrx31wagonModel[108].setRotationPoint(33.5F, -5F, 2F);

		prrx31wagonModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		prrx31wagonModel[109].setRotationPoint(33.5F, -5F, -11F);

		prrx31wagonModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		prrx31wagonModel[110].setRotationPoint(16.5F, -5F, -11F);

		prrx31wagonModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		prrx31wagonModel[111].setRotationPoint(-20.5F, -5F, -11F);

		prrx31wagonModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		prrx31wagonModel[112].setRotationPoint(-2F, -5F, -11F);

		prrx31wagonModel[113].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		prrx31wagonModel[113].setRotationPoint(-20.5F, -5F, 2F);

		prrx31wagonModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		prrx31wagonModel[114].setRotationPoint(-2F, -5F, 2F);

		prrx31wagonModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 333
		prrx31wagonModel[115].setRotationPoint(16.5F, -5F, 2F);

		prrx31wagonModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		prrx31wagonModel[116].setRotationPoint(9.5F, -4.5F, 3F);

		prrx31wagonModel[117].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 342
		prrx31wagonModel[117].setRotationPoint(9.5F, -3.5F, 3F);

		prrx31wagonModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 343
		prrx31wagonModel[118].setRotationPoint(9.5F, -2.5F, 3F);

		prrx31wagonModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F,
				0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 344
		prrx31wagonModel[119].setRotationPoint(9F, -2F, 5.5F);

		prrx31wagonModel[120].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 345
		prrx31wagonModel[120].setRotationPoint(9F, -5F, 5.5F);

		prrx31wagonModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		prrx31wagonModel[121].setRotationPoint(-14.5F, -4.5F, 2.5F);

		prrx31wagonModel[122].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 347
		prrx31wagonModel[122].setRotationPoint(-14.5F, -2.5F, 2.5F);

		prrx31wagonModel[123].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 348
		prrx31wagonModel[123].setRotationPoint(-14.5F, -3.5F, 2.5F);

		prrx31wagonModel[124].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 349
		prrx31wagonModel[124].setRotationPoint(1.5F, -5F, 8.5F);

		prrx31wagonModel[125].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 350
		prrx31wagonModel[125].setRotationPoint(-48.5F, -16F, 1.5F);

		prrx31wagonModel[126].addShapeBox(0F, -2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 351
		prrx31wagonModel[126].setRotationPoint(-48.5F, -16F, 4.5F);

		prrx31wagonModel[127].addBox(0F, -2F, 0F, 2, 3, 4, 0F); // Box 175
		prrx31wagonModel[127].setRotationPoint(-48F, -16F, -9.5F);

		prrx31wagonModel[128].addBox(0F, -2F, 0F, 2, 4, 1, 0F); // Box 176
		prrx31wagonModel[128].setRotationPoint(-47.75F, -16.5F, -9.75F);

		prrx31wagonModel[129].addBox(0F, -2F, 0F, 2, 4, 1, 0F); // Box 177
		prrx31wagonModel[129].setRotationPoint(-47.75F, -16.5F, -6.25F);

		prrx31wagonModel[130].addBox(0F, -2F, 0F, 5, 3, 1, 0F); // Box 178
		prrx31wagonModel[130].setRotationPoint(-3F, -18F, -11.5F);

		prrx31wagonModel[131].addBox(0F, -2F, 0F, 5, 3, 1, 0F); // Box 179
		prrx31wagonModel[131].setRotationPoint(-3F, -18F, 10.5F);

		prrx31wagonModel[132].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 180
		prrx31wagonModel[132].setRotationPoint(-26F, -6F, 10.75F);

		prrx31wagonModel[133].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 181
		prrx31wagonModel[133].setRotationPoint(36F, -6F, 10.75F);

		prrx31wagonModel[134].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		prrx31wagonModel[134].setRotationPoint(22F, -6F, -11.75F);

		prrx31wagonModel[135].addShapeBox(0F, -2F, 0F, 3, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F,
				0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		prrx31wagonModel[135].setRotationPoint(-40F, -6F, -11.75F);

		prrx31wagonModel[136].addBox(0F, -2F, 0F, 3, 2, 1, 0F); // Box 184
		prrx31wagonModel[136].setRotationPoint(-42.5F, -4.5F, -11.25F);

		prrx31wagonModel[137].addBox(0F, -2F, 0F, 3, 2, 1, 0F); // Box 185
		prrx31wagonModel[137].setRotationPoint(38.5F, -4.5F, 10.25F);

		prrx31wagonModel[138].addBox(0F, -2F, 0F, 3, 3, 0, 0F); // Box 186
		prrx31wagonModel[138].setRotationPoint(42.5F, -2F, 11F);

		prrx31wagonModel[139].addBox(0F, -2F, 0F, 3, 3, 0, 0F); // Box 187
		prrx31wagonModel[139].setRotationPoint(-46.5F, -2F, 11F);

		prrx31wagonModel[140].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 188
		prrx31wagonModel[140].setRotationPoint(-46F, -30.7F, 7.5F);

		prrx31wagonModel[141].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 189
		prrx31wagonModel[141].setRotationPoint(39F, -30.7F, -7.5F);

		prrx31wagonModel[142].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 190
		prrx31wagonModel[142].setRotationPoint(-21F, -4.5F, -11.75F);

		prrx31wagonModel[143].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 191
		prrx31wagonModel[143].setRotationPoint(-9F, -4.5F, -11.75F);

		prrx31wagonModel[144].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 192
		prrx31wagonModel[144].setRotationPoint(-7F, -4.5F, -11.75F);

		prrx31wagonModel[145].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 193
		prrx31wagonModel[145].setRotationPoint(5F, -4.5F, -11.75F);

		prrx31wagonModel[146].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 194
		prrx31wagonModel[146].setRotationPoint(5F, -4.5F, 10.75F);

		prrx31wagonModel[147].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 195
		prrx31wagonModel[147].setRotationPoint(7F, -4.5F, 10.75F);

		prrx31wagonModel[148].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 196
		prrx31wagonModel[148].setRotationPoint(19F, -4.5F, 10.75F);

		prrx31wagonModel[149].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 197
		prrx31wagonModel[149].setRotationPoint(-7F, -4.5F, 10.75F);

		prrx31wagonModel[150].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 199
		prrx31wagonModel[150].setRotationPoint(-7F, -22.5F, 10.75F);

		prrx31wagonModel[151].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 200
		prrx31wagonModel[151].setRotationPoint(5F, -22.5F, 10.75F);

		prrx31wagonModel[152].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 201
		prrx31wagonModel[152].setRotationPoint(7F, -22.5F, 10.75F);

		prrx31wagonModel[153].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 202
		prrx31wagonModel[153].setRotationPoint(19F, -22.5F, 10.75F);

		prrx31wagonModel[154].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 203
		prrx31wagonModel[154].setRotationPoint(5F, -22.5F, -11.75F);

		prrx31wagonModel[155].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 204
		prrx31wagonModel[155].setRotationPoint(-7F, -22.5F, -11.75F);

		prrx31wagonModel[156].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 205
		prrx31wagonModel[156].setRotationPoint(-9F, -22.5F, -11.75F);

		prrx31wagonModel[157].addBox(0F, -2F, 0F, 1, 1, 1, 0F); // Box 206
		prrx31wagonModel[157].setRotationPoint(-21F, -22.5F, -11.75F);

		prrx31wagonModel[158].addShapeBox(0F, 0F, 0F, 52, 44, 0, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F,
				0F, -22F, 0F, -26F, -22F, 0F, -26F, -22F, 0F, 0F, -22F, 0F); // Box 207
		prrx31wagonModel[158].setRotationPoint(-47F, -26F, -11F);

		prrx31wagonModel[159].addShapeBox(0F, 0F, 0F, 80, 44, 0, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F,
				0F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, 0F, -22F, 0F); // Box 208
		prrx31wagonModel[159].setRotationPoint(6F, -26F, -11F);

		prrx31wagonModel[160].addShapeBox(0F, -2F, 0F, 3, 3, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F,
				0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 209
		prrx31wagonModel[160].setRotationPoint(-7F, -7.5F, -11.5F);

		prrx31wagonModel[161].addShapeBox(0F, -2F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F,
				-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 210
		prrx31wagonModel[161].setRotationPoint(-11F, -7.5F, -11.5F);

		prrx31wagonModel[162].addShapeBox(0F, -2F, 0F, 3, 3, 0, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F,
				-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 211
		prrx31wagonModel[162].setRotationPoint(3F, -7.5F, 11.5F);

		prrx31wagonModel[163].addShapeBox(0F, -2F, 0F, 3, 3, 0, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F,
				0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 212
		prrx31wagonModel[163].setRotationPoint(7F, -7.5F, 11.5F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 164; i++) {
            prrx31wagonModel[i].render(f5);
        }

        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Bettendorf_trucks.png"));
        GL11.glPushMatrix();
		GL11.glTranslated(1.75, 0.1, 0);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
		GL11.glTranslated(-1.75, 0.1, 0);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo prrx31wagonModel[];
}
