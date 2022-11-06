package klarlund.jonathan.testplugin.Signs;

import klarlund.jonathan.testplugin.Main;
import klarlund.jonathan.testplugin.MysteryChest.ChestManager;
import klarlund.jonathan.testplugin.items.ItemManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SignManager implements Listener {

    public ArrayList<Location> SignLocationList = new ArrayList<>();

    private Main plugin;

    @EventHandler
    public void onSignChange(SignChangeEvent event) {

        Player player = event.getPlayer();

        if (player.isOp()) {
            if (event.getLine(0).equalsIgnoreCase("-BUY-")) {
                event.setLine(0, ChatColor.AQUA + "-BUY-");
            }
        }
    }

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {

        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
            if (block.getType() == Material.SIGN_POST || block.getType() == Material.WALL_SIGN) {
                Sign sign = (Sign) block.getState();
                if (sign.getLine(0).equals(ChatColor.AQUA + "-BUY-")) {
                    String moneyString = sign.getLine(2);
                    String moneyString2 = moneyString.substring(1);
                    String moneyString3 = moneyString2.replace(",", "");
                    Double moneyDouble = Double.parseDouble(moneyString3);

                    if(Main.getEconomy().getBalance(player) < moneyDouble) {
                        player.sendMessage(ChatColor.RED + "Not enough funds!");
                        return;
                    }

                    if (Main.getEconomy().getBalance(player) >= moneyDouble){
                        Main.getEconomy().withdrawPlayer(player, moneyDouble);
                        player.sendMessage(ChatColor.GRAY + "You have purchased a " + ChatColor.AQUA + ChatColor.BOLD + sign.getLine(1));

                    }

                    String itemString = sign.getLine(1);

                    if (itemString.equalsIgnoreCase("Ejacul8")) {
                        player.getInventory().addItem(ItemManager.ejacul8);

                    }
                    if (itemString.equalsIgnoreCase("PROT IV")) {
                        player.getInventory().addItem(ItemManager.prot4boots);
                        player.getInventory().addItem(ItemManager.prot4legs);
                        player.getInventory().addItem(ItemManager.prot4chest);
                        player.getInventory().addItem(ItemManager.prot4helm);


                    }
                    if (itemString.equalsIgnoreCase("PROT IV AE")) {
                        player.getInventory().addItem(ItemManager.prot4aeboots);
                        player.getInventory().addItem(ItemManager.prot4aelegs);
                        player.getInventory().addItem(ItemManager.prot4aechest);
                        player.getInventory().addItem(ItemManager.prot4aehelm);
                    }
                    if (itemString.equalsIgnoreCase("Prot V")) {
                        player.getInventory().addItem(ItemManager.prot5boots);
                        player.getInventory().addItem(ItemManager.prot5legs);
                        player.getInventory().addItem(ItemManager.prot5chest);
                        player.getInventory().addItem(ItemManager.prot5helm);
                    }
                    if (itemString.equalsIgnoreCase("Prot V AE")) {
                        player.getInventory().addItem(ItemManager.prot5aeboots);
                        player.getInventory().addItem(ItemManager.prot5aelegs);
                        player.getInventory().addItem(ItemManager.prot5aechest);
                        player.getInventory().addItem(ItemManager.prot5aehelm);
                    }
                    if (itemString.equalsIgnoreCase("Prot VI")) {
                        player.getInventory().addItem(ItemManager.prot6boots);
                        player.getInventory().addItem(ItemManager.prot6legs);
                        player.getInventory().addItem(ItemManager.prot6chest);
                        player.getInventory().addItem(ItemManager.prot6helm);
                    }
                    if (itemString.equalsIgnoreCase("Prot VI AE")) {
                        player.getInventory().addItem(ItemManager.prot6aeboots);
                        player.getInventory().addItem(ItemManager.prot6aelegs);
                        player.getInventory().addItem(ItemManager.prot6aechest);
                        player.getInventory().addItem(ItemManager.prot6aehelm);
                    }
                    if (itemString.equalsIgnoreCase("Wifebeater")) {
                        player.getInventory().addItem(ItemManager.wifebeater);
                    }
                    if (itemString.equalsIgnoreCase("Excalibur")) {
                        player.getInventory().addItem(ItemManager.excalibur);
                    }
                    if (itemString.equalsIgnoreCase("Morning Wood")) {
                        player.getInventory().addItem(ItemManager.morningwood);
                    }
                    if (itemString.equalsIgnoreCase("Morning BJ")) {
                        player.getInventory().addItem(ItemManager.morningbj);
                    }
                    if (itemString.equalsIgnoreCase("Sparring Axe")) {
                        player.getInventory().addItem(ItemManager.sparringaxe);
                    }
                    if (itemString.equalsIgnoreCase("Battle Axe")) {
                        player.getInventory().addItem(ItemManager.battleaxe);
                    }
                    if (itemString.equalsIgnoreCase("EMP")) {
                        player.getInventory().addItem(ItemManager.emp);
                    }
                    if (itemString.equalsIgnoreCase("Date Rapist")) {
                        player.getInventory().addItem(ItemManager.daterapist);
                    }
                    if (itemString.equalsIgnoreCase("Mjolnir")) {
                        player.getInventory().addItem(ItemManager.mjolnir);
                    }
                    if (itemString.equalsIgnoreCase("Rocket Boots")) {
                        player.getInventory().addItem(ItemManager.rocketboots);
                    }
                    if (itemString.equalsIgnoreCase("Angel wings")) {
                        player.getInventory().addItem(ItemManager.angelwings);
                    }
                    if (itemString.equalsIgnoreCase("Iceblade")) {
                        player.getInventory().addItem(ItemManager.iceblade);
                    }
                    if (itemString.equalsIgnoreCase("Ironman")) {
                        //Add ironman permission OR PERK BOOK!
                    }
                    if (itemString.equalsIgnoreCase("PVP CHEST")) {
                        player.getInventory().addItem(ChestManager.PVPChest);
                    }

                    if (itemString.equalsIgnoreCase("Money Token")){
                        player.getInventory().addItem(ItemManager.moneytoken);

                    }

                }
            }
        }
    }







