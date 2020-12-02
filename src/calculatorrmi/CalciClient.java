package calculatorrmi;

import java.rmi.Naming;
import java.util.Locale;
import java.util.Scanner;

public class CalciClient
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            CalciInterface c = (CalciInterface) Naming.lookup("//localhost/Calci");

            int opcion;
            double x, y;
            do {
                    System.out.println("CALCULADORA CON RMI");
                    System.out.println("MENÚ");
                    System.out.println("1. SUMA");
                    System.out.println("2. RESTA");
                    System.out.println("3. MULTIPLICACIÓN");
                    System.out.println("4. DIVISIÓN");
                    System.out.println("5. FACTORIAL");
                    System.out.println("6. RAÍZ CUADRADA");
                    System.out.println("7. FIBONACCI");
                    System.out.println("0. SALIR");
                    
                    opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1: //Suma
                    {
                        System.out.println("--SUMA--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("Introduce b:");
                        y = sc.nextDouble();
                        System.out.println("La suma es: ");
                        System.out.println(c.add(x, y));
                        break;
                    }
                    case 2: //Resta
                    {
                        System.out.println("--RESTA--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("Introduce b:");
                        y = sc.nextDouble();
                        System.out.println("La resta es: ");
                        System.out.println(c.sub(x, y));
                        break;
                    }
                    case 3: //Multiplicacion
                    {
                        System.out.println("--MULTIPLICACIÓN--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("Introduce b:");
                        y = sc.nextDouble();
                        System.out.println("La multiplicación es: ");
                        System.out.println(c.mul(x, y));
                        break;
                    }
                    case 4: //Division
                    {
                        System.out.println("--DIVISIÓN--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("Introduce b:");
                        y = sc.nextDouble();
                        if(y==0)
                        {
                            System.out.println("¡No se puede dividir entre 0!");
                        }else
                        {
                            System.out.println("La División es: ");
                            System.out.println(c.div(x, y));
                        }
                        break;
                    }
                    case 5: //Factorial
                    {
                        System.out.println("--FACTORIAL--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("El Factorial es: ");
                        System.out.println(c.fac(x));
                        break;
                    }
                    case 6: //Raiz
                    {
                        System.out.println("--RAÍZ CUADRADA--");
                        System.out.println("Introduce a:");
                        x = sc.nextDouble();
                        System.out.println("La Raíz es: ");
                        System.out.println(c.raiz(x));
                        break;
                    }
                    case 7: //Fibonacci
                    {
                        System.out.println("--FIBONACCI--");
                        System.out.println("Introduce n:");
                        x = sc.nextDouble();
                        System.out.println("La Sucesión es: ");
                        
                        break;
                    }
                    case 0: System.out.println("--Hasta Luego--");
                    break;
                    default:
                        System.out.println("¡OPCIÓN INVÁLIDA!");
                }
            } while (opcion != 0);
        } catch (Exception e)
        {
            System.out.println("Exception " + e);
        }
    }
}