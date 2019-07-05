package designpatterns.factory;

import designpatterns.factory.fruit.Fruit;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Apple;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Orange;


/**
 * 利用反射机制
 */

public class ReflectSimpleFactory {
    public Fruit getFruit(String fruitType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> fruit = Class.forName(fruitType);
        return (Fruit) fruit.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ReflectSimpleFactory factory = new ReflectSimpleFactory();

        Fruit fruit = factory.getFruit(Apple.class.getName());
        fruit.eat();

        Fruit fruit1 = factory.getFruit(Orange.class.getName());
        fruit1.eat();
    }
}
