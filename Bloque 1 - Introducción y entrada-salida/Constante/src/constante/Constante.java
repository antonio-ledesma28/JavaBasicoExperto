
package constante;

public class Constante {

    public static void main(String[] args) {
        //Espacio en memoria que no combiará a lo largo del programa
        final int numero = 10; //Número tiene el valor de 10 constante
        
       /* 
            numero = 12; No se puede ya que es una constante
       */
        System.out.println("El número es: "+numero);
    }
    
}
