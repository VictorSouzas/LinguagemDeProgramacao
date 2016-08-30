package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Divisivel {
    int a ,b,c;
    Divisivel(int primeiro, int segundo, int terceiro){
        a = primeiro;
        b = segundo;
        c = terceiro;
    }
    
   public int calculo(){
       int maior, menor, soma;
       soma = 0;
       if(b > c){
           maior = b;
           menor = c;
       } else {
           maior = c;
           menor = b;
       }
       for(; menor <= maior; menor++){
           if ((menor % a) == 0){
               soma= soma + menor;
           }
       }
       return soma;
   }
    
}
