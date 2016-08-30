package subrotinas;

import java.util.Scanner;

/**
 *
 * @author victor_souzas@yahoo.com.br
 */
public class SubRotinas {

    public static void main(String[] args) {
        System.out.println("Entre uma das opcoes abaixo:");
        System.out.println("P para positivo ou negativo");
        System.out.println("M para maior menor");
        System.out.println("N para notas de alunos");
        System.out.println("I para calculo de IMC");
        System.out.println("F para calcular fatorial");
        System.out.println("S para calculo de salario");
        System.out.println("D para a diferenca do maior para o menor");
        System.out.println("A para divisivel por a");
        System.out.println("H para transformacao em horas");
        System.out.println("G para primeiro pelo segundo");
        Scanner scan = new Scanner(System.in);
        char opcao = scan.next().charAt(0);
        switch (opcao) {
            case 'P':
                System.out.println("Entre com um numero inteiro: ");
                int numero = scan.nextInt();
                Positivo pos = new Positivo(numero);
                System.out.println(pos.check());
                break;
            case 'M':
                System.out.println("Entre com o primeiro numero inteiro: ");
                int primeiro = scan.nextInt();
                System.out.println("Entre com o segundo numero inteiro: ");
                int segundo = scan.nextInt();
                MaiorMenor maior = new MaiorMenor(primeiro, segundo);
                System.out.println(maior.check());
                break;
            case 'N':
                System.out.println("Entre a primeira nota: ");
                double primeira = scan.nextDouble();
                System.out.println("Entre a segunda nota:");
                double segunda = scan.nextDouble();
                System.out.println("Entre a terceira nota: ");
                double terceira = scan.nextDouble();
                Notas nota = new Notas(primeira, segunda, terceira);
                System.out.println("Entre o tipo de calculo para nota:");
                System.out.println("P para media ponderada \t A para media Aritimetica");
                char tipo = scan.next().charAt(0);
                switch (tipo) {
                    case 'P':
                        System.out.println("A media ponderada e de: " + nota.ponderada());
                        break;
                    case 'A':
                        System.out.println("A media aritimetica e de: " + nota.aritimetica());
                        break;
                }
                break;
            case 'I':
                System.out.println("Entre seu peso:");
                double peso = scan.nextDouble();
                System.out.println("Entre sua altura:");
                double altura = scan.nextDouble();
                Imc imc = new Imc(peso, altura);
                double calculo = imc.calculo();
                System.out.print("Status: ");
                if(calculo <= 17.9){
                    System.out.println("Magresa.");
                } else if (calculo <= 24.9){
                    System.out.println("Normal.");
                }else if(calculo <= 29.9){
                    System.out.println("Sobrepeso.");
                }else if(calculo <= 34.9){
                    System.out.println("Obesidade Grau I");
                }else if(calculo <= 39.9){
                    System.out.println("Obesidade Grau II");
                }else {
                    System.out.println("Obesidade Grau III");
                }
                break;
            case 'F':
                System.out.println("Entre um numero inteiro: ");
                int num = scan.nextInt();
                Fatorial fator = new Fatorial(num);
                System.out.println("O fatorial do numero "+num+" e: "+fator.calculo());
                break;
            case 'S':
                System.out.println("Entre o valor do salario");
                double valor = scan.nextDouble();
                Salario salar = new Salario(valor);
                System.out.println("O seu salario com reajuste é de: "+ salar.reajuste());
                break;
            case 'D':
                System.out.println("Entre o primeiro numero: ");
                int um = scan.nextInt();
                System.out.println("Entre o segundo numero: ");
                int dois = scan.nextInt();
                Diferenca dif = new Diferenca(um, dois);
                System.out.println("A diferenca entre "+um+" e "+dois+" e de :"+dif.calculo());
                break;
            case 'A':
                System.out.println("Entre o valor que sera divisor");
                int divisor = scan.nextInt();
                System.out.println("Entre o primeiro numero da diferenca:");
                int prim = scan.nextInt();
                System.out.println("Entre o segundo numero da diferenca: ");
                int sec = scan.nextInt();
                Divisivel div = new Divisivel(divisor, prim, sec);
                System.out.println("O resultado é "+div.calculo());
                break;
            case 'H':
                System.out.println("Entre a quantidade de segundos:");
                int seg = scan.nextInt();
                Horas hor = new Horas(seg);
                System.out.println(hor.conversao());
                break;
            case 'G':
                System.out.println("Entre o primeiro numero: ");
                int prime = scan.nextInt();
                System.out.println("Entre o segundo numero");
                int segun = scan.nextInt();
                PrimeiroPeloSegundo primPeS = new PrimeiroPeloSegundo(prime, segun);
                System.out.println(primPeS.calculo());
        }

    }
}
