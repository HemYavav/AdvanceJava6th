package RMI.RmiSumSubtract;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathService extends Remote {

    double sum(double a, double b) throws RemoteException;

    double difference(double a, double b) throws RemoteException;
}
