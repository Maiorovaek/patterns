package pizzaStore2;

public class CheesePizza extends PizzaAbstr {
    @Override
    public void prepare() {
        System.out.println("Prepare some cheeze");
    }

    @Override
    public void bake() {
        System.out.println("Bake cheeze");
    }

    @Override
    public void cut() {
        System.out.println("Cut cheeze");
    }

    @Override
    public void box() {
        System.out.println("Boxed cheeze");
    }
}
