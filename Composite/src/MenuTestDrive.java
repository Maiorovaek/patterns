public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenu = new Menu("ALL MENUS", "All menu combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);

        //Dinner
        dinnerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true, 2.99));
        dinnerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29));
        dinnerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));

        //Pancake
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and  toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        //CafeMenu
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "VA cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
