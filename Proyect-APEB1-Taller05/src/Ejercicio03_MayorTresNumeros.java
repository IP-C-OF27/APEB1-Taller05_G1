
import java.util.Scanner;

/**
 * Ejercicio 01: "Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Paula, Joaquin
 * @version 1.0
 */

public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num_1, num_2, num_3;
        System.out.print("Ingrese tres numeros: ");
        num_1 = tcl.nextInt();
        num_2 = tcl.nextInt();
        num_3 = tcl.nextInt();
        if (num_1 > num_2 && num_1 > num_3)
            System.out.println("El numero mayor es: " + num_1);
        else 
            if (num_2 > num_1 && num_2 > num_3)
                System.out.println("El numero mayor es: " + num_2);
            else 
                System.out.println("El numero mayor es: " + num_3);            
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese tres numeros: 4 6 10
El numero mayor es: 10
BUILD SUCCESSFUL (total time: 9 seconds)
 */