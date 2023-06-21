/* Cuanto se pagará en la compra de balones de futbol, de acuerdo a 
la Cantidad comprada , sabiendo que se descontará el 20% porciento - PROGRAMA 2
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class Balones {

    public static void main(String[] args) {
        
        // Declaración de variables
        
        int cantidad;
        double precio;
        double subtotal;
        double total;
        double descuento;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cantidad de balones que lleva: ");
        cantidad = teclado.nextInt();
        
        System.out.println("Costo/Precio de los balones c/u: ");
        precio = teclado.nextDouble();
        
        subtotal = cantidad*precio;
        descuento = subtotal*0.20;
        total = subtotal-descuento;
        
        System.out.println("Total de la compra: "+subtotal);
        System.out.println("Descuento por la compra: "+descuento);
        System.out.println("Total a pagar: "+total);
     
    
    }
    
}
