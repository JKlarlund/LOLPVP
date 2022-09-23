package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import klarlund.jonathan.testplugin.utilstest.Cooldowns;
import me.confuser.barapi.BarAPI;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashSet;

public class Iceblade implements Listener {

    private HashSet<String> r;

    public static HashSet<String> froze;

    Main plugin;

    public Iceblade(Main plugin){
        this.plugin = plugin;
        this.r = new HashSet<String>();
        this.froze = new HashSet<String>();
    }

    @EventHandler
    public void onVelocityChange(PlayerVelocityEvent event)
    {
        if(froze.contains(event.getPlayer().getName()))
        {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event)
    {
        Player player = event.getPlayer();
        if(BarAPI.hasBar(player)
                && BarAPI.getMessage(player).equals("Ender Dragon"))
        {
            BarAPI.removeBar(event.getPlayer());
        }
        if ((froze.contains(event.getPlayer().getName())) &&
                (event.getFrom().getY() < event.getTo().getY())) {
            event.setTo(new Location(player.getWorld(), event.getFrom().getX(), event.getFrom().getY(), event.getFrom().getZ(), event.getTo().getYaw(), event.getTo().getPitch()));
        }
    }

    @EventHandler
    public void onDmg(EntityDamageEvent event)
    {
        if(event.getEntity() instanceof Player)
        {
            Player player = (Player)event.getEntity();
            if(froze.contains(player.getName()))
            {
                if(event.getCause().equals(EntityDamageEvent.DamageCause.FALL) || event.getCause().equals(EntityDamageEvent.DamageCause.CONTACT))
                {
                    event.setDamage(0.0);
                    event.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event)
    {
        event.getPlayer().setWalkSpeed(0.2F);
    }


    @EventHandler
    public void onThis(PlayerToggleSneakEvent event) {
        final Player player = event.getPlayer();
        if (player.getItemInHand() != null && player.getItemInHand().getType() != Material.AIR) {
            if (player.getItemInHand().getItemMeta().equals(ItemManager.iceblade.getItemMeta()) && (!r.contains(player.getName()))) {
                new BukkitRunnable() {
                    Integer lol = Integer.valueOf(0);

                    public void run() {
                        if (player.isSneaking() && player.getItemInHand().getItemMeta().equals(ItemManager.iceblade.getItemMeta())) {
                            if (this.lol.intValue() <= 10) {
                                if ((Cooldowns.tryCooldown(player, "ice", 5 * 1000)) || (r.contains(player.getName()))) {
                                    //add
                                    r.add(player.getName());
                                    float f = this.lol.floatValue() * 10.0F;
                                    if (BarAPI.hasBar(player))
                                        BarAPI.removeBar(player);
                                    BarAPI.setMessage(player, ChatColor.AQUA + "" + ChatColor.BOLD + "Freeze Radius: " + Float.toString(this.lol.floatValue()), f);
                                    player.sendMessage(ChatColor.GRAY + "Freeze Power: " + ChatColor.AQUA + "" + ChatColor.BOLD + lol.intValue());
                                    this.lol = Integer.valueOf(this.lol.intValue() + 1);
                                } else {
                                    //remove
                                    r.remove(player.getName());
                                    Long lol = Long.valueOf(Cooldowns.getCooldown(player, "ice"));
                                    int bbb = lol.intValue() / 1000;
                                    player.sendMessage("§bIceblade" + ChatColor.RED + " is on cooldown for " + Integer.toString(bbb));
                                    cancel();
                                }
                            } else {
                                //remove
                                player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Charged!");
                                activate(player, this.lol.intValue());
                                cancel();
                            }
                        } else {
                            if (this.lol.intValue() > 0) {
                                //remove
                                player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Charged!");
                                activate(player, this.lol.intValue());
                            }
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, 0L, 20L);
            }
        }
    }

    public void activate(final Player player, int radius)
    {
        boolean b = false;
        this.r.remove(player.getName());
        BarAPI.removeBar(player);
        int bb = 0;
        StringBuilder playersAffected = new StringBuilder();
        for (Entity p : player.getNearbyEntities(radius, radius, radius))
        {
            if ((p instanceof Player))
            {
                final Player oo = (Player)p;
                bb++;
                    if (!froze.contains(oo.getName()))
                    {
                        b = true;
                        froze.add(oo.getName());
                        player.playSound(player.getLocation(), Sound.ENDERDRAGON_WINGS, 10.0F, 10.0F);
                        //Particle.CLOUD.display(player.getLocation(), 1.0F, 1.0F, 1.0F, 1.0F, 30);
                        int ii = 3;
                        oo.setWalkSpeed(1.0E-004F);
                        BarAPI.setMessage(oo, ChatColor.AQUA + "" + ChatColor.BOLD + "You have been frozen by " + player.getName(), ii);
                        oo.sendMessage(ChatColor.GRAY + "You have been frozen by " + ChatColor.AQUA + player.getName());
                        playersAffected.append(ChatColor.AQUA + oo.getName() + ChatColor.GRAY + ", ");
                        //ParticleEffect.CLOUD.display(oo.getLocation(), 1.0F, 1.0F, 1.0F, 1.0F, 40);
                        //ParticleEffect.CLOUD.display(oo.getLocation(), 1.0F, 1.0F, 1.0F, 1.0F, 40);
                        oo.getWorld().playEffect(oo.getLocation(), Effect.STEP_SOUND, 79);
                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
                        {
                            public void run()
                            {
                                froze.remove(oo.getName());
                                BarAPI.removeBar(oo);
                                oo.setWalkSpeed(0.2F);
                            }
                        }, ii * 20L);
                    }
                }
                else
                {
                    player.sendMessage(ChatColor.RED + "You cannot use this weapon here.");
                    this.r.remove(player.getName());
                    break;
                }
            }

        if(playersAffected.length() > 0)
        {
            player.sendMessage(ChatColor.GRAY + "You have frozen: " + playersAffected.toString());
        }
        if ((bb == 0) && (!b)) {
            player.sendMessage(ChatColor.RED + "You did not affect anyone.");
        }
    }


}

