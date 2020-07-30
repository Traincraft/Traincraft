/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("WorldWind.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.capabilities;

public class WorldWind {
    
    private int windStrength = 0;
    
    public WorldWind(int windStrength){
        this.windStrength = windStrength;
    }
    
    public int getWindStrength(){
        return windStrength;
    }
    
    public void setWindStrength(int windStrength){
        this.windStrength = windStrength;
    }
}
