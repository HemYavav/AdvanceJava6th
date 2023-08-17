package RMI.RmiFactorial;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hem  Yadav
 */
public interface Factorial extends Remote {
    int calculateFactorial(int n) throws RemoteException;
}
