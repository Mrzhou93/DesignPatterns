package abstractFactory.factory;

import abstractFactory.eneity.Bullet;
import abstractFactory.eneity.GUN;
import abstractFactory.eneity.impl.M4;
import abstractFactory.eneity.impl.M4Bullet;

public class M4Factory implements AbstractFactory {
    @Override
    public GUN getGUNInstance() {
        return new M4();
    }

    @Override
    public Bullet getBulletInstance() {
        return new M4Bullet();
    }
}
