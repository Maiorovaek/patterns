package pizzaStore2;


import pizzaStore1.Pizza;

public class NYStyleCheesePizza extends PizzaAbstr {

    public NYStyleCheesePizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara";

        toppings.add("Grated Reggiano Cheese");
    }
}
