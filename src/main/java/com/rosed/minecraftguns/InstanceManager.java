package com.rosed.minecraftguns;

import com.rosed.minecraftguns.instance.AmmunitionType;
import com.rosed.minecraftguns.instance.Colt;
import com.rosed.minecraftguns.instance.Gun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public enum InstanceManager {

    INSTANCE;

    private MinecraftGuns minecraftGuns;

    /**
     *
     * @param minecraftGuns
     */
    public void start(final MinecraftGuns minecraftGuns)   {

        assert minecraftGuns != null : "Error while starting Survival-Showdown";
        this.minecraftGuns = minecraftGuns;

        register();
        Bukkit.broadcastMessage(ChatColor.GREEN + "MinecraftGuns Loaded");

    }

    private void register()   {

        // register managers

        // register commands

        // register events

    }

}
