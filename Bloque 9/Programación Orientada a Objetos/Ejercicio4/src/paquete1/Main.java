/*
Ejercicio 4: Construir un programa para una competencia de atletismo, 
             el programa debe gestionar una serie de atletas caracterizados 
             por su número de atleta, nombre y tiempo de carrera, al final el 
             programa debe mostrar los datos del atleta ganador de la carrera.
 */
package paquete1;

import java.util.Scanner;

public class Main {
    public static int indiceTiempo(Atleta at[]){
        int indice=0;
        float tiempo;
        
        tiempo = at[0].getTiempo();
        
        for (int i = 1; i < at.length; i++) {
            if(at[i].getTiempo()<tiempo){
                tiempo = at[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nAtletas, indiceAt;
        String nombre, numero;
        float tiempo;
        
        System.out.print("Ingresa el número de atletas en la competencia: ");
        nAtletas = entrada.nextInt();
        
        Atleta at[] = new Atleta[nAtletas]; //Arreglo con objetos de Atleta
        
        for (int i = 0; i < at.length; i++) {
            
            System.out.println("\nIngresa los datos del atleta "+(i+1)+":");
            entrada.nextLine();
            System.out.print("Número de atleta: ");
            numero = entrada.nextLine();

            System.out.print("Nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Tiempo del atleta: ");
            tiempo = entrada.nextFloat();
            
            at[i] = new Atleta(numero, nombre, tiempo);
        }
        
        indiceAt = indiceTiempo(at);
        
        System.out.println("\nLa información del atleta ganador es: ");
        System.out.println(at[indiceAt].mostrarDatos());
    }
    
}
