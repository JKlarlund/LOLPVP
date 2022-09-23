package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Babymaker implements Listener {

    @EventHandler

    public void onHit(EntityDamageByEntityEvent event){

        if (event.getDamager() instanceof Player){
            Player p = (((Player) event.getDamager()).getPlayer());
            if (event.getEntity() instanceof Player){
                if (p.getItemInHand() != null && p.getItemInHand().getType() != Material.AIR){
                    if (((Player) event.getDamager()).getItemInHand().getItemMeta().equals(ItemManager.babymaker.getItemMeta())){
                        p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5 * 20, 1));
                    }

                }
            }
        }

    }
}
