/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
los números introducidos
 */
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num,suma=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número. "
                + "A excepción del 0:"));
        while(num!=0){
            System.out.println("Número ingresado: "+num);
            suma+=num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número. "
                + "A excepción del 0.\n"
                    + " A menos que quieras abandonar el programa:"));
        }
        JOptionPane.showMessageDialog(null,"La suma de todos los valores"
                + " tecleados es: "+suma);
    }
    
}
