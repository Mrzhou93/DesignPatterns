package abstractFactory;

import abstractFactory.eneity.Bullet;
import abstractFactory.eneity.GUN;
import abstractFactory.factory.AKFactory;
import abstractFactory.factory.AbstractFactory;

public class Test {
    public static void main(String[] args){
        AbstractFactory factory1 = new AKFactory();
        Bullet bullet1 = factory1.getBulletInstance();
        GUN gun1 = factory1.getGUNInstance();
        bullet1.load();
        gun1.shoot();
    }
}

