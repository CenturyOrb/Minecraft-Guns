package com.rosed.minecraftguns;

import com.rosed.minecraftguns.instance.*;
import com.rosed.minecraftguns.listener.ShootListener;
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

    }

    private void register()   {

        // register managers
        gunRegistry = new GunRegistry();
        new GunRecipe();

        // register commands
        Bukkit.getPluginManager().registerEvents(new ShootListener(), minecraftGuns);

        // register events

    }

}
