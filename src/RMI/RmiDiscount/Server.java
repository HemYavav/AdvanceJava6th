package RMI.RmiDiscount;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            PriceCalculator calculator = new PriceCalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("PriceCalculator", calculator);

            System.out.println("Server ready!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
