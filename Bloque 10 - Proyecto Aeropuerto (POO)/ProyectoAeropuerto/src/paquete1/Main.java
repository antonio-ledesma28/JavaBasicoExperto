/*
PROYECTO AEROPUERTO

Diseñar y codificar una aplicación informática para una compañí de gestión
aeroportaria satisfaciendo los siguientes requisitos:

    -Para cada aeropuerto es necesario saber:
        a) Todas las compañías de vuelo que operan en él.
        b) El nombre del aeropuerto, la ciudad donde se ubica y el país al que 
           pertenece.
    
    -Cada compañía se caracteriza por el nombre y la lista de vuelos que ofrece.
    
    -Los vuelos están definidos por su identificador, la ciudad de origen, la 
     ciudad de destino, el precio del viaje, la lista de pasajeros, el número 
     máximo de pasajeros permitidos en el vuelo y el número real de pasajeros 
     que ha reservado asiento en el avión.
    
    -Los aeropuertos pueden ser privados o públicos.
        a) Los aeropuertos tienen una serie de empresas que los patrocinan y
           es necesario saber el nombre de cada una de esas empresas.
        b) Para los aeropuertos públicos se requiere saber la cantidad de dinero
           correspondiente a la subvención gubernamental.
     
    -Se necesita gestionar tanbién la información de los pasajeros.
        a) Para cada pasajero se necesita saber nombre, número de pasaporte
           y nacionalidad.


La aplicación tendrá un menú con las siguientes opciones:

1) Consultar los aeropuertos gestionados, indicando separadamente los 
   aeropuertos públicos y los privados. Para cada uno de ellos deberá mostrar
   su nombre, la ciudad de ubicación, y el país al que pertenece.

2) Visualizar las empresas que patrocinan un determinado aeropuerto en caso
   que sea privado, o la cuantia de la subvención en caso de que se trate de
   un aeropuerto público.

3) Para un determinado aeropuerto, se debe poder mostrar la lista de compañías
   que vuelan desde ese aeropuerto.

4) Para una determinada compañía que opera en un aeropuerto concreto, listar
   todos los posibles vuelos que dicha compañía ofrece, mostrando su
   identificador, la ciudad de origen y destino y el precio del vuelo.

5) Mostrar todos los posibles vuelos(identificador) que parten de una ciudad
   origen a otra ciudad destino(indicadas por el usuario) y mostrar el precio.
 */
package paquete1;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    public static int num = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];

    public static void main(String[] args) {
        //Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }

    public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
        aero[0] = new AeropuertoPublico(80000000, "Jorge Chávez", "Lima", "Perú");
        aero[0].insertarCompañia(new Compañia("AeroPerú"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB20", "Lima", "México", 150.90, 150));
        aero[0].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
        aero[0].getCompañia("AeroPerú").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP", "Peruana"));
        aero[0].getCompañia("AeroPerú").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raúl", "JH21KL", "Peruana"));

        aero[1] = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        String empresas[] = {"Cobreso1", "Aguila34"};
        ((AeropuertoPrivado) aero[1]).insertarEmpresas(empresas);
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("Ae025", "Madrid", "Buenos Aires", 400, 50));
        aero[1].getCompañia("AirEuropa").getVuelo("AEO25").insertarPasajero(new Pasajero("Antonio", "316138408", "Mexicana"));

        aero[2] = new AeropuertoPublico(200000000, "Aeropuerto Bogotá", "Bogotá", "Colombia");
        aero[2].insertarCompañia(new Compañia("AirAmerica"));
        aero[2].insertarCompañia(new Compañia("VuelaBogota"));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogota", "México", 200.80, 150));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogota", "Buenos Aires", 180.70, 120));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Diana", "40050", "Mexicana"));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Argenis", "LKJ28", "Argentina"));

        aero[3] = new AeropuertoPublico(40000000, "Benito Juárez", "México", "México");
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB2040", "Mexico", "Toronto", 231.50, 120));
        aero[3].getCompañia("AeroPerú").insertarVuelo(new Vuelo("IB2142", "Mexico", "Lima", 150, 110));
        aero[3].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Octavio", "JBO25", "Mexicana"));
    }

    public static void menu() {
        Aeropuerto aeropuerto;
        String nombreAeropuerto, nombreCompañia, origen, destino;
        int opcion;
        Compañia compañia;
        do {
            System.out.println("\t.:MENÚ:.\n"
                    + "1. Ver aeropuerto gestionados (públicos o privados)\n"
                    + "2. Ver empresas(privadas) o subvenciones(públicas)\n"
                    + "3. Listas compañías de un Aeropuerto\n"
                    + "4. Lista de vuelos por compañía\n"
                    + "5. Lista posibles vuelos de origen a destino\n");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: //Ver aeropuerto gestionados (públicos o privados)
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2: // Ver empresas(privadas) o subvenciones(públicas)
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3: // 3. Listas compañías de un Aeropuerto
                    System.out.print("\nDigite el nombre del Aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);

                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        mostrarCompañías(aeropuerto);
                    }
                    break;
                case 4: //Lista de vuelos por compañía
                    entrada.nextLine();
                    System.out.println("\nDigite el nombre de un aeropuerto");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        System.out.println("Digite el nombre de la compañía: ");
                        nombreCompañia = entrada.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostrarVuelos(compañia);
                    }
                    break;
                case 5: //Lista posibles vuelos de origen a destino
                    entrada.nextLine();
                    System.out.print("\nDigite la ciudad de origen: ");
                    origen = entrada.nextLine();
                    System.out.print("Digite la ciudad destino: ");
                    destino = entrada.nextLine();
                    mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                    
                    break;
                case 6:
                    System.out.println("Se equivocó de opción de menú");
                    break;
                default:
                    break;

            }
        } while (opcion != 6);
    }

    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("País: " + aeropuertos[i].getPais());
            } else {
                System.out.println("Aeropuerto Público");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("País: " + aeropuertos[i].getPais());
            }
            System.out.println("");

        }

    }

    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
        String empresas[];
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuero Privado: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas:");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Público: " + aeropuertos[i].getNombre());
                System.out.println("Subvención: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        while ((!encontrado) && (i < aeropuertos.length)) {
            if (nombre.equals(aeropuertos[i].getNombre())) {
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }

    public static void mostrarCompañías(Aeropuerto aeropuerto) {
        System.out.println("La compañías del aeropuerto: " + aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumCompañia(); i++) {
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }

    public static void mostrarVuelos(Compañia compañia) {
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañía: " + compañia.getNombre());
        for (int i = 0; i < compañia.getNumVuelo(); i++) {
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificaor: " + vuelo.getIdentificador());
            System.out.println("Ciudad Origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: " + vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuerto[]){
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        for (int i = 0; i < aeropuertos.length; i++) { //Recorremos los aeropuertos
            for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) { //Recorremos las compañías
                for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //Recorremos los vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                    }
                }
            }
        }
        listaVuelos = new Vuelo[contador];
        int q=0;
        
         for (int i = 0; i < aeropuertos.length; i++) { //Recorremos los aeropuertos
            for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) { //Recorremos las compañías
                for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //Recorremos los vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaVuelos;
                
    }
    
    public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if(vuelos.length == 0){
            System.out.println("No existen vuelos de esa ciudad Origen a destino");
        }
        else{
            System.out.println("Vuelos encontrados");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("Identificador de vuelo: "+vuelos[i].getIdentificador());
                System.out.println("Ciudad origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: $"+vuelos[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
