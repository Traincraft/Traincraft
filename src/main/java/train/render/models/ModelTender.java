package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.render.CustomModelRenderer;

public class ModelTender extends ModelBase {

	public ModelTender() {

		// constructor:
		AXLE = new CustomModelRenderer(this, 0, 40, 128, 128);
		AXLE.addBox(0F, 0F, 0F, 16, 1, 1);
		AXLE.setPosition(-8F, 3F, -9F);

		AXLE0 = new CustomModelRenderer(this, 0, 40, 128, 128);
		AXLE0.addBox(0F, 0F, 0F, 16, 1, 1);
		AXLE0.setPosition(-8F, 3F, 8F);

		BODY = new CustomModelRenderer(this, 28, 94, 128, 128);
		BODY.addBox(0F, 0F, 0F, 20, 4, 30);
		BODY.setPosition(-10F, 8F, -15F);

		BODY0 = new CustomModelRenderer(this, 60, 0, 128, 128);
		BODY0.addBox(0F, 0F, 0F, 18, 12, 16);
		BODY0.setPosition(-9F, 12F, -2F);

		BODY1 = new CustomModelRenderer(this, 86, 57, 128, 128);
		BODY1.addBox(0F, 0F, 0F, 1, 16, 20);
		BODY1.setPosition(9F, 12F, -5F);

		BODY2 = new CustomModelRenderer(this, 43, 57, 128, 128);
		BODY2.addBox(0F, 0F, 0F, 1, 16, 20);
		BODY2.setPosition(-10F, 12F, -5F);

		BODY3 = new CustomModelRenderer(this, 0, 0, 128, 128);
		BODY3.addBox(0F, 0F, 0F, 18, 16, 1);
		BODY3.setPosition(-9F, 12F, 14F);

		UNDER = new CustomModelRenderer(this, 0, 96, 128, 128);
		UNDER.addBox(0F, 0F, 0F, 1, 7, 20);
		UNDER.setPosition(-7F, 1F, -10F);

		UNDER0 = new CustomModelRenderer(this, 0, 96, 128, 128);
		UNDER0.addBox(0F, 0F, 0F, 1, 7, 20);
		UNDER0.setPosition(6F, 1F, -10F);

		WHEELL = new CustomModelRenderer(this, 19, 42, 128, 128);
		WHEELL.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELL.setPosition(-6F, 0F, -12F);

		WHEELL0 = new CustomModelRenderer(this, 19, 42, 128, 128);
		WHEELL0.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELL0.setPosition(-6F, 0F, 5F);

		WHEELR = new CustomModelRenderer(this, 0, 42, 128, 128);
		WHEELR.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELR.setPosition(4F, 0F, -12F);

		WHEELR0 = new CustomModelRenderer(this, 0, 42, 128, 128);
		WHEELR0.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELR0.setPosition(4F, 0F, 5F);

		bodyModel=new ModelRendererTurbo[]{AXLE,AXLE0,BODY,BODY0,BODY1,BODY2,BODY3,UNDER,UNDER0,WHEELL,WHEELL0,WHEELR,WHEELR0
		};

		fixRotation(bodyModel);
	}

    // variables init:
	public CustomModelRenderer AXLE;
	public CustomModelRenderer AXLE0;
	public CustomModelRenderer BODY;
	public CustomModelRenderer BODY0;
	public CustomModelRenderer BODY1;
	public CustomModelRenderer BODY2;
	public CustomModelRenderer BODY3;
	public CustomModelRenderer UNDER;
	public CustomModelRenderer UNDER0;
	public CustomModelRenderer WHEELL;
	public CustomModelRenderer WHEELL0;
	public CustomModelRenderer WHEELR;
	public CustomModelRenderer WHEELR0;

}
