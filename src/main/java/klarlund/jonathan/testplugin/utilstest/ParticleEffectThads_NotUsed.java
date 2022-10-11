package klarlund.jonathan.testplugin.utilstest;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import klarlund.jonathan.testplugin.MoreProjectiles.ReflectionUtil_Stirante;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;


public enum ParticleEffectThads_NotUsed
{
    HUGE_EXPLOSION("hugeexplosion", 0),  LARGE_EXPLODE("largeexplode", 1),  FIREWORKS_SPARK("fireworksSpark", 2),  BUBBLE("bubble", 3),  SUSPEND("suspend", 4),  DEPTH_SUSPEND("depthSuspend", 5),  TOWN_AURA("townaura", 6),  CRIT("crit", 7),  MAGIC_CRIT("magicCrit", 8),  MOB_SPELL("mobSpell", 9),  MOB_SPELL_AMBIENT("mobSpellAmbient", 10),  SPELL("spell", 11),  INSTANT_SPELL("instantSpell", 12),  WITCH_MAGIC("witchMagic", 13),  NOTE("note", 14),  PORTAL("portal", 15),  ENCHANTMENT_TABLE("enchantmenttable", 16),  EXPLODE("explode", 17),  FLAME("flame", 18),  LAVA("lava", 19),  FOOTSTEP("footstep", 20),  SPLASH("splash", 21),  LARGE_SMOKE("largesmoke", 22),  CLOUD("cloud", 23),  RED_DUST("reddust", 24),  SNOWBALL_POOF("snowballpoof", 25),  DRIP_WATER("dripWater", 26),  DRIP_LAVA("dripLava", 27),  SNOW_SHOVEL("snowshovel", 28),  SLIME("slime", 29),  HEART("heart", 30),  ANGRY_VILLAGER("angryVillager", 31),  HAPPY_VILLAGER("happyVillager", 32);

    private static final Map<String, ParticleEffectThads_NotUsed> NAME_MAP;
    private static final Map<Integer, ParticleEffectThads_NotUsed> ID_MAP;
    @SuppressWarnings("unused")
    private static final double MAX_RANGE = 20.0D;
    private static Constructor<?> PARTICLE_PACKET_CONSTRUCTOR;
    private String name;
    private int id;

