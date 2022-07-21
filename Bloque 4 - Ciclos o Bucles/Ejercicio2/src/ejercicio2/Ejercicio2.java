/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un 0.
 */
package ejercicio2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Escribe un valor para "
                + "determinar si es positivo o negativo: "));
        while(num!=0){
            if(num>0){
            JOptionPane.showMessageDialog(null, "El número "+num+" es positivo");
            }
            else{
            JOptionPane.showMessageDialog(null, "El número "+num+" es negativo");          
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        if(num==0){
            JOptionPane.showMessageDialog(null,"El número es 0\n\nFin del programa" );
        }
        
        

    }
    
}
