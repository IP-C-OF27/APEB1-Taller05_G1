import java.util.Scanner;

/**
 * Ejercicio 12: "Calculo de impuestos: Desarrollar una solución que permita 
 leer los datos de un automóvil (marca, origen y costo) imprima el impuesto
 por pagar y el precio de venta (incluido el impuesto). Si el origen es 
 Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de
 Italia, 15%, y si es de USA, 8%"
 @author Joaquín, Paula
 @version 1.0
 */

public class Ejercicio12_CálculodeImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca, pais;
        double costo;
        double impuesto = 0;
        double rta;
        int origen;
        System.out.print("Ingrese la marca de su vehículo: ");
        marca = tcl.nextLine();
        System.out.print("Ingrese el país de orígen de su vehículo:"
                + "1: Alemania - 2: Japón - 3: Italia - 4: USA: ");
        origen = tcl.nextInt();
        System.out.print("Ingrese el costo de su vehículo: ");
        costo = tcl.nextDouble();
        if (origen == 1){
            pais = "Alemania";
            impuesto = (costo * 0.2);
                    rta = (costo + impuesto);
                    System.out.println("La marca del vehículo es: " + marca +
                    ", y su lugar de origen es: " + pais +
                    ". Por lo cual el impuesto es: " + impuesto +
                    " y su total a pagar es: " + rta);}
        if (origen == 2){
            pais = "Japón";
            impuesto = (costo * 0.3);
                    rta = (costo + impuesto);
                    System.out.println("La marca del vehículo es: " + marca +
                    ", y su lugar de origen es: " + pais +
                    ". Por lo cual el impuesto es: " + impuesto +
                    " y su total a pagar es: " + rta);}
        if (origen == 3){
            pais = "Italia";
            impuesto = (costo * 0.15);
                    rta = (costo + impuesto);
                    System.out.println("La marca del vehículo es: " + marca +
                    ", y su lugar de origen es: " + pais +
                    ". Por lo cual el impuesto es: " + impuesto +
                    " y su total a pagar es: " + rta);}
        if (origen == 4){
            pais = "USA";
            impuesto = (costo * 0.08);
                    rta = (costo + impuesto);
                    System.out.println("La marca del vehículo es: " + marca +
                    ", y su lugar de origen es: " + pais +
                    ". Por lo cual el impuesto es: " + impuesto +
                    " y su total a pagar es: " + rta);}           
        }
    }