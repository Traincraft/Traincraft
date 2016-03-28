package si.meansoft.traincraft.util;

import com.google.common.base.Optional;
import net.minecraft.block.properties.PropertyHelper;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author canitzp
 */
public class PropertyString extends PropertyHelper<String>{

    ArrayList<String> allowedValues = new ArrayList<String>();

    public PropertyString(String name, String value) {
        super(name, String.class);
        allowedValues.add(value);
    }

    @Override
    public Collection<String> getAllowedValues() {
        return this.allowedValues;
    }

    @Override
    public Optional<String> parseValue(String value) {
        return this.allowedValues.contains(value) ? Optional.of(value) : Optional.<String>absent();
    }

    /**
     * Get the name for the given value.
     *
     * @param value
     */
    @Override
    public String getName(String value) {
        return value;
    }

    public PropertyString addValue(String value){
        this.allowedValues.add(value);
        return this;
    }

}
