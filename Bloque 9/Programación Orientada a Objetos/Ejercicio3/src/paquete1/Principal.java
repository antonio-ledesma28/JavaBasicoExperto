/*
Ejercicio 3: Construir un programa que dada una serie de vehículos 
             caracterizados por su marca, modelo y precio, imprima las
             propiedades del vehículo más barato. Para ello, se deberán
             leer por teclado las características de cada vehículo y crear una 
             clase que represente a cada uno de ellos.
 */
package paquete1;

import java.util.Scanner;

public class Principal {
    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio()<precio) {
                precio = coches[i].getPrecio();
                indice=i;  
            }
            
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int nVehiculos, indiceBarato;
        
        System.out.print("Digite la cantidad de vehículos: ");
        nVehiculos = input.nextInt();
        
        //Se crea el número de objetos que el usuario ha digitado
        Vehiculo coches[]= new Vehiculo[nVehiculos];
        
        //Se piden los datos de todos los vehiculos
        for (int i = 0; i < coches.length; i++) {
            input.nextLine();
            System.out.println("\nDigite las características del coche "+(i+1)+":");
            System.out.print("Introduzca marca: ");
            marca = input.nextLine();
            System.out.print("Introduzca el modelo del coche: ");
            modelo = input.nextLine();
            System.out.print("Introduzca el precio del coche:");
            precio = input.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
            
        }
        
        //Hallar el coche más barato
        indiceBarato = indiceCocheBarato(coches);
        System.out.println("El coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
}
