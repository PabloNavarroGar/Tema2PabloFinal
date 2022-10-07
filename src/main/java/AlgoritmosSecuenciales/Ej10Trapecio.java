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
public class Ej10Trapecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Una empresa constructora se dedica a realizar
        bloques de pisos en parcelas como las que figuran
        en la imagen de la derecha. Necesitan saber el área de
        la parcela según las medidas A, B y C. Realiza el ejercicio 
        usando JOption para solicitar y mostrar datos al usuario.

         */
        //variables
        double a, b, c;

        //Base1
        //Panel introduccion de datos
        String baseString = JOptionPane.showInputDialog(" Introduce "
                + "cuanto mide la base 1 del trapecio");

        //Transformacion de un dato(double) a un string
        a = Double.parseDouble(baseString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " La base 1 del trapecio mide " + a);

        //Base2
        //Panel introduccion de datos
        String baseDosString = JOptionPane.showInputDialog(" Introduce "
                + "cuanto mide la base 2 del trapecio");

        //Transformacion de un dato(double) a un string
        b = Double.parseDouble(baseDosString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " La base 2 del trapecio mide " + b);

        //Altura
        //Panel introduccion de datos
        String alturaString = JOptionPane.showInputDialog(" Introduce "
                + " cuanto mide la altura  del trapecio");

        //Transformacion de un dato(double) a un string
        c = Double.parseDouble(alturaString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " La altura "
                + "del trapecio mide " + c);

        JOptionPane.showMessageDialog(null, " El Area "
                + "del trapecio es de : " + (a + b) * c / 2);

    }

}
