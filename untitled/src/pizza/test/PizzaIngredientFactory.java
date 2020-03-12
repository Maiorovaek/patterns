package pizza.test;

public interface PizzaIngredientFactory {
    Dough createDough();
    String createSauce();
    Cheeze createCheese();
    Clams createClam();
}
