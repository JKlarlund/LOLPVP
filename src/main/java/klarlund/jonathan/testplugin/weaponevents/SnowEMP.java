package klarlund.jonathan.testplugin.weaponevents;

import klarlund.jonathan.testplugin.MoreProjectiles.TypedRunnable;
import klarlund.jonathan.testplugin.MoreProjectiles.event.CustomProjectileHitEvent;
import klarlund.jonathan.testplugin.MoreProjectiles.projectile.ItemProjectile;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scheduler.BukkitRunnable;
import org.inventivetalent.bossbar.BossBarAPI;

import java.util.ArrayList;
import java.util.List;

public class SnowEMP implements Listener {

    private List<String> emped;

    public SnowEMP() {
        this.emped = new ArrayList<>();
    }


    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getItemInHand().getType() != Material.AIR) {
            if (player.getItemInHand().getItemMeta().equals(ItemManager.snowemp.getItemMeta())) {
                if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                    event.setCancelled(true);
                    if (!player.getGameMode().equals(GameMode.CREATIVE) && player.getItemInHand().getAmount() == 1) {
                        player.setItemInHand(null);
                    }
                    else if (!player.getGameMode().equals(GameMode.CREATIVE) && player.getItemInHand().getAmount()>1){
                        player.getInventory().getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
                    }
                    ItemProjectile itemProjectile = new ItemProjectile("SNOWEMP", (LivingEntity) player, ItemManager.snowemp, 0.4F);
                    itemProjectile.addTypedRunnable(new TypedRunnable<ItemProjectile>() {
                        public void run(ItemProjectile o) {

                            Location ProjectileLocation = o.getEntity().getLocation();

                            o.getEntity().getWorld().playEffect(ProjectileLocation, Effect.FIREWORKS_SPARK, 10);

                            /*
                            Commented out due to "Ticking Error" crashreport.
                            ParticleEffect.FIREWORKS_SPARK.display(0.0F, 0.0F, 0.0F, 0.0F, 1, o.getEntity().getLocation(), 10.0D);
                             */
                            o.getEntity().getWorld().playSound(o.getEntity().getLocation(), Sound.FUSE, 1.0F, 200.0F);
                        }
                    });
                }
            }
        }
    }

    @EventHandler
    public void onHit(CustomProjectileHitEvent event) {
        Player player = (Player) event.getProjectile().getShooter();
        if (event.getProjectile().getProjectileName().equalsIgnoreCase("SNOWEMP"))
            if (event.getHitType().equals(CustomProjectileHitEvent.HitType.BLOCK) || event.getHitType().equals(CustomProjectileHitEvent.HitType.ENTITY))
                if (event.getProjectile().getShooter() != event.getHitEntity()) {

                    /*
                    Ticking Error
                    ParticleEffect.SPELL.display(1.0F, 1.0F, 1.0F, 1.0F, 100, event.getProjectile().getEntity().getLocation(), 100.0D);
                     */
                    Location ProjectileLocation = event.getProjectile().getEntity().getLocation();
                    event.getProjectile().getEntity().getWorld().playEffect(ProjectileLocation, Effect.SPELL, 0, 2);
                    event.getProjectile().getEntity().getWorld().playSound(event.getProjectile().getEntity().getLocation(), Sound.EXPLODE, 1.0F, 10.0F);

                    List<Entity> victims = event.getProjectile().getEntity().getNearbyEntities(2.75D, 2.75D, 2.75D);
                    for (Entity victim : victims) {
                        if (victim instanceof LivingEntity && !victim.equals(player)) {
                            for (PotionEffect potions : ((LivingEntity) victim).getActivePotionEffects())
                                ((LivingEntity) victim).removePotionEffect(potions.getType());
                            if (victim instanceof Player) {
                                Player player1 = (Player) victim;
                                BossBarAPI.setMessage(player1, ChatColor.BOLD + "" + ChatColor.RED + "EMP'd Teleportation Is Disabled", 100.0F, 4);
                                if (!this.emped.contains(((Player) victim).getName())) {
                                    this.emped.add(((Player) victim).getName());
                                    (new BukkitRunnable() {
                                        public void run() {
                                            SnowEMP.this.emped.remove(((Player) victim).getName());
                                        }
                                    }).runTaskLater((Plugin) this, 80L);
                                }
                            }
                        }
                    }
                } else if (!player.getGameMode().equals(GameMode.CREATIVE)) {
                    player.getInventory().addItem(ItemManager.snowemp);
                }
    }

    @EventHandler
    public void onTeleport(PlayerTeleportEvent event) {
        if (this.emped.contains(event.getPlayer().getName()) && (
                event.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL || event.getCause() == PlayerTeleportEvent.TeleportCause.PLUGIN))
            event.setCancelled(true);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        this.emped.remove(event.getPlayer().getName());
    }
}

