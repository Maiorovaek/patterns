package pizzaStore2;

public abstract class PizzaStore  {
//type - cheeze, vegan and so on
    public PizzaAbstr orderPizza(String type) {
        PizzaAbstr pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

  protected abstract PizzaAbstr createPizza(String type);
}
