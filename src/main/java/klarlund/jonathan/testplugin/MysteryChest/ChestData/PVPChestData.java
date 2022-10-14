package klarlund.jonathan.testplugin.MysteryChest.ChestData;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;

import java.util.ArrayList;
import java.util.List;

public class PVPChestData {

    public List<ItemStack> BallerWeapon;

    public List<ItemStack> GoodItems;

    public List<ItemStack> Potions;

    public List<ItemStack> VIArmor;

    public List<ItemStack> VArmor;

    public List<ItemStack> IVArmor;

    public List<ItemStack> Projectiles;


    int index;

    public PVPChestData(){

        this.BallerWeapon = new ArrayList<>();
        this.BallerWeapon.add(ItemManager.wifebeater);
        //this.BallerWeapon.add(ItemManager.ejacul8);
        this.BallerWeapon.add(ItemManager.battleaxe);
        this.BallerWeapon.add(ItemManager.daterapist);

        this.GoodItems = new ArrayList<>();
        this.GoodItems.add(ItemManager.excalibur);
        this.GoodItems.add(ItemManager.morningbj);
        this.GoodItems.add(ItemManager.morningwood);
        this.GoodItems.add(ItemManager.sparringaxe);

        this.Potions = new ArrayList<>();
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 8226));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 16418));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 16421));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 8229));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 8270));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 16452));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 8289));
        this.Potions.add(new ItemStack(Material.POTION, 1, (short) 8257));
        //0-3
        this.VIArmor = new ArrayList<>();
        this.VIArmor.add(ItemManager.prot6aechest);
        this.VIArmor.add(ItemManager.prot6aehelm);
        this.VIArmor.add(ItemManager.prot6aelegs);
        this.VIArmor.add(ItemManager.prot6aeboots);
        //4-7
        this.VIArmor.add(ItemManager.prot6chest);
        this.VIArmor.add(ItemManager.prot6helm);
        this.VIArmor.add(ItemManager.prot6legs);
        this.VIArmor.add(ItemManager.prot6boots);

        this.VArmor = new ArrayList<>();

        this.VArmor.add(ItemManager.prot5aeboots);
        this.VArmor.add(ItemManager.prot5aehelm);
        this.VArmor.add(ItemManager.prot5aelegs);
        this.VArmor.add(ItemManager.prot5aechest);
        this.VArmor.add(ItemManager.prot5boots);
        this.VArmor.add(ItemManager.prot5helm);
        this.VArmor.add(ItemManager.prot5legs);
        this.VArmor.add(ItemManager.prot5chest);

        this.IVArmor = new ArrayList<>();

        this.IVArmor.add(ItemManager.prot4aeboots);
        this.IVArmor.add(ItemManager.prot4aehelm);
        this.IVArmor.add(ItemManager.prot4aelegs);
        this.IVArmor.add(ItemManager.prot4aechest);

        this.IVArmor.add(ItemManager.prot4boots);
        this.IVArmor.add(ItemManager.prot4helm);
        this.IVArmor.add(ItemManager.prot4legs);
        this.IVArmor.add(ItemManager.prot4chest);

        //24-27
//        ItemStack LeatherBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
//        LeatherBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
//        this.Armor.add(LeatherBoots);
//
//        ItemStack LeatherLegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
//        LeatherLegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
//        this.Armor.add(LeatherLegs);
//
//        ItemStack LeatherChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
//        LeatherChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
//        this.Armor.add(LeatherChest);
//
//        ItemStack LeatherHelm = new ItemStack(Material.LEATHER_HELMET, 1);
//        LeatherHelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
//        this.Armor.add(LeatherHelm);




        //Projectiles
        this.Projectiles = new ArrayList<>();
        this.Projectiles.add(ItemManager.enderbow);
        this.Projectiles.add(ItemManager.emp);
        //...


        //...

    }

    public List<ItemStack> getBallerWeaponData(){

        return BallerWeapon;
    }

    public List<ItemStack> getConsumableData(){

        return Potions;
    }

    public List<ItemStack> getGoodItems(){

        return GoodItems;
    }

    public List<ItemStack> getVIArmorData(){

        return VIArmor;
    }

    public List<ItemStack> getVArmorData(){
        return VArmor;
    }

    public List<ItemStack> getIVArmorData(){
        return IVArmor;
    }

    public List<ItemStack> getProjectileData(){
        return Projectiles;
    }

}




