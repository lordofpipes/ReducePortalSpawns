package lordpipe.reduceportalspawns;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin to reduce pigmen spawns coming from portals
 *
 * @author Copyright (c) lordpipe. Licensed GPLv3
 */
public class ReducePortalSpawns extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
        saveDefaultConfig();
    }
}
