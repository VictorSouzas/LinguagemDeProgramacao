
package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Positivo {
    int num;
    Positivo(int numero){
        num = numero;
    }
    public boolean check(){
        return num >= 0;
    }
}
