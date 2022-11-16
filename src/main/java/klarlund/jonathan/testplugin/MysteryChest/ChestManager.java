package klarlund.jonathan.testplugin.MysteryChest;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ChestManager {

    public static ItemStack PVPChest;

    public static ItemStack PVPEliteChest;

    public static ItemStack XmasChest;

    public static ItemStack ThadChest;

    public static ItemStack DesignerChest;

    public static void init(){
        CreatePVPChest(); CreatePVPELITEChest(); CreateXMASChest(); CreateTHADChest(); CreateDESIGNERChest();
    }

    private static void CreatePVPChest(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "PVP Chest");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Right click to unwrap!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        PVPChest = item;


    }

    private static void CreatePVPELITEChest(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "PVP Elite Chest");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Right click to unwrap!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        PVPEliteChest = item;


    }

    private static void CreateXMASChest(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "Christmas Chest");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Right click to unwrap!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        XmasChest = item;


    }

    private static void CreateTHADChest(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "THAD Chest");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Right click to unwrap!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        ThadChest = item;


    }

    private static void CreateDESIGNERChest(){
        ItemStack item = new ItemStack(Material.CHEST, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.RED + "Designer Chest");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "Right click to unwrap!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        DesignerChest = item;


    }

}










