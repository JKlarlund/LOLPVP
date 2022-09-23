package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class WeaponCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Not currently available through console");
            return true;
        }
        Player player = (Player) sender;
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
        if (command.getName().equalsIgnoreCase("enderbow")) {
            player.getInventory().addItem((ItemManager.enderbow));
        }
        if (command.getName().equalsIgnoreCase("babymaker")) {
            player.getInventory().addItem(ItemManager.babymaker);
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
        return true;

    }
}