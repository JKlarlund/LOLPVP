package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.EntityEffect;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.HashMap;
import java.util.UUID;

public class Mjolnir implements Listener {

    private final HashMap<UUID, Long> cooldown;

    public Mjolnir(){
        this.cooldown = new HashMap<>();
    }

    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent event) {
        if (event.getPlayer() instanceof Player) {

            Player player = (Player)event.getPlayer();

            if (event.getRightClicked() instanceof LivingEntity){
                LivingEntity struck = (LivingEntity) event.getRightClicked();
                if (((Player) event.getPlayer()).getItemInHand() != null && player.getItemInHand().getType() != Material.AIR){
                    if (((Player) event.getPlayer()).getItemInHand().getItemMeta().equals(ItemManager.mjolnir.getItemMeta())){
                        if (!cooldown.containsKey(event.getPlayer().getUniqueId())) {

                            cooldown.put(event.getPlayer().getUniqueId(), System.currentTimeMillis());


                            //player.getWorld().strikeLightningEffect(struck.getLocation());
                            struck.getWorld().strikeLightningEffect(struck.getLocation());
                            struck.playEffect(EntityEffect.HURT);
                            struck.setHealth(struck.getHealth() - 4);
                        }
                        else {
                            long timeElapsed = System.currentTimeMillis() - cooldown.get(event.getPlayer().getUniqueId());

                            if (timeElapsed >= 7000) {

                                cooldown.put(event.getPlayer().getUniqueId(), System.currentTimeMillis());

                                struck.getWorld().strikeLightningEffect(struck.getLocation());

                                struck.playEffect(EntityEffect.HURT);

                                if (struck.getHealth()>4){
                                    struck.setHealth(struck.getHealth()-4.0);
                                }

                                else if (struck.getHealth()<=4){
                                    struck.setHealth(0);
                                }

                            }
                            else {

                                event.getPlayer().sendMessage(ChatColor.AQUA + "Mjolnir" + ChatColor.RED + " is on cooldown for " + ChatColor.RED + ((7000/1000) - (timeElapsed/1000)) + ChatColor.RED + " seconds");

                            }

                        }


                    }
                }
            }

        }

        }
    }
