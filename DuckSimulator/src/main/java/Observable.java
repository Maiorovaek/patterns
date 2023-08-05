import java.util.ArrayList;
import java.util.Iterator;


public class Observable implements QuackableObserver {
    ArrayList<Observer> observers = new ArrayList<>();
    QuackableObserver duck;

    public Observable(QuackableObserver duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
