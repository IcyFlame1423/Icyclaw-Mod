package sbmod.proxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import sbmod.SkyblockMod;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders(){
        RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
        //SkyblockMod.registerRenders();
    }

    @Override
    public EntityPlayer getClientPlayer(){
        return Minecraft.getMinecraft().thePlayer;
    }

    @Override
    public boolean isSinglePlayer(){
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer(){
        return false;
    }

    @Override
    public void preInit(){
        System.out.println("Client Proxy: Pre Init");
    }

    @Override
    public void init(){
        System.out.println("Client Proxy: Init");
    }

    @Override
    public void registerRenderInformation(){

    }


}
