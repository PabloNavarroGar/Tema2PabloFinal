/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosSecuenciales;


import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej02Radiodeuncirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables: radio,longitud,area y volumen
        double radioCircunferencia;
        double LONGITUD;

        //constantes
        final double NUMEROPI = 3.14;
        
        //Entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println(" ¿Cuanto mide el radio de tu circunferencia?");

        radioCircunferencia = teclado.nextDouble();

        //Formula de longitud = L = 2*PI*R
        LONGITUD = 2 * NUMEROPI * radioCircunferencia;

        //Resultado de LONGITUD
        System.out.println(" La Longitud de tu circunferencia es : " + LONGITUD);

        // AREA DE LA CIRCUNFERENCIA
        double areaCirculo;

        //FORMULA A=PI*r2
        areaCirculo = NUMEROPI * Math.pow(radioCircunferencia, 2);

        System.out.println(" El Area de mi circulo es : " + areaCirculo);

        // VOLUMEN DE CIRCUNFERENCIA
        double volumenEsfera;

        //FORMULA V= 4/3*NUMERIPI*RADIO al cubo
        volumenEsfera = 4 / 3 * NUMEROPI * Math.pow(radioCircunferencia, 3);

        System.out.println(" El volumen de la esfera es : " + volumenEsfera);

    }

}
