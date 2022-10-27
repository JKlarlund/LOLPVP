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

    public static ItemStack excalibur;

    public static ItemStack sparringaxe;

    public static ItemStack morningwood;

    public static ItemStack morningbj;

    public static ItemStack prot5legs;

    public static ItemStack prot5chest;

    public static ItemStack prot5helm;

    public static ItemStack prot5boots;

    public static ItemStack prot4legs;

    public static ItemStack prot4chest;

    public static ItemStack prot4helm;

    public static ItemStack prot4boots;


    public static ItemStack prot4aelegs;

    public static ItemStack prot4aechest;

    public static ItemStack prot4aehelm;

    public static ItemStack prot4aeboots;

    public static ItemStack prot5aelegs;

    public static ItemStack prot5aechest;

    public static ItemStack prot5aehelm;

    public static ItemStack prot5aeboots;

    public static ItemStack prot6aelegs;

    public static ItemStack prot6aechest;

    public static ItemStack prot6aehelm;

    public static ItemStack prot6aeboots;

    public static ItemStack magicsperm;

    public static ItemStack snowboots;

    public static ItemStack snowlegs;

    public static ItemStack snowchest;

    public static ItemStack snowhelm;




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
        EXCALIBUR();
        SPARRINGAXE();
        MORNINGWOOD();
        MORNINGBJ();
        PROTVBOOTS();
        PROTVLEGS();
        PROTVCHEST();
        PROTVHELM();
        PROTIVBOOTS();
        PROTIVLEGS();
        PROTIVCHEST();
        PROTIVHELM();
        PROTIVAEBOOTS();
        PROTIVAELEGS();
        PROTIVAECHEST();
        PROTIVAEHELM();
        PROTVAEBOOTS();
        PROTVAELEGS();
        PROTVAECHEST();
        PROTVAEHELM();
        PROTVIAEBOOTS();
        PROTVIAELEGS();
        PROTVIAECHEST();
        PROTVIAEHELM();
        MAGICSPERM();
        SNOWBOOTS();
        SNOWLEGS();
        SNOWCHEST();
        SNOWHELM();

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
        meta.setDisplayName(ChatColor.AQUA + "Battle Axe");
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

    private static void EXCALIBUR(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bExcalibur");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);

        List<String> xcal = new ArrayList<String>();
        xcal.add(ChatColor.DARK_GRAY + "The essential PVP sword!");
        meta.setLore(xcal);

        item.setItemMeta(meta);
        excalibur = item;

    }

    private static void SPARRINGAXE(){
        ItemStack item = new ItemStack(Material.WOOD_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSparring Axe");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);

        List<String> saxe = new ArrayList<String>();
        saxe.add(ChatColor.DARK_GRAY + "The third wood tier weapon!");
        meta.setLore(saxe);

        item.setItemMeta(meta);
        sparringaxe = item;

    }

    private static void MORNINGWOOD(){
        ItemStack item = new ItemStack(Material.WOOD_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bMorning Wood");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);

        List<String> mw = new ArrayList<String>();
        mw.add(ChatColor.DARK_GRAY + "The first wood tier weapon!");
        meta.setLore(mw);

        item.setItemMeta(meta);
        morningwood = item;

    }

    private static void MORNINGBJ(){
        ItemStack item = new ItemStack(Material.WOOD_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bMorning BJ");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);

        List<String> mbj = new ArrayList<String>();
        mbj.add(ChatColor.DARK_GRAY + "The second wood tier weapon!");
        meta.setLore(mbj);

        item.setItemMeta(meta);
        morningbj = item;

    }

    private static void PROTVBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5boots = item;

    }

    private static void PROTVLEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5legs = item;

    }

    private static void PROTVCHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5chest = item;

    }

    private static void PROTVHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5helm = item;

    }

    private static void PROTIVBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4boots = item;

    }

    private static void PROTIVLEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4legs = item;

    }

    private static void PROTIVCHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4chest = item;

    }

    private static void PROTIVHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4helm = item;

    }

    private static void PROTIVAEBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);



        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4aeboots = item;

    }

    private static void PROTIVAELEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4aelegs = item;

    }

    private static void PROTIVAECHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4aechest = item;

    }

    private static void PROTIVAEHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt IV AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        meta.addEnchant(Enchantment.OXYGEN, 4, true);
        meta.addEnchant(Enchantment.WATER_WORKER, 4, true);



        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection IV AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot4aehelm = item;

    }

    private static void PROTVAEBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);



        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5aeboots = item;

    }

    private static void PROTVAELEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5aelegs = item;

    }

    private static void PROTVAECHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5aechest = item;

    }

    private static void PROTVAEHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt V AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
        meta.addEnchant(Enchantment.OXYGEN, 5, true);
        meta.addEnchant(Enchantment.WATER_WORKER, 5, true);



        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection V AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot5aehelm = item;

    }

    private static void PROTVIAEBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 6, true);



        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6aeboots = item;

    }

    private static void PROTVIAELEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 6, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6aelegs = item;

    }

    private static void PROTVIAECHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 6, true);

        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6aechest = item;

    }

    private static void PROTVIAEHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bProt VI AE");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 6, true);
        meta.addEnchant(Enchantment.OXYGEN, 6, true);
        meta.addEnchant(Enchantment.WATER_WORKER, 6, true);


        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.DARK_GRAY + "Authentic Protection VI AE Armor");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        prot6aehelm = item;
    }

    private static void MAGICSPERM() {

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bMagic Sperm");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);


        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.GRAY + "Invisibility I");
        vilore.add(ChatColor.DARK_GRAY + "Hit enemies to become invisible!");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        magicsperm = item;
    }

    private static void SNOWBOOTS() {

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSnow Armor");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.GRAY + "Snowstorm I");
        vilore.add(ChatColor.DARK_GRAY + "Wear a full set of Snow Armor for a special effect");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        snowboots = item;

    }

    private static void SNOWLEGS() {

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSnow Armor");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.GRAY + "Snowstorm I");
        vilore.add(ChatColor.DARK_GRAY + "Wear a full set of Snow Armor for a special effect");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        snowlegs = item;

    }

    private static void SNOWCHEST() {

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSnow Armor");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.GRAY + "Snowstorm I");
        vilore.add(ChatColor.DARK_GRAY + "Wear a full set of Snow Armor for a special effect");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        snowchest = item;

    }

    private static void SNOWHELM() {

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bSnow Armor");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        List<String> vilore = new ArrayList<String>();
        vilore.add(ChatColor.GRAY + "Snowstorm I");
        vilore.add(ChatColor.DARK_GRAY + "Wear a full set of Snow Armor for a special effect");
        meta.setLore(vilore);

        item.setItemMeta(meta);

        snowhelm = item;

    }


    }
