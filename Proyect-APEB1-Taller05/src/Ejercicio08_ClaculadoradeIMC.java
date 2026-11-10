import java.util.Scanner;
/**
 * Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal (IMC)
 * de una persona y clasificarla en función de su valor (bajo peso, peso normal,
 * sobrepeso, etc.)."
 * @author Joaquín, Paula
 * @version 1.0
 */
public class Ejercicio08_ClaculadoradeIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double altura, peso, respuesta;
        int var1 = 2;
        System.out.println("Ingrese su peso en kg: ");
        peso = tcl.nextDouble();
        System.out.println("Ingrese su altura en m: ");
        altura = tcl.nextDouble();
        respuesta = (peso/ Math.pow(altura, var1));
        if (respuesta < 18.5) {
        System.out.println("Tienes peso bajo!: "+respuesta);}
        if ((respuesta >= 18.5) && (respuesta <= 25)) {
        System.out.println("Tienes peso normal!: "+respuesta);}
        if ((respuesta >= 25) && (respuesta < 30)) {
        System.out.println("Tienes sobrepeso!: "+respuesta);}
        if (respuesta >= 30) {
        System.out.println("Tienes obesidad!: "+respuesta);}
    }  
}
/*
 * EVIDENCIA DEL RUN:
Ingrese su peso en kg: 
85
Ingrese su altura en m: 
1,71
Tienes sobrepeso!: 29.06877329776684
BUILD SUCCESSFUL (total time: 12 seconds)
*/