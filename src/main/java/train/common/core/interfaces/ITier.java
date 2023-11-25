/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.interfaces;

import net.minecraft.item.Item;

import java.util.List;

public interface ITier {

    int Tier();

    List<Item> knownRecipes();

    int[] getSlotSelected();

    void setSlotSelected(int[] selected);

    List<Item> getResultList();

    String getGUIName();

    String getGUITexture();
}
