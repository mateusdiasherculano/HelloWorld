import java.util.Scanner;

public class Questao07 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um ano a ser verificado: ");
        int ano = in.nextInt();

        if ((ano % 400)==0){
            System.out.println("Ano bissexto");
        }else if (((ano % 4)==0) && ((ano % 100)!=0)){
            System.out.println("Ano bissexto!");
        }else {
            System.out.println("Ano não bissexto!");
        }
    }
}

/*
faça um algoritmo que receba o valor de um ano
por parâmetro e determine se ele é bissexto se
for divisivel por 400 ou se for divisivel por 4
e nao for divisivel por 100. Por exemplo:
1988,1992 e 1996.
 */