package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import klarlund.jonathan.testplugin.utilstest.OwnParticles_Unused;
import klarlund.jonathan.testplugin.utilstest.ParticleEffect;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class SnowArmor implements Listener {

    OwnParticles_Unused particles = new OwnParticles_Unused();
    Main plugin;


    public SnowArmor(Main plugin) {
        this.plugin = plugin;
    }

    List<Integer> tasks = new ArrayList<>();

    HashMap<UUID, BukkitTask> taskid = new HashMap<>();


    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {


        if (event.getPlayer() instanceof Player) {
            Player player = (Player) event.getPlayer();

            if (player.getInventory().getBoots() == null || player.getInventory().getLeggings() == null || player.getInventory().getChestplate() == null || player.getInventory().getHelmet() == null) {

                if (taskid.containsKey(player.getUniqueId())) {
                    taskid.get(player.getUniqueId()).cancel();
                    taskid.remove(player.getUniqueId());
                }


            } else if (!player.getInventory().getBoots().getItemMeta().equals(ItemManager.snowboots.getItemMeta()) ||
                    !player.getInventory().getLeggings().getItemMeta().equals(ItemManager.snowlegs.getItemMeta()) ||
                    !player.getInventory().getChestplate().getItemMeta().equals(ItemManager.snowchest.getItemMeta()) ||
                    !player.getInventory().getHelmet().getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
                if (taskid.containsKey(player.getUniqueId())) {
                    taskid.get(player.getUniqueId()).cancel();
                    taskid.remove(player.getUniqueId());
                }
            } else if (player.getInventory().getBoots().getItemMeta().equals(ItemManager.snowboots.getItemMeta()) &&
                    player.getInventory().getLeggings().getItemMeta().equals(ItemManager.snowlegs.getItemMeta()) &&
                    player.getInventory().getChestplate().getItemMeta().equals(ItemManager.snowchest.getItemMeta()) &&
                    player.getInventory().getHelmet().getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
                if (!taskid.containsKey(player.getUniqueId())) {
                    taskid.put(player.getUniqueId(), new BukkitRunnable() {
                        @Override
                        public void run() {
                            ParticleEffect.SNOW_SHOVEL.display(0f, 0f, 0f, 1, 10, player.getLocation(), 20D);
                        }
                    }.runTaskTimer(plugin, 0L, 20L));


                }
                if (taskid.containsKey(player.getUniqueId())) {
                    taskid.get(player.getUniqueId()).cancel();
                    taskid.remove(player.getUniqueId());
                    taskid.put(player.getUniqueId(), new BukkitRunnable() {
                        @Override
                        public void run() {
                            ParticleEffect.SNOW_SHOVEL.display(0f, 0f, 0f, 1, 10, player.getLocation(), 20D);
                        }
                    }.runTaskTimer(plugin, 0L, 20L));
                }
            }


        }


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (taskid.containsKey(player.getUniqueId())) {
            taskid.get(player.getUniqueId()).cancel();
            taskid.remove(player.getUniqueId());
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getBoots() == null || player.getInventory().getLeggings() == null || player.getInventory().getChestplate() == null || player.getInventory().getHelmet() == null) {

            if (taskid.containsKey(player.getUniqueId())) {
                taskid.get(player.getUniqueId()).cancel();
                taskid.remove(player.getUniqueId());
            }


        } else if (!player.getInventory().getBoots().getItemMeta().equals(ItemManager.snowboots.getItemMeta()) ||
                !player.getInventory().getLeggings().getItemMeta().equals(ItemManager.snowlegs.getItemMeta()) ||
                !player.getInventory().getChestplate().getItemMeta().equals(ItemManager.snowchest.getItemMeta()) ||
                !player.getInventory().getHelmet().getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
            if (taskid.containsKey(player.getUniqueId())) {
                taskid.get(player.getUniqueId()).cancel();
                taskid.remove(player.getUniqueId());
            }
        } else if (player.getInventory().getBoots().getItemMeta().equals(ItemManager.snowboots.getItemMeta()) &&
                player.getInventory().getLeggings().getItemMeta().equals(ItemManager.snowlegs.getItemMeta()) &&
                player.getInventory().getChestplate().getItemMeta().equals(ItemManager.snowchest.getItemMeta()) &&
                player.getInventory().getHelmet().getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
            if (!taskid.containsKey(player.getUniqueId())) {
                taskid.put(player.getUniqueId(), new BukkitRunnable() {
                    @Override
                    public void run() {
                        ParticleEffect.SNOW_SHOVEL.display(0f, 0f, 0f, 1, 10, player.getLocation(), 20D);
                    }
                }.runTaskTimer(plugin, 0L, 20L));


            }
            if (taskid.containsKey(player.getUniqueId())) {
                taskid.get(player.getUniqueId()).cancel();
                taskid.remove(player.getUniqueId());
                taskid.put(player.getUniqueId(), new BukkitRunnable() {
                    @Override
                    public void run() {
                        ParticleEffect.SNOW_SHOVEL.display(0f, 0f, 0f, 1, 10, player.getLocation(), 20D);
                    }
                }.runTaskTimer(plugin, 0L, 20L));
            }
        }


    }

}



