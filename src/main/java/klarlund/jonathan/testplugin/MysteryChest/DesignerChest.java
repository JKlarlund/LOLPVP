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

import java.util.List;
import java.util.Random;

public class DesignerChest implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();

        //Something null here
        if (player.getItemInHand().getType() != Material.AIR) {

            if (player.getItemInHand().getItemMeta().equals(ChestManager.DesignerChest.getItemMeta())) {
                if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
                    event.setCancelled(true);

                    int ChestAmount = player.getInventory().getItemInHand().getAmount();

                    if(ChestAmount>1){
                        player.getInventory().getItemInHand().setAmount(ChestAmount - 1);
                    } else {
                        player.setItemInHand(new ItemStack(Material.AIR));
                    }

                    List<Player> onlinePlayers = (List<Player>) Bukkit.getOnlinePlayers();
                    for (Player recipient: onlinePlayers){
                        recipient.sendMessage(ChatColor.AQUA + player.getName() + " " + ChatColor.RED + "just opened a Designer Chest!");
                        recipient.sendMessage(ChatColor.YELLOW + "Get YOURS now at " + ChatColor.AQUA + "SHOP.LOLPVP.ORG!");
                    }

                    player.getInventory().addItem(new ItemStack(Material.WOOL, 64));
                    for (int i = 1; i<16; i = i + 1){
                        player.getInventory().addItem(new ItemStack(Material.WOOL, 64, (short) i));
                    }
                }
            }
        }
    }
}

