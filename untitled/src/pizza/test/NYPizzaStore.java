package pizza.test;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected PizzaAbstr createPizza(String item) {
        PizzaAbstr pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        }
        else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
         return pizza;
    }


}
