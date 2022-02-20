import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um numero inteiro: ");
        int n = in.nextInt();

        for (int i = n;i>=0;i--){
            System.out.println(i);
        }

    }
}
/*
Faça um programa que receba um numero inteiro positivo N
e imprima todos os numeros naturais de 0 ate N na ordem decrescente.
 */