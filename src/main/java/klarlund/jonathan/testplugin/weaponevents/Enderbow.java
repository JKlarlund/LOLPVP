package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

public class Enderbow implements Listener{



    @EventHandler
    public static void onArrowHit(ProjectileHitEvent event){

        if(event.getEntity().getType() == EntityType.ARROW){
            if(event.getEntity().getShooter() instanceof Player){

                Player Shooter = ((Player) event.getEntity().getShooter()).getPlayer();

                ItemStack meta = Shooter.getInventory().getItemInHand();

                if(meta.getItemMeta().equals(ItemManager.enderbow.getItemMeta())){

                    Location location = event.getEntity().getLocation();
                    Shooter.teleport(location);
                    Shooter.getWorld().playEffect(event.getEntity().getLocation(), Effect.ENDER_SIGNAL, 4);
                    Shooter.getWorld().playSound(event.getEntity().getLocation(), Sound.ENDERMAN_TELEPORT, 1f, 1f);

                }



            }
        }


    }

}
