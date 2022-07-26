package paquete1;

public class Compañia {

    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo = 0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Vuelo v[]) {
        this.nombre = nombre;
        listaVuelos = v;
        numVuelo = v.length;
    }

    public void insertarVuelo(Vuelo vuelo) {
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo (int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String identificador){
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null;
        
        while((!encontrado) && (i<listaVuelos.length)){
            if(identificador.equals(listaVuelos[i].getIdentificador())){
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }

}
