package com.rosed.minecraftguns.listener;

import com.rosed.minecraftguns.GunData;
import com.rosed.minecraftguns.instance.Gun;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ShootListener implements Listener {

    @EventHandler
    public void onShoot(PlayerInteractEvent e)   {

        // checks if the player click was a right click
        if (e.getAction().isRightClick())   return;

        // checks if item is air
        if (e.getPlayer().getInventory().getItemInMainHand().getType() == Material.AIR)   return;

        // checks if the item in their right hand was a gun
        ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
        if (!GunData.isGun(item))  return;
        Gun gun = GunData.getGunInstance(item);
        gun.shoot(e.getPlayer(), item);
        Bukkit.broadcastMessage(GunData.getGunAmmo(item) + " " + GunData.getGunType(item));

    }

}
