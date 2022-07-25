
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    //Método constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String dni){
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy "
                + "corriendo una maratón");
    }
    public void correr(int km){
        System.out.println("He corrido "+km+" kilómetros");
    }
    
}
