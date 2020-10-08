package ebf.tim.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBook extends ModelConverter //Same as Filename
{
    int textureX = 128;
    int textureY = 32;

    public ModelBook() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[13];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 2
        bodyModel[2] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 3
        bodyModel[3] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 4
        bodyModel[4] = new ModelRendererTurbo(this, 53, 3, textureX, textureY); // Box 5
        bodyModel[5] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 6
        bodyModel[6] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 7
        bodyModel[7] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 32, 17, textureX, textureY); // Box 9
        bodyModel[9] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 13

        bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, 0F, -0.375F, -0.05F, 0F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, 0F, -0.375F, -0.05F); // Box 0
        bodyModel[0].setRotationPoint(0F, -4F, -5F);
        bodyModel[0].rotateAngleZ = 0.17453293F;

        bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, 0F, -0.375F, -0.15F, 0F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, 0F, -0.375F, -0.15F); // Box 2
        bodyModel[1].setRotationPoint(0F, -4F, -5F);
        bodyModel[1].rotateAngleZ = 0.10471976F;

        bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 3
        bodyModel[2].setRotationPoint(0F, -4F, -5F);
        bodyModel[2].rotateAngleZ = 0.03490659F;

        bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 4
        bodyModel[3].setRotationPoint(0F, -3.75F, -6F);
        bodyModel[3].rotateAngleZ = 0.03490659F;

        bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F, 0F, -0.25F, 0.05F); // Box 5
        bodyModel[4].setRotationPoint(-1F, -3.35F, -6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, 0F, -0.375F, -0.05F, 0F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, -0.5F, -0.375F, -0.05F, 0F, -0.375F, -0.05F); // Box 6
        bodyModel[5].setRotationPoint(0F, -4F, 5F);
        bodyModel[5].rotateAngleY = -3.14159265F;
        bodyModel[5].rotateAngleZ = 0.17453293F;

        bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, 0F, -0.375F, -0.15F, 0F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, -0.25F, -0.375F, -0.15F, 0F, -0.375F, -0.15F); // Box 7
        bodyModel[6].setRotationPoint(0F, -4F, 5F);
        bodyModel[6].rotateAngleY = -3.14159265F;
        bodyModel[6].rotateAngleZ = 0.10471976F;

        bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 8
        bodyModel[7].setRotationPoint(0F, -4F, 5F);
        bodyModel[7].rotateAngleY = -3.14159265F;
        bodyModel[7].rotateAngleZ = 0.03490659F;

        bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 9
        bodyModel[8].setRotationPoint(0F, -3.75F, 6F);
        bodyModel[8].rotateAngleY = -3.14159265F;
        bodyModel[8].rotateAngleZ = 0.03490659F;

        bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, 0F, -0.375F, -0.1F); // Box 10
        bodyModel[9].setRotationPoint(0F, -4F, 5F);
        bodyModel[9].rotateAngleY = -3.14159265F;
        bodyModel[9].rotateAngleZ = 0.13962634F;

        bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, 0F, -0.375F, -0.1F); // Box 11
        bodyModel[10].setRotationPoint(0F, -4F, 5F);
        bodyModel[10].rotateAngleY = -3.14159265F;
        bodyModel[10].rotateAngleZ = 0.06981317F;

        bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, -0.35F, -0.375F, -0.1F, 0F, -0.375F, -0.1F); // Box 12
        bodyModel[11].setRotationPoint(0F, -4F, -5F);
        bodyModel[11].rotateAngleZ = 0.13962634F;

        bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, 0F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, -0.1F, -0.375F, -0.1F, 0F, -0.375F, -0.1F); // Box 13
        bodyModel[12].setRotationPoint(0F, -4F, -5F);
        bodyModel[12].rotateAngleZ = 0.06981317F;
    }
}
