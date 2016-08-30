package subrotinas;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Salario {
    double salario;
    Salario(double valor){
        salario = valor;
    }
    
    public double reajuste(){
        if(salario < 3000){
            salario = salario + (salario * 0.5);
            return salario;
        } else if(salario <= 1000){
             salario = salario + (salario * 0.2);
            return salario;
        }else {
            salario = salario + (salario * 0.15);
            return salario;
        }
    }
}
