//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: Apoc The Wanderer
// Created on:28.07.2017 - 12:22:41
// Last changed on: 28.07.2017 - 12:22:41
package train.client.render.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.tmt.ModelBase;
import train.client.tmt.ModelRendererTurbo;
import train.client.tmt.Tessellator;
import train.common.library.Info;

public class ModelEMDF3B extends ModelBase
{
    int textureX = 1024;
    int textureY = 512;

    public ModelEMDF3B()
    {
        emdf3bModel = new ModelRendererTurbo[132];
        emdf3bModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box001
        emdf3bModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box006
        emdf3bModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box019
        emdf3bModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box020
        emdf3bModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box021
        emdf3bModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box022
        emdf3bModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box065
        emdf3bModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box066
        emdf3bModel[8] = new ModelRendererTurbo(this, 363, 66, textureX, textureY); // Box070
        emdf3bModel[9] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box071
        emdf3bModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box072
        emdf3bModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box073
        emdf3bModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box074
        emdf3bModel[13] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box075
        emdf3bModel[14] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box076
        emdf3bModel[15] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box077
        emdf3bModel[16] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box078
        emdf3bModel[17] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box079
        emdf3bModel[18] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box080
        emdf3bModel[19] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box081
        emdf3bModel[20] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box082
        emdf3bModel[21] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box083
        emdf3bModel[22] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box093
        emdf3bModel[23] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box094
        emdf3bModel[24] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box096
        emdf3bModel[25] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box097
        emdf3bModel[26] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box098
        emdf3bModel[27] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box107
        emdf3bModel[28] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box108
        emdf3bModel[29] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box142
        emdf3bModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box143
        emdf3bModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box144
        emdf3bModel[32] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box145
        emdf3bModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box146
        emdf3bModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box148
        emdf3bModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box149
        emdf3bModel[36] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box156
        emdf3bModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box168
        emdf3bModel[38] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box170
        emdf3bModel[39] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box182
        emdf3bModel[40] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box186
        emdf3bModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box188
        emdf3bModel[42] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box191
        emdf3bModel[43] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box194
        emdf3bModel[44] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box195
        emdf3bModel[45] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box197
        emdf3bModel[46] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box199
        emdf3bModel[47] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 338
        emdf3bModel[48] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 339
        emdf3bModel[49] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 342
        emdf3bModel[50] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 345
        emdf3bModel[51] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 348
        emdf3bModel[52] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 353
        emdf3bModel[53] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 354
        emdf3bModel[54] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 248
        emdf3bModel[55] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 249
        emdf3bModel[56] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 250
        emdf3bModel[57] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 249
        emdf3bModel[58] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 250
        emdf3bModel[59] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 251
        emdf3bModel[60] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 252
        emdf3bModel[61] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 253
        emdf3bModel[62] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 254
        emdf3bModel[63] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 255
        emdf3bModel[64] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 256
        emdf3bModel[65] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 257
        emdf3bModel[66] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 263
        emdf3bModel[67] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 264
        emdf3bModel[68] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 265
        emdf3bModel[69] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 267
        emdf3bModel[70] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 269
        emdf3bModel[71] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 270
        emdf3bModel[72] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 271
        emdf3bModel[73] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 272
        emdf3bModel[74] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 273
        emdf3bModel[75] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 274
        emdf3bModel[76] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 275
        emdf3bModel[77] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 276
        emdf3bModel[78] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 277
        emdf3bModel[79] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 278
        emdf3bModel[80] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 279
        emdf3bModel[81] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 280
        emdf3bModel[82] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 281
        emdf3bModel[83] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 282
        emdf3bModel[84] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 283
        emdf3bModel[85] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 284
        emdf3bModel[86] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 285
        emdf3bModel[87] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 286
        emdf3bModel[88] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 287
        emdf3bModel[89] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 288
        emdf3bModel[90] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 289
        emdf3bModel[91] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 290
        emdf3bModel[92] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 291
        emdf3bModel[93] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 292
        emdf3bModel[94] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 293
        emdf3bModel[95] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 294
        emdf3bModel[96] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 295
        emdf3bModel[97] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 296
        emdf3bModel[98] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 297
        emdf3bModel[99] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 298
        emdf3bModel[100] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 300
        emdf3bModel[101] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 301
        emdf3bModel[102] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 302
        emdf3bModel[103] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 303
        emdf3bModel[104] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 304
        emdf3bModel[105] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 305
        emdf3bModel[106] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 306
        emdf3bModel[107] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 307
        emdf3bModel[108] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 308
        emdf3bModel[109] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 309
        emdf3bModel[110] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 310
        emdf3bModel[111] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 311
        emdf3bModel[112] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 312
        emdf3bModel[113] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 313
        emdf3bModel[114] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 314
        emdf3bModel[115] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 315
        emdf3bModel[116] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 316
        emdf3bModel[117] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 317
        emdf3bModel[118] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 318
        emdf3bModel[119] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 319
        emdf3bModel[120] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 320
        emdf3bModel[121] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 321
        emdf3bModel[122] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 322
        emdf3bModel[123] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 323
        emdf3bModel[124] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 324
        emdf3bModel[125] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 325
        emdf3bModel[126] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 326
        emdf3bModel[127] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 327
        emdf3bModel[128] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 328
        emdf3bModel[129] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 329
        emdf3bModel[130] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 330
        emdf3bModel[131] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 135

        emdf3bModel[0].addBox(0F, 0F, 0F, 78, 1, 22, 0F); // Box001
        emdf3bModel[0].setRotationPoint(-38F, 1F, -11F);

        emdf3bModel[1].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box006
        emdf3bModel[1].setRotationPoint(-38F, -23F, 9F);

        emdf3bModel[2].addBox(0F, 0F, -11F, 6, 6, 22, 0F); // Box019
        emdf3bModel[2].setRotationPoint(-11F, 2F, 0F);

        emdf3bModel[3].addShapeBox(0F, 0F, -11F, 17, 3, 22, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box020
        emdf3bModel[3].setRotationPoint(-5F, 2F, 0F);

        emdf3bModel[4].addBox(0F, 0F, -11F, 15, 3, 22, 0F); // Box021
        emdf3bModel[4].setRotationPoint(-4F, 5F, 0F);

        emdf3bModel[5].addShapeBox(0F, 0F, -10F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box022
        emdf3bModel[5].setRotationPoint(2F, 8F, 0F);

        emdf3bModel[6].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box065
        emdf3bModel[6].setRotationPoint(4F, -26.75F, 0F);

        emdf3bModel[7].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box066
        emdf3bModel[7].setRotationPoint(16F, -26.75F, 0F);

        emdf3bModel[8].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box070
        emdf3bModel[8].setRotationPoint(-15F, -25F, -3F);

        emdf3bModel[9].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box071
        emdf3bModel[9].setRotationPoint(23F, -25F, -3F);

        emdf3bModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box072
        emdf3bModel[10].setRotationPoint(0F, -25.75F, -2F);

        emdf3bModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box073
        emdf3bModel[11].setRotationPoint(-1F, -25.75F, -2F);

        emdf3bModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box074
        emdf3bModel[12].setRotationPoint(2F, -25.75F, -2F);

        emdf3bModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box075
        emdf3bModel[13].setRotationPoint(7F, -25.75F, -2F);

        emdf3bModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box076
        emdf3bModel[14].setRotationPoint(6F, -25.75F, -2F);

        emdf3bModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box077
        emdf3bModel[15].setRotationPoint(9F, -25.75F, -2F);

        emdf3bModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box078
        emdf3bModel[16].setRotationPoint(12F, -25.75F, -2F);

        emdf3bModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box079
        emdf3bModel[17].setRotationPoint(11F, -25.75F, -2F);

        emdf3bModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box080
        emdf3bModel[18].setRotationPoint(14F, -25.75F, -2F);

        emdf3bModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box081
        emdf3bModel[19].setRotationPoint(19F, -25.75F, -2F);

        emdf3bModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box082
        emdf3bModel[20].setRotationPoint(18F, -25.75F, -2F);

        emdf3bModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box083
        emdf3bModel[21].setRotationPoint(21F, -25.75F, -2F);

        emdf3bModel[22].addShapeBox(0F, 0F, -3F, 25, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box093
        emdf3bModel[22].setRotationPoint(-2F, -25F, 0F);

        emdf3bModel[23].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box094
        emdf3bModel[23].setRotationPoint(-38F, -24F, 8F);

        emdf3bModel[24].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box096
        emdf3bModel[24].setRotationPoint(39F, -24F, 0F);

        emdf3bModel[25].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box097
        emdf3bModel[25].setRotationPoint(-38F, -25F, 6F);

        emdf3bModel[26].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 2F, -1.1F, 1F, 2F, -1.1F, 1F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box098
        emdf3bModel[26].setRotationPoint(-38F, -26F, 4F);

        emdf3bModel[27].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box107
        emdf3bModel[27].setRotationPoint(39F, -25F, 0F);

        emdf3bModel[28].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F); // Box108
        emdf3bModel[28].setRotationPoint(39F, -26F, 0F);

        emdf3bModel[29].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box142
        emdf3bModel[29].setRotationPoint(40F, -18F, -4F);

        emdf3bModel[30].addShapeBox(0F, 0F, 0F, 4, 8, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, -36F, 0F, -6F, -36F); // Box143
        emdf3bModel[30].setRotationPoint(40F, -20F, -6F);

        emdf3bModel[31].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box144
        emdf3bModel[31].setRotationPoint(-26.5F, -11F, -12F);

        emdf3bModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box145
        emdf3bModel[32].setRotationPoint(-26.5F, -11F, -12F);

        emdf3bModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box146
        emdf3bModel[33].setRotationPoint(-21.5F, -11F, -12F);

        emdf3bModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box148
        emdf3bModel[34].setRotationPoint(-26.5F, 0.4F, -12F);

        emdf3bModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box149
        emdf3bModel[35].setRotationPoint(-21.5F, 0.4F, -12F);

        emdf3bModel[36].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box156
        emdf3bModel[36].setRotationPoint(35F, 2F, -1.5F);

        emdf3bModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box168
        emdf3bModel[37].setRotationPoint(24.1F, 2F, -11F);

        emdf3bModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box170
        emdf3bModel[38].setRotationPoint(27.1F, 2F, -11F);

        emdf3bModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -36F, 0F, -3F, -36F); // Box182
        emdf3bModel[39].setRotationPoint(40F, 0F, -6F);

        emdf3bModel[40].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box186
        emdf3bModel[40].setRotationPoint(-37.5F, -7F, -12F);

        emdf3bModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box188
        emdf3bModel[41].setRotationPoint(-37.5F, 0.4F, -12F);

        emdf3bModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box191
        emdf3bModel[42].setRotationPoint(-35.5F, 0.4F, -12F);

        emdf3bModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box194
        emdf3bModel[43].setRotationPoint(37.5F, 0.4F, 11F);

        emdf3bModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box195
        emdf3bModel[44].setRotationPoint(39.5F, -7F, 11F);

        emdf3bModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box197
        emdf3bModel[45].setRotationPoint(39.5F, 0.4F, 11F);

        emdf3bModel[46].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box199
        emdf3bModel[46].setRotationPoint(40F, -18F, 6F);

        emdf3bModel[47].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box 338
        emdf3bModel[47].setRotationPoint(-21.5F, -11F, -12F);

        emdf3bModel[48].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box 339
        emdf3bModel[48].setRotationPoint(-35.5F, -7F, -12F);

        emdf3bModel[49].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box 342
        emdf3bModel[49].setRotationPoint(37.5F, -7F, 8F);

        emdf3bModel[50].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box 345
        emdf3bModel[50].setRotationPoint(39.5F, -7F, 8F);

        emdf3bModel[51].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // Box 348
        emdf3bModel[51].setRotationPoint(-25.4F, 0F, -12F);

        emdf3bModel[52].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 353
        emdf3bModel[52].setRotationPoint(25.1F, 6F, -11F);

        emdf3bModel[53].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 354
        emdf3bModel[53].setRotationPoint(25.1F, 3.5F, -11F);

        emdf3bModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box 248
        emdf3bModel[54].setRotationPoint(37.5F, -7F, 11F);

        emdf3bModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 249
        emdf3bModel[55].setRotationPoint(-35.5F, -7F, -12F);

        emdf3bModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 250
        emdf3bModel[56].setRotationPoint(-37.5F, -7F, -12F);

        emdf3bModel[57].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box 249
        emdf3bModel[57].setRotationPoint(-39F, -18F, 6F);

        emdf3bModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -36F, 0F, -3F, -36F); // Box 250
        emdf3bModel[58].setRotationPoint(-39F, 0F, -6F);

        emdf3bModel[59].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 251
        emdf3bModel[59].setRotationPoint(-40F, 2F, -1.5F);

        emdf3bModel[60].addShapeBox(0F, 0F, -2F, 4, 72, 8, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, -54F, 0F, -3F, -54F, 0F, -3F, -54F, -6F, 0F, -54F, -6F); // Box 252
        emdf3bModel[60].setRotationPoint(-39F, -18F, -4F);

        emdf3bModel[61].addShapeBox(0F, 0F, 0F, 4, 8, 48, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -36F, 0F, 0F, -36F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, -36F, 0F, -6F, -36F); // Box 253
        emdf3bModel[61].setRotationPoint(-39F, -20F, -6F);

        emdf3bModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
        emdf3bModel[62].setRotationPoint(-25.9F, 2F, -11F);

        emdf3bModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
        emdf3bModel[63].setRotationPoint(-22.9F, 2F, -11F);

        emdf3bModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 256
        emdf3bModel[64].setRotationPoint(-24.9F, 3.5F, -11F);

        emdf3bModel[65].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 257
        emdf3bModel[65].setRotationPoint(-24.9F, 6F, -11F);

        emdf3bModel[66].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box 263
        emdf3bModel[66].setRotationPoint(-37.5F, -7F, 8F);

        emdf3bModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 264
        emdf3bModel[67].setRotationPoint(-37.5F, 0.4F, 11F);

        emdf3bModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 265
        emdf3bModel[68].setRotationPoint(-35.5F, 0.4F, 11F);

        emdf3bModel[69].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -24F, -3.4F, -3.8F, -24F, -3.4F, -3.8F, -24F, -0.4F, 0F, -24F, -0.4F); // Box 267
        emdf3bModel[69].setRotationPoint(-35.5F, -7F, 8F);

