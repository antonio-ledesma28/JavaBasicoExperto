
package paquete1;

public class Doctor extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Doctor(String titulacion, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void curarLesion(){
        System.out.println("Curar lesión");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Da asistencia en un partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencien en un entrenamiento");
    }
}
