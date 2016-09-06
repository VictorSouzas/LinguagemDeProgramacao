package natacao;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Aluno {

    protected String name;
    protected char sexo;
    protected double altura;
    protected double peso;
    protected int ano;

    public void setName(String nme) {
        name = nme;
    }

    public void setSexo(char s) {
        sexo = s;
    }

    public void setAltura(double alt) {
        altura = alt;
    }

    public void setpeso(double pes) {
        peso = pes;
    }

    public void setIdade(int an, int anoAtual) {
        ano = anoAtual - an;
    }

    protected double pesoIdeal() {
        double pesoIdeal;
        if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        return pesoIdeal;
    }

    public String relatorio() {
        String relatorio = "Nome :" + name + "\n"
                + "Sexo : " + sexo + "\n"
                + "Altura: " + altura + "\n"
                + "Peso: " + peso + "\n"
                + "Idade: " + ano + "\n"
                + "Peso Ideal:" + pesoIdeal() + "\n";
        return relatorio;
    }
}
