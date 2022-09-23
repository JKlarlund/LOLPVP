package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Testplugin;
import klarlund.jonathan.testplugin.items.ItemManager;
import me.confuser.barapi.BarAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.UUID;

public class InvisRing implements Listener {

    Testplugin plugin;
    public final HashMap<UUID, Long> invislist;
    public final HashMap<UUID, Integer> warm;

    public InvisRing(Testplugin plugin){
        this.plugin = plugin;
        this.invislist = new HashMap<>();
        this.warm = new HashMap<>();

    }



    @EventHandler
    public void onLeave(PlayerQuitEvent player) {
        invislist.remove(player.getPlayer().getUniqueId());
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = (Player)event.getPlayer();
        for (UUID s : invislist.keySet()){
            Player p = Bukkit.getServer().getPlayer(s);
            if (p != null){
                player.hidePlayer(p);
            }
            

        }
    }

    //Missing onJoin / Don't understand why!

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        if ((event.getFrom().getBlockX() != event.getTo().getBlockX()) || (event.getFrom().getBlockZ() != event.getTo().getBlockX())){
            Player player = (Player)event.getPlayer();
            boolean hasIt = false;
            if (invislist.containsKey(player.getUniqueId())){
                for (ItemStack i : player.getInventory().getContents()){
                    if (i == null){
                        continue;
                    }

                    if (i.getItemMeta().equals(ItemManager.invisring.getItemMeta())){

                        hasIt = true;
                        break;

                    }

                }
                if (!hasIt){
                    for (Player o : Bukkit.getServer().getOnlinePlayers())
                    {
                        o.showPlayer(player);
                    }
                    invislist.remove(player.getUniqueId());
                    BarAPI.removeBar(player);
                    player.sendMessage(ChatColor.RED + "You are no longer invisible.");
                }
            }
        }

    }

    @EventHandler
    public void onPickUp(PlayerPickupItemEvent event){
        Player player = event.getPlayer();
        if (invislist.containsKey(player.getUniqueId())){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event){
        if ((event.getEntity() instanceof Player) && (event.getDamager() instanceof Player)){
            Player damager = (Player) event.getDamager();
            if (invislist.containsKey(damager.getUniqueId())){
                event.setCancelled(true);
            }
            Player player = (Player) event.getEntity();
            if (warm.containsKey(player.getUniqueId())){
                Bukkit.getServer().getScheduler().cancelTask(warm.get(player.getUniqueId()));
                warm.remove(player.getUniqueId());
                player.sendMessage(ChatColor.RED + "You cannot vanish now. You were hit.");
            }

        }
    }









    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getPlayer().getItemInHand().getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
                Player player = event.getPlayer();
                event.setCancelled(true);

                if (invislist.containsKey(event.getPlayer().getUniqueId())) {
                    for (Player o : Bukkit.getServer().getOnlinePlayers()) {
                        o.showPlayer(player);
                    }
                    invislist.remove(player.getUniqueId());
                    BarAPI.removeBar(player);
                    player.sendMessage(ChatColor.RED + "You are no longer invisible.");

                } else if (!warm.containsKey(player.getUniqueId())) {
                    int wait = 5;
                    player.sendMessage(ChatColor.GRAY + "Vanishing in " + ChatColor.AQUA + wait + ChatColor.GRAY + " seconds.");
                    warm.put(event.getPlayer().getUniqueId(), Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are invisible!");
                            player.sendMessage(ChatColor.GREEN + "You are now invisible.");
                            warm.remove(player.getUniqueId());
                            invislist.put(event.getPlayer().getUniqueId(), System.currentTimeMillis());
                            for (Player p : Bukkit.getOnlinePlayers()) {
                                p.hidePlayer(player);
                            }
                            new BukkitRunnable() {
                                public void run() {

                                    if (invislist.containsKey(player.getUniqueId())) {
                                        BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are invisible!");


                                    } else {
                                        cancel();
                                    }
                                }
                            }.runTaskTimer(plugin, 0, 400L);
                        }
                    }, wait * 20L));
                }
            }
        }
    }
}



                //Old lines of code, totally irrelevant!
                /**
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are invisible!");
                            player.sendMessage(ChatColor.GREEN + "You are now invisible.");
                            warm.remove(player.getUniqueId());
                            invislist.put(event.getPlayer().getUniqueId(), System.currentTimeMillis());
                            for (Player p : Bukkit.getOnlinePlayers()) {
                                player.hidePlayer(player);
                        }
                            new BukkitRunnable(){
                                public void run (){

                                    if (invislist.containsKey(player.getUniqueId())){
                                        BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are invisible!");


                                    }
                                    else{
                                        cancel();
                                    }

                            }}.runTaskTimer(plugin, 0, 400L);
                    }

                }.runTaskLater(plugin, 20 * wait);

                }

                }
            }
        }
    }


/**    @EventHandler

    public void onInteract(PlayerInteractEvent event) {

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getPlayer().getItemInHand().getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
                Player player = event.getPlayer();
                if (!invislist.containsKey(event.getPlayer().getUniqueId())) {
                    int wait = 5;
                    player.sendMessage(ChatColor.GRAY + "Vanishing in " + ChatColor.AQUA + wait + ChatColor.GRAY + " seconds.");

                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
                        @Override
                        public void run() {
                            //BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are invisible!");
                            player.sendMessage(ChatColor.GREEN + "You are now invisible.");
                            invislist.put(event.getPlayer().getUniqueId(), System.currentTimeMillis());
                            for (Player p : Bukkit.getOnlinePlayers()) {
                                player.hidePlayer(player);
                            }
                            new BukkitRunnable()
                            {
                                @Override
                                public void run()
                                {
                                    if(invislist.containsKey(event.getPlayer().getUniqueId()))
                                    {
                                        BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "You are now invisible!");
                                    }
                                    else
                                    {
                                        cancel();
                                    }

                                }
                                }.runTaskTimer(plugin, 0L, 400L);
                            }
                    }, 20L * wait);

                }
                else {
                    invislist.remove(event.getPlayer().getUniqueId());
                    //BarAPI.removeBar(player);
                    player.sendMessage(ChatColor.RED + "You are no longer invisible.");
                    player.showPlayer(player);

                }



                }
            }
        }
**/

















