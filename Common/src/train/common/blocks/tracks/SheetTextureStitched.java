package src.train.common.blocks.tracks;

import src.train.common.library.Info;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.Icon;
import net.minecraftforge.client.event.TextureStitchEvent;

public class SheetTextureStitched extends TextureStitchEvent {
	private final int index;
	private final int rows;
	private final int columns;
	
	private SheetTextureStitched(TextureMap name, int index, int rows, int columns) {
		super(name);
		this.index = index;
		this.rows = rows;
		this.columns = columns;
	}

	public static Icon[] unstitchIcons(IconRegister iconRegister, String name, int numIcons) {
		return unstitchIcons(iconRegister, name, numIcons, 1);
	}

	public static Icon[] unstitchIcons(IconRegister iconRegister, String name, int columns, int rows) {
		TextureMap textureMap = (TextureMap) iconRegister;
		int numIcons = rows * columns;
		Icon[] icons = new Icon[numIcons];
		for (int i = 0; i < numIcons; i++) {
			String texName = name + "." + i;
			icons[i]=iconRegister.registerIcon(texName);
		}
		return icons;
	}
}
