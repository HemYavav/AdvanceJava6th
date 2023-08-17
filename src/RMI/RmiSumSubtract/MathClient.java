package RMI.RmiSumSubtract;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MathClient {
    public static void main(String[] args) {
        try {
            // Obtain a reference to the remote object from the RMI registry
            Registry registry = LocateRegistry.getRegistry("localhost");
            MathService mathService = (MathService) registry.lookup("MathService");
            
            double a = 10.0;
            double b = 5.0;
            
            double sum = mathService.sum(a, b);
            double difference = mathService.difference(a, b);
            
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
        } catch (Exception e) {
            System.err.println("MathClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
