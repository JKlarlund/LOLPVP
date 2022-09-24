
package klarlund.jonathan.testplugin.events;

import klarlund.jonathan.testplugin.Main;
import org.bukkit.Bukkit;
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

public class unusedDeathChest implements Listener {

    Main plugin;

    public unusedDeathChest(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(EntityDamageEvent event){

        /*
/*
        If this is done right, we are now looking at the dead player.
        */


        if (event.getEntityType().equals(EntityType.PLAYER)){
            UUID id = event.getEntity().getUniqueId();
            Player player = event.getEntity().getServer().getPlayer(id);
            if (player.getHealth() <= event.getDamage()){


/*
                Creating DeathChest
                 */

                Location DeathLocation = player.getLocation();
                while (DeathLocation.getBlock().getType() != Material.AIR){
                    DeathLocation.setY(DeathLocation.getY() + 1);
                }
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

                Long delay = 20L * 20;


                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        for (ItemStack i : DeathChestInventory)
                            DeathChestInventory.remove(i);

                        DeathLocation.getBlock().setType(Material.AIR);

                    }
                }, delay);

            }
        }






}
}

