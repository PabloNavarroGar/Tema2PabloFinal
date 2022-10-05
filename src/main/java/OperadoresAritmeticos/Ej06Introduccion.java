/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OperadoresAritmeticos;

/**
 *
 * @author pablo
 */
public class Ej06Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Indica si el siguiente código funciona o no. En caso afirmativo indica que hace, en caso negativo explica por qué no funciona.
        */
                //a Funciona quiere decir que 83 es igual a 'a' pero como no lo es que es '97' da false
		boolean adivina = ((83 == 'a') && false);
		System.out.println(adivina);
                //b Funciona, lo que quiere decir que la letra a representa un numero en este caso la a es '97'
		int a = 'a';
		System.out.println(a);
                //c = No funciona porque no se puede poner un numero decimal en un int.
	 	//int number = 2.14;
		//System.out.println(number);
                //d = No funciona porque los numeros decimales se tienen que declarar con un '.' y no con ','.       
		//double pi = 3,14;
		//System.out.println(pi);
                //e Funciona, significa que el test el 1  es igual a 1 y tiene que dar true
	 	boolean test = (1==1);
		System.out.println(test);

        
        
    }
    
}