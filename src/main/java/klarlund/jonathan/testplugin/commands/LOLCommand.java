package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class LOLCommand implements CommandExecutor {

    public HashMap<UUID, Long> TagCooldown = new HashMap<UUID, Long>();
    private void CommandInfoMessage(Player player){
        player.sendMessage(ChatColor.AQUA + "-------LOLPVP Commands-------");
        player.sendMessage(ChatColor.AQUA + "/lol p" + ChatColor.GRAY + ": Check selling price of baller item in your hand.");
        player.sendMessage(ChatColor.AQUA + "/lol s" + ChatColor.GRAY + ": Sell baller item.");
        player.sendMessage(ChatColor.AQUA + "/lol t" + ChatColor.GRAY + ": Change your tag!");
    }


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

                CommandInfoMessage(player);


            } else if (args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("sell")) {
                ItemStack balleritem = player.getItemInHand();

                if (balleritem.getType() == Material.AIR || balleritem.getItemMeta() == null) {
                    player.sendMessage(ChatColor.RED + "That is not a baller item!");
                    return true;
                }

                LOLSell.SellItem(player, balleritem);

                return true;




            } else if (args[0].equalsIgnoreCase("p") || args[0].equalsIgnoreCase("price")) {
                ItemStack balleritem = player.getItemInHand();

                if (balleritem.getType() == Material.AIR || balleritem.getItemMeta() == null) {
                    player.sendMessage(ChatColor.RED + "That is not a baller item!");
                    return true;
                }


                else if (balleritem.getItemMeta().equals(ItemManager.ejacul8.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.ejacul8.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");
                }

                else if (balleritem.getItemMeta().equals(ItemManager.wifebeater.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.wifebeater.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");

                }
                else if (balleritem.getItemMeta().equals(ItemManager.daterapist.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.daterapist.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                else if (balleritem.getItemMeta().equals(ItemManager.battleaxe.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.battleaxe.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                else if (balleritem.getItemMeta().equals(ItemManager.angelwings.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.angelwings.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");
                }

                else if (balleritem.getItemMeta().equals(ItemManager.abominablesnowman.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.abominablesnowman.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "10,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.bunnybeater.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.bunnybeater.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");
                }

                else if (balleritem.getItemMeta().equals(ItemManager.invisring.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.invisring.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "10,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.mjolnir.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.mjolnir.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "18,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.magicsperm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.magicsperm.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "35,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.payday.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.payday.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "50,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.babymaker.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.babymaker.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "4,500,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.enderbow.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.enderbow.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.iceblade.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.iceblade.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "15,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.rocketboots.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.rocketboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "9,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.morningbj.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.morningbj.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.morningwood.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.morningwood.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.sparringaxe.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.sparringaxe.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,000,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.excalibur.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.excalibur.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "500,000");

                }


                else if (balleritem.getItemMeta().equals(ItemManager.snowboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowlegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.snowchest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.snowhelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.snowboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "2,500,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot5boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot5boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "1,250,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot5aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot5aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot5aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot5aeboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "2,250,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot6boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot6boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "3,750,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot4boots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4legs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4chest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4helm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot4boots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "125,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot6aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot6aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot6aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot6aeboots.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "3,750,000");

                }

                else if (balleritem.getItemMeta().equals(ItemManager.prot4aeboots.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aelegs.getItemMeta())
                        || balleritem.getItemMeta().equals(ItemManager.prot4aechest.getItemMeta()) || balleritem.getItemMeta().equals(ItemManager.prot4aehelm.getItemMeta())) {
                    player.sendMessage(ChatColor.GRAY + "The price for a " + ItemManager.prot4aehelm.getItemMeta().getDisplayName() +
                            ChatColor.GRAY + " is " + "$" + ChatColor.AQUA + "375,000");
                }

                else {player.sendMessage(ChatColor.RED + "That is not a baller item!");}
            } else if (args[0].equalsIgnoreCase("t") || args[0].equalsIgnoreCase("tag")) {

                /*
                We need a cooldown thing here
                 */



                if (args.length == 1 || args[1].length() == 0 || args[1].length() > 4 ){
                    player.sendMessage(ChatColor.RED + "Tag must be between 2-4 characters!");
                }

                else{

                    if (Main.getPerm().playerInGroup(player, "STAFF")){
                        player.sendMessage(ChatColor.RED + "Nah mayn!!");
                        return true;
                    }


                    /*
                    This should set tag in all worlds (end is not available)
                     */
                    if (Main.getPerm().playerInGroup(player, "topdonator")) {
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world_nether"), player.getDisplayName(), "&8[" + "&a" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("Plots"), player.getDisplayName(), "&8[" + "&a" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world"), player.getDisplayName(), "&8[" + "&a" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(player, "&8[" + "&a" + args[1].toString() + "&8]");

                    } else if (Main.getPerm().playerHas(player, "tag.black")) {
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world_nether"), player.getDisplayName(), "&8[" + "&0" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("Plots"), player.getDisplayName(), "&8[" + "&0" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world"), player.getDisplayName(), "&8[" + "&0" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(player, "&8[" + "&0" + args[1].toString() + "&8]");
                    }
                    /*
                    We could make a permission group containing fx. killach so then
                     */
                    else if (Main.getPerm().playerHas(player, "tag.money")) {
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world_nether"), player.getDisplayName(), "&8[" + "&9" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("Plots"), player.getDisplayName(), "&8[" + "&9" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world"), player.getDisplayName(), "&8[" + "&9" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(player, "&8[" + "&9" + args[1].toString() + "&8]");
                    } else if (Main.getPerm().playerHas(player, "tag.magic")) {
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world_nether"), player.getDisplayName(), "&8[" + "&k" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("Plots"), player.getDisplayName(), "&8[" + "&k" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world"), player.getDisplayName(), "&8[" + "&k" + args[1].toString() + "&8]");

                        Main.getChat().setPlayerPrefix(player, "&8[" + "&k" + args[1].toString() + "&8]");
                    } else if (Main.getPerm().playerInGroup(player, "VIP") || Main.getPerm().playerInGroup(player, "VIP+")
                            || Main.getPerm().playerInGroup(player, "THAD")) {
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world_nether"), player.getDisplayName(), "&8[" + "&4" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("Plots"), player.getDisplayName(), "&8[" + "&4" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(Bukkit.getWorld("world"), player.getDisplayName(), "&8[" + "&4" + args[1].toString() + "&8]");
                        Main.getChat().setPlayerPrefix(player, "&8[" + "&4" + args[1].toString() + "&8]");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "You do not have permission to change tag!");
                        return true;
                    }
                    player.sendMessage(ChatColor.RED + "Tag set!");
                }
            }
        }

        return true;

    }
}
