public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount());
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
