package train.common.blocks.tracks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
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

	public static IIcon[] unstitchIcons(IIconRegister iconRegister, String name, int numIcons) {
		return unstitchIcons(iconRegister, name, numIcons, 1);
	}

	public static IIcon[] unstitchIcons(IIconRegister iconRegister, String name, int columns, int rows) {
		int numIcons = rows * columns;
		IIcon[] icons = new IIcon[numIcons];
		for (int i = 0; i < numIcons; i++) {
			String texName = name + "." + i;
			icons[i]=iconRegister.registerIcon(texName);
		}
		return icons;
	}
}
