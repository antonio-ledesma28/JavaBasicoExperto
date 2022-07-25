/*
Ejercicio 4: Construir un programa para una competencia de atletismo, 
             el programa debe gestionar una serie de atletas caracterizados 
             por su número de atleta, nombre y tiempo de carrera, al final el 
             programa debe mostrar los datos del atleta ganador de la carrera.
 */
package paquete1;

public class Atleta {
    private String numeroAtleta;
    private String nombre;
    private float tiempo;

    public Atleta(String numeroAtleta, String nombre, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }
    public String mostrarDatos(){
        return "Número de Atleta: "+numeroAtleta+"\nNombre del atleta: "+nombre
                + "\nTiempo del atleta: "+tiempo;
        
    }
    
    
}
