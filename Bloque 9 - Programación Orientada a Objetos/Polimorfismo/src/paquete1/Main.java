/*
Polimorfismo: En una relación de tipo herencia, un objeto de la superclase
              puede almacenar un objeto de cualquiera de sus subclases.
 */
package paquete1;

public class Main {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HG", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45GH","Toyota", "KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "J18", "Toyota", "J9");
        
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        
    }
    
}
