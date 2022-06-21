//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.08.2020 - 22:31:05
// Last changed on: 22.08.2020 - 22:31:05

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

import java.util.ArrayList;

public class ModelC415L extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public ModelC415L() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[281];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 389, 201, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 2
        bodyModel[2] = new ModelRendererTurbo(this, 52, 126, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 339, 236, textureX, textureY); // Box 0
        bodyModel[4] = new ModelRendererTurbo(this, 389, 201, textureX, textureY); // Box 26
        bodyModel[5] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 27
        bodyModel[6] = new ModelRendererTurbo(this, 319, 218, textureX, textureY); // Box 52
        bodyModel[7] = new ModelRendererTurbo(this, 326, 236, textureX, textureY); // Box 66
        bodyModel[8] = new ModelRendererTurbo(this, 326, 212, textureX, textureY); // Box 67
        bodyModel[9] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 115
        bodyModel[10] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 141
        bodyModel[11] = new ModelRendererTurbo(this, 339, 212, textureX, textureY); // Box 206
        bodyModel[12] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 490
        bodyModel[13] = new ModelRendererTurbo(this, 245, 125, textureX, textureY); // Box 502
        bodyModel[14] = new ModelRendererTurbo(this, 254, 119, textureX, textureY); // Box 503
        bodyModel[15] = new ModelRendererTurbo(this, 249, 147, textureX, textureY); // Box 504
        bodyModel[16] = new ModelRendererTurbo(this, 228, 119, textureX, textureY); // Box 156
        bodyModel[17] = new ModelRendererTurbo(this, 270, 122, textureX, textureY); // Box 158
        bodyModel[18] = new ModelRendererTurbo(this, 266, 125, textureX, textureY); // Box 159
        bodyModel[19] = new ModelRendererTurbo(this, 218, 125, textureX, textureY); // Box 160
        bodyModel[20] = new ModelRendererTurbo(this, 222, 122, textureX, textureY); // Box 161
        bodyModel[21] = new ModelRendererTurbo(this, 246, 120, textureX, textureY, "lamp"); // Box 162 headlight r
        bodyModel[22] = new ModelRendererTurbo(this, 246, 120, textureX, textureY, "lamp"); // Box 163 headlight r
        bodyModel[23] = new ModelRendererTurbo(this, 436, 169, textureX, textureY); // Box 178 tank main
        bodyModel[24] = new ModelRendererTurbo(this, 358, 201, textureX, textureY); // Box 201
        bodyModel[25] = new ModelRendererTurbo(this, 479, 179, textureX, textureY); // Box 202
        bodyModel[26] = new ModelRendererTurbo(this, 370, 147, textureX, textureY); // Box 224
        bodyModel[27] = new ModelRendererTurbo(this, 318, 132, textureX, textureY); // Box 225
        bodyModel[28] = new ModelRendererTurbo(this, 456, 97, textureX, textureY); // Box 228
        bodyModel[29] = new ModelRendererTurbo(this, 490, 179, textureX, textureY); // Box 237
        bodyModel[30] = new ModelRendererTurbo(this, 331, 185, textureX, textureY); // Box 245 j1
        bodyModel[31] = new ModelRendererTurbo(this, 331, 185, textureX, textureY); // Box 250 j1
        bodyModel[32] = new ModelRendererTurbo(this, 479, 171, textureX, textureY); // Box 560
        bodyModel[33] = new ModelRendererTurbo(this, 425, 171, textureX, textureY); // Box 562
        bodyModel[34] = new ModelRendererTurbo(this, 450, 164, textureX, textureY); // Box 564 tank extra1
        bodyModel[35] = new ModelRendererTurbo(this, 450, 159, textureX, textureY); // Box 569 tank extra 1
        bodyModel[36] = new ModelRendererTurbo(this, 448, 99, textureX, textureY); // Box 682
        bodyModel[37] = new ModelRendererTurbo(this, 448, 110, textureX, textureY); // Box 708
        bodyModel[38] = new ModelRendererTurbo(this, 490, 110, textureX, textureY); // Box 709
        bodyModel[39] = new ModelRendererTurbo(this, 434, 132, textureX, textureY, "lamp"); // Box 359 ditchlight fl
        bodyModel[40] = new ModelRendererTurbo(this, 441, 132, textureX, textureY, "cull"); // Box 360 cull
        bodyModel[41] = new ModelRendererTurbo(this, 434, 97, textureX, textureY, "lamp"); // Box 272 ditchlight r
        bodyModel[42] = new ModelRendererTurbo(this, 441, 97, textureX, textureY, "cull"); // Box 273 cull
        bodyModel[43] = new ModelRendererTurbo(this, 358, 201, textureX, textureY); // Box 318
        bodyModel[44] = new ModelRendererTurbo(this, 441, 132, textureX, textureY, "cull"); // Box 320 cull
        bodyModel[45] = new ModelRendererTurbo(this, 434, 132, textureX, textureY, "lamp"); // Box 321 ditchlight fl
        bodyModel[46] = new ModelRendererTurbo(this, 441, 97, textureX, textureY, "cull"); // Box 322 cull
        bodyModel[47] = new ModelRendererTurbo(this, 434, 97, textureX, textureY, "lamp"); // Box 323 ditchlight r
        bodyModel[48] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 324
        bodyModel[49] = new ModelRendererTurbo(this, 359, 191, textureX, textureY); // Box 325
        bodyModel[50] = new ModelRendererTurbo(this, 324, 238, textureX, textureY); // Box 401
        bodyModel[51] = new ModelRendererTurbo(this, 53, 122, textureX, textureY); // Box 404
        bodyModel[52] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box 405
        bodyModel[53] = new ModelRendererTurbo(this, 28, 125, textureX, textureY); // Box 406
        bodyModel[54] = new ModelRendererTurbo(this, 11, 119, textureX, textureY); // Box 409
        bodyModel[55] = new ModelRendererTurbo(this, 37, 119, textureX, textureY); // Box 410
        bodyModel[56] = new ModelRendererTurbo(this, 29, 120, textureX, textureY, "lamp"); // Box 411 headlight f
        bodyModel[57] = new ModelRendererTurbo(this, 29, 120, textureX, textureY, "lamp"); // Box 412 headlight f
        bodyModel[58] = new ModelRendererTurbo(this, 165, 126, textureX, textureY); // Box 938
        bodyModel[59] = new ModelRendererTurbo(this, 127, 239, textureX, textureY); // Box 939
        bodyModel[60] = new ModelRendererTurbo(this, 2, 224, textureX, textureY); // Box 940
        bodyModel[61] = new ModelRendererTurbo(this, 203, 239, textureX, textureY); // Box 944
        bodyModel[62] = new ModelRendererTurbo(this, 192, 236, textureX, textureY); // Box 314 door swing right
        bodyModel[63] = new ModelRendererTurbo(this, 116, 236, textureX, textureY); // Box 315 door swing right
        bodyModel[64] = new ModelRendererTurbo(this, 150, 236, textureX, textureY); // Box 1158
        bodyModel[65] = new ModelRendererTurbo(this, 74, 236, textureX, textureY); // Box 1159
        bodyModel[66] = new ModelRendererTurbo(this, 85, 224, textureX, textureY); // Box 1510
        bodyModel[67] = new ModelRendererTurbo(this, 161, 224, textureX, textureY); // Box 1513
        bodyModel[68] = new ModelRendererTurbo(this, 6, 147, textureX, textureY); // Box 1516
        bodyModel[69] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 1517
        bodyModel[70] = new ModelRendererTurbo(this, 22, 133, textureX, textureY); // Box 1518
        bodyModel[71] = new ModelRendererTurbo(this, 43, 140, textureX, textureY); // Box 1519
        bodyModel[72] = new ModelRendererTurbo(this, 25, 138, textureX, textureY, "lamp"); // Box 1521 markerlight
        bodyModel[73] = new ModelRendererTurbo(this, 25, 138, textureX, textureY, "lamp"); // Box 1522 markerlight
        bodyModel[74] = new ModelRendererTurbo(this, 239, 133, textureX, textureY); // Box 1523
        bodyModel[75] = new ModelRendererTurbo(this, 252, 138, textureX, textureY, "lamp"); // Box 1526 markerlight
        bodyModel[76] = new ModelRendererTurbo(this, 252, 138, textureX, textureY, "lamp"); // Box 1527 markerlight
        bodyModel[77] = new ModelRendererTurbo(this, 425, 178, textureX, textureY); // Box 1528
        bodyModel[78] = new ModelRendererTurbo(this, 123, 104, textureX, textureY); // Box 1529
        bodyModel[79] = new ModelRendererTurbo(this, 113, 114, textureX, textureY); // Box 1530
        bodyModel[80] = new ModelRendererTurbo(this, 104, 115, textureX, textureY); // Box 1534
        bodyModel[81] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 1536
        bodyModel[82] = new ModelRendererTurbo(this, 45, 132, textureX, textureY, "lamp"); // Box 1537 gyralight FL
        bodyModel[83] = new ModelRendererTurbo(this, 35, 132, textureX, textureY, "lamp"); // Box 1538 gyralight FL
        bodyModel[84] = new ModelRendererTurbo(this, 123, 126, textureX, textureY); // Box 1540
        bodyModel[85] = new ModelRendererTurbo(this, 21, 145, textureX, textureY); // Box 192
        bodyModel[86] = new ModelRendererTurbo(this, 30, 145, textureX, textureY, "lamp"); // Box 193 sp gyralight FU
        bodyModel[87] = new ModelRendererTurbo(this, 252, 145, textureX, textureY); // Box 194
        bodyModel[88] = new ModelRendererTurbo(this, 245, 145, textureX, textureY, "lamp"); // Box 195 sp gyralight RU
        bodyModel[89] = new ModelRendererTurbo(this, 230, 132, textureX, textureY, "lamp"); // Box 196 gyralight RL
        bodyModel[90] = new ModelRendererTurbo(this, 240, 132, textureX, textureY, "lamp"); // Box 197 gyralight RL
        bodyModel[91] = new ModelRendererTurbo(this, 323, 237, textureX, textureY); // Box 198
        bodyModel[92] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Box 199
        bodyModel[93] = new ModelRendererTurbo(this, 324, 214, textureX, textureY); // Box 200
        bodyModel[94] = new ModelRendererTurbo(this, 479, 213, textureX, textureY); // Box 215
        bodyModel[95] = new ModelRendererTurbo(this, 472, 214, textureX, textureY); // Box 216
        bodyModel[96] = new ModelRendererTurbo(this, 479, 237, textureX, textureY); // Box 221
        bodyModel[97] = new ModelRendererTurbo(this, 472, 238, textureX, textureY); // Box 225
        bodyModel[98] = new ModelRendererTurbo(this, 466, 236, textureX, textureY); // Box 228
        bodyModel[99] = new ModelRendererTurbo(this, 466, 212, textureX, textureY); // Box 230
        bodyModel[100] = new ModelRendererTurbo(this, 456, 62, textureX, textureY); // Box 232
        bodyModel[101] = new ModelRendererTurbo(this, 448, 75, textureX, textureY); // Box 233
        bodyModel[102] = new ModelRendererTurbo(this, 490, 75, textureX, textureY); // Box 234
        bodyModel[103] = new ModelRendererTurbo(this, 490, 83, textureX, textureY); // Box 235
        bodyModel[104] = new ModelRendererTurbo(this, 448, 83, textureX, textureY); // Box 236
        bodyModel[105] = new ModelRendererTurbo(this, 158, 208, textureX, textureY); // Box 237
        bodyModel[106] = new ModelRendererTurbo(this, 318, 147, textureX, textureY); // Box 238
        bodyModel[107] = new ModelRendererTurbo(this, 305, 146, textureX, textureY); // Box 249
        bodyModel[108] = new ModelRendererTurbo(this, 308, 144, textureX, textureY); // Box 250
        bodyModel[109] = new ModelRendererTurbo(this, 233, 133, textureX, textureY); // Box 241 sp light mount
        bodyModel[110] = new ModelRendererTurbo(this, 38, 133, textureX, textureY); // Box 242 sp light mount
        bodyModel[111] = new ModelRendererTurbo(this, 364, 147, textureX, textureY); // Box 351
        bodyModel[112] = new ModelRendererTurbo(this, 384, 132, textureX, textureY); // Box 361
        bodyModel[113] = new ModelRendererTurbo(this, 305, 131, textureX, textureY); // Box 362
        bodyModel[114] = new ModelRendererTurbo(this, 308, 129, textureX, textureY); // Box 363
        bodyModel[115] = new ModelRendererTurbo(this, 490, 118, textureX, textureY); // Box 364
        bodyModel[116] = new ModelRendererTurbo(this, 448, 64, textureX, textureY); // Box 365
        bodyModel[117] = new ModelRendererTurbo(this, 412, 144, textureX, textureY); // Box 366
        bodyModel[118] = new ModelRendererTurbo(this, 419, 146, textureX, textureY); // Box 367
        bodyModel[119] = new ModelRendererTurbo(this, 412, 129, textureX, textureY); // Box 370
        bodyModel[120] = new ModelRendererTurbo(this, 419, 131, textureX, textureY); // Box 371
        bodyModel[121] = new ModelRendererTurbo(this, 315, 147, textureX, textureY); // Box 372
        bodyModel[122] = new ModelRendererTurbo(this, 315, 132, textureX, textureY); // Box 373
        bodyModel[123] = new ModelRendererTurbo(this, 409, 132, textureX, textureY); // Box 374
        bodyModel[124] = new ModelRendererTurbo(this, 409, 147, textureX, textureY); // Box 375
        bodyModel[125] = new ModelRendererTurbo(this, 104, 120, textureX, textureY); // Box 377
        bodyModel[126] = new ModelRendererTurbo(this, 251, 234, textureX, textureY); // Box 383
        bodyModel[127] = new ModelRendererTurbo(this, 163, 209, textureX, textureY); // Box 384
        bodyModel[128] = new ModelRendererTurbo(this, 448, 118, textureX, textureY); // Box 385
        bodyModel[129] = new ModelRendererTurbo(this, 86, 201, textureX, textureY); // Box 386
        bodyModel[130] = new ModelRendererTurbo(this, 58, 201, textureX, textureY); // Box 387
        bodyModel[131] = new ModelRendererTurbo(this, 57, 136, textureX, textureY); // Box 143
        bodyModel[132] = new ModelRendererTurbo(this, 217, 136, textureX, textureY); // Box 389
        bodyModel[133] = new ModelRendererTurbo(this, 65, 204, textureX, textureY, "cull"); // Box WW F1T cull
        bodyModel[134] = new ModelRendererTurbo(this, 63, 209, textureX, textureY, "cull"); // Box 311 WW F1B cull
        bodyModel[135] = new ModelRendererTurbo(this, 168, 120, textureX, textureY); // Box 392
        bodyModel[136] = new ModelRendererTurbo(this, 168, 120, textureX, textureY); // Box 393
        bodyModel[137] = new ModelRendererTurbo(this, 86, 209, textureX, textureY, "cull"); // Box 395 WW E1B cull
        bodyModel[138] = new ModelRendererTurbo(this, 88, 204, textureX, textureY, "cull"); // Box 396 WW E1T cull
        bodyModel[139] = new ModelRendererTurbo(this, 502, 181, textureX, textureY); // Box 114
        bodyModel[140] = new ModelRendererTurbo(this, 502, 178, textureX, textureY); // Box 74
        bodyModel[141] = new ModelRendererTurbo(this, 502, 184, textureX, textureY); // Box 78
        bodyModel[142] = new ModelRendererTurbo(this, 474, 132, textureX, textureY); // Box 403
        bodyModel[143] = new ModelRendererTurbo(this, 450, 132, textureX, textureY); // Box 404
        bodyModel[144] = new ModelRendererTurbo(this, 477, 131, textureX, textureY); // Box 405
        bodyModel[145] = new ModelRendererTurbo(this, 443, 131, textureX, textureY); // Box 406
        bodyModel[146] = new ModelRendererTurbo(this, 460, 135, textureX, textureY); // Box 407
        bodyModel[147] = new ModelRendererTurbo(this, 474, 135, textureX, textureY); // Box 408
        bodyModel[148] = new ModelRendererTurbo(this, 443, 96, textureX, textureY); // Box 242
        bodyModel[149] = new ModelRendererTurbo(this, 450, 97, textureX, textureY); // Box 243
        bodyModel[150] = new ModelRendererTurbo(this, 460, 100, textureX, textureY); // Box 244
        bodyModel[151] = new ModelRendererTurbo(this, 474, 100, textureX, textureY); // Box 245
        bodyModel[152] = new ModelRendererTurbo(this, 477, 96, textureX, textureY); // Box 246
        bodyModel[153] = new ModelRendererTurbo(this, 474, 97, textureX, textureY); // Box 247
        bodyModel[154] = new ModelRendererTurbo(this, 441, 126, textureX, textureY); // Box 101
        bodyModel[155] = new ModelRendererTurbo(this, 441, 126, textureX, textureY); // Box 252
        bodyModel[156] = new ModelRendererTurbo(this, 434, 127, textureX, textureY, "lamp"); // Box 189 ditchlight fu
        bodyModel[157] = new ModelRendererTurbo(this, 434, 127, textureX, textureY, "lamp"); // Box 190 ditchlight fu
        bodyModel[158] = new ModelRendererTurbo(this, 441, 91, textureX, textureY); // Box 252
        bodyModel[159] = new ModelRendererTurbo(this, 434, 92, textureX, textureY, "lamp"); // Box 253 ditchlight r
        bodyModel[160] = new ModelRendererTurbo(this, 441, 91, textureX, textureY); // Box 254
        bodyModel[161] = new ModelRendererTurbo(this, 434, 92, textureX, textureY, "lamp"); // Box 255 ditchlight r
        bodyModel[162] = new ModelRendererTurbo(this, 98, 112, textureX, textureY); // Box 114
        bodyModel[163] = new ModelRendererTurbo(this, 98, 109, textureX, textureY); // Box 74
        bodyModel[164] = new ModelRendererTurbo(this, 98, 115, textureX, textureY); // Box 78
        bodyModel[165] = new ModelRendererTurbo(this, 91, 114, textureX, textureY); // Box 113
        bodyModel[166] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 114
        bodyModel[167] = new ModelRendererTurbo(this, 90, 113, textureX, textureY); // Box 115
        bodyModel[168] = new ModelRendererTurbo(this, 91, 109, textureX, textureY); // Box 116
        bodyModel[169] = new ModelRendererTurbo(this, 93, 120, textureX, textureY); // Box 117
        bodyModel[170] = new ModelRendererTurbo(this, 256, 225, textureX, textureY); // Box 268
        bodyModel[171] = new ModelRendererTurbo(this, 256, 222, textureX, textureY); // Box 269
        bodyModel[172] = new ModelRendererTurbo(this, 256, 219, textureX, textureY); // Box 271
        bodyModel[173] = new ModelRendererTurbo(this, 204, 206, textureX, textureY); // Box 378 cs
        bodyModel[174] = new ModelRendererTurbo(this, 172, 211, textureX, textureY); // Box 148 cs
        bodyModel[175] = new ModelRendererTurbo(this, 174, 206, textureX, textureY); // Box 150 cs
        bodyModel[176] = new ModelRendererTurbo(this, 193, 206, textureX, textureY); // Box 152 cs
        bodyModel[177] = new ModelRendererTurbo(this, 217, 132, textureX, textureY); // Box 383
        bodyModel[178] = new ModelRendererTurbo(this, 57, 132, textureX, textureY); // Box 384
        bodyModel[179] = new ModelRendererTurbo(this, 438, 192, textureX, textureY); // Box 385 tank main
        bodyModel[180] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 386
        bodyModel[181] = new ModelRendererTurbo(this, 415, 123, textureX, textureY); // Box 387
        bodyModel[182] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 388
        bodyModel[183] = new ModelRendererTurbo(this, 417, 117, textureX, textureY); // Box 389
        bodyModel[184] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 390
        bodyModel[185] = new ModelRendererTurbo(this, 418, 117, textureX, textureY); // Box 391
        bodyModel[186] = new ModelRendererTurbo(this, 417, 115, textureX, textureY); // Box 392
        bodyModel[187] = new ModelRendererTurbo(this, 408, 121, textureX, textureY); // Box 393
        bodyModel[188] = new ModelRendererTurbo(this, 406, 123, textureX, textureY); // Box 394
        bodyModel[189] = new ModelRendererTurbo(this, 408, 117, textureX, textureY); // Box 395
        bodyModel[190] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 396
        bodyModel[191] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 397
        bodyModel[192] = new ModelRendererTurbo(this, 409, 117, textureX, textureY); // Box 398
        bodyModel[193] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 399
        bodyModel[194] = new ModelRendererTurbo(this, 371, 189, textureX, textureY); // Box 301
        bodyModel[195] = new ModelRendererTurbo(this, 371, 189, textureX, textureY); // Box 302
        bodyModel[196] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 303
        bodyModel[197] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 304
        bodyModel[198] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 305
        bodyModel[199] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 306
        bodyModel[200] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 307
        bodyModel[201] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 308
        bodyModel[202] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 309
        bodyModel[203] = new ModelRendererTurbo(this, 370, 192, textureX, textureY); // Box 310
        bodyModel[204] = new ModelRendererTurbo(this, 461, 131, textureX, textureY); // Box 311
        bodyModel[205] = new ModelRendererTurbo(this, 461, 96, textureX, textureY); // Box 312
        bodyModel[206] = new ModelRendererTurbo(this, 380, 185, textureX, textureY); // Box 291 j2
        bodyModel[207] = new ModelRendererTurbo(this, 380, 185, textureX, textureY); // Box 292 j2
        bodyModel[208] = new ModelRendererTurbo(this, 343, 244, textureX, textureY); // Box 293
        bodyModel[209] = new ModelRendererTurbo(this, 343, 242, textureX, textureY); // Box 294
        bodyModel[210] = new ModelRendererTurbo(this, 452, 114, textureX, textureY); // Box 364
        bodyModel[211] = new ModelRendererTurbo(this, 486, 114, textureX, textureY); // Box 296
        bodyModel[212] = new ModelRendererTurbo(this, 452, 79, textureX, textureY); // Box 297
        bodyModel[213] = new ModelRendererTurbo(this, 486, 79, textureX, textureY); // Box 298
        bodyModel[214] = new ModelRendererTurbo(this, 485, 115, textureX, textureY); // Box 299
        bodyModel[215] = new ModelRendererTurbo(this, 451, 115, textureX, textureY); // Box 301
        bodyModel[216] = new ModelRendererTurbo(this, 485, 80, textureX, textureY); // Box 302
        bodyModel[217] = new ModelRendererTurbo(this, 451, 80, textureX, textureY); // Box 303
        bodyModel[218] = new ModelRendererTurbo(this, 123, 126, textureX, textureY); // Box 305
        bodyModel[219] = new ModelRendererTurbo(this, 11, 130, textureX, textureY, "lamp"); // Box 302 numberboard
        bodyModel[220] = new ModelRendererTurbo(this, 11, 130, textureX, textureY, "lamp"); // Box 303 numberboard
        bodyModel[221] = new ModelRendererTurbo(this, 5, 122, textureX, textureY); // Box 309
        bodyModel[222] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 310
        bodyModel[223] = new ModelRendererTurbo(this, 13, 140, textureX, textureY); // Box 311
        bodyModel[224] = new ModelRendererTurbo(this, 256, 130, textureX, textureY, "lamp"); // Box 302 numberboard
        bodyModel[225] = new ModelRendererTurbo(this, 256, 130, textureX, textureY, "lamp"); // Box 303 numberboard
        bodyModel[226] = new ModelRendererTurbo(this, 419, 194, textureX, textureY); // Box 322 tank extra 1
        bodyModel[227] = new ModelRendererTurbo(this, 477, 194, textureX, textureY); // Box 323 tank extra 1
        bodyModel[228] = new ModelRendererTurbo(this, 230, 140, textureX, textureY); // Box 304
        bodyModel[229] = new ModelRendererTurbo(this, 260, 140, textureX, textureY); // Box 305
        bodyModel[230] = new ModelRendererTurbo(this, 431, 120, textureX, textureY, "cull"); // Box 339 cull crossover
        bodyModel[231] = new ModelRendererTurbo(this, 431, 85, textureX, textureY, "cull"); // Box 328 cull crossover
        bodyModel[232] = new ModelRendererTurbo(this, 436, 81, textureX, textureY, "cull"); // Box 314 cull crossover
        bodyModel[233] = new ModelRendererTurbo(this, 436, 116, textureX, textureY, "cull"); // Box 315 cull crossover
        bodyModel[234] = new ModelRendererTurbo(this, 350, 145, textureX, textureY); // Box 323
        bodyModel[235] = new ModelRendererTurbo(this, 364, 154, textureX, textureY); // Box 317
        bodyModel[236] = new ModelRendererTurbo(this, 350, 156, textureX, textureY); // Box 318
        bodyModel[237] = new ModelRendererTurbo(this, 361, 147, textureX, textureY); // Box 319
        bodyModel[238] = new ModelRendererTurbo(this, 361, 154, textureX, textureY); // Box 320
        bodyModel[239] = new ModelRendererTurbo(this, 397, 156, textureX, textureY); // Box 330
        bodyModel[240] = new ModelRendererTurbo(this, 404, 156, textureX, textureY); // Box 43
        bodyModel[241] = new ModelRendererTurbo(this, 405, 159, textureX, textureY); // Box 43
        bodyModel[242] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 348 stair cull
        bodyModel[243] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 349 stair cull
        bodyModel[244] = new ModelRendererTurbo(this, 78, 158, textureX, textureY, "cull"); // Box 350 stair cull
        bodyModel[245] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 358 stair cull
        bodyModel[246] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 359 stair cull
        bodyModel[247] = new ModelRendererTurbo(this, 192, 158, textureX, textureY, "cull"); // Box 360 stair cull
        bodyModel[248] = new ModelRendererTurbo(this, 378, 141, textureX, textureY); // Box 352
        bodyModel[249] = new ModelRendererTurbo(this, 381, 139, textureX, textureY); // Box 353
        bodyModel[250] = new ModelRendererTurbo(this, 381, 132, textureX, textureY); // Box 354
        bodyModel[251] = new ModelRendererTurbo(this, 378, 130, textureX, textureY); // Box 355
        bodyModel[252] = new ModelRendererTurbo(this, 378, 132, textureX, textureY); // Box 356
        bodyModel[253] = new ModelRendererTurbo(this, 378, 139, textureX, textureY); // Box 357
        bodyModel[254] = new ModelRendererTurbo(this, 491, 129, textureX, textureY); // Box 359
        bodyModel[255] = new ModelRendererTurbo(this, 491, 94, textureX, textureY); // Box 360
        bodyModel[256] = new ModelRendererTurbo(this, 131, 112, textureX, textureY); // Box 380
        bodyModel[257] = new ModelRendererTurbo(this, 417, 117, textureX, textureY); // Box 381
        bodyModel[258] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 382
        bodyModel[259] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 383
        bodyModel[260] = new ModelRendererTurbo(this, 415, 123, textureX, textureY); // Box 384
        bodyModel[261] = new ModelRendererTurbo(this, 416, 119, textureX, textureY); // Box 385
        bodyModel[262] = new ModelRendererTurbo(this, 418, 117, textureX, textureY); // Box 386
        bodyModel[263] = new ModelRendererTurbo(this, 417, 115, textureX, textureY); // Box 387
        bodyModel[264] = new ModelRendererTurbo(this, 406, 123, textureX, textureY); // Box 388
        bodyModel[265] = new ModelRendererTurbo(this, 408, 121, textureX, textureY); // Box 389
        bodyModel[266] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 390
        bodyModel[267] = new ModelRendererTurbo(this, 408, 117, textureX, textureY); // Box 391
        bodyModel[268] = new ModelRendererTurbo(this, 407, 119, textureX, textureY); // Box 392
        bodyModel[269] = new ModelRendererTurbo(this, 409, 117, textureX, textureY); // Box 393
        bodyModel[270] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 394
        bodyModel[271] = new ModelRendererTurbo(this, 101, 172, textureX, textureY); // Box 945
        bodyModel[272] = new ModelRendererTurbo(this, 120, 169, textureX, textureY); // Box 309
        bodyModel[273] = new ModelRendererTurbo(this, 120, 166, textureX, textureY); // Box 312
        bodyModel[274] = new ModelRendererTurbo(this, 220, 234, textureX, textureY); // Box 313 mcrr thing
        bodyModel[275] = new ModelRendererTurbo(this, 218, 229, textureX, textureY); // Box 314 mcrr thing
        bodyModel[276] = new ModelRendererTurbo(this, 123, 104, textureX, textureY); // Box 361
        bodyModel[277] = new ModelRendererTurbo(this, 198, 109, textureX, textureY); // Box 500
        bodyModel[278] = new ModelRendererTurbo(this, 143, 140, textureX, textureY); // Box 1542
        bodyModel[279] = new ModelRendererTurbo(this, 153, 100, textureX, textureY); // Box 394
        bodyModel[280] = new ModelRendererTurbo(this, 143, 140, textureX, textureY); // Box 304

        bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
        bodyModel[0].setRotationPoint(-39F, 3F, -1.5F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 2
        bodyModel[1].setRotationPoint(-36.5F, 2.5F, -2.5F);

        bodyModel[2].addBox(0F, 0F, 0F, 27, 17, 14, 0F); // Box 2
        bodyModel[2].setRotationPoint(-29F, -17F, -7F);

        bodyModel[3].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 0
        bodyModel[3].setRotationPoint(-30F, 0F, -11F);

        bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
        bodyModel[4].setRotationPoint(35F, 3F, -1.5F);

        bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 27
        bodyModel[5].setRotationPoint(33.5F, 2.5F, -2.5F);

        bodyModel[6].addBox(0F, 0F, 0F, 69, 3, 14, 0F); // Box 52
        bodyModel[6].setRotationPoint(-35F, 0F, -7F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[7].setRotationPoint(-32F, 0F, -11F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 67
        bodyModel[8].setRotationPoint(-32F, 0F, 7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[9].setRotationPoint(-33F, 3F, -3F);

        bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
        bodyModel[10].setRotationPoint(-35F, 3F, -3F);

        bodyModel[11].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 206
        bodyModel[11].setRotationPoint(-30F, 0F, 7F);

        bodyModel[12].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 490
        bodyModel[12].setRotationPoint(28F, -9F, -7F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 502
        bodyModel[13].setRotationPoint(28F, -17F, -1F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
        bodyModel[14].setRotationPoint(28F, -17F, 1F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
        bodyModel[15].setRotationPoint(29F, -9F, -6F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[16].setRotationPoint(28F, -17F, -7F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[17].setRotationPoint(28F, -13F, 6F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 159
        bodyModel[18].setRotationPoint(28F, -13F, 1F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
        bodyModel[19].setRotationPoint(28F, -13F, -6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 161
        bodyModel[20].setRotationPoint(28F, -13F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 headlight r
        bodyModel[21].setRotationPoint(29.25F, -15F, -1F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight r
        bodyModel[22].setRotationPoint(29.25F, -17F, -1F);

        bodyModel[23].addBox(0F, 0F, 0F, 13, 6, 16, 0F); // Box 178 tank main
        bodyModel[23].setRotationPoint(-7F, 2F, -8F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
        bodyModel[24].setRotationPoint(-21F, 3F, -2F);

        bodyModel[25].addBox(0F, 0F, -3F, 1, 1, 4, 0F); // Box 202
        bodyModel[25].setRotationPoint(-6.5F, 3F, -8F);
        bodyModel[25].rotateAngleX = -0.64577182F;

        bodyModel[26].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 224
        bodyModel[26].setRotationPoint(10F, -8F, -11F);

        bodyModel[27].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 225
        bodyModel[27].setRotationPoint(-30F, -8F, 11F);

        bodyModel[28].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 228
        bodyModel[28].setRotationPoint(-35F, -9F, -7F);

        bodyModel[29].addBox(0F, 0F, -1F, 1, 1, 4, 0F); // Box 237
        bodyModel[29].setRotationPoint(-6.5F, 3F, 8F);
        bodyModel[29].rotateAngleX = 0.64577182F;

        bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 245 j1
        bodyModel[30].setRotationPoint(-20F, 1F, -11F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 250 j1
        bodyModel[31].setRotationPoint(17F, 1F, -11F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 560
        bodyModel[32].setRotationPoint(-4.5F, 1F, -11F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
        bodyModel[33].setRotationPoint(-4.5F, 1F, 8F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 564 tank extra1
        bodyModel[34].setRotationPoint(-7F, 5F, -10F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569 tank extra 1
        bodyModel[35].setRotationPoint(-7F, 5F, 8F);

        bodyModel[36].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 682
        bodyModel[36].setRotationPoint(-35.01F, 0F, -11F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
        bodyModel[37].setRotationPoint(-35F, -8F, 8F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
        bodyModel[38].setRotationPoint(-35F, -8F, -9F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight fl
        bodyModel[39].setRotationPoint(-36F, 0F, -6.75F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
        bodyModel[40].setRotationPoint(-35.75F, 0F, -6.75F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 272 ditchlight r
        bodyModel[41].setRotationPoint(34F, 0F, -6.75F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 273 cull
        bodyModel[42].setRotationPoint(33.75F, 0F, -6.75F);

        bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
        bodyModel[43].setRotationPoint(16F, 3F, -2F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
        bodyModel[44].setRotationPoint(-35.75F, 0F, 4.75F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 ditchlight fl
        bodyModel[45].setRotationPoint(-36F, 0F, 4.75F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 322 cull
        bodyModel[46].setRotationPoint(33.75F, 0F, 4.75F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 323 ditchlight r
        bodyModel[47].setRotationPoint(34F, 0F, 4.75F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
        bodyModel[48].setRotationPoint(30F, 3F, -3F);

        bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 325
        bodyModel[49].setRotationPoint(32F, 3F, -3F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 401
        bodyModel[50].setRotationPoint(-30F, 1F, -11F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 404
        bodyModel[51].setRotationPoint(-31F, -13F, -7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 405
        bodyModel[52].setRotationPoint(-31F, -13F, -6F);

        bodyModel[53].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 406
        bodyModel[53].setRotationPoint(-31F, -17F, -1F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 409
        bodyModel[54].setRotationPoint(-31F, -17F, 1F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
        bodyModel[55].setRotationPoint(-31F, -17F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 headlight f
        bodyModel[56].setRotationPoint(-31.25F, -15F, -1F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 headlight f
        bodyModel[57].setRotationPoint(-31.25F, -17F, -1F);

        bodyModel[58].addBox(0F, 0F, 0F, 18, 17, 14, 0F); // Box 938
        bodyModel[58].setRotationPoint(10F, -17F, -7F);

        bodyModel[59].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 939
        bodyModel[59].setRotationPoint(-1F, -20F, -11F);

        bodyModel[60].addBox(0F, 0F, 0F, 12, 8, 22, 0F); // Box 940
        bodyModel[60].setRotationPoint(-2F, -8F, -11F);

        bodyModel[61].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 944
        bodyModel[61].setRotationPoint(-1F, -20F, 10F);

        bodyModel[62].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 314 door swing right
        bodyModel[62].setRotationPoint(9.5F, -20F, 7.5F);

        bodyModel[63].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 315 door swing right
        bodyModel[63].setRotationPoint(-1.5F, -20F, -7.5F);

        bodyModel[64].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 1158
        bodyModel[64].setRotationPoint(9F, -20F, -11F);

        bodyModel[65].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 1159
        bodyModel[65].setRotationPoint(-2F, -20F, 7F);

        bodyModel[66].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 1510
        bodyModel[66].setRotationPoint(-2F, -20F, -7F);

        bodyModel[67].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 1513
        bodyModel[67].setRotationPoint(9F, -20F, -7F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1516
        bodyModel[68].setRotationPoint(-31F, -9F, -6F);

        bodyModel[69].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 1517
        bodyModel[69].setRotationPoint(-30F, -9F, -7F);

        bodyModel[70].addBox(0F, 0F, 0F, 2, 3, 8, 0F); // Box 1518
        bodyModel[70].setRotationPoint(-31F, -12F, -4F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F); // Box 1519
        bodyModel[71].setRotationPoint(-32F, -12F, -7F);

        bodyModel[72].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1521 markerlight
        bodyModel[72].setRotationPoint(-30F, -11.5F, -5.37F);
        bodyModel[72].rotateAngleY = 0.48869219F;

        bodyModel[73].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1522 markerlight
        bodyModel[73].setRotationPoint(-30F, -11.5F, 5.37F);
        bodyModel[73].rotateAngleY = -0.48869219F;

        bodyModel[74].addBox(0F, 0F, 0F, 2, 3, 8, 0F); // Box 1523
        bodyModel[74].setRotationPoint(28F, -12F, -4F);

        bodyModel[75].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1526 markerlight
        bodyModel[75].setRotationPoint(29F, -11.5F, -5.37F);
        bodyModel[75].rotateAngleY = 1.11701072F;

        bodyModel[76].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1527 markerlight
        bodyModel[76].setRotationPoint(29F, -11.5F, 5.37F);
        bodyModel[76].rotateAngleY = -1.11701072F;

        bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 1528
        bodyModel[77].setRotationPoint(-4.5F, 4F, 8F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 1529
        bodyModel[78].setRotationPoint(-4F, -21F, -1.5F);

        bodyModel[79].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 1530
        bodyModel[79].setRotationPoint(-10F, -19F, -1.5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1534
        bodyModel[80].setRotationPoint(-11F, -19F, -1.5F);

        bodyModel[81].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 1536
        bodyModel[81].setRotationPoint(-23F, -17.5F, -2F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 gyralight FL
        bodyModel[82].setRotationPoint(-31.5F, -12.25F, -2F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1538 gyralight FL
        bodyModel[83].setRotationPoint(-31.5F, -12.25F, 0F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 1540
        bodyModel[84].setRotationPoint(-28F, -15F, 6.25F);

        bodyModel[85].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 192
        bodyModel[85].setRotationPoint(-31.25F, -19F, -1F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 193 sp gyralight FU
        bodyModel[86].setRotationPoint(-31.5F, -19F, -1F);

        bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 194
        bodyModel[87].setRotationPoint(28.25F, -19F, -1F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 195 sp gyralight RU
        bodyModel[88].setRotationPoint(29.5F, -19F, -1F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 196 gyralight RL
        bodyModel[89].setRotationPoint(29.5F, -12.25F, -2F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 197 gyralight RL
        bodyModel[90].setRotationPoint(29.5F, -12.25F, 0F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 198
        bodyModel[91].setRotationPoint(-30F, 4F, -11F);
        bodyModel[91].rotateAngleY = 0.46251225F;

        bodyModel[92].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        bodyModel[92].setRotationPoint(-30F, 4F, 11F);
        bodyModel[92].rotateAngleY = -0.46251225F;

        bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        bodyModel[93].setRotationPoint(-30F, 1F, 7F);

        bodyModel[94].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[94].setRotationPoint(29F, 4F, 11F);
        bodyModel[94].rotateAngleY = 0.46251225F;

        bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[95].setRotationPoint(29F, 1F, 7F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
        bodyModel[96].setRotationPoint(29F, 4F, -11F);
        bodyModel[96].rotateAngleY = -0.46251225F;

        bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 225
        bodyModel[97].setRotationPoint(29F, 1F, -11F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        bodyModel[98].setRotationPoint(29F, 0F, -11F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 230
        bodyModel[99].setRotationPoint(29F, 0F, 7F);

        bodyModel[100].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 232
        bodyModel[100].setRotationPoint(34F, -9F, -7F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 233
        bodyModel[101].setRotationPoint(34F, -8F, -9F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 234
        bodyModel[102].setRotationPoint(34F, -8F, 8F);

        bodyModel[103].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 235
        bodyModel[103].setRotationPoint(34F, -1F, 10F);

        bodyModel[104].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 236
        bodyModel[104].setRotationPoint(34F, -1F, -11F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 237
        bodyModel[105].setRotationPoint(10F, -20F, -0.5F);

        bodyModel[106].addBox(0F, 0F, 0F, 21, 8, 0, 0F); // Box 238
        bodyModel[106].setRotationPoint(-30F, -8F, -11F);

        bodyModel[107].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        bodyModel[107].setRotationPoint(-30.5F, -7F, -11F);
        bodyModel[107].rotateAngleY = 0.4712389F;

        bodyModel[108].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 250
        bodyModel[108].setRotationPoint(-30.5F, -8F, -11F);
        bodyModel[108].rotateAngleY = 0.4712389F;

        bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 241 sp light mount
        bodyModel[109].setRotationPoint(29.25F, -12.25F, -2F);

        bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 242 sp light mount
        bodyModel[110].setRotationPoint(-31.25F, -12.25F, -2F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
        bodyModel[111].setRotationPoint(-3F, -14F, -11F);

        bodyModel[112].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 361
        bodyModel[112].setRotationPoint(17F, -8F, 11F);

        bodyModel[113].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        bodyModel[113].setRotationPoint(-30.5F, -7F, 11F);
        bodyModel[113].rotateAngleY = -0.4712389F;

        bodyModel[114].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 363
        bodyModel[114].setRotationPoint(-30.5F, -8F, 11F);
        bodyModel[114].rotateAngleY = -0.4712389F;

        bodyModel[115].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 364
        bodyModel[115].setRotationPoint(-35F, -1F, -11F);

        bodyModel[116].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 365
        bodyModel[116].setRotationPoint(34.01F, 0F, -11F);

        bodyModel[117].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 366
        bodyModel[117].setRotationPoint(29.5F, -8F, -11F);
        bodyModel[117].rotateAngleY = -0.4712389F;

        bodyModel[118].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
        bodyModel[118].setRotationPoint(29.5F, -7F, -11F);
        bodyModel[118].rotateAngleY = -0.4712389F;

        bodyModel[119].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 370
        bodyModel[119].setRotationPoint(29.5F, -8F, 11F);
        bodyModel[119].rotateAngleY = 0.4712389F;

        bodyModel[120].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
        bodyModel[120].setRotationPoint(29.5F, -7F, 11F);
        bodyModel[120].rotateAngleY = 0.4712389F;

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
        bodyModel[121].setRotationPoint(-31F, -8F, -11F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
        bodyModel[122].setRotationPoint(-31F, -8F, 11F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
        bodyModel[123].setRotationPoint(29F, -8F, 11F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
        bodyModel[124].setRotationPoint(29F, -8F, -11F);

        bodyModel[125].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 377
        bodyModel[125].setRotationPoint(-6F, -18F, -7F);

        bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
        bodyModel[126].setRotationPoint(-4F, -21F, 4F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        bodyModel[127].setRotationPoint(10F, -20F, 0F);

        bodyModel[128].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 385
        bodyModel[128].setRotationPoint(-35F, -1F, 10F);

        bodyModel[129].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 386
        bodyModel[129].setRotationPoint(-2F, -18F, 11F);
        bodyModel[129].rotateAngleX = -0.87266463F;

        bodyModel[130].addBox(0F, 0F, -2F, 12, 0, 2, 0F); // Box 387
        bodyModel[130].setRotationPoint(-2F, -18F, -11F);
        bodyModel[130].rotateAngleX = 0.87266463F;

        bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
        bodyModel[131].setRotationPoint(-29.5F, -17.5F, -1F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 389
        bodyModel[132].setRotationPoint(26.5F, -17.5F, -1F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box WW F1T cull
        bodyModel[133].setRotationPoint(2F, -18F, -13F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 WW F1B cull
        bodyModel[134].setRotationPoint(2F, -17F, -15F);

        bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 392
        bodyModel[135].setRotationPoint(14F, -17.75F, -4F);

        bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 393
        bodyModel[136].setRotationPoint(25F, -17.75F, 2F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 395 WW E1B cull
        bodyModel[137].setRotationPoint(0F, -17F, 10F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396 WW E1T cull
        bodyModel[138].setRotationPoint(0F, -18F, 10F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        bodyModel[139].setRotationPoint(-8F, 1.75F, 9.5F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[140].setRotationPoint(-8F, 0.75F, 9.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        bodyModel[141].setRotationPoint(-7.75F, 2.25F, 9.75F);

        bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 403
        bodyModel[142].setRotationPoint(-36F, 7F, -10F);

        bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 404
        bodyModel[143].setRotationPoint(-36F, 7F, 3F);

        bodyModel[144].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 405
        bodyModel[144].setRotationPoint(-38F, 8F, -10F);

        bodyModel[145].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 406
        bodyModel[145].setRotationPoint(-38F, 8F, 3F);

        bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 407
        bodyModel[146].setRotationPoint(-38F, 7F, 3F);

        bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 408
        bodyModel[147].setRotationPoint(-38F, 7F, -3F);

        bodyModel[148].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 242
        bodyModel[148].setRotationPoint(34F, 8F, -10F);

        bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 243
        bodyModel[149].setRotationPoint(34F, 7F, -10F);

        bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 244
        bodyModel[150].setRotationPoint(34F, 7F, -3F);

        bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 245
        bodyModel[151].setRotationPoint(34F, 7F, 3F);

        bodyModel[152].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 246
        bodyModel[152].setRotationPoint(34F, 8F, 3F);

        bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 247
        bodyModel[153].setRotationPoint(34F, 7F, 3F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[154].setRotationPoint(-35F, -3F, 3F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
        bodyModel[155].setRotationPoint(-35F, -3F, -5F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight fu
        bodyModel[156].setRotationPoint(-35.25F, -3F, 3F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight fu
        bodyModel[157].setRotationPoint(-35.25F, -3F, -5F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 252
        bodyModel[158].setRotationPoint(33F, -3F, 3F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 253 ditchlight r
        bodyModel[159].setRotationPoint(33.25F, -3F, 3F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
        bodyModel[160].setRotationPoint(33F, -3F, -5F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 255 ditchlight r
        bodyModel[161].setRotationPoint(33.25F, -3F, -5F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        bodyModel[162].setRotationPoint(-12.5F, -20F, -0.5F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[163].setRotationPoint(-12.5F, -21F, -0.5F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        bodyModel[164].setRotationPoint(-12.25F, -19.5F, -0.25F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
        bodyModel[165].setRotationPoint(-12.5F, -18F, -2F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
        bodyModel[166].setRotationPoint(-12.5F, -21F, -2F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[167].setRotationPoint(-12.5F, -21F, 1F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        bodyModel[168].setRotationPoint(-12.5F, -21.5F, -1F);

        bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
        bodyModel[169].setRotationPoint(-12.5F, -17.5F, -1F);

        bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 268
        bodyModel[170].setRotationPoint(-6F, -20F, 3F);

        bodyModel[171].addBox(-0.5F, 0F, 0F, 3, 1, 1, 0F); // Box 269
        bodyModel[171].setRotationPoint(-5F, -20F, 4F);

        bodyModel[172].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 271
        bodyModel[172].setRotationPoint(-5F, -20F, 5F);

        bodyModel[173].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 378 cs
        bodyModel[173].setRotationPoint(-1F, -16F, 3.75F);

        bodyModel[174].addBox(0F, 0F, 0F, 8, 7, 2, 0F); // Box 148 cs
        bodyModel[174].setRotationPoint(-1F, -15.01F, -3F);
        bodyModel[174].rotateAngleY = -0.61086524F;

        bodyModel[175].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150 cs
        bodyModel[175].setRotationPoint(2F, -17.01F, -5.25F);
        bodyModel[175].rotateAngleY = -0.57595865F;

        bodyModel[176].addBox(0F, 0F, 0F, 2, 8, 6, 0F); // Box 152 cs
        bodyModel[176].setRotationPoint(0F, -16.01F, -3F);
        bodyModel[176].rotateAngleY = 0.15707963F;

        bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 383
        bodyModel[177].setRotationPoint(26.5F, -18.5F, -1F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 384
        bodyModel[178].setRotationPoint(-29.5F, -18.5F, -1F);

        bodyModel[179].addBox(0F, 0F, 0F, 11, 1, 16, 0F); // Box 385 tank main
        bodyModel[179].setRotationPoint(-6F, 8F, -8F);

        bodyModel[180].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 386
        bodyModel[180].setRotationPoint(-35F, 7F, -9F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        bodyModel[181].setRotationPoint(-35F, 8F, -11F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
        bodyModel[182].setRotationPoint(-35F, 5F, -10F);

        bodyModel[183].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 389
        bodyModel[183].setRotationPoint(-35F, 4F, -9F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
        bodyModel[184].setRotationPoint(-35F, 2.5F, -9F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
        bodyModel[185].setRotationPoint(-35F, 1.5F, -8F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        bodyModel[186].setRotationPoint(-35F, 0F, -8F);

        bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 393
        bodyModel[187].setRotationPoint(-35F, 7F, 9F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 394
        bodyModel[188].setRotationPoint(-35F, 8F, 9F);

        bodyModel[189].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
        bodyModel[189].setRotationPoint(-35F, 4F, 9F);

        bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
        bodyModel[190].setRotationPoint(-35F, 5F, 9F);

        bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
        bodyModel[191].setRotationPoint(-35F, 2.5F, 8F);

        bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
        bodyModel[192].setRotationPoint(-35F, 1.5F, 8F);

        bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 399
        bodyModel[193].setRotationPoint(-35F, 0F, 7F);

        bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[194].setRotationPoint(-36.5F, 1.5F, -2.5F);

        bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[195].setRotationPoint(33.5F, 1.5F, -2.5F);

        bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
        bodyModel[196].setRotationPoint(-36.5F, 2.5F, -3.5F);

        bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 304
        bodyModel[197].setRotationPoint(-36.5F, 2.5F, 2.5F);

        bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 305
        bodyModel[198].setRotationPoint(33.5F, 2.5F, 2.5F);

        bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
        bodyModel[199].setRotationPoint(33.5F, 2.5F, -3.5F);

        bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
        bodyModel[200].setRotationPoint(-36.5F, 5.5F, -3.5F);

        bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 308
        bodyModel[201].setRotationPoint(-36.5F, 5.5F, 2.5F);

        bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 309
        bodyModel[202].setRotationPoint(33.5F, 5.5F, 2.5F);

        bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
        bodyModel[203].setRotationPoint(33.5F, 5.5F, -3.5F);

        bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        bodyModel[204].setRotationPoint(-38F, 7F, -3F);

        bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
        bodyModel[205].setRotationPoint(34F, 7F, -3F);

        bodyModel[206].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 291 j2
        bodyModel[206].setRotationPoint(-18F, 1F, -11F);

        bodyModel[207].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 292 j2
        bodyModel[207].setRotationPoint(15F, 1F, -11F);

        bodyModel[208].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 293
        bodyModel[208].setRotationPoint(-30F, 1F, -11.01F);

        bodyModel[209].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 294
        bodyModel[209].setRotationPoint(-30F, 1F, 11.01F);

        bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
        bodyModel[210].setRotationPoint(-35F, -7F, 6F);

        bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
        bodyModel[211].setRotationPoint(-35F, -7F, -7F);

        bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 297
        bodyModel[212].setRotationPoint(34F, -7F, -7F);

        bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        bodyModel[213].setRotationPoint(34F, -7F, 6F);

        bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 299
        bodyModel[214].setRotationPoint(-35F, -3F, -8F);

        bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[215].setRotationPoint(-35F, -3F, 6F);

        bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[216].setRotationPoint(34F, -3F, 6F);

        bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 303
        bodyModel[217].setRotationPoint(34F, -3F, -8F);

        bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 305
        bodyModel[218].setRotationPoint(-28F, -15F, -7.25F);

        bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F); // Box 302 numberboard
        bodyModel[219].setRotationPoint(-31F, -16F, 1F);

        bodyModel[220].addShapeBox(0F, 0F, -6F, 1, 2, 6, 0F,-1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F); // Box 303 numberboard
        bodyModel[220].setRotationPoint(-31F, -16F, -1F);

        bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 309
        bodyModel[221].setRotationPoint(-31F, -13F, 6F);

        bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 310
        bodyModel[222].setRotationPoint(-31F, -13F, 1F);

        bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F); // Box 311
        bodyModel[223].setRotationPoint(-32F, -12F, 6F);

        bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 302 numberboard
        bodyModel[224].setRotationPoint(29F, -16F, 1F);

        bodyModel[225].addShapeBox(0F, 0F, -6F, 1, 2, 6, 0F,2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 303 numberboard
        bodyModel[225].setRotationPoint(29F, -16F, -1F);

        bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 322 tank extra 1
        bodyModel[226].setRotationPoint(-7F, 8F, -8F);

        bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 323 tank extra 1
        bodyModel[227].setRotationPoint(5F, 8F, -8F);

        bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, -1F); // Box 304
        bodyModel[228].setRotationPoint(28F, -12F, -7F);

        bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 2F, -1F, 0F, -3F, -0.5F, 0F, 0F); // Box 305
        bodyModel[229].setRotationPoint(28F, -12F, 6F);

        bodyModel[230].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
        bodyModel[230].setRotationPoint(-34.5F, 0F, -2F);
        bodyModel[230].rotateAngleZ = -1.48352986F;

        bodyModel[231].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
        bodyModel[231].setRotationPoint(33.5F, 0F, 2F);
        bodyModel[231].rotateAngleY = -3.14159265F;
        bodyModel[231].rotateAngleZ = -1.48352986F;

        bodyModel[232].addShapeBox(-5F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 314 cull crossover
        bodyModel[232].setRotationPoint(33.5F, 0F, 2F);
        bodyModel[232].rotateAngleY = -3.14159265F;
        bodyModel[232].rotateAngleZ = -1.48352986F;

        bodyModel[233].addShapeBox(-5F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull crossover
        bodyModel[233].setRotationPoint(-34.5F, 0F, -2F);
        bodyModel[233].rotateAngleZ = -1.48352986F;

        bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F); // Box 323
        bodyModel[234].setRotationPoint(-8F, -8F, -11F);

        bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 317
        bodyModel[235].setRotationPoint(-2.5F, -11F, -11F);

        bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F); // Box 318
        bodyModel[236].setRotationPoint(-7.5F, -5F, -11F);

        bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 319
        bodyModel[237].setRotationPoint(-9F, -8F, -11F);

        bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 320
        bodyModel[238].setRotationPoint(-8.5F, -5F, -11F);

        bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 330
        bodyModel[239].setRotationPoint(22F, -7F, -11.25F);

        bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[240].setRotationPoint(22.5F, -6.5F, -11F);

        bodyModel[241].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
        bodyModel[241].setRotationPoint(23F, -4.5F, -11F);

        bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 348 stair cull
        bodyModel[242].setRotationPoint(-3.5F, -6F, -11F);

        bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 349 stair cull
        bodyModel[243].setRotationPoint(-5F, -4F, -11F);

        bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 350 stair cull
        bodyModel[244].setRotationPoint(-6.5F, -2F, -11F);

        bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 358 stair cull
        bodyModel[245].setRotationPoint(9.5F, -6F, 7F);

        bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 359 stair cull
        bodyModel[246].setRotationPoint(11F, -4F, 7F);

        bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 360 stair cull
        bodyModel[247].setRotationPoint(12.5F, -2F, 7F);

        bodyModel[248].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,-3.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F); // Box 352
        bodyModel[248].setRotationPoint(7.5F, -5F, 11F);

        bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 353
        bodyModel[249].setRotationPoint(15.5F, -5F, 11F);

        bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 354
        bodyModel[250].setRotationPoint(16F, -8F, 11F);

        bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,-3.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 6F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F); // Box 355
        bodyModel[251].setRotationPoint(8F, -8F, 11F);

        bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        bodyModel[252].setRotationPoint(10F, -14F, 11F);

        bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357
        bodyModel[253].setRotationPoint(9.5F, -11F, 11F);

        bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 359
        bodyModel[254].setRotationPoint(-36F, -1F, -4F);

        bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
        bodyModel[255].setRotationPoint(34F, -1F, 2F);

        bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 380
        bodyModel[256].setRotationPoint(-3F, -18F, -1.5F);

        bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 381
        bodyModel[257].setRotationPoint(30F, 4F, -9F);

        bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
        bodyModel[258].setRotationPoint(30F, 5F, -10F);

        bodyModel[259].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 383
        bodyModel[259].setRotationPoint(30F, 7F, -9F);

        bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
        bodyModel[260].setRotationPoint(30F, 8F, -11F);

        bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
        bodyModel[261].setRotationPoint(30F, 2.5F, -9F);

        bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 386
        bodyModel[262].setRotationPoint(31F, 1.5F, -8F);

        bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
        bodyModel[263].setRotationPoint(31F, 0F, -8F);

        bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 388
        bodyModel[264].setRotationPoint(30F, 8F, 9F);

        bodyModel[265].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 389
        bodyModel[265].setRotationPoint(30F, 7F, 9F);

        bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 390
        bodyModel[266].setRotationPoint(30F, 5F, 9F);

        bodyModel[267].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 391
        bodyModel[267].setRotationPoint(30F, 4F, 9F);

        bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
        bodyModel[268].setRotationPoint(30F, 2.5F, 8F);

        bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 393
        bodyModel[269].setRotationPoint(31F, 1.5F, 8F);

        bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 394
        bodyModel[270].setRotationPoint(31F, 0F, 7F);

        bodyModel[271].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 945
        bodyModel[271].setRotationPoint(-3F, -21F, -10F);

        bodyModel[272].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        bodyModel[272].setRotationPoint(-3F, -21F, -11F);

        bodyModel[273].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
        bodyModel[273].setRotationPoint(-3F, -21F, 10F);

        bodyModel[274].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 313 mcrr thing
        bodyModel[274].setRotationPoint(-24F, -19F, -3F);

        bodyModel[275].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 314 mcrr thing
        bodyModel[275].setRotationPoint(-24F, -20F, -4F);

        bodyModel[276].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 361
        bodyModel[276].setRotationPoint(-3F, -20F, -1.5F);

        bodyModel[277].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 500
        bodyModel[277].setRotationPoint(15F, -17.75F, -2F);

        bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 1542
        bodyModel[278].setRotationPoint(18F, -9F, 6.05F);

        bodyModel[279].addShapeBox(0F, 0F, 0F, 10, 1, 24, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 394
        bodyModel[279].setRotationPoint(15.5F, -17.25F, -12F);

        bodyModel[280].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 304
        bodyModel[280].setRotationPoint(18F, -9F, -7.05F);
    }
    ModelTypeBnew typeB2 = new ModelTypeBnew();
    ModelHiAd hiAd = new ModelHiAd();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 281; i++) {
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
        if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 135461 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7234 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8546 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5546) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, -0.06, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.35, 0, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 0 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5462) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HiAd_Black.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, 0.0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.33, 0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13244 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 145) {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HiAd_Silver.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, 0.0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.33, 0, 0);
            hiAd.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        } else {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
            GL11.glPushMatrix();
            GL11.glTranslated(-1.2, -0.01, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);

            GL11.glTranslated(2.35, 0, 0);
            typeB2.render(entity, f, f1, f2, f3, f4, f5);
            GL11.glPopMatrix();
        }
    }

    public float[] getTrans() {
        return new float[]{-1.2F, 0.15F, 0.00F};
    }

    public ArrayList<double[]> getSmokePosition() {
        return new ArrayList<double[]>() {
            {
                add(new double[]{1.35D, 1.3D, 0.0D});
            }
        };
    }
}