package klarlund.jonathan.testplugin.MysteryChest;

import klarlund.jonathan.testplugin.MysteryChest.ChestData.PVPChestData;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class XmasChest implements Listener {

    PVPChestData XmasData = new PVPChestData();


    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){}
            if (player.getItemInHand().getItemMeta() != null || player.getInventory().getItemInHand().getType() != Material.AIR) {
                if (player.getInventory().getItemInHand().getItemMeta().equals(ChestManager.XmasChest.getItemMeta())) {
                    event.setCancelled(true);

                    Random Numbergenerator = new Random();

                    int XmasLuck = Numbergenerator.nextInt(100);

                    int XmasBallerRandom = Numbergenerator.nextInt(XmasData.xmasballer.size());

                    int BallerRandom = Numbergenerator.nextInt(XmasData.BallerWeapon.size());

                    int empluck = Numbergenerator.nextInt(100);

                    if (XmasLuck < 5){
                        player.getInventory().addItem(ItemManager.payday);
                    }

                    if (XmasLuck < 15 && XmasLuck >= 5){
                        player.getInventory().addItem(ChestManager.PVPEliteChest);
                    }

                    if (XmasLuck >= 15 && XmasLuck < 25){
                        player.getInventory().addItem(ChestManager.PVPChest);
                    }

                    if (XmasLuck >= 25 && XmasLuck <= 85) {
                        player.getInventory().addItem(XmasData.xmasballer.get(XmasBallerRandom));
                    }

                    if (XmasLuck > 85){
                        player.getInventory().addItem(ItemManager.snowboots);
                        player.getInventory().addItem(ItemManager.snowlegs);
                        player.getInventory().addItem(ItemManager.snowchest);
                        player.getInventory().addItem(ItemManager.snowhelm);

                    }

                    if (empluck >= 40){
                        player.getInventory().addItem(ItemManager.snowemp);
                        if (empluck >= 60){
                            player.getInventory().addItem(ItemManager.snowemp);
                        }
                        if (empluck >= 70){
                            player.getInventory().addItem(ItemManager.snowemp);

                        }
                        if (empluck >= 80){
                            player.getInventory().addItem(ItemManager.snowemp);
                        }
                        if (empluck >= 90){
                            player.getInventory().addItem(ItemManager.snowemp);

                        }
                    }

                    player.getInventory().addItem(new ItemStack(Material.WEB, 10));
                    player.getInventory().addItem(new ItemStack(Material.ICE, 10));

                    if (player.getItemInHand().getAmount() > 1) {
                        player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
                    } else {
                        player.setItemInHand(new ItemStack(Material.AIR));
                    }

                    for (Player textrecipient : Bukkit.getOnlinePlayers()) {
                        textrecipient.sendMessage(ChatColor.AQUA + player.getName() + " " + ChatColor.RED + "just opened a Christmas Chest!");
                        textrecipient.sendMessage(ChatColor.YELLOW + "Get YOURS now at " + ChatColor.AQUA + "SHOP.LOLPVP.ORG!");
                    }


                }
            }
        }
    }

