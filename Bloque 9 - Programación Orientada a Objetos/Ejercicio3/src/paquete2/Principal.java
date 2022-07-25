/*
Ejercicio 3: Construir un programa que dada una serie de vehículos 
             caracterizados por su marca, modelo y precio, imprima las
             propiedades del vehículo más barato. Para ello, se deberán
             leer por teclado las características de cada vehículo y crear una 
             clase que represente a cada uno de ellos.
 */
package paquete2;

import java.util.Scanner;



public class Principal {
   public static int indiceBarato(Vehiculo coches[]){ //Se le pasa un arreglo de objetos de la clase Vehiculos
       float precio;
       int indice=0;
       
       precio = coches[0].getPrecio();
       for (int i = 1; i < coches.length; i++) {
           if(coches[i].getPrecio()<precio){
               precio = coches[i].getPrecio();
               indice = i;
           }
       
       }
       return indice;
   }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int nAutos, indiceBarato;
        
        System.out.print("Ingresa la cantidad de autos: ");
        nAutos = entrada.nextInt();
        
        //Arreglo de objetos digitados por el usuario
        Vehiculo coche[]=new Vehiculo[nAutos];

        for (int i = 0; i < coche.length; i++) {
            entrada.nextLine();
            System.out.print("Ingresa la marca del auto "+(i+1)+": ");
            marca = entrada.nextLine();
            System.out.print("Ingresa el modelo del auto "+(i+1)+": ");
            modelo = entrada.nextLine();
            System.out.print("Ingresa el precio del auto "+(i+1)+": ");
            precio = entrada.nextFloat();
            
            coche[i] = new Vehiculo(modelo, marca, precio);
        }
        
        //Hallar el coche más barato
        indiceBarato = indiceBarato(coche);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coche[indiceBarato].mostrarDatos());
        
    }
    
}
