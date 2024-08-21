package sbmod.listeners;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class PlayerListener {
    @SubscribeEvent
    public void onChatReceive(ClientChatReceivedEvent e){
        String unformatted = e.message.getUnformattedText();
        String formatted = e.message.getFormattedText();
        /*Mod can respond upon the player receiving a chat message. This should work as it is done the same way
        as SBA*/


        // if formatted.equal(example_String)

        if (formatted.equals("§b> A Squid appeared.")) {

        }
    }
}
