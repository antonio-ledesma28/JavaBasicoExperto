/*
 Búsqueda: Secuencial

arreglo[] = {3,1,5,4,2}; dato =2;
*No importa que el arreglo esté desordenado
 */
package secuencial;

import javax.swing.JOptionPane;

public class Secuencial {

    public static void main(String[] args) {
        int arreglo[]={4,1,5,2,3};
        int dato;
        boolean band=false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a "
                + "buscar:"));
        
        //Búsqueda secuencial
        int i=0;
        while(i<5 && band==false){
            if(arreglo[i]==dato){
                band = true;
            }
            i++;       
        }
        
        if(band == false){
            JOptionPane.showMessageDialog(null,"No encontramos el valor digitado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado"
                    + " en la posición "+(i-1));
        }
            
    }
    
}
