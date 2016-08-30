
package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Horas {
    int segundos;
    Horas(int sec){
        segundos = sec;
    }
    
    public String conversao(){
        int horas = segundos / 3600;
        segundos = (segundos - horas * 3600);
        int minutos = segundos / 60;
        segundos = (segundos - minutos * 60);
        return horas+":"+minutos+":"+segundos;
    }
    
}
