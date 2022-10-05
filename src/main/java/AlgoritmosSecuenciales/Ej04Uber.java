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
public class Ej04Uber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //variables
        double kilometros;
        double presupuesto;
        
        //constantes
        
        final double SERVICIO = 1.25;  
        
        final double KILOMETRORECORRIDO = 0.08;
        
        
        
        
        //Transformacion de un dato(double) a un string
        
        String kilometrosString = JOptionPane.showInputDialog( " Kilometros de distancia");
        
        
        kilometros = Double.parseDouble(kilometrosString);
        
        
       //FORMULA presupuesto = kilometros *KILOMETRORECORRIDO/SERVICIO
       
       presupuesto= SERVICIO+(KILOMETRORECORRIDO*kilometros);
        
        
        
        
        
        //Ventana Kilometros
        JOptionPane.showMessageDialog(null, " Es presupuesto es : + "+presupuesto +"€. Gracias por nuestro servicio ");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
