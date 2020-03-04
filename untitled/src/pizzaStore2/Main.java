package pizzaStore2;


public class Main {
    public static void main(String[] args) {
//        //NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//        PizzaStore nyStore = new NYPizzaStore();
//        nyStore.orderPizza("cheeze");

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaAbstr pizza = nyStore.orderPizza("cheese");
        System.out.println("" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("" + pizza.getName() + "\n");
    }
}