        emdf3bModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box 269
        emdf3bModel[70].setRotationPoint(-35.5F, -7F, 11F);

        emdf3bModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1.5F, 0F, -0.8F, -1.5F, 0F, -0.8F, -1.5F, -0.6F, 0F, -1.5F, -0.6F); // Box 270
        emdf3bModel[71].setRotationPoint(-37.5F, -7F, 11F);

        emdf3bModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 271
        emdf3bModel[72].setRotationPoint(28.5F, -11F, -12F);

        emdf3bModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 272
        emdf3bModel[73].setRotationPoint(28.5F, 0.4F, -12F);

        emdf3bModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 273
        emdf3bModel[74].setRotationPoint(23.5F, -11F, -12F);

        emdf3bModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 274
        emdf3bModel[75].setRotationPoint(37.5F, 0.4F, -12F);

        emdf3bModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 275
        emdf3bModel[76].setRotationPoint(39.5F, -7F, -12F);

        emdf3bModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 276
        emdf3bModel[77].setRotationPoint(39.5F, 0.4F, -12F);

        emdf3bModel[78].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box 277
        emdf3bModel[78].setRotationPoint(23.5F, -11F, -12F);

        emdf3bModel[79].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box 278
        emdf3bModel[79].setRotationPoint(37.5F, -7F, -12F);

        emdf3bModel[80].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -36F, -0.4F, -3.8F, -36F, -0.4F, -3.8F, -36F, -3.4F, 0F, -36F, -3.4F); // Box 279
        emdf3bModel[80].setRotationPoint(28.5F, -11F, -12F);

        emdf3bModel[81].addShapeBox(0F, 0F, 0F, 4, 32, 4, 0F, 0F, 0F, -0.4F, -3.8F, 0F, -0.4F, -3.8F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -24F, -0.4F, -3.8F, -24F, -0.4F, -3.8F, -24F, -3.4F, 0F, -24F, -3.4F); // Box 280
        emdf3bModel[81].setRotationPoint(39.5F, -7F, -12F);

        emdf3bModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.6F, -0.8F, -1.5F, -0.6F, -0.8F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 281
        emdf3bModel[82].setRotationPoint(37.5F, -7F, -12F);

        emdf3bModel[83].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -9F, -3F, 0F, -9F, -3F, -3F, 0F, -3F, -3F); // Box 282
        emdf3bModel[83].setRotationPoint(24.63F, 0F, -12F);

        emdf3bModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        emdf3bModel[84].setRotationPoint(-35F, 2F, -11F);

        emdf3bModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
        emdf3bModel[85].setRotationPoint(-38F, 2F, -11F);

        emdf3bModel[86].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 285
        emdf3bModel[86].setRotationPoint(-37F, 3.5F, -11F);

        emdf3bModel[87].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 286
        emdf3bModel[87].setRotationPoint(-37F, 6F, -11F);

        emdf3bModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        emdf3bModel[88].setRotationPoint(-35F, 2F, 10F);

        emdf3bModel[89].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 288
        emdf3bModel[89].setRotationPoint(-37F, 3.5F, 7F);

        emdf3bModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
        emdf3bModel[90].setRotationPoint(-38F, 2F, 10F);

        emdf3bModel[91].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 290
        emdf3bModel[91].setRotationPoint(-37F, 6F, 7F);

        emdf3bModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
        emdf3bModel[92].setRotationPoint(39F, 2F, -11F);

        emdf3bModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
        emdf3bModel[93].setRotationPoint(36F, 2F, -11F);

        emdf3bModel[94].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 293
        emdf3bModel[94].setRotationPoint(37F, 3.5F, -11F);

        emdf3bModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, -3F, 0F, -3F, -3F); // Box 294
        emdf3bModel[95].setRotationPoint(37F, 6F, -11F);

        emdf3bModel[96].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        emdf3bModel[96].setRotationPoint(39F, 2F, 10F);

        emdf3bModel[97].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 296
        emdf3bModel[97].setRotationPoint(37F, 3.5F, 7F);

        emdf3bModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
        emdf3bModel[98].setRotationPoint(36F, 2F, 10F);

        emdf3bModel[99].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 298
        emdf3bModel[99].setRotationPoint(37F, 6F, 7F);

        emdf3bModel[100].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F, 2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 2F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 300
        emdf3bModel[100].setRotationPoint(-38F, -25F, -3F);

        emdf3bModel[101].addShapeBox(0F, 0F, 0F, 78, 1, 2, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        emdf3bModel[101].setRotationPoint(-38F, -23F, -11F);

        emdf3bModel[102].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 302
        emdf3bModel[102].setRotationPoint(-38F, -24F, -9F);

        emdf3bModel[103].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Box 303
        emdf3bModel[103].setRotationPoint(-38F, -25F, -7F);

        emdf3bModel[104].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 2F, -1.1F, 1F, 2F, -1.1F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F); // Box 304
        emdf3bModel[104].setRotationPoint(-38F, -26F, -5F);

        emdf3bModel[105].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, -1.75F, -7F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0.25F, -5F); // Box 305
        emdf3bModel[105].setRotationPoint(-38F, -26F, 0F);

        emdf3bModel[106].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 306
        emdf3bModel[106].setRotationPoint(-38F, -25F, 0F);

        emdf3bModel[107].addShapeBox(0F, 0F, -10F, 1, 2, 20, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 307
        emdf3bModel[107].setRotationPoint(-38F, -24F, 0F);

        emdf3bModel[108].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box 308
        emdf3bModel[108].setRotationPoint(-26.5F, -11F, 8F);

        emdf3bModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 309
        emdf3bModel[109].setRotationPoint(-26.5F, -11F, 11F);

        emdf3bModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 310
        emdf3bModel[110].setRotationPoint(-21.5F, -11F, 11F);

        emdf3bModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 311
        emdf3bModel[111].setRotationPoint(-26.5F, 0.4F, 11F);

        emdf3bModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 312
        emdf3bModel[112].setRotationPoint(-21.5F, 0.4F, 11F);

        emdf3bModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
        emdf3bModel[113].setRotationPoint(24.1F, 2F, 10F);

        emdf3bModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        emdf3bModel[114].setRotationPoint(27.1F, 2F, 10F);

        emdf3bModel[115].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box 315
        emdf3bModel[115].setRotationPoint(-21.5F, -11F, 8F);

        emdf3bModel[116].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 316
        emdf3bModel[116].setRotationPoint(-25.4F, 0F, 8F);

        emdf3bModel[117].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 317
        emdf3bModel[117].setRotationPoint(25.1F, 6F, 7F);

        emdf3bModel[118].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 318
        emdf3bModel[118].setRotationPoint(25.1F, 3.5F, 7F);

        emdf3bModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
        emdf3bModel[119].setRotationPoint(-25.9F, 2F, 10F);

        emdf3bModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        emdf3bModel[120].setRotationPoint(-22.9F, 2F, 10F);

        emdf3bModel[121].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 321
        emdf3bModel[121].setRotationPoint(-24.9F, 3.5F, 7F);

        emdf3bModel[122].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, -0.5F, -3F, -6F, -0.5F, -3F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -6F, -3F, -3F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 322
        emdf3bModel[122].setRotationPoint(-24.9F, 6F, 7F);

        emdf3bModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 323
        emdf3bModel[123].setRotationPoint(28.5F, -11F, 11F);

        emdf3bModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 324
        emdf3bModel[124].setRotationPoint(28.5F, 0.4F, 11F);

        emdf3bModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 325
        emdf3bModel[125].setRotationPoint(23.5F, -11F, 11F);

        emdf3bModel[126].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box 326
        emdf3bModel[126].setRotationPoint(23.5F, -11F, 8F);

        emdf3bModel[127].addShapeBox(0F, 0F, 0F, 4, 48, 4, 0F, 0F, 0F, -3.4F, -3.8F, 0F, -3.4F, -3.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -36F, -3.4F, -3.8F, -36F, -3.4F, -3.8F, -36F, -0.4F, 0F, -36F, -0.4F); // Box 327
        emdf3bModel[127].setRotationPoint(28.5F, -11F, 8F);

        emdf3bModel[128].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, -0.5F, -3F, -9F, -0.5F, -3F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -3F, -9F, -3F, -3F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 328
        emdf3bModel[128].setRotationPoint(24.63F, 0F, 8F);

        emdf3bModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.6F, -0.8F, -0.4F, -0.6F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 329
        emdf3bModel[129].setRotationPoint(23.5F, 0.4F, -12F);

        emdf3bModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 330
        emdf3bModel[130].setRotationPoint(23.5F, 0.4F, 11F);

        emdf3bModel[131].addShapeBox(0F, 0F, -11F, 312, 92, 88, 0F, 0F, 0F, 0F, -234F, 0F, 0F, -234F, 0F, -66F, 0F, 0F, -66F, 0F, -69F, 0F, -234F, -69F, 0F, -234F, -69F, -66F, 0F, -69F, -66F); // Box 135
        emdf3bModel[131].setRotationPoint(-38F, -22F, 0F);


    }
    private ModelBloombergTrucks fronttrucks = new ModelBloombergTrucks();
    private ModelBloombergTrucks backtrucks = new ModelBloombergTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 132; i++)
        {
            emdf3bModel[i].render(f5);
        }
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(-1.5,0.6,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        fronttrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/trains/Blomberg_b_trucks.png"));
        GL11.glTranslated(1.55,0.6,0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
        backtrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo emdf3bModel[];
}
