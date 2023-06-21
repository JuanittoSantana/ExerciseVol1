/*
¿Cuánto se pagará por la compra de tres productos de acuerdo a la Cantidad y Precio de cada uno de ellos u 
aumentándoles el 16% de I.V.A
Pedir Nombre del producto, Cantidad y Precio - PROGRAMA 7
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class CodigosSecuenciales {

    public static void main(String[] args) {
      
        String Producto1;
        double Cantidad1;
        double Precio1;
        String Producto2;
        double Cantidad2;
        double Precio2;
        String Producto3;
        double Cantidad3;
        double Precio3;
        double subtotal1;
        double subtotal2;
        double subtotal3;
        double IVA;       
        double total1;
        double total2;
        double total3;
        double totales;
        double subtotales; 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Prodcuto: ");
        Producto1 = teclado.next();
        System.out.println("Cantidad de Producto: ");
        Cantidad1 = teclado.nextDouble();      
        System.out.println("Precio del producto: ");
        Precio1 = teclado.nextDouble();
        System.out.println("=========================");
        System.out.println("Prodcuto: ");
        Producto2 = teclado.next();        
        System.out.println("Cantidad de Producto: ");
        Cantidad2 = teclado.nextDouble();       
        System.out.println("Precio del producto: ");
        Precio2 = teclado.nextDouble();
        System.out.println("=========================");
        System.out.println("Prodcuto: ");
        Producto3 = teclado.next();        
        System.out.println("Cantidad de Producto: ");
        Cantidad3 = teclado.nextDouble();
        System.out.println("Precio del producto: ");
        Precio3 = teclado.nextDouble();
        System.out.println("=========================");
        total1 = Cantidad1*Precio1;
        total2 = Cantidad2*Precio2;
        total3 = Cantidad3*Precio3;
        subtotales = total1+total2+total3;
        IVA = (total1+total2+total3)*0.16;
        totales = subtotales + IVA;
        System.out.println("=========================");
        System.out.println("Subtotal: "+subtotales);
        System.out.println("IVA:"+IVA);
        System.out.println("Total a pagar: "+totales);
        System.out.println("=========================");
    }
    
}
