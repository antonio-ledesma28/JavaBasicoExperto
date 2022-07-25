
package Paquete1;

public class Principal {
    public static void main(String args[]){
        Persona persona1 = new Persona(20, "Antonio");
        
        persona1.mostrarDatos();
        persona1.setEdad(21);
        persona1.mostrarDatos();
    }
}
