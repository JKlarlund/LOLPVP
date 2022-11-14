package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LOLSell {

    public static void SellItem(Player player, ItemStack balleritem){

        if (balleritem.getItemMeta().equals(ItemManager.ejacul8.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 9000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.ejacul8.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" + ChatColor.AQUA + "9,000,000");
        }

        else if (balleritem.getItemMeta().equals(ItemManager.wifebeater.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 4500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.wifebeater.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" +
                    ChatColor.AQUA + "4,500,000");

        }
        else if (balleritem.getItemMeta().equals(ItemManager.daterapist.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 4500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.daterapist.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "4,500,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.battleaxe.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 4500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.battleaxe.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "4,500,000");
        }

        else if (balleritem.getItemMeta().equals(ItemManager.angelwings.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 9000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.angelwings.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "9,000,000");
        }

        else if (balleritem.getItemMeta().equals(ItemManager.abominablesnowman.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 10000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" + ChatColor.AQUA + "10,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.bunnybeater.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 4500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "4,500,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 10000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.invisring.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "10,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.mjolnir.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 18000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.mjolnir.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "18,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.magicsperm.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 35000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.magicsperm.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "35,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.payday.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 50000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.payday.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "50,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.babymaker.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 4500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.babymaker.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "4,500,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.enderbow.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 1000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.enderbow.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "1,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.iceblade.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 15000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.iceblade.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "15,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.rocketboots.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 9000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.rocketboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "9,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.morningbj.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 1000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.morningbj.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "1,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.morningwood.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 1000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.morningwood.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "1,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.sparringaxe.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 1000000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.sparringaxe.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "1,000,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.excalibur.getItemMeta())) {
            player.getInventory().remove(player.getItemInHand());
            Main.getEconomy().depositPlayer(player, 500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.excalibur.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "500,000");

        }


        else if (balleritem.getItemMeta().equals(ItemManager.snowboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowlegs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.snowchest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 2500000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.snowboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "2,500,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot5boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5legs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot5chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5helm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 1125000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot5boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "1,125,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot5aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aelegs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot5aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aehelm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 2250000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot5aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "2,250,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot6boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6legs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot6chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6helm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 3750000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot6boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "3,750,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot4boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4legs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot4chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4helm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 125000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot4boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "125,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot6aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aelegs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot6aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aehelm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 3750000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot6aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "3,750,000");

        }

        else if (balleritem.getItemMeta().equals(ItemManager.prot4aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aelegs.getItemMeta())
                || balleritem.getItemMeta().equals(ItemManager.prot4aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aehelm.getItemMeta())) {
            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
            Main.getEconomy().depositPlayer(player, 375000);
            player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot4aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                    + ChatColor.AQUA + "375,000");
        }

        else {
            player.sendMessage(ChatColor.RED + "That is not a baller item!");
        }



    }


}
