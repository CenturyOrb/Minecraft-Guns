package com.rosed.minecraftguns.instance;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

// GunRegistry to register and retrieve gun classes
@Getter
public class GunRegistry {

    private Map<String, Gun> registry = new HashMap<>();

    public GunRegistry()   {

        registerGun("Colt", new Colt());

    }

    public void registerGun(String name, Gun gunClass) {
        registry.put(name, gunClass);
    }

//    public Gun createGun(String name) throws IllegalAccessException, InstantiationException {
//        Class<? extends Gun> gunClass = registry.get(name);
//        if (gunClass != null) {
//            return gunClass.newInstance();
//        }
//        return null;
//    }

}