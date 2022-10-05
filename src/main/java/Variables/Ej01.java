/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

/**
 *
 * @author samue
 */
public class Ej01 {

    public static void main(String[] args) {

        //variables primitivos
        byte entero = 6;
        short entero2 = 12345;
        int entero3 = 12;
        long entero4 = 12345678;

        System.out.println(" Numero Entero=" + entero + " Numero Entero2=" + entero2 + " Numero entero3=" + entero3 + " Numero Entero4=" + entero4);
        // decimales
        float decimal = 3.45f; // este numero es float, necesita f al lado
        double decimal2 = 10.45;
        int variableint = 1;
        System.out.println(" Mi numero float  es " + decimal + " Mi numero double es " + decimal2);
        
        //Caracteres
        
        char caracter ='A';
        System.out.println(" El caracter es= " + caracter);
        
        //booleano
        
        boolean decision = true ;
        boolean decision2 = false ;
        System.out.println(" Diez es mayor que ocho  " + decision + " Ocho es mayor que diez " + decision2);
        
        
        //C
        
        String texto= "Esto es un texto para el ejercicio 1 del tema 2";
        System.out.println(texto);
        
        //D Literal
       
        int uno = 10;
        
        uno = 012;
        
        uno = 0xA;
        
        System.out.println(" uno es " +uno);
    }

}
