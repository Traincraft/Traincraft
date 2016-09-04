package si.meansoft.traincraft;

/**
 * @author canitzp
 */
public interface IRegistryEntry{

    IRegistryEntry[] getRegisterElements();

    String getName();

    void onRegister(IRegistryEntry[] otherEntries);

    void ownRegistry();

}
