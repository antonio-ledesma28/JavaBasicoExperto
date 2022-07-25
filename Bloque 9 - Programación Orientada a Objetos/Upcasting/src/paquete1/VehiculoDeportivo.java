
package paquete1;

public class VehiculoDeportivo extends Vehiculo{
    
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos(){
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\n"
                + "Cilindrada: "+cilindrada;
    }
    
    
    
}

