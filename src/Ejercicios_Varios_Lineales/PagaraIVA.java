/*
¿Cuánto se pagará por la compra de una cantidad de computadoras de acuerdo a su precio, 
sabiendo que se hará un descuento del 25% y se le cargará el IVA (16%) a la compra - PROGRAMA 6
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class PagaraIVA {

    public static void main(String[] args) {
        
        double cantidad;
        double precio;
        double costo;
        double descuento;
        double IVA;
        double totalDescuento;
        double totalIVA;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de computadoras: ");
        cantidad = teclado.nextDouble();
        
        System.out.println("Ingresar Precio de la computadora: ");
        precio = teclado.nextDouble();
        
        costo = cantidad*precio;
        descuento = costo*0.25;
        totalDescuento = costo - descuento;
        IVA = descuento*0.16;
        totalIVA = totalDescuento + IVA;
        
        System.out.println("Costo de las Computadoras: "+costo);
        System.out.println("Descuento por las computadoras: "+totalDescuento);
        System.out.println("IVA por las computadoras compradas: "+totalIVA);
                
        
        
        
        
    }
    
}
