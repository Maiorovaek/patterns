import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballTestDrive {
    public static void main(String[] args) throws RemoteException {
        int count;
        GumballMachineRemote gumballMachine = null;
        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>  ");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            System.out.println("COUNT " + count);
            gumballMachine = new GumballMachine( args[0], count);
            Registry registry = LocateRegistry.getRegistry(2001);
             //   GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
//            Registry reg = LocateRegistry.createRegistry(1093);
            Naming.rebind("//"+ args[0] +"/gumballMachine", gumballMachine);
         //   Naming.rebind("//"+ args[0] +"/gumballMachine"  , gumballMachine);
            // публикует заглушку GumballMachine под именем  gumballmachine
            //    gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
