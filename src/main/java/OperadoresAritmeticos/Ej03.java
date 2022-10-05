/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OperadoresAritmeticos;

/**
 *
 * @author samue
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 10;
        int b = 5;
        int i = 0;

        double c = 71.3;
        double d = 4.8;
        //Resultado de las operaciones: a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d
        int suma;  // a+b
        int resta;  // a-b
        int multiplicacion;  // a*b
        int division;  // a/b
        double suma2; // c+d
        double resta2; // c-d
        double multiplicacion2; // c*d
        double division2; // c/d

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        suma2 = c + d;
        resta2 = c - d;
        multiplicacion2 = c * d;
        division2 = c / d;
        
        /*
        CASTING===ESTO ES MUY IMPORTANTE
        Cuando quereamos dividir dos numeros enteros y queremos que salfa decimal podemos poner los siguiente
        
        double divisionEnteros = a/(double)b;
        */

        // Esto es para que aparezcan y con el %.2f es para que aparezcan con 2 decimales, se puede cambiar
         System.out.printf(" Suma %.2f Resta %.2f Multiplicacion %.1f Division %.2f ", 
                 suma2 , resta2 , multiplicacion2, division2);
        
        /*
        System.out.println(" El resultado de suma es " + suma);
        System.out.println(" El resultado de resta es " + resta);
        System.out.println(" El resultado es  " + multiplicacion);
        System.out.println(" El resultado es " + division);
        System.out.println(" El resultado es " + suma2);
        System.out.println(" El resultado es " + resta2);
        System.out.println(" El resultado es " + multiplicacion2);
        System.out.println(" El resultado es " + division2);*/
        //D
            //Al final de la triple comilla
        String resultadoTexto = """ 
                                 En este bloque de texto los resultados son:
                                 La suma  es: %d
                                 La resta  es: %d
                                 La Multiplicacion es 3 es: %d
                                 La Division es: %d
                                 La Suma2 es : %f
                                 La resta2  es: %f
                                 La Multiplicacion2  es: %f
                                 La Division2 es: %f
                                 
                                
                            
                                """.formatted(suma, resta, multiplicacion, division , suma2, resta2, multiplicacion2 , division2);
        
        System.out.println(resultadoTexto);

        //E También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
        a *= 3;  // a = a*3
         b -= 1;  // b = b -1
         a /= b;  // a = a/b
        c = c += d; // c = c+d

        System.out.println(" El resultado es :" + a);
        System.out.println(" El resultado es :" + b);
        System.out.println(" El resultado es :" + c);

        //Finalmente, el programa muestra en consola la siguiente información,
        //en distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
        
        System.out.println(" El valor de i es: " + i );
            
        System.out.println(" Valor de i++ : " + (i++));
        System.out.println(" i: : " + i);
        
        
        //MODULO
        a=11;
        b = 5;
        
        int cociente = a/b;
        int resto = a%b;
        // si el resto da 0, ese numero es par, si no es impar.
        System.out.println(" Conciente " + cociente + " Resto " + resto);
        
       
               
    }

}
