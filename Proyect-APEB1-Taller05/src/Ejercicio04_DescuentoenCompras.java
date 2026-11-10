import java.util.Scanner;
/**
 * Ejercicio 04: "Calcular el precio final de un producto con un descuento del 
 * 10% si el precio original es mayor de $100; de lo contrario, 
 * no hay descuento."
 * @author Joaquin, Paula
 * @version 1.0
 */

public class Ejercicio04_DescuentoenCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precio, rtafinal;
        System.out.print("Ingrese el valor a pagar: ");
        precio = tcl.nextDouble();
        if (precio > 100);
        rtafinal = (precio * 0.90);
        System.out.println("Su valor a pagar es: "+rtafinal);       
    }  
}

/***
EVIDENCIA DEL RUN:
run-single:
Ingrese el valor a pagar: 
120
Su valor a pagar es: 108.0
BUILD SUCCESSFUL (total time: 6 seconds
 */