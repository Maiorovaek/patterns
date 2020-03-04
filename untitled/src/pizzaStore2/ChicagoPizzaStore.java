package pizzaStore2;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected PizzaAbstr createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else return null;
    }
}
