package com.rosed.minecraftguns;

import com.rosed.minecraftguns.instance.Gun;
import com.rosed.minecraftguns.instance.GunRegistry;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class GunData {

    private static NamespacedKey gunType = new NamespacedKey(InstanceManager.INSTANCE.getMinecraftGuns(), "gunType");
    private static NamespacedKey currentAmmo = new NamespacedKey(InstanceManager.INSTANCE.getMinecraftGuns(), "magSize");

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

    public static int getGunAmmo(ItemStack item)   {
        return item.getItemMeta().getPersistentDataContainer().get(currentAmmo, PersistentDataType.INTEGER);
    }

    public static void decrementGunAmmo(ItemStack item)   {
        ItemMeta itemMeta = item.getItemMeta();
        int decrementedAmmo = getGunAmmo(item) - 1;
        itemMeta.getPersistentDataContainer().set(currentAmmo, PersistentDataType.INTEGER, decrementedAmmo);
        item.setItemMeta(itemMeta);
    }

}
