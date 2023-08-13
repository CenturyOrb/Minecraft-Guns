package com.rosed.minecraftguns.instance;

import com.rosed.minecraftguns.InstanceManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Colt extends Pistol {

    private static final int magSize = 32;
    private static final int fireRate = 30;
    private static final AmmunitionType ammunitionType = AmmunitionType.TYPE_45ACP;

    public Colt() {
        super(magSize, fireRate, ammunitionType);

    }

    @Override
    public void shoot(Player player)   {

        player.sendMessage("You have shot your colt");

    }

}
