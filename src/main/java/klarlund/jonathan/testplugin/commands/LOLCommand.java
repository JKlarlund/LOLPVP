package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class LOLCommand implements CommandExecutor {

    public HashMap<UUID, Long> TagCooldown = new HashMap<UUID, Long>();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Not currently available through console");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("lol")) {

            if (args.length == 0) {

                /*
                Lists commands available to player.
                 */

                player.sendMessage(ChatColor.AQUA + "-------LOLPVP Commands-------");
                player.sendMessage(ChatColor.AQUA + "/lol p" + ChatColor.GRAY + ": Check selling price of baller item in your hand.");
                player.sendMessage(ChatColor.AQUA + "/lol s" + ChatColor.GRAY + ": Sell baller item.");

            } else if (args[0].equalsIgnoreCase("s")) {
                ItemStack balleritem = player.getItemInHand();

                if (balleritem.getType() == Material.AIR || balleritem.getItemMeta() == null) {
                    return true;
                }

                if (balleritem.getItemMeta().equals(ItemManager.ejacul8.getItemMeta())) {
                    player.getInventory().remove(ItemManager.ejacul8);
                    Main.getEconomy().depositPlayer(player, 9000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.ejacul8.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" + ChatColor.AQUA + "9,000,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.wifebeater.getItemMeta())) {
                    player.getInventory().remove(ItemManager.wifebeater);
                    Main.getEconomy().depositPlayer(player, 4500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.wifebeater.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" +
                            ChatColor.AQUA + "4,500,000");

                }
                if (balleritem.getItemMeta().equals(ItemManager.daterapist.getItemMeta())) {
                    player.getInventory().remove(ItemManager.daterapist);
                    Main.getEconomy().depositPlayer(player, 4500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.daterapist.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "4,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.battleaxe.getItemMeta())) {
                    player.getInventory().remove(ItemManager.battleaxe);
                    Main.getEconomy().depositPlayer(player, 4500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.battleaxe.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "4,500,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.angelwings.getItemMeta())) {
                    player.getInventory().remove(ItemManager.angelwings);
                    Main.getEconomy().depositPlayer(player, 9000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.angelwings.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "9,000,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.abominablesnowman.getItemMeta())) {
                    player.getInventory().remove(ItemManager.abominablesnowman);
                    Main.getEconomy().depositPlayer(player, 10000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$" + ChatColor.AQUA + "10,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.bunnybeater.getItemMeta())) {
                    player.getInventory().remove(ItemManager.bunnybeater);
                    Main.getEconomy().depositPlayer(player, 4500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "4,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
                    player.getInventory().remove(ItemManager.invisring);
                    Main.getEconomy().depositPlayer(player, 10000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.invisring.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "10,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.mjolnir.getItemMeta())) {
                    player.getInventory().remove(ItemManager.mjolnir);
                    Main.getEconomy().depositPlayer(player, 18000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.mjolnir.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "18,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.magicsperm.getItemMeta())) {
                    player.getInventory().remove(ItemManager.magicsperm);
                    Main.getEconomy().depositPlayer(player, 35000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.magicsperm.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "35,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.payday.getItemMeta())) {
                    player.getInventory().remove(ItemManager.payday);
                    Main.getEconomy().depositPlayer(player, 50000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.payday.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "50,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.babymaker.getItemMeta())) {
                    player.getInventory().remove(ItemManager.babymaker);
                    Main.getEconomy().depositPlayer(player, 4500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.babymaker.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "4,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.enderbow.getItemMeta())) {
                    player.getInventory().remove(ItemManager.enderbow);
                    Main.getEconomy().depositPlayer(player, 1000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.enderbow.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.iceblade.getItemMeta())) {
                    player.getInventory().remove(ItemManager.iceblade);
                    Main.getEconomy().depositPlayer(player, 15000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.iceblade.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "15,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.rocketboots.getItemMeta())) {
                    player.getInventory().remove(ItemManager.rocketboots);
                    Main.getEconomy().depositPlayer(player, 9000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.rocketboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "9,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.morningbj.getItemMeta())) {
                    player.getInventory().remove(ItemManager.morningbj);
                    Main.getEconomy().depositPlayer(player, 1000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.morningbj.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.morningwood.getItemMeta())) {
                    player.getInventory().remove(ItemManager.morningwood);
                    Main.getEconomy().depositPlayer(player, 1000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.morningwood.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.sparringaxe.getItemMeta())) {
                    player.getInventory().remove(ItemManager.sparringaxe);
                    Main.getEconomy().depositPlayer(player, 1000000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.sparringaxe.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.excalibur.getItemMeta())) {
                    player.getInventory().remove(ItemManager.excalibur);
                    Main.getEconomy().depositPlayer(player, 500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.excalibur.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "500,000");

                }


                if (balleritem.getItemMeta().equals(ItemManager.snowboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowlegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.snowchest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 2500000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.snowboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "2,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot5boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5helm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 1125000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot5boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "1,125,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot5aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aehelm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 2250000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot5aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "2,250,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot6boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6helm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 3750000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot6boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "3,750,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot4boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4helm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 375000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot4boots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "375,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot6aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aehelm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 3750000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot6aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "3,750,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot4aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aehelm.getItemMeta())) {
                    player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                    Main.getEconomy().depositPlayer(player, 375000);
                    player.sendMessage(ChatColor.GRAY + "You have sold a " + ItemManager.prot4aeboots.getItemMeta().getDisplayName() + ChatColor.GRAY + " for " + "$"
                            + ChatColor.AQUA + "375,000");

                } else {
                    player.sendMessage(ChatColor.RED + "That is not a baller item!");
                }


            } else if (args[0].equalsIgnoreCase("p")) {
                ItemStack balleritem = player.getItemInHand();

                if (balleritem.getType() == Material.AIR || balleritem.getItemMeta() == null) {
                    return true;
                }


                if (balleritem.getItemMeta().equals(ItemManager.ejacul8.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.ejacul8.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.wifebeater.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.wifebeater.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");

                }
                if (balleritem.getItemMeta().equals(ItemManager.daterapist.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.daterapist.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.battleaxe.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.battleaxe.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.angelwings.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.angelwings.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.abominablesnowman.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "10,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.bunnybeater.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.bunnybeater.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                if (balleritem.getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.invisring.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "10,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.mjolnir.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.mjolnir.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "18,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.magicsperm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.magicsperm.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "35,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.payday.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.payday.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "50,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.babymaker.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.babymaker.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.enderbow.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.enderbow.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.iceblade.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.iceblade.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "15,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.rocketboots.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.rocketboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.morningbj.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.morningbj.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.morningwood.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.morningwood.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.sparringaxe.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.sparringaxe.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.excalibur.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.excalibur.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "500,000");

                }


                if (balleritem.getItemMeta().equals(ItemManager.snowboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowlegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.snowchest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.snowboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "2,500,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot5boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot5boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,250,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot5aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot5aeboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "2,250,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot6boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot6boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "3,750,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot4boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot4boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "375,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot6aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot6aeboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "3,750,000");

                }

                if (balleritem.getItemMeta().equals(ItemManager.prot4aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot4aehelm.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "375,000");
                }


            } else if (args[0].equalsIgnoreCase("t") || args[0].equalsIgnoreCase("tag")) {

                /*
                We need a cooldown thing here
                 */

                if (args[1].length() > 2 && args[1].length() < 5) {

                    boolean killach = false;

                    Main.getChat().setPlayerPrefix(player, "&8[" + "&4" + args[1].toString() + "&8]");
                    player.sendMessage(ChatColor.RED + "Tag set!");
                    /*
                    We could make a permission group containing fx. killach so then
                     */
                    for (String group: Main.getChat().getPlayerGroups(player)){
                        if (group.equals("Killach")){
                            return killach = true;

                        }
                        else{break;}
                    }
                    if (killach){

                    }
                }


            } else {
                player.sendMessage(ChatColor.RED + "Tag must be between 2-4 characters!");
            }


        }

        return true;

    }
}
