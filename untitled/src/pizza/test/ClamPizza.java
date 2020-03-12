package pizza.test;


public class ClamPizza extends PizzaAbstr {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {

        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }

//    @Override
//    public void bake() {
//        System.out.println("Bake cheeze");
//    }
//
//    @Override
//    public void cut() {
//        System.out.println("Cut cheeze");
//    }
//
//    @Override
//    public void box() {
//        System.out.println("Boxed cheeze");
//    }
}
