package pizza.test;

public class ChicagoStyleCheesePizza extends PizzaAbstr {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = new ThickCrustDough();
        sauce = "Plum Tomato Sauce";
    }

    @Override
    void prepare() {

    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}