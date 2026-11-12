import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, 
 * ordenarlos en orden ascendente."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio09_OrdenamientoTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme tres numeros: ");
        int num1=tcl.nextInt(), num2=tcl.nextInt(), num3=tcl.nextInt();
        if (num1>num2 && num1>num3)
            if (num2>num3)
                System.out.println(num1 + " " + num2 + " " + num3);
            else 
                System.out.println(num1 + " " + num3 + " " + num2);
        else 
            if (num2>num1 && num2>num3)
                if (num1>num3)
                    System.out.println(num2 + " " + num1 + " " + num3);
                else 
                    System.out.println(num2 + " " + num3 + " " + num1);
            else 
                if (num1>num2)
                    System.out.println(num3+" "+num1+" "+num2);
                else 
                    System.out.println(num3+" "+num2+" "+num1);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Deme tres numeros: 6 10 9
10 9 6
BUILD SUCCESSFUL (total time: 5 seconds)       
 */