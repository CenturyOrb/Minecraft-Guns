package com.rosed.minecraftguns.instance;

import lombok.Getter;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Getter
public abstract class Gun {

    private final int magSize, fireRate;  // rate is in ticks
    private final AmmunitionType ammunitionType;

    public Gun(int magSize, int fireRate, AmmunitionType ammunitionType)   {

        this.magSize = magSize;
        this.fireRate = fireRate;
        this.ammunitionType = ammunitionType;

    }

    public abstract void shoot(Player player, ItemStack item);

    public static void emptyShot(Player player)   {

        player.playSound(player.getLocation(), Sound.BLOCK_DISPENSER_FAIL, 1f, 1f);

    }

    public abstract void reload(int currentAmmoCount);

}
