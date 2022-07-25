
package paquete1;

public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\n"
                + "Carga: "+carga;
    }
}
