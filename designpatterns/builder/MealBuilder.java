package builder;

import builder.entity.burger.impl.FishBurger;
import builder.entity.burger.impl.VegBurger;
import builder.entity.drink.impl.Coffee;
import builder.entity.drink.impl.Juice;
import builder.entity.meal.Meal;

public class MealBuilder {
    public Meal meal1(){
        Meal meal = new Meal();
        meal.addItem(new FishBurger());
        meal.addItem(new Juice());

        return meal;
    }

    public Meal mean2(){
        Meal meal2 = new Meal();
        meal2.addItem(new VegBurger());
        meal2.addItem(new Coffee());

        return meal2;
    }
}
