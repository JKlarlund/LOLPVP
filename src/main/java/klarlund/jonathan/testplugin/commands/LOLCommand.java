package klarlund.jonathan.testplugin.commands;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LOLCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Not currently available through console");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("lol")){
            player.sendMessage(ChatColor.GRAY +
                    "LOLPVP Command" +
                    "/lol p: Check price of baller item." +
                    "/lol s: Sell baller item"
                    );
        }
        if (command.getName().equalsIgnoreCase("lols")){
            ItemStack balleritem = player.getItemInHand();

            if (balleritem.getItemMeta().equals(ItemManager.ejacul8.getItemMeta())){
                player.getInventory().remove(ItemManager.ejacul8);
                Main.getEconomy().depositPlayer(player, 9000000);
                player.sendMessage(ChatColor.GRAY + "You have been given $9.000.000");
            }

        }

        return true;

    }
}
