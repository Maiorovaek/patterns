package pizzaStore1;

public class Main {
    public static void main(String[] args) {
        NYPizzaStore nyFactory = new NYPizzaStore();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("cheese");
    }
}
