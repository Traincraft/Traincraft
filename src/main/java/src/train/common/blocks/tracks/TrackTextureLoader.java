package src.train.common.blocks.tracks;

import java.util.HashMap;
import java.util.Map;

import src.train.common.library.TrackIDs;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.Icon;

import mods.railcraft.api.core.ITextureLoader;
import mods.railcraft.api.tracks.ITrackItemIconProvider;
import mods.railcraft.api.tracks.TrackSpec;

public class TrackTextureLoader implements ITextureLoader, ITrackItemIconProvider {
	public static final TrackTextureLoader INSTANCE = new TrackTextureLoader();
	public final Map textures = new HashMap();
	//public final Map itemIcon = new HashMap();
	@Override
	public void registerIcons(IconRegister iconRegister) {
		for (TrackIDs track : TrackIDs.values()) {
			Icon[] icons = SheetTextureStitched.unstitchIcons(iconRegister, track.getTextureTag(), track.getNumIcons());
			this.textures.put(track.getTrackSpec(), icons);
			//this.itemIcon.put(track.getTrackSpec(), icons[track.getNumIcons()]);
		}
	}
	@Override
	public Icon getTrackItemIcon(TrackSpec spec) {
		return getTrackIcons(spec)[0];
	}

	public Icon[] getTrackIcons(TrackSpec spec) {
		return (Icon[]) this.textures.get(spec);
	}

}