    static
    {
        NAME_MAP = new HashMap<String, ParticleEffectThads_NotUsed>();
        ID_MAP = new HashMap<Integer, ParticleEffectThads_NotUsed>();
        for (ParticleEffectThads_NotUsed effect : values())
        {
            NAME_MAP.put(effect.name, effect);
            ID_MAP.put(Integer.valueOf(effect.id), effect);
        }
        try
        {
            PARTICLE_PACKET_CONSTRUCTOR = ReflectionUtil_Stirante.getConstructor(ReflectionUtil_Stirante.getClass("PacketPlayOutWorldParticles", ReflectionUtil_Stirante.DynamicPackage.MINECRAFT_SERVER), new Class[0]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private ParticleEffectThads_NotUsed(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }

    public static ParticleEffectThads_NotUsed fromName(String name)
    {
        if (name != null) {
            for (Map.Entry<String, ParticleEffectThads_NotUsed> e : NAME_MAP.entrySet()) {
                if (((String)e.getKey()).equalsIgnoreCase(name)) {
                    return (ParticleEffectThads_NotUsed)e.getValue();
                }
            }
        }
        return null;
    }

    public static ParticleEffectThads_NotUsed fromId(int id)
    {
        return (ParticleEffectThads_NotUsed)ID_MAP.get(Integer.valueOf(id));
    }

    private static List<Player> getPlayersInRange(Location loc, double range)
    {
        List<Player> players = new ArrayList<Player>();
        double sqr = range * range;
        for (Player p : loc.getWorld().getPlayers()) {
            if (p.getLocation().distanceSquared(loc) <= sqr) {
                players.add(p);
            }
        }
        return players;
    }

    private static Object createPacket(String name, Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount of particles has to be greater than 0");
        }
        try
        {
            Object p = PARTICLE_PACKET_CONSTRUCTOR.newInstance(new Object[0]);
            ReflectionUtil_Stirante.setValues(p, new ReflectionUtil_Stirante.FieldEntry[] { new ReflectionUtil_Stirante.FieldEntry("a", name), new ReflectionUtil_Stirante.FieldEntry("b", Float.valueOf((float)loc.getX())), new ReflectionUtil_Stirante.FieldEntry("c", Float.valueOf((float)loc.getY())), new ReflectionUtil_Stirante.FieldEntry("d", Float.valueOf((float)loc.getZ())), new ReflectionUtil_Stirante.FieldEntry("e", Float.valueOf(offsetX)), new ReflectionUtil_Stirante.FieldEntry("f", Float.valueOf(offsetY)), new ReflectionUtil_Stirante.FieldEntry("g", Float.valueOf(offsetZ)), new ReflectionUtil_Stirante.FieldEntry("h", Float.valueOf(speed)), new ReflectionUtil_Stirante.FieldEntry("i", Integer.valueOf(amount)) });

            return p;
        }
        catch (Exception e)
        {
            Bukkit.getLogger().warning("[ParticleEffect] Failed to create a particle packet!");
        }
        return null;
    }

    private Object createPacket(Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        return createPacket(getName(), loc, offsetX, offsetY, offsetZ, speed, amount);
    }

    private static Object createIconCrackPacket(int id, Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        return createPacket("iconcrack_" + id, loc, offsetX, offsetY, offsetZ, speed, amount);
    }

    private static Object createBlockCrackPacket(int id, byte data, Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        return createPacket("blockcrack_" + id + "_" + data, loc, offsetX, offsetY, offsetZ, speed, amount);
    }

    private static Object createBlockDustPacket(int id, byte data, Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        return createPacket("blockdust_" + id + "_" + data, loc, offsetX, offsetY, offsetZ, speed, amount);
    }

    private static void sendPacket(Player p, Object packet)
    {
        if (packet != null) {
            try
            {
                Object entityPlayer = ReflectionUtil_Stirante.invokeMethod("getHandle", p.getClass(), p, new Object[0]);
                Object playerConnection = ReflectionUtil_Stirante.getValue("playerConnection", entityPlayer);
                ReflectionUtil_Stirante.invokeMethod("sendPacket", playerConnection.getClass(), playerConnection, new Object[] { packet });
            }
            catch (Exception e)
            {
                Bukkit.getLogger().warning("[ParticleEffect] Failed to send a particle packet to " + p.getName() + "!");
            }
        }
    }

    private static void sendPacket(Collection<Player> players, Object packet)
    {
        for (Player p : players) {
            sendPacket(p, packet);
        }
    }

    public void display(Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount, Player... players)
    {
        sendPacket(Arrays.asList(players), createPacket(loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public void display(Location loc, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        display(loc, 20.0D, offsetX, offsetY, offsetZ, speed, amount);
    }

    public void display(Location loc, double range, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        if (range > 20.0D) {
            throw new IllegalArgumentException("Range has to be lower/equal the maximum of 20");
        }
        sendPacket(getPlayersInRange(loc, range), createPacket(loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayIconCrack(Location loc, int id, float offsetX, float offsetY, float offsetZ, float speed, int amount, Player... players)
    {
        sendPacket(Arrays.asList(players), createIconCrackPacket(id, loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayIconCrack(Location loc, int id, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        displayIconCrack(loc, 20.0D, id, offsetX, offsetY, offsetZ, speed, amount);
    }

    public static void displayIconCrack(Location loc, double range, int id, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        if (range > 20.0D) {
            throw new IllegalArgumentException("Range has to be lower/equal the maximum of 20");
        }
        sendPacket(getPlayersInRange(loc, range), createIconCrackPacket(id, loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayBlockCrack(Location loc, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount, Player... players)
    {
        sendPacket(Arrays.asList(players), createBlockCrackPacket(id, data, loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayBlockCrack(Location loc, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        displayBlockCrack(loc, 20.0D, id, data, offsetX, offsetY, offsetZ, speed, amount);
    }

    public static void displayBlockCrack(Location loc, double range, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        if (range > 20.0D) {
            throw new IllegalArgumentException("Range has to be lower/equal the maximum of 20");
        }
        sendPacket(getPlayersInRange(loc, range), createBlockCrackPacket(id, data, loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayBlockDust(Location loc, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount, Player... players)
    {
        sendPacket(Arrays.asList(players), createBlockDustPacket(id, data, loc, offsetX, offsetY, offsetZ, speed, amount));
    }

    public static void displayBlockDust(Location loc, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        displayBlockDust(loc, 20.0D, id, data, offsetX, offsetY, offsetZ, speed, amount);
    }

    public static void displayBlockDust(Location loc, double range, int id, byte data, float offsetX, float offsetY, float offsetZ, float speed, int amount)
    {
        if (range > 20.0D) {
            throw new IllegalArgumentException("Range has to be lower/equal the maximum of 20");
        }
        sendPacket(getPlayersInRange(loc, range), createBlockDustPacket(id, data, loc, offsetX, offsetY, offsetZ, speed, amount));
    }
}