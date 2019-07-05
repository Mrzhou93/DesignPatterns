package abstractFactory.eneity.impl;

import abstractFactory.eneity.Bullet;

public class AKBullet implements Bullet {
    @Override
    public void load() {
        System.out.println("AK reloading");
    }
}
