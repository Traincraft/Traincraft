package train.common.wellcar;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;

public class BasicallyContainer {

    public String color;
    public String theType;
    public NBTTagCompound savedData;
    public BasicallyContainer() {}

    public BasicallyContainer(String thet, String color, NBTTagCompound tag) {
        this.theType = thet;
        this.color = color;
        savedData = tag;
    }

    public NBTTagCompound getAsTagCompound() {
        NBTTagCompound theCompound = new NBTTagCompound();
        theCompound.setString("color", color);
        theCompound.setString("theType", theType);
        if (savedData != null) {
            theCompound.setTag("Items", savedData.getTagList("Items", Constants.NBT.TAG_COMPOUND));
        }
        return theCompound;
    }


}
