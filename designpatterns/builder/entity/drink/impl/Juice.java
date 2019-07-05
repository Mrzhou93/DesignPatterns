package builder.entity.drink.impl;

public class Juice extends Drink{
    @Override
    public String name() {
        return "果汁";
    }

    @Override
    public float price() {
        return 11.1f;
    }
}
