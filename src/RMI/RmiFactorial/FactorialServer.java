package RMI.RmiFactorial;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            Factorial factorial = new FactorialImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Default RMI registry port
            
            registry.bind("FactorialService", factorial);
            
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
