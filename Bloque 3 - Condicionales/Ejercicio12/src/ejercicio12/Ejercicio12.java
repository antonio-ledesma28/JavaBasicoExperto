/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
Suficiente, Bien, Notable y Sobresaliente.
 */
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu nota: "));
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null,"La nota es Insuficiente: "+nota);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La nota es Suficiente: "+nota);
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"La nota es Buena: "+nota);
                break;
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null,"La nota es Sobresaliente: "+nota);
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"La nota es Sobresaliente: "+nota);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Nota fuera de rango. Inválida");
        }
    }
    
}
