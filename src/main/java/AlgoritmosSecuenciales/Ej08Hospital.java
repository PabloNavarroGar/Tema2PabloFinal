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
public class Ej08Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        
        
        double presupuestoAnual;
        double presupuestoGinecologiaTotal;
        double presupuestoTraumatologiaTotal;
        double presupuestoPedriatiaTotal;
        
        //Constantes
        final double PRESUPUESTOGINECOLOGIA = 40;
        final double PRESUPUESTOTRAUMATOLOGIA = 30;
        final double PRESUPUESTOPEDRIATIA  = 30;
        
        
        //teclado, darle a la bombilla y a la primera opcion 
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduce el presupuesto del que disponemos este año ");

        //Usando teclado y el metodo nextDouble vamos a leer un numero
        presupuestoAnual = teclado.nextDouble();

        //FORMULA PRESPUESTO x = prespuesto * 40/100
        presupuestoGinecologiaTotal= presupuestoAnual * PRESUPUESTOGINECOLOGIA / 100;

        System.out.println(" El presupuesto de Ginecologia de este año es : " + presupuestoGinecologiaTotal);

        //FORMULA PRESPUESTO PRESPUESTO x = prespuesto * 30/100
        presupuestoTraumatologiaTotal = presupuestoAnual * PRESUPUESTOTRAUMATOLOGIA / 100;

        System.out.println(" El presupuesto de Ginecologia de este año es : " + presupuestoTraumatologiaTotal);

        //FORMULA PRESPUESTO x = prespuesto * 30/100
        presupuestoPedriatiaTotal = presupuestoAnual * PRESUPUESTOPEDRIATIA / 100;

        System.out.println(" El presupuesto de Ginecologia de este año es : " + presupuestoPedriatiaTotal);
        
        System.out.printf(" hola muendo " , presupuestoTraumatologiaTotal);
    }

}
