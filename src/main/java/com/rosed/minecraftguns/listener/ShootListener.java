package com.rosed.minecraftguns.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ShootListener implements Listener {

    @EventHandler
    public void onShoot(PlayerInteractEvent e)   {

        if (e.getAction().isRightClick())   return;
        if (e.getItem().getItemMeta().getDisplayName().contains("Colt"))
            Bukkit.broadcastMessage("shooted colt");

    }

}
