package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Prot6 implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            if(player.getEquipment().getBoots()!=null){
                if(player.getEquipment().getBoots().getItemMeta().equals(ItemManager.prot6boots.getItemMeta())){
                    if(player.getEquipment().getLeggings()!=null){
                        if(player.getEquipment().getLeggings().getItemMeta().equals(ItemManager.prot6legs.getItemMeta())){
                            if(player.getEquipment().getChestplate()!=null){
                                if(player.getEquipment().getChestplate().getItemMeta().equals(ItemManager.prot6chest.getItemMeta())){
                                    if(player.getEquipment().getHelmet()!=null){
                                        if(player.getEquipment().getHelmet().getItemMeta().equals(ItemManager.prot6helm.getItemMeta())){
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
