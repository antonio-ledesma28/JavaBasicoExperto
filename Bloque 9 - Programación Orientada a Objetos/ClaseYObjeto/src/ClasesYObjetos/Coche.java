/*
Clases y Objetos
 */
package ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Método main
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.km);
        
        Coche coche2 = new Coche();
        
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("\nEl color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.km);
    }
}
