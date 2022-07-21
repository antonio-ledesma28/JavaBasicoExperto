/*
 Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.   
 */
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
        int num1,num2,num3,mayor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer número: "));
        
        System.out.println("Primer número: "+num1);
        System.out.println("Segundo número: "+num2);
        System.out.println("Tercer número: "+num3);
        
        if((num1>num2) && (num2>num3)){
            JOptionPane.showMessageDialog(null, "El mayor es el primer número\n"
                    + num1 + num2+ num3);
        }
        else if((num1>num3) && (num3>num2)){
            JOptionPane.showMessageDialog(null, "El mayor es el primer número\n"
                    + num1 + num3+ num2);
        }
        else if((num2>num1) && (num1>num3)){
            JOptionPane.showMessageDialog(null, "El mayor es el segundo número\n"
                    + num2 + num1+ num3);
        }
        else if((num2>num3) && (num3>num1)){
            JOptionPane.showMessageDialog(null, "El mayor es el segundo número\n"
                    + num2 + num3+ num1);
    }
        else if((num3>num1) && (num1>num2)){
            JOptionPane.showMessageDialog(null, "El mayor es el tercer número\n"
                    + num3 + num1+ num2);
        }
        else if((num3>num2) && (num2>num1)){
            JOptionPane.showMessageDialog(null, "El mayor es el tercer número\n"
                    + num3 + num2+ num1);
        }
    }
    
}
