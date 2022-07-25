/*
Ejercicio 3: Construir un programa que dada una serie de vehículos 
             caracterizados por su marca, modelo y precio, imprima las
             propiedades del vehículo más barato. Para ello, se deberán
             leer por teclado las características de cada vehículo y crear una 
             clase que represente a cada uno de ellos.
 */
package paquete2;

public class Vehiculo {
    private String modelo;
    private String marca;
    private float precio;

    public Vehiculo(String modelo, String marca, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
    }
}
