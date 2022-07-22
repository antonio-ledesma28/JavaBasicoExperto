/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
              Copiar (fusionar) las dos tablas en una tercera, de forma que 
              sigan ordenadas.
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[20];
        int creciente=0;
        
        
//Pedimos los valores del primer arreglo de manera ordenada
        do{
        System.out.println("Ingresa los diez valores del primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextInt();
        }
        //Comprobamos que estén ordenados
            for (int i = 0; i < 9; i++) {
                if(arreglo[i+1]==arreglo[i] || arreglo[i+1]>arreglo[i]){
                    creciente++;
                }
            }
            if(creciente!=9){
                System.out.println("\nLos valores no están ordenados de manera"
                        + "creciente.\nDigita nuevos valores.");
            }
        }while(creciente !=9);
        
        creciente=0;
//Pedimos los valores del segundo arreglo
        do{
        System.out.println("\nIngresa los diez valores del segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: "); 
            arreglo2[i]=entrada.nextInt();
        }
        //Comprobamos que estén ordenados
            for (int i = 0; i < 9; i++) {
                if(arreglo2[i+1]==arreglo2[i] || arreglo2[i+1]>arreglo2[i]){
                    creciente++;
                }
            }
            if(creciente!=9){
                System.out.println("\nLos valores no están ordenados de manera"
                        + "creciente.\nDigita nuevos valores.");
            }
        }while(creciente !=9);
        

//Combinamos las dos tablas en otra pero que siga estando de forma creciente
        int i=0,j=0,k=0; //Iterador para cada arreglo
        while(i<10 && j<10){
            if(arreglo[i]<arreglo2[j]){//Mientras que a sea menor que b
                arreglo3[k]=arreglo[i];//c es igual a a
                i++;                  //Iterador de a aumenta
            }
            else{                       //Por el contrario
                arreglo3[k]=arreglo2[j]; //c es igual a b
                j++;                    //Iterador de b aumenta
        }
            k++;    
        }
        //Cuando el while acabe, quiere decir que un arreglo ya se pasó por completo
        if(i==10){//Si se copiaron todos los valores de arreglo a
            while(j<10){//Copiamos todos los demás números del arreglo b
                arreglo3[k] = arreglo2[j];
                j++;
                k++;
            }
        }
        else{//Si se copiaron todos los números del arreglo b
            while(i<10){//Copiamos todos los demás números del arreglo a
                arreglo3[k] = arreglo[i]; 
                i++;
                k++;
            }
            
        }
        System.out.println("\nEl arreglo combinado es:");
        for (int m = 0; m < 20; m++) {
            if (m!=19){
            System.out.print(arreglo3[m]+" , ");
            }
            else{
                System.out.print(arreglo3[m]+".\n");
            }
        }
        
    }
    
}
