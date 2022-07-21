/*
Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo
 */
package ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        int num;
        float sueldo,sueldoMaximo=0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de sueldos:"));  
            if(num<0){
                System.out.println("Número negativo. Vuelve a digitar");
            }
        }while(num<0);
        for(int i=1;i<=num;i++){
            do{
                sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el sueldo "+i));
                if(sueldo<0){
                    System.out.println("Digitaste un sueldo negativo. Digita un"
                            + "sueldo válido");
                }
            }while(sueldo<0);
            if(sueldoMaximo<sueldo){
                sueldoMaximo=sueldo;
            }
        }
        JOptionPane.showMessageDialog(null,"El sueldo más alto fue de $"+sueldoMaximo);
    }
    
}
