package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import klarlund.jonathan.testplugin.utilstest.OwnParticles_Unused;
import klarlund.jonathan.testplugin.utilstest.ParticleEffect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Moneytoken implements Listener {


    @EventHandler
    public void onRightClick(PlayerInteractEvent event){

        Player player = event.getPlayer();

        if (player.getItemInHand().getType() != Material.AIR && player.getItemInHand().getItemMeta() != null){
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){
                if(player.getItemInHand().getItemMeta().equals(ItemManager.moneytoken.getItemMeta())){

                    ParticleEffect.FIREWORKS_SPARK.display(0f, 0f, 0f, 1f, 10, player.getLocation(), 20D);

                }
            }
        }
    }
}
