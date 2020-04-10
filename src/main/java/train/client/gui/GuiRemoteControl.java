package train.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;
import train.common.items.ItemRemoteController;

public class GuiRemoteControl extends GuiScreen {

    ItemRemoteController theRemoteController;

    public GuiRemoteControl(ItemRemoteController remote) {
            theRemoteController = remote;
    }

}
