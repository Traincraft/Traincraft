package si.meansoft.traincraft;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.properties.PropertyHelper;

import java.util.Collection;
import java.util.Set;

/**
 * @author canitzp
 */
public class PropertyExtendedInteger extends PropertyHelper<Integer>{

    private final ImmutableSet<Integer> allowedValues;

    protected PropertyExtendedInteger(String name, int min, int max){
        super(name, Integer.class);

        if (max <= min){
            throw new IllegalArgumentException("Max value of " + name + " must be greater than min (" + min + ")");
        }
        else {
            Set<Integer> set = Sets.<Integer>newHashSet();
            for (int i = min; i <= max; ++i){
                set.add(i);
            }
            this.allowedValues = ImmutableSet.copyOf(set);
        }
    }

    @Override
    public Collection<Integer> getAllowedValues(){
        return this.allowedValues;
    }

    @Override
    public Optional<Integer> parseValue(String value){
        try{
            Integer integer = Integer.valueOf(value);
            return this.allowedValues.contains(integer) ? Optional.of(integer) : Optional.<Integer>absent();
        }
        catch (NumberFormatException var3){
            return Optional.<Integer>absent();
        }
    }

    @Override
    public String getName(Integer value){
        return value.toString();
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        else if (object instanceof PropertyExtendedInteger && super.equals(object)){
            PropertyExtendedInteger propertyinteger = (PropertyExtendedInteger)object;
            return this.allowedValues.equals(propertyinteger.allowedValues);
        }
        else {
            return false;
        }
    }

    public int hashCode()
    {
        return 31 * super.hashCode() + this.allowedValues.hashCode();
    }

    public static PropertyExtendedInteger create(String name, int min, int max)
    {
        return new PropertyExtendedInteger(name, min, max);
    }
}
