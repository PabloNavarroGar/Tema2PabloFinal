/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosSecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class EjercicoVicoExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Algoritmo secuencial, el cual tenga un scanner y un JOption pane en el 
        que se introduzcan datos
         */
        //variables
        String nombre, apellido1, apellido2;
        double sueldo;
        int mesesCobrando;
        double sueldoTotal;

        Scanner teclado = new Scanner(System.in);

        nombre = JOptionPane.showInputDialog(" ¿Como te llamas?");

        apellido1 = JOptionPane.showInputDialog(" ¿Introduce su primer apellido");

        apellido2 = JOptionPane.showInputDialog(" ¿Introduce su segundo apellido");

        System.out.println(" ¿Cuanto cobras al mes? ");

        sueldo = teclado.nextDouble();

        System.out.println(" ¿Cuantos meses has estado trabajando?");
        mesesCobrando = teclado.nextInt();

        sueldoTotal = sueldo * mesesCobrando;

        String resultado = """
                         
                         Te llamas %s %s %s.
                         
                         Has cobrado %.2f.
                         
                         En los ultimos %d meses.
                         
                         """.formatted(nombre,
                apellido1,
                apellido2,
                sueldoTotal,
                mesesCobrando);

        JOptionPane.showMessageDialog(null, resultado);

    }

}
