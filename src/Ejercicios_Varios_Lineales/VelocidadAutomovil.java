/*
Calcular la velocidad de automóvil de acuerdo al tiempo utilizado y la Distancia recorrida - PROGRAMA 3
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class VelocidadAutomovil {

    public static void main(String[] args) {
       
        // Declaración de variables
        
        double Dist;
        double Time;
        double Vel;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar Distancia recorrida en Kilometros: ");
        Dist = teclado.nextDouble();
        
        System.out.println("Ingresar el tiempo en Horas: ");
        Time = teclado.nextDouble();
        
        Vel = Dist/Time;
        
        System.out.println("Velocidad recorrida de "+Vel+"Km/h");
    }
    
}
