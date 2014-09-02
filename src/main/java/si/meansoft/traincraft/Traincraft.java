package si.meansoft.traincraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.event.Fingerprint;
import si.meansoft.meancore.proxy.IProxy;
import si.meansoft.traincraft.common.library.InfoTC;
import si.meansoft.traincraft.event.*;

@Mod(modid = InfoTC.MODID, name= InfoTC.MODNAME, certificateFingerprint = InfoTC.FINGERPRINT, version = InfoTC.VERSION, guiFactory = InfoTC.GUI_FACTORY)
public class Traincraft {

    @Mod.Instance(InfoTC.MODID)
    public static Traincraft instance;

    private static ServerTC sr = new ServerTC();

    @SidedProxy(clientSide = InfoTC.CLIENT_PROXY, serverSide = InfoTC.SERVER_PROXY)
    public static IProxy proxy;

    @EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent evt) {
        Fingerprint fp = new Fingerprint();
        fp.init(evt, InfoTC.FINGERPRINT);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        PreInitTC pi = new PreInitTC();
        pi.init(evt);
    }

    @EventHandler
    public void init(FMLInitializationEvent evt) {
        InitTC in = new InitTC();
        in.init(evt);
    }

    @EventHandler
    public void readIMC(FMLInterModComms.IMCEvent evt) {
        ReadIMCTC imc = new ReadIMCTC();
        imc.init(evt);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        PostInitTC pi = new PostInitTC();
        pi.init(evt);
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent evt) {
        sr.initStart(evt);
    }

    @EventHandler
    public void serverStopping(FMLServerStoppingEvent evt) {
        sr.initStop(evt);
    }
}
