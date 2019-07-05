package builder.entity.drink.impl;

public class Coffee extends Drink {
    @Override
    public String name() {
        return "咖啡";
    }

    @Override
    public float price() {
        return 13.4f;
    }
}
