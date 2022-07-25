
package paquete1;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    
    
    public int getPuertas(){
        return nPuertas;
    }
    @Override
    public String mostrarDatos(){
        return "Matrícula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\n"
                + "Número de puertas: "+nPuertas;
    }
}
