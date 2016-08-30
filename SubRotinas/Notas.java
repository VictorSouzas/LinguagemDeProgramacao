package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Notas {

    double um, dois, tres;

    Notas(double primeiro, double segundo, double terceiro) {
        um = primeiro;
        dois = segundo;
        tres = terceiro;
    }

    public double aritimetica() {
        double arit = (um + dois + tres) / 3;
        return arit;
    }
    
    public double ponderada(){
        double pond = (um*5+dois*3+tres*2) / (3+2+5);
        return pond;
    }
}
