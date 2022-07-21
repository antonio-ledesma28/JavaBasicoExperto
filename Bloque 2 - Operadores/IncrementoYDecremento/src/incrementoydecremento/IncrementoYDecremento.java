
package incrementoydecremento;

public class IncrementoYDecremento {

    public static void main(String[] args) {
        int x = 5,y;
        
 /*       //Incremento
        x++; // x= x+1;
        
        //Decremento
        x--; // x= x-1;
*/
          y = x++; //y vale cinco y después se le suma 1 a x
          y = ++x; //y vale 6 porque el ++ está por delante
          y = x--; //y vale 5 y después se le resta 1 a x
          y= --x; //y vale 6 porque el -- está por delante
        System.out.println(y);
        System.out.println(x);
        
        

    }
    
}
