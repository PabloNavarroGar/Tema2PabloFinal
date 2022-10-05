/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosSecuenciales;


import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Ej07DolarEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
         double euro;
         final double dolar = 0.99;

        // final double DOLAR= 0.99;
        //final double EURO= 1;
        String euroString = JOptionPane.showInputDialog(" Introduce los euros que quieres pasar");

        euro = Double.parseDouble(euroString);

        

        JOptionPane.showMessageDialog(null, +euro + "€ Son " +(euro*dolar)/euro+"$" );

    }

}
