
package paquete1;

public class Entrenador extends Persona{
    private String Estrategia;

    public Entrenador(String Estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.Estrategia = Estrategia;
    }

    public String getEstrategia() {
        return Estrategia;
    }

    public void setEstrategia(String Estrategia) {
        this.Estrategia = Estrategia;
    }
    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un partido de Futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }
    
}
