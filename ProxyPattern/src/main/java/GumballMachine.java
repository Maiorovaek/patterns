import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;

    String location;
    int count = 0;

    private static final long serialVersionID = 2L;
    public GumballMachine(String location, int numberGumballs ) throws RemoteException {

        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        this.location = location;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }


    public void insertQuarter() {
        state.insertQuarter();

    }

    void refill(int count) {
        this.count += count;
        System.out.println("the gumball machine was just refilled; it's new count is:  " + this.count);
        state.refill();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getWinnerState() {
        return winnerState;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }

    }

    @Override
    public String toString() {
        return "State{" +
                "state=" + state.getClass().getName() +
                ", count=" + count +
                '}';
    }

}
