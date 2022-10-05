/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosSecuenciales;


import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Ej01Algoritmofahrenhei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FORMULA = (9/5) ºC + 32
        
           
        //DATOS
           //teclado, darle a la bombilla y a la primera opcion para que haga el import de java scanner
        Scanner lector = new Scanner(System.in); 
        
        // variables
        double fahrenhei; //los 2 tipos de grados
        double centigrados;
        // constantes
        final double SUMA = 32;
        final double FORMULA = 9/5.0;
        
        System.out.println(" Ingresa la cantidad de grados Celsius(centígrados) que quites convertir");
        
        centigrados = lector.nextDouble();
        
        //PROCESO----Formula
         fahrenhei =  (FORMULA) * centigrados + SUMA;
        
        
        //MOSTRAR RESULTADO
        
        System.out.println( centigrados+ " grados centigrados son " + fahrenhei+ " gratos Fahrenheit ");
        
        /**/
    }
    
}
