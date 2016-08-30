
package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class MaiorMenor {
    int first, second;
    MaiorMenor(int primeiro, int segundo){
        first = primeiro;
        second = segundo;
    }
    public int check(){
        if(first > second){
            return first;
        }else if (first == second){
            return 0;
        }else {
            return second;
        }
    }
    
}
