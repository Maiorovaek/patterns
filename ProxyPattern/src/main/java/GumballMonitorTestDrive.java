import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {
                "rmi://127.0.0.1/gumballMachine",
                "rmi://127.0.0.2/gumballMachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machineRemote =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machineRemote);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
