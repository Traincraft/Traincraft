package train.client.core.helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidRenderHelper {
	private static final ResourceLocation BLOCK_TEXTURE = TextureMap.locationBlocksTexture;
	public static IIcon getFluidTexture(FluidStack fluidStack, boolean flowing) {
		if (fluidStack == null) {
			return null;
		}
		return getFluidTexture(fluidStack.getFluid(), flowing);
	}

	public static IIcon getFluidTexture(Fluid fluid, boolean flowing) {
		if (fluid == null) {
			return null;
		}
		IIcon icon = flowing ? fluid.getFlowingIcon() : fluid.getStillIcon();
		if (icon == null) {
			icon = ((TextureMap) Minecraft.getMinecraft().getTextureManager().getTexture(TextureMap.locationBlocksTexture)).getTextureExtry("missingno");
		}
		return icon;
	}

	public static ResourceLocation getFluidSheet(FluidStack liquid) {
		if (liquid == null)
			return BLOCK_TEXTURE;
		return getFluidSheet(liquid.getFluid());
	}

	public static ResourceLocation getFluidSheet(Fluid liquid) {
		return BLOCK_TEXTURE;
	}
}
