package pizza.test;

import java.util.ArrayList;

public abstract class PizzaAbstr {
    String name;
    Dough dough;
    String sauce;
    Veggies veggies[];
    Cheeze cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "fs";
    }
}
