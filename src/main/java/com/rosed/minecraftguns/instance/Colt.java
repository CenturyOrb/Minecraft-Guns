package com.rosed.minecraftguns.instance;

public class Colt extends Pistol {

    private static final int magSize = 32;
    private static final int fireRate = 30;
    private static final AmmunitionType ammunitionType = AmmunitionType.TYPE_45ACP;

    public Colt() {
        super(magSize, fireRate, ammunitionType);

    }

}
