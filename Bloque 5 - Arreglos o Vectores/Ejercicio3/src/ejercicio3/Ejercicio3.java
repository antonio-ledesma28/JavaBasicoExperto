/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y
a continuación realizar la medida de los números positivos, la media de
los negativos y contar el número de ceros.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglo[]=new float[5];
        float sumaPos=0,sumaNeg=0,mediaPos,mediaNeg;
        int contPos=0,contNeg=0,contCeros=0;
        
        System.out.println("Digita 5 números");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextFloat();
            
            if(arreglo[i]==0){
                contCeros++;
            }
            else if(arreglo[i]>0){
                sumaPos+=arreglo[i];
                contPos++;
            }
            else{
                sumaNeg+=arreglo[i];
                contNeg++;
            }
        }
        System.out.println("");
        if(contPos==0){
            System.out.println("No se puede realizar la media de los números positivos.\n"
                    + "Ya que no ingresaste números positivos ");
        }
        else{
            mediaPos=(float)(sumaPos/contPos);
            System.out.println("La media de los números positivos es: "+mediaPos);
        }
        if(contNeg==0){
            System.out.println("No se puede realizar la media de los números negativos.\n"
                    + "Ya que no ingresaste números positivos ");
        }
        else{
           mediaNeg=(float)(sumaNeg/contNeg); 
           System.out.println("La media de los números negativos es: "+mediaNeg);
        }
        System.out.println("La cantidad de ceros introducidos es de: "+contCeros);
        
    }
    
}
