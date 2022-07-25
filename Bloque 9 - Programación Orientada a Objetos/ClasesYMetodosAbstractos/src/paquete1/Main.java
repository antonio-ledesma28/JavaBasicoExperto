
/*
*Clase y métodos abstractos

    -Se utilizan solo como super clases.
    -No se pueden instanciar objetos.
    -Sirve para proporcionar una super clase apropiada a partir de la cuál
     heredan otras clases.

     Los métodos abstractos se encuentran en las clases padres pero no se implementa
     public void abstract alimentarse();
     Se debe implementar el la clase hija y al ser un método abstracto, la clase
     se vuelve abstracta.
*/
package paquete1;

public class Main {

    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalc = new AnimalCarnivoro();
        
        planta.alimentarse();
        animalc.alimentarse();
    }
    
}
