package traincraft.compat.commoncapabilities;

import org.cyclops.commoncapabilities.api.capability.temperature.ITemperature;
import traincraft.api.ITemperatureSupplier;

public class GenericTemperature implements ITemperature {
    
    private final ITemperatureSupplier temperatureSupplier;
    
    public GenericTemperature(ITemperatureSupplier temperatureSupplier) {
        this.temperatureSupplier = temperatureSupplier;
    }
    
    @Override
    public double getTemperature() {
        return this.temperatureSupplier.getTemperature();
    }
    
    @Override
    public double getMaximumTemperature() {
        return this.temperatureSupplier.getMaximumTemperature();
    }
    
    @Override
    public double getMinimumTemperature() {
        return this.temperatureSupplier.getMinimumTemperature();
    }
    
    @Override
    public double getDefaultTemperature() {
        return this.temperatureSupplier.getDefaultTemperature();
    }
}
