package com.rosed.bowmechanic;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BowMechanic extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new BowShootEvent(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
