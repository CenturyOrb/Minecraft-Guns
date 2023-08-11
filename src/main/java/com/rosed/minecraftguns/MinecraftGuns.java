package com.rosed.minecraftguns;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftGuns extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        InstanceManager.INSTANCE.start(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
