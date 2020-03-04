package pizzaStore1;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("Bake pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cut pepperoni");
    }

    @Override
    public void box() {
        System.out.println("Boxed pepperoni");
    }
}
