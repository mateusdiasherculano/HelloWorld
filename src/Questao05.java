import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro numero:");
        int numero1 = in.nextInt();
        System.out.println("Por favor, digite o segundo numero:");
        int numero2 = in.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é o maior!");
        } else if (numero2 > numero1) {
            System.out.println("o numero " + numero2 + " é o maior!");
        } else {
            System.out.println("Os numeros são iguas!");
        }
    }
}

/*
Faça um programa que dado dois números apresente o maior deles.
Se, por acaso, os dois números forem iguais, imprima a mensagem
"Números iguais"
 */