package calculatorrmi;

import java.rmi.registry.Registry;

public class CalciServer
{
    public static void main(String args[])
    {
        try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calci", new CalciRmi());
            System.out.println("Servidor funcionando");
        } catch (Exception e)
        {
            System.out.println("Error en servidor" + e);
        }
    }
}