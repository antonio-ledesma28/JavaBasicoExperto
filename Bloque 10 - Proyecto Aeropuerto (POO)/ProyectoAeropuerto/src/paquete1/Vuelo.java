package paquete1;

public class Vuelo {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaximoPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaximoPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaximoPasajeros = numMaximoPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaximoPasajeros];
    }

    public void insertarPasajero(Pasajero pasajero) {
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaximoPasajeros() {
        return numMaximoPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public Pasajero getPasajero(int i) {
        return listaPasajeros[i];
    }
    
    public Pasajero getPasajero(String pasaporte) {
        boolean encontrado = false;
        int i=0;
        Pasajero pas = null;
        while((encontrado ==false) &&(i<listaPasajeros.length)){
            if(pasaporte== listaPasajeros[i].getPasaporte()){
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
            
    }

}
