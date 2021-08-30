//owo

package train.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelMillGondola extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMillGondola() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 127, 83, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 127, 83, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 125, 90, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 125, 90, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 5, 96, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 30, 78, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 6, 67, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 30, 67, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 106, 75, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 106, 85, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 88, 75, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 88, 85, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 6, 78, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 18, 136, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 18, 152, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 58, 106, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 170, 128, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 170, 107, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 170, 87, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 210, 128, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 210, 107, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 210, 87, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 57, 81, textureX, textureY, "cull"); // Box 40 cull
		bodyModel[25] = new ModelRendererTurbo(this, 45, 55, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 8, 194, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 8, 191, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 70, 81, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[29] = new ModelRendererTurbo(this, 45, 63, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 45, 59, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 57, 66, textureX, textureY, "cull"); // Box 33 cull
		bodyModel[32] = new ModelRendererTurbo(this, 45, 51, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 70, 66, textureX, textureY, "cull"); // Box 35 cull
		bodyModel[34] = new ModelRendererTurbo(this, 192, 47, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 187, 47, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 182, 47, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 54, 109, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 177, 47, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 162, 47, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 172, 47, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 167, 47, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 157, 47, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 152, 47, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 177, 32, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 182, 32, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 187, 32, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 192, 32, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 167, 32, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 162, 32, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 157, 32, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 96, 108, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 86
		bodyModel[55] = new ModelRendererTurbo(this, 93, 106, textureX, textureY); // Box 87
		bodyModel[56] = new ModelRendererTurbo(this, 57, 47, textureX, textureY, "cull"); // Box 60 cull
		bodyModel[57] = new ModelRendererTurbo(this, 70, 47, textureX, textureY, "cull"); // Box 61 cull
		bodyModel[58] = new ModelRendererTurbo(this, 1, 208, textureX, textureY); // Box FLAT LOAD
		bodyModel[59] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 24, 59, textureX, textureY); // Box 60

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-40F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(37F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-27F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(23F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 74, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-37F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[5].setRotationPoint(23F, 2F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[6].setRotationPoint(-27F, 2F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[7].setRotationPoint(-27F, 2F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[8].setRotationPoint(-37F, 2F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[9].setRotationPoint(-37F, 2F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[10].setRotationPoint(36F, 2F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 0
		bodyModel[11].setRotationPoint(36F, 2F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 12
		bodyModel[12].setRotationPoint(23F, 2F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 74, 14, 1, 0F); // Box 15
		bodyModel[13].setRotationPoint(-37F, -9F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 74, 14, 1, 0F); // Box 16
		bodyModel[14].setRotationPoint(-37F, -9F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 10, 18, 0F); // Box 17
		bodyModel[15].setRotationPoint(-36F, -9F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 72, 1, 18, 0F); // Box 18
		bodyModel[16].setRotationPoint(-36F, 1F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 10, 18, 0F); // Box 19
		bodyModel[17].setRotationPoint(35F, -9F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 20
		bodyModel[18].setRotationPoint(-37F, -2F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 21
		bodyModel[19].setRotationPoint(-37F, -6F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 22
		bodyModel[20].setRotationPoint(-37F, -9F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 23
		bodyModel[21].setRotationPoint(36F, -2F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 24
		bodyModel[22].setRotationPoint(36F, -6F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 25
		bodyModel[23].setRotationPoint(36F, -9F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cull
		bodyModel[24].setRotationPoint(-35F, -8F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-35F, 5F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 74, 1, 1, 0F); // Box 28
		bodyModel[26].setRotationPoint(-37F, -9F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 74, 1, 1, 0F); // Box 29
		bodyModel[27].setRotationPoint(-37F, -9F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[28].setRotationPoint(30F, -8F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(30F, 5F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-35F, 5F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33 cull
		bodyModel[31].setRotationPoint(-35F, -8F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(30F, 5F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35 cull
		bodyModel[33].setRotationPoint(30F, -8F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 36
		bodyModel[34].setRotationPoint(-25F, -8F, -10.75F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 38
		bodyModel[35].setRotationPoint(-19F, -8F, -10.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 39
		bodyModel[36].setRotationPoint(-13F, -8F, -10.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 40
		bodyModel[37].setRotationPoint(-30F, 1F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 41
		bodyModel[38].setRotationPoint(-7F, -8F, -10.75F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 42
		bodyModel[39].setRotationPoint(12F, -8F, -10.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 43
		bodyModel[40].setRotationPoint(-0.5F, -8F, -10.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 44
		bodyModel[41].setRotationPoint(6F, -8F, -10.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 46
		bodyModel[42].setRotationPoint(18F, -8F, -10.75F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 47
		bodyModel[43].setRotationPoint(24F, -8F, -10.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 48
		bodyModel[44].setRotationPoint(-0.5F, -8F, 9.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 49
		bodyModel[45].setRotationPoint(-7F, -8F, 9.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 50
		bodyModel[46].setRotationPoint(-13F, -8F, 9.75F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 51
		bodyModel[47].setRotationPoint(-19F, -8F, 9.75F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 52
		bodyModel[48].setRotationPoint(-25F, -8F, 9.75F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 53
		bodyModel[49].setRotationPoint(6F, -8F, 9.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 54
		bodyModel[50].setRotationPoint(12F, -8F, 9.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 55
		bodyModel[51].setRotationPoint(18F, -8F, 9.75F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 56
		bodyModel[52].setRotationPoint(24F, -8F, 9.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 72
		bodyModel[53].setRotationPoint(-38.51F, -5.5F, 3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[54].setRotationPoint(-38F, -5F, 4F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[55].setRotationPoint(-38.5F, -4F, 5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 cull
		bodyModel[56].setRotationPoint(-37.5F, -8F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61 cull
		bodyModel[57].setRotationPoint(36.5F, -8F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 70, 1, 18, 0F); // Box FLAT LOAD
		bodyModel[58].setRotationPoint(-35F, -8F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-26F, -5F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(17F, -5F, 11F);
	}
	Model70Truck bogie = new Model70Truck();
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 61; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else if (i == 58) {
				int cargo = ((Freight) entity).getAmmountOfCargo();
				if (cargo != 0) {
					GL11.glPushMatrix();
					GL11.glTranslatef(0, 0.57f + ((Freight) entity).getAmmountOfCargo() * -0.013f, 0);
					// 0.57f is the "starting height", the *-0.whatever is the multiplier
					//System.out.println(-0.51f + ((Freight) entity).getAmmountOfCargo() * 0.016f);
					bodyModel[58].render(f5);
					GL11.glPopMatrix();
				}
			} else
				bodyModel[i].render(f5);
		}
		/*Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.7,0.55,-0.4);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.15,0,0.03);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==14){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.65,-0.05,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.25,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public float[] getTrans() { return new float[]{-0F, 0.1F, 0F}; }
}