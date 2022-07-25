
package paquete1;

public class Perro extends Animal{
    
  
    //Si quitamos el método y llamamos en el main al método saldrá lo que se 
    //encuentra en la clase Padre
    @Override
    public void comer(){
        System.out.println("Estoy comiendo con mi platito en el suelo");
    }
}
