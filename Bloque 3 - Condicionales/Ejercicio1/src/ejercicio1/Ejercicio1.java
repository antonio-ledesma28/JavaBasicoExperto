/*
 Ejercicio 1: Hacer un programa que lea un número entero y muestre si el número 
es múltiplo de 10
 */
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(num%10==0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10");
        }
    }
    
}
