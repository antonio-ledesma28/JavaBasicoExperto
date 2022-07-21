/*
 Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N
 */
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int num;
        num =Integer.parseInt(JOptionPane.showInputDialog("Escribe un número positivo: "));
        System.out.println("Los números en secuencia son: ");
        for(int i =1;i<=num;i++){
            System.out.println("Número: "+i);
        }
    }
    
}
