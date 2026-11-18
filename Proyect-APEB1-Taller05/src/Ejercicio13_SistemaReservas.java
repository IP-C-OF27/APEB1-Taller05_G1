import java.util.Scanner;
/**
 * Ejercicio 13: " En una hostería de la ciudad de Loja se hace un descuento del 
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida 
 * el número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 * @author Paula, Joaquin
 * @version 1.0
 */
public class Ejercicio13_SistemaReservas{
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double precioDia, subtotal, descuento = 0, total;
        System.out.print("Ingrese los dias de hospedaje: ");
        dias = tcl.nextInt();
        System.out.print("Ingrese precio por dia: ");
        precioDia = tcl.nextDouble();
        subtotal = precioDia*dias;
        if (dias>5 && dias<=10)
            descuento = subtotal*0.10;
        else 
            if (dias>10 && dias<=15)
                descuento = subtotal*0.15;
            else 
                if (dias>15)
                    descuento = subtotal*0.20;
        total = subtotal - descuento;
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total: "+total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese los dias de hospedaje: 14
Ingrese precio por dia: 55
Subtotal: 770.0
Descuento: 115.5
Total: 654.5
BUILD SUCCESSFUL (total time: 8 seconds)
 */