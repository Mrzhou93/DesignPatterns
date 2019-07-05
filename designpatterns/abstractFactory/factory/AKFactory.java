package abstractFactory.factory;

import abstractFactory.eneity.Bullet;
import abstractFactory.eneity.GUN;
import abstractFactory.eneity.impl.AK;
import abstractFactory.eneity.impl.AKBullet;

public class AKFactory implements AbstractFactory {
    @Override
    public GUN getGUNInstance() {
        return new AK();
    }

    @Override
    public Bullet getBulletInstance() {
        return new AKBullet();
    }
}
