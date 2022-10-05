/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresrelacionales;

import java.util.Scanner;

public class EjemploExpresionesLogicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer por teclado nombre y apellidos de una persona, edad, pedo (kg) y estatura(lm)

        String nombre, apellido;
        int edad, estatura;
        double peso;

        Scanner teclado = new Scanner(System.in);
        //Si hay que leer textos y numeros con scanner
        //Primero se leen los textos y al final los numeros

        //Si lo anterior no es posible,hay que tener en cuenta
        //Que despues de leer un numero si vamos a leer un texto
        //Hay que limpiar el buffer teclado.nextline();
        //Introduccion de Datos
        System.out.println(" Introduce la Edad");

        edad = teclado.nextInt();

        System.out.println(" Tu edad es " + edad);

        //Limpiar porqueria MUY IMPORTANTE para que pida otro dato
        teclado.nextLine();

        System.out.println(" Introduce tu nombre ");

        nombre = teclado.nextLine();

        System.out.println(" Tu nombre es " + nombre);

        System.out.println(" Introduce tu apellido ");

        apellido = teclado.nextLine();

        System.out.println(" Tu nombre es " + apellido);

        //A--Si la edad esta comprendida entre 25 y 35 años
        boolean a = edad >= 25 && edad <= 35;

        System.out.println(" ¿Esta la edad esntre 25 y 35? " + a);

        //B---El peso es mayor de 50kg o menor o igual de 1000kg
        System.out.println(" Introduce tu peso ");

        peso = teclado.nextInt();

        System.out.println(" Tu peso es " + peso);

        boolean b = peso > 50 || peso <= 100;

        System.out.println(" El peso es mayor de 50kg y menos que 100kg? " + b);

        //C No mide 175cm OJO
        System.out.println(" Introduce tu estatura :  ");

        estatura = teclado.nextInt();

        boolean c = estatura == 175; // estatura=175;

        System.out.println(c + " Tu estarua es  " + estatura);
        //D--La estatura esta entre 100cm y 180cm
        boolean d = estatura >= 100 && estatura <= 180;

        System.out.println(b + " ¿Esta la estatura entre 100cm y 180?  " + d);

        //E: La edad mas de 10 años no supera los 60 años
        boolean e = ((edad = +10) < 60);

        System.out.println(" ¿ Esta la edad a mas de 10 pero no supera los 60?" + e);

        //F-- El nombre es igual a "Pablo" ignorando mayusculas y minusculas
        boolean f = (nombre.equalsIgnoreCase(" pablo "));
        System.out.println(" El nombre es igual a Pablo: " + f);

        // usa equalIgnoranceCase de los string
        //G: El apellido contine la letra "J" (usa contains de los String)
        boolean g = apellido.toLowerCase().contains(" j ");
        System.out.println(" ¿El apellido tiene contien la 'J'?: " + g);
        //H El apellido termina en "dez". Usa endsWith de los String.
        boolean h = apellido.toLowerCase().endsWith(" dez");

        System.out.println(" ¿El apellido acaba en 'dez'? " + h);

        //I La edad no esta entre 40 y 50 años
        boolean i = !(edad >= 40 && edad <= 50);

        System.out.println(" ¿No esta la edad entre 40 y 50 años? " + i);
        
        
        //lectura de datos con ventanas
        
        
       
        
        
        

    }

}
