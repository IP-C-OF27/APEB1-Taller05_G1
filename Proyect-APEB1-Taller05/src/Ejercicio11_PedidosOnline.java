import java.util.Scanner;
/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el costo 
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad que 
 * se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades
 * se hace un descuento de 15%."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio, costoTotal;
        System.out.print("Deme la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Deme la cantidad que requiere: ");
        cantidad = tcl.nextInt();
        System.out.print("Deme el precio por unidad: ");
        precio = tcl.nextDouble();
        costoTotal = (cantidad*precio);
        if (cantidad > 50)
            costoTotal *= 0.85;
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Costo total: "+costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */