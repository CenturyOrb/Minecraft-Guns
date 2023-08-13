package com.rosed.minecraftguns;

import com.rosed.minecraftguns.instance.Gun;
import com.rosed.minecraftguns.instance.GunRegistry;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class GunDataChecker {

    private static NamespacedKey gunType = new NamespacedKey(InstanceManager.INSTANCE.getMinecraftGuns(), "gunType");
    private static NamespacedKey currentAmmo = new NamespacedKey(InstanceManager.INSTANCE.getMinecraftGuns(), "currentAmmo");

    public static boolean isGun(ItemStack item)   {
        return item.getItemMeta().getPersistentDataContainer().has(gunType, PersistentDataType.STRING);
    }

    public static Gun getGunInstance(ItemStack item)   {

        GunRegistry gunRegistry = InstanceManager.INSTANCE.getGunRegistry();
        return gunRegistry.getRegistry().get(getGunType(item));

    }

    public static String getGunType(ItemStack item)   {

        PersistentDataContainer pdc = item.getItemMeta().getPersistentDataContainer();
        return pdc.get(gunType, PersistentDataType.STRING);

    }

}
