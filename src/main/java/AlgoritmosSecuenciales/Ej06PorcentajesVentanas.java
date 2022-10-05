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
public class Ej06PorcentajesVentanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        String nombreSocio1, nombreSocio2, nombreSocio3;
        double presupuestoTotal =0;

        double dineroSocio1, dineroSocio2, dineroSocio3;

        //Socio1
        nombreSocio1 = JOptionPane.showInputDialog(" Introduce el nombre del Socio 1 ");

        JOptionPane.showMessageDialog(null, "Tu apellido es " + nombreSocio1);

        //Dinero
        String dineroString = JOptionPane.showInputDialog(" Introduce el dinero que pondra al presupuesto");

        //Transformacion de un dato(double) a un string
        dineroSocio1 = Double.parseDouble(dineroString);

        JOptionPane.showMessageDialog(null, "El dinero que pone es  " + dineroSocio1 + "€");

         presupuestoTotal += dineroSocio1;

        //Socio 2
        nombreSocio2 = JOptionPane.showInputDialog(" Introduce el nombre del Socio 2 ");

        JOptionPane.showMessageDialog(null, "Tu apellido es " + nombreSocio2);

        //Dinero
        String dinero2String = JOptionPane.showInputDialog(" Introduce el dinero que pondra al presupuesto");

        //Transformacion de un dato(double) a un string
        dineroSocio2 = Double.parseDouble(dinero2String);

        JOptionPane.showMessageDialog(null, "El dinero que pone es  " + dineroSocio2 + "€");

        presupuestoTotal += dineroSocio2;
        
        
        
        //Socio 3
        
         nombreSocio3 = JOptionPane.showInputDialog(" Introduce el nombre del Socio 3 ");

        JOptionPane.showMessageDialog(null, "Tu apellido es " + nombreSocio3);

        //Dinero
        String dinero3String = JOptionPane.showInputDialog(" Introduce el dinero que pondra al presupuesto");

        //Transformacion de un dato(double) a un string
        dineroSocio3 = Double.parseDouble(dinero3String);

        JOptionPane.showMessageDialog(null, "El dinero que pone es  " + dineroSocio3 + "€");

        presupuestoTotal += dineroSocio3;
        
        
        //Formula y calculo
        
        JOptionPane.showMessageDialog(null, " EL socio 1 " + nombreSocio1 + " Ha aportado " + dineroSocio1 + "Equivale a " + (dineroSocio1/presupuestoTotal)*100+"%");
        
        
        JOptionPane.showMessageDialog(null, " EL socio 2 " + nombreSocio2 + " Ha aportado " + dineroSocio2 + "Equivale a " + (dineroSocio2/presupuestoTotal)*100+"%");
        
        
        JOptionPane.showMessageDialog(null, " EL socio 3 " + nombreSocio1 + " Ha aportado " + dineroSocio3 + "Equivale a " + (dineroSocio3/presupuestoTotal)*100+"%");
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
