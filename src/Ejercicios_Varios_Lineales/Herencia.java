/*
Se desea saber cuánto le toca de Herencia a cada uno de los hijos, 
sabiendo que 3/4 partes les corresponden a ellos y el resto a su mamá - PROGRAMA 4
*/
package Ejercicios_Varios_Lineales;

import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {
    
        // Delcaración de variables
        
        double Herencia;
        int Hijos;
        double partes;
        double mama;
        double herenciaHijos;
        double herenciaXhijo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de la Herencia: ");
        Herencia = teclado.nextDouble();
        
        System.out.println("Ingresar el número de Hijos: ");
        Hijos = teclado.nextInt();
        
        partes = Herencia/4;
        mama = partes*1;
        herenciaHijos = partes*3;
        herenciaXhijo = herenciaHijos/Hijos;
                
        System.out.println("Herencia que le toca a los hijos es: "+herenciaHijos);
        System.out.println("Herencia que le toca a cada hijo es: "+herenciaXhijo);
        System.out.println("Herencia que le toca a la madre es: "+mama);
               
    }
    
}
