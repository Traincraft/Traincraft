package train.common.tile.tileSwitch;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.tileentity.TileEntity;

public class TiletrackConcrete extends TileEntity {

    @SideOnly(Side.CLIENT)
    @Override
    public double getMaxRenderDistanceSquared() {
        if(FMLClientHandler.instance()!=null && FMLClientHandler.instance().getClient()!=null && FMLClientHandler.instance().getClient().gameSettings!=null){
            if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 0) {
                return 30000.0D;
            }
            else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 1) {
                return 15900.0D;
            }
            else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 2) {
                return 4000.0D;
            } else return 4096.0;
        }else{
            return 4096.0;
        }
    }

	/*
	@Override // Why would you even do this..?
	public void updateEntity() {
		super.updateEntity();
	}*/
}