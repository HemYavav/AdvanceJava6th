package RMI.RmiDiscount;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PriceCalculatorImpl extends UnicastRemoteObject implements PriceCalculator {
    protected PriceCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateSellingPrice(double costPrice, double discount) throws RemoteException {
        return costPrice - discount;
    }
}
