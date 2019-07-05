package builder.entity.drink.impl;

import builder.entity.Item;
import builder.entity.pack.Packing;
import builder.entity.pack.impl.Bottle;

public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
