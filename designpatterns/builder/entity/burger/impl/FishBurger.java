package builder.entity.burger.impl;

public class FishBurger extends Burger {
    @Override
    public String name() {
        return "鱼堡";
    }


    @Override
    public float price() {
        return 15.0f;
    }
}
