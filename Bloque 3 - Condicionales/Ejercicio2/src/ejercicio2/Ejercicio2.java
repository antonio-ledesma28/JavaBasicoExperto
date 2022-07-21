/*
Ejercicio 2: Pedir dos números y decir cuál es el mayor o si son iguales.
 */
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int num, num2;
        num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        
        System.out.println("Número 1: "+num);
        System.out.println("Número 2: "+num2);
       
        if(num>num2){
           JOptionPane.showMessageDialog(null, "El primer número es más grade que el segundo");
       }
       if(num2>num){
           JOptionPane.showMessageDialog(null,"El segundo número es más grande que el primero");
       }
       if(num==num2){
           JOptionPane.showMessageDialog(null, "Los dos números son iguales");
       }
        
    }
    
}
