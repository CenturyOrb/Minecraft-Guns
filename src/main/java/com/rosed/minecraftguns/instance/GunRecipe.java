package com.rosed.minecraftguns.instance;

import com.rosed.minecraftguns.InstanceManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GunRecipe {

    public GunRecipe()   {

        setUpColtRecipe();

    }

    private void setUpColtRecipe()   {

        ItemStack colt = new ItemStack(Material.WOODEN_SHOVEL);
        ItemMeta coltMeta = colt.getItemMeta();
        coltMeta.setDisplayName(ChatColor.GRAY + "Colt");
        List<String> coltLore = new ArrayList<>();
        coltLore.add(ChatColor.GOLD + "Left to shoot:");
        coltMeta.setLore(coltLore);
        // add item PDC
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
