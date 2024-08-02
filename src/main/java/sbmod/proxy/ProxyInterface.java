package sbmod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;

public interface ProxyInterface {
    public void preInit();
    public boolean isSinglePlayer();
    public boolean isDedicatedServer();
    public void init();
    public EntityPlayer getPlayerFromHandler(INetHandler handler);
    public void registerRenderInformation();
}
