package designpatterns.factory;

import designpatterns.factory.fruit.Fruit;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Apple;
import designpatterns.factory.fruit.designpatterns.factory.fruit.impl.Orange;


/**
 * 静态工厂的实现
 */
public class StaticFactory {
    public static Fruit getApple(){
        return new Apple();
    }

    public static Fruit getOrange(){
        return new Orange();
    }

    public static void main(String[] args){
        Fruit fruit = StaticFactory.getApple();
        fruit.eat();

        Fruit fruit1 = StaticFactory.getOrange();
        fruit1.eat();
    }
}
