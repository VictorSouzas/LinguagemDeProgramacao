package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Fatorial {
    int numero;
    Fatorial(int valor){
        numero = valor;
    }
    public int calculo(){
        int soma = 0;
        for(int i = 1; i <= numero; i++){
            soma = soma + i;
        }
        return soma;
    }
}