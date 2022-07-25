/*
Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo 
             el país. Cada sucursal está difinida por su número de sucursal,
             dirección y ciudad. Para calcular el precio que cuesta enviar 
             cada paquete, las sucursales tienen en cuenta el precio del
             paquete y la prioridad, sabiendo que se cobra un dólar por kilo,
             10 dólares más si la prioridad es alta y 20 si es express.
             Cada paquete enviado tendrá un número de referencia y el DNI de la
             persona que lo envía.
*/
package paquete1;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarResultados(){
        return "El número de sucursal es: "+numeroSucursal+"\n"
                + "La dirección de la sucursal es: "+direccion+"\n"
                + "La ciudad en la que se encuentra la sucursal es: "+ciudad;
    }
    
    public double calcularPrecio(Paquete t){
        double precio;
        precio = t.getPeso();
        if(t.getPrioridad()==1){
            precio += 10;
        }
        if(t.getPrioridad()==2){
            precio +=20;
        }
        return precio;
    }
}
