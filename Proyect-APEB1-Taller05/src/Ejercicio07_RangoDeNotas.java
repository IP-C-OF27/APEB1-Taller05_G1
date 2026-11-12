import java.util.Scanner;
/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una 
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Paula, Joaquin
 * @version 1.0
 */

public class Ejercicio07_RangoDeNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese su nota: ");
        nota = tcl.nextInt();
        if (nota>=90 && nota<=100)
            System.out.println("Nota: A");
        else 
            if (nota>=80 && nota<=89)
                System.out.println("Nota: B");
            else 
                if (nota>=70 && nota<=79)
                    System.out.println("Nota: C");
                else 
                    if (nota>=0 && nota<=69)
                        System.out.println("Nota: D");
                    else 
                        System.out.println("Ingrese una nota dentro del rango "
                                + "de 0 a 100");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese su nota: 75
Nota: C
BUILD SUCCESSFUL (total time: 9 seconds)
 */