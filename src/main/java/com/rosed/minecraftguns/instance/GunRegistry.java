package com.rosed.minecraftguns.instance;

import java.util.HashMap;
import java.util.Map;

// GunRegistry to register and retrieve gun classes
public class GunRegistry {

    private Map<String, Class<? extends Gun>> registry = new HashMap<>();

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

//// Abstract class for different types of guns
//abstract class Gun {
//    abstract void shoot();
//}
//
//// Concrete class for a Pistol
//class Pistol extends Gun {
//    @Override
//    void shoot() {
//        System.out.println("Pistol shooting...");
//    }
//}
//
//// Concrete class for a Shotgun
//class Shotgun extends Gun {
//    @Override
//    void shoot() {
//        System.out.println("Shotgun shooting...");
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        GunRegistry gunRegistry = new GunRegistry();
//        gunRegistry.registerGun("pistol", Pistol.class);
//        gunRegistry.registerGun("shotgun", Shotgun.class);
//
//        Gun pistol = gunRegistry.createGun("pistol");
//        Gun shotgun = gunRegistry.createGun("shotgun");
//
//        if (pistol != null) {
//            pistol.shoot();  // Output: Pistol shooting...
//        }
//
//        if (shotgun != null) {
//            shotgun.shoot(); // Output: Shotgun shooting...
//        }
//    }
//}