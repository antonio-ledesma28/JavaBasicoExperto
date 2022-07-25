
package ClasesYObjetos;

public class Main {
    public static void main(String[] args) {
        //Creación de un objeto de la clase Operación
        Operacion op = new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
