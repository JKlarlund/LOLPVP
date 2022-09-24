package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import klarlund.jonathan.testplugin.utilstest.ParticleEffect;
import org.bukkit.*;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Angelwings implements Listener {

    Main plugin;

    HashMap<String, Location> locs = new HashMap<String, Location>();
    ArrayList<String> hitPlayers = new ArrayList<String>();
    ArrayList<String> FlyingPlayers = new ArrayList<String>();

    public Angelwings(Main plugin){
        plugin = this.plugin;
    }


    public boolean checkHeight(Player p, Location loc)
    {
        if (locs.get(p.getName()) != null)
        {
            if (locs.get(p.getName()).getY() + 20 > loc.getY())
            {
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void OnPlayerSneak(PlayerToggleSneakEvent e)
    {
        Player p = e.getPlayer();
        if ((p.getInventory().getChestplate() != null) && p.getInventory().getChestplate().getItemMeta().equals(ItemManager.angelwings.getItemMeta()))
        {
            if (p.getLocation().getBlock().getType() != Material.AIR && locs.containsKey(p.getName()))
            {
                locs.remove(p.getName());
            }
            if (locs.get(p.getName()) == null)
            {
                locs.put(p.getName(), p.getLocation());
            }
            if (checkHeight(p, p.getLocation()) && !hitPlayers.contains(p.getName()))
            {
                p.setVelocity(p.getEyeLocation().getDirection().multiply(0.5).add(new Vector(0,0.5,0)));
                p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1f, 1f);
                //p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 4);
                //p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 4);
                ParticleEffect.FIREWORKS_SPARK.display(p.getLocation(), new Random().nextFloat(), new Random().nextFloat(), new Random().nextFloat(), 0.25f, 30);
                if (p.getAllowFlight() != true)
                {
                    p.setAllowFlight(true);
                }
                if (!FlyingPlayers.contains(p.getName()))
                {
                    FlyingPlayers.add(p.getName());
                }
            }
        }
    }
    @EventHandler
    public void onPlayerToggleFlight(PlayerToggleFlightEvent e)
    {
        Player p = e.getPlayer();
        if ((p.getInventory().getChestplate() != null) && p.getInventory().getChestplate().getItemMeta().equals(ItemManager.angelwings.getItemMeta()) || FlyingPlayers.contains(p.getName()))
        {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onArrowHitPlayer(EntityDamageByEntityEvent e)
    {
        if (e.getDamager() instanceof Arrow)
        {
            if (e.getEntity() instanceof Player)
            {
                Player p = (Player) e.getEntity();
                if (p.getInventory().getChestplate().getItemMeta().equals(ItemManager.angelwings.getItemMeta()))
                {
                    if (p.getLocation().subtract(new Vector(0,1,0)).getBlock().getType() == Material.AIR)
                    {
                        hitPlayers.add(p.getName());
                    }
                }
            }
        }
    }
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e)
    {
        Player p = e.getPlayer();
        if (FlyingPlayers.contains(p.getName()))
        {
            if (p.getInventory().getChestplate() == null){
                p.setAllowFlight(false);
                FlyingPlayers.remove(p.getName());
                if (hitPlayers.contains(p.getName())){
                    hitPlayers.remove(p.getName());
                }
            }
            else if (!p.getInventory().getChestplate().getItemMeta().equals(ItemManager.angelwings.getItemMeta()))
            {
                p.setAllowFlight(false);
            }
            if (p.getLocation().getBlock().getType() != Material.AIR)
            {
                p.setAllowFlight(false);
                FlyingPlayers.remove(p.getName());
                if (hitPlayers.contains(p.getName()))
                {
                    hitPlayers.remove(p.getName());
                }
            }
        }
    }





}


