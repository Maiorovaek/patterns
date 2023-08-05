import java.util.ArrayList;
import java.util.Iterator;


//Компоновщик, итератор
public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<>();

    public void add(Quackable quacker) {
        ducks.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }

    }

    @Override
    public void notifyObservers() {

    }
}
