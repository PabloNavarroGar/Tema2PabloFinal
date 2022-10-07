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
public class Ej09Iva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        double articulo;
        double ivaTotal;
        //Variable constante
        final double IVA = 0.21;

        //Ventana de introduccion de datos
        String articuloString = JOptionPane.showInputDialog(" "
                + "Introduce el precio del articulo");

        //Transformacion de un dato(double) a un string
        articulo = Double.parseDouble(articuloString);

        ivaTotal = articulo * IVA;
        //Resultado
        JOptionPane.showMessageDialog(null, " "
                + "Con el IVA en total pasa a valer " + (ivaTotal + articulo));

    }

}
