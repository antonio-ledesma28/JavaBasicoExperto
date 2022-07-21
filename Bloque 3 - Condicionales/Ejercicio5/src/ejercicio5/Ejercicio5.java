/*
 Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene
de la siguiente manera:
-Si trabaja 40 horas o menos se le paga $16 por hora.
-Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
y $20 por cada hora extra.
 */
package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int numHoras,horasExtra,total;
        numHoras  =Integer.parseInt(JOptionPane.showInputDialog("Digita el número "
                + "de horas semanales que trabaja el obrero: "));
      if(numHoras<=40){
          total=numHoras*16;
      }
      else{
          horasExtra = numHoras-40;
          total= (40*16)+(horasExtra*20);
      }
        
        JOptionPane.showMessageDialog(null, "El sueldo total es de: "+total+" Dólares");
    }
    
}
