/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TCSerializer.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;

import java.io.IOException;

public class TCSerializer {
    
    public static final DataSerializer<Double> DOUBLE = new DataSerializer<Double>() {
        @Override
        public void write(PacketBuffer buf, Double value){
            buf.writeDouble(value);
        }
        
        @Override
        public Double read(PacketBuffer buf) throws IOException{
            return buf.readDouble();
        }
        
        @Override
        public DataParameter<Double> createKey(int id){
            return new DataParameter<>(id, this);
        }
        
        @Override
        public Double copyValue(Double value){
            return value;
        }
    };
    
    public static final DataSerializer<EnumRestriction> RESTRICTION = new DataSerializer<EnumRestriction>() {
        @Override
        public void write(PacketBuffer buf, EnumRestriction value){
            buf.writeEnumValue(value);
        }
        
        @Override
        public EnumRestriction read(PacketBuffer buf) throws IOException{
            return buf.readEnumValue(EnumRestriction.class);
        }
        
        @Override
        public DataParameter<EnumRestriction> createKey(int id){
            return new DataParameter<>(id, this);
        }
        
        @Override
        public EnumRestriction copyValue(EnumRestriction value){
            return value;
        }
    };
    
}
