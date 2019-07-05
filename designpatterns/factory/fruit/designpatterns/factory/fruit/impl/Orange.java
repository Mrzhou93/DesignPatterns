package designpatterns.factory.fruit.designpatterns.factory.fruit.impl;

import designpatterns.factory.fruit.Fruit;

public class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("Eat orange");
    }
}
