package pizza.test;


public class NYStyleCheesePizza extends PizzaAbstr {

    public NYStyleCheesePizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = new ThinCrustDough();
        sauce = "Marinara";

    }

    @Override
    void prepare() {


    }
}
