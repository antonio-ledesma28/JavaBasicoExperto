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

import java.util.Scanner;

public class Main {
    public static int buscarPaquete(Paquete t[],int numeroPaquete,int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < contadorPaquete; i++) {
            if(t[i].getNumeroPaquete() == numeroPaquete){
                encontrado = true;
                indice = i;              
            }        
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    
    public static int buscarSucursal(Sucursal t[],int numeroSucursal,int contadorSucursal){
        int indice = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < contadorSucursal; i++) {
            if(t[i].getNumeroSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;              
            }        
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroPaquete,prioridad,numeroSucursal, opcion;
        int contadorSucursal=0,contadoPaquete=0, indiceSucursal, indicePaquete;
        String dni,direccion,ciudad;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        
        do{
            System.out.println("\t.:MENÚ:.\n"
                    + "1. Crear una nueva sucursal\n"
                    + "2. Enviar paquete\n"
                    + "3. Consultar sucursal\n"
                    + "4. Consultar paquete\n"
                    + "5. Mostrar todas las sucursales\n"
                    + "6. Mostrar todos los paquetes\n"
                    + "7. Salir");
            System.out.print("\nDigite la opción de menú: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Digite el número de sucursal: ");
                    numeroSucursal=entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite la dirección: ");
                    direccion = entrada.nextLine();
                    System.out.print("Digite la ciudad: ");
                    ciudad = entrada.nextLine();
                    
                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursal++;
                    
                case 2:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    
                    if(indiceSucursal == -1){
                        System.out.println("La sucursal no existe");
                    }
                    else{
                        System.out.print("\nDigite el número del paquete: ");
                        numeroPaquete = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Digite el DNI de la persona que "
                                + "envía el paquete: ");
                        dni = entrada.nextLine();
                        System.out.print("Digite el peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.print("Digite la prioridad(0:normal, 1:alta, 2: express):  ");
                        prioridad = entrada.nextInt();
                        
                        paquete[contadoPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                       
                        precioPaquete = sucursal[indiceSucursal]
                                .calcularPrecio(paquete[contadoPaquete]);
                       
                        System.out.println("\nEl precio es: "+precioPaquete);
                        contadoPaquete++;
                    }
                    break;
                
                case 3:
                    System.out.print("Digite el número de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    
                    if(indiceSucursal == -1){
                        System.out.println("\nLa sucursal no existe");
                    }
                    else{
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarResultados());                       
                    }
                    break;
                case 4:
                    System.out.print("\nDigite el número de paquete: ");
                    numeroPaquete = entrada.nextInt();
                    
                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadoPaquete);
                    
                    if(indicePaquete==-1){
                        System.out.println("El paquete no existe");
                    }
                    else{
                        System.out.println("Los datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatos());
                    }
                    break;
                    
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nLos datos de la sucursal "+(i+1)+" son: ");
                        System.out.println(sucursal[i].mostrarResultados());
                
                    }
                    break;
                case 6:
                    for (int i = 0; i < contadoPaquete; i++) {
                        System.out.println("\nLos datos del paquete "+(i+1)+" son: ");
                        System.out.println(paquete[i].mostrarDatos());
                    }
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa");
                    break;
                default: 
                    System.out.println("Error, opcipon de menú incorrecta");
                    break;
            }
            System.out.println("");
        }while(opcion!=7);
        
        
    
    }
}
