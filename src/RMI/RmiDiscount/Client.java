package RMI.RmiDiscount;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            PriceCalculator calculator = (PriceCalculator) registry.lookup("PriceCalculator");

            double costPrice = 5000;
            double discount = 50;
            double sellingPrice = calculator.calculateSellingPrice(costPrice, discount);

            System.out.println("Selling Price: Rs. " + sellingPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
