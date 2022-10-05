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
public class Ej11FiguraCirculoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Se requiere obtener el área de 
        la figura, a partir de R y H. Realiza un algoritmo para resolver el problema.
        */
        //variables
        
        double H,R;
        
        double areaBase, areaLateral, areaTotal;
        
        String radioString= JOptionPane.showInputDialog(" Introduce el radio(R) ");
        
        //Transformacion de un dato(double) a un string
        R = Double.parseDouble(radioString);
        
        //Resultado del panel
        JOptionPane.showMessageDialog(null, " El lado R mide  " + R);
        
        
        String ladoString= JOptionPane.showInputDialog(" Introduce el lado H ");
        
        //Transformacion de un dato(double) a un string
        H = Double.parseDouble(ladoString);
        
        //Resultado del panel
        JOptionPane.showMessageDialog(null, " El lado H mide  " + H);
        
        
        areaBase = Math.PI*Math.pow(R,2);
        
        areaLateral = Math.PI*R*H;
        
        areaTotal = areaBase+areaLateral;
        
        String resultado ="""
                          
                            El area del semicirculo es = %.2f cm2
                            El area del triangulo   es = %.2f cm2  
                            El area de la figura    es = %.2f cm2
                          """.formatted(areaBase, areaLateral, areaTotal);
        
        
        JOptionPane.showMessageDialog(null, resultado);
        //Math.hypot(3, 4);
        
        
        
        
        
        
    }
    
}
