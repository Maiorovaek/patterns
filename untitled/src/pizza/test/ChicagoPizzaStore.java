package pizza.test;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected PizzaAbstr createPizza(String item) {
        PizzaAbstr pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        }
        else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
