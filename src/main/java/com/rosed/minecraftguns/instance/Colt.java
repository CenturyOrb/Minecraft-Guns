package com.rosed.minecraftguns.instance;

import com.rosed.minecraftguns.InstanceManager;
import org.bukkit.*;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
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
        spawnMovingParticleLine(player, Particle.FLAME, 10, 1, 3);

    }

    public void spawnMovingParticleLine(Player player, Particle particleType, int particleCount, double particleSpacing, int updateInterval) {
        Vector direction = player.getEyeLocation().getDirection().normalize();
        Location particleLocation = player.getEyeLocation().clone();

        for (int i = 0; i < particleCount; i++) {
            final int iteration = i;
            new BukkitRunnable() {
                @Override
                public void run() {
                    particleLocation.add(direction.clone().multiply(particleSpacing));
                    player.spawnParticle(particleType, particleLocation, 0, 0d, 0d, 0d);

                    if (iteration >= particleCount - 1) {
                        this.cancel();
                    }
                }
            }.runTaskTimer(InstanceManager.INSTANCE.getMinecraftGuns(), updateInterval * i, updateInterval);
        }
    }

}
