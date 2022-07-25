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

public class Paquete {
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatos(){
        return "El número de paquete es: "+numeroPaquete+"\n"
                + "El DNI es: "+dni+"\nEl peso del paquete es: "+peso+"\n"
                + "La prioridad del paquete es:"+prioridad;
    }
}
