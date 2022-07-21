/*
Ejercicio 6: Hacer un programa que tome dos números y diga si ambos son pares 
o impares
 */
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num1,num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        
        if((num1%2==0)&& (num2%2==0)){
            JOptionPane.showMessageDialog(null, "Los dos números son pares");           
        }
        else if((num1%2!=0) &&(num2%2!=0)){
            JOptionPane.showMessageDialog(null, "Los dos números son impares");
        }
        else{
            JOptionPane.showMessageDialog(null, "Un número es par y otro impar");
        }
    }
    
}
