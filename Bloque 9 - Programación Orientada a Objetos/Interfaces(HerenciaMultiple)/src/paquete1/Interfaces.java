/*
Herencia múltiple: Hace referencia a la característica de los lenguajes de
                   programación orientados a objetos en la que una clase puede 
                   heredar atributos y métodos de más de una superclase.

                   *Permite simular la herencia múltiple.
                   *La interfaz solo es public o default.
                   *Todos sus métodos son abstractos.
                   *Todos sus atributos son final.
 */
package paquete1;

public class Interfaces {

    public static void main(String[] args) {
        MusicoEstudiante mE = new MusicoEstudiante();
        mE.hablar();
        mE.tocarMusica();
        mE.estudiar();
        
    }
    
}
