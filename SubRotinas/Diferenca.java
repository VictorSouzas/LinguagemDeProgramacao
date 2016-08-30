package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Diferenca {
    int um, dois;
    Diferenca(int primeiro, int segundo){
        um = primeiro;
        dois = segundo;
    }
    public int calculo(){
        int resultado;
        if(um > dois){
            resultado = um - dois;
        }else {
            resultado = dois - um;
        }
        return resultado;
    }
}
