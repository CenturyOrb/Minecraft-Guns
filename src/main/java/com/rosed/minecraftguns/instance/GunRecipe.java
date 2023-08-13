package com.rosed.minecraftguns.instance;

import com.rosed.minecraftguns.InstanceManager;
import com.rosed.minecraftguns.MinecraftGuns;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class GunRecipe {

    private MinecraftGuns minecraftGuns;

    public GunRecipe()   {

        this.minecraftGuns = InstanceManager.INSTANCE.getMinecraftGuns();

        setUpColtRecipe();

    }

    private void setUpColtRecipe()   {

        ItemStack colt = new ItemStack(Material.WOODEN_SHOVEL);
        ItemMeta coltMeta = colt.getItemMeta();
        coltMeta.setDisplayName(ChatColor.GRAY + "Colt");
        List<String> coltLore = new ArrayList<>();
        coltLore.add(ChatColor.GRAY + "Ammunition : " + ChatColor.BLUE + "45 ACP");
        coltMeta.setLore(coltLore);
        // add item PDC
        PersistentDataContainer data = coltMeta.getPersistentDataContainer();
        data.set(new NamespacedKey(minecraftGuns, "gunType"), PersistentDataType.STRING, "Colt");
        colt.setItemMeta(coltMeta);

        ShapedRecipe coltRecipe = new ShapedRecipe(new NamespacedKey(InstanceManager.INSTANCE.getMinecraftGuns(), "Colt"), colt);
        coltRecipe.shape(
                "III",
                "  I",
                "   ");

        coltRecipe.setIngredient('I', Material.IRON_INGOT);

        Bukkit.addRecipe(coltRecipe);

    }

}
