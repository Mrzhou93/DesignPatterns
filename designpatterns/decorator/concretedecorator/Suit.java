package decorator.concretedecorator;

import decorator.component.Decorator;
import decorator.component.People;

public class Suit extends Decorator {
    public Suit(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿Suit");
    }
}
