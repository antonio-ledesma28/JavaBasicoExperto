/*
Búsqueda: Binaria
*El elemento debe estar de manera ascendente
 */
package binaria;

import javax.swing.JOptionPane;

public class Binaria {

    public static void main(String[] args) {
        int arreglo[]={1,2,3,4,5};
        int dato, inferior, superior, mitad,i;
        boolean bandera= false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digita el número "
                + "a buscar"));
        
        //Búsqueda binaria
        inferior=0; superior=5; i=0;
        
        mitad = (inferior+superior)/2;
        while(inferior<=superior && i<5){
            if(arreglo[mitad]==dato){
                bandera = true;
                break;
            }
            if(arreglo[mitad] > dato){
                superior = mitad;
                mitad = (inferior + superior)/2;      
            }
            if(arreglo[mitad] < dato){
                inferior = mitad;
                mitad = (inferior + superior)/2;
            }
            i++;
        }
        
        if(bandera == true){
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado "
                    + "en la posición "+mitad);
        }
        else{
            JOptionPane.showMessageDialog(null, "El número no se encuentra "
                    + "en el arreglo");
        }
        
        
        
        
    }
    
}
