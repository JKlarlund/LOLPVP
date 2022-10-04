package klarlund.jonathan.testplugin.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack wifebeater;
    public static ItemStack ejacul8;
    public static ItemStack mjolnir;

    public static ItemStack prot6boots;

    public static ItemStack iceblade;

    public static ItemStack prot6legs;

    public static ItemStack prot6chest;

    public static ItemStack prot6helm;

    public static ItemStack enderbow;

    public static ItemStack babymaker;

    public static ItemStack bunnybeater;

    public static ItemStack battleaxe;

    public static ItemStack daterapist;

    public static ItemStack invisring;

    public static ItemStack rocketboots;

    public static ItemStack angelwings;

    public static ItemStack payday;

    public static ItemStack emp;

    public static void init() {
        CreateWifeBeater();
        CreateEjacul8();
        CreateMJ();
        PROTVIBOOTS();
        PROTVILEGS();
        PROTVICHEST();
        PROTVIHELM();
        ENDERBOW();
        BABYMAKER();
        CreateBunnyBeater();
        CreateBAXE();
        DATERAPIST();
        INVISRING();
        ICEBLADE();
        ROCKETBOOTS();
        ANGELWINGS();
        PAYDAY();
        EMP();

    }

    private static void CreateWifeBeater() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bWifebeater");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        List<String> wifebeaterlore = new ArrayList<String>();
        wifebeaterlore.add(ChatColor.GRAY + "Launcher I");
        wifebeaterlore.add(ChatColor.DARK_GRAY + "The launcher sword!");
        meta.setLore(wifebeaterlore);

        item.setItemMeta(meta);
        wifebeater = item;
    }

    private static void CreateEjacul8() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bEjacul8");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 8, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 8, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 8, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 8, true);
        meta.addEnchant(Enchantment.DURABILITY, 8, true);
        List<String> ejaclore = new ArrayList<String>();
        ejaclore.add(ChatColor.GRAY + "Poison VIII");
        ejaclore.add(ChatColor.DARK_GRAY + "The poison sword!");
        meta.setLore(ejaclore);


        item.setItemMeta(meta);
        ejacul8 = item;
    }

    private static void CreateMJ() {
        ItemStack item = new ItemStack(Material.STONE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bMjolnir");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        List<String> mjlore = new ArrayList<String>();
        mjlore.add(ChatColor.GRAY + "Lightning I");
        mjlore.add(ChatColor.DARK_GRAY + "Thor's Hammer: Right click to strike!");
        mjlore.add(ChatColor.DARK_GRAY + "Avengers: Age of Ultron Collectible Item");
        meta.setLore(mjlore);

        item.setItemMeta(meta);
        mjolnir = item;
    }

    /**private static void PROTVISET(){
        Material[] set = new Material[]{
          Material.DIAMOND_BOOTS,
          Material.DIAMOND_LEGGINGS,
          Material.DIAMOND_CHESTPLATE,
          Material.DIAMOND_HELMET
        };

        for (int i=0; i<4; i++){

            ItemStack item = new ItemStack(set[i], 1);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName("$bProt VI");
            meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
            List<String> vilore = new ArrayList<String>();
            vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI Armor");
            meta.setLore(vilore);

            item.setItemMeta(meta);

        }

    }**/

    private static void PROTVIBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6boots = item;

    }

    private static void PROTVILEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6legs = item;

    }

    private static void PROTVICHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6chest = item;

    }

    private static void PROTVIHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6helm = item;

    }

    private static void ENDERBOW(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bEnder Bow");
        List<String> ebowlore = new ArrayList<String>();
        ebowlore.add(ChatColor.GRAY + "Teleport I");
        ebowlore.add(ChatColor.DARK_GRAY + "Shoot to teleport!");
        meta.setLore(ebowlore);

        item.setItemMeta(meta);

        enderbow = item;
    }

    private static void BABYMAKER(){
        ItemStack item = new ItemStack(Material.GOLD_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bBaby Maker");
        List<String> bmlore = new ArrayList<String>();
        bmlore.add(ChatColor.GRAY + "Resistance I");
        bmlore.add(ChatColor.DARK_GRAY + "Hit to take less damage from enemies!");
        meta.setLore(bmlore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);

        item.setItemMeta(meta);

        babymaker = item;

    }
    private static void CreateBunnyBeater() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bBunny Beater");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        List<String> wifebeaterlore = new ArrayList<String>();
        wifebeaterlore.add(ChatColor.GRAY + "Launcher 0.5");
        wifebeaterlore.add(ChatColor.DARK_GRAY + "The Easter Bunny's sword! A special Easter item.");
        meta.setLore(wifebeaterlore);

        item.setItemMeta(meta);
        bunnybeater = item;
    }

    private static void CreateBAXE(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("$bBattle Axe");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
        List<String> baxe = new ArrayList<String>();
        baxe.add(ChatColor.DARK_GRAY + "Shreds your enemy's armor faster than a sword!");
        meta.setLore(baxe);

        item.setItemMeta(meta);
        battleaxe = item;



    }

    private static void DATERAPIST(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bDate Rapist");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 7, true);
        List<String> dr = new ArrayList<String>();
        dr.add(ChatColor.DARK_GRAY + "The original top tier sword!");
        meta.setLore(dr);

        item.setItemMeta(meta);
        daterapist = item;
    }

    private static void INVISRING(){

        ItemStack item = new ItemStack(Material.getMaterial(175), 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bInvisibility Ring");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        List<String> invis = new ArrayList<String>();
        invis.add(ChatColor.GRAY + "Invisibility I");
        invis.add(ChatColor.DARK_GRAY + "Right click to activate");
        meta.setLore(invis);

        item.setItemMeta(meta);
        invisring = item;
    }

    private static void ICEBLADE(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bIceblade");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        List<String> ib = new ArrayList<String>();
        ib.add(ChatColor.GRAY + "Freeze I");
        ib.add(ChatColor.DARK_GRAY + "Hold shift to freeze enemies!");
        meta.setLore(ib);

        item.setItemMeta(meta);
        iceblade = item;

    }

    private static void ROCKETBOOTS(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bRocket Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
        List<String> rb = new ArrayList<String>();
        rb.add(ChatColor.GRAY + "Hover Jump I");
        rb.add(ChatColor.DARK_GRAY + "Double tap shift to hover jump!");
        meta.setLore(rb);

        item.setItemMeta(meta);
        rocketboots = item;
    }

    private static void ANGELWINGS() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bAngel Wings");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> aw = new ArrayList<String>();
        aw.add(ChatColor.GRAY + "Flight I");
        aw.add(ChatColor.DARK_GRAY + "Shift to fly!");
        meta.setLore(aw);

        item.setItemMeta(meta);
        angelwings = item;
    }

    private static void PAYDAY(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPay Day");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        List<String> dr = new ArrayList<String>();
        dr.add(ChatColor.GRAY + "Pay Day I");
        dr.add(ChatColor.DARK_GRAY + "It's pay day! Steal up to 10% of your enemy's money when you kill them!");
        meta.setLore(dr);

        item.setItemMeta(meta);
        payday = item;


    }

    private static void EMP() {
        ItemStack item = new ItemStack(Material.MILK_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("EMP");
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 1, true);
        //meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<String> empmeta = new ArrayList<String>();
        empmeta.add(ChatColor.ITALIC + "" + ChatColor.DARK_PURPLE + "A throwable bomb that disables your enemies' potion effects!");
        empmeta.add(ChatColor.DARK_GRAY + "Right click to launch.");
        meta.setLore(empmeta);

        item.setItemMeta(meta);
        emp = item;
    }
}
