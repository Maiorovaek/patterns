package pizza.test;

public class NYPizzaIngredientFactory implements  PizzaIngredientFactory {
   public Dough createDough(){
       return new ThinCrustDough();
   }

    @Override
    public String createSauce() {
        return "NY sauce";
    }

    @Override
    public Cheeze createCheese() {
        return new Cheeze();
    }

    public Cheeze createCheeze(){
       return new ReggianoCheeze();
   }

   public Veggies[] createVeggies(){
       Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
       return veggies;
   }

   public Pepperoni createPepperoni(){
       return new SlicedPepporoni();
   }

   public Clams createClam(){
       return new FreshClams();
   }
}
