
package Paquete1;

public class Persona {
    private int edad;
    private final String nombre;
    
    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
        
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
