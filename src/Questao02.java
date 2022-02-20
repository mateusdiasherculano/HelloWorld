import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do aluno: ");
        String nome = in.nextLine();
        System.out.println("Por favor, digite as quatros notas do aluno: ");
        float nota1 = in.nextFloat();
        float nota2 = in.nextFloat();
        float nota3 = in.nextFloat();
        float nota4 = in.nextFloat();

        float media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("O individuo "+nome+"possui média = "+media);

    }

}
/*
Faça um algoritmo que dado o nome e as quatros notas de um aluno,
 exiba seu nome e a sua media final.
 */