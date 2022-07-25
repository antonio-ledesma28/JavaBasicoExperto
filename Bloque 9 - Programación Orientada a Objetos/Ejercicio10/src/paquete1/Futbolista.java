
package paquete1;

public class Futbolista extends Persona{
    private int dorsal;
    private String posición;

    public Futbolista(int dorsal, String posición, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posición = posición;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega el partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Entrena");
    }
}
