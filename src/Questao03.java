import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um numero inteiro:");
        int numero = in.nextInt();

        int quadrado = numero*numero;

        System.out.println("O quadrado de "+numero+ " é "+quadrado);
    }
}

/*
Faça um algoritmo que efetue a leitura de um valor numérico
inteiro e apresente o resultado do valor lido elevado ao quadrado.
 */