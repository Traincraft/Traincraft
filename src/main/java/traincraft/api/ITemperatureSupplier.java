package traincraft.api;

/**
 * Interface to get the temperature of something.
 * The common unit is Kelvin (0°K = -273.15°C).
 *
 * @see org.cyclops.commoncapabilities.api.capability.temperature.ITemperature
 */
public interface ITemperatureSupplier {
    
    double getTemperature();
    
    void setTemperature(double temperature);
    
    double getMaximumTemperature();
    
    double getMinimumTemperature();
    
    double getDefaultTemperature();
    
}
