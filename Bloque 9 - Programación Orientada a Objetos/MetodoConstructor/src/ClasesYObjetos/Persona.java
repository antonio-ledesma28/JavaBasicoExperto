
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Método
    
    //Método constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad; 
    }
    
    //Método para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
