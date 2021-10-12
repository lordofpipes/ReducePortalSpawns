package lordpipe.reduceportalspawns;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class EventListener implements Listener {
    private ReducePortalSpawns plugin;

    private static Random rng = new Random();
    private double chance = 0.0;

    public EventListener(ReducePortalSpawns pl) {
        plugin = pl;
        chance = pl.getConfig().getDouble("chance");
    }

    @EventHandler(ignoreCancelled = true)
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == SpawnReason.NETHER_PORTAL) {
            if (rng.nextDouble() > chance) {
                event.setCancelled(true);
            }
        }
    }
}
