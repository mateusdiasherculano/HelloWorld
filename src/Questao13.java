import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Por favor, digite um numero: ");
        int num = in.nextInt();

        int fat = 1;

        for (int i = num;i>=1;i--){
            fat =fat*i;
        }
        System.out.println(fat);
    }
}
/*
Faça um algoritmo que receba por parâmetro um valor inteiro
e retorno o fatorial do valor passado por parâmetro.
Ex: Fatorial 5! = 120 (5x4x3x2x1)
 */