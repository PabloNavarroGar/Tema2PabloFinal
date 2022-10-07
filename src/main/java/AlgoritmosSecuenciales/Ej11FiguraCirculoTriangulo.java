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
        double h, r;

        double areaSemicirculo, areaTriangulo, areaTotal;

        String radioString = JOptionPane.showInputDialog(" Introduce el radio(R) ");

        //Transformacion de un dato(double) a un string
        r = Double.parseDouble(radioString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " El lado R mide  " + r);

        String ladoString = JOptionPane.showInputDialog(" Introduce el lado H ");

        //Transformacion de un dato(double) a un string
        h = Double.parseDouble(ladoString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " El lado H mide  " + h);

        //Calculo de area de la circuferencia
        areaSemicirculo = Math.PI * Math.pow(r, 2)/2;

        areaTriangulo = Math.hypot(h, 2)/2;

        areaTotal = areaSemicirculo + areaTriangulo;

        String resultado = """
                          
                            El area del semicirculo es = %.2f cm2
                            El area del triangulo   es = %.2f cm2  
                            El area de la figura    es = %.2f cm2
                          """.formatted(areaSemicirculo, areaTriangulo, areaTotal);

        JOptionPane.showMessageDialog(null, resultado);
        //Math.hypot(3, 4);

    }

}
