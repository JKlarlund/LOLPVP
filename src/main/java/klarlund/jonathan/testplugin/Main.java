package klarlund.jonathan.testplugin;

import klarlund.jonathan.testplugin.MysteryChest.ChestManager;
import klarlund.jonathan.testplugin.MysteryChest.PVPChest;
import klarlund.jonathan.testplugin.commands.Kits;
import klarlund.jonathan.testplugin.commands.WeaponCommands;
import klarlund.jonathan.testplugin.signs.SignManager;
import klarlund.jonathan.testplugin.weaponevents.*;
import klarlund.jonathan.testplugin.items.ItemManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Economy econ = null;
    
    @Override
    public void onEnable() {
        // Plugin startup logic

        if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        Bukkit.getLogger().info("Working.");
        ItemManager.init();
        ChestManager.init();

        getServer().getPluginManager().registerEvents(new InvisRing(this), this);
        getServer().getPluginManager().registerEvents(new Wifebeater(), this);
        getServer().getPluginManager().registerEvents(new Ejacul8(), this);
        getServer().getPluginManager().registerEvents(new Mjolnir(), this);
        getServer().getPluginManager().registerEvents(new Enderbow(), this);
        getServer().getPluginManager().registerEvents(new Prot6(), this);
        getServer().getPluginManager().registerEvents(new Babymaker(), this);
        getServer().getPluginManager().registerEvents(new BunnyBeater(), this);
        getServer().getPluginManager().registerEvents(new Iceblade(this), this);
        getServer().getPluginManager().registerEvents(new Rocketboots(this), this);
        getServer().getPluginManager().registerEvents(new Angelwings(this), this);
        getServer().getPluginManager().registerEvents(new Payday(this), this);
        getServer().getPluginManager().registerEvents(new EMP(), this);
        getServer().getPluginManager().registerEvents(new PVPChest(), this);
        getServer().getPluginManager().registerEvents(new SignManager(), this);
        getCommand("wifebeater").setExecutor(new WeaponCommands());
        getCommand("ejacul8").setExecutor(new WeaponCommands());
        getCommand("prot6boots").setExecutor(new WeaponCommands());
        getCommand("mjolnir").setExecutor(new WeaponCommands());
        getCommand("prot6legs").setExecutor(new WeaponCommands());
        getCommand("prot6chest").setExecutor(new WeaponCommands());
        getCommand("prot6helm").setExecutor(new WeaponCommands());
        getCommand("enderbow").setExecutor(new WeaponCommands());
        getCommand("ironman").setExecutor(new Kits());
        getCommand("regen").setExecutor(new Kits());
        getCommand("fireresistance").setExecutor(new Kits());
        getCommand("nightvision").setExecutor(new Kits());
        getCommand("ironman2").setExecutor(new Kits());
        getCommand("invisibility").setExecutor(new Kits());
        getCommand("babymaker").setExecutor(new WeaponCommands());
        getCommand("bunnybeater").setExecutor(new WeaponCommands());
        getCommand("battleaxe").setExecutor(new WeaponCommands());
        getCommand("daterapist").setExecutor(new WeaponCommands());
        getCommand("invisring").setExecutor(new WeaponCommands());
        getCommand("iceblade").setExecutor(new WeaponCommands());
        getCommand("rocketboots").setExecutor(new WeaponCommands());
        getCommand("angelwings").setExecutor(new WeaponCommands());
        getCommand("payday").setExecutor(new WeaponCommands());
        getCommand("emp").setExecutor(new WeaponCommands());
        getCommand("pvpchest").setExecutor(new WeaponCommands());
        getCommand("morningwood").setExecutor(new WeaponCommands());
        getCommand("morningbj").setExecutor(new WeaponCommands());
        getCommand("excalibur").setExecutor(new WeaponCommands());
        getCommand("sparringaxe").setExecutor(new WeaponCommands());
        getCommand("prot5").setExecutor(new WeaponCommands());
        getCommand("prot4").setExecutor(new WeaponCommands());
        getCommand("prot4ae").setExecutor(new WeaponCommands());
        getCommand("prot5ae").setExecutor(new WeaponCommands());
        getCommand("prot6ae").setExecutor(new WeaponCommands());



    }

    //This is vault.
        private boolean setupEconomy() {
            if (getServer().getPluginManager().getPlugin("Vault") == null) {
                return false;
            }
            RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
            if (rsp == null) {
                return false;
            }
            econ = rsp.getProvider();
            return econ != null;
        }

    public static Economy getEconomy() {
        return econ;
    }



//Disable logic.
    @Override
    public void onDisable() {
            // Plugin shutdown logic
            Bukkit.getLogger().info("Shutting down");

        }
}


