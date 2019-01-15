package train.client.core;

import cpw.mods.fml.client.CustomModLoadingErrorDisplayException;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiErrorScreen;

public class AlphaExpiredException extends CustomModLoadingErrorDisplayException  {

	private static final long serialVersionUID = 4917296650073454368L;

	@Override
	public void initGui(GuiErrorScreen errorScreen, FontRenderer fontRenderer) {		
	}

	@Override
	public void drawScreen(GuiErrorScreen errorScreen, FontRenderer fontRenderer, int mouseRelX, int mouseRelY,
			float tickTime) {
		errorScreen.drawCenteredString(fontRenderer, "You're trying to use a Traincraft alpha-version past its expiry date.", errorScreen.width/2, 95, 0xEEEEEE);
		errorScreen.drawCenteredString(fontRenderer, "Download a release-build at", errorScreen.width/2, 105, 0xEEEEEE);
		errorScreen.drawCenteredString(fontRenderer, "https://minecraft.curseforge.com/projects/traincraft.", errorScreen.width/2, 125, 0xEEEEEE);
	
	}

}
