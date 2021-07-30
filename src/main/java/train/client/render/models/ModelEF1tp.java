//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EF-1 truck and pilot
// Model Creator: 
// Created on: 25.10.2020 - 23:20:41
// Last changed on: 25.10.2020 - 23:20:41

package train.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelEF1tp extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelEF1tp() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[135];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 329 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 330 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 331 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 332 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 333
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 334
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 335
		bodyModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 336
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 339
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 341
		bodyModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 342
		bodyModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 343
		bodyModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 344
		bodyModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 345
		bodyModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 346
		bodyModel[15] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 347
		bodyModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 348
		bodyModel[17] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 349
		bodyModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 350
		bodyModel[19] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 351
		bodyModel[20] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 352
		bodyModel[21] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 353
		bodyModel[22] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 354
		bodyModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 355
		bodyModel[24] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 356
		bodyModel[25] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 357
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 358
		bodyModel[27] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 359
		bodyModel[28] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 360
		bodyModel[29] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 361
		bodyModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 362
		bodyModel[31] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 363
		bodyModel[32] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 364
		bodyModel[33] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 365
		bodyModel[34] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 369
		bodyModel[35] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 370
		bodyModel[36] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 371
		bodyModel[37] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 372
		bodyModel[38] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 373
		bodyModel[39] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 374
		bodyModel[40] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 375
		bodyModel[41] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 376
		bodyModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 377
		bodyModel[43] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 378
		bodyModel[44] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 379
		bodyModel[45] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 380
		bodyModel[46] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 381
		bodyModel[47] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 382
		bodyModel[48] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 383
		bodyModel[49] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 384 wheel
		bodyModel[50] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 385 wheel
		bodyModel[51] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 386 wheel
		bodyModel[52] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 387 wheel
		bodyModel[53] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 388
		bodyModel[54] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 389
		bodyModel[55] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 390
		bodyModel[56] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 391
		bodyModel[57] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 392
		bodyModel[58] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 394
		bodyModel[59] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 395
		bodyModel[60] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 396
		bodyModel[61] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 397
		bodyModel[62] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 398
		bodyModel[63] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 399
		bodyModel[64] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 400
		bodyModel[65] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 401
		bodyModel[66] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 402
		bodyModel[67] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 403
		bodyModel[68] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 404
		bodyModel[69] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 405
		bodyModel[70] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 406
		bodyModel[71] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 407
		bodyModel[72] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 408
		bodyModel[73] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 409
		bodyModel[74] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 410
		bodyModel[75] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 411
		bodyModel[76] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 412
		bodyModel[77] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 413
		bodyModel[78] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 414
		bodyModel[79] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 415
		bodyModel[80] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 416
		bodyModel[81] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 417
		bodyModel[82] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 418
		bodyModel[83] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 419
		bodyModel[84] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 420
		bodyModel[85] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 421
		bodyModel[86] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 422
		bodyModel[87] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 423
		bodyModel[88] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 424
		bodyModel[89] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 425
		bodyModel[90] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 426
		bodyModel[91] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 427
		bodyModel[92] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 428
		bodyModel[93] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 430
		bodyModel[94] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 431
		bodyModel[95] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 432
		bodyModel[96] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 433
		bodyModel[97] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 434
		bodyModel[98] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 435
		bodyModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 436
		bodyModel[100] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 437
		bodyModel[101] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 438
		bodyModel[102] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 439
		bodyModel[103] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 440
		bodyModel[104] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 441
		bodyModel[105] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 442
		bodyModel[106] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 443
		bodyModel[107] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 445
		bodyModel[108] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 446
		bodyModel[109] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 447
		bodyModel[110] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 448
		bodyModel[111] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 449
		bodyModel[112] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 450
		bodyModel[113] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 451
		bodyModel[114] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 452
		bodyModel[115] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 453
		bodyModel[116] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 454
		bodyModel[117] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 455
		bodyModel[118] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 456
		bodyModel[119] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 1
		bodyModel[120] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 4
		bodyModel[121] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 4
		bodyModel[122] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 4
		bodyModel[123] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 4
		bodyModel[124] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 4
		bodyModel[125] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 4
		bodyModel[126] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 1
		bodyModel[128] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 427
		bodyModel[129] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 427
		bodyModel[130] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 427
		bodyModel[131] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 427
		bodyModel[132] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 427
		bodyModel[133] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 427
		bodyModel[134] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 1

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 329 wheel
		bodyModel[0].setRotationPoint(-7F, 7F, 6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 330 wheel
		bodyModel[1].setRotationPoint(-16F, 7F, 6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 331 wheel
		bodyModel[2].setRotationPoint(-7F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 332 wheel
		bodyModel[3].setRotationPoint(-16F, 7F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 333
		bodyModel[4].setRotationPoint(-16F, 3F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 334
		bodyModel[5].setRotationPoint(-2F, 7F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 335
		bodyModel[6].setRotationPoint(27F, 4F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[7].setRotationPoint(25F, 6F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 339
		bodyModel[8].setRotationPoint(23F, 6F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 341
		bodyModel[9].setRotationPoint(18F, 4F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 342
		bodyModel[10].setRotationPoint(4F, 4F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 343
		bodyModel[11].setRotationPoint(3F, 8F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 344
		bodyModel[12].setRotationPoint(17F, 8F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[13].setRotationPoint(8.5F, 5F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 346
		bodyModel[14].setRotationPoint(8.5F, 4.5F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[15].setRotationPoint(12.5F, 4.5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[16].setRotationPoint(15.5F, 5F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[17].setRotationPoint(19.5F, 1F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 350
		bodyModel[18].setRotationPoint(15.5F, 1F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[19].setRotationPoint(15.5F, 0F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[20].setRotationPoint(5.5F, 1F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 353
		bodyModel[21].setRotationPoint(1.5F, 1F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[22].setRotationPoint(1.5F, 0F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[23].setRotationPoint(22.5F, 4F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[24].setRotationPoint(1.5F, 4F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 357
		bodyModel[25].setRotationPoint(17F, 8F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 358
		bodyModel[26].setRotationPoint(3F, 8F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 359
		bodyModel[27].setRotationPoint(-2F, 7F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 360
		bodyModel[28].setRotationPoint(4F, 4F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 361
		bodyModel[29].setRotationPoint(18F, 4F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 362
		bodyModel[30].setRotationPoint(23F, 6F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[31].setRotationPoint(25F, 6F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 364
		bodyModel[32].setRotationPoint(27F, 4F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 365
		bodyModel[33].setRotationPoint(-16F, 3F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 369
		bodyModel[34].setRotationPoint(1.5F, 1F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[35].setRotationPoint(5.5F, 1F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[36].setRotationPoint(1.5F, 0F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 372
		bodyModel[37].setRotationPoint(15.5F, 1F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[38].setRotationPoint(19.5F, 1F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[39].setRotationPoint(15.5F, 0F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 375
		bodyModel[40].setRotationPoint(19F, 1.5F, -9.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[41].setRotationPoint(15.5F, 5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[42].setRotationPoint(12.5F, 4.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 378
		bodyModel[43].setRotationPoint(8.5F, 4.5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[44].setRotationPoint(8.5F, 5F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 380
		bodyModel[45].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 381
		bodyModel[46].setRotationPoint(1.5F, 4F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 382
		bodyModel[47].setRotationPoint(4.5F, 4.5F, -8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 383
		bodyModel[48].setRotationPoint(18.5F, 4.5F, -8.5F);

		bodyModel[49].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 384 wheel
		bodyModel[49].setRotationPoint(5.5F, 5.5F, -6F);

		bodyModel[50].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 385 wheel
		bodyModel[50].setRotationPoint(19.5F, 5.5F, -6F);

		bodyModel[51].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 386 wheel
		bodyModel[51].setRotationPoint(5.5F, 5.5F, 6F);

		bodyModel[52].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 387 wheel
		bodyModel[52].setRotationPoint(19.5F, 5.5F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[53].setRotationPoint(4.5F, 5F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[54].setRotationPoint(18.5F, 5F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[55].setRotationPoint(18.5F, 5F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[56].setRotationPoint(4.5F, 5F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 392
		bodyModel[57].setRotationPoint(25.75F, 4F, -8.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 394
		bodyModel[58].setRotationPoint(5F, 1.5F, -9.25F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 395
		bodyModel[59].setRotationPoint(19F, 1.5F, 8.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 396
		bodyModel[60].setRotationPoint(5F, 1.5F, 8.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 397
		bodyModel[61].setRotationPoint(15.5F, 0.5F, 8.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 398
		bodyModel[62].setRotationPoint(22.5F, 0.5F, 8.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 399
		bodyModel[63].setRotationPoint(8.5F, 0.5F, 8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[64].setRotationPoint(1.5F, 0.5F, 8.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 401
		bodyModel[65].setRotationPoint(11.5F, 2F, 7.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[66].setRotationPoint(11.5F, 1F, 7.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[67].setRotationPoint(10.5F, 1.5F, 7.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 404
		bodyModel[68].setRotationPoint(11.5F, 3.5F, 8.75F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 405
		bodyModel[69].setRotationPoint(10.75F, 3.5F, 7.75F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 406
		bodyModel[70].setRotationPoint(13.25F, 3.5F, 7.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 407
		bodyModel[71].setRotationPoint(15.5F, 0.5F, 7.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 408
		bodyModel[72].setRotationPoint(22.5F, 0.5F, 7.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[73].setRotationPoint(8.5F, 0.5F, 7.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 410
		bodyModel[74].setRotationPoint(1.5F, 0.5F, 7.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 411
		bodyModel[75].setRotationPoint(15.5F, 0.5F, -8.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
		bodyModel[76].setRotationPoint(15.5F, 0.5F, -9.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[77].setRotationPoint(22.5F, 0.5F, -9.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 414
		bodyModel[78].setRotationPoint(22.5F, 0.5F, -8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 415
		bodyModel[79].setRotationPoint(8.5F, 0.5F, -9.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[80].setRotationPoint(8.5F, 0.5F, -8.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
		bodyModel[81].setRotationPoint(1.5F, 0.5F, -9.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 418
		bodyModel[82].setRotationPoint(1.5F, 0.5F, -8.25F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 419
		bodyModel[83].setRotationPoint(13.25F, 3.5F, -8.75F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 420
		bodyModel[84].setRotationPoint(10.75F, 3.5F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 421
		bodyModel[85].setRotationPoint(11.5F, 3.5F, -9.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 422
		bodyModel[86].setRotationPoint(11.5F, 2F, -9.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[87].setRotationPoint(11.5F, 1F, -9.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[88].setRotationPoint(10.5F, 1.5F, -8.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 425
		bodyModel[89].setRotationPoint(2F, 2F, -5F);

		bodyModel[90].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 426
		bodyModel[90].setRotationPoint(16F, 2F, -5F);

		bodyModel[91].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 427
		bodyModel[91].setRotationPoint(9F, 1F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[92].setRotationPoint(-16F, 4F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[93].setRotationPoint(-16F, 4F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 431
		bodyModel[94].setRotationPoint(0F, 4F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 432
		bodyModel[95].setRotationPoint(-3F, 4F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.05F, 0F); // Box 433
		bodyModel[96].setRotationPoint(-7F, 4F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.15F, 0F); // Box 434
		bodyModel[97].setRotationPoint(-12F, 4F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 435
		bodyModel[98].setRotationPoint(-19F, 3F, 8F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 436
		bodyModel[99].setRotationPoint(-19F, 3F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.15F, 0F); // Box 437
		bodyModel[100].setRotationPoint(-12F, 4F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 438
		bodyModel[101].setRotationPoint(-3F, 4F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[102].setRotationPoint(0F, 4F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.05F, 0F); // Box 440
		bodyModel[103].setRotationPoint(-7F, 4F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 441
		bodyModel[104].setRotationPoint(-17F, 6F, -6.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 442
		bodyModel[105].setRotationPoint(-8F, 6F, -6.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 13, 4, 10, 0F); // Box 443
		bodyModel[106].setRotationPoint(-18F, 5F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 445
		bodyModel[107].setRotationPoint(-13F, 6F, 4.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 446
		bodyModel[108].setRotationPoint(-12F, 6F, 4.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 447
		bodyModel[109].setRotationPoint(-11F, 6F, 4.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 448
		bodyModel[110].setRotationPoint(-14F, 8F, 4.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 449
		bodyModel[111].setRotationPoint(-14F, 5F, 4.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 450
		bodyModel[112].setRotationPoint(-14F, 5F, -5.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 451
		bodyModel[113].setRotationPoint(-14F, 8F, -5.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 452
		bodyModel[114].setRotationPoint(-13F, 6F, -5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 453
		bodyModel[115].setRotationPoint(-12F, 6F, -5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 454
		bodyModel[116].setRotationPoint(-11F, 6F, -5.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 455
		bodyModel[117].setRotationPoint(-2F, 4F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 456
		bodyModel[118].setRotationPoint(-2F, 4F, -9F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 1
		bodyModel[119].setRotationPoint(-26F, 2F, -1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[120].setRotationPoint(-23F, 4F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0.6F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.225F, 0F, 0F, -2.725F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[121].setRotationPoint(-23F, 3F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, -1F, -2F, 0F, -1F); // Box 4
		bodyModel[122].setRotationPoint(-23F, 6F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[123].setRotationPoint(-23F, 4F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -3.1F, 0F, 0F, 0.6F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -2.225F, 0F, 0F, -0.275F, 0F, 0F); // Box 4
		bodyModel[124].setRotationPoint(-23.5F, 3F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -0.5F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[125].setRotationPoint(-23F, 6F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[126].setRotationPoint(-20F, 1F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 1
		bodyModel[127].setRotationPoint(-22F, 1F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[128].setRotationPoint(10.5F, 0.5F, -2F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[129].setRotationPoint(-13.5F, 4.5F, -2F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[130].setRotationPoint(-13F, 3.5F, -1.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 427
		bodyModel[131].setRotationPoint(-13.5F, 3F, -8F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 427
		bodyModel[132].setRotationPoint(-3.5F, 2.5F, -8.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 427
		bodyModel[133].setRotationPoint(-3.5F, 1.5F, -7F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 6, 8, 0F); // Box 1
		bodyModel[134].setRotationPoint(-22F, 3F, -4F);
	}
}