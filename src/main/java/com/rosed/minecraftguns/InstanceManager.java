package com.rosed.minecraftguns;

import com.rosed.minecraftguns.instance.*;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

@Getter
public enum InstanceManager {

    INSTANCE;

    private MinecraftGuns minecraftGuns;
    private GunRegistry gunRegistry;

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
        gunRegistry = new GunRegistry();
        new GunRecipe();

        // register commands

        // register events

    }

}
