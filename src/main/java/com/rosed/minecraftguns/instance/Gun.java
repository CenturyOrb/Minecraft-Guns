package com.rosed.minecraftguns.instance;

import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
public abstract class Gun {

    private final int magSize, fireRate;  // rate is in ticks
    private final AmmunitionType ammunitionType;

    public Gun(int magSize, int fireRate, AmmunitionType ammunitionType)   {

        this.magSize = magSize;
        this.fireRate = fireRate;
        this.ammunitionType = ammunitionType;

    }

    public abstract void shoot(Player player);

    public abstract void reload(int currentAmmoCount);

}
