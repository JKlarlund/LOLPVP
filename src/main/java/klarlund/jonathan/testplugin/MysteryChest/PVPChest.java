package klarlund.jonathan.testplugin.MysteryChest;

import klarlund.jonathan.testplugin.MysteryChest.ChestData.PVPChestData;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class PVPChest implements Listener {

   PVPChestData ChestData = new PVPChestData();

    @EventHandler
    public void onInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();

        //Something null here
        if (player.getItemInHand().getType() != Material.AIR) {

            if (player.getItemInHand().getItemMeta().equals(ChestManager.PVPChest.getItemMeta())) {
                if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
                    event.setCancelled(true);

                    int ChestAmount = player.getInventory().getItemInHand().getAmount();

                    Random NumberGenerator = new Random();
                    //Determines what item(s) player will be given, selected randomly from a list of weapons:
                    int RandomBallerWeapon = NumberGenerator.nextInt(ChestData.BallerWeapon.size());
                    int RandomGoodWeapon = NumberGenerator.nextInt(ChestData.GoodItems.size());

                    //Gives a number from 0 to 99 to use to figure out what type/quality of item player is given
                    int BallerChance = NumberGenerator.nextInt(100);
                    int ArmorChance = NumberGenerator.nextInt(100);
                    int BowChance = NumberGenerator.nextInt(100);

                    //20% chance of getting a baller item. This is one item
                    if (BallerChance < 13) {
                        player.getInventory().addItem(ChestData.BallerWeapon.get(RandomBallerWeapon));
                    } else if (BallerChance > 13) {

                        player.getInventory().addItem(ChestData.GoodItems.get(RandomGoodWeapon));

                    }

                    //Chance of getting armor.
                    //Sol: Split up variations of additem to concrete pieces between probability
//                    if (ArmorChance <= 5) {
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)));
//                    }
//                    if (ArmorChance <= 10 && ArmorChance >5){
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+4));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+4));
//                    }
//                    if (ArmorChance <= 15 && ArmorChance > 10){
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+8));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+8));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+8));
//                    }
//                    if (ArmorChance <= 20 && ArmorChance > 15){
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+12));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+12));
//                        player.getInventory().addItem(ChestData.Armor.get(NumberGenerator.nextInt(3)+12));
//                    }
//                    if (ArmorChance <= 50 && ArmorChance >)

                    //Give three enchanted apples (1 item)

                    player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 3, (short) 1));


                    //Armor

                    if (ArmorChance <= 10){
                        int FirstNumber = NumberGenerator.nextInt(ChestData.VIArmor.size());
                        int SecondNumber = NumberGenerator.nextInt(ChestData.VIArmor.size());
                        int Thirdnumber = NumberGenerator.nextInt(ChestData.VIArmor.size());

                        while (ChestData.VIArmor.get(FirstNumber).getType() == ChestData.VIArmor.get(SecondNumber).getType()
                                || ChestData.VIArmor.get(FirstNumber).getType() == ChestData.VIArmor.get(Thirdnumber).getType()
                                || ChestData.VIArmor.get(SecondNumber).getType() == ChestData.VIArmor.get(Thirdnumber).getType()){
                            SecondNumber = NumberGenerator.nextInt(ChestData.VIArmor.size());
                            Thirdnumber = NumberGenerator.nextInt(ChestData.VIArmor.size());
                        }
                        player.getInventory().addItem(ChestData.VIArmor.get(FirstNumber));
                        player.getInventory().addItem(ChestData.VIArmor.get(SecondNumber));




                    }

                    if (ArmorChance < 25 && ArmorChance >= 10) {
                        int FirstNumber = NumberGenerator.nextInt(ChestData.VArmor.size());
                        int SecondNumber = NumberGenerator.nextInt(ChestData.VArmor.size());
                        int Thirdnumber = NumberGenerator.nextInt(ChestData.VArmor.size());

                        while (ChestData.VArmor.get(FirstNumber).getType() == ChestData.VArmor.get(SecondNumber).getType()
                                || ChestData.VArmor.get(FirstNumber).getType() == ChestData.VArmor.get(Thirdnumber).getType()
                                || ChestData.VArmor.get(SecondNumber).getType() == ChestData.VArmor.get(Thirdnumber).getType()) {
                            SecondNumber = NumberGenerator.nextInt(ChestData.VArmor.size());
                            Thirdnumber = NumberGenerator.nextInt(ChestData.VArmor.size());
                        }

                        player.getInventory().addItem(ChestData.VArmor.get(FirstNumber));
                        player.getInventory().addItem(ChestData.VArmor.get(SecondNumber));
                        player.getInventory().addItem(ChestData.VArmor.get(Thirdnumber));

                    }


                      if (ArmorChance >= 25){
                        int FirstNumber = NumberGenerator.nextInt(ChestData.IVArmor.size());
                        int SecondNumber = NumberGenerator.nextInt(ChestData.IVArmor.size());
                        int Thirdnumber = NumberGenerator.nextInt(ChestData.IVArmor.size());

                        while (ChestData.IVArmor.get(FirstNumber).getType() == ChestData.IVArmor.get(SecondNumber).getType()
                                || ChestData.IVArmor.get(FirstNumber).getType() == ChestData.IVArmor.get(Thirdnumber).getType()
                                || ChestData.IVArmor.get(SecondNumber).getType() == ChestData.IVArmor.get(Thirdnumber).getType()){
                            SecondNumber = NumberGenerator.nextInt(ChestData.IVArmor.size());
                            Thirdnumber = NumberGenerator.nextInt(ChestData.IVArmor.size());
                        }

                        player.getInventory().addItem(ChestData.IVArmor.get(FirstNumber));
                        player.getInventory().addItem(ChestData.IVArmor.get(SecondNumber));
                        player.getInventory().addItem(ChestData.IVArmor.get(Thirdnumber));


                    }

                    //Projectiles
                    if(BowChance<=25){
                        player.getInventory().addItem(ChestData.Projectiles.get(NumberGenerator.nextInt(ChestData.Projectiles.size())));
                    } else {}




                    //Consumables

                    player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 5, (short) 1));

                    //Give three random potions (3 items)
                    player.getInventory().addItem(ChestData.Potions.get(NumberGenerator.nextInt(7)));
                    player.getInventory().addItem(ChestData.Potions.get(NumberGenerator.nextInt(7)));
                    player.getInventory().addItem(ChestData.Potions.get(NumberGenerator.nextInt(7)));

                    List<Player> onlinePlayers = (List<Player>) Bukkit.getOnlinePlayers();
                    for (Player recipient: onlinePlayers){
                        recipient.sendMessage(ChatColor.AQUA + player.getName() + " " + ChatColor.RED + "just opened a PVP Chest!");
                        recipient.sendMessage(ChatColor.YELLOW + "Get YOURS now at " + ChatColor.AQUA + "SHOP.LOLPVP.ORG!");
                    }

                    if(ChestAmount>1){
                        player.getInventory().getItemInHand().setAmount(ChestAmount - 1);
                    } else {
                        player.setItemInHand(new ItemStack(Material.AIR));
                    }



                }
            }
        }
    }
}
