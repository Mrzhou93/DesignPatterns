package designpatterns.factory.fruit.designpatterns.factory.fruit.impl;

import designpatterns.factory.fruit.Fruit;

public class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("Eat apple");
    }
}
