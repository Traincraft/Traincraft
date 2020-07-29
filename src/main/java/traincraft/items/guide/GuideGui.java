package traincraft.items.guide;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class GuideGui extends GuiScreen {
    
    private final EntityPlayerSP player;
    private final EnumHand hand;
    private final BlockPos position;
    
    public GuideGui(EntityPlayerSP player, EnumHand hand, BlockPos position) {
        this.player = player;
        this.hand = hand;
        this.position = position;
    }
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        // Only call when we actually use the minecraft button/label functionality: super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
