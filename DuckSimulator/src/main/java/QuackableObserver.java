public interface QuackableObserver {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
