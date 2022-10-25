package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class Prot6 implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            EntityEquipment playerarmor = player.getEquipment();

            if(player.getEquipment().getBoots()!=null){
                if(playerarmor.getBoots().getItemMeta().equals(ItemManager.prot6boots.getItemMeta()) || playerarmor.getBoots().getItemMeta().equals(ItemManager.prot6aeboots.getItemMeta())){
                    if(playerarmor.getLeggings()!=null){
                        if(playerarmor.getLeggings().getItemMeta().equals(ItemManager.prot6legs.getItemMeta()) || playerarmor.getLeggings().getItemMeta().equals(ItemManager.prot6aelegs.getItemMeta())){
                            if(playerarmor.getChestplate()!=null){
                                if(playerarmor.getChestplate().getItemMeta().equals(ItemManager.prot6chest.getItemMeta()) || playerarmor.getChestplate().getItemMeta().equals(ItemManager.prot6aechest.getItemMeta())){
                                    if(playerarmor.getHelmet()!=null){
                                        if(playerarmor.getHelmet().getItemMeta().equals(ItemManager.prot6helm.getItemMeta()) || playerarmor.getHelmet().getItemMeta().equals(ItemManager.prot6aehelm.getItemMeta())){
                                            event.setDamage(event.getDamage() - event.getDamage() * 0.3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }



}
