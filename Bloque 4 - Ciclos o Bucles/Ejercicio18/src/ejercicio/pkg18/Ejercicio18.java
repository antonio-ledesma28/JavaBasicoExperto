/*
Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no 
se introduce el precio por litro. Solo existen tres productos con precios:
1. $0,6/litro
2. $3, litro
3. $1.25, litro
 */
package ejercicio.pkg18;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args) {
        int codigo, litros,litrosArticulo1=0,conteoMayor600=0;
        float precioLitro=0,importeFactura,facturacionTotal=0;
        for (int i = 1; i <= 5; i++) {
            do{
              codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N "+
                     i+" \nDigite el código del artículo"));  
            }while(codigo<1 || codigo>3);
            
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N "+
                     i+" \nDigite la cantidad de litros del artículo"));
            
           switch(codigo){
               case 1: precioLitro=0.6f;
                       break;
                       case 2: precioLitro=3f;
                       break;
                       case 3: precioLitro=1.25f;
                       break;
                       
           }
           importeFactura=(float)litros*precioLitro;
           facturacionTotal+= importeFactura;
           
           if(codigo == 1){
               litrosArticulo1+= litros;
           }
           if(importeFactura>600){
               conteoMayor600++;
           }
           
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturación total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas  mayores a $600: "+conteoMayor600);
    }
    
}

