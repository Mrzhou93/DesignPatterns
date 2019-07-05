package decorator.concretedecorator;

import decorator.component.Decorator;
import decorator.component.People;

public class Pants extends Decorator {
    public Pants(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿Pants");
    }
}
