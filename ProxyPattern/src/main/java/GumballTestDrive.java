public class GumballTestDrive {
    public static void main(String[] args) {
        int count = 10;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>  ");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(count, args[0]);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
