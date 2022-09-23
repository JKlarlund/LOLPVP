package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Ejacul8 implements Listener {

    @EventHandler

    public void onHit(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){

            Player player = (Player)event.getDamager();

            if(event.getEntity() instanceof LivingEntity){

                LivingEntity damaged = (LivingEntity)event.getEntity();

                if(((Player) event.getDamager()).getItemInHand() != null && player.getItemInHand().getType() != Material.AIR){
                    if(((Player) event.getDamager()).getItemInHand().getItemMeta().equals(ItemManager.ejacul8.getItemMeta())){
                        damaged.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 8 * 20, 1));
                        damaged.getWorld().playEffect(damaged.getLocation(), Effect.POTION_BREAK, 4);
                    }
                }
            }
        }
    }

}



