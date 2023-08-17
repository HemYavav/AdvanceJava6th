package RMI.RmiSumSubtract;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServiceImpl extends UnicastRemoteObject implements MathService {
    public MathServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double sum(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double difference(double a, double b) throws RemoteException {
        return a - b;
    }
}
