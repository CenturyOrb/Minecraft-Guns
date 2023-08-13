package com.rosed.minecraftguns.instance;

import org.bukkit.entity.Player;

public class Pistol extends Gun {

    public Pistol(int magSize, int fireRate, AmmunitionType ammunitionType) {
        super(magSize, fireRate, ammunitionType);
    }

    @Override
    public void shoot(Player player) {

    }

    @Override
    public void reload(int currentAmmoCount) {

    }

}