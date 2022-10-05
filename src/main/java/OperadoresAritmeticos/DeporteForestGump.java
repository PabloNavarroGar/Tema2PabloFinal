/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OperadoresAritmeticos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class DeporteForestGump {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
   final int VELOCIDAD = 8 ; //km/h
        final double MINUTO_HORA = 60.0; 
        
        int minutosCorriendo;
        double distanciaRecorrida;
        
        //teclado, darle a la bombilla y a la primera opcion 
        Scanner teclado = new Scanner(System.in);  
        
        System.out.println(" Introduce los minutos que esta corriendo Forest ");
        
        //Usando teclado y el metodo nextint vamos a leer un numero entero
        
        minutosCorriendo = teclado.nextInt();
        
        
        System.out.println(" Valor de minutosCorriendo " + minutosCorriendo );
        

        //Proceso
        distanciaRecorrida =  (minutosCorriendo / MINUTO_HORA) * VELOCIDAD;
        
        //Mostrar resultado
        
        System.out.println(" Ha recorrido " + distanciaRecorrida + " km/h" );

    }
    
}
