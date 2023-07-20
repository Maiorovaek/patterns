public class SoldOutState implements State {
    transient GumballMachine gumballMachine;
    private static final long serialVersionID = 2L;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, th  machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject a quarter , you haven't inserted a quarter yet ");

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

    @Override
    public String toString() {
        return "SOLD OUT";
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }


}
