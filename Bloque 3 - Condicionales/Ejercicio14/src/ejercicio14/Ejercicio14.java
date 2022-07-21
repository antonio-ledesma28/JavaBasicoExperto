/*
Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa,
mostrar en pantalla un menú con las opciones posibles.
 */
package ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        float kg,medida;
        int opcion;
        
        kg=Float.parseFloat(JOptionPane.showInputDialog("Escribe los Kilogramos"
                + " que deseas convertir"));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escribe la unidad"
                + "de medida a la que deseas pasar los kilogramos\n"
                + "\n1. Hectogramos."
                + "\n2. Decagramos."
                + "\n3. Gramos."
                + "\n4. Centigramos."
                + "\n5. Miligramos"));
        medida=kg;
        switch(opcion){
            case 1:
                medida*=10;
                JOptionPane.showMessageDialog(null,"El valor de "+kg+" Kg "
                        + "es de "+medida+" Hectogramos");
                break;
            case 2:
                medida*=100;
                JOptionPane.showMessageDialog(null,"El valor de "+kg+" Kg "
                        + "es de "+medida+" Decagramos");
                break;
            case 3:
                medida*=1000;
                JOptionPane.showMessageDialog(null,"El valor de "+kg+" Kg "
                        + "es de "+medida+" Gramos");
                break;
            case 4:
                medida*=10000;
                JOptionPane.showMessageDialog(null,"El valor de "+kg+" Kg "
                        + "es de "+medida+" Centígramos");
                break;
            case 5:
                medida*=100000;
                JOptionPane.showMessageDialog(null,"El valor de "+kg+" Kg "
                        + "es de "+medida+" Miligramos");
                break;
            default:
                JOptionPane.showMessageDialog(null,"La opción tecleado no"
                        + " es válida");
                break;
                
        }
    }
    
}
