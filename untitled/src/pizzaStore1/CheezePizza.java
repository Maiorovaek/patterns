package pizzaStore1;

public class CheezePizza implements Pizza {
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
