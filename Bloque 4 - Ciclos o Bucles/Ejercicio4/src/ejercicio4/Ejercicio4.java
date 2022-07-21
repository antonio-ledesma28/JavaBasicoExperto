/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos
números se han indroducido
 */
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        int contador=0;
        float num;
        
        num=Float.parseFloat(JOptionPane.showInputDialog("Escribe un número: "));
        while(num>=0){
            if(num==0){
                System.out.println("El número es neutro: "+num);
            }else{
                System.out.println("El número positivo es: "+num);
            
            }
            contador++;
            num=Float.parseFloat(JOptionPane.showInputDialog("Escribe otro número: "));
        }
        JOptionPane.showMessageDialog(null,"El número de veces que introdujiste"
                + " un número positivo o un 0 es de:\n"+contador+" veces ");
        
    }
    
}
