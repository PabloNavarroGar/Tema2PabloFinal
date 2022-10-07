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
public class Ej03NotaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        float primeraNota;
        float segundaNota;
        float terceraNota;

        String nota1;
        String nota2;
        String nota3;

        float notamedia;
        //panel de introduccion de datos con el string de nota
        nota1 = JOptionPane.showInputDialog(" Primera nota");
        //Parse en Float

        primeraNota = Float.parseFloat(nota1);

        nota2 = JOptionPane.showInputDialog(" Segunda nota");
        //Parse en Float

        segundaNota = Float.parseFloat(nota2);

        nota3 = JOptionPane.showInputDialog(" Tercera nota");
        //Parse en Float

        terceraNota = Float.parseFloat(nota3);

        //FORMULA de otener nota media
        notamedia = (primeraNota + segundaNota + terceraNota) / 3;

        //Nota media
        //System.out.println(" La nota media es : %2.f" + notaMedia);
        //Panel que muestra la nota media
        JOptionPane.showMessageDialog(null, " La nota media es = " + notamedia);

    }

}
