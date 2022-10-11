package klarlund.jonathan.testplugin.MysteryChest;

import klarlund.jonathan.testplugin.MysteryChest.ChestData.PVPChestData;
import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PVPChest implements Listener {

   PVPChestData ChestData = new PVPChestData();





    @EventHandler
    public void onInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();

        //Something null here
        if(player.getItemInHand().getItemMeta().equals(ChestManager.PVPChest.getItemMeta())){
            if(event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR){
                event.setCancelled(true);

                Random NumberGenerator = new Random();
                int RandomBallerWeapon = NumberGenerator.nextInt(ChestData.BallerWeapon.size());
                int RandomGoodWeapon = NumberGenerator.nextInt(ChestData.GoodItems.size());
                int BallerChance = NumberGenerator.nextInt(99);

                //20% chance of getting a baller item. This is one item
                if(BallerChance<19){
                    player.getInventory().addItem(ChestData.BallerWeapon.get(RandomBallerWeapon));
                }
                else if(BallerChance<97 && BallerChance>19){

                    player.getInventory().addItem(ChestData.GoodItems.get(RandomGoodWeapon));

                }
                else if(BallerChance <=99 && BallerChance >= 97){
                    player.getInventory().addItem(ItemManager.rocketboots);
                }

                //Give three enchanted apples (1 item)
                player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 5, (short) 1));

                //Give three random potions (3 items)
                player.getInventory().addItem(ChestData.Consumables.get(NumberGenerator.nextInt(7)));
                player.getInventory().addItem(ChestData.Consumables.get(NumberGenerator.nextInt(7)));
                player.getInventory().addItem(ChestData.Consumables.get(NumberGenerator.nextInt(7)));







            }


        }



        //Something about null needs to be here
//        if(player.getItemInHand().getItemMeta().equals("Chest")){
//            if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
//
//                List<ItemStack> PVPChestData = new BallerItems();
//
//                DataLength = Data.length;
//
//                Random random = new Random();
//                int RandomNumber = random.nextInt(Data.length);
//
//                ItemStack RandomItem = Data[RandomNumber];
//
//                player.getInventory().addItem(RandomItem);

                //Keep on with this...






            //}




        //}


    }






}
