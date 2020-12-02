package calculatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalciRmi extends UnicastRemoteObject implements CalciInterface {

    public CalciRmi() throws RemoteException {
        double a, b;
    }

    public double add(double a, double b) throws RemoteException {
        return a + b;
    }

    public double sub(double a, double b) throws RemoteException {
        return a - b;
    }

    public double mul(double a, double b) throws RemoteException {
        return a * b;
    }

    public double div(double a, double b) throws RemoteException {
        return a / b;
    }

    public double fac(double a) throws RemoteException {
        double factorial = 1;
        for (double i = a; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public double raiz(double a) throws RemoteException {
        a = Math.sqrt(a);
        return a;
    }

    public double fib(int n)
    {
        int a = 0, b = 1, c;
        int[ ] serie = new  int[n];
        System.out.println("Elementos de la serie: ");
        
        int i=0;
       
        for (i = 0; i <=n; i++)
        {
            System.out.print(a+", ");
            c = a + b;
            a = b;
            b = c;
            serie[i]=a;
        }
        return serie[i];
    }
}
