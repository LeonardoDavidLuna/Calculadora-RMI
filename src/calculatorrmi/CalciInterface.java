package calculatorrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalciInterface extends Remote
{
    public double add(double x, double y) throws RemoteException;
    public double sub(double x, double y) throws RemoteException;
    public double mul(double x, double y) throws RemoteException;
    public double div(double x, double y) throws RemoteException;
    public double fac(double x)           throws RemoteException;;
    public double raiz(double x)          throws RemoteException;;
    public double fib(int x)              throws RemoteException;;
}