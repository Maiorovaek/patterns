package start;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    private int position = 0;
    private MenuItem[] menuItems;

    public DinnerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
