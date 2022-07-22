/*
Bucle For each
 */
package foreach;

public class ForEach {

    public static void main(String[] args) {
        String nombres[]= {"Alejandro","Maria", "Luis", "Juan", "Narcisa","Luis",
        "Roberto","Flor","Jessica"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
            
        }
        System.out.println("");
        
        for (String i : nombres) { //for (Tipo de dato 'iterador': Nombre del arreglo
            System.out.println(i);
            
        }
    }
    
}
