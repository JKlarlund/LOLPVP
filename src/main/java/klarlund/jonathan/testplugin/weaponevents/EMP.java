//package klarlund.jonathan.testplugin.events;
//
////import com.stirante.MoreProjectiles.projectile.CustomProjectile;
////import com.stirante.MoreProjectiles.projectile.ItemProjectile;
//import klarlund.jonathan.testplugin.items.ItemManager;
//import klarlund.jonathan.testplugin.utilstest.*;
//import org.bukkit.GameMode;
//import org.bukkit.Sound;
//import org.bukkit.entity.Entity;
//import org.bukkit.entity.LivingEntity;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.bukkit.event.block.Action;
//import org.bukkit.event.player.PlayerInteractEvent;
//import org.bukkit.potion.PotionEffect;
//
//import java.util.List;
//
//public class EMP implements Listener {
//
//    //Creating Instance of class OwnParticles to use method in here.
//    OwnParticles ownparticles = new OwnParticles();
//
//    @EventHandler
//    public void onInteract(PlayerInteractEvent event)
//    {
//        Player player = event.getPlayer();
//        if(player.getItemInHand().equals(ItemManager.emp.getItemMeta()))
//        {
//            if(event.getAction().equals(Action.RIGHT_CLICK_AIR)
//                    || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
//            {
//                event.setCancelled(true);
//                if (!player.getGameMode().equals(GameMode.CREATIVE))
//                {
//                    player.setItemInHand(null);
//                }
//
//                CustomProjectile<ItemProjectile> projectile = (CustomProjectile<ItemProjectile>) new ItemProjectile("EMP", player, ItemManager.emp, 0.4F);
///*
//Below line said:
//Class 'Anonymous class derived from TypedRunnable' must either be declared abstract or implement abstract method 'run(T)' in 'TypedRunnable'
//Went ahead and implemented methods
// */
//
//                projectile.addTypedRunnable(new TypedRunnable<ItemProjectile>()
//                {
//                    public void run(ItemProjectile o)
//                    {
//
//                        //Calling method with inputs Location location and getPlayersinrange as player input.
//                        ownparticles.spawnParticleFIREWORKS(o.getEntity().getLocation(), OwnParticles.getPlayersInRange(o.getEntity().getLocation(), 20D));
//                        // Old code: Particles.FIREWORKS_SPARK.display(o.getEntity().getLocation(), 0.0F, 0.0F, 0.0F, 0.0F, 1);
//                        o.getEntity().getWorld().playSound(o.getEntity().getLocation(), Sound.FUSE, 1.0F, 200.0F);
//                    }
//                });
//            }
//        }
//    }
//
//    @EventHandler
//    public void onHit(CustomProjectileHitEvent event)
//    {
//        Player player = (Player) event.getProjectile().getShooter();
//        if(event.getProjectile().getProjectileName().equalsIgnoreCase("EMP"))
//        {
//            if(((event.getHitType().equals(CustomProjectileHitEvent.HitType.BLOCK) || event.getHitType().equals(CustomProjectileHitEvent.HitType.ENTITY))))
//            {
//                if(event.getProjectile().getShooter() != event.getHitEntity())
//                {
//                    //Particles.SPELL.display(event.getProjectile().getEntity().getLocation(), 1.0F, 1.0F, 1.0F, 1.0F, 100);
//                    event.getProjectile().getEntity().getWorld().playSound(event.getProjectile().getEntity().getLocation(), Sound.EXPLODE, 1.0F, 10.0F);
//                    List<Entity> victims = event.getProjectile().getEntity().getNearbyEntities(2.75D, 2.75D, 2.75D);
//                    for (Entity victim : victims)
//                    {
//                        if ((victim instanceof LivingEntity) && !victim.equals(player))
//                        {
//                            for (PotionEffect potions : ((LivingEntity)victim).getActivePotionEffects())
//                            {
//                                ((LivingEntity)victim).removePotionEffect(potions.getType());
//                            }
//                        }
//                    }
//                }
//                else
//                {
//                    if (!player.getGameMode().equals(GameMode.CREATIVE))
//                    {
//                        //player.getInventory().addItem(ItemManager.getInstance().getItemStack(this));
//
//                    }
//                }
//            }
//        }
//    }
//
//
//
//}
//
//
