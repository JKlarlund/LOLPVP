package klarlund.jonathan.testplugin;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.commands.EssentialsCommand;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.flags.DefaultFlag;
import com.sk89q.worldguard.protection.managers.RegionManager;
import klarlund.jonathan.testplugin.MysteryChest.*;
import klarlund.jonathan.testplugin.Signs.SignManager;
import klarlund.jonathan.testplugin.commands.Kits;
import klarlund.jonathan.testplugin.commands.Commands;
import klarlund.jonathan.testplugin.commands.LOLCommand;
import klarlund.jonathan.testplugin.weaponevents.*;
import klarlund.jonathan.testplugin.items.ItemManager;
import net.ess3.api.IUser;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;
import java.util.UUID;

public final class Main extends JavaPlugin {

    private static Economy econ = null;
    public static Permission permission = null;

    public static Chat chat = null;



    @Override
    public void onEnable() {
        // Plugin startup logic

        setupChat();
        setupPermissions();

        if (!setupEconomy()) {
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
        getServer().getPluginManager().registerEvents(new MagicSperm(this), this);
        getServer().getPluginManager().registerEvents(new SignManager(), this);
        getServer().getPluginManager().registerEvents(new SnowArmor(this), this);
        getServer().getPluginManager().registerEvents(new PVPEliteChest(), this);
        getServer().getPluginManager().registerEvents(new SnowEMP(), this);
        getServer().getPluginManager().registerEvents(new AbominableSnowman(this), this);
        getServer().getPluginManager().registerEvents(new XmasChest(), this);
        getServer().getPluginManager().registerEvents(new Moneytoken(), this);
        getServer().getPluginManager().registerEvents(new ThadChest(), this);
        getServer().getPluginManager().registerEvents(new DesignerChest(), this);

        getCommand("wifebeater").setExecutor(new Commands());
        getCommand("ejacul8").setExecutor(new Commands());
        getCommand("prot6boots").setExecutor(new Commands());
        getCommand("mjolnir").setExecutor(new Commands());
        getCommand("prot6legs").setExecutor(new Commands());
        getCommand("prot6chest").setExecutor(new Commands());
        getCommand("prot6helm").setExecutor(new Commands());
        getCommand("enderbow").setExecutor(new Commands());
        getCommand("ironman").setExecutor(new Kits());
        getCommand("regen").setExecutor(new Kits());
        getCommand("fireresistance").setExecutor(new Kits());
        getCommand("nightvision").setExecutor(new Kits());
        getCommand("ironman2").setExecutor(new Kits());
        getCommand("invisibility").setExecutor(new Kits());
        getCommand("babymaker").setExecutor(new Commands());
        getCommand("bunnybeater").setExecutor(new Commands());
        getCommand("battleaxe").setExecutor(new Commands());
        getCommand("daterapist").setExecutor(new Commands());
        getCommand("invisring").setExecutor(new Commands());
        getCommand("iceblade").setExecutor(new Commands());
        getCommand("rocketboots").setExecutor(new Commands());
        getCommand("angelwings").setExecutor(new Commands());
        getCommand("payday").setExecutor(new Commands());
        getCommand("emp").setExecutor(new Commands());
        getCommand("pvpchest").setExecutor(new Commands());
        getCommand("morningwood").setExecutor(new Commands());
        getCommand("morningbj").setExecutor(new Commands());
        getCommand("excalibur").setExecutor(new Commands());
        getCommand("sparringaxe").setExecutor(new Commands());
        getCommand("prot5").setExecutor(new Commands());
        getCommand("prot4").setExecutor(new Commands());
        getCommand("prot4ae").setExecutor(new Commands());
        getCommand("prot5ae").setExecutor(new Commands());
        getCommand("prot6ae").setExecutor(new Commands());
        getCommand("magicsperm").setExecutor(new Commands());
        getCommand("snowarmor").setExecutor(new Commands());
        getCommand("pvpelite").setExecutor(new Commands());
        getCommand("snowemp").setExecutor(new Commands());
        getCommand("abominablesnowman").setExecutor(new Commands());
        getCommand("xmaschest").setExecutor(new Commands());
        getCommand("lol").setExecutor(new LOLCommand());
        getCommand("lols").setExecutor(new LOLCommand());
        getCommand("moneytoken").setExecutor(new Commands());
        getCommand("thadchest").setExecutor((new Commands()));
        getCommand("designerchest").setExecutor((new Commands()));


    }

    private static Essentials getess(){
        final Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("Essentials");
        if (plugin==null){
            return null;
        }
        return (Essentials) plugin;
    }

    private static WorldGuardPlugin getWorldGuard() {
        final Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("WorldGuard");
        if (plugin == null || !(plugin instanceof WorldGuardPlugin)) {
            return null;
        }

        return (WorldGuardPlugin) plugin;
    }

    public static boolean isPlayerInPVP(Player player){
        final RegionManager regionManager = getWorldGuard().getRegionManager(player.getLocation().getWorld());
        final ApplicableRegionSet set = regionManager.getApplicableRegions(player.getLocation());
        final LocalPlayer localPlayer = getWorldGuard().wrapPlayer(player);
        if (!set.testState(localPlayer, DefaultFlag.PVP)){
            player.sendMessage(ChatColor.RED + "Sorry, you can't use that here!");
        }
        return set.testState(localPlayer, DefaultFlag.PVP);
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

    private boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
            permission = permissionProvider.getProvider();
        }
        return (permission != null);
    }

    public static Permission getPerm(){return permission;}

    private boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp = getServer().getServicesManager().getRegistration(Chat.class);
        chat = rsp.getProvider();
        return chat != null;
    }
    public static Chat getChat(){return chat;}


//Disable logic.
    @Override
    public void onDisable() {
            // Plugin shutdown logic
            Bukkit.getLogger().info("Shutting down");

        }
}




