import java.util.Scanner;
/*
Ejercicio 10: "Valores pares o impares: Dado un valor entero ingresado por
teclado (positivo o negativo), determinar si se trata de un valor par o impar."
 * @author Joaquín, Paula
 * @version 1.0
 */
public class Ejercicio10_Valores_pares_impares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valor1;
        System.out.print("Ingrese su numero: ");
        valor1 = tcl.nextInt();
        if (valor1%2 == 0)
            System.out.println("Tu numero es par! ");
        if (valor1%2 == 1)
            System.out.println("Tu numero es impar! ");    
    }
}
/*
EVIDENCIA DEL RUN:
run-single:
Ingrese su numero: 9
Tu numero es impar! 
BUILD SUCCESSFUL (total time: 2 seconds)

run-single:
Ingrese su numero: 8
Tu numero es par! 
BUILD SUCCESSFUL (total time: 3 seconds)

*/
