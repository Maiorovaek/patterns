package start;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and  toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("K&B's Pancake Breakfast", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("K&B's Pancake Breakfast", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarion, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarion, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
