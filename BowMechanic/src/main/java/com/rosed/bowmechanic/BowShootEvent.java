package com.rosed.bowmechanic;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class BowShootEvent implements Listener {

    // hashmap to log arrows and location from where it was shot
    private ArrayList<Arrow> arrowList;

    public BowShootEvent(BowMechanic bowMechanic)   {

        arrowList = new ArrayList<>();

        // runnable that compares location of arrow and origin location
        // every 5 ticks. Displays in chat distance
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(bowMechanic, () -> {

            Iterator<Arrow> itr = arrowList.iterator();
            while(itr.hasNext()){
                Arrow arrow = itr.next();
                double distance = arrow.getLocation().distance(Objects.requireNonNull(arrow.getOrigin()));
                if (distance >= 20)   { // deletes live arrow and spawn in a dropped arrow
                    Bukkit.getWorld(arrow.getWorld().getName()).dropItem(arrow.getLocation(), new ItemStack(Material.ARROW));
                    arrow.remove();
                    itr.remove();
                }
            }

        }, 0, 5); // every 5 ticks or 0.25 seconds

    }

    /**
     * logs arrows and player that shoot the arrow
     * @param e ProjectileLaunchEvent
     */
    @EventHandler
    public void onBowShoot(ProjectileLaunchEvent e)   {

        if (!(e.getEntity() instanceof Arrow))   return;
        Arrow arrow = (Arrow) e.getEntity();
        arrowList.add(arrow);

    }

    /**
     * this removes arrows that hit either a block or entities
     * @param e ProjectileHitEvent
     */
    @EventHandler
    public void onArrowHit(ProjectileHitEvent e)   {

        if (!(e.getEntity() instanceof Arrow)) return;
        arrowList.remove(e.getEntity());

    }

}
