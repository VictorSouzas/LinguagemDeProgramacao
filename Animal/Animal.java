/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private int ano;

    public Animal(String nome, String raca, String cor, int ano) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }
    
    public String dados(){
        String retorno = "***********************************\n"
                + "Nome: " + this.nome +"\n"
                + "Raca: " + this.raca +"\n"
                + "Cor: " + this.cor +"\n"
                + "Ano de Nascimento: " + this.ano +"\n"
                + "***********************************\n";
        return retorno;
    }
    
    
}
