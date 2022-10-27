package klarlund.jonathan.testplugin.utilstest;

import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.Packet;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;
import java.util.ArrayList;
import java.util.List;

public class OwnParticles_Unused {

    //Particles which are spawned in a RANGE (And not @ Player):

    //Function for getting players in range:

    public static List<Player> getPlayersInRange(Location loc, double range)
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

    public void spawnParticleFIREWORKS(Location loc, List<Player> players){

        //Assuming v6 (which is power) is one for now. I have no idea... Have to find video of EMP being fired.
        //Though actually quite likely it is =1, in that assuming it tries to get the ParticleEffect function.

        //Creating Particle
        PacketPlayOutWorldParticles packetparticle = new PacketPlayOutWorldParticles(EnumParticle.FIREWORKS_SPARK, true,
                (float) loc.getX(), (float) loc.getY(), (float) loc.getZ(), 0, 0, 0, 0.25F, 30);

        //Sending to player.
        for (Player p: players){
            ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packetparticle);
        }

        //It will send this to a list of players.
        // When specifying second input, you do getPlayersInRange(Location player.getlocation, 20D)
        //Range cannot be >20!

    }

    public void spawnParticleSnow(Location loc, List<Player> players){
        PacketPlayOutWorldParticles packetparticle = new PacketPlayOutWorldParticles(EnumParticle.SNOW_SHOVEL, true, (float) loc.getX(), (float) loc.getY(), (float) loc.getZ(),
                0 ,0, 0, 1, 1);

        for (Player p: players){
            ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packetparticle);
        }
    }



}
