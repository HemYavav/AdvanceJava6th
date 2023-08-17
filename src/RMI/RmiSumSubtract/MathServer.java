package RMI.RmiSumSubtract;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathServer {
    public static void main(String[] args) {
        try {
            MathService mathService = new MathServiceImpl();
            
            // Create and bind the remote object in the RMI registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MathService", mathService);
            
            System.out.println("MathService bound and ready.");
        } catch (Exception e) {
            System.err.println("MathService exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
