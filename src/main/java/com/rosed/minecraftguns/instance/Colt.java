package com.rosed.minecraftguns.instance;

import com.rosed.minecraftguns.InstanceManager;
import org.bukkit.*;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

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
        spawnParticleLine(player, Particle.FLAME, 100, 0.5);

    }

    public void spawnParticleLine(Player player, Particle particleType, int particleCount, double particleSpacing) {
        Vector direction = player.getEyeLocation().getDirection().normalize();
        Location particleLocation = player.getEyeLocation().clone();

        for (int i = 0; i < particleCount; i++) {
            particleLocation.add(direction.clone().multiply(particleSpacing));
            player.spawnParticle(particleType, particleLocation, 1);
        }
    }

}
