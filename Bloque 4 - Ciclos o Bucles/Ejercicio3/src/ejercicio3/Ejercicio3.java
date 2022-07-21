/*
Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar
si es par o impar
 */
package ejercicio3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Escribe un valor para "
                + "determinar si es positivo o negativo: "));
        while(num!=0){
            if(num%2==0){
            JOptionPane.showMessageDialog(null, "El número "+num+" es par");
            }
            else{
            JOptionPane.showMessageDialog(null, "El número "+num+" es impar");          
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        if(num==0){
            JOptionPane.showMessageDialog(null,"El número es 0\n\nFin del programa" );
        }
    }  
        

    }
    