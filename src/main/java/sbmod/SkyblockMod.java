package sbmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sbmod.proxy.CommonProxy;

@Mod(modid = SkyblockMod.MODID, name = SkyblockMod.MOD_NAME, version = SkyblockMod.VERSION, acceptedMinecraftVersions = SkyblockMod.ACCEPTED_MC_VERSION)
public class SkyblockMod {
    public static final String MODID = "ic";
    public static final String VERSION = "1.0.0";
    public static final String MOD_NAME = "Icclaw";
    public static final String ACCEPTED_MC_VERSION = "[1.8.9]";
    public static final String CLIENT_PROXY_CLASS = "sbmod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "sbmod.proxy.CommonProxy";


    @Instance(SkyblockMod.MODID)
    public static SkyblockMod instance;

    @SidedProxy(clientSide = SkyblockMod.CLIENT_PROXY_CLASS, serverSide = SkyblockMod.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
        System.out.println("Icclaw pre-initialized");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        System.out.println("Icclaw initialized");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Icclaw post-initialized");
    }
}
