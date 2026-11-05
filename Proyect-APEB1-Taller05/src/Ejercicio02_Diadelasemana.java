
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
        dia = tcl.nextInt();
        switch (dia) {
            case 1:
                msjdia = "Lunes";
                break;
            case 2:
                msjdia = "Martes";               
                break;    
            case 3:
                msjdia = "Miércoles";
                break;
            case 4:
                msjdia = "Jueves";
                break;
            case 5:
                msjdia = "Viernes";
                break;
            case 6:
                msjdia = "Sábado";
                break;
            case 7:
                msjdia = "Domingo";
                break;
            default:
                msjdia = "error";
        }
        System.out.println("El nro: "+dia + "correspone a"+ msjdia);
    }
    
}

/*
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
*/