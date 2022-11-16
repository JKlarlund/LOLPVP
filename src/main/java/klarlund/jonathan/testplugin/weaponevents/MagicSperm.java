package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import me.confuser.barapi.BarAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

public class MagicSperm implements Listener {

    Main plugin;

    public MagicSperm(Main plugin){
        this.plugin = plugin;
    }

    public final HashMap<String, Integer> in = new HashMap<>();

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if ((event.getEntity() instanceof Player)) {
            Player player = (Player) event.getEntity();
            if ((event.getDamager() instanceof Player)) {
                final Player target = (Player) event.getDamager();
                if (target.getInventory().getItemInHand() != null && target.getItemInHand().getType() != Material.AIR) {
                    if (target.getInventory().getItemInHand().getItemMeta().equals(ItemManager.magicsperm.getItemMeta())) {
                        int i = 2;
                        if (!this.in.containsKey(target.getName())) {
                            for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                                if (p.getName().equals(player.getName())) {
                                    p.hidePlayer(target);
                                }
                            }
                            BarAPI.setMessage(target, ChatColor.AQUA + "" + ChatColor.BOLD + "You are invisible.", i);
                            this.in.put(target.getName(), Integer.valueOf(i + 1));
                            new BukkitRunnable() {
                                public void run() {
                                    if (MagicSperm.this.in.containsKey(target.getName())) {
                                        MagicSperm.this.in.put(target.getName(), Integer.valueOf(((Integer) MagicSperm.this.in.get(target.getName())).intValue() - 1));
                                        if (((Integer) MagicSperm.this.in.get(target.getName())).intValue() <= 0) {
                                            MagicSperm.this.in.remove(target.getName());
                                            for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                                                p.showPlayer(target);
                                            }
                                            cancel();
                                        }
                                    } else {
                                        cancel();
                                    }
                                }
                            }.runTaskTimer(plugin, 0L, 20L);
                        }
                    }
                }
            }
        }
    }


}
