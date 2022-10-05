/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OperadoresAritmeticos;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Ej14HorasMinutosySegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escaner de introduccion de datos
        Scanner teclado = new Scanner(System.in);

        int cantidadTiempo;

        System.out.println(" ¿Cuanta cantidad de tiempo quieres convertir? ");

        cantidadTiempo = teclado.nextInt();

        /*
        El programa tendrá una variable entera tiempo inicializada 
        con un valor leído por teclado, en segundos, y queremos conocer
        este tiempo pero expresado en horas, minutos y segundos,
        mostrando los resultados por pantalla.
         */
        //variables constantes
         final int MINUTOSHORA = 60;
         final int SEGUNDOSHORA = 3600;

        //Operaciones:
        int horas  = cantidadTiempo / SEGUNDOSHORA;
       
        //Para sacar las horas tenemos que dividir la cantidad 
        //de tiempo entre los segundos de una hora, su cociente son las horas
        
        int minutos = (cantidadTiempo % SEGUNDOSHORA) / MINUTOSHORA;
        
        /*
        Los minutos se sacan diviendo nuestro tiempo entre segundos de una hora que seria el resto
        y luego esa cantidad entre los minutos de una hora
         */

        int segundos = cantidadTiempo % MINUTOSHORA;

        //Los segundos salen diviendo la cantidad de tiempo por nuestros minutos hora y el resto son los segundos.
        //El resultado
        System.out.println(" Hemos pasado " + cantidadTiempo + " Nos sale " + horas + " horas " + minutos + " Minutos " + segundos + " Segundos ");

    }

}
