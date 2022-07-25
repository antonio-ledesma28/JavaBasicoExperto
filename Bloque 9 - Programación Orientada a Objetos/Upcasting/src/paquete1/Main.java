/*
Convertir un objeto de la clase hija a uno de la clase madre
*/
package paquete1;

public class Main {
        
    public static void main(String[] args) {
        VehiculoTurismo miVehiculo = new VehiculoTurismo(4, "GT67", "Ferrari", "A89");
        //Referencia del objeto         //Instanciación del objeto
        
        //Upcasting
        //Se guarda objeto de la subclase en la superclase
        Vehiculo vehiculo = miVehiculo;
        
        //Es igual a
        //Vehiculo vehiculo = new VehiculoTurismo(4, "GT67", "Ferrari", "A89"); 
        
    }
    
}
