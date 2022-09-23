package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.Testplugin;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.HashSet;

public class Rocketboots implements Listener {

    Testplugin plugin;

    public final HashSet<String> inrocket = new HashSet<String>();
    public final HashMap<String, Integer> rr = new HashMap<String, Integer>();

    public Rocketboots(Testplugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event){
        if (event.getEntity() instanceof Player){
            Player player = (Player)event.getEntity();
            if ((inrocket.contains(player.getName())) && (event.getCause().equals(EntityDamageEvent.DamageCause.FALL))){
                event.setCancelled(true);
                inrocket.remove(player.getName());
            }


        }
    }


    @EventHandler
    public void onDoubleShift(PlayerToggleSneakEvent event){
        final Player player = event.getPlayer();
        if ((player.getInventory().getBoots() != null) && (player.getInventory().getBoots().getType() != Material.AIR)
            && (player.getInventory().getBoots().getItemMeta().equals(ItemManager.rocketboots.getItemMeta()))
        && (!Iceblade.froze.contains(player.getName()))){
            if (rr.containsKey(player.getName())){
                if (rr.get(player.getName()).intValue() >= 2){
                    rr.remove(player.getName());
                    this.rr.remove(player.getName());
                    player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 1);
                    player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 1);
                    player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 4);
                    player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 4);
                    player.getWorld().playSound(player.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
                    player.setVelocity(new Vector(player.getVelocity().getX(), 2.2, player.getVelocity().getZ()));
                    this.inrocket.add(player.getName());

                }
                else {
                    rr.put(player.getName(), Integer.valueOf(((Integer)this.rr.get(player.getName())).intValue() + 1));
                }
            }
            else {
                rr.put(player.getName(), 1);
            }
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable() {
                @Override
                public void run() {
                    rr.remove(player.getName());
                }
            }, 7L);
        }




    }








}
