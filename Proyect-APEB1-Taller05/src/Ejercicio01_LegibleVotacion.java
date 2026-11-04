
import java.util.Scanner;

/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Paula, Joaquín
 * @version 1.0
 */
public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Deme edad: ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Legible para votar");
        else
            System.out.println("No Legible para votar");
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Deme edad: 
23
Legible para votar
BUILD SUCCESSFUL (total time: 3 seconds)
 */