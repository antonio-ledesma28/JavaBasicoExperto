/*
Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla 
de multiplicar de dicho número
 */
package ejercicio16;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, multiplicación;
        
        
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número "
                    + "entre 0 y 10 para darte su tabla de multiplicar: "));
        if(num<0 || num>10){
                System.out.println("El número que ingresaste está fuera de rango\n"
                        + "Vuleve a digitar");
            }
        
        }while(num<0 || num>10);    
            for(int i=1;i<=10;i++){
                multiplicación = num*i;
                System.out.println(num+" X "+i+" = "+ multiplicación);
            }
            
        
    }
    
}
