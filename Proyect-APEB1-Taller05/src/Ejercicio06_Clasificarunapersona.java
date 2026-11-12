import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría 
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Joaquín, Paula
 * @version 1.0
 */

public class Ejercicio06_Clasificarunapersona {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad <= 12){
            System.out.print("Eres un niño! ");
        }
        if (edad > 12 && edad <= 18){
            System.out.print("Eres un adolescente! ");
        } 
        {
        if(edad > 18){
            System.out.print("Eres un adulto! ");
        }    
    }
}
}
/*
 * EVIDENCIA DEL RUN:
run-single:
Ingrese su edad: 16
Eres un adolescente! BUILD SUCCESSFUL (total time: 3 seconds)
*/