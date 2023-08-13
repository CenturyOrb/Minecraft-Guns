package com.rosed.minecraftguns.listener;

import com.rosed.minecraftguns.GunDataChecker;
import com.rosed.minecraftguns.instance.Gun;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ShootListener implements Listener {

    @EventHandler
    public void onShoot(PlayerInteractEvent e)   {

        if (e.getAction().isRightClick())   return;
        ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
        if (!GunDataChecker.isGun(item))  return;
        Gun gun = GunDataChecker.getGunInstance(item);
        gun.shoot(e.getPlayer());
        Bukkit.broadcastMessage(gun + " ");

    }

}
