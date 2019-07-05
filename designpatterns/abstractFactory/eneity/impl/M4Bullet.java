package abstractFactory.eneity.impl;

import abstractFactory.eneity.Bullet;

public class M4Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("Reload M4");
    }
}
