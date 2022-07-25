
/*
Ir a la jerarquía de clases hacia abajo
*/
package paquete1;

public class Main {

    public static void main(String[] args) {
        
        //Polimorfismo aplicando upcasting
        Vehiculo vehiculo = new VehiculoTurismo(4, "GT67", "Ferrari", "A89");
        
        //Hacemos un lowcasting tranformándolo en un objeto de la clase vehiculo
        
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;
        System.out.println(nuevoVehiculo);
        
        
        //UPCASTING
        Vehiculo vehiculo1 = new VehiculoDeportivo(500, "GH89", "Audi", "HI9");
        
        //LOWCASTING
        VehiculoDeportivo nuevoVehiculo1 = (VehiculoDeportivo)vehiculo1;
        
        System.out.println(nuevoVehiculo1);
    }
    
}
