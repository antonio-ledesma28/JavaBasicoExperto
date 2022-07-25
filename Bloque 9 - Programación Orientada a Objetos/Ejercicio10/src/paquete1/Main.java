/*
Ejercicio 10: Crear un programa para simular un equipo de futbol 
(futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:
    
    *Una super clase Persona, que tendrá los siguientes datos: nombre, 
    apellido, edad.
    *La sub clase Futbolista tendrá los siguientes datos: dorsal y posición.
    *La sub clase Entrenador tendrá de dato la estrategia que utiliza.
    *La sub clase Doctor, la titulación y los años de experiencia.

Hacer un menú donde se tengan las siguientes opciones:

    *Viaje de equipo
    *Entrenamiento
    *Partido de futbol
    *Planificar entrenamiento
    *Entrevista
    *Curar lesión
*/
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    
    static Persona futbolista1 = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 29);
    static Persona futbolista2 = new Futbolista(21, "Delantero", "Paulo", "Dybala", 23);
    static Persona entrenador = new Entrenador("Defensiva", "Massimiliano", "Allegri", 49);
    static Doctor doctor = new Doctor("Licenciado en fisioterapia", 
                           20, "Alex", "Marroni", 55);
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(doctor);
        
        menu();
    }
    
    public static void menu(){
        int opcion;
        do{
            System.out.println("");
            System.out.println("\t.:MENÚ:.");
            System.out.println("1. Viaje de equipo\n2. Entrenamiento"
                    + "\n3. Partido de futbol\n4. Planificar entrenamiento\n"
                    + "5. Entrevista\n6. Curar lesión\n7. Salir ");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: //Viaje de equipo
                    System.out.println("");
                    viajarEquipo();
                    break;
                case 2: //Entrenamiento
                    System.out.println("");
                    entrenarEquipo();
                    break;
                case 3: //Partido de futbol
                    System.out.println("");
                    partidoFutbol();
                    break;
                case 4:  //Planificar entrenamiento
                    System.out.println("");
                    planificarEntrenamiento();
                    break;
                case 5:  //Entrevista
                    System.out.println("");
                    darEntrevista();
                    break;
                case 6:  //Curar lesión
                    curarLesion();
                    break;
                case 7:  //Salir
                    break;
                default: 
                    System.out.println("Error. Se equivocó de opción de menú");
            }
        }while(opcion!=7);
    }
    public static void viajarEquipo(){
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.viajar();   
        }
    }
    public static void entrenarEquipo(){
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.entrenamiento();
        }
    }
    public static void partidoFutbol(){
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.partidoFutbol();
        }
    }
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" ->");
        Entrenador ent = (Entrenador) entrenador;
        ent.planificarEntrenamiento();    
    }
    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" ->"); 
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" ->"); 
        ((Futbolista)futbolista2).entrevista();
    }
    public static void curarLesion(){
        System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" ->"); 
        ((Doctor)doctor).curarLesion();
    }
    
}
