/*
¿Cuál es la diferencia de edad entre padre e hijo,
sabiendo que la edad del Padre es del doble que la del Hijo - PROGRAMA 5
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class DiferenciaEdadPadreHijo {

    public static void main(String[] args) {
        
        // Declaración de variables
        
        double PadreEdad;
        double Diferencia;
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar la edad del Padre");
        PadreEdad = teclado.nextDouble();
        
        Diferencia = PadreEdad/2;
        
        System.out.println("Diferencia de Edad entre padre e hijo: "+Diferencia);
        
        
        
       
    }
    
}
