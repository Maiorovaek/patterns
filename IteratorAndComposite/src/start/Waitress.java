package start;

import java.util.Iterator;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator breakfastItems = pancakeHouseMenu.createIterator();
        Iterator menuLunch = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastItems);
        System.out.println("\nLUNCH");
        printMenu(menuLunch);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        //        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//        for (int i = 0; i < breakfastItems.size(); i++) {
//            MenuItem menuItem = breakfastItems.get(i);
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription() + " ");
//        }
    }

    public void printLaunchMenu() {
        DinnerMenu dinerMenu = new DinnerMenu();

        // MenuItem[] menuItems = dinerMenu.getMenuItems();
//        for (int i = 0; i < menuItems.length; i++) {
//            MenuItem menuItem = menuItems[i];
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription() + " ");
//        }
    }

    public void printVegetarianMenu() {
    }

    public boolean isItemVegetarian(String name) {
        return true;
    }


}
