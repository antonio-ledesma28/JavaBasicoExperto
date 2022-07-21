/*
 Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es
correcta. Suponiendo que todos los meses son de 30 días.
 */
package ejercicio9;

import javax.swing.JOptionPane;

public class EJercicio9 {

    public static void main(String[] args) {
        int dia,mes,año;
        JOptionPane.showMessageDialog(null, "Escribe una fecha: ");
        dia= Integer.parseInt(JOptionPane.showInputDialog("Día: "));
        mes= Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
        año= Integer.parseInt(JOptionPane.showInputDialog("Año: "));
        if(año !=0){
            if(mes>0 && mes<=12){
                if(dia>0 && dia<=30){
                    JOptionPane.showMessageDialog(null, "Fecha válida: "
                            + "\nDía: "+dia+" Mes: "+mes+" Año: "+año);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Día no válido");
                }
                
            }
            else{
              JOptionPane.showMessageDialog(null, "Més no válido");  
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Año no válido");
        }
    }
    
}
