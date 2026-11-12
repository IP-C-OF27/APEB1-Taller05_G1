import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o 
 * no. Si es bisiesto, mostrar un mensaje especial."
 * @author Paula, Joaquin
 * @version 1.0
 */
public class Ejercicio05_AnioBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio;
        System.out.print("Ingrese un año: ");
        anio = tcl.nextInt();
        if (anio % 400 == 0)
            System.out.println("Es un año bisiesto");
        else 
            if (anio % 100 == 0)
                System.out.println("NO es un año bisiesto ");
            else 
                if (anio % 4 == 0)
                    System.out.println("Es un año bisiesto");
                else 
                    System.out.println("NO es un año bisiesto");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese un a�o: 1900
NO es un a�o bisiesto 
BUILD SUCCESSFUL (total time: 6 seconds)
 */