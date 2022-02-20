import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite sua idade: ");
        int idade = in.nextInt();

       double dias  = idade*365.25;

       System.out.println("O individuo viveu "+dias+" dias desde que nasceu.");
    }

}
/*
Faça um algoritmo que dada a idade de uma pessoa em anos, calcule e escreva
quantos dias ela viveu. Considere o ano com 365,25 dias.
 */