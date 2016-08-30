package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Imc {
    double weight, height;
    Imc(double peso, double altura){
        weight = peso;
        height = altura;
    }
    
    public double calculo(){
        double imc = weight / (height*height);
        return imc;
    }
}
