package com.rosed.minecraftguns.instance;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Pistol extends Gun {

    public Pistol(int magSize, int fireRate, AmmunitionType ammunitionType) {
        super(magSize, fireRate, ammunitionType);
    }

    @Override
    public void shoot(Player player, ItemStack item) {

    }

    @Override
    public void reload(int currentAmmoCount) {

    }

}