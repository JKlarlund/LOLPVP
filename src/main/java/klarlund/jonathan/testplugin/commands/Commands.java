package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.MysteryChest.ChestManager;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryEvent;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = null;

        if (args.length == 0) {
            if (sender instanceof Player) {
                player = (Player) sender;
            }
            else {System.out.println("Syntax is: /[item] [player]");}

        } else {
            if (Bukkit.getPlayer(args[0]) == null) {
                if (sender instanceof Player) {
                    sender.sendMessage(ChatColor.RED + "/[item] [player]");
                } else {
                    System.out.println("Syntax is: /[item] [player]");
                }
            }
            if (Bukkit.getPlayer(args[0]) != null) {
                player = Bukkit.getPlayer(args[0]);
            }
        }

        if (player != null) {

            if (command.getName().equalsIgnoreCase("wifebeater")) {
                player.getInventory().addItem(ItemManager.wifebeater);
            }
            if (command.getName().equalsIgnoreCase("ejacul8")) {
                player.getInventory().addItem(ItemManager.ejacul8);
            }
            if (command.getName().equalsIgnoreCase("mjolnir")) {
                player.getInventory().addItem(ItemManager.mjolnir);
            }
            if (command.getName().equalsIgnoreCase("prot6boots")) {
                player.getInventory().addItem(ItemManager.prot6boots);
            }
            if (command.getName().equalsIgnoreCase("prot6legs")) {
                player.getInventory().addItem(ItemManager.prot6legs);
            }
            if (command.getName().equalsIgnoreCase("prot6chest")) {
                player.getInventory().addItem(ItemManager.prot6chest);
            }
            if (command.getName().equalsIgnoreCase("prot6helm")) {
                player.getInventory().addItem(ItemManager.prot6helm);
            }
            if (command.getName().equalsIgnoreCase("prot6")) {
                player.getInventory().addItem(ItemManager.prot6boots);
                player.getInventory().addItem(ItemManager.prot6legs);
                player.getInventory().addItem(ItemManager.prot6chest);
                player.getInventory().addItem(ItemManager.prot6helm);


            }

            if (command.getName().equalsIgnoreCase("enderbow")) {
                player.getInventory().addItem((ItemManager.enderbow));
            }
            if (command.getName().equalsIgnoreCase("babymaker")) {
                player.getInventory().addItem(ItemManager.babymaker);
            }
            if (command.getName().equalsIgnoreCase("battleaxe")) {
                player.getInventory().addItem(ItemManager.battleaxe);
            }
            if (command.getName().equalsIgnoreCase("bunnybeater")) {
                player.getInventory().addItem(ItemManager.bunnybeater);
            }
            if (command.getName().equalsIgnoreCase("invisring")) {
                player.getInventory().addItem(ItemManager.invisring);
            }
            if (command.getName().equalsIgnoreCase("daterapist")) {
                player.getInventory().addItem(ItemManager.daterapist);
            }
            if (command.getName().equalsIgnoreCase("iceblade")) {
                player.getInventory().addItem(ItemManager.iceblade);
            }
            if (command.getName().equalsIgnoreCase("rocketboots")) {
                player.getInventory().addItem(ItemManager.rocketboots);
            }
            if (command.getName().equalsIgnoreCase("angelwings")) {
                player.getInventory().addItem(ItemManager.angelwings);
            }
            if (command.getName().equalsIgnoreCase("payday")) {
                player.getInventory().addItem(ItemManager.payday);
            }
            if (command.getName().equalsIgnoreCase("emp")) {
                player.getInventory().addItem(ItemManager.emp);
            }
            if (command.getName().equalsIgnoreCase("pvpchest")) {
                player.getInventory().addItem(ChestManager.PVPChest);
            }
            if (command.getName().equalsIgnoreCase("morningbj")) {
                player.getInventory().addItem(ItemManager.morningbj);
            }
            if (command.getName().equalsIgnoreCase("morningwood")) {
                player.getInventory().addItem(ItemManager.morningwood);
            }
            if (command.getName().equalsIgnoreCase("sparringaxe")) {
                player.getInventory().addItem(ItemManager.sparringaxe);
            }
            if (command.getName().equalsIgnoreCase("excalibur")) {
                player.getInventory().addItem(ItemManager.excalibur);
            }
            if (command.getName().equalsIgnoreCase("magicsperm")) {
                player.getInventory().addItem(ItemManager.magicsperm);
            }
            if (command.getName().equalsIgnoreCase("moneytoken")) {
                player.getInventory().addItem(ItemManager.moneytoken);
            }

            if (command.getName().equalsIgnoreCase("prot5")) {
                player.getInventory().addItem(ItemManager.prot5boots);
                player.getInventory().addItem(ItemManager.prot5legs);
                player.getInventory().addItem(ItemManager.prot5chest);
                player.getInventory().addItem(ItemManager.prot5helm);


            }
            if (command.getName().equalsIgnoreCase("prot4")) {
                player.getInventory().addItem(ItemManager.prot4boots);
                player.getInventory().addItem(ItemManager.prot4legs);
                player.getInventory().addItem(ItemManager.prot4chest);
                player.getInventory().addItem(ItemManager.prot4helm);

            }
            if (command.getName().equalsIgnoreCase("prot4ae")) {
                player.getInventory().addItem(ItemManager.prot4aeboots);
                player.getInventory().addItem(ItemManager.prot4aelegs);
                player.getInventory().addItem(ItemManager.prot4aechest);
                player.getInventory().addItem(ItemManager.prot4aehelm);

            }
            if (command.getName().equalsIgnoreCase("prot5ae")) {
                player.getInventory().addItem(ItemManager.prot5aeboots);
                player.getInventory().addItem(ItemManager.prot5aelegs);
                player.getInventory().addItem(ItemManager.prot5aechest);
                player.getInventory().addItem(ItemManager.prot5aehelm);

            }
            if (command.getName().equalsIgnoreCase("prot6ae")) {
                player.getInventory().addItem(ItemManager.prot6aeboots);
                player.getInventory().addItem(ItemManager.prot6aelegs);
                player.getInventory().addItem(ItemManager.prot6aechest);
                player.getInventory().addItem(ItemManager.prot6aehelm);

            }

            if (command.getName().equalsIgnoreCase("snowarmor")) {
                player.getInventory().addItem(ItemManager.snowboots);
                player.getInventory().addItem(ItemManager.snowlegs);
                player.getInventory().addItem(ItemManager.snowchest);
                player.getInventory().addItem(ItemManager.snowhelm);
            }

            if (command.getName().equalsIgnoreCase("pvpelite")) {
                player.getInventory().addItem(ChestManager.PVPEliteChest);
            }

            if (command.getName().equalsIgnoreCase("snowemp")) {
                player.getInventory().addItem(ItemManager.snowemp);
            }
            if (command.getName().equalsIgnoreCase("abominablesnowman")) {
                player.getInventory().addItem(ItemManager.abominablesnowman);
            }
            if (command.getName().equalsIgnoreCase("xmaschest")) {
                player.getInventory().addItem(ChestManager.XmasChest);
            }
        }

        return true;

    }
}