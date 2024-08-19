package sbmod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sbmod.listeners.PlayerListener;


@Mod(modid = SkyblockMod.MODID, name = SkyblockMod.MOD_NAME, version = SkyblockMod.VERSION, acceptedMinecraftVersions = SkyblockMod.ACCEPTED_MC_VERSION)
public class SkyblockMod {
    public static final String MODID = "ic";
    public static final String VERSION = "1.0.0";
    public static final String MOD_NAME = "Icclaw";
    public static final String ACCEPTED_MC_VERSION = "[1.8.9]";
    private PlayerListener test;




    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        System.out.println("Icyclaw pre-initialized");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        System.out.println("Icyclaw initialized");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Icyclaw post-initialized");
    }

}
