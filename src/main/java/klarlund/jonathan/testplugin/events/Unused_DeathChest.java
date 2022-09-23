/*
package klarlund.jonathan.testplugin.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class Unused_DeathChest implements Listener {

    @EventHandler
    public void onPlayerDeath(EntityDamageEvent event){

        */
/*
        If this is done right, we are now looking at the dead player.
        *//*


        if (event.getEntityType().equals(EntityType.PLAYER)){
            UUID id = event.getEntity().getUniqueId();
            Player player = event.getEntity().getServer().getPlayer(id);
            if (player.getHealth() <= event.getDamage()){

                */
/*
                Creating DeathChest
                 *//*

                Location DeathLocation = player.getLocation();
                DeathLocation.getBlock().setType(Material.CHEST);
                Chest DeathChest = (Chest) DeathLocation.getBlock().getState();
                Inventory DeathChestInventory = DeathChest.getInventory();

                for (ItemStack i : player.getInventory().getContents()){
                    if(i == null){
                        continue;
                    }
                    DeathChestInventory.addItem(i);
                    player.getInventory().remove(i);
                }

                DeathChest.update();

                //player.getInventory().clear();

            }
        }






}
}
*/
