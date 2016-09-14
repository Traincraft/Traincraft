package si.meansoft.traincraft;

/**
 * @author canitzp
 */
public interface IRegistryEntry{

    IRegistryEntry[] getRegisterElements();

    String getRegisterName();

    void onRegister(IRegistryEntry[] otherEntries);

    void ownRegistry();

}
