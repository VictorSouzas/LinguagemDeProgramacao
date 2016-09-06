package natacao;

import java.util.Scanner;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class Natacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre o nome do Aluno:");
        String nome = scan.nextLine();
        aluno.setName(nome);
        System.out.println("Entre o sexo do Aluno:");
        char sexo = scan.next().charAt(0);
        aluno.setSexo(sexo);
        System.out.println("Entre a altura:");
        double altura = scan.nextDouble();
        aluno.setAltura(altura);
        System.out.println("Entre o peso:");
        double peso = scan.nextDouble();
        aluno.setpeso(peso);
        System.out.println("Entre o ano de nascimento:");
        int ano = scan.nextInt();
        aluno.setIdade(ano, 2016);
        System.out.println("");
        System.out.println(aluno.relatorio());
        
    }
    
}
