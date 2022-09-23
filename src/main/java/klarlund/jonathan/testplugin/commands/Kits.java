package klarlund.jonathan.testplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Kits implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (!(sender instanceof Player)){
            sender.sendMessage("Needs a player to run");
            return true;
        }

        if (command.getName().equalsIgnoreCase("ironman")) {

            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180 * 20, 2));
            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180 * 20, 2));

            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " IRONMAN " +  ChatColor.GRAY + "kit.");

            return true;
        }

        if (command.getName().equalsIgnoreCase("regen")){

            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 180 * 20, 1));
            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " REGEN " +  ChatColor.GRAY + "kit.");

        }

        if (command.getName().equalsIgnoreCase("fireresistance")){

            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 180 * 20, 0));
            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " FIRE RESISTANCE " +  ChatColor.GRAY + "kit.");

        }

        if (command.getName().equalsIgnoreCase("nightvision")){

            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 180 * 20, 0));
            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " NIGHT VISION " +  ChatColor.GRAY + "kit.");

        }

        if (command.getName().equalsIgnoreCase("ironman2")){

            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180 * 20, 2));
            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180 * 20, 1));
            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " IRONMAN " +  ChatColor.GRAY + "kit.");

        }

        if (command.getName().equalsIgnoreCase("invisibility")){
            ((Player) sender).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
            sender.sendMessage(ChatColor.GRAY + "You have taken" + ChatColor.AQUA + " INVIS " +  ChatColor.GRAY + "kit.");

        }

        return true;



    }
}
