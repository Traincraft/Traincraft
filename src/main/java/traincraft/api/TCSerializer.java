package traincraft.api;

import java.io.IOException;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;

public class TCSerializer {
    
    public static final DataSerializer<Double> DOUBLE = new DataSerializer<Double>() {
        @Override
        public void write(PacketBuffer buf, Double value) {
            buf.writeDouble(value);
        }
    
        @Override
        public Double read(PacketBuffer buf) throws IOException {
            return buf.readDouble();
        }
    
        @Override
        public DataParameter<Double> createKey(int id) {
            return new DataParameter<>(id, this);
        }
    
        @Override
        public Double copyValue(Double value) {
            return value;
        }
    };
    
    public static final DataSerializer<EnumRestriction> RESTRICTION = new DataSerializer<EnumRestriction>() {
        @Override
        public void write(PacketBuffer buf, EnumRestriction value) {
            buf.writeEnumValue(value);
        }
    
        @Override
        public EnumRestriction read(PacketBuffer buf) throws IOException {
            return buf.readEnumValue(EnumRestriction.class);
        }
    
        @Override
        public DataParameter<EnumRestriction> createKey(int id) {
            return new DataParameter<>(id, this);
        }
    
        @Override
        public EnumRestriction copyValue(EnumRestriction value) {
            return value;
        }
    };
    
}
