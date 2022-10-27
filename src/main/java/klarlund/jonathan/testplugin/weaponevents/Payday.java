package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Payday implements Listener {

    Main plugin;
    Main econ;

    public Payday(Main plugin){
        this.plugin = plugin;
    }
    ArrayList<Item> money = new ArrayList<Item>();
    List<String> lore = new ArrayList<String>();

    @EventHandler
    public void onEntityDamageEvent(EntityDamageByEntityEvent event)
    {
        if(event.getDamager() instanceof Player && event.getEntity() instanceof Player)
        {
            Player player = (Player)event.getDamager();
            Player hit = (Player)event.getDamager();
            if (player.getItemInHand() != null && player.getItemInHand().getType() != Material.AIR) {
                if (player.getItemInHand().getItemMeta().equals(ItemManager.payday.getItemMeta())) {
                    final Firework fw = (Firework) player.getWorld().spawnEntity(hit.getLocation(), EntityType.FIREWORK);
                    FireworkMeta data = fw.getFireworkMeta();
                    data.addEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST).withColor(Color.GREEN).withFade(Color.YELLOW).build());
                    fw.setFireworkMeta(data);
                    plugin.getServer().getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            fw.detonate();
                        }
                    }, 2L);
                    for (int i = 0; i < 10; i++) {
                        money.add(player.getWorld().dropItemNaturally(player.getLocation().add(0, new Random().nextDouble(), 0), new ItemStack(Material.PAPER)));
                    }
                    plugin.getServer().getScheduler().runTaskLater(plugin, new Runnable() {
                        @Override
                        public void run() {
                            for (Item items : money) {
                                items.remove();
                            }
                            money.clear();
                        }
                    }, 20L);
                }
            }
        }
    }

    @EventHandler
    public void onItemPickup(PlayerPickupItemEvent e)
    {
        if (money.contains(e.getItem()))
        {
            e.setCancelled(true);
        }
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e)
    {
        Player p = e.getEntity();
        if(p.getKiller() == null || !(p.getKiller() instanceof Player))
            return;
        Player killer = p.getKiller();
        if (killer.getItemInHand().getItemMeta().equals(ItemManager.payday.getItemMeta()))
        {
            String amount = String.valueOf(NumberFormat.getNumberInstance(Locale.US).format(econ.getEconomy().getBalance(p) * 0.1));
            for(Player players : Bukkit.getOnlinePlayers()) {
                players.sendMessage(ChatColor.GREEN + "It's payday bitch! " + killer.getName() + " stole " + amount + " from " + p.getName());
                //new FancyMessage("It's payday bitch!").color(ChatColor.GREEN).tooltip(killer.getName() + " stole " + amount + " from " + p.getName()).send(players);
            }
            Date now = new Date();
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            ItemStack trophy = new ItemStack(Material.PAPER);
            ItemMeta meta = trophy.getItemMeta();
            meta.setDisplayName(ChatColor.WHITE + "Kill: " + p.getName());
            lore.clear();
            lore.add(ChatColor.DARK_GRAY + "Trophy for killing " + p.getName() + " on " + format.format(now));
            meta.setLore(lore);
            trophy.setItemMeta(meta);
            killer.getInventory().addItem(trophy);
            killer.updateInventory();
            if ((Main.getEconomy().getBalance(p) * 0.1) > 5000000)
            {
                Main.getEconomy().depositPlayer(killer, 5000000);
                Main.getEconomy().withdrawPlayer(p, 5000000);
            } else {
                Main.getEconomy().depositPlayer(killer, Main.getEconomy().getBalance(p) * 0.1);
                Main.getEconomy().withdrawPlayer(p, Main.getEconomy().getBalance(p) * 0.1);
            }
        }
    }

}
