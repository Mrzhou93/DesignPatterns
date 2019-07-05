package decorator.concretedecorator;

import decorator.component.Decorator;
import decorator.component.People;

public class TShirt extends Decorator {
    public TShirt(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿TShirt");
    }
}
