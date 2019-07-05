package abstractFactory.factory;

import abstractFactory.eneity.Bullet;
import abstractFactory.eneity.GUN;


public interface AbstractFactory {
    GUN getGUNInstance();
    Bullet getBulletInstance();
}
