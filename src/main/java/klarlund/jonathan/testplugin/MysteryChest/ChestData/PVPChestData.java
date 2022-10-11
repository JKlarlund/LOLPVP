package klarlund.jonathan.testplugin.MysteryChest.ChestData;

import klarlund.jonathan.testplugin.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;

import java.util.ArrayList;
import java.util.List;

public class PVPChestData {

    public List<ItemStack> BallerWeapon;

    public List<ItemStack> GoodItems;

    public List<ItemStack> Consumables;

    public List<ItemStack> Armor;


    int index;

    public PVPChestData(){

        this.BallerWeapon = new ArrayList<>();
        this.BallerWeapon.add(ItemManager.wifebeater);
        this.BallerWeapon.add(ItemManager.ejacul8);
        this.BallerWeapon.add(ItemManager.battleaxe);
        this.BallerWeapon.add(ItemManager.daterapist);

        this.GoodItems = new ArrayList<>();
        this.GoodItems.add(ItemManager.excalibur);
        this.GoodItems.add(ItemManager.morningbj);
        this.GoodItems.add(ItemManager.morningwood);
        this.GoodItems.add(ItemManager.sparringaxe);

        this.Consumables = new ArrayList<>();
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 8226));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 16418));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 16421));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 8229));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 8270));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 16452));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 8289));
        this.Consumables.add(new ItemStack(Material.POTION, 1, (short) 8257));

        //0-3
        this.Armor = new ArrayList<>();
        this.Armor.add(ItemManager.prot6chest);
        this.Armor.add(ItemManager.prot6helm);
        this.Armor.add(ItemManager.prot6legs);
        this.Armor.add(ItemManager.prot6boots);
        //4-8





        //...


    }

    public List<ItemStack> getBallerWeaponData(){

        return BallerWeapon;
    }

    public List<ItemStack> getConsumableData(){

        return Consumables;
    }

    public List<ItemStack> getGoodItems(){

        return GoodItems;
    }

    public List<ItemStack> getArmorData(){

        return Armor;
    }

}




