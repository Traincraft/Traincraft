package train.client.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.library.Info;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

@SideOnly(Side.CLIENT)
public class RenderRollingStock extends Render {
	private static Random random = new Random();

	public RenderRollingStock() {
		this.shadowSize = 0.5F;
	}

	/**
	 * Renders the Minecart.
	 */
	public static void renderTheMinecart(EntityRollingStock cart, double x, double y, double z, float yaw, float time) {
		GL11.glPushMatrix();
		long var10 = cart.getEntityId() * 493286711L;
		var10 = var10 * var10 * 4392167121L + var10 * 98761L;
		float var12 = (((var10 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float var13 = (((var10 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		float var14 = (((var10 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
		GL11.glTranslatef(var12, var13, var14);
		double var15 = cart.lastTickPosX + (cart.posX - cart.lastTickPosX) * time;
		double var17 = cart.lastTickPosY + (cart.posY - cart.lastTickPosY) * time;
		double var19 = cart.lastTickPosZ + (cart.posZ - cart.lastTickPosZ) * time;
		Vec3 var23 = cart.func_70489_a(var15, var17, var19);
		float pitch = cart.prevRotationPitch + (cart.rotationPitch - cart.prevRotationPitch) * time;
		Vec3 renderYVect = cart.yVector(var15, var17, var19);//only on TC rails
		if (var23 != null) {
			Vec3 var25 = cart.func_70495_a(var15, var17, var19, 0.30000001192092896D);
			Vec3 var26 = cart.func_70495_a(var15, var17, var19, -0.30000001192092896D);

			if (var25 == null) {
				var25 = var23;
			}

			if (var26 == null) {
				var26 = var23;
			}

			x += var23.xCoord - var15;
			y += (var25.yCoord + var26.yCoord) / 2.0D - var17;
			z += var23.zCoord - var19;
			Vec3 var27 = var26.addVector(-var25.xCoord, -var25.yCoord, -var25.zCoord);

			if (var27.lengthVector() != 0.0D) {
				var27 = var27.normalize();
				yaw = TraincraftUtil.atan2degreesf(var27.zCoord, var27.xCoord);
				pitch = (float) (Math.atan(var27.yCoord) * 73.0D);
			}

		}else if (renderYVect != null) {//only on TC rails
			Vec3 var25 = cart.renderY(var15, var17, var19, 0.30000001192092896D);
			Vec3 var26 = cart.renderY(var15, var17, var19, -0.30000001192092896D);

			if (var25 == null) {
				var25 = renderYVect;
			}

			if (var26 == null) {
				var26 = renderYVect;
			}
			y += (var25.yCoord + var26.yCoord) / 2.0D - var17;
		}

		yaw %= 360.0F;
		if (yaw < 0.0F) {
			yaw += 360.0F;
		}
		yaw += 360.0F;

		float serverYaw = (cart.rotationYaw + 180) % 360;
		if (serverYaw < 0.0F) {
			serverYaw += 360.0F;
		}
		serverYaw += 360.0F;
		if (Math.abs(yaw - serverYaw) > 90.0F) {
			yaw += 180.0F;
			pitch = -pitch;
		}
		/*if (var23 == null && Math.abs(yaw - serverYaw) < 90.0D) {
			pitch = -pitch;
		}*/
		//System.out.println(Math.abs(yaw - serverYaw));
		//System.out.println("yaw after "+yaw+" server yaw after "+serverYaw);

		GL11.glTranslatef((float) x, (float) y, (float) z);
		int i = MathHelper.floor_double(cart.posX);
		int j = MathHelper.floor_double(cart.posY);
		int k = MathHelper.floor_double(cart.posZ);

		// NOTE: func_150049_b_ = isRailBlockAt
		if (cart.worldObj != null && (BlockRailBase.func_150049_b_(cart.worldObj, i, j, k)
				|| BlockRailBase.func_150049_b_(cart.worldObj, i, j - 1, k))) {
			cart.setMountedYOffset(-0.55);
		} else if (cart.posYFromServer != 0) {
			cart.setMountedYOffset(-0.5);
			GL11.glTranslatef(0f, -0.30f, 0f);
		}
		if(cart.worldObj != null && cart.worldObj.getBlock(i,j,k).getClass().getName().equals("ebf.tim.blocks.rails.BlockRailCore")){
			GL11.glTranslatef(0f, 0.15f, 0f);
		}
		if (cart.bogieLoco != null) {// || cart.bogieUtility[0]!=null){
			//GL11.glRotatef((float)(90-cart.rotationYawClientReal), 0.0F, 1.0F, 0.0F);
			if (cart.oldClientYaw == 0) cart.oldClientYaw = cart.rotationYawClientReal;

			float rotationYawBogie = cart.rotationYawClientReal;
			float tempYaw = (cart.rotationYawClientReal - cart.oldClientYaw);
			float newYaw = 0;
			//System.out.println("rotationYawBogie "+rotationYawBogie+" oldYaw "+cart.oldClientYaw+" tempYaw "+(Math.abs(tempYaw)/10));
			//System.out.println(Math.abs(cart.oldClientYaw-rotationYawBogie));
			if(Math.abs(cart.oldClientYaw-rotationYawBogie)>170){
				cart.oldClientYaw = rotationYawBogie;
			}
			if (cart.oldClientYaw != rotationYawBogie && Math.abs(cart.oldClientYaw-rotationYawBogie)>(Math.abs(tempYaw)/10)) {
				newYaw = cart.oldClientYaw + Math.copySign((Math.abs(tempYaw)/10), tempYaw);
				cart.oldClientYaw += Math.copySign((Math.abs(tempYaw)/10), tempYaw);
			}
			else {
				newYaw = rotationYawBogie;
				cart.oldClientYaw = rotationYawBogie;
			}
			//System.out.println("newYaw "+newYaw);
			//System.out.println(90 - cart.rotationYawClientReal);
			GL11.glRotatef((90.0f-newYaw), 0.0F, 1.0F, 0.0F);
			cart.setRenderYaw(newYaw);
			cart.setRenderPitch(pitch);
		}
		else {
			// NOTE: func_150049_b_ = isRailBlockAt
			if (cart.worldObj!=null && (BlockRailBase.func_150049_b_(cart.worldObj, i, j, k) || BlockRailBase.func_150049_b_(cart.worldObj, i, j-1, k) )){
				if(cart.isClientInReverse){
					yaw+=180;
					pitch = -pitch;
				}
				GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
				cart.setRenderYaw(yaw);
				cart.setRenderPitch(pitch);
			}else{
				if (cart.oldClientYaw == 0) cart.oldClientYaw = cart.rotationYawClientReal;

				float rotationYaw = cart.rotationYawClientReal;
				float tempYaw = (cart.rotationYawClientReal - cart.oldClientYaw);
				float newYaw = 0;
				//System.out.println("rotationYawBogie "+rotationYawBogie+" oldYaw "+cart.oldClientYaw+" tempYaw "+(Math.abs(tempYaw)/10));
				//System.out.println(Math.abs(cart.oldClientYaw-rotationYawBogie));
				if(Math.abs(cart.oldClientYaw-rotationYaw)>170){
					cart.oldClientYaw = rotationYaw;
				}
				if (cart.oldClientYaw != rotationYaw && Math.abs(cart.oldClientYaw-rotationYaw)>(Math.abs(tempYaw)/10)) {
					newYaw = cart.oldClientYaw + Math.copySign((Math.abs(tempYaw)/10), tempYaw);
					cart.oldClientYaw += Math.copySign((Math.abs(tempYaw)/10), tempYaw);
				}
				else {
					newYaw = rotationYaw;
					cart.oldClientYaw = rotationYaw;
				}
				GL11.glRotatef((90.0f-(newYaw+90.0f)), 0.0F, 1.0F, 0.0F);
				cart.setRenderYaw(yaw);
				cart.setRenderPitch(pitch);
			}
		}

		//if(cart.bogie!=null)cart.worldObj.spawnParticle("reddust", cart.bogie.posX, cart.bogie.posY, cart.bogie.posZ, 0.1, 0.4, 0.1);

		//GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
		if (cart.bogieLoco != null) {// || cart.bogieUtility[0]!=null){
			GL11.glRotatef((float) -cart.anglePitchClient, 0.0F, 0.0F, 1.0F);
		}
		else {
			if(renderYVect != null){
				pitch = (float)cart.anglePitchClient/60;
				if(cart.rotationYawClientReal>-5 && cart.rotationYawClientReal<5){
					pitch=-pitch;
				}
				if(!cart.isClientInReverse && (cart.rotationYawClientReal>85 && cart.rotationYawClientReal<95 )){
					pitch=-pitch;
				}
				if(cart.isClientInReverse && (cart.rotationYawClientReal<-265 && cart.rotationYawClientReal>-275 )){
					pitch=-pitch;
				}
				GL11.glRotatef(pitch, 0.0F, 0.0F, 1.0F);
			}
			else{
				GL11.glRotatef(-pitch, 0.0F, 0.0F, 1.0F);
			}
		}
		float var28 = cart.getRollingAmplitude() - time;
		float var30 = cart.getDamage() - time;

		if (var30 < 0.0F) {
			var30 = 0.0F;
		}

		if (var28 > 0.0F) {
			float angle = MathHelper.sin(var28) * var28 * var30 / 10.0F;
			angle = Math.min(angle, 0.8F);
			angle = Math.copySign(angle, cart.getRollingDirection());
			GL11.glRotatef(angle, 1.0F, 0.0F, 0.0F);
		}
		for (RenderEnum renders : RenderEnum.values()) {
			if (renders.getEntityClass() != null && renders.getEntityClass().equals(cart.getClass())) {
				//loadTexture(getTextureFile(renders.getTexture(), renders.getIsMultiTextured(), cart));

				try {
					if (renders.getModel().getClass().getDeclaredMethod("getTrans") != null) {
						Method theTransMethod = renders.getModel().getClass().getDeclaredMethod("getTrans");
						float[] theTrans = (float[]) theTransMethod.invoke(renders.getModel().getClass().newInstance());
						if (theTrans != null) {
							GL11.glTranslatef(theTrans[0], theTrans[1], theTrans[2]);
						}

					}
				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					if (renders.getTrans() != null) {
						GL11.glTranslatef(renders.getTrans()[0], renders.getTrans()[1], renders.getTrans()[2]);
					}

				} catch (InstantiationException e) {
					e.printStackTrace();
				}


				/*if (renders.getTrans() != null) {
					GL11.glTranslatef(renders.getTrans()[0], renders.getTrans()[1], renders.getTrans()[2]);
				}*/

				try {
					if (renders.getModel().getClass().getDeclaredMethod("getRotate") != null) {
						Method theTransMethod = renders.getModel().getClass().getDeclaredMethod("getRotate");
						float[] theRotate = (float[]) theTransMethod.invoke(renders.getModel().getClass().newInstance());
						if (theRotate != null) {
							GL11.glRotatef(theRotate[0], 1.0F, 0.0F, 0.0F);
							GL11.glRotatef(theRotate[1], 0.0F, 1.0F, 0.0F);
							GL11.glRotatef(theRotate[2], 0.0F, 0.0F, 1.0F);
						}

					}
				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					if (renders.getRotate() != null) {
						GL11.glRotatef(renders.getRotate()[0], 1.0F, 0.0F, 0.0F);
						GL11.glRotatef(renders.getRotate()[1], 0.0F, 1.0F, 0.0F);
						GL11.glRotatef(renders.getRotate()[2], 0.0F, 0.0F, 1.0F);
					}
				} catch (InstantiationException e) {
					e.printStackTrace();
				}

				/*if (renders.getRotate() != null) {
					GL11.glRotatef(renders.getRotate()[0], 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(renders.getRotate()[1], 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(renders.getRotate()[2], 0.0F, 0.0F, 1.0F);
				}*/

				try {
					if (renders.getModel().getClass().getDeclaredMethod("getScale") != null) {
						Method theScaleMethod = renders.getModel().getClass().getDeclaredMethod("getScale");
						float[] theRotate = (float[]) theScaleMethod.invoke(renders.getModel().getClass().newInstance());
						if (theRotate != null) {
							GL11.glScalef(theRotate[0], theRotate[1], theRotate[2]);
						}
					}
				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					if (renders.getScale() != null) {
						GL11.glScalef(renders.getScale()[0], renders.getScale()[1], renders.getScale()[2]);
					}

				} catch (InstantiationException e) {
					e.printStackTrace();
				}


				/*if (renders.getScale() != null) {
					GL11.glScalef(renders.getScale()[0], renders.getScale()[1], renders.getScale()[2]);
				}*/


				Tessellator.bindTexture(getTexture(cart));

				GL11.glEnable(GL11.GL_LIGHTING);
				int skyLight = cart.worldObj.getLightBrightnessForSkyBlocks(i, j, k, 0);
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  skyLight % 65536,
						skyLight / 65536f);


				renders.getModel().render(cart, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				//GL11.glEnable(GL11.GL_LIGHTING);

				if (renders.hasSmoke()) {
					ArrayList<double[]> smokePosition = new ArrayList<>();
					try {
						if (renders.getModel().getClass().getDeclaredMethod("getSmokePosition") != null) {
							Method theScaleMethod = renders.getModel().getClass().getDeclaredMethod("getSmokePosition");
							ArrayList<double[]> thePos = (ArrayList<double[]>) theScaleMethod.invoke(renders.getModel().getClass().newInstance());
							if (thePos != null) {
								smokePosition = thePos;
							}
						}
					} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {

						smokePosition = renders.getSmokeFX();
					} catch (InstantiationException e) {
						smokePosition = renders.getSmokeFX();
					}

					if (cart.bogieLoco != null) {// || cart.bogieUtility[0]!=null){
						renderSmokeFX(cart, 90 + cart.rotationYawClientReal, (float) cart.anglePitchClient, renders.getSmokeType(), smokePosition, renders.getSmokeIterations(), time, renders.hasSmokeOnSlopes());
					}
					else {
						renderSmokeFX(cart, (yaw), pitch, renders.getSmokeType(), smokePosition, renders.getSmokeIterations(), time, renders.hasSmokeOnSlopes());
					}
				}
				if (renders.hasExplosion()) {
					if (cart.bogieLoco != null) {// || cart.bogieUtility[0]!=null){
						renderExplosionFX(cart, 90 + cart.rotationYawClientReal, (float) cart.anglePitchClient, renders.getExplosionType(), renders.getExplosionFX(), renders.getExplosionFXIterations(), renders.hasSmokeOnSlopes());
					}
					else {
						renderExplosionFX(cart, yaw, pitch, renders.getExplosionType(), renders.getExplosionFX(), renders.getExplosionFXIterations(), renders.hasSmokeOnSlopes());
					}
				}

				break;
			}
		}

		GL11.glPopMatrix();
	}

	private static ResourceLocation getResourceFile(String texture, boolean multiTexture, EntityRollingStock cart) {
		if (multiTexture) {
			return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + texture + cart.getColorAsString() + ".png");
		} else {
			return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + texture + ".png");
		}
	}

	private static void renderSmokeFX(EntityRollingStock cart, float yaw, float pitch, String smokeType, ArrayList<double[]> smokeFX, int smokeIterations, float time, boolean hasSmokeOnSlopes) {
		if(cart instanceof Locomotive && !((Locomotive)cart).isLocoTurnedOn()){return;}
		if(Math.abs(pitch)>30)return;
		//if (pitch != 0 && !hasSmokeOnSlopes) { return; }
		if ((cart instanceof Locomotive && ((Locomotive) cart).getFuel() > 0) || (cart instanceof EntityTracksBuilder && ((EntityTracksBuilder) cart).getFuel() > 0)) {
			int r = random.nextInt(10 * smokeIterations);
			double speed = 0;
			if (cart instanceof Locomotive) speed = ((Locomotive) cart).getSpeed();
			if (r < ((smokeIterations * 4) + (speed * 5))) {
				double rotatedvec[];
				for (int j = 0; j < smokeIterations; j++) {


					for (double[] explosion : smokeFX) {
						rotatedvec = rotatePointF(explosion[0], explosion[1], explosion[2], pitch, yaw);
						cart.worldObj.spawnParticle(smokeType,
								cart.posX + rotatedvec[0], cart.posY + rotatedvec[1], cart.posZ +rotatedvec[2],
								0,0,0);
					}
				}
			}
		}
	}
	public static final float radianF = (float) Math.PI / 180.0f;
	public static double[] rotatePointF(double x, double y, double z, float pitch, float yaw) {
		double[] xyz = new double[]{x,y,z};
		float sin, cos;
		//rotate pitch
		if (pitch != 0.0F) {
			pitch *= radianF;
			cos = MathHelper.cos(pitch);
			sin = MathHelper.sin(pitch);

			xyz[0] = (y * sin) + (x * cos);
			xyz[1] = (y * cos) - (x * sin);
		}
		//rotate yaw
		if (yaw != 0.0F) {
			yaw *= radianF;
			cos = MathHelper.cos(yaw);
			sin = MathHelper.sin(yaw);

			xyz[0] = (x * cos) - (z * sin);
			xyz[2] = (x * sin) + (z * cos);
		}

		return xyz;
	}


	private static void renderExplosionFX(EntityRollingStock cart, float yaw, float pitch, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		if(cart instanceof Locomotive && !((Locomotive)cart).isLocoTurnedOn())return;
		float yawMod = yaw % 360;
		double pitchRads = Math.toDegrees(pitch);
		//if (pitch != 0 && !hasSmokeOnSlopes) { return; }
		if(Math.abs(pitch)>30)return;
		if (cart instanceof Locomotive && ((Locomotive) cart).getFuel() > 0) {
			int r = random.nextInt(300);
			if (r < (explosionFXIterations * 10)) {
				for (int j = 0; j < explosionFXIterations; j++) {
					if (yawMod == 180) {
						for (double[] explosion : explosionFX) {
							cart.worldObj.spawnParticle(explosionType, cart.posX - explosion[0], cart.posY + explosion[1] + ((Math.tan(pitchRads)* 4  * -explosion[1])), cart.posZ + explosion[2], 0.0D, 0.0D, 0.0D);
							cart.worldObj.spawnParticle(explosionType, cart.posX - explosion[0], cart.posY + explosion[1] + ((Math.tan(pitchRads)* 4  * -explosion[1])), cart.posZ - explosion[2], 0.0D, 0.0D, 0.0D);
						}
					}
					else if (yawMod == 90) {
						for (double[] explosion : explosionFX) {
							cart.worldObj.spawnParticle(explosionType, cart.posX + explosion[2], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ + explosion[0], 0.0D, 0.0D, 0.0D);
							cart.worldObj.spawnParticle(explosionType, cart.posX - explosion[2], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ + explosion[0], 0.0D, 0.0D, 0.0D);
						}
					}
					else if (yawMod == 0) {
						for (double[] explosion : explosionFX) {
							cart.worldObj.spawnParticle(explosionType, cart.posX + explosion[0], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ + explosion[2], 0.0D, 0.0D, 0.0D);
							cart.worldObj.spawnParticle(explosionType, cart.posX + explosion[0], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ - explosion[2], 0.0D, 0.0D, 0.0D);
						}
					}
					else if (yawMod == -90) {
						for (double[] explosion : explosionFX) {
							cart.worldObj.spawnParticle(explosionType, cart.posX + explosion[2], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ - explosion[0], 0.0D, 0.0D, 0.0D);
							cart.worldObj.spawnParticle(explosionType, cart.posX - explosion[2], cart.posY + explosion[1] + ((Math.tan(pitchRads)*4 * -explosion[1])), cart.posZ - explosion[0], 0.0D, 0.0D, 0.0D);
						}
					}
				}
			}
		}
	}

	@Override
	public void doRender(Entity par1Entity, double x, double y, double d2, float yaw, float time) {
		renderTheMinecart((EntityRollingStock) par1Entity, x, y, d2, yaw, time);
	}



	//@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return getTexture(entity);
	}

	public static ResourceLocation getTexture(Entity entity) {
		for (RenderEnum renders : RenderEnum.values()) {
			if (renders.getEntityClass() != null && renders.getEntityClass().equals(entity.getClass())) { return getResourceFile(renders.getTexture(), renders.getIsMultiTextured(), (EntityRollingStock) entity); }
		}
		return null;
	}
}
