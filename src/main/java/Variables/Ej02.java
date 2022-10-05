/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

/**
 *
 * @author samue
 */
public class Ej02 {
    public static void main (String [] args) {
            
        int a=1 , b=2 , c=3;
        /*
        Realiza los siguiente intercambios de valores: en b guarda c,
        en c guarda a, en a guarda b. Muestra por pantalla el resultado
        */
        b=c; 
        c=a;
        b=a;
     

        System.out.println("  " +a +" " + b + "  " + c);
        double d = 4.5 , e = 5.7 , f = 6.9;
    
        System.out.println("  " + d + "  "+  e + "  " +  f);
    }
}
