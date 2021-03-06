package start;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> createIteratorLunch() {
        return menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
