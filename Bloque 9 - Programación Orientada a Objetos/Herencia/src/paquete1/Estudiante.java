
package paquete1;

public class Estudiante extends Persona{ //Extends hereda de Persona
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); //Atributos heredados
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+super.getNombre()+"\nApellido: "+super.getApellido()+"\n"
                + "Edad: "+super.getEdad()+"\nCodigo de estudiante: "+codigoEstudiante+"\n"
                        + "Nota Final: "+notaFinal);
    }
}
