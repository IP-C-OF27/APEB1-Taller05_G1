
import java.util.Scanner;

/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Joaquín, Paula
 * @version 1.0
 */

public class Ejercicio02_Diadelasemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dia;
        String msjdia;
        System.out.print("Deme un numero de dia: ");
        dia = tcl.nextInt();
        switch (dia) {
            case 1:
                msjdia = "Lunes";
                break;
            case 2:
                msjdia = "Martes";               
                break;    
            case 3:
                msjdia = "Miercoles";
                break;
            case 4:
                msjdia = "Jueves";
                break;
            case 5:
                msjdia = "Viernes";
                break;
            case 6:
                msjdia = "Sabado";
                break;
            case 7:
                msjdia = "Domingo";
                break;
            default:
                msjdia = "error";
        }
        System.out.println("El nro: "+dia + " correspone a "+ msjdia);
    }    
}
/*
 * EVIDENCIA DEL RUN:
 * run-single:
Deme un numero de dia: 4
El nro: 4 correspone a Jueves
BUILD SUCCESSFUL (total time: 5 seconds)
*/