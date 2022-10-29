package klarlund.jonathan.testplugin.MysteryChest;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PVPEliteChest implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK)|| !event.getAction().equals(Action.RIGHT_CLICK_AIR)){
            return;
        }
        else{
            Player player = event.getPlayer();
            if (player.getInventory().getItemInHand().getItemMeta().equals(ChestManager.PVPEliteChest)){

                player.getInventory().remove(ChestManager.PVPEliteChest);





            }




        }
    }

}
