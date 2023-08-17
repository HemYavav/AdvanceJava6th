package RMI.RmiFactorial;

import RMI.RmiFactorial.Factorial;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactorialImpl extends UnicastRemoteObject implements Factorial {
    public FactorialImpl() throws RemoteException {
        super();
    }

    @Override
    public int calculateFactorial(int n) throws RemoteException {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
