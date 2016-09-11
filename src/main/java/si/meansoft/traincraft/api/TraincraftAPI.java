package si.meansoft.traincraft.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.Traincraft;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TraincraftAPI{

    public static final Logger apiLogger = LogManager.getLogger(Traincraft.NAME + "API");

    private static List<Class> trackRegisterClasses = new ArrayList<>();

    public static void addTrackRegister(Class c){
        if(!trackRegisterClasses.contains(c)){
            try{
                c.getDeclaredMethod("register");
                trackRegisterClasses.add(c);
            } catch(NoSuchMethodException e){
                apiLogger.error("The Class '" + c.getName() + "' hasn't a method called 'register' without arguments!");
            }
        } else {
            apiLogger.error("The Class '" + c.getName() + "' is already registered as Track Registry!");
        }
    }

    public static void addTrackRegister(Class... classes){
        for(Class c : classes){
            addTrackRegister(c);
        }
    }

    public static void registerTracks(){
        for(Class c : trackRegisterClasses){
            try{
                c.getDeclaredMethod("register").invoke(null);
            } catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException e){
                apiLogger.error("There was a exception while registering the tracks!", e);
            }
        }
    }

}
