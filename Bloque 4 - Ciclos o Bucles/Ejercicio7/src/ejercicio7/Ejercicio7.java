/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular
la media.
 */
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
        int num,suma=0,cont=0;
        float media;
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un"
                    + " número positivo o 0:"));
            
            while(num>=1){
              System.out.println("El número digitado es: "+num);
            suma+=num;
            cont++;  
            num = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro"
                    + " número positivo o 0:"));
            }
            if(cont==0){
                System.out.println("No podemos sacar la media ya que no"
                        + " introdujiste ningún valor indicado en el menú");
                
            }else{
                media=suma/cont;
                JOptionPane.showMessageDialog(null,"La media de los "+cont+" números "
                + "digitados es: "+media);
            }
            
    }
    
}
