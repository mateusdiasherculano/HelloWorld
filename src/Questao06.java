import java.util.Scanner;

public class Questao06 {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um numero:");
        int numero = in.nextInt();

        int resultado = numero*2;

        if (resultado>30){
            System.out.println("O resultado é: "+resultado);
        }else {
            System.out.println("o resultado não atende as condições do programa!");
        }
    }
}

/*
Faça um algoritmo que dado um número inteiro qualquer
e multiplique-o por dois. Apresente o resutado da
multiplicação se o resultado for maior que 30.
 */