// Promedio de 4 calificaciones de un alumno, 31/01/2017 - PROGRAMA 1
package Ejercicios_Varios_Lineales;

import java.util.Scanner;


public class Calificaciones {

    public static void main(String[] args) {
        // Declaración de las variables
        
        double c1;
        double c2;
        double c3;
        double c4;
        double promedio;
        
        // Crear la instancia para la clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calificación de Matemáticas: ");
        c1 = teclado.nextDouble();
        
        System.out.println("Calificación de Español: ");
        c2 = teclado.nextDouble();
        
        System.out.println("Calificación de Física: ");
        c3 = teclado.nextDouble();
        
        System.out.println("Calificación de Inglés: ");
        c4 = teclado.nextDouble();
        
        promedio = (c1+c2+c3+c4)/4;
        System.out.println("Promedio Final: "+promedio);
      
        
        
               
    }
    
}
