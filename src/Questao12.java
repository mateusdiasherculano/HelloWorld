import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro número: ");
        int inter1 = in.nextInt();
        System.out.println("Por favor, digite o segundo numero número: ");
        int inter2 = in.nextInt();

        for (int i=inter1;i<=inter2;i++){
            System.out.println(i);
        }
    }
}
/*
Faça um algoritmo que receba por parametro o limite
inferior e superior de um intervalo e imprima todos
os números naturais no intervalo fechado.
Suponha que os dados digitados são um intervalo crescente.
 */