package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import klarlund.jonathan.testplugin.utilstest.Cooldowns;
import me.confuser.barapi.BarAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AbominableSnowman implements Listener {

    private HashSet<String> r;
    private HashSet<String> froze;


    Main plugin;


    public AbominableSnowman(Main plugin){
        r = new HashSet<String>();
        froze = new HashSet<String>();
        this.plugin = plugin;
    }


    @EventHandler
    public void onThis(PlayerToggleSneakEvent event)
    {
        final Player player = event.getPlayer();

        if (player.getItemInHand().getItemMeta() != null || player.getItemInHand().getType() != Material.AIR) {
            if (player.getItemInHand().getItemMeta().equals(ItemManager.abominablesnowman.getItemMeta()) &&
                    (!this.r.contains(player.getName()))) {
                new BukkitRunnable() {
                    Integer lol = Integer.valueOf(0);

                    public void run() {
                        if (player.isSneaking()) {
                            if (this.lol.intValue() <= 10) {
                                if ((Cooldowns.tryCooldown(player, "snow", 5 * 1000)) || (AbominableSnowman.this.r.contains(player.getName()))) {
                                    AbominableSnowman.this.r.add(player.getName());
                                    float f = this.lol.floatValue() * 10.0F;
                                    if (BarAPI.hasBar(player))
                                        BarAPI.removeBar(player);
                                    BarAPI.setMessage(player, ChatColor.AQUA + "" + ChatColor.BOLD + "Blind Radius " + Float.toString(this.lol.floatValue()), f);
                                    this.lol = Integer.valueOf(this.lol.intValue() + 1);
                                } else {
                                    AbominableSnowman.this.r.remove(player.getName());
                                    Long lol = Long.valueOf(Cooldowns.getCooldown(player, "snow"));
                                    int bbb = lol.intValue() / 1000;
                                    player.sendMessage(ChatColor.AQUA + "Abominable Snowman" + ChatColor.RED + " is on cooldown for " + Integer.toString(bbb));
                                    cancel();
                                }
                            } else {
                                AbominableSnowman.this.activate(player, this.lol.intValue());
                                cancel();
                            }
                        } else {
                            if (this.lol.intValue() > 0) {
                                AbominableSnowman.this.activate(player, this.lol.intValue());
                            }
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, 0L, 20L);
            }
        }
    }

    HashMap<String, BukkitTask> blinded = new HashMap<>();

    public void activate(final Player player, int radius)
    {
        boolean b = false;
        int bb = 0;
        this.r.remove(player.getName());
        BarAPI.removeBar(player);
        StringBuilder playersAffected = new StringBuilder();
        List<Entity> entities = player.getNearbyEntities(radius, radius, radius);
        ArrayList<Player> players = new ArrayList<Player>();
        for (Entity p : entities)
        {
            if ((p instanceof Player))
            {
                bb++;
                final Player oo = (Player)p;
                players.add(oo);
                if(!InvisRing.invislist.containsKey(player.getUniqueId()))
                {
                    if (!this.froze.contains(oo.getName()))
                    {
                        blinded.put(oo.getName(), new BukkitRunnable() {
                            @Override
                            public void run() {
                                for(Player p : players)
                                {
                                    for(int i = 0; i < 20; i++)
                                    {
                                        p.getWorld().playEffect(p.getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, 80);
                                        p.getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, 80);
                                    }
                                }
                            }
                        }.runTaskTimer(plugin, 0L, 5L));
                        b = true;
                        this.froze.add(oo.getName());
                        oo.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, radius * 20, 0));
                        int ii = 3;
                        BarAPI.setMessage(oo, ChatColor.AQUA + "" + ChatColor.BOLD + "You have been blinded by " + player.getName(), ii);
                        oo.sendMessage(ChatColor.GRAY + "You have been blinded " + ChatColor.RED + "for " + (radius - 1) + " seconds" + ChatColor.GRAY
                                + " by " + ChatColor.AQUA + player.getName());

                        if(oo != player)
                        {
                            playersAffected.append(ChatColor.AQUA + oo.getName());
                            playersAffected.append(ChatColor.GRAY + ", ");
                        }

                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable()
                        {
                            public void run()
                            {
                                AbominableSnowman.this.froze.remove(oo.getName());
                                blinded.get(oo.getName()).cancel();
                                blinded.remove(oo.getName());
                                BarAPI.removeBar(oo);
                            }
                        }, ii * 20L);
                    }
                }
            }
        }
        if(playersAffected.length() > 0)
        {
            player.sendMessage(ChatColor.GRAY + "You have blinded: " + playersAffected.toString());
        }
        if ((bb == 0) && (!b)) {
            player.sendMessage(ChatColor.RED + "You did not affect anyone.");
        }
    }
}
