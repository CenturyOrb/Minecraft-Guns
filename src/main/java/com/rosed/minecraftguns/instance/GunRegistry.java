package com.rosed.minecraftguns.instance;

import java.util.HashMap;
import java.util.Map;

// GunRegistry to register and retrieve gun classes
public class GunRegistry {

    private Map<String, Class<? extends Gun>> registry = new HashMap<>();

    public GunRegistry()   {

        registerGun("Colt", Colt.class);

    }

    public void registerGun(String name, Class<? extends Gun> gunClass) {
        registry.put(name, gunClass);
    }

    public Gun createGun(String name) throws IllegalAccessException, InstantiationException {
        Class<? extends Gun> gunClass = registry.get(name);
        if (gunClass != null) {
            return gunClass.newInstance();
        }
        return null;
    }

}