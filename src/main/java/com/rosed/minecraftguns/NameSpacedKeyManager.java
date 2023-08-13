package com.rosed.minecraftguns;

import lombok.Getter;
import org.bukkit.NamespacedKey;

@Getter
public class NameSpacedKeyManager {

    private MinecraftGuns plugin = InstanceManager.INSTANCE.getMinecraftGuns();

    private NamespacedKey gunType = new NamespacedKey(plugin, "gunType");
    private NamespacedKey currentAmmo = new NamespacedKey(plugin, "currentAmmo");

}
