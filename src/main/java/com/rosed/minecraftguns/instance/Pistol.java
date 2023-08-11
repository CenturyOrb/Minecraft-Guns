package com.rosed.minecraftguns.instance;

import org.bukkit.entity.Player;

public class Pistol extends Gun {

    public Pistol(int magSize, int fireRate, AmmunitionType ammunitionType) {
        super(magSize, fireRate, ammunitionType);
    }

    @Override
    protected void shoot(Player player) {

    }

    @Override
    protected void reload(int currentAmmoCount) {

    }

}