package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.util.Vector;

public class Wifebeater implements Listener {

    @EventHandler
    public static void Launcher(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked() instanceof LivingEntity) {
            if (event.getPlayer().getItemInHand() != null && player.getItemInHand().getType() != Material.AIR) {
                if (event.getPlayer().getItemInHand().getItemMeta().equals(ItemManager.wifebeater.getItemMeta())) {
                    LivingEntity entity = (LivingEntity) event.getRightClicked();
                    entity.setVelocity(new Vector(0, 1.3, 0));
                    entity.getWorld().playSound(entity.getLocation(), Sound.ENDERDRAGON_WINGS, 1F, 1F);
                }
            }
        }


    }


}
