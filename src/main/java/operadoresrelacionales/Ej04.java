/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author pablo
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int a = 10;
        int b = 20;

        //variables booleanas 
        boolean decision1;
        boolean decision2;
        boolean decision3;
        boolean decision4;

        // a<b, a>b, a==b, a!=b
        decision1 = a < b;
        decision2 = a > b;
        decision4 = a == b;
        decision3 = a != b;

        String resultadoTexto = """
                           -¿Es 10 menor que 20?    --- %b
                           -¿Es 10 mayor que 20?    --- %b
                           -¿Es 10 igual que 20?    --- %b
                           -¿Es 10 distinto que 20? --- %b
                           
                           
                           """.formatted(decision1, decision2, decision4, decision3);

        System.out.println(resultadoTexto);

    }

}
