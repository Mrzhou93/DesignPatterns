package builder.entity.burger.impl;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜堡";
    }

    @Override
    public float price() {
        return 12.5f;
    }
}
