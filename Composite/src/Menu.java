import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChildren(int i){
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription() );
        System.out.println("______________________");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
