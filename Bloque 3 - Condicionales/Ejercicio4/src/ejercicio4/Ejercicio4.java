/*
 Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya compra
supere los $300. ¿Cuál será la cantidad que pagará una persona por su compra?
 */
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        float compra,descuento, total;
        compra =Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad "
                + "de su compra: "));
        if(compra>300){
            descuento=compra*0.20f;
            compra-=descuento;
                        
        }
    JOptionPane.showMessageDialog(null, "La cantidad a pagar es de: "+compra);
    }
    
    
}
