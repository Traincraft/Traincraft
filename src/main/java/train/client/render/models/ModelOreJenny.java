//T

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelOreJenny extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOreJenny() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 0 load

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 1, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[0].setRotationPoint(-15F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-18F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(15F, 2F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(-11.5F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[4].setRotationPoint(7.5F, 4F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-15F, 2F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-15F, 2F, 2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(14F, 2F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(14F, 2F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 1
		bodyModel[9].setRotationPoint(-15F, 2F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-15F, 2F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[11].setRotationPoint(-15F, 2F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,-2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-6F, 2F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-12F, -9F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F); // Box 0
		bodyModel[14].setRotationPoint(-13F, -6F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-15F, -9F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F); // Box 20
		bodyModel[16].setRotationPoint(12F, -6F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(14F, -9F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-12F, -9F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 2F, -5F, 0F, 2F); // Box 0
		bodyModel[19].setRotationPoint(-12F, -6F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -2F, -5F, 0F, -2F); // Box 24
		bodyModel[20].setRotationPoint(-12F, -6F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-6F, 2F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 1
		bodyModel[22].setRotationPoint(5F, 2F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 1
		bodyModel[23].setRotationPoint(-5F, 2F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[24].setRotationPoint(5F, 2F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 2F, 1F, 0F); // Box 29
		bodyModel[25].setRotationPoint(5F, 2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-6F, 2F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 29
		bodyModel[27].setRotationPoint(-6F, 2F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-14F, -9F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-14F, -9F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(12F, -9F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(12F, -9F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 30, 10, 0, 0F); // Box 0
		bodyModel[32].setRotationPoint(-15F, -9F, -11.05F);

		bodyModel[33].addBox(0F, 0F, 0F, 30, 10, 0, 0F); // Box 0
		bodyModel[33].setRotationPoint(-15F, -9F, 11.05F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 10, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[34].setRotationPoint(-15F, -9F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 10, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		bodyModel[35].setRotationPoint(15F, -9F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 28, 0, 20, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0 load
		bodyModel[36].setRotationPoint(-14F, -8.75F, -10F);
	}

	ModelOreJennyTrucc trucc = new ModelOreJennyTrucc();
	ModelOreJennyTruck2 trucc2 = new ModelOreJennyTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 37; i++)
		{
			bodyModel[i].render(f5);
		}

		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/orejennytrucc.png"));//

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-0.63,0.55,-0.4);
		trucc.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.19,0,0.03);
		trucc.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Ore_jenny_Truck2.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Ore_jenny_Truck2_journal_boxes.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-0.57,-0.05,-0.0);
		trucc2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.17,-0.0,0.00);
		trucc2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelOreJenny[];
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}