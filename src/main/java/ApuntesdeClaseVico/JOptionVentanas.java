/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ApuntesdeClaseVico;


import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class JOptionVentanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre, apellido;
        int edad, estatura;
        double peso;
        
   
         
        
         
        //Los 2 shows son los que vamos a usar
        //esta ventana es la mas sencilla, necesitamos antes declarar la variable del string
        apellido = JOptionPane.showInputDialog(" Introduce tu apellido ");
        
        
        
        //Se pone Null de momento
        JOptionPane.showMessageDialog(null, "Tu apellido es "+apellido);
        
        
        
        
        
        
         //ventana del peso
         //en esta podemos crearla directamente con el comando String variablenombreString con el parse para tranformar un dato en un string
        String pesoString = JOptionPane.showInputDialog( " Introduce el peso");
        
        //Transformacion de un dato(double) a un string
       // peso = Double.parseDouble(pesoString);
        
        //peso+=10;
        
        
        //JOptionPane.showMessageDialog(null, "Tu peso es "+peso);
        
        //Ventana Estatura int
        
        // String estaturaString = JOptionPane.showInputDialog( " Introduce la estarua");
        
        
        
        //JOptionPane.showMessageDialog(null, "Tu peso es "+estatura);
        
        //Ventana boolean
        
       //boolean b = peso >= 50 || peso <= 100;
        
        
        
    }
    
}
