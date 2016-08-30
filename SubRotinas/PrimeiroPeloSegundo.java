
package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class PrimeiroPeloSegundo {
    int primeiro, segundo;
    PrimeiroPeloSegundo(int um, int dois){
        primeiro = um;
        segundo = dois;
    }
    
    public String calculo(){
        if((primeiro % segundo) == 0){
            return "0";
        }else{
            while(!((primeiro % segundo) == 0)){
                primeiro++;
            }
            return "o proximo divisor é "+primeiro;
        }
    }
}
