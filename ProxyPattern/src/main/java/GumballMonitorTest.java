//import java.rmi.Naming;
//
//public class GumballMonitorTest {
//    public static void main(String[] args) {
//        String[] location = {
//                "rmi://santafe.mightygumball.com/gumballMachine",
//                "rmi://boulder.mightygumball.com/gumballMachine",
//                "rmi://seattle.mightygumball.com/gumballMachine"};
//
//        GumballMonitor[] monitor = new GumballMonitor[location.length];
//
//        for (int i = 0; i < location.length; i++) {
//            try {
//                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
//                monitor[i] = new GumballMonitor(machineRemote);
//                System.out.println(monitor[i]);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int i = 0; i < monitor.length; i++) {
//            monitor[i].report();
//        }
//    }
//}
