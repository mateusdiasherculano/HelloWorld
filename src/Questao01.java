import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Por favor, digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Por favor, digite seu salário: ");
        double salario = in.nextDouble();

        System.out.println("O indivíduo "+nome+ "tem "+idade+" anos e ganha "+salario+" reais.");

    }
}
/*
Faça um algoritmo que dado o nome de uma pessoa, a sua idade e o seu salario, apresente essas informações na tela.
 */