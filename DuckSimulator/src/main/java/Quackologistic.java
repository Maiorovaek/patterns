//наблюдатель
public class Quackologistic implements Observer {
    @Override
    public void update(QuackableObserver duck) {
        System.out.println("Quackologist: " + duck + "just quacked.");
    }
}
