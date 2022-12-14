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
public class Ej05Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Cada grupo de clase de un centro educativo tiene 30 horas de clase
        a la semana. Calcula el número de profesores que se necesitan,
        teniendo en cuenta que un profesor imparte un número
        de horas de clase a la semana, que se debe pedir
        al usuario, junto con el número total de grupos
        que tiene el centro escolar*/
        //variables constante
        final int HORASCLASE = 30;
        //variables
        int numeroGrupos;
        int horasProfesorImpartidas;
        int profesoresNecesarios;

        //Panel de introduccion de hora con un parse para pasar el dato(int) a string
        String horasString = JOptionPane.showInputDialog(" Introduce las "
                + "horas que va a trabajar el profesor  ");

        //Transformacion de un dato(int) a un string
        horasProfesorImpartidas = Integer.parseInt(horasString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " Las horas "
                + "que va a trabajar son " + horasProfesorImpartidas);

        //Numero de grupos del centro
        String grupoString = JOptionPane.showInputDialog(" Introduce el numero "
                + "de clases que hay en el instituto  ");

        //Transformacion de un dato(int) a un string
        numeroGrupos = Integer.parseInt(grupoString);

        //Resultado del panel
        JOptionPane.showMessageDialog(null, " El numero de clases "
                + "del instituto es de  " + numeroGrupos);

        //Variable y formula
        profesoresNecesarios = (HORASCLASE * numeroGrupos) / horasProfesorImpartidas;

        JOptionPane.showMessageDialog(null, " El numero de "
                + "profesores que se necesitan son : " + (int) Math.ceil(profesoresNecesarios));
        // el (int) es para que se quite el 15.0 u muestre solo el 15 , es estetico
    }

}
