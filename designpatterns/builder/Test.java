package builder;

import builder.entity.meal.Meal;

public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.meal1();
        meal1.showItems();

        Meal meal2 = mealBuilder.mean2();
        meal2.showItems();
    }
}
