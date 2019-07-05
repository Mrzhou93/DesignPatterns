package decorator;

import decorator.component.People;
import decorator.component.concretecomponent.Bill;
import decorator.concretedecorator.Shirt;
import decorator.concretedecorator.Suit;
import decorator.concretedecorator.TShirt;

public class DecoratorTest {
    public static void main(String[] args) {
        People p1 = new Suit(new Bill());
        p1.wear();


        People p2 = new Shirt(new TShirt(new Bill()));
        p2.wear();
    }
}
