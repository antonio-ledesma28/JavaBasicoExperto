/*
Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, 
la media de los números negativos y la cantidad de ceros
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float mediaPositivos, mediaNegativos,sumaPositivos=0,sumaNegativos=0;
        int contadorPositivos=0,contadorNegativos=0, contadorCeros=0, num;
        
        System.out.println("Digita 10 números");
        for(int i =0;i<10;i++){
            System.out.print("Número "+(i+1)+": ");
            num=entrada.nextInt();
            
            if(num>0){
                contadorPositivos++;
                sumaPositivos+=num;
            }
            else if(num<0){
                contadorNegativos++;
                sumaNegativos+=num;
            }
            else{
                contadorCeros++;
            }
        }
        
        if(contadorPositivos!=0){
        mediaPositivos=sumaPositivos/contadorPositivos;
            System.out.println("La media de los números positivos es: "+mediaPositivos);
        }
        else{
            System.out.println("Los hay números positivos, por lo cual, no hay media");
        }
        if(contadorNegativos!=0){
        mediaNegativos=sumaNegativos/contadorNegativos;
        System.out.println("La media de los números positivos es: "+mediaNegativos);
        }
        else{
           System.out.println("Los hay números negativos, por lo cual, no hay media"); 
        }
        System.out.println("La cantidad de ceros es de: "+contadorCeros);
        
    }
    
}
