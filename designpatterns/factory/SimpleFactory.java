package designpatterns.factory;

import designpatterns.factory.fruit.Fruit;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Apple;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Orange;

/**
 * 普通工厂的实现
 */

public class SimpleFactory {
    public Fruit getInStance(String fruit){
        if (fruit.equals("apple")) {
            return new Apple();
        } else
            return new Orange();
    }

    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        Fruit fruit = factory.getInStance("apple");
        fruit.eat();

        Fruit fruit1 = factory.getInStance("orange");
        fruit1.eat();
    }
}
