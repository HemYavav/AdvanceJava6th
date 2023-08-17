package RMI.RmiFactorial;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost"); // Use the appropriate server address
            
            Factorial factorial = (Factorial) registry.lookup("FactorialService");
            
            int inputNumber = 5; // Change this to the desired input number
            int result = factorial.calculateFactorial(inputNumber);
            
            System.out.println("Factorial of " + inputNumber + " is " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
