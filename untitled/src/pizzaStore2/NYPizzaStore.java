package pizzaStore2;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected PizzaAbstr createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else return null;
    }


}
