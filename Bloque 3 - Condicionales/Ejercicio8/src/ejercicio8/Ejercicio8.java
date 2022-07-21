/*
Ejercicio 8: Pedir un numero entre 0 y 99,999 y decir cuántas cifras tiene.
 */
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int num;
        JOptionPane.showMessageDialog(null, "Escribe un número entre 0 y 99 999");
        num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        if(num<10){
            if (num>=0){
            JOptionPane.showMessageDialog(null, "El número "+num+" tiene"
                    + " 1 dígito");
            }
            else{
                JOptionPane.showMessageDialog(null,"Valor negativo no válido");
            }
        }
        else if(num<100){
        JOptionPane.showMessageDialog(null, "El número "+num+" tiene"
                    + " 2 dígito");
        }
        else if(num<1000){
        JOptionPane.showMessageDialog(null, "El número "+num+" tiene"
                    + " 3 dígito");
        }
        else if(num<10000){
        JOptionPane.showMessageDialog(null, "El número "+num+" tiene"
                    + " 4 dígito");
        }
        else if(num<100000){
        JOptionPane.showMessageDialog(null, "El número "+num+" tiene"
                    + " 5 dígito");
        }
    }
    
}
