
package paquete1;

public class Persona extends Animal{
    
    @Override  //Sobre escribiendo el método comer
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
