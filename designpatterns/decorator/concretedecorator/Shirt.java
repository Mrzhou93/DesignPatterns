package decorator.concretedecorator;

import decorator.component.Decorator;
import decorator.component.People;

public class Shirt extends Decorator {
    public Shirt(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿Shirt");
    }
}
